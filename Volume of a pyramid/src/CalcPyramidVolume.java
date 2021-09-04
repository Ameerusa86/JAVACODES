public class CalcPyramidVolume {
static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight)
{
double Volume,baseArea;
baseArea = baseLength * baseWidth; Volume = baseArea * pyramidHeight * 1/3; 
return Volume;
}
public static void main (String [] args) {
System.out.println("Volume for 1.0, 1.0, 1.0 is: " + pyramidVolume(1.0, 1.0, 1.0));
}
}
