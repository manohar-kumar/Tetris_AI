
public class Test{
public static void main(String[] args){
	//int[] arr=new int[200];
	System.out.print("public static int[] myarr={");
	for (int j=0;j<200;j++){
		//arr[j]=(int)(Math.random()*7);
		System.out.print((int)(Math.random()*7));
		if (j!=199) System.out.print(",");
	}
	System.out.print("};");
	}
}
		
