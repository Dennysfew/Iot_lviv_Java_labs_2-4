package ua.lviv.iot.manager.impl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearcherTest {
    Searcher searcher = new Searcher();
    Set<String> ex = new HashSet<>();


    String txt = """
            Once upon a time there was an old mother pig who had three little pigs and not enough food to feed them.
            Was the first little pig very lazy? What did the third little pig? He worked hard all day and built his house with bricks.
            Was the wolf greedy and does he tried to catch both pigs at once? Yes.
            """;

    @Test
    void findQuestion() {
        List<String> ex = new ArrayList<>();

        ex.add("Was the wolf greedy and does he tried to catch both pigs at once?");
        ex.add("Was the first little pig very lazy?");
        ex.add("What did the third little pig?");

        assertNotEquals(null, searcher.findQuestion(txt));
        assertEquals(ex.toString(), searcher.findQuestion(txt));
    }

    @Test
    void findSetOfWordsOfExactNumberOfLetters() {
        ex.add("was");
        ex.add("the");
        ex.add("pig");
        ex.add("did");
        ex.add("and");
        assertNotEquals(searcher.findSetOfWordsOfExactNumberOfLetters(searcher.findQuestion(txt), 3), null);
        assertEquals(searcher.findSetOfWordsOfExactNumberOfLetters(searcher.findQuestion(txt), 3), ex);
    }
}