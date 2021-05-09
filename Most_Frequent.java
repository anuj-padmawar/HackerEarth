import java.util.Scanner;
public class Most_Frequent 
{

    public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

 int a,c,d=0,e=0;
 a=sc.nextInt();
 int arr[]=new int[a];
 for(int i=0;i<a;i++)
  {

     arr[i]=sc.nextInt();

   }

 for(int i=0;i<a;i++)
  {
  c=0; 
  for(int j=0;j<a;j++)
  {
   if(arr[i]==arr[j])
   {

    c+=1;

    if(c>d) 
    {
     d=c;
     e=arr[i];
    }
   }

  }

 }

 System.out.println(e);
}
}


