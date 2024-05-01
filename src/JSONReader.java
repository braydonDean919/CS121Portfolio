import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class JSONReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("game.json"));
            Game game = gson.fromJson(reader,Game.class);
            System.out.println("Game details");
            System.out.printf("genre: %s\ntype: %s\nname: %s\n" ,game.getGenre(),game.getType(),game.getName());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
