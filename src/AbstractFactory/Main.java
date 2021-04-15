package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "https://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "https://www.chosun.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");
        Link naver = factory.createLink("Naver", "https://www.naver.com/");

        Tray trayNews = factory.createTray("신문");
        trayNews.add(joins);
        trayNews.add(chosun);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(google);
        traySearch.add(naver);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
