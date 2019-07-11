package com.qiaoyuan.common.utlis;
/**
 * 
 * @ClassName: StringUtil 
 * @Description: 字符串工具类及方法
 * @author:qy
 * @date: 2019年7月11日 下午1:56:02
 */
public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		if(src.length() == 0 && src!= null) {
			return true;
		}else {
			return false;
		}
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		if(src.trim().length()==0 && src!= null) {
			return true;
		}else {
			return false;
		}
	}
}
