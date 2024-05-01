
public class Game {
    private String genre;
    private String type;
    private String name;
    public Game(String genre, String type, String name){
        this.name = name;
        this.genre = genre;
        this.type = type;
    }
    public String getInfo(){
        return String.format("genre: %s\ntype: %s\nname: %s\n", genre,type,name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setType(String type) {
        this.type = type;
    }
}
