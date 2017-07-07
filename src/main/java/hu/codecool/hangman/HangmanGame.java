package hu.codecool.hangman;

import java.util.ArrayList;
import java.util.List;

public final class HangmanGame {

    public static final class Status {

        private Integer length;
        private List<String> guesses = new ArrayList<>();

        public Status() {
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public List<String> getGuesses() {
            return guesses;
        }
    }

    private Status status;

    public HangmanGame() {
    }

    public void start(String toGuess) {
        status = new Status();
        status.setLength(toGuess.length());
    }

    public void guess(String letter) {
        status.getGuesses().add(letter);
    }

    public Status getStatus() {
        return status;
    }
}
