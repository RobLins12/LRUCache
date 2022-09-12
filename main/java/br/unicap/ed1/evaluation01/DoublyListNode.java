package br.unicap.ed1.evaluation01;

public class DoublyListNode {
	
	private Integer key;
	private Integer value;
	private DoublyListNode next;
	
	public DoublyListNode(Integer key, Integer value, DoublyListNode next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public DoublyListNode getNext() {
		return next;
	}

	public void setNext(DoublyListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "(" + this.key + ", " + this.value + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true;}
		if(obj instanceof DoublyListNode){
			DoublyListNode otherListNode = (DoublyListNode) obj;
			return this.value.equals(otherListNode.value);
		}
		return false;
	}
}
