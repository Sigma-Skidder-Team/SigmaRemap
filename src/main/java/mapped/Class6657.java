package mapped;

import java.util.StringTokenizer;

import org.w3c.dom.Element;

public class Class6657 implements Class6650 {
   private static int method20306(Class2526 var0, Element var1, StringTokenizer var2) throws Class2453 {
      int var5 = 0;

      while (var2.hasMoreTokens()) {
         String var6 = var2.nextToken();
         if (!var6.equals("L")) {
            if (var6.equals("z")) {
               break;
            }

            if (!var6.equals("M")) {
               if (var6.equals("C")) {
                  return 0;
               }

               String var7 = var6;
               String var8 = var2.nextToken();

               try {
                  float var9 = Float.parseFloat(var7);
                  float var10 = Float.parseFloat(var8);
                  var0.method10642(var9, var10);
                  var5++;
               } catch (NumberFormatException var11) {
                  throw new Class2453(var1.getAttribute("id"), "Invalid token in points list", var11);
               }
            }
         }
      }

      return var5;
   }

   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      Class8412 var7 = Class8885.method32335(var2);
      var7 = new Class8412(var4, var7);
      float var11;
      float var12;
      float var13;
      float var14;
      if (!var2.getNodeName().equals("line")) {
         String var8 = var2.getAttribute("d");
         StringTokenizer var9 = new StringTokenizer(var8, ", ");
         Class2526 var10 = new Class2526();
         if (method20306(var10, var2, var9) != 2) {
            return;
         }

         var11 = var10.method10596(0)[0];
         var13 = var10.method10596(0)[1];
         var12 = var10.method10596(1)[0];
         var14 = var10.method10596(1)[1];
      } else {
         var11 = Float.parseFloat(var2.getAttribute("x1"));
         var12 = Float.parseFloat(var2.getAttribute("x2"));
         var13 = Float.parseFloat(var2.getAttribute("y1"));
         var14 = Float.parseFloat(var2.getAttribute("y2"));
      }

      float[] var17 = new float[]{var11, var13, var12, var14};
      float[] var18 = new float[4];
      var7.method29529(var17, 0, var18, 0, 2);
      Class2530 var19 = new Class2530(var18[0], var18[1], var18[2], var18[3]);
      Class6615 var15 = Class8885.method32331(var2);
      var15.method20114("x1", "" + var11);
      var15.method20114("x2", "" + var12);
      var15.method20114("y1", "" + var13);
      var15.method20114("y2", "" + var14);
      var3.method25476(new Class5967(2, var19, var15, var7));
   }

   @Override
   public boolean method20303(Element var1) {
      return !var1.getNodeName().equals("line")
         ? var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
