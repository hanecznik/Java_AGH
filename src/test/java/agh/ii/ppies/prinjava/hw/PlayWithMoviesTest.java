package agh.ii.ppies.prinjava.hw;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PlayWithMoviesTest {

    /**
     * The movies (only titles) directed (or co-directed) by a given director
     */
    @Test
    public void testEx01() {
        assertThat(PlayWithMovies.ex01("Guy Ritchie"))
                .containsExactlyInAnyOrder("Snatch", "Lock, Stock and Two Smoking Barrels");

        assertThat(PlayWithMovies.ex01("Christopher Nolan"))
                .containsExactlyInAnyOrder("The Dark Knight", "Inception", "Interstellar",
                        "The Prestige", "Memento", "The Dark Knight Rises", "Batman Begins");

        assertThat(PlayWithMovies.ex01("Quentin Tarantino"))
                .containsExactlyInAnyOrder("Pulp Fiction", "Django Unchained", "Reservoir Dogs",
                        "Inglourious Basterds", "Kill Bill: Vol. 1", "Sin City");
    }

    /**
     * The movies (only titles) in which an actor played
     */
    @Test
    public void testEx02() {
        assertThat(PlayWithMovies.ex02("Tom Hanks"))
                .containsExactlyInAnyOrder("Forrest Gump", "Saving Private Ryan", "The Green Mile",
                        "Toy Story 3", "Toy Story", "Catch Me If You Can");

        assertThat(PlayWithMovies.ex02("Tom Hardy"))
                .containsExactlyInAnyOrder("Inception", "The Dark Knight Rises",
                        "Warrior", "Mad Max: Fury Road", "The Revenant");

        assertThat(PlayWithMovies.ex02("Robert De Niro"))
                .containsExactlyInAnyOrder("The Godfather: Part II", "Goodfellas", "Once Upon a Time in America",
                        "Raging Bull", "Heat", "Casino", "The Deer Hunter");
    }

    /**
     * The number of movies per director (as a map)
     */
    @Test
    public void testEx03() {
        Map<String, Long> numOfMoviesPerDirector = PlayWithMovies.ex03();

        assertThat(numOfMoviesPerDirector.size()).isEqualTo(167);
        assertThat(numOfMoviesPerDirector).containsAllEntriesOf(Map.of(
                "Tim Burton", 1L,
                "Guy Ritchie", 2L,
                "Wes Anderson", 1L,
                "Christopher Nolan", 7L,
                "Quentin Tarantino", 6L,
                "Alfred Hitchcock", 9L));
    }
    /**
     * The 10 directors with the most films on the list
     */
    @Test
    public void testEx04() {
        Map<String, Long> tenMostFreqDirectors = PlayWithMovies.ex04();
        assertThat(tenMostFreqDirectors).containsAllEntriesOf(Map.of(
                "Alfred Hitchcock", 9L,
                "Stanley Kubrick", 8L,
                "Martin Scorsese", 7L,
                "Steven Spielberg", 7L,
                "Christopher Nolan", 7L,
                "Billy Wilder", 7L,
                "Quentin Tarantino", 6L,
                "Charles Chaplin", 5L,
                "Ridley Scott", 4L,
                "Frank Capra", 4L));
    }
}