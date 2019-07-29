PImage mustache;
PImage foxPicture;
void setup () {
  foxPicture = loadImage ("foxPicture.jpg");
  size(500,500);
  foxPicture.resize(width,height);
}
void draw (){
 background(foxPicture);
}
