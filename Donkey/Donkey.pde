PImage donkey;
PImage tail;
int tX = 648;
int tY = 197;
void setup(){
size(676,586);


donkey = loadImage("donkey.png");      
tail = loadImage("download.png");  



}
void draw(){

background(donkey);
println(mouseX +" "+mouseY);


}