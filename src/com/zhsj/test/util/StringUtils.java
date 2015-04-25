package com.zhsj.test.util;

/**
 * 字符串工具类
 * @author zhsj
 *
 */
public class StringUtils {

	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(null == str || "".equals(str) || "".equals(str.trim())){
			return true;
		}
		return false;
	}
	
}
