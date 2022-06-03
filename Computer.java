public class Computer {
    public void turnOnComputer() {
        System.out.println("Computer Turned On.");
    }
    public void turnOffComputer() {
        System.out.println("Computer Turned Off.");
    }
    public void cleanCache() {
        System.out.println("Cache Cleaned.");
    }
    public void reduceBrightness(int brightnessLevel) {
        System.out.println("Brightness Reduced to " + brightnessLevel + "%.");
    }
    public void playMusic() {
        System.out.println("playing music on Spotify!");
    }
    public void adjustTheVolume(int volumeLevel) {
        System.out.println("Volume level adjusted to " + volumeLevel + "%.");
    }

    public void PlayGame() {
        System.out.println("Playing League of Legends!");

    }

    public void UseDiscord() {
        System.out.println("Using Discord with friends!");
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnOnComputer();
        myComputer.turnOffComputer();
        myComputer.cleanCache();
        myComputer.reduceBrightness(40);
        myComputer.playMusic();
        myComputer.adjustTheVolume(15);
        myComputer.PlayGame();
        myComputer.UseDiscord();

        ChromeBrowser newWindow = new ChromeBrowser();
        newWindow.openNewTabInChromeBrowser();
        newWindow.closeChromeBrowser();

        TextEditor myText = new TextEditor();
        System.out.println(myText.openTextEditor());
        myText.writeIntoTextEditor("My name is Nurul Ahad.");
        myText.closeTextEditor();

        MicrosoftOutlook myMail = new MicrosoftOutlook();
        System.out.println(myMail.openMicrosoftOutlook());
        MicrosoftOutlook.closeOutlook();

        Calculator myCalculator = new Calculator();
        myCalculator.openCalculator();
        System.out.println(myCalculator.sumOfTwoNumbers(5,10));
        System.out.println(myCalculator.addThreeNumbers(5,7,15));
        System.out.println(myCalculator.deductionOfTwoNumbers(2,10));

    }

}
