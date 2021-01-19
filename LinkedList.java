class LinkedList1<T> {
    //private record Node<T> (T data,Node<T> next){
    //public static void main(String[] args) {
    // Node<Integer> node = new Node<>(
    // }


    class Node<T> {
        private T data;
        private Node<T> next;  // self referential ds

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.next = null;
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

    }
}



