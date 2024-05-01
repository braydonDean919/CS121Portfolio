import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
public class JSONArrayReader {
    private ArrayList<Game> games = new ArrayList<>();
    public void readJSON(){
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("games.json"));
            Type gameListType = new TypeToken<ArrayList<Game>>(){}.getType();
            games = gson.fromJson(reader,gameListType);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void printGameList(){
        for (Game game: games){
            System.out.println(game.getInfo());
        }
    }

}
