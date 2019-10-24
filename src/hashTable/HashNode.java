package hashTable;

/* Class to represent every node of the hash table */

public class HashNode<K, V> {
	
	K key;
	V value;
	HashNode<K, V> next;
	
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
