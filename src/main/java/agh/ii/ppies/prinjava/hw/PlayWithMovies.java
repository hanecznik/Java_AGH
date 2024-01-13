package agh.ii.ppies.prinjava.hw;

import agh.ii.ppies.prinjava.hw.dal.ImdbTop250;
import agh.ii.ppies.prinjava.hw.model.Movie;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) {
        throw new RuntimeException("ex01 is not implemented!");
    }

    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) {
        throw new RuntimeException("ex02 is not implemented!");
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {
        throw new RuntimeException("ex03 is not implemented!");
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {
        throw new RuntimeException("ex04 is not implemented!");
    }
}

