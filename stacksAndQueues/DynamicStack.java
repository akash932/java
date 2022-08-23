package lectures.stacksAndQueues;

public class DynamicStack extends StackCustom{
	public DynamicStack() {
		super();// it will call StackCustom() constructor
	}

	public DynamicStack(int size) {
		super(size);// it will call StackCustom(int size) constructor
	}
	
	@Override
	public boolean push(int item) {
		if(this.isFull()) {
			//double he array Size
			int[] temp = new int[data.length * 2];
			
			// copying the elements from data to temp
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
			
		}
		// at this point we know that array is not full
		// insert item
		return super.push(item);
	}
	
}
