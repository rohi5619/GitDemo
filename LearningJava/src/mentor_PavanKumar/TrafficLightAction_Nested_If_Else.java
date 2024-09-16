package mentor_PavanKumar;

public class TrafficLightAction_Nested_If_Else {

	public static void main(String[] args) 
	{
		String light="Green";
		boolean isPedestrianWaiting=false;
		
		if("Green".equals(light))
		{
			if(isPedestrianWaiting=false)
			{
				System.out.println("Drive");
			}
			else
			{
				System.out.println("Slow Down");
			}
		}
		else if("Yellow".equals(light))
		{
			System.out.println("Prepare to stop");
		}
		else
		{
			System.out.println("Stop");
		}

	}

}
