package Automation.Udemy_Practice;

public class ArraysP {

	public static void main(String[] args) {
		String s="Free Access to InterviewQues/ResumeAssistance/Material";
		String a[]=s.split("/");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String b[]=a[0].split(" ");
		String c=b[3];
		System.out.println(c);
		
		System.out.println(b);
//		String b[]=a[3].split("/");
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
//		String c=b[0];
//		System.out.println(c);
		
	}

}
