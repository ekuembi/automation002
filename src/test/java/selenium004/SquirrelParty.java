package selenium004;

public class SquirrelParty {
    public static void main(String[]args){

    }
    public static boolean isPartySuccessful(int cigar,boolean isweekend){
        if(isweekend) {
            return cigar >= 40;
        }else {
            return cigar >=40&&  cigar<=60;
        }
    }
}
