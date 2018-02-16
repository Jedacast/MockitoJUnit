package com.fdmgroup.javaWeek1Assessment;

import static org.mockito.Mockito.times;

import java.util.HashMap;
import java.util.Map;

public class GroupController {
	
	private DatabaseReader db = new DatabaseReader();
	Trainee t = new Trainee();

	

	public GroupController(DatabaseWriter mockWriter, DatabaseReader mockReader) {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Trainee> getAllTrainees() { ///////////////////////////////////
		
		return db.readGroup();
		
	}

	public void addTrainee(Trainee mockTrainee) {
		// TODO Auto-generated method stub
		
	}

	public void removeTraineeByUsername(String string) {
		// TODO Auto-generated method stub
		
	}

	

}
