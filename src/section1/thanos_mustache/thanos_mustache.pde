 PImage mustache;
 PImage Thanos;
void setup(){
 Thanos = loadImage ("Thanos.jpg");
 size(800,600);
 Thanos.resize(width,height);
 mustache = loadImage("mustache.png");
}
void draw(){
 background(Thanos);
 image(mustache, mouseX, mouseY);
 
 if(mousePressed){
   
 }
 else{
   
 }
} 
  
