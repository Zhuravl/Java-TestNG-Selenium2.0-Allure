package enums;

/**
 * Enum contains set of pages
 */
public enum PageEnum {

    LOGIN("Login", "https://my.finiata.pl/sign-in");

    private String name;
    private String url;

    PageEnum(String name, String url){
        this.name = name;
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public String getName(){
        return name;
    }
}
