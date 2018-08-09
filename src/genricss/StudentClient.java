package genricss;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {


		public static void main(String[] args) {
			
			GenricStudentClass<Integer,String> gce = new GenricStudentClass<Integer,String>();
			
			gce.setSno(10);
			gce.setId(13);
			gce.setName("mahesh");
			
			
			List<Object> al = new ArrayList<Object>();
			al.add(gce.getSno());
			al.add(gce.getId());
			al.add(gce.getName());
			
			gce.data(al);


			ArrayList<Object> li = new ArrayList<Object>();
			li.add(10);
			li.add(10);
			li.add(null);
			
			System.out.println(li);
			
		}
		

	}
