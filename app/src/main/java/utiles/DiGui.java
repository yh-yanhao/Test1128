package utiles;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class DiGui {
    int sum=0;
    int a=1;
    public static void main(String[] args) {
        DiGui test=new DiGui();
        test.sum();
        System.out.println("计算结果："+test.sum+"!");
    }
    public void sum()
    {
        sum+=a;
        a++;
        if(a<=100)
        {
            sum();//调用自身实现递归
        }
    }
}
