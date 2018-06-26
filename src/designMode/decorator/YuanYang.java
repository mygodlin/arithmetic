package designMode.decorator;
/*
 * 定义具体被装饰对象（也就是各种锅底，这里定义两种） 
 */ 
public class YuanYang implements GuoDi{

	@Override
    public float cost() {
        return 48.0f;
    }
	
    @Override
    public String name() {
        return "鸳鸯锅底";
    }
    
}
