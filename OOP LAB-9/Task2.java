class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class VotingMachine
{
	String names[];
	int votes[];
	public void addCandidates(String names[])
	{
		this.names=names;
		votes = new int[names.length];
	}
	public void castVote(int voterAge,String votesToCandidate) throws InvalidAgeException
	{
	
		if(voterAge<18)
		{
			throw new InvalidAgeException("Not Eligible To Vote!");
		}
		else
		{
			for(int i=0;i<names.length;i++)
			{
				if(names[i]==votesToCandidate)
				{
					votes[i]++;
				}
			}
		}
	}
	public void printResults()
	{
		for(int i=0;i<names.length;i++)
		System.out.println(names[i]+" Has Got "+votes[i]+" Votes!");
	}
	public static void main(String[] args) {
		VotingMachine v = new VotingMachine();
		String names[]={"Moiz","Yasir","Talha","Yameen"};
		try{
			v.addCandidates(names);
			v.castVote(18,"Yasir");
			v.castVote(18,"Yasir");
			v.castVote(18,"Yasir");
			v.castVote(18,"Yasir");
			v.castVote(18,"Yasir");
			v.castVote(18,"Moiz");
			v.castVote(18,"Moiz");
			v.castVote(18,"Talha");
			v.printResults();
			v.castVote(17,"Yameen");
		}
		catch(InvalidAgeException a)
		{
			System.out.println(a);
		}
		
	}
}