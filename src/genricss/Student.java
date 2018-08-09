package genricss;

public class Student {
		
		private Integer sno;
		
		private Integer id;
		
		private String name;

		public Integer getSno() {
			return sno;
		}

		public void setSno(Integer sno) {
			this.sno = sno;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}

		@Override
		public String toString() {
			return "Student [sno=" + sno + ", id=" + id + ", name=" + name + "]";
		}
		
	}
