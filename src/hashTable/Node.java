package hashTable;

/* Class to represent every node of the hash table */

public class Node<K, V> {
	
	private K key;
	private V value;
	private Node<K, V> next;
	
	/* Constructor */
	public Node(K key, V value, Node<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	/* Getters and setters */
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}
	
	
}
