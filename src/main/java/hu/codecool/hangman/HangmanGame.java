package hu.codecool.hangman;

public final class HangmanGame {

    public static final class Status {

        private Integer length;

        public Status() {
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }
    }

    private Status status;

    public HangmanGame() {
    }

    public void start(String toGuess) {
        status = new Status();
        status.setLength(toGuess.length());
    }

    public void guess() {
    }

    public Status getStatus() {
        return status;
    }
}
