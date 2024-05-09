
public class Calculator {
    private String number1;
    private String number2;
    private String operator;
    
    private int result;

    public Calculator(){
        number1 = "";
        number2 = "";
        operator = "";
        result = 0;
    }

    public void setNumber(String number){
        if(operator.equals("")){
            number1 += number;
        } else {
            number2 += number;
        }
    }

    public void clear(){
        number1 = "";
        number2 = "";
        operator = "";
    }
    

    public void clearResult(){
        result = 0;
    }

    public void setOperator(String operator){
        if(number1.equals("")){
            number1 = Integer.toString(result);
            this.operator = operator;
        }
        else{
            this.operator = operator;
        }
    }

    public int calculate(){
        result = calc();
        return result;
    }

    private int calc(){
        System.out.println(number1 + " " + operator + " " + number2);
        switch(operator){
            case "+":
                result = Integer.parseInt(number1) + Integer.parseInt(number2);
                break;
            case "-":
                result = Integer.parseInt(number1) - Integer.parseInt(number2);
                break;
            case "*":
                result = Integer.parseInt(number1) * Integer.parseInt(number2);
                break;
            case "/":
                result = Integer.parseInt(number1) / Integer.parseInt(number2);
                break;
                
        }
        clear();
        return result;
    }

}
