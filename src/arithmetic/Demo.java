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
	 * 序号：第一题
	 * 题目描述：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少（单位为对）？ 
	 * 题目示例：1,1,2,3,5,8,13.......
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
		System.out.println("第一题输出：");
    	System.out.println("每个月兔子总数分别为：" + arrayList.toString());
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
	 * 序号：第二题
	 * 题目猫叔：判断101-200之间有多少个素数，并输出所有素数，和素数的个数
	 * 题目分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
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
		System.out.println("第二题输出：");
		System.out.println(minNum + "-" + maxNum + "之间的质数分别为：" + arrayList.toString());
		System.out.println(minNum + "-" + maxNum + "之间的质数的个数为：" + arrayList.size());
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
	 * 序号：第三题
	 * 题目描述：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。 
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
        System.out.println("第三题输出：");
        System.out.println(minNum + "-" + maxNum + "之间的水仙花数分别为：" + arrayList.toString());
        System.out.println(minNum + "-" + maxNum + "之间的水仙花个数为：" + arrayList.size());
        System.out.println();
	}
	
	public static int c(int num) {
		
		//将 int类型转化成String类型
		String a = String.valueOf(num);
		//将String类型按下标转换成int集合
		int result = 0;
		for(int i=0;i<a.length();i++){
			int l = a.charAt(i) - '0';
			int n = l*l*l;
			result += n;
		}
		
        return result;		
       
	}
	
	/*
	 * 序号：第四题
	 * 题目描述：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
     *    (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
     *    (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你,重复执行第一步。
     *    (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	
	public static void testFour() {
		// TODO Auto-generated method stub
        //第一步：找到最小质因数
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = d(num);
		System.out.println("第四题输出：");
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
	 * 序号：第五题
	 * 题目描述：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
	 * 程序分析：(a> b)?a:b这是条件运算符的基本例子。
	 */
	public static void testFive() {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("这个成绩对应的数值为：" + e(num));;
	}
	
	public static String e(int num) {
		String result = num>=90?("A"):(num>=60?("B"):("C"));
		return result;
	}
	
	
	/*
	 * 序号：第六题
	 * 题目描述：输入两个正整数m和n，求其最大公约数和最小公倍数。 
	 * 题目解析：利用辗除法
	 *   12和30的公约数有：1、2、3、6，其中6就是12和30的最大公约数。
	 *   36=2*2*3*3  270=2*3*3*3*5  最小公倍数：2*2*3*3*3*5
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
        System.out.println("最大公约数为"+a+";最小公倍数为"+first*second/a);
		 
	}
	
	/*
	 * 序号：第七题
	 * 题目描述：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
	 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
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
        	if(Character.isDigit(ch[i])){//数字
        		numCount++;
        	}else if (Character.isSpaceChar(ch[i])) {
                spaceCount++;
            } else if (Character.isLetter(ch[i])) {
                abcCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("字母个数"+abcCount);
        System.out.println("数字个数"+numCount);
        System.out.println("空格个数"+spaceCount);
        System.out.println("其他字符个数"+otherCount);
	}
	
	/*
	 * 序号：第八题
	 * 题目描述：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。  
	 */
	public static void testEight() {
		// TODO Auto-generated method stub
		System.out.println("请输入数字0-9：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入数字重复次数：");
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
	 * 序号：第九题
	 * 题目描述：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程   找出1000以内的所有完数。
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
	 * 序号：第十题
	 * 题目描述：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？ 
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
        System.out.println("第" + num +"次落地时共经过："+ zong + "米");
        System.out.println("第" + num +"次落地时反弹："+ height + "米");
	}
	
	/*
	 * 序号：第十一题
	 * 题目描述：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
	 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去   掉不满足条件的排列。
	 */
	public static void testEleven(String str) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
        String[] s = str.split("、");
        String a = "";
        String b = "";
        String c = "";
        for(int i = 0; i<s.length; i++){
        	a = s[i];
        	for(int j = 0; j<s.length; j++){
        		b = s[j];
        		for(int k = 0; k<s.length; k++){
        			c= s[k];
        			//剔除重复或不符合条件的数值
        			if(a.equals(b) == false && a.equals(c) == false && b.equals(c) == false){
        				arrayList.add(Integer.parseInt(a+b+c));
        			}
        		}
        	}
        }
        System.out.println("有1、2、3、4个数字，能组成"+arrayList.size()+"个互不相同且无重复数字的三位数");
        System.out.println("它们分别是：" + arrayList.toString());
	}
	
	/*
	 * 序号：第十二题
	 * 题目描述：业发放的奖金根据利润提成。
	 *         利润(I)低于或等于10万元时，奖金可提10%；
	 *         利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	 *         20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
	 *         60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
	 *         从键盘输入当月利润I，求应发放奖金总数？ 
	 * 程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。 
	 */
	public static void testTwelve(String str) {
		System.out.println("输入当月利润：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        
	}
    public static void main(String[] args) throws IOException {
		/*//执行第一题
    	testOne(10);
    	//执行第二题
    	testTwo(0,100);
    	//执行第三题
    	testThree(0, 1000);
    	//执行第四题
    	System.out.println("请输入一个正整数：");
    	testFour();
    	//执行第五题：
    	System.out.println("请输入一个100以内的数字：我们将返回这个成绩对应的优、良、可、差");
    	testFive();
    	//执行第六题
    	testSix(12, 30);
    	//执行第七题
    	testSeven("sdhsjdkdjkfd手机端划分‘’】】】】】速度快接口的");
    	//执行第八题
    	testEight();
    	//执行第九题
    	testNine();
    	//执行第十题
    	testTen(2);*/
    	testEleven("1、2、3、4");
	}
    
}
