
public class Stack <T>
{
	public T NOT_VALID;
	T[] items;
	int top;
	
	public Stack(int inSize, T notValid)
	{
		items = (T[])new Object[inSize];
		top = 0;
		NOT_VALID = notValid;
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	
	public static void main(String[] args) 
	{
		
	}

	public boolean push(T i) 
	{
		if(this.isFull()) return false;
		
		items[top] = i;
		++top;
		return true;
	}

	public boolean isFull() 
	{
		return top == items.length;
	}

	public T pop() 
	{
		--top;
		T r = items[top];
		return r;
	}

	public T peek() 
	{
		if(isEmpty()) return NOT_VALID;
		return items[top - 1];
	}
}
