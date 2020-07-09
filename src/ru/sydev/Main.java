package ru.sydev;

public class Main {
    private Handler handler;

    public static void main(String[] args) {
	    new Main().start();
    }

    public void start() {
        Handler handler = new VowelsHandler();
        handler.linkWith(new WordsHandler());
        boolean result = handler.check("a b c d e f g h i j k l m");
        System.out.println(result);
    }
}
