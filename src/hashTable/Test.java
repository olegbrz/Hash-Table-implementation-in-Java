package hashTable;

public class Test {

	public static void main(String[] args) {
		HashT<String, String> hash_table = new HashT<String, String>(10);
		
		hash_table.insert("Pedro", "+34 627 46 48 62");
		hash_table.insert("María", "+34 633 74 45 85");
		hash_table.insert("Antonio", "+34 667 52 64 35");
		hash_table.insert("Lucía", "+34 654 32 87 96");
		hash_table.insert("Sergio", "+34 631 64 05 11");

	}

}
