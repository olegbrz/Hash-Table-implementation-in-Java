package hashTable;

public class HashT<K, V> implements HashTable<K, V> {
	
	private HashNode<K, V>[] table;
	private int size;
	
	
	public HashT(int num) {
		table = (HashNode<K, V>[]) new HashNode[num];
		size = 0;
	}
	
	private int getHash(K key) {
		int hash = key.hashCode();
		return (hash & 0x7fffffff) % table.length;
	}
	
	public int getIndex(K key) {
		int hash = key.hashCode();
		return hash % size;
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
		HashNode<K, V> node = searchNode(key, index);
		
		if (node == null) {
			table[index] = new HashNode<K, V>(key, value, table[index]);
			size ++;
			}
		else
			node.setValue(value);
	}

	private HashNode<K, V> searchNode(K key, int index) {
		HashNode<K, V> current = table[index];
		while ((current != null) && (!current.getKey().equals(key))) {
			current = current.getNext();
			}
		return current;
	}

	@Override
	public V search(K key) {
		int index = getHash(key);
		HashNode<K, V> node = searchNode(key, index);
		return node == null ? null : node.getValue();
	}

	@Override
	public void delete(K key) {
		int index = getHash(key);
		HashNode<K, V> prev = null ,
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
