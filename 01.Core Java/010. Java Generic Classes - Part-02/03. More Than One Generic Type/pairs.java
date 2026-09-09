public class pairs<K,V>{
    private K key;
    private V value;
    public void getpair(K key, V value){
        this.key = key;
        this.value = value;
        System.out.println("Key: "+key + " Value: " + value);
    }
}