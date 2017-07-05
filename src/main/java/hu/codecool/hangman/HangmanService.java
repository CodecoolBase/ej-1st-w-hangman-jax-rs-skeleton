package hu.codecool.hangman;

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
    public void start(String toGuess) {
        game.start(toGuess);
    }

    @Path("/guess/{letter}")
    @POST
    public void guess(@PathParam("letter") String letter) {
        game.guess();
    }
}
