package assignment5;

import java.util.Map;

public class Service {

	private Map<String,Employee> map=null;


	public void setMap(Map<String, Employee> map) {
		this.map = map;
	}

	public Employee getEmployee(String name)
	{
		if(name.equals("developer") || name.equals("trainer") || name.equals("trainee"))
			return map.get(name);
		else
			return null;
	}

}
