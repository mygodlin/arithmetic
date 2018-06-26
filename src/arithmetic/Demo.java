package arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class Demo {
	/*
	 * ��ţ���һ��
	 * ��Ŀ��������һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣���λΪ�ԣ��� 
	 * ��Ŀʾ����1,1,2,3,5,8,13.......
	 */
	public static void testOne(int num) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		if(num == 1){
			arrayList.add(1);
		}else if(num == 2){
			arrayList.add(1);
			arrayList.add(1);
		}else{
			for(int i=3;i<num;i++){
	    		arrayList.add(a(i));
	    	}
		}
		System.out.println("��һ�������");
    	System.out.println("ÿ�������������ֱ�Ϊ��" + arrayList.toString());
    	System.out.println();
	}
	public static int a(int num) {
		// TODO Auto-generated method stub
		if(num == 1 || num == 2){
			return 1;
		}else{
			return a(num-1) + a(num-2);
		}  
	}
	
	/*
	 * ��ţ��ڶ���
	 * ��Ŀè�壺�ж�101-200֮���ж��ٸ�����������������������������ĸ���
	 * ��Ŀ�������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮��������
	 * 
	 */
	public static void testTwo(int minNum, int maxNum) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=minNum;i<=maxNum;i++){
            if(b(i)==true){
            	arrayList.add(i);
            }  
	    }
		System.out.println("�ڶ��������");
		System.out.println(minNum + "-" + maxNum + "֮��������ֱ�Ϊ��" + arrayList.toString());
		System.out.println(minNum + "-" + maxNum + "֮��������ĸ���Ϊ��" + arrayList.size());
		System.out.println();
	}
	
	public static boolean b(int num) {
		// TODO Auto-generated method stub
		if(num < 2){
			return false;
		}
        for(int i = 2; i*i <= num;i++){
        	 if (num%i == 0){
        		return false;
        	}
        }
		return true;
	}
	
	/*
	 * ��ţ�������
	 * ��Ŀ��������ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η��� 
	 * 
	 */
	public static void testThree(int minNum, int maxNum) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = minNum;i <= maxNum;i++){
        	if(i == c(i)){
        		arrayList.add(i);
        	}
        }
        System.out.println("�����������");
        System.out.println(minNum + "-" + maxNum + "֮���ˮ�ɻ����ֱ�Ϊ��" + arrayList.toString());
        System.out.println(minNum + "-" + maxNum + "֮���ˮ�ɻ�����Ϊ��" + arrayList.size());
        System.out.println();
	}
	
	public static int c(int num) {
		
		//�� int����ת����String����
		String a = String.valueOf(num);
		//��String���Ͱ��±�ת����int����
		int result = 0;
		for(int i=0;i<a.length();i++){
			int l = a.charAt(i) - '0';
			int n = l*l*l;
			result += n;
		}
		
        return result;		
       
	}
	
	/*
	 * ��ţ�������
	 * ��Ŀ��������һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
	 * �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
     *    (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
     *    (2)���n <> k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������,�ظ�ִ�е�һ����
     *    (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
	 */
	
	public static void testFour() {
		// TODO Auto-generated method stub
        //��һ�����ҵ���С������
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = d(num);
		System.out.println("�����������");
		System.out.println(result);
		System.out.println();
		
	}
	
	public static String d(int num) {
		String result = num + "=";
		int cuNum = num;
		int k = 2;
		while(num>k){
			if(cuNum%k == 0){
				result += (k + "*");
				cuNum = cuNum / k;
			}else{
				k++;
			}
		}
		result = result.substring(0, result.length()-1);
		return result;        
	}
	
	/*
	 * ��ţ�������
	 * ��Ŀ���������������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
	 * ���������(a> b)?a:b��������������Ļ������ӡ�
	 */
	public static void testFive() {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("����ɼ���Ӧ����ֵΪ��" + e(num));;
	}
	
	public static String e(int num) {
		String result = num>=90?("A"):(num>=60?("B"):("C"));
		return result;
	}
	
	
	/*
	 * ��ţ�������
	 * ��Ŀ��������������������m��n���������Լ������С�������� 
	 * ��Ŀ����������շ����
	 *   12��30�Ĺ�Լ���У�1��2��3��6������6����12��30�����Լ����
	 *   36=2*2*3*3  270=2*3*3*3*5  ��С��������2*2*3*3*3*5
	 */
	public static void testSix(int m, int n) {
		// TODO Auto-generated method stub
		int a = m;
		int b = n;
		int first = a;
		int second = b;
		int temp = 0;
		if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("���Լ��Ϊ"+a+";��С������Ϊ"+first*second/a);
		 
	}
	
	/*
	 * ��ţ�������
	 * ��Ŀ����������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ����� 
	 * �������������while���,����Ϊ������ַ���Ϊ'\n'.
	 */
	public static void testSeven(String str) {
		// TODO Auto-generated method stub
		int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        char[] ch = str.toCharArray();
        System.out.println();
        for (int i = 0; i < ch.length; i++) {
        	if(Character.isDigit(ch[i])){//����
        		numCount++;
        	}else if (Character.isSpaceChar(ch[i])) {
                spaceCount++;
            } else if (Character.isLetter(ch[i])) {
                abcCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("��ĸ����"+abcCount);
        System.out.println("���ָ���"+numCount);
        System.out.println("�ո����"+spaceCount);
        System.out.println("�����ַ�����"+otherCount);
	}
	
	/*
	 * ��ţ��ڰ���
	 * ��Ŀ��������s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�  
	 */
	public static void testEight() {
		// TODO Auto-generated method stub
		System.out.println("����������0-9��");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("�����������ظ�������");
        int b = sc.nextInt();
        int s = 0;
        String str = "";
        String strs = "";
        for (int i = 0; i < b; i++) {
        	str +=a;
        	strs +=(str+"+");
        	s+= Integer.parseInt(str);
        }
        System.out.println(s+"="+strs.substring(0, strs.length()-1));
	}
	
	/*
	 * ��ţ��ھ���
	 * ��Ŀ������һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.���   �ҳ�1000���ڵ�����������
	 */
	public static void testNine() {
		// TODO Auto-generated method stub
		 int s;
	     for(int i=1;i<=1000;i++){
	         s=0;
	         for(int j=1;j<i;j++){
	             if(i % j==0){
	                 s=s+j;
	             }
	             if(s==i){
	                System.out.print(i+" ");
	             }
	         }
	     }
	}
	
	/*
	 * ��ţ���ʮ��
	 * ��Ŀ������һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�������   ��10�����ʱ�������������ף���10�η�����ߣ� 
	 */
	public static void testTen(int num) {
		// TODO Auto-generated method stub
		double height = 100;
		int i = 1;
		double zong = 0;
        while(i <= num){
        	if(i == 1){
        		zong += height;
        	}else{
        		zong += height*2;
        	}
        	height = height/2;
        	i++;
        }
        System.out.println("��" + num +"�����ʱ��������"+ zong + "��");
        System.out.println("��" + num +"�����ʱ������"+ height + "��");
	}
	
	/*
	 * ��ţ���ʮһ��
	 * ��Ŀ��������1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 
	 * ��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ   �����������������С�
	 */
	public static void testEleven(String str) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
        String[] s = str.split("��");
        String a = "";
        String b = "";
        String c = "";
        for(int i = 0; i<s.length; i++){
        	a = s[i];
        	for(int j = 0; j<s.length; j++){
        		b = s[j];
        		for(int k = 0; k<s.length; k++){
        			c= s[k];
        			//�޳��ظ��򲻷�����������ֵ
        			if(a.equals(b) == false && a.equals(c) == false && b.equals(c) == false){
        				arrayList.add(Integer.parseInt(a+b+c));
        			}
        		}
        	}
        }
        System.out.println("��1��2��3��4�����֣������"+arrayList.size()+"��������ͬ�����ظ����ֵ���λ��");
        System.out.println("���Ƿֱ��ǣ�" + arrayList.toString());
	}
	
	/*
	 * ��ţ���ʮ����
	 * ��Ŀ������ҵ���ŵĽ������������ɡ�
	 *         ����(I)���ڻ����10��Ԫʱ���������10%��
	 *         �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
	 *         20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
	 *         60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
	 *         �Ӽ������뵱������I����Ӧ���Ž��������� 
	 * ����������������������ֽ磬��λ��ע�ⶨ��ʱ��ѽ�����ɳ����͡� 
	 */
	public static void testTwelve(String str) {
		System.out.println("���뵱������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        
	}
    public static void main(String[] args) throws IOException {
		/*//ִ�е�һ��
    	testOne(10);
    	//ִ�еڶ���
    	testTwo(0,100);
    	//ִ�е�����
    	testThree(0, 1000);
    	//ִ�е�����
    	System.out.println("������һ����������");
    	testFour();
    	//ִ�е����⣺
    	System.out.println("������һ��100���ڵ����֣����ǽ���������ɼ���Ӧ���š������ɡ���");
    	testFive();
    	//ִ�е�����
    	testSix(12, 30);
    	//ִ�е�����
    	testSeven("sdhsjdkdjkfd�ֻ��˻��֡��������������ٶȿ�ӿڵ�");
    	//ִ�еڰ���
    	testEight();
    	//ִ�еھ���
    	testNine();
    	//ִ�е�ʮ��
    	testTen(2);*/
    	testEleven("1��2��3��4");
	}
    
}
