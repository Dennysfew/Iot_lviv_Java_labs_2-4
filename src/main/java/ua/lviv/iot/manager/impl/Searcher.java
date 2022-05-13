package ua.lviv.iot.manager.impl;

import ua.lviv.iot.manager.ISearcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Set;
import java.util.HashSet;

public class Searcher implements ISearcher {

    @Override
    public Set<String> findRightWords(String txt, int size) {

        String reg = String.format("\\b\\w{%d}\\b", size);
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(txt);
        Set<String> words = new HashSet<>();
        while (matcher.find())
            words.add(matcher.group().toLowerCase());
        return words;
    }

    @Override
    public String findQuestion(String txt) {
        txt = "fds. " + txt;
        txt = txt.replaceAll("\\.", "! ");
        System.out.println(txt);
        String reg = String.format("[^!?]+\\?");
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(txt);
        Set<String> questionSentence = new HashSet<>();
        while (matcher.find())
            questionSentence.add(matcher.group());
        String haxToString = questionSentence.toString();
        return haxToString;

    }


}