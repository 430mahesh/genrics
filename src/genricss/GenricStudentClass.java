package genricss;

import java.util.List;

public class GenricStudentClass<E extends Number, String> {
		
		private E sno;
		
		private E id;
		
		private String name;
		
		public void data(List<?> al) {
			System.out.println(al);
		}

		public E getSno() {
			return sno;
		}

		public void setSno(E sno) {
			this.sno = sno;
		}


		public E getId() {
			return id;
		}

		public void setId(E id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}

		@Override
		public java.lang.String toString() {
			return "GenricStudentClass [sno=" + sno + ", id=" + id + ", name=" + name + "]";
		}
		
		

	}
