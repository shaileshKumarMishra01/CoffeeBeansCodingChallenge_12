package coffeeBeansCodingChallenge_1.TestCases;


	class CommonDigitFinder{
	    public void isCommonDigit(){
	        System.out.print("matched values:");
	        for(int numValue =100000;numValue<=300000;numValue++) {
	            int num = numValue;
	            int multiplyNum = num * 2;
	            int finalValue = multiplyNum;
	            int numCount = 0;
	            int multCount = 0;
	            while (num > 0) {
	                int digit = num % 10;
	                multiplyNum = finalValue;
	                while (multiplyNum > 0) {
	                    int multDigit = multiplyNum % 10;
	                    if (multDigit == digit) {
	                        multCount++;
	                        break;
	                    }
	                    multiplyNum = multiplyNum / 10;
	                }
	                numCount++;
	                num = num / 10;
	            }
	            if (numCount <= multCount) {
	                System.out.print(numValue+",");
	            }
	        }
	    }


	}
	public class WordMatcher2 {
	    public static void main(String[] args) {
	        CommonDigitFinder commonDigitFinder = new CommonDigitFinder();
	        commonDigitFinder.isCommonDigit();


	    }
	}


