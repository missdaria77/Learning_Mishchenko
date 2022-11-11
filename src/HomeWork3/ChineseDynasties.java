package HomeWork3;

public class ChineseDynasties {

    static int attRateWarriorLee = 13;
    static int attRateArcherLee = 24;
    static int attRateRiderLee = 46;

    static int attRateWarriorMing = 9;
    static int attRateArcherMing = 35;
    static int attRateRiderMing = 12;

    static int numWarriorLee = 860;

    public static void main(String[] args) {

        int genAttRateLee = numWarriorLee * (attRateWarriorLee + attRateArcherLee + attRateRiderLee);
        // double genAttReteMing = numWarriorLee * 1.5 * (attRateWarriorMing + attRateArcherMing + attRateRiderMing);
        int genAttReteMing = (int)(numWarriorLee * 1.5) * (attRateWarriorMing + attRateArcherMing + attRateRiderMing);

        System.out.println("Lee's army general attack rate is: " + genAttRateLee);
        System.out.println("Ming's army general attack rate is: " + genAttReteMing);
    }

}
