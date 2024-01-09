package Scripts;

public class Sample_1 {
public static void main(String[] args) {
	String s="Hello good morning guys";
	String[] str=s.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(" "+str[i]);
	}
}
}
