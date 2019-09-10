package study0620;

import java.io.File;

/**
 * 递归输出目录下指定后缀名结尾的文件绝对路径 .java
 * /Users/insane/Downloads/Java
 *
 * 分析：
 * 		A:封装指定目录
 * 		B:获取指定目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，获取得到每一个File对象
 * 		D:判断该File对象
 * 			文件夹：回到B(递归)
 * 			文件：判断是否以指定的后缀结尾
 * 					是：就输出该文件的绝对路径
 * 		            否：不管
 */

public class GetAllJavaFileName {
    public static void main(String args[]) {
        File file = new File("/Users/insane/Downloads");
        getJavaFileName(file);
    }

    private static void getJavaFileName(File file) {
        File[] fileArr = file.listFiles();
        for (File f : fileArr) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    System.out.println(f.getAbsolutePath());
                }
            } else {
                getJavaFileName(f);
            }
        }
    }
}
