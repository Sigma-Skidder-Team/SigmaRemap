package mapped;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.w3c.dom.Element;

public class Class6658 implements Class6650 {
   private static int method20307(Class2526 var0, Element var1, StringTokenizer var2) throws Class2453 {
      int var5 = 0;
      new ArrayList();
      boolean var7 = false;
      boolean var8 = false;

      while (var2.hasMoreTokens()) {
         String var9 = var2.nextToken();
         if (!var9.equals("L")) {
            if (var9.equals("z")) {
               var8 = true;
               break;
            }

            if (var9.equals("M")) {
               if (var7) {
                  return 0;
               }

               var7 = true;
            } else {
               if (var9.equals("C")) {
                  return 0;
               }

               String var10 = var9;
               String var11 = var2.nextToken();

               try {
                  float var12 = Float.parseFloat(var10);
                  float var13 = Float.parseFloat(var11);
                  var0.method10642(var12, var13);
                  var5++;
               } catch (NumberFormatException var14) {
                  throw new Class2453(var1.getAttribute("id"), "Invalid token in points list", var14);
               }
            }
         }
      }

      var0.method10643(var8);
      return var5;
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
      Class2526 var10 = new Class2526();
      int var11 = method20307(var10, var2, var9);
      Class6615 var12 = Class8885.method32331(var2);
      if (var11 > 3) {
         Class2520 var13 = var10.method10577(var7);
         var3.method25476(new Class5967(5, var13, var12, var7));
      }
   }

   @Override
   public boolean method20303(Element var1) {
      return !var1.getNodeName().equals("polygon")
         ? var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
