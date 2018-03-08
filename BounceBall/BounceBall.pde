int TY = 100;
int BY = 700;
int BallY = 500;
int speed = 5;
int  speed2=5;
int BallY2=300;
void setup() {
  size(1000, 1000);
  background(5, 5, 5);
  strokeWeight(30); 
  stroke(0, 255, 134);
  line(100, TY, 700, TY);
  strokeWeight(30); 
  stroke(0, 255, 134);
  line(100, BY, 700, BY);
}
void draw() {
  BallY+=speed;
  BallY2+=speed2;
  background(5, 5, 5);
  strokeWeight(30); 
  stroke(0, 255, 134);
  line(100, TY, 700, TY);
  strokeWeight(30); 
  stroke(0, 255, 134);
  line(100, BY, 700, BY);
  fill(3, 255, 249);
  ellipse(500, BallY, 7, 7);
  Float TD = dist(500, TY, 500, BallY);
  Float BD = dist(500, BY, 500, BallY);
  if (BD<15||TD<15) {
    speed=speed*-1;
  }
  fill(3, 255, 249);
  ellipse(400, BallY, 7, 7);
  Float TD2 = dist(400, TY, 400, BallY);
  Float BD2 = dist(400, BY, 400, BallY);
  if (BD2<15||TD2<15) {
    speed=speed*1;
  }
  fill(3, 255, 249);
  ellipse(300, BallY2, 7, 7);
  Float TD3 = dist(300, TY, 300, BallY);
  Float BD3 = dist(300, BY, 300, BallY2);
  if (BD3<15||TD3<15) {
    speed2=speed2*-1;
  }
}
void drawBall(int BallY,Y,)