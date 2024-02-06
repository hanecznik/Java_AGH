package agh.ii.ppies.prinjava.hw;

import agh.ii.ppies.prinjava.hw.dal.ImdbTop250;

import java.util.*;

import static java.util.stream.Collectors.toMap;

interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) {
        var movies = ImdbTop250.movies().orElseThrow();
        var result = new HashSet<String>();

        for (var movie : movies) {

            if (movie.directors().contains(director)) {
                result.add(movie.title());
            }
        }
        System.out.println(result);
        return result;
    }


    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) {
        var movies = ImdbTop250.movies().orElseThrow();
        var result = new HashSet<String>();

        for (var movie : movies) {

            if (movie.actors().contains(actor)) {
                result.add(movie.title());
            }
        }
        System.out.println(result);
        return result;
    }


    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {

        var movies = ImdbTop250.movies().orElseThrow();
        Map<String, Long> result = new HashMap<>();

        for (var movie : movies)
            for (String director : movie.directors()) {
                result.merge(director, 1L, Long::sum);
            }
        System.out.println(result);
        return result;
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {

        var result = new LinkedHashMap<String, Long>();
        var unsorted = PlayWithMovies.ex03();
        LinkedHashMap<String, Long> sort = unsorted.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                        LinkedHashMap::new));
        var n = sort.size();

        for (int i = 0; i < n - 10; i++) {
            var keysSort = sort.keySet();
            for (var k : keysSort) {
                sort.remove(k);
                break;
            }
        }

        result = sort.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                        LinkedHashMap::new));
        System.out.println(result);
        return result;
    }
}