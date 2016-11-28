package utiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * 1、输入、输出
 * 2、严浩
 * 3、2016.11.28
 * 4、读取本地文件
 */
public class DuWenJian {

    public static void main(String[] args) throws Exception {
        //File f = new File("e:/co.txt");
        // 从文件系统中的某个文件中获得输入字节,e:/co.txt代表指定的文件路径
        FileInputStream fis = new FileInputStream("F:\\oo.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis,"GBK"));


        //文件输出流是用于将数据写入File 的输出流
        FileOutputStream fos = new FileOutputStream("d:/co.txt");
        //FileInputStream 是字节流，所以得用byte类型，使用数组将数据传输到控制台
        byte[] b = new byte[10000];
        int flag = 0;

		/*FileInputStream中有read()读取数据
		 * 读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
		 */
        while((flag=fis.read(b))!=-1){

            //将 b.length 个字节从指定 byte 数组写入此文件输出流中。
            fos.write(b);
			/*b - 要解码为字符的 byte
			 *0 - 要解码的第一个 byte 的索引
			 *flag - 要解码的 byte 数
			 */
            String s = new String(b,0,flag);
            System.out.println(s);//将读入的字节转换成字符串打印在控制台
        }
        fos.close();//关闭流
        fis.close();

    }

}
