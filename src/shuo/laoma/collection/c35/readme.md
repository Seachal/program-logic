# 主要是讲 8.1 基本概念和原理


## 8.1.1 一个简单泛型类
   * 1 基本概念 Pair
   * 2 基本原理 Pair2
   * 3 优缺点 Pair

## 8.1.2容器 
  * DynamicArray

## 8.1.3 泛型方法
  * GenericDemo

## 8.1.4 泛型类型
   * 例如包装类  Integer extends Number implements Comparable<Integer>

## 8.1.5 类型参数的限定
 
  ### 1 上界为某个具体类
  * NumberPair 
  ### 2 上界为某个接口
  * GenericDemo max
  ### 3 上界为其他类型参数
   * DynamicArray addAll

# 8.2解析通配符
 ## 8.2.1更简洁的参数类型限定

 ## 8.2.2理解通配符
 

# 总结
 <T extends E>  不是通配符
 <？ extends E> 是通配符， 这种通配符只读，不能写
<？ super E>  是通配符，  这种只能写，不能多。
   