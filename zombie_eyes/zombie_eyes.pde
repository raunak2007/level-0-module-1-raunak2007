void setup(){
size(400,400);
PImage face=loadImage("face-mask-scream-zombie-2.jpg");
image(face,0,0);
face.resize(200,200);
}
void draw(){
  ellipse(220,220,60,60);
  ellipse(220,440,60,60);
}