package br.unicap.ed1.evaluation01;

public class LRUCache {
	private DoublyLinkedList list;
	private int capacity;
	
	public LRUCache(DoublyLinkedList list, int capacity) {
		this.list = list;
		this.capacity = capacity;
	}

    public Integer get(Integer key) {
		if(!list.isEmpty()){
			DoublyListNode current = list.getHead();
			while (current != null ) {
				if(current.getKey() == key){
					DoublyListNode data = current;
					list.delete(current);
					list.addFirst(key, data.getValue());
				}
				current = current.getNext();
			}
			return this.list.searchKey(key);
		}else{
			return this.list.searchKey(key);
		}	
	}

	public void set(Integer key, Integer value) {
		if (list.size() == this.capacity) {
			DoublyListNode nodeToBeDeleted = list.SearchLast();
			list.delete(nodeToBeDeleted);
		}
		if (get(key) == null) {
			this.list.addFirst(key, value);
		}else{
			DoublyListNode current = list.getHead();
			while (current != null ) {
				if (current.getKey() == key) {
					current.setValue(value);
				}
				current = current.getNext();
			}
		}
	}
}