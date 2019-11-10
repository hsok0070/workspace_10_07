package javac;

import java.util.Map;

public class Baz {
	
	Map<String, String> map;
	

	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}



	@Override
	public String toString() {
		return "Baz [map=" + map + "]";
	}

	
}
