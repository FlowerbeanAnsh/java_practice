import java.util.ArrayList;
import java.util.NoSuchElementException;

//definition class
public class ArrayStack<E> implements StackADT<E>
{
    private ArrayList<E> stack;

    public ArrayStack() {   //alt+insert
        this.stack = new ArrayList<>();
    }

    @Override
    public E push(E item) {
        stack.add(item);
        return item;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
      return stack.remove(stack.size()-1);

    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return stack.get(stack.size()-1);

    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
