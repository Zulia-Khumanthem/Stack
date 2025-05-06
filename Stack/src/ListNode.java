public class ListNode {

    private int data ;          // to store data or information.
    private ListNode next;

    public  int getData(){
        return data;           // private variable accessing through public method
    }

    public void setData(int data) {

        // Edge case : no data given
        if(data < 0) return ;
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next){
        this.next = next;// setting the next value.
    }

    public ListNode(int data, ListNode next){
        this.data = data ;
        this.next = next ;
    }

}