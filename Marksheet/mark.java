import java.util.Scanner;
class mark
   {
  public static void main(String[] arg)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Student Marksheet");
        System.out.print("\n Enter the name of Student \t:\t");
        String name=sc.next();
        System.out.println("Enter the Roll Number \t:\t");
        String roll=sc.next();
        System.out.println("\nEnter the Marks of Sub1 \t:\t");
        int s1=sc.nextInt();
        System.out.println("Enter the Marks of Sub2 \t:\t");
        int s2=sc.nextInt();
        System.out.println("Enter the Marks of Sub3 \t:\t");
        int s3=sc.nextInt();
        System.out.println("Enter the Marks of Sub4 \t:\t");
        int s4=sc.nextInt();
        System.out.println("Enter the Marks of Sub5 \t:\t");
            int s5=sc.nextInt();

            int total;
            float percent;
            total=s1+s2+s3+s4+s5;
            percent=total/5;

                System.out.println("\n\n\t\t   Marksheet");
                System.out.println("\n Swastik College of Computer Science & Information Technology");
          System.out.println("\n\n\t (Bsc.CSIT) Tribhuvan University");
          System.out.println("\n-----------------------------------------------------");
          System.out.println("\n\tName\t\t:\t"+name);
          System.out.println("\n\tRoll No.\t:\t"+roll);
          System.out.println("\n-----------------------------------------------------");
          System.out.println("\n\tSubject\t\t:\tMarks");
          System.out.println("\n\tSub1\t\t:\t"+s1);
          System.out.println("\n\tSub2\t\t:\t"+s2);
          System.out.println("\n\tSub3\t\t:\t"+s3);
          System.out.println("\n\tSub4\t\t:\t"+s4);
          System.out.println("\n\tSub5\t\t:\t"+s5);
          System.out.println("\n-----------------------------------------------------");
          System.out.println("\n\tTotal\t\t:\t"+total);
          System.out.println("\n\tPercentage\t:\t"+percent);

      if(percent>=60)
      {
      System.out.println("\n\tDivision\t:\tFirst");
      }

      if(percent>=40 && percent<60)
      {
      System.out.println("\n\tDivision\t:\tSecond");
      }

      if(percent<40)
      {
      System.out.println("\n\tDivision\t:\tThird");

      }
    }
  }
