public class Seating {
	public static void main(String args[]){
		System.out.println("Enter number of students");
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int[] m = new int[n/3];
		 int[] p = new int[n/3];
		 int[] c = new int[n/3];
		
		System.out.println("Enter maths students");
		for(int i=1;i<=n/3;i++){
			m[i] = sc.nextInt();
		}
		
		System.out.println("Enter physics students");
		for(int i=1;i<=n/3;i++){
			p[i] = sc.nextInt();
		}
		
		System.out.println("Enter chemistry students");
		for(int i=1;i<=n/3;i++){
			c[i] = sc.nextInt();
		}
		
		int[] students = new int[n];
		for(i=0; i<n/2;i++){
			if(i==0){
				students[i] = c[i];
			}else if( i==1 && (students[i-1] != m[i])){
				students[i] = m[i];
			}else if (i>1){
				students[i] = p[i];
			}
		}
		
	}
}
