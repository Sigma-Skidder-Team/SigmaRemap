package mapped;


import org.w3c.dom.Element;

public class Class6653 implements Class6650 {
   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      Class8412 var7 = Class8885.method32335(var2);
      var7 = new Class8412(var4, var7);
      float var8 = Float.parseFloat(var2.getAttribute("width"));
      float var9 = Float.parseFloat(var2.getAttribute("height"));
      float var10 = Float.parseFloat(var2.getAttribute("x"));
      float var11 = Float.parseFloat(var2.getAttribute("y"));
      Class2527 var12 = new Class2527(var10, var11, var8 + 1.0F, var9 + 1.0F);
      Class2520 var13 = var12.method10577(var7);
      Class6615 var14 = Class8885.method32331(var2);
      var14.method20114("width", "" + var8);
      var14.method20114("height", "" + var9);
      var14.method20114("x", "" + var10);
      var14.method20114("y", "" + var11);
      var3.method25476(new Class5967(3, var13, var14, var7));
   }

   @Override
   public boolean method20303(Element var1) {
      return var1.getNodeName().equals("rect");
   }
}
