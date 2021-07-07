public class AmendingVariables {
    public static void main(String[] args){
        /* Start
	        Intialize Annual income = 62,000
	        Calculate increase in income by 10% income = income * 1.10
	        Display income for year 1
	        Calculate increase in income by 10% income = income * 1.10
	        Display income for year 2
	        Calculate increase in income by 10% income = income * 1.10
	        Display income for year 3
	        Calculate increase in income by 10% income = income * 1.10
	        Display income for year 4
	        Calculate increase in income by 10% income = income * 1.10
	        Display income for year 5
        End */
        double annual_income = 62000; //62,000
        annual_income = annual_income * 1.1;
        System.out.println("Year 1 income: " + annual_income);
        annual_income = annual_income * 1.1;
        System.out.println("Year 2 income: " + annual_income);
        annual_income = annual_income * 1.1;
        System.out.println("Year 3 income: " + annual_income);
        annual_income = annual_income * 1.1;
        System.out.println("Year 4 income: " + annual_income);
        annual_income = annual_income * 1.1;
        System.out.println("Year 5 income: " + annual_income);

    }
}
