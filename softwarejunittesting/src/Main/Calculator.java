package Main;

public class Calculator {

    public char gardeCalculation(String mark_number) throws Exception {
        Double actualMark;
        try {
            actualMark=Double.parseDouble(mark_number);
        }catch (Exception e)
        {
            throw new Exception("Given Input is not a number");
        }
        if(actualMark<ENUMNames.LOWEST_MARK || actualMark>ENUMNames.HIGHEST_MARK)
        {
            throw new Exception("Given input is not in range");
        }

        return 'M';
    }
}
