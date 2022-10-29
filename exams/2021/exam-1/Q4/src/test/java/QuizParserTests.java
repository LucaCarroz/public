import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class for the quiz parser tests.
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * You MUST use this file for quiz parser tests.
 * You CAN add new constructors, methods, and nested classes to this class.
 * You MUST NOT rename this file.
 * You MUST NOT delete this file.
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
final class QuizParserTests {
    // TODO


    @Test
    public void QuizThrowsErrorWithNullString(){
        var qp = new QuizParser();
        assertThrows(IllegalArgumentException.class, () -> qp.parse(null));
    }

    @Test
    public void QuizThrowsErrorWithEmptyString(){
        var qp = new QuizParser();
        assertThrows(IllegalArgumentException.class, () -> qp.parse(""));
    }

    @Test
    public void QuizThrowsErrorWithNonDieseCommencingString(){
        var qp = new QuizParser();
        assertThrows(QuizFormatException.class, () -> qp.parse("ShouldThrowError"));
    }

    @Test
    public void QuizThrowsErrorWithLength1String(){
        var qp = new QuizParser();
        assertThrows(QuizFormatException.class, () -> qp.parse("# "));
    }

    @Test
    public void QuizThrowsErrorWithLength1Stng(){
        var qp = new QuizParser();
        assertThrows(QuizFormatException.class, () -> qp.parse("# \n- "));
    }

}
