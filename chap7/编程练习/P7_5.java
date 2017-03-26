// date:17.3.25
// author: linyang <linyang@xiaomi.com>
// 使用GregorianCalendar类

import java.util.GregorianCalendar;

public class P7_5 {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("当前日期--" + now.get(now.YEAR) + "年" + now.get(now.MONTH) + "月" + now.get(now.DAY_OF_MONTH) + "日");
	}
}



/*
$ java P7_5
2017年2月25日
$ date
2017年 03月 25日 星期六 15:07:08 CST

*/
