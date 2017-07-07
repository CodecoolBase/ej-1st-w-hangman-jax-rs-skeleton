package hu.codecool.hangman;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/service")
public final class HangmanService {

    private static final HangmanGame game = new HangmanGame();

    @Path("/status")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HangmanGame.Status status() {
        return game.getStatus();
    }

    @Path("/start")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void start(JsonObject toGuess) {
        game.start(toGuess.getString("toGuess"));
    }

    @Path("/guess/{letter}")
    @POST
    public void guess(@PathParam("letter") String letter) {
        game.guess(letter);
    }
}
