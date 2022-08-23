package lectures.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems {
	public static void main(String[] args) {
//		System.out.println(count(4, 4));
//		path("", 3, 3);
		boolean[][] board = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		
		int[][] path = new int[board.length][board[0].length];
		printAllPath("", board, 0, 0, path, 1);
	}
	
	static int count(int row, int column) {
		if(row == 1 || column == 1) {
			return 1;
		}
		 int left = count(row - 1, column);
		 int right = count(row, column - 1);
		 
		 return left + right;
	}
	
	static void path(String processed, int r, int c) {
		if(r == 1 && c == 1) {
			System.out.println(processed);
			return;
		}
		
		if(r > 1) {
			path(processed + 'D', r - 1, c);
		}
		
		if(c > 1) {
			path(processed + 'R', r, c - 1);
		}
	}
	
	
	static ArrayList<String> pathRet(String processed, int r, int c) {
		ArrayList<String> list = new ArrayList<>();
		if(r == 1 && c == 1) {
			list.add(processed);
			return list;
		}
		
		if(r > 1) {
			list.addAll(pathRet(processed + 'D', r - 1, c));
		}
		
		if(c > 1) {
			list.addAll(pathRet(processed + 'R', r, c - 1));
		}
		return list;
	}
	
	static ArrayList<String> pathRetDiagonal(String processed, int r, int c) {
		ArrayList<String> list = new ArrayList<>();
		if(r == 1 && c == 1) {
			list.add(processed);
			return list;
		}
		if(r > 1 && c > 1) {
			list.addAll(pathRetDiagonal(processed + 'D', r -1, c - 1));
		}
		
		if(r > 1) {
			list.addAll(pathRetDiagonal(processed + 'V', r - 1, c));
		}
		
		
		if(c > 1) {
			list.addAll(pathRetDiagonal(processed + 'H', r, c - 1));
		}
		return list;
	}
	
	static void pathObstacles(String processed, boolean[][] maze, int r, int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(processed);
			return;
		}
		
		if(maze[r][c] == false)
			return;
		
		if(r < maze.length - 1) {
			pathObstacles(processed + 'D', maze, r + 1, c);
		}
		
		if(c < maze[0].length - 1) {
			pathObstacles(processed + 'R', maze, r, c + 1);
		}
	}
	
	static void allPath(String processed, boolean[][] maze, int r, int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(processed);
			return;
		}
		
		if(maze[r][c] == false)
			return;
		
		maze[r][c] = false; // because we are considering this cell in our path therefore setting it to false
		
		if(r < maze.length - 1) {
			allPath(processed + 'D', maze, r + 1, c);
		}
		
		if(c < maze[0].length - 1) {
			allPath(processed + 'R', maze, r, c + 1);
		}
		
		if(r > 0) {
			allPath(processed + 'U', maze, r - 1, c);
		}
		
		if(c > 0) {
			allPath(processed + 'L', maze, r, c - 1);
		}
		
		// this is where the function call returns
		// so before this recursion call gets removed, also remove the changes made via this recursion call in the original array known as backtracking i.e
		maze[r][c] = true;
	}
	
	static void printAllPath(String processed, boolean[][] maze, int r, int c, int[][] path, int step) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			path[r][c] = step;// because last step is also a step
			System.out.println(processed);
			for(int[] arr : path)
				System.out.println(Arrays.toString(arr));
			System.out.println();
			return;
		}
		
		if(maze[r][c] == false)
			return;
		
		maze[r][c] = false; 
		path[r][c] = step;
		
		if(r < maze.length - 1) {
			printAllPath(processed + 'D', maze, r + 1, c, path, step + 1);
		}
		
		if(c < maze[0].length - 1) {
			printAllPath(processed + 'R', maze, r, c + 1, path, step + 1);
		}
		
		if(r > 0) {
			printAllPath(processed + 'U', maze, r - 1, c, path, step + 1);
		}
		
		if(c > 0) {
			printAllPath(processed + 'L', maze, r, c - 1, path, step + 1);
		}
		
		// backtracking the changes
		maze[r][c] = true;
		path[r][c] = 0;
	}
	
}
