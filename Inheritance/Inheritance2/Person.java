package admin;

public class Person {
		String name;
		String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		@Override
		public String toString() {
			return "Name "+name;
		}
	}

