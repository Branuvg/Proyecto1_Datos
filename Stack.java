import java.util.ArrayList;

public class Stack<T> implements UVGStack<T> {

    private ArrayList<T> arrayList;

    public Stack() {
        arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T value) {
        arrayList.add(0,value);
    }

    // pull
    @Override
    public T pop() {
        return arrayList.remove(0);
    }

    // peek
    @Override
    public T top() {
        return arrayList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
    
    @Override
    public int count() {
        return arrayList.size();
    }
}
