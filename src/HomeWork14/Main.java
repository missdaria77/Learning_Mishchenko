package HomeWork14;

public class Main {

    public static void main(String[] args) {

        MusicStyles classicMusic = new ClassicMusic();
        MusicStyles rockMusic = new RockMusic();
        MusicStyles popMusic = new PopMusic();

        MusicGroup billieAilish = new MusicGroup("Billie Ailish", popMusic);
        MusicGroup maneskin = new MusicGroup("Maneskin", rockMusic);
        MusicGroup ludovicoEinaudi = new MusicGroup("Ludovico Einaudi", classicMusic);

        MusicStyles[] styles = new MusicStyles[]{classicMusic, rockMusic, popMusic};
        for (MusicStyles style : styles) {
            style.playMusic();
        }

    }

}
