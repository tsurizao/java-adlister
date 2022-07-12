import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album emptyAlbum = new Album();
        Album hitAlbum = new Album(1, "Michael Jackson", "Thriller", "1982-11-30", 50.2, "Pop, post-disco, funk, rock");

        Author randomAuthor = new Author(12, "Ernest", "Hemingway");

        Quote inspirationalQuote = new Quote(1, "me", "You can do it!");
        Quote dadsQuote = new Quote(1, "dad", "Are ya winnin' son?");
        Quote shakespeareQuote = new Quote(1, "William Shakespeare", "Life's but a walking shadow, a poor player, that struts and frets his hour upon the stage, and then is heard no more.  It is a tale told by an idiot, full of sound and fury, signifying nothing.");
        Quote blakeQuote = new Quote(1, "William Blake", "To see a World in a Grain of Sand...");

        ArrayList<Quote> someQuotes = new ArrayList<>();
        someQuotes.add(inspirationalQuote);
        someQuotes.add(dadsQuote);
        someQuotes.add(shakespeareQuote);
        someQuotes.add(blakeQuote);

        for (Quote quote : someQuotes){
            System.out.println(quote.getContent() + "\n - " + quote.getAuthor());
        }
    }
}
