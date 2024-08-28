package mapped;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.w3c.dom.Element;

public class Class6656 implements Class6650 {
   private static Class2525 method20305(Element var0, StringTokenizer var1) throws Class2453 {
      boolean var4 = false;
      new ArrayList();
      boolean var6 = false;
      boolean var7 = false;
      Class2525 var8 = null;

      while (var1.hasMoreTokens()) {
         try {
            String var9 = var1.nextToken();
            if (var9.equals("L")) {
               float var10 = Float.parseFloat(var1.nextToken());
               float var11 = Float.parseFloat(var1.nextToken());
               var8.method10636(var10, var11);
            } else if (var9.equals("z")) {
               var8.method10637();
            } else if (var9.equals("M")) {
               if (!var6) {
                  var6 = true;
                  float var17 = Float.parseFloat(var1.nextToken());
                  float var20 = Float.parseFloat(var1.nextToken());
                  var8 = new Class2525(var17, var20);
               } else {
                  var7 = true;
                  float var18 = Float.parseFloat(var1.nextToken());
                  float var21 = Float.parseFloat(var1.nextToken());
                  var8.method10635(var18, var21);
               }
            } else if (var9.equals("C")) {
               var7 = true;
               float var19 = Float.parseFloat(var1.nextToken());
               float var22 = Float.parseFloat(var1.nextToken());
               float var12 = Float.parseFloat(var1.nextToken());
               float var13 = Float.parseFloat(var1.nextToken());
               float var14 = Float.parseFloat(var1.nextToken());
               float var15 = Float.parseFloat(var1.nextToken());
               var8.method10638(var14, var15, var19, var22, var12, var13);
            }
         } catch (NumberFormatException var16) {
            throw new Class2453(var0.getAttribute("id"), "Invalid token in points list", var16);
         }
      }

      return !var7 ? null : var8;
   }

   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      Class8412 var7 = Class8885.method32335(var2);
      var7 = new Class8412(var4, var7);
      String var8 = var2.getAttribute("points");
      if (var2.getNodeName().equals("path")) {
         var8 = var2.getAttribute("d");
      }

      StringTokenizer var9 = new StringTokenizer(var8, ", ");
      Class2525 var10 = method20305(var2, var9);
      Class6615 var11 = Class8885.method32331(var2);
      if (var10 != null) {
         Class2520 var12 = var10.method10577(var7);
         var3.method25476(new Class5967(4, var12, var11, var7));
      }
   }

   @Override
   public boolean method20303(Element var1) {
      return var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"));
   }
}
