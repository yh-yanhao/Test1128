package utiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * 1�����롢���
 * 2���Ϻ�
 * 3��2016.11.28
 * 4����ȡ�����ļ�
 */
public class DuWenJian {

    public static void main(String[] args) throws Exception {
        //File f = new File("e:/co.txt");
        // ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽ�,e:/co.txt����ָ�����ļ�·��
        FileInputStream fis = new FileInputStream("F:\\oo.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis,"GBK"));


        //�ļ�����������ڽ�����д��File �������
        FileOutputStream fos = new FileOutputStream("d:/co.txt");
        //FileInputStream ���ֽ��������Ե���byte���ͣ�ʹ�����齫���ݴ��䵽����̨
        byte[] b = new byte[10000];
        int flag = 0;

		/*FileInputStream����read()��ȡ����
		 * ���뻺�������ֽ������������Ϊ�Ѿ������ļ�ĩβ��û�и�������ݣ��򷵻� -1��
		 */
        while((flag=fis.read(b))!=-1){

            //�� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
            fos.write(b);
			/*b - Ҫ����Ϊ�ַ��� byte
			 *0 - Ҫ����ĵ�һ�� byte ������
			 *flag - Ҫ����� byte ��
			 */
            String s = new String(b,0,flag);
            System.out.println(s);//��������ֽ�ת�����ַ�����ӡ�ڿ���̨
        }
        fos.close();//�ر���
        fis.close();

    }

}
