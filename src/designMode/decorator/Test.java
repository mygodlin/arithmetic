package designMode.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
 
public class Test {
    public static void main(String[] args) {
    	//��һ�� ԧ�������� + ë�� + ����ţ��
    	YuanYang yuanYang = new YuanYang();
    	MaLaNiuRou maLaNiuRou = new MaLaNiuRou(yuanYang);
    	MaoDu maoDu = new MaoDu(maLaNiuRou);
    	MaoDu maoDu1 = new MaoDu(maoDu);
    	System.out.println("����һ��" + maoDu1.name() + "�ļ۸�Ϊ" + maoDu1.cost());

	}
}
