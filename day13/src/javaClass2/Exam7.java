package javaClass2;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KeyValue<String, Integer> kv1 = new KeyValue();
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		
		System.out.println(key1+":"+ value1);
	
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not found(요청한 페이지를 찾을수 없다.)");
		
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		
		System.out.println(key2+":"+ value2);
		
		
		KeyValue<String, Void> kv3 = new KeyValue();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		
		System.out.println(key3);
		
	}

}


class KeyValue<k,v>{
	private k key;
	private v value;
	
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	
}