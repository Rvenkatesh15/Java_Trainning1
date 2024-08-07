package Java8;
import java.util.*;
import java.util.stream.*;

class Emp{
	
	public Emp(Long id){
		this.id=id;
	}
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
}

public class Java8 {
	public static void main(String[] args) {
		List<Emp> ls=new ArrayList<>();
		ls.add(new Emp(1L));
		ls.add(new Emp(2L));
		ls.add(new Emp(3L));
		ls.add(new Emp(4L));

		List ids=ls.stream()
				.filter(e->e.getId()>1L).map(e->e.getId()).collect(Collectors.toList());
		System.out.println(ids);
	}
	

}
