package type_casting;

public class mainclass {

	public static void main(String[] args) {
		
		run run=new sample();
		System.out.println(run.k);
		run.disp();
		System.out.println("_---------------------");
		
		sample sample =(sample)run;
		System.out.println(sample.d);
		sample.test();
		
	}
}
