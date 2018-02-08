//For a test Commit

import javax.swing.JOptionPane;
public class theJourney {
    //private static String strangersQuest;

    public String heroName() {
        //***Asks for user name input
        String askName = JOptionPane.showInputDialog(null, "What is your Name Hero?");
        return askName;
        // *****add error handling and null handling******
    }

    public String heroClass() {
        //***Asks for Heroes Class
        Object[] options = {"Warrior", "Mage", "Thief"};
        String askClass = (String)JOptionPane.showInputDialog(null, "What is your Hero's Class? (This will effect gameplay)", null, 0, null, options, "Warrior");
        //System.out.println(askClass);
        return askClass;
        //**Add Null/Cancel handling
    }

    public String heroGender() {
        //***Asks for Heroes Gender
        Object[] options = {"Male", "Female"};
        String askGender = (String)JOptionPane.showInputDialog(null, "What is your Hero's Gender?", null, 0, null, options, "Male");
        //System.out.println(askGender);
        return askGender;
        //**Add Null/Cancel handling
    }

    public int strangersOffer() {
        //***stranger offers first quest
        Object[] questOptions = {"Yes, I'll save your village!", "No, that sounds scary."};
        int strangersQuest = JOptionPane.showOptionDialog(null, "Do you take the Strangers Quest?", "Input", JOptionPane.INFORMATION_MESSAGE, 0, null , questOptions, questOptions);
        //System.out.println(strangersQuest);

        return strangersQuest;
        //**Add Null/Cancel handling

    }
    public int kingsOffer() {
        //***stranger offers first quest
        Object[] questOptions = {"Yes, I'll do it!", "No, thats too scary."};
        int kingsQuest = JOptionPane.showOptionDialog(null, "The King has asked you to aid him in killing a troll. Will you do it?", "Input", JOptionPane.INFORMATION_MESSAGE, 0, null , questOptions, questOptions);
        //System.out.println(strangersQuest);

        return kingsQuest;
        //**Add Null/Cancel handling

    }

    public int nearbyCamp() {
        //***stranger offers first quest
        Object[] questOptions = {"Yes, I'll do it!", "No, time to run away, far away."};
        int camp = JOptionPane.showOptionDialog(null, "Do you investigate the screams from the camp?", "Input", JOptionPane.INFORMATION_MESSAGE, 0, null , questOptions, questOptions);
        //System.out.println(strangersQuest);

        return camp;
        //**Add Null/Cancel handling

    }

    public int orcStronghold() {
        //***stranger offers first quest
        Object[] questOptions = {"Yes, I'll do it!", "No, I will go back to the castle."};
        int orcs = JOptionPane.showOptionDialog(null, "Do you go to the stronghold?", "Input", JOptionPane.INFORMATION_MESSAGE, 0, null , questOptions, questOptions);
        //System.out.println(strangersQuest);

        return orcs;
        //**Add Null/Cancel handling

    }
    public void runAway(String userName) {
        JOptionPane.showMessageDialog(null, userName + " attempts to travel back to the castle however is ambushed by orcs");
        Object[] questOptions = {"Time to fight!", "Nope, run away."};
        int ambush = JOptionPane.showOptionDialog(null, "Do you fight the orcs or attempt to run away?", "Input", JOptionPane.INFORMATION_MESSAGE, 0, null , questOptions, questOptions);
        if (ambush == 0) {
            System.out.println("Yes button clicked");
            JOptionPane.showMessageDialog(null, userName + " charges into battle with the orcs.");
            int userDamage = userAttack();
            JOptionPane.showMessageDialog(null, userName + " Attacks the orcs for " + userDamage + " damage");
            if (userDamage > 70) {
                JOptionPane.showMessageDialog(null, "You have defeated the Orcs!");

            }
            else {
                JOptionPane.showMessageDialog(null, "You were defeated by the orcs! You will have to start your journey over." ); System.exit(0);
            }

        }

        else if (ambush == 1) {
            System.out.println("No button clicked");
            JOptionPane.showMessageDialog(null, userName + " tries to run but trips, falls and is briefly knocked out. ");
            JOptionPane.showMessageDialog(null, userName + " breaks free from the orcs and after killing them all, heads to the orc stronghold to rid the world of this menace. ");

        }
    }

