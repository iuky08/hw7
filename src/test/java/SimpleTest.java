import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void successTestHamcrest(){
        assertThat(true, is(true));
    };

    @Test
    void negativeTestHamcrest(){
        assertThat(true, is(false));
    };
}
