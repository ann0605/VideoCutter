
public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	public int getSize(){
		return list.size();
	}
	public E peek(){
		return list.get(getSize() - 1);
		
				}
	public E push(E o){
		list.add(o);
		return o;
	}
	public E pop(){
		E o = list.get(getSize() -1);
		list.remove(getSize() - 1);
		return o;

	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	@Override
	public String toString(){
		return "stack:" + list.toString();
		}
}

public static void main{
	GenericStack<Integer> stack2 = new GenericStack<>();
	stack
}