package OOPLab8.Task2;



class Sports{
	String geName(){
		return "Generic Sports";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has n players in "+ getName() );
	}
}

class Cricket extends Sports{
	String geName(){
		return "Cricket";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has 11 players in "+ getName() );
	}
}

class Soccer extends Sports{
	String geName(){
		return "Soccer";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has 11 players in "+ getName() );
	}
}