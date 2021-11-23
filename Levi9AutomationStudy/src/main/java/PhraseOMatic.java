public class PhraseOMatic {
    public static void main(String[] args) {
        String[] worldListOne = {"Bam", "Boom", "Poom", "Doom"};
        String[] worldListTwo = {"Room", "Goom", "Goom", "Loom"};
        String[] worldListThree = {"Bim","Bem", "Pim", "Dim"};

        int oneLenght = worldListOne.length;
        int twoLenght = worldListTwo.length;
        int threeLength = worldListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLength);
        String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];
        System.out.println("All we need is " + phrase);


    }
}
