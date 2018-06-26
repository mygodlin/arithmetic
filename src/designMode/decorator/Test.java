package designMode.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
 
public class Test {
    public static void main(String[] args) {
    	//点一个 鸳鸯火锅底料 + 毛豆 + 麻辣牛肉
    	YuanYang yuanYang = new YuanYang();
    	MaLaNiuRou maLaNiuRou = new MaLaNiuRou(yuanYang);
    	MaoDu maoDu = new MaoDu(maLaNiuRou);
    	MaoDu maoDu1 = new MaoDu(maoDu);
    	System.out.println("点了一份" + maoDu1.name() + "的价格为" + maoDu1.cost());

	}
}
