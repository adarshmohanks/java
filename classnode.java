public classnode{
	node prev;
	int data;
	node next;
	}
import java.util.*
public class DLL
{
	private int size =0, max;
	public DLL 	(int maxsize){
		max=maxsize;
		}
	private node head=null;
	public void insert(int val){
		if (size==max){
			System.out.println("Limit exceeded. ")
			return;
			}
		}
		if (head==null){
			node n=new node();
			n.data=val;
			head=n;
			n.next=null;
			n.prev=null;
			size++;
			}
		else{
			node p=head;
			while(p.next!=null){
				p=p.next;
				}
			node n=new node();
			n.data=val;
			n.prev=p;
			p.next=n;
			n.next=null;
			size++;
			}
}
public void display(){
	if(head==null){
		system.out.println("Empty list ");
		return;
		}
	else{
		node s=head;	
