package designMode.decorator;
/*
 * 定义具体被装饰对象（也就是各种锅底，这里定义两种） 
 */ 
public class DaLongYan implements GuoDi {
	 @Override
     public float cost() {
         return 59.0f;
     }
     @Override
     public String name() {
         return "大龙燚火锅原味锅底";
     }
}
