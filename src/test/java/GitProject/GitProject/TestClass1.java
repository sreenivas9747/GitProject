package GitProject.GitProject;

public class TestClass1 {


			public static void main(String[] args) {
				int a[]=new int[5];
				
				a[0]=100;
				a[1]=200;
				a[2]=300;
				
				//decleare array with out size
				int b[]= {10,20,30,40};
				System.out.println(b.length);
				
				//how to read an array
				//Advanced for loop, enhanced for loop
				
				for (int i=0; i<b.length; i++) {
					System.out.println(a[i]);
				}
				
				for(int i:a) {
					System.out.println(i);
				}
				

			}

	}

