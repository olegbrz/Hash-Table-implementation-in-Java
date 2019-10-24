package hashTable;

import java.util.ArrayList;

public class HashT<K, V> implements HashTable<K, V> {
	
	ArrayList<HashNode<K, V>> list = new ArrayList<>();
	int size;
	
	
	public HashT() {
	}
	
	public 	int getHash(K key) {
		int hash = key.hashCode();
		return hash;
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
	public void insert(K k, V v) {
		// TODO Auto-generated method stub
		
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
