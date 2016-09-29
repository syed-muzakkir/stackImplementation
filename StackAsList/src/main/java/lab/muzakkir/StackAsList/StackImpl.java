package lab.muzakkir.StackAsList;

import java.util.ArrayList;


public class StackImpl {
	
	ArrayList<Object> stack = new ArrayList<Object>();
	
	public void push(Object value) {
		if (value == null)
			throw new NullPointerException();
		stack.add(value);
	}
	
	public Integer pop() {
		if(stack.size() == 0 ) {
			return null;
		}
		Integer popedValue = Integer.parseInt(stack.get(stack.size() - 1).toString().replaceAll("\\.\\d*$", ""));
		stack.remove(stack.size() - 1);
		return popedValue;
	}
	
	public Object[] toArray() {
		return (Object[]) stack.toArray(new Object[stack.size()]);
	}
	
	public int size() {
		return stack.size();
	}
	
	public Boolean isEmpty() {
		return (stack.size() == 0)?Boolean.TRUE:Boolean.FALSE;
	}
	
	public Boolean contains(Object value) {
		if(value==null)
			throw new NullPointerException(); 
		return stack.contains(value);
	}
	
}
