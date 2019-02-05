import java.util.*;
public class Priority 
{
    public static void main(String[] args) 
    {
        String pro[]={"p1","p2","p3","p4"};
        int at[]={1,0,2,3};
        int bt[]={2,4,3,2};
        int prio[]={1,2,1,3};
        int ct[] = new int[4];
        int tat[]= new int[4];
        int wt[] = new int[4];
        for (int i = 0; i < 4; i++)
        {
            for (int j = i+1; j < 4; j++) 
            {
                 if(at[i]>at[j])
                 {
                     int temp;String temp1;
                     temp=at[i];
                     at[i]=at[j];
                     at[j]=temp;
                     
                     temp=bt[i];
                     bt[i]=bt[j];
                     bt[j]=temp;
                     
                     temp1=pro[i];
                     pro[i]=pro[j];
                     pro[j]=temp1;
                     
                     temp=prio[i];
                     prio[i]=prio[j];
                     prio[j]=temp;
                     
                 }
            }
        }
        for (int i = 0; i < 3; i++) 
        {
            if(at[i]==at[i+1]&&prio[i]>prio[i+1])
                    {
                        int temp;
                        temp=prio[i];
                        prio[i]=prio[i+1];
                        prio[i+1]=temp;
                    }
        }
        for (int i = 0; i < at.length; i++) 
        {
            if(i==0)
            ct[0]=at[0]+bt[0];
            else
                ct[i]=ct[i-1]+bt[i];
        }
        for (int i = 0; i < at.length; i++) 
        {
            tat[i]=ct[i]-at[i];
        }
        for (int i = 0; i < at.length; i++)
        {
            wt[i]=tat[i]-bt[i];
        }
        System.out.println("PRO   AT    BT    PRIO    CT    TAT    WT");
        for (int i = 0; i < at.length; i++)
        {
            System.out.print(pro[i]+"     ");
            System.out.print(at[i]+"     ");
            System.out.print(bt[i]+"     ");
            System.out.print(prio[i]+"      ");
            System.out.print(ct[i]+"     ");
            System.out.print(tat[i]+"       ");
            System.out.println(wt[i]+"      ");
        }
       
    }
}
