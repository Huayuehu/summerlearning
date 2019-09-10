package study0604;

import java.util.Date;

/**
 * Date class
 *
 *  * 构造方法：
 *  * 		public Date():默认就是当前时间
 *  *		public Date(long date):把给定的毫秒值赋值给日期对象
 *  *
 *  * 成员方法：
 *  * 		public long getTime()：获取毫秒值
 *  *		public void setTime(long time):把毫秒值作为参数传递
 */

public class DateDemo {
    public static void main(String args[]) {
        Date d = new Date();
        System.out.println("d: " + d);

        Date d2 = new Date(System.currentTimeMillis());
        System.out.println("d2: " + d2);

        Date d3 = new Date(3600000);
        System.out.println("d3: " + d3);


    }
}
