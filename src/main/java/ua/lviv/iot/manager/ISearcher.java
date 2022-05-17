package ua.lviv.iot.manager;

import java.util.Set;

public interface ISearcher {
    String findQuestion(String txt);

    Set<String> findSetOfWordsOfExactNumberOfLetters(String txt, int size);

}

