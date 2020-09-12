## 注解的运用

### 序列化
* Format
* Label
* SimpleFormatterDemo
* SimpleFormatter
Format  Label  只是定义了注解，以及在注解中定义了一些注解格式，但是
真正解析注解，自定义注解的逻辑实在SimpleFormatter类中。


### **依赖注入（Dependency Injection）**

####  预热
那么什么是依赖注入呢？在解释这个概念前我们先看一小段代码：


```
public class Car{

    private Engine engine;

    public Car(){
        engine = new Engine();
    }
}
```



这段Java代码中Car类持有了对Engine实例的引用，我们称之为Car类对Engine类有一个依赖。而依赖注入则是指通过注入的方式实现类与类之间的依赖，下面是常见的三种依赖注入的方式：


**1、构造注入：通过构造函数传参给依赖的成员变量赋值，从而实现注入。**



```
public class Car{

    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
}
```



**2、接口注入：实现接口方法，同样以传参的方式实现注入。**



```
public interface Injection<T>{

    void inject(T t);
}

public class Car implements Injection<Engine>{

    private Engine engine;

    public Car(){}

    public void inject(Engine engine){
        this.engine = engine;
    }

}
```



**3、注解注入：使用Java注解在编译阶段生成代码实现注入或者是在运行阶段通过反射实现注入。**



```
public class Car{

    @Inject
    Engine engine;

    public Car(){}
}
```



前两种注入方式需要我们编写大量的模板代码，通过Java注解在编译期来实现依赖注入,减少模板代码量。


#### 


* SimpleInject
* SimpleSingleton
* SimpleContainer
* ServiceA
* ServiceB
* ContainerDemo

SimpleInject 、 SimpleSingleton 只是声明了注解， 







