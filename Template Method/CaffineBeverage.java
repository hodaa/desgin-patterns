public abstract class CaffineBeverage
{
	final public void perpareRecipe()
	{

		doStepOne();
		doStepTwo();
		doStepThree();
		doStepFour();
	}


	abstract void doStepOne();


	 public void doStepTwo ()
	 {
	 	System.out.println("I am step two");

	 }

	abstract void doStepThree();


	 public void doStepFour ()
	 {
	 	System.out.println("I am step Four");

	 }

}