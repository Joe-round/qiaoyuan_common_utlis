package com.qiaoyuan.common.utlis;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtli 
 * @Description: (1)随机数工具类(RandomUtil.java)
 * @author:qy
 * @date: 2019年7月11日 上午11:23:01
 */
public class RandomUtli {

	//方法1：返回min-max之间的随机整数（包含min和max值），
	//例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		//实例化random类
		Random random = new Random();
		//生成随机数
		return random.nextInt(max - min +1)+min;
	}
/*	方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对
	，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)*/
	public static int[] subRandom (int min, int max, int subs){
		//定义数组
			int [] arr = new int [subs]; 
			//定义set集合 用于筛取不重复的数字
			Set<Integer> set = new HashSet<>();
			//判断集合长度是否 是自己想要的
			while (set.size() != subs){
				//随机生成数字并装入集合中
				set.add(random(min, max));
			}
			//定义变量
			int i = 0;
			//通过循环set集合并给数组赋值
			for (Integer integer : set) {
				arr[i]=integer;
				i++;
			}
			//返回数组
			return arr;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		//穷举所有的字符
		String str = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//获取字符串里随机的单个字符
		return str.charAt(random(0, str.length() -1 ));
	}
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
//		实例化一个StringBulider 用于装字符串
		StringBuilder str = new StringBuilder();
//		通过循环拼接 单个字符
		for (int i = 0; i < length; i++) {
			str.append(randomCharacter());
		}
		return str.toString();
	}
}
