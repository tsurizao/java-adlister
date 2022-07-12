import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album emptyAlbum = new Album();
        Album hitAlbum = new Album(1, "Michael Jackson", "Thriller", 1982, 50.2, "Pop, post-disco, funk, rock");

        Author dad = new Author(1, "my", "dad");
        Author me = new Author(2, "me", "myself");
        Author shakespeare = new Author(3, "William", "Shakespeare");
        Author blake = new Author(4, "William", "Blake");
        Author gump = new Author(5, "Forrest", "Gump");


        Quote inspirationalQuote = new Quote(1, me, "You can do it!");
        Quote dadsQuote = new Quote(2, dad, "Are ya winnin' son?");
        Quote shakespeareQuote = new Quote(3, shakespeare, "Life's but a walking shadow, a poor player, that struts and frets his hour upon the stage, and then is heard no more.  It is a tale told by an idiot, full of sound and fury, signifying nothing.");
        Quote blakeQuote = new Quote(4, blake, "To see a World in a Grain of Sand...");
        Quote gumpQuote = new Quote(5, gump, "Life is like a box of chocolates, you never know what you're gonna get.");

        ArrayList<Quote> someQuotes = new ArrayList<>();
        someQuotes.add(inspirationalQuote);
        someQuotes.add(dadsQuote);
        someQuotes.add(shakespeareQuote);
        someQuotes.add(blakeQuote);
        someQuotes.add(gumpQuote);

        for (Quote quote : someQuotes){
            System.out.println(quote.getContent() + "\n - " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }
    }
}
