# javaalgorithms

class Temp{

public string conf;
public String time;
public String temp;

}

public class Output {

	public static void main (String args[]){

		List<Temp> tempList = new ArrayList<Temp>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the configuration number");
		int configNum = sc.nexLong();

		do{

			Temp t = new Temp();
			System.out.println("Enter the conf");
			int conf = sc.nextInt();
			t.conf = conf;

			System.out.println("Enter the time in milliseconds");
			int time = sc.nextInt();
			t.time = time;

			System.out.println("Enter the temp");
			int tem = sc.nextInt();
			t.tem = tem;

			System.out.println("To enter more config value enter Y");
			String option = sc.nextLine();
			tempList.add(t);

			treemap.put(time, tem);

		}while(option.equalIgnoreCase("Y"));

		a = ((configNum*1000)-1);
		Integer firstOne = treemap.firstKey();
		int sum = 0;
		for (Integer times : treemap.keySet()) {
			
			if( times=> firstOne && times <= (firstOne+a)){
				sum += treemap.get(times);
			}
			
			System.out.println(str);
		}
		avg = sum/treemap.size();
		
		System.out.println(avg);
	}
}







