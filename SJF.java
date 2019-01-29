import java.util.*;
public class SJF 
{
    public static void main(String[] args) throws Exception 
    {
        String pro[]={"p1","p2","p3","p4"};
        int at[]={1,2,0,3};
        int bt[]={2,3,2,1};
        int ct[];
        int i,temp,j;
        String temp1;
        for(i=0;i<at.length;i++)
        System.out.println(pro[i]+" "+at[i]+" "+bt[i]+"\n");
        //sort(at,bt,pro);
        for(i=0;i<at.length;i++)
        {
            for(j=1;j<at.length;j++)
        {
            if(at[i]>at[j])
            {
                temp=at[i];
                at[i]=at[j];
                at[j]=temp;
                {
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;
                }
                {
                    temp1=pro[i];
                    pro[i]=pro[j];
                    pro[j]=temp1;
                }
            }
        }
    }
        for(i=0;i<at.length;i++)
            System.out.println(pro[i]+" "+at[i]+" "+bt[i]);
    }
//    public static void sort(int at[],int bt[],String pro[]) throws Exception
//    {
//        int i,temp;
//        String temp1;
//        
//        
//    }
}
