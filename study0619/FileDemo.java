package study0619;

import java.io.File;
import java.io.IOException;

/**
 * 要想实现IO的操作，必须知道硬盘上文件的表现形式
 *
 * File:文件和目录路径名的抽象表示形式
 * 理解：不代表这个文件或者目录一定存在
 *
 * (1)构造方法：
 * 		File(String pathname)：通过一个路径名创建File对象，这个路径是个字符串表达
 * 		File(String parent, String child)： 通过父路径和子路径名创建File对象
 * 		File(File parent, String child)：通过父路径File对象和子路径名创建File对象
 *
 * (2)创建功能：
 *      A:创建文件,如果文件不存在，就创建。存在，就不创建；创建文件时如果忘了写盘符路径，则会默认在项目路径下
 * 		    public boolean createNewFile() throws IOException
 *
 *      B:创建文件夹，如果文件夹不存在，就创建。存在，就不创建。
 * 	        public boolean mkdir() 单级文件夹
 *          public boolean mkdirs() 多级文件夹
 *          到底创建的是文件还是文件夹，取决于你使用的方法。不取决于后缀名
 *
 * (3)删除功能：
 *      public boolean delete() 既可以删除文件，也可以删除文件夹。
 *      相对路径：不以盘符开始的路径
 *      绝对路径：以盘符开始的路径
 *
 *      注意事项：
 * 		A:如果一个文件夹内有内容，是不能直接删除的。
 * 		B:Java程序的删除不走回收站，直接删除。
 *
 * (4)重命名功能:
 *      public boolean renameTo(File dest)
 *      路径相同：改名
 *      路径不同：剪切并改名
 *
 * (5)判断功能:
 *      public boolean isDirectory():是否是文件夹
 *      public boolean isFile():是否是文件
 *      public boolean exists():是否存在
 *      public boolean canRead():是否可读
 *      public boolean canWrite():是否可写
 *      public boolean isHidden():是否隐藏
 *
 * (6)获取功能:
 *      public String getAbsolutePath():获取绝对路径
 *      public String getPath():获取相对路径
 *      public String getName():获取名称
 *      public long length():获取文件的大小
 *      public long lastModified():获取最后一次修改时间的毫秒值
 *
 * (7)高级获取功能:
 *      public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
 *      public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
 */

public class FileDemo {
    public static void main(String args[]) throws IOException {
        /*********
         * 创建功能
         ********/
        //1、在downloads里创建一个文件夹demo
        File file = new File("/Users/insane/Downloads/demo");
        System.out.println("mkdir: " + file.mkdir());

        //2、在demo里创建一个文件a.txt
        File file2 = new File("/Users/insane/Downloads/demo/a.txt");
        System.out.println("create new file: " + file2.createNewFile());

        //在downloads里创建一个文件夹test且test里面有b.txt文件
        //这样是不行的，因为，要想在某个目录下创建内容，该目录首先得存在
        File file3 = new File("/Users/insane/Downloads/test/b.txt");
        System.out.println("create new file: " + file3.createNewFile());

        //mkdirs可用于创建多个文件夹
        File file4 = new File("/Users/insane/Downloads/test/demotest");
        System.out.println("mkdirs: " + file4.mkdirs());

        //到底创建的是文件还是文件夹，取决于你使用的方法。不取决于后缀名
        File file5 = new File("/Users/insane/Downloads/test/demotest.txt");
        System.out.println("mkdir: " + file5.mkdir());

        /*********
         * 删除功能
         ********/
//        System.out.println("delete: " + file.delete());
//        System.out.println("delete: " + file2.delete());
//        System.out.println("delete: " + file4.delete());
//        System.out.println("delete: " + file5.delete());

        /***********
         * 重命名功能
         **********/
        //different directory
        File file6 = new File("/Users/insane/Downloads/test/acopy.txt");
        System.out.println("renameTo: " + file2.renameTo(file6));

        //same directory
        File file7 = new File("/Users/insane/Downloads/test/demotestII");
        System.out.println("renameTo: " + file4.renameTo(file7));
    }
}
