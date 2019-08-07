package mastermind;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;



public class MasterMindTest {

    @Test
    public void alwaysPasses() {
        assertThat(true).isTrue();
    }

    @Test
    public void noMatchingColorGetsNoFeedback() {
        // given
        Character[] code = {'O', 'O', 'O', 'O'};
        MasterMind masterMind = new MasterMind(code);

        Character[] guess = {'B', 'B', 'B', 'B'};

        // when
        Character[] feedback = masterMind.play(guess);

        // then
        assertThat(feedback).isEmpty();
    }

    @Test
    public void rightColorWrongPositionGetsOneWhiteFeedback() {
        // given
        Character[] code = {'O', 'G', 'O', 'O'};
        MasterMind masterMind = new MasterMind(code);

        Character[] guess = {'B', 'B', 'G', 'B'};

        // when
        Character[] feedback = masterMind.play(guess);

        // then
        assertThat(feedback).containsExactly('W');
    }
    @Test
    public void rightColorRightPositionGetsOneBlackFeedback() {
        // given
        Character[] code = {'O', 'G', 'O', 'O'};
        MasterMind masterMind = new MasterMind(code);

        Character[] guess = {'B', 'G', 'B', 'B'};

        // when
        Character[] feedback = masterMind.play(guess);

        // then
        assertThat(feedback).containsExactly('B');
    }


}
