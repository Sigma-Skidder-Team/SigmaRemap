package mapped;


import org.w3c.dom.Element;

public class Class6651 implements Class6650 {
   @Override
   public boolean method20303(Element var1) {
      return var1.getNodeName().equals("use");
   }

   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      String var7 = var2.getAttributeNS("http://www.w3.org/1999/xlink", "href");
      String var8 = Class8885.method32338(var7);
      Class5967 var9 = var3.method25475(var8);
      if (var9 != null) {
         Class8412 var10 = Class8885.method32335(var2);
         Class8412 var11 = var10.method29530(var9.method18493());
         Class6615 var12 = Class8885.method32331(var2);
         Class2520 var13 = var9.method18495().method10577(var11);
         var12.method20114("fill", var9.method18496().method20117("fill"));
         var12.method20114("stroke", var9.method18496().method20117("stroke"));
         var12.method20114("opacity", var9.method18496().method20117("opacity"));
         var12.method20114("stroke-width", var9.method18496().method20117("stroke-width"));
         Class5967 var14 = new Class5967(var9.method18494(), var13, var12, var11);
         var3.method25476(var14);
      } else {
         throw new Class2453(var2, "Unable to locate referenced element: " + var8);
      }
   }
}
