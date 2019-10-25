package hashTable;

public class CircularHT<K, V> implements HashTable<K, V> {
	
	public Node<K, V>[] table;
	private int size;
	private int maxLoad;
	
	public CircularHT(int size, int maxLoad) {
		table = (Node<K, V>[]) new Node[size];
		this.maxLoad = maxLoad;
		this.size = 0;
	}
	
	private int getHash(K key) {
		int hash = key.hashCode();
		return (hash & 0x7fffffff) % table.length;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void insert(K key, V value) {
		int index = getHash(key);
		Node<K, V> node = table[index];
		
		while (node != null) {
			index = (index + 1) % table.length;
			node = table[index];
		}
		table[index] = new Node<K, V>(K key, V value);
		size++;
	}

	private Node<K, V> searchNode(K key, int index) {
		Node<K, V> current = table[index];
		while ((current != null) && (!current.getKey().equals(key))) {
			current = current.getNext();
			}
		return current;
	}

	@Override
	public V search(K key) {
		int index = getHash(key);
		Node<K, V> node = searchNode(key, index);
		return node == null ? null : node.getValue();
	}

	@Override
	public void delete(K key) {
		int index = getHash(key);
		Node<K, V> prev = null ,
		current = table[index];
		while ((current != null) && (!current.getKey().equals(key))) {
			prev = current;
			current = current.getNext();
		}
		
		if (current != null) { // found : delete it
			if (prev == null) // remove first node
				table[index] = current.getNext();
			else
				prev.setNext(current.getNext());
			size--;
		}

		
	}

}
