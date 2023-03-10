public class circularlyLinkedList<E> {  //نوع جينيرك<E>

    private Node<E> tail=null;
    private int size=0;

    public circularlyLinkedList() {}
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}

    public int methodSize(circularlyLinkedList<E> list){
        Node<E>i=tail.next;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
            if( tail.next==i)
                break;
        }return  s;
    }
    public boolean  equals(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if( m==M.tail.next&&l==L.tail.next)
                    break;
            }}

        return  f;
    }

    public boolean  sameSequence(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size())
            for (int i = 1; i <=M.size ; i++)

                if (m.element== l.element) {

                    break;

                }
                else {
                    m = m.next;
                    if (i == M.size )
                        return f;
                }


            while (m!=null&&l!=null) {
                if (m.element == l.element)
                    f = true;
                else {
                    f = false;
                    return f;
                }
                m = m.next;
                l = l.next;
                if (l == L.tail.next)
                    break;
            }

        return  f;
                }
    public circularlyLinkedList<E> split(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l2=new circularlyLinkedList<>();
        if (l.size%2==0){
            for (int i=0;i<=l.size/2;i++){
                l2.addLast(  l.removeFirst());
            }
        }return l2;}
    public circularlyLinkedList<E> clone(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l1=new circularlyLinkedList<>();
        Node<E> i=l.tail.next;
        while (i!=l.tail){

            l1.addLast(i.element);
            i=i.next;
        }   l1.addLast(i.element);
        return l1;}

    public void print(){
        Node<E> i=tail.next;
        while (i!=tail){
            System.out.print(i.getElement()+"  ");
            i=i.next;
        }

        System.out.println(i.getElement());
    }

    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E Last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void rotate(){
        if (tail!=null)
            tail=tail.getNext();
    }
    public void addFirst(E element){
        if (size==0){tail=new Node<>(element,null);
            tail.setNext(tail);}//or tail.next=tail;

        else{
            Node<E> newest=new Node<>(element,tail.getNext());
            tail.setNext(newest);//or tail.next=newest;
        }
        size++;
    }
    public void addLast(E element){
        addFirst(element);
        tail=tail.getNext();//or tail=tail.next;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        Node<E> head=tail.getNext();//هنا أنشئنا نود جديد عشان بخليه مكان ال TAIL.NEXT مثلا هي سمته X انا سميته HEAD
        if (head==tail)
            tail=null;
        else tail.setNext(head.getNext());//or tail.next=x.next;
        size--;
        return head.getElement();
    }

    public void RoundRobin(int q,int p){
        circularlyLinkedList<Integer> l=new circularlyLinkedList<>();
        for (int i = 0; i<6; i++) {
            l.addLast(p);
        }
        while(!isEmpty()){
            int r = l.first();
            if ( r>q){
                r = r-q;
                rotate();
            }
            else
                l.removeFirst();
        }
    }
    public int sizee( ) {
        Node<E> i = tail.next;
        int size = 1;
        while (i.next != null) {
            i = i.next;
            size++;
        }return size;
    }




        class Node<E> {//هنا برايفت عشان انه قوي
            E element;
            Node<E> next;

            public Node(E element, Node<E> next) {
                this.element = element;
                this.next = next;
            }

            public E getElement() {
                return element;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setElement(E element) {
                this.element = element;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }
    }
