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
		return hash % table.length;
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
			node.value = value;
	}

	private HashNode<K, V> searchNode(K key, int index) {
		HashNode<K, V> current = table[index];
		while (current != null) && (!current.key.equals (key)))
		4 current = current . next ();
		return current;
	}

	@Override
	public V search(K k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(K k) {
		// TODO Auto-generated method stub
		
	}

}
