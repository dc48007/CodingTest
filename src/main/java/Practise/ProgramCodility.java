package Practise;
public class ProgramCodility {

    public static int[] solution(String R, int[] V) {
        int aInitial = 0;
        int bInitial = 0;

        int aBalance = 0;
        int bBalance = 0;

        for (int i = 0; i < R.length(); i++) {
            var destination = R.charAt(i);
            int amount = V[i];

            int remaining= 0;
            if (destination == 'A') {
                remaining = bBalance - amount;
                bBalance = Math.max(0, remaining);
                aBalance += amount;
            } else if (destination == 'B') {
                remaining = aBalance - amount;
                aBalance = Math.max(0, remaining);
                bBalance += amount;
            }

            if (remaining < 0) {
                if (destination == 'A') {
                    bInitial += Math.abs(remaining);
                } else if (destination == 'B') {
                    aInitial += Math.abs(remaining);
                }
            }
        }

        return new int[] { aInitial, bInitial };
    }

    public static void main(String[] args) {
        String R = "BAABA";
        int[] V = {2, 4, 1, 1, 2};
        int[] balances = ProgramCodility.solution(R, V);
        System.out.println("Bank A initial balance: " + balances[0]);
        System.out.println("Bank B initial balance: " + balances[1]);
    }
}
