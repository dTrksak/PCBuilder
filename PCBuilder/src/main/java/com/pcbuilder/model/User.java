package com.pcbuilder.model;

import java.util.*;

public class User extends Person {
	
	List<Build> builds = new ArrayList<>();
	
	public void addBuild(String name) {
		builds.add(new Build(name, user_id));
	}
}
