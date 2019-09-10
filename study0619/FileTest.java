package study0619;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Goal: To get all files that end with ".jpeg" and syso
 *
 * Sol1:
 *      (1)封装目录
 *      (2)将该目录下的所有文件或文件夹存入File数组
 *      (3)获取每一个文件或文件夹
 *      (4)判断是否是文件
 *      (5)判断该文件名是否以“.jpeg”结尾
 *      (6)输出
 * Sol2:
 *      (1)先判断是否满足条件
 *      (2)如果满足则存入数组
 *      (3)遍历数组并输出
 *
 */

public class FileTest {
    public static void main(String args[]) {
        /******
         * Sol1
         *****/
/*        //封装目录
        File file = new File("/Users/insane/Downloads/FileTest");

        //将该目录下的所有文件或文件夹存入File数组
        File[] fileArr = file.listFiles();

        //获取每一个文件或文件夹
        for (File f : fileArr) {
            //判断是否是文件
            if (f.isFile()) {
                //判断该文件名是否以“.jpeg”结尾
                if (f.getName().endsWith(".jpeg")) {
                    System.out.println(f.getName());
                }
            }
        }*/

        /******
         * Sol2
         *****/
        File file = new File("/Users/insane/Downloads/FileTest");

        //public String[] list(new FilenameFilter())
        String[] strArr = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir, name);
                if (f.isFile()) {
                    if (name.endsWith(".jpeg")) {
                        return true;
                    }
                }
                return false;
            }
        });

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
