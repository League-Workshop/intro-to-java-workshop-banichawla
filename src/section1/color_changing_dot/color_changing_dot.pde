void setup(){
size(600,600);
}
void draw(){
  fill(252,0,207);
  if (mousePressed) { 
    fill(250,10,98);
  } else{
    fill(41,10,250);  
  }
    ellipse(600/2,600/2,500,500); 
}
