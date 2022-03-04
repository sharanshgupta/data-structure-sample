package datastructures.hashtables;

import java.util.Objects;

public class SimpleHashTableImplementation {

	public static void main(String[] args) {
		HashTableCustom hashTableCustom = new HashTableCustom(50);
		hashTableCustom.set("name", "sharansh");
		hashTableCustom.set("age", "30");
		hashTableCustom.set("company", "tesco");
		System.out.println(hashTableCustom.get("age"));
		hashTableCustom.print();
	}

}

class HashTableCustom {

	KeyValue[] data;

//  KeyValue keyValue;

	public HashTableCustom(int size) {
		data = new KeyValue[size]; // create an array of size which will store key value pair as entries
//    keyValue = new KeyValue();
	}

	//hash function to get index
	private int _hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
      System.out.println("cp -> " + key + " - " + key.codePointAt(i));
			hash = (hash + key.codePointAt(i) * i) % data.length;
		}
    System.out.println("hash -> " + hash);
		return hash;
	}

	public int set(String key, String value) {
		int index = _hash(key); //get index to store key and value
		KeyValue keyValue = new KeyValue();
		keyValue.key = key;
		keyValue.value = value;
		data[index] = keyValue;
		return index;
	}

	public String get(String key) {
		int index = _hash(key); //get index to store key and value
		return data[index].value;
	}

	public void print() {
		StringBuilder printedArray = new StringBuilder();
		printedArray.append("[");

		for (int i = 0; i < data.length; i++) {
		  if(Objects.nonNull(data[i]))
			printDataIndex(printedArray, data[i]);
		}

		printedArray.append("]");
		System.out.println(printedArray);

	}

	private void printDataIndex(StringBuilder printedArray, KeyValue data) {
		printedArray.append("{");
		printedArray.append(data.key);
		printedArray.append(", ");
		printedArray.append(data.value);
		printedArray.append("}");
	}
}

class KeyValue {
	String key;
	String value;

	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "KeyValue{" +
			"key='" + key + '\'' +
			", value='" + value + '\'' +
			'}';
	}
}
