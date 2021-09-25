package question1;

public class TaxCalculator 
{
	public static double taxableAmount(double monthlySalary)
    {
			///double monthlySalary1;
            double taxable_amount;
            double annual_salary=monthlySalary*12;
            double x =0;
            if(annual_salary<=250000)
       		{
       			taxable_amount=0;
       		}
       		else if(annual_salary>=250001 && annual_salary<=500000)
       		{
       			x=annual_salary-250000;
       			taxable_amount=0.1*x;
       		}
       		else if(annual_salary>=500001 && annual_salary<=1000000)
       		{
       			x=annual_salary-500000;
       			taxable_amount=12500+(0.2*x);
       		}
       		else
       		{
       			x=annual_salary-1000000;
       			taxable_amount=112500+(0.3*x);
       		}
       		return taxable_amount;
               
    }
}
