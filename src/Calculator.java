
public class Calculator {

    private String number1;
    private String number2;
    private String operator;
    
    private Long result;
    private static Calculator instance = null;

    public Calculator(){
        number1 = "";
        number2 = "";
        operator = "";
        result = (long) 0;
    }

    public static Calculator getInstance(){
        if(instance == null){
            instance = new Calculator();
        }
        return instance;
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
        result = (long) 0;
    }

    public void setOperator(String operator){
        if(number1.equals("")){
            number1 = Long.toString(result);
            this.operator = operator;
        }
        else{
            this.operator = operator;
        }
    }

    public Long calculate(){
        result = calc();
        return result;
    }

    private Long calc(){

        if(number2.equals("")){
            number2 = number1;
        }
        else if(number1.equals("")){
            number1 = Long.toString(result);
        }

        System.out.println(number1 + " " + operator + " " + number2);
        switch(operator){
            case "+":
                result = Long.parseLong(number1) + Long.parseLong(number2);
                break;
            case "-":
                result = Long.parseLong(number1) - Long.parseLong(number2);
                break;
            case "*":
                result = Long.parseLong(number1) * Long.parseLong(number2);
                break;
            case "/":
                result = Long.parseLong(number1) / Long.parseLong(number2);
                break;
                
        }
        clear();
        return result;
    }

}
