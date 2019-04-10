package shuo.laoma.concurrent.c66;

import java.util.Collections;
import java.util.Map;

public class EnhancedMap <K, V>{
    Map<K, V> map;
    
    public EnhancedMap(Map<K,V> map){
        this.map = Collections.synchronizedMap(map);
    }
    
    public V putIfAbsent(K key, V value){
    	synchronized(map){
    		V old = map.get(key);
            if(old!=null){
                return old;
            }
            return map.put(key, value);
    	}
     }
    
    public V put(K key, V value){
        return map.put(key, value);
    }
    
    //... 其他代码

}


/**
 * 线程安全的类，被装饰类再包裹一层，有些符合操作就不是线程安全的了。
 * putIfAbsent 方法的会出现这样的情况，多个线程做if检查后都发现map中没有对应的键， 然后都调用put，
 * 一个想成执行完put后，另一个线程又会执行put，这不是putIfAbsent （）想要的预期效果（有键值就不再put）
 */