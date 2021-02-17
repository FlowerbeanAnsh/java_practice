public interface StackADT<E> {
    //push
    //pop
    //peek
    // isEmpty

    /**
     * This method takes an item of
     * E type , and it tries to insert
     * that item at the top of the stack
     *
     * @return E the value that has been
     * inserted at the top of the stack
     */

    public abstract E push(E item);

    public abstract E pop();
    //this method returns deleted elements of stack

    public abstract E peek();
    //returns the top item

    public abstract boolean isEmpty();
    // returns that stack is empty or not...

}
