package mastermind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MasterMind {
    Character[] code;
    public MasterMind(Character[] code) {
     this.code = code;
    }

    public Character[] play(Character[] guess) {
        List<Character> feedback = new ArrayList<>();
        for(int i=0;i<guess.length;i++){
            for(int j=0;j<guess.length;j++){
                if(guess[i]==code[j]){
                    feedback.add('W');
                }
            }
        }
        return feedback.toArray(new Character[feedback.size()]);
    }
}