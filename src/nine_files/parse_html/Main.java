package nine_files.parse_html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String htmlFilePath = parseFile("nine_files/parse_html/index.html");
        Document doc = Jsoup.parse(htmlFilePath);
        Elements elements = doc.select("li.n1-news");

        elements.forEach(e -> System.out.println(e.text()));
    }

    public static String parseFile(String path) {

        StringBuilder builder = new StringBuilder();



        try {
            List<String> fileList = Files.readAllLines(Paths.get(path));
            fileList.forEach(builder::append);

        } catch (Exception e) {
            System.out.println(e);
        }

        return builder.toString();


    }
}
