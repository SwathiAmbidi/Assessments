package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
	
		StreamDemo obj = new StreamDemo();

		//obj.createStream();
		obj.terminal_minMAx();
	}
	
	public void createStream() {
		
		Employee e[] = {
				new Employee(1,"khal",25000),
				new Employee(2,"saansa",15000),
				new Employee(3,"aarya",20000),
				new Employee(5,"robb",35000)
				
		};
		
		Employee e1 = new Employee(11,"khali",25000);
		Employee e2 = new Employee(12,"khalisi",25000);
		Employee e3 = new Employee(13,"khala",25000);
		Employee e4 = new Employee(14,"khalesh",25000);
		
		Stream<Employee> s = Stream.of(e);
		Stream<Employee> s2 = Stream.of(e1,e2,e3,e4);
		/*Stream<Employee> s[] = e.stream();
		
		//#2 ----stream of array
		l = Arrays.asList(12,11,13);
		
		Stream<Integer> st = Stream.of(12,11,13);
		*/
		s.forEach(y->System.out.println(y));
		s2.forEach(y->System.out.println(y));
		
		//s2.filter(e->(e.getId()%2==0)).map(e->(e.getSalary()+2)).forEach(e->System.out.println(e));
	}
	
	
	
	void terminal_minMAx() {
		List<Integer> l = Arrays.asList(12,13,11,1,2);
		System.out.println("count "+l.stream().count());
		
		int x = l.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("Min "+x);
		
		int y = l.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("Max "+y);
		
		System.out.println("Sum "+l.stream().filter(i->(i%2==0 && i!=12)).reduce(0, (res,i)->res+i));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
