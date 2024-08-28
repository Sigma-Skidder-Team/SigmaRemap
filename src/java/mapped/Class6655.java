package mapped;


import org.w3c.dom.Element;

public class Class6655 implements Class6650 {
   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      Class8412 var7 = Class8885.method32335(var2);
      var7 = new Class8412(var4, var7);
      float var8 = Class8885.method32337(var2, "cx");
      float var9 = Class8885.method32337(var2, "cy");
      float var10 = Class8885.method32337(var2, "rx");
      float var11 = Class8885.method32337(var2, "ry");
      Class2522 var12 = new Class2522(var8, var9, var10, var11);
      Class2520 var13 = var12.method10577(var7);
      Class6615 var14 = Class8885.method32331(var2);
      var14.method20114("cx", "" + var8);
      var14.method20114("cy", "" + var9);
      var14.method20114("rx", "" + var10);
      var14.method20114("ry", "" + var11);
      var3.method25476(new Class5967(1, var13, var14, var7));
   }

   @Override
   public boolean method20303(Element var1) {
      return !var1.getNodeName().equals("ellipse")
         ? var1.getNodeName().equals("path") && "arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
