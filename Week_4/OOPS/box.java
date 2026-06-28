public class box {
    int length;
    int width;
    
    box(int l, int w) {
        length = l;
        width = w;
    }
    public void area(){

    }
    
}

class box3d extends box {
     int height;
     box3d(int l, int w, int h) {
         super(l, w);
         height = h;
     }
     public void volume(){

     }
}
