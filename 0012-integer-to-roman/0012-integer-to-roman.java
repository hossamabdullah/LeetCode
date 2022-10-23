class Solution {
    public String intToRoman(int num) {
        String numStr = num + "";
        StringBuilder resultBuilder = new StringBuilder();
        
        int thousands = num /1000;
        System.out.println(thousands);
        num = num % 1000;
        resultBuilder.append(btngan(thousands, 'M', 'M', 'M'));
        
        int hundreds = num / 100;
        System.out.println(hundreds);
        num = num % 100;
        resultBuilder.append(btngan(hundreds, 'C', 'D', 'M'));
        
        int tens = num / 10;
        System.out.println(tens);
        num = num % 10;
        resultBuilder.append(btngan(tens, 'X', 'L', 'C'));
        
        int ones = num / 1;
        System.out.println(ones);
        resultBuilder.append(btngan(ones, 'I', 'V', 'X'));
        
        return resultBuilder.toString();
    }
    
    private String btngan(int digit, char start, char mid, char last){
        switch(digit){
            case 0:
                return "";
            case 1:
                return start+"";
            case 2:
                return start+""+start+"";
            case 3:
                return start+""+start+""+start+"";
            case 4:
                return start+""+mid+"";
            case 5:
                return mid+"";
            case 6:
                return mid+""+start+"";
            case 7:
                return mid+""+start+""+start+"";
            case 8:
                return mid+""+start+""+start+""+start+"";
            case 9:
                return start+""+last+"";
            case 10:
                return last+"";
            default:
                return "";
        }
    }
}


/*
I
II
III
IV
V
VI
VII
VIII
IX


1
5
10
50
100
500
1000



*/