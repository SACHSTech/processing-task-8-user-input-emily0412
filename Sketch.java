import processing.core.PApplet;
import processing.core.PImage; // import the PImage library

public class Sketch extends PApplet {

  PImage imgGrass;
  PImage imgBird;
  PImage birdSong;
  PImage imgFlower;
  PImage imgNight;
  PImage imgButterfly;
  PImage imgRabbit;
  PImage imgBumblebee;
  PImage imgSun;

  int bumblebeeX = 150;
  int bumblebeeY = 150;

  String message = "";

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  int sunX = 0;
  int sunY = 150;
	
	
  public void settings() {
	// put your size call here
    size(1000, 667);
  }

  public void setup() {
    imgGrass = loadImage("grassBack.jpg");
    image(imgGrass, 0, 0);

  }


  public void draw() {
	   
    imgBird(mouseX, mouseY); 

    if(mousePressed) {
      birdSong(mouseX, mouseY);
    }

    if(keyPressed) {
      imgButterfly(800, 100);
    }

    if(keyPressed) {
      if (key == 'r') {
        imgRabbit(100, 400);
      }
    }

    /*if (keyPressed) {
      if (keyCode == UP) {
        imgBumblebee(bumblebeeX, bumblebeeY -= 10);
      } 
      else if (keyCode == DOWN) {
        imgBumblebee(bumblebeeX, bumblebeeY += 10);
      } 
      else if(keyCode == LEFT){
        imgBumblebee(bumblebeeX -= 10, bumblebeeY);
      }
      else if(keyCode == RIGHT){
       imgBumblebee(bumblebeeX += 10, bumblebeeY); 
      }
    }*/

    text(message, 25, 150);

    if (upPressed) {
      imgBumblebee(bumblebeeX, bumblebeeY -= 10);
    }
    if (downPressed) {
      imgBumblebee(bumblebeeX, bumblebeeY += 10);
    }
    if (leftPressed) {
      imgBumblebee(bumblebeeX -= 10, bumblebeeY);
    }
    if (rightPressed) {
      imgBumblebee(bumblebeeX += 10, bumblebeeY); 
    }

  }
  public void imgBird(int birdX, int birdY) {
    imgBird = loadImage("bird.png");
    imgBird.resize(imgBird.width/4, imgBird.height/4);
    image(imgGrass, 0, 0);
    image(imgBird, birdX - 100, birdY - 70);
  }

  public void birdSong(int birdSongX, int birdSongY) {
    birdSong = loadImage("music notes.png");
    birdSong.resize(birdSong.width/2, birdSong.height/2);
    image(birdSong, birdSongX, birdSongY - 100);
  }

  public void mouseClicked() {
    imgFlower = loadImage("flowers.png");
    image(imgFlower, mouseX - 100, mouseY - 100);
  }

  public void mouseWheel() {
    imgNight = loadImage("night.jpg");
    image(imgNight, 0, 0);
  }

  public void imgButterfly(int butterflyX, int butterflyY) {
    imgButterfly = loadImage("butterfly.png");
    imgButterfly.resize(imgButterfly.width/4, imgButterfly.height/4);
    image(imgButterfly, butterflyX, butterflyY);
  }

  public void imgRabbit(int rabbitX, int rabbitY) {
    imgRabbit = loadImage("rabbit.png");
    imgRabbit.resize(imgRabbit.width/3, imgRabbit.height/3);
    image(imgRabbit, rabbitX, rabbitY);
  }

  public void imgBumblebee(int bumblebeeX, int bumblebeeY) {
    imgBumblebee = loadImage("bee.png");
    imgBumblebee.resize(imgBumblebee.width/2, imgBumblebee.height/2);
    image(imgBumblebee, bumblebeeX, bumblebeeY);
  }

  public void keyTyped() {
    message += key;
    textSize(36);
    fill(147, 112, 219);
  }

  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}