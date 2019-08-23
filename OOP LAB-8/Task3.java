package OOPLab8.Task3;



class Sports{
	String geName(){
		return "Generic Sports";
	}
	final void getNumberOfTeamMembers(){
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
// if we were to run this program it will give a compile time error that
// final method getNumberOfTeamMembers can't be overridden