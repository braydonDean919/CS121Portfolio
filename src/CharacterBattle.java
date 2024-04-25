import javax.swing.* ;
import java.util.Random;

public class CharacterBattle {
    public static void main (String[] args){
        Random randGen = new Random();
        String playerName1;
        String playerName2;
        int playerHit1;
        int playerHit2;
        String move1;
        String move2;
        int movePower1;
        int movePower2;
        int attackSpeed1;
        int attackSpeed2;
        int numRounds;
        int numWins1 = 0;
        int numWins2 = 0;

        numRounds = Integer.parseInt(JOptionPane.showInputDialog("How many rounds do you want to play? Please chose an odd number."));
        if (numRounds % 2 == 0){
            numRounds += 1;
        JOptionPane.showMessageDialog(null, "You did not pick an odd number so your number of rounds are " + numRounds);
        } else if (numRounds <= 0) {
            JOptionPane.showMessageDialog(null, "Please chose a number greater than 0.");
        }
        while(numWins1 + numWins2 != numRounds) {
            playerName1 = JOptionPane.showInputDialog("Player 1 what is your name?");
            playerHit1 = Integer.parseInt(JOptionPane.showInputDialog("How many Hit Points do you have?"));
            move1 = JOptionPane.showInputDialog("What is your move called?");
            movePower1 = Integer.parseInt(JOptionPane.showInputDialog("How strong is " + move1 + "?"));
            attackSpeed1 = Integer.parseInt(JOptionPane.showInputDialog("How fast is your attack?"));
            playerName2 = JOptionPane.showInputDialog("Player 2 what is your name?");
            playerHit2 = Integer.parseInt(JOptionPane.showInputDialog("How many Hit Points do you have?"));
            move2 = JOptionPane.showInputDialog("What is your move called?");
            movePower2 = Integer.parseInt(JOptionPane.showInputDialog("How strong is " + move2 + "?"));
            attackSpeed2 = Integer.parseInt(JOptionPane.showInputDialog("How fast is your attack?"));
            while (playerHit1 > 0 && playerHit2 > 0) {
                while (attackSpeed1 == attackSpeed2){
                    attackSpeed1 = randGen.nextInt();
                    attackSpeed2 = randGen.nextInt();
                }
                if (attackSpeed1 > attackSpeed2) {
                    JOptionPane.showMessageDialog(null, playerName1 + " hit " + playerName2 + " with " + move1 + " for " + movePower1 + " damage");
                    playerHit2 -= movePower1;
                    if (playerHit2 > 0) {
                        JOptionPane.showMessageDialog(null, playerName2 + " hit " + playerName1 + " with " + move2 + " for " + movePower2 + " damage");
                        playerHit1 -= movePower2;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, playerName2 + " hit " + playerName1 + " with " + move2 + " for " + movePower2 + " damage");
                    playerHit1 -= movePower2;
                    if (playerHit1 > 0) {
                        JOptionPane.showMessageDialog(null, playerName1 + " hit " + playerName2 + " with " + move1 + " for " + movePower1 + " damage");
                        playerHit2 -= movePower1;
                    }
                }
            }
            if (playerHit1 > 0){
                numWins1 ++;
            } else if (playerHit2 > 0) {
                numWins2++;
            }
        }
        JOptionPane.showMessageDialog(null,  "Player1 won " + numWins1 + " while Player 2 won " + numWins1);
        if(numWins1 > numWins2){
            JOptionPane.showMessageDialog(null,  "Player1 WINS!!");
        }else {
            JOptionPane.showMessageDialog(null,  "Player2 WINS!!");

        }

    }
}