    public static int userAttack() {
        int userDamage = ((int) (Math.random() * (100)));
        return userDamage;

    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        //***BODY
        JOptionPane.showMessageDialog(null, "Welcome To the Heroes Journey!");
        theJourney newChar = new theJourney();

        String userName = newChar.heroName();
        //JOptionPane.showMessageDialog(null, "Hello " + userName);

        String userClass = newChar.heroClass();
        //JOptionPane.showMessageDialog(null, "You chose " + userClass);

        String userGender = newChar.heroGender();
        //JOptionPane.showMessageDialog(null, "You chose " + userGender);

        JOptionPane.showMessageDialog(null, "You Are " + userName + " , a " + userGender + " " + userClass);

        JOptionPane.showMessageDialog(null, "You come from a little town known as northwabbatown, and you wanted to go on an adventure so you packed a few things and headed off to the kings castle. on the way you met an old man, he says to you\"help! my village is under attack!\"");

        int firstQuest = newChar.strangersOffer();
        //Quest offered to save village

        if (firstQuest == 0) {
            System.out.println("Yes button clicked");
            JOptionPane.showMessageDialog(null, userName + " charges into battle with the Goblins.");
            int userDamage = userAttack();
            JOptionPane.showMessageDialog(null, userName + " Attacks the goblins for " + userDamage + " damage");
            if (userDamage > 30) {
                JOptionPane.showMessageDialog(null, "You have defeated the Goblins!");
                JOptionPane.showMessageDialog(null, "The King arrives and is impressed with your prowess. He has another quest for you.");

            }
            else {
                JOptionPane.showMessageDialog(null, "You were defeated by the Goblins! You will have to start your journey over." ); System.exit(0);
            }

        }

        else if (firstQuest == 1) {
            System.out.println("No button clicked");
            JOptionPane.showMessageDialog(null, userName + " flees to a hiding place, as half the village is engulfed in flames. ");
            JOptionPane.showMessageDialog(null,"The King rides in and sees what has happened and offers " + userName + " a chance at redemption for the cowardice shown by killing a troll in a cave.");

        }

        int kingsQuest = newChar.kingsOffer();
        //Quest offered to kill troll
        if (kingsQuest == 0) {
            System.out.println("Yes button clicked");
            JOptionPane.showMessageDialog(null, userName + " arrives at the trolls cave.");
            int userDamage = userAttack();
            JOptionPane.showMessageDialog(null, userName + " Attacks the troll for " + userDamage + " damage");
            if (userDamage > 40) {
                JOptionPane.showMessageDialog(null, "You have defeated the Troll!");
                //JOptionPane.showMessageDialog(null, "The King arrives and is impressed with your prowess. He has another quest for you.");
                JOptionPane.showMessageDialog(null, "Unfortunately the King was killed in the battle with the Troll. You must now go to the Kings castle and report the sad news.");

            }
            else {
                JOptionPane.showMessageDialog(null, "You were knocked out by the Troll!" );
                JOptionPane.showMessageDialog(null, "When you awoke you see the King has killed the troll but died in the battle. You must now go to the Kings castle and report the sad news.");
            }

        }

        else if (kingsQuest == 1) {
            System.out.println("No button clicked");
            JOptionPane.showMessageDialog(null, userName + " refuses the Kings quest and instead heads to the Kings castle. ");


        }

        JOptionPane.showMessageDialog(null, userName + " arrives at the Kings castle and is saddened that the King was killed by the troll.");
        JOptionPane.showMessageDialog(null, userName + " overhears a scribe announcing that the graveyard is now overrun with skeletons.");
        JOptionPane.showMessageDialog(null, userName + " goes to the graveyard to fight the skeletons.");
        int userDamage = userAttack();
        JOptionPane.showMessageDialog(null, userName + " Attacks the skelatons for " + userDamage + " damage");
        if (userDamage > 20) {
            JOptionPane.showMessageDialog(null, "You have defeated the Skelatons!");


        }
        else {
            JOptionPane.showMessageDialog(null, "You were killed in the graveyard! Please start your journey again"); System.exit(0);

        }

        JOptionPane.showMessageDialog(null, "After defeating the skelatons " + userName + " hears screams from a nearby camp in the woods.");

        int campQuest = newChar.nearbyCamp();
        if (campQuest == 0) {
            System.out.println("Yes button clicked");
            JOptionPane.showMessageDialog(null,"Your investigation reveals the camp is an orc camp.");
            int userDamage2 = userAttack();
            JOptionPane.showMessageDialog(null, userName + " Attacks the orcs for " + userDamage2 + " damage");
            if (userDamage2 > 40) {
                JOptionPane.showMessageDialog(null, "You have defeated the Orcs!");
                JOptionPane.showMessageDialog(null, "You free a peasant the orcs had captured.");
                JOptionPane.showMessageDialog(null, "He tells you of an orc stronghold.");
                int orcQuest = newChar.orcStronghold();
                if (orcQuest == 0) {
                    System.out.println("Yes button clicked");
                    JOptionPane.showMessageDialog(null, "You Go to the orc stronghold");

                }
                else {
                    JOptionPane.showMessageDialog(null, "You head back to the Castle" );
                    newChar.runAway(userName);
                }

            }

            else {
                JOptionPane.showMessageDialog(null, "You were killed by the orcs! Please start your journey again"); System.exit(0);
            }

        }

        else if (campQuest == 1) {
            System.out.println("No button clicked");
            JOptionPane.showMessageDialog(null, userName + " is scared by the screams and runs away. ");
            newChar.runAway(userName);

        }


        //arriving at orc stronghold is next overlap
        JOptionPane.showMessageDialog(null, userName + " arrives at the orc stronghold and need to get past the gate.");
        if (userClass == "Warrior") {
            JOptionPane.showMessageDialog(null, userName + " breaks down the gate.");
            JOptionPane.showMessageDialog(null, "This alerts an orc army which must be defeated");
            int userDamage3 = userAttack();
            JOptionPane.showMessageDialog(null, userName + " Attacks the orc army for " + userDamage3 + " damage");
            if (userDamage3 > 40) {
                JOptionPane.showMessageDialog(null, "You have defeated the orc army!");
                JOptionPane.showMessageDialog(null, userName + " proceeds to the stronghold's inner sanctum where a necromancer is waiting for you.");

            }
            else {
                JOptionPane.showMessageDialog(null, "You were defeated by the orc army! You will have to start your journey over." ); System.exit(0);
            }

        }



        if (userClass == "Mage") {
            JOptionPane.showMessageDialog(null, userName + " teleports past the gate into the stronghold's inner sanctum where a necromancer is waiting for you.");

        }

        if (userClass == "Thief") {
            JOptionPane.showMessageDialog(null, userName + " sneaks through tunnels into the stronghold's inner sanctum where a necromancer is waiting for you..");

        }

        int userDamage4 = userAttack();
        JOptionPane.showMessageDialog(null, userName + " Attacks the Necromancer for " + userDamage4 + " damage");
        if (userDamage4 > 40) {
            JOptionPane.showMessageDialog(null, "You have defeated the Necromancer!");

        }
        else {
            JOptionPane.showMessageDialog(null, "You were defeated by the Necromancer! You will have to start your journey over." ); System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "After the necromancers defeat he transforms into dragon and teleports you to another dimension");
        JOptionPane.showMessageDialog(null, "In this dimension you come accross two hooded people. they tell you:");
        JOptionPane.showMessageDialog(null, "We are Jedi! Do not bother us!");
        JOptionPane.showMessageDialog(null, "You explain you were brought here from another dimension by the evil necromancer, so the Jedi offer to help");
        JOptionPane.showMessageDialog(null, "You find the Necromancer and engage him in battle with the jedi's help.");
        int userDamage5 = userAttack();
        JOptionPane.showMessageDialog(null, userName + " Attacks the Necromancer for " + userDamage5 + " damage");
        if (userDamage5 > 40) {
            JOptionPane.showMessageDialog(null, "You have defeated the Necromancer! When the necromancers evil power was released you were trasnported home.");

        }
        else {
            JOptionPane.showMessageDialog(null, "You were defeated by the Necromancer! You fall knowing the Jedi will stop the evil necromancer." ); System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "The End.");
        JOptionPane.showMessageDialog(null, "Credits.....with fanfaire and music.");
        JOptionPane.showMessageDialog(null, "Credits.....Progammer Dad aka Michael, story writer me aka Timothy Rupert, main charecter aka " + userName + ".");



    }



}
