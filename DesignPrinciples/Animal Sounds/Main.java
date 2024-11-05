public class Main {

    public static void main(String[] args) {
        SoundMaker soundMaker = new SoundMaker();
        soundMaker.playSound(new Dog());
        soundMaker.playSound(new Cat());
    }

    // OCP: Open for extension, closed for modification
    // LSP: Subtypes must be substitutable for their base types
    // Here, the SoundMaker class is closed for modification, but open for extension.
    // If a new animal is added, the SoundMaker class does not need to be modified.
    // The new animal can be passed to the playSound method, and the animal will make its sound.
}
