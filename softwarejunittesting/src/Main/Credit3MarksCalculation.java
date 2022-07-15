package Main;

public class Credit3MarksCalculation extends Calculator{
    @Override
    public char gardeCalculation(String mark_number) throws Exception {
        super.gardeCalculation(mark_number);
        Double actualMark=getDoubleNumber(mark_number);
        int marks=actualMark.intValue();
        if(actualMark-marks>0)
        {
            marks+=1;
        }
        if(marks>=ENUMNames.CREDIT_3MIN_OF_A && marks<=ENUMNames.CREDIT_3MAX_OF_A)
            return 'A';
        else if(marks>=ENUMNames.CREDIT_3MIN_OF_B && marks<=ENUMNames.CREDIT_3MAX_OF_B)
            return 'B';
        else if(marks>=ENUMNames.CREDIT_3MIN_OF_C && marks<=ENUMNames.CREDIT_3MAX_OF_C)
            return 'C';
        else return 'F';
    }
    public double getDoubleNumber(String number)
    {
        return Double.parseDouble(number);
    }
}
