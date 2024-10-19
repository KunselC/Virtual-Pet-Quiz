/* Virtual Pet, version 1
    * This is a simple virtual pet program by Kunsel Chodak.
 */
import javax.swing.*;

public class VirtualPet {
    private JFrame frame;
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int health = 10;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void setup(){
        face.setMessage("haiiiii!!!!!!");
        face.setImage("happy");
        waitAMoment(3);
        face.setMessage("Quiz time! Get too many wrong and I DIE");
        face.setImage("ecstatic_2");
    }

    public void h(int x){
        health = health + x;
    }
    

    public void quiz() {
        int startIndex = (int) (Math.random() * 5);
        waitAMoment(3);
    
        for (int i = 0; i < 5; i++) {
            int currentIndex = (startIndex + i) % 5;
            
            if (currentIndex == 0) {
                quiz1();
            } else if (currentIndex == 1) {
                quiz2();
            } else if (currentIndex == 2) {
                quiz3();
            } else if (currentIndex == 3) {
                quiz4();
            } else {
                quiz5();
            }
    
            if (health == 0) {
                death();
                return; // Hi, this is Kunsel, I'm here to tell you that you're dead.
            }
        }
    
        face.setMessage("You answered all questions correctly!");
    }
    public void death() {
        face.setImage("black_1");
        face.setMessage("...");
        waitAMoment(2);
        face.setImage("flowers_1");
        AudioPlayer.playSound("sounds/analog-sounds.wav");
        face.setMessage("*************************************************************************************************************************");
        waitAMoment(3);
        System.exit(0);
    }

    public void quiz1() {
        Object[] possibilities = {"Yes", "No", "Maybe"};
        String d = (String) JOptionPane.showInputDialog(frame, "Are computers cool?" ,"Obvious answers",
            JOptionPane.PLAIN_MESSAGE,
            null,
            possibilities,
            "Yes"
        );
            if (d != null) {
                if (d.equals("Yes")) {
                    face.setMessage("fax");
                    face.setImage("joyful_1");
                    h(10);
                    z();
                } else {
                    face.setMessage("wrong mf");
                    face.setImage("verysad_1");
                    health = 0;
                    z();
                }
            }
        }

    public void quiz2() {
        Object[] possibilities = {"Frequency of action potentials and # of motor neurons", "# of motor neurons and strength of action potentials", "Motor neuron type and strength of action potentials"};
        String d = (String) JOptionPane.showInputDialog(frame, "Answer the question below\n" + "\"What affects tension produced in skeletal muscle?\"","Anatomy & Physiology",
            JOptionPane.PLAIN_MESSAGE,
            null,
            possibilities,
            "Frequency of action potentials and # of motor neurons"
        );
            if (d != null) {
                if (d.equals("Frequency of action potentials and # of motor neurons")) {
                    face.setMessage("fax");
                    face.setImage("joyful_1");
                    h(10);
                    z();
                } else {
                    face.setMessage("wrong mf");
                    face.setImage("verysad_1");
                    health = 0;
                    z();
                }
            }
        }   
    public void quiz3() {
        Object[] possibilities = {"Excitation-Contration Coupling", "Graded muscle response", "Henneman’s size principle"};
        String d = (String) JOptionPane.showInputDialog(frame, "What term does this describe?\n" + "\"The way in which muscles contract, allowing for different forces for different corresponding situations\"","Anatomy & Physiology",
            JOptionPane.PLAIN_MESSAGE,
            null,
            possibilities,
            "Excitation-Contraction Coupling"
        );
            if (d != null) {
                if (d.equals("Graded muscle response")) {
                    face.setMessage("fax");
                    face.setImage("joyful_1");
                    h(10);
                    z();
                } else {
                    face.setMessage("wrong mf");
                    face.setImage("verysad_1");
                    health = 0;
                    z();
                }
            }
        }
    public void quiz4() {
        Object[] possibilities = {"What is there to be done?", "There is nothing we can do", "Why must the heavens be so cruel?"};
        String d = (String) JOptionPane.showInputDialog(frame, "What famous phrase is often accredited to Napolean?","History",
            JOptionPane.PLAIN_MESSAGE,
            null,
            possibilities,
            "What is there to be done?"
        );
            if (d != null) {
                if (d.equals("There is nothing we can do")) {
                    face.setMessage("fax");
                    face.setImage("joyful_1");
                    h(10);
                    z();
                } else {
                    face.setMessage("wrong mf");
                    face.setImage("verysad_1");
                    health = 0;
                    z();
                }
            }
        }
    public void quiz5() {
        Object[] possibilities = {"Barack", "The Third", "Obama"};
        String d = (String) JOptionPane.showInputDialog(frame, "What is President Obama's last name?","US Presidents",
            JOptionPane.PLAIN_MESSAGE,
            null,
            possibilities,
            "Barack"
        );
            if (d != null) {
                if (d.equals("Obama")) {
                    face.setMessage("fax");
                    face.setImage("joyful_1");
                    h(10);
                    z();
                } else {
                    face.setMessage("wrong mf");
                    face.setImage("verysad_1");
                    health = 0;
                    z();
                }
            }
        }
        public void z(){
            face.setMessage("health remaining: " + health);
        }

    public void waitAMoment (int seconds) {
        try{
            Thread.sleep (seconds*1000);

        } catch (Exception e) {

        }
    }

} // end Virtual Pet