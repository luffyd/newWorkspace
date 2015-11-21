import java.util.Scanner;

public class Solution {
    static long[][] x1=new long[4][65];
    static long[][] x2=new long[4][65];
    
    public static void in(){
        x1[0][0]=1;x1[1][0]=0;x1[2][0]=0;x1[3][0]=0;
        x1[0][1]=1;x1[1][1]=1;x1[2][1]=0;x1[3][1]=0;
        
        x2[0][0]=0;x2[1][0]=1;x2[2][0]=0;x2[3][0]=0;
        x2[0][1]=1;x2[1][1]=1;x2[2][1]=1;x2[3][1]=0;
        
        for(int i=2;i<65;i++){
            for(int j=0;j<4;j++){
                x1[j][i]=x1[0][i-1] * x1[j][i-1]+
                		x1[1][i-1] * x2[j][i-1]+
                		x1[2][i-1] * x2[3-j][i-1]+
                		x1[3][i-1] * x1[3-j][i-1];
                
                x2[j][i]=x2[0][i-1] * x1[j][i-1]+
                		x2[1][i-1] * x2[j][i-1]+
                		x2[2][i-1] * x2[3-j][i-1]+
                		x2[3][i-1] * x1[3-j][i-1];
                
                x1[j][i]=x1[j][i]%1000000007;
                x2[j][i]=x2[j][i]%1000000007;
            }
            
        }
    }
    
    public static long[] getIncrease(long row1,long row2,long[] start){
        long length=row2-row1;
        if(length==0) return start;
        String binary = Long.toBinaryString(length);
        int pow=0;
        long[] result=new long[4];
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                pow=binary.length()-1-i;
                pow=pow+1;
                for(int j=0;j<4;j++){
                    result[j]=start[0] * x1[j][pow]+start[1] * x2[j][pow]+start[2] * x2[3-j][pow] + start[3]*x1[3-j][pow];
                    result[j]=result[j]%1000000007;
                }
                pow=pow-1;
                    break;
            
            }
        }
        length=length-(long)Math.pow((2.0),(1.0)*pow);
        if(length!=0)
               return getIncrease(row1+(long)Math.pow((2.0),(1.0)*pow),row2,result);
        else
            return result; 
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long length=sc.nextLong();
        int cows=sc.nextInt();
        long[] start=new long[4];
        in();
        start[0]=1;
        start[1]=0;
        start[2]=0;
        start[3]=0;
        long row1=0;
        long row2=0;
       
        for(int i=0;i<cows;i++){
            int cowx=sc.nextInt();
            long cowy=sc.nextLong();
            row2=cowy-1;
            start=getIncrease(row1,row2,start);
            start[cowx-1]=0;
            row1=row2;
        }
        start=getIncrease(row1,length-1,start);
        System.out.println(start[0]);
    }
}