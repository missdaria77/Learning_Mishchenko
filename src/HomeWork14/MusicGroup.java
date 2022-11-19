package HomeWork14;

public class MusicGroup {
    private String name;
    private MusicStyles style;

    public MusicGroup(String name, MusicStyles style) {
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicStyles getStyle() {
        return style;
    }

    public void setStyle(MusicStyles style) {
        this.style = style;
    }
}
