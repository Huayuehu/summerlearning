package study0620;

import java.io.File;

/**
 * 删除带内容的目录
 * /Users/insane/Downloads/Java
 *
 * 分析：
 * 		A:封装指定目录
 * 		B:获取指定目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，获取得到每一个File对象
 * 		D:判断该File对象
 * 			是文件夹：回到B(递归)
 * 			是文件：
 * 				直接删除
 * 		E:删除文件夹
 */

public class FileDelete {
    public static void main(String args[]) {
        File file = new File("/Users/insane/Downloads/Java");
        fileDel(file);
    }

    private static void fileDel(File file) {
        File[] fileArr = file.listFiles();

        for (File f : fileArr) {
            if (f.isDirectory()) {
                if (f != null) {
                    fileDel(f);
                } else {
                    f.delete();
                }
            } else {
                System.out.println(f.getName() + "---" + f.delete());
            }

        }
    }
}
