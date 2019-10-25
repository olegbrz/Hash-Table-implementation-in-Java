package hashTable;

public class Test {

	public static void main(String[] args) {
		CircularHT<String, String> hash_table = new CircularHT<String, String>(0, 0.75);
		
		hash_table.insert("Pedro", "+34 627 46 48 62");
		hash_table.insert("María", "+34 633 74 45 85");
		hash_table.insert("Antonio", "+34 667 52 64 35");
		hash_table.insert("Lucía", "+34 654 32 87 96");
		hash_table.insert("Sergio", "+34 631 64 05 11");
		hash_table.insert("Paco", "+34 631 64 05 45");
		
		System.out.println(hash_table.table.length);
		
		System.out.println(hash_table.search("Pedro"));
		System.out.println(hash_table.search("María"));
		System.out.println(hash_table.search("Antonio"));
		System.out.println(hash_table.search("Lucía"));
		System.out.println(hash_table.search("Sergio"));
		System.out.println(hash_table.search("Paco"));

	}

}
