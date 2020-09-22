void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
//Buggys body
ellipse(200,200,100,200)
fill(255, 165, 0)

//Buggys Head
ellipse(200,80,50,50)

//Buggys eyes
ellipse(190,70,10,10)
ellipse(210,70,10,10)

// Buggys arms
line(155,150,30,90)
line(160,180,100,100)
line(250,200,295,80)
line(250,175,295,30)

//Buggys mouth
rect(200,95,15,10)



}