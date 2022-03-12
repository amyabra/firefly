
package fireflies_battle;

public class runner {
   public static void main(String[] args){
        int counts=1;
        int round=0;
        int num_alive=0;
        firefly[] arr=new firefly[10];
        
        for(int i=0; i<10; i++){
            arr[i]=new firefly();}
        
        System.out.println("Initial fireflies: ");
        for(firefly j:arr){
            System.out.print("Firefly Number "+counts+": ");
            j.display();
            counts++;}
        
       do{
            round++;
            int nums=0;
           
            System.out.println("***************************************************");
            System.out.println("This is round "+round);
            
            for(int x=0; x<10; x++){
                for(int j=0;j<10;j++){
                    
                    if( j==0 && arr[x].Alive()==true){
                        arr[x].move();
                        System.out.print("Firefly "+(x+1)+" is moved to ");
                        arr[x].display();
                    }
                    
                    if(arr[x].Alive()==true && arr[j].Alive()==true && x!=j){
                        arr[x].distance(arr[j]);
                        if(arr[x].Alive()==false && arr[j].Alive()==true){
                            System.out.println("OMG! Firefly "+(j+1)+" just killed firefly "+(x+1)+"!");}
                            
                        else if(arr[x].Alive()==true && arr[j].Alive()==false){
                            System.out.println("OMG! Firefly "+(x+1)+" just killed firefly "+(j+1)+"!");
                        }}}}
            
            System.out.print("\n");
            System.out.println("ALIVE: ");
            
            for(int k=0;k<10;k++){
                if(arr[k].Alive()==true){
                    System.out.println("Firefly "+ (k+1) +" ");
                    nums++;
                }}
            num_alive=nums;}
        while(num_alive!=1);
        for(int n=0;n<10;n++){
            if(arr[n].Alive()==true){
                System.out.println("***************************************************");
                System.out.println("CONGRADUALTIONS! The WINNER is FIREFLY "+(n+1)+" ");}}}}

                
            
            