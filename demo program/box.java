class BoxDetail{
    double height;
    double width;
    double depth;
}
class box{
    public static void main(String[] args) {
        BoxDetail myBox = new BoxDetail();
        double vol;
        myBox.width=10;
        myBox.height=20;
        myBox.depth=15;
        vol=myBox.width*myBox.height*myBox.depth;
        System.out.println("Volume is: "+vol);
    }
}

