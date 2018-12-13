
package DB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author himanshu
 */
public class fourth{

    static ArrayList<String> m1 = new ArrayList<>();
    static ArrayList<String> m2 = new ArrayList<>();
    // We'll use a fake USER_AGENT so the web server thinks the robot is a normal web browser.
    private static final String USER_AGENT
            = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
    private List<String> links = new LinkedList<String>();
    private Document htmlDocument;

    /**
     * This performs all the work. It makes an HTTP request, checks the
     * response, and then gathers up all the links on the page. Perform a
     * searchForWord after the successful crawl
     *
     * @param url - The URL to visit
     * @return whether or not the crawl was successful
     */
    public boolean crawl(String url) {
        String y="";
        String z="";
        int count1 = 0, count2 = 0;

        try {
            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            Document htmlDocument = connection.get();
            this.htmlDocument = htmlDocument;
            if (connection.response().statusCode() == 200) // 200 is the HTTP OK status code
            // indicating that everything is great.
            {
                System.out.println("\n**Visiting** Received web page at " + url);
            }
            if (!connection.response().contentType().contains("text/html")) {
                System.out.println("**Failure** Retrieved something other than HTML");
                return false;
            }
            Elements linksOnPage = htmlDocument.select("a[href*=/torrent][title]");
            Elements lii=htmlDocument.select("a[href*=/torrent]");
            
            Elements els = htmlDocument.select("table[id=searchResult]");
            Elements seed = els.select("td[align=right]");
      
            for(Element i : lii)
            {
                System.out.println(i.attr("href"));
            }
            int count = 0;
            for (Element i : seed) {
                if (count % 2 == 0) {
                    String x = i.text();
                    m1.add(x);
                } else {
                    String x = i.text();
                    m2.add(x);
                }
                count++;
            }
            int ccc=0;
            System.out.println(linksOnPage.size());
            System.out.println(m1.size());
            System.out.println(m2.size());
            Iterator it=linksOnPage.iterator();
            Iterator it2=lii.iterator();
            int cz=0;
            while(it.hasNext()&&it2.hasNext()){
                Element e=(Element)it.next();
                Element e1=(Element)it2.next();
                if(ccc%2!=0){ccc++;continue;}
                DB.Connect.openConnection();
                y=e.attr("title","Download this torrent using magnet").text();
                z= e1.attr("href");
                String p=m1.get(cz);
                String o=m2.get(cz);
                System.out.println(y+" "+p+" "+o);
               
                DB.Connect.saveUsers3(y,p,o,"good",z);
                ccc++;
                cz++;
            }
            System.out.println("Total rows fetched :"+ccc);
          //  System.out.println("Found (" + linksOnPage.size() + ") links");
            count1 = 0;
            while (m1.size() > count1) {
               // System.out.println(m1.get(count1));
                count1++;
            }

           // System.out.println("Found (" + linksOnPage.size() + ") links");
        } catch (IOException ioe) {
            // We were not successful in our HTTP request
            return false;
        }
        return true;

    }

    public boolean searchForWord(String searchWord) {
        // Defensive coding. This method should only be used after a successful crawl.
        if (this.htmlDocument == null) {
            System.out.println("ERROR! Call crawl() before performing analysis on the document");
            return false;
        }
        System.out.println("Searching for the word " + searchWord + "...");
        String bodyText = this.htmlDocument.body().text();
        return bodyText.toLowerCase().contains(searchWord.toLowerCase());
    }

    public List<String> getLinks() {
        return this.links;
    }

}
