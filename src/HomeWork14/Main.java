package HomeWork14;

/*
Сделайте класс MusicStyles, который будет содержать метод playMusic()
Сделайте его наследников: PopMusic, RockMusic, и ClassicMusic.
Наследники должны по-своему реализовывать метод playMusic().
В мейн-классе создайте музыкальные группы для каждого стиля
С помощью метода for each вызовите у всех наследников MusicStyles метод playMusic()
 */
public class Main {

    public static void main(String[] args) {

//        MusicGroup billieAilish = new MusicGroup("Billie Ailish", );
//        MusicGroup maneskin = new MusicGroup("Maneskin", );
//        MusicGroup ludovicoEinaudi = new MusicGroup("Ludovico Einaudi", );
        ClassicMusic classicMusic = new ClassicMusic();
        RockMusic rockMusic = new RockMusic();
        PopMusic popMusic = new PopMusic();
//        MusicStyles[] styles = new MusicStyles[classicMusic, rockMusic, popMusic];

    }

}
