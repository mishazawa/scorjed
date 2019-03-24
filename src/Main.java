import processing.core.PApplet;

public class Main extends PApplet {

  public void settings () {
    size(200, 200);
  }
  public void setup () {}
  public void draw () {
    background(0);
  }

  public static void main (String[] args) {
    PApplet.runSketch(new String[] {"scorjed"}, new Main());
  }
}
