package p1;

public class EmpApp {

	public static void main(String[] args) 
	{
		Address a=new Address();
		a.setLane("Balaganur");
		a.setCity("Vijayapur");
		a.setState("Karnataka");
		a.setCountry("India");
		
		Employee e=new Employee();
		e.setEname("UMESH");
		e.setAddr(a);
		
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.insert(e);

	}

}
