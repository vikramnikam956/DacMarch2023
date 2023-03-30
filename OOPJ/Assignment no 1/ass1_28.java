public class ass1_28 {
    public static void main(String[] args) {
        double d =10293.189234;
        String str=String.valueOf(d);

        Double d2=new Double (d);

        Double d3=new Double(str);

        String bin= Long.toBinaryString(Double.doubleToLongBits(d));
        
        String oct= Long.toOctalString(Double.doubleToLongBits(d));
        String hex= Long.toHexString(Double.doubleToLongBits(d));
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
    }
    
}
