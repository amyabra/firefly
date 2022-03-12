
package fireflies_battle;
import java.util.Random;
import java.lang.Math;
public class firefly  {
    int x,y,z;
    boolean alive;
    Random rand=new Random();
    
    firefly(){
        x=rand.nextInt(20)-10;
        y=rand.nextInt(20)-10;
        z=rand.nextInt(20)-10;
        alive=true;
    
    }
    boolean Alive(){return alive;}
    double getx(){return x;}
    double gety(){return y;}
    double getz(){return z;}
   
    void move(){
        int xm=0; 
        int ym=0;
        int zm=0;
        do{
            xm = rand.nextInt(3)-1; 
            ym = rand.nextInt(3)-1;
            zm = rand.nextInt(3)-1;
        }while(x+xm>10.0 || x+xm<-10.0 || y+ym>10.0 || y+ym<-10.0 || z+zm>10.0 || z+zm<-10.0 || xm==0 || ym==0 || zm==0);  
        x += xm;
        y += ym;
        z += zm;
    }

    void distance(firefly f){
        if(f.alive=true){
            double distance=
                    Math.sqrt(Math.pow(this.getx()-f.getx(),2)+
                    Math.pow(this.gety()-f.gety(),2)+
                    Math.pow(this.getz()-f.getz(),2));
            
            if(distance<=10){
                f.dead();
            }}}
    
    void display(){
        System.out.println("position ("+ x +","+ y +","+ z+ ")");
    }
    void dead(){
        alive=false;
    }
}