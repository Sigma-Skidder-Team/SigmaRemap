package remapped;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_8485 {
   private static boolean field_43476;
   public int field_43471;
   public int field_43477;
   public int field_43469;
   public int field_43468;
   public String field_43480;
   public Properties field_43478;
   public ArrayList field_43466 = new ArrayList();
   public ArrayList field_43479 = new ArrayList();
   public ArrayList field_43470 = new ArrayList();
   public static final int field_43474 = 1;
   public static final int field_43475 = 2;
   public int field_43467;
   private boolean field_43473 = true;

   private static void method_39122(boolean var0) {
      field_43476 = var0;
   }

   public class_8485(String var1) throws SlickException {
      this(var1, true);
   }

   public class_8485(String var1, boolean var2) throws SlickException {
      this.field_43473 = var2;
      var1 = var1.replace('\\', '/');
      this.method_39111(class_8975.method_41153(var1), var1.substring(0, var1.lastIndexOf("/")));
   }

   public class_8485(String var1, String var2) throws SlickException {
      this.method_39111(class_8975.method_41153(var1), var2);
   }

   public class_8485(InputStream var1) throws SlickException {
      this.method_39111(var1, "");
   }

   public class_8485(InputStream var1, String var2) throws SlickException {
      this.method_39111(var1, var2);
   }

   public String method_39113() {
      return this.field_43480;
   }

   public int method_39112(String var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < this.field_43479.size(); var5++) {
         class_6012 var6 = (class_6012)this.field_43479.get(var5);
         if (var6.field_30626.equals(var1)) {
            return var5;
         }
      }

      return -1;
   }

   public class_8112 method_39090(int var1, int var2, int var3) {
      class_6012 var6 = (class_6012)this.field_43479.get(var3);
      int var7 = var6.field_30623[var1][var2][0];
      if (var7 >= 0 && var7 < this.field_43466.size()) {
         class_2280 var8 = (class_2280)this.field_43466.get(var7);
         int var9 = var8.method_10509(var6.field_30623[var1][var2][1]);
         int var10 = var8.method_10512(var6.field_30623[var1][var2][1]);
         return var8.field_11404.method_8424(var9, var10);
      } else {
         return null;
      }
   }

   public int method_39105() {
      return this.field_43471;
   }

   public int method_39110() {
      return this.field_43477;
   }

   public int method_39099() {
      return this.field_43468;
   }

   public int method_39097() {
      return this.field_43469;
   }

   public int method_39123(int var1, int var2, int var3) {
      class_6012 var6 = (class_6012)this.field_43479.get(var3);
      return var6.method_27447(var1, var2);
   }

   public void method_39108(int var1, int var2, int var3, int var4) {
      class_6012 var7 = (class_6012)this.field_43479.get(var3);
      var7.method_27446(var1, var2, var4);
   }

   public String method_39091(String var1, String var2) {
      return this.field_43478 != null ? this.field_43478.getProperty(var1, var2) : var2;
   }

   public String method_39089(int var1, String var2, String var3) {
      class_6012 var6 = (class_6012)this.field_43479.get(var1);
      return var6 != null && var6.field_30627 != null ? var6.field_30627.getProperty(var2, var3) : var3;
   }

   public String method_39095(int var1, String var2, String var3) {
      if (var1 != 0) {
         class_2280 var6 = this.method_39106(var1);
         Properties var7 = var6.method_10506(var1);
         return var7 != null ? var7.getProperty(var2, var3) : var3;
      } else {
         return var3;
      }
   }

   public void method_39116(int var1, int var2) {
      this.method_39120(var1, var2, 0, 0, this.field_43471, this.field_43477, false);
   }

   public void method_39117(int var1, int var2, int var3) {
      this.method_39119(var1, var2, 0, 0, this.method_39105(), this.method_39110(), var3, false);
   }

   public void method_39118(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method_39120(var1, var2, var3, var4, var5, var6, false);
   }

   public void method_39119(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      class_6012 var11 = (class_6012)this.field_43479.get(var7);
      switch (this.field_43467) {
         case 1:
            for (int var12 = 0; var12 < var6; var12++) {
               var11.method_27449(var1, var2, var3, var4, var5, var12, var8, this.field_43469, this.field_43468);
            }
            break;
         case 2:
            this.method_39104(var1, var2, var3, var4, var5, var6, var11, var8);
      }
   }

   public void method_39120(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      switch (this.field_43467) {
         case 1:
            for (int var10 = 0; var10 < var6; var10++) {
               for (int var11 = 0; var11 < this.field_43479.size(); var11++) {
                  class_6012 var12 = (class_6012)this.field_43479.get(var11);
                  var12.method_27449(var1, var2, var3, var4, var5, var10, var7, this.field_43469, this.field_43468);
               }
            }
            break;
         case 2:
            this.method_39104(var1, var2, var3, var4, var5, var6, null, var7);
      }
   }

   public void method_39104(int var1, int var2, int var3, int var4, int var5, int var6, class_6012 var7, boolean var8) {
      ArrayList var11 = this.field_43479;
      if (var7 != null) {
         var11 = new ArrayList();
         var11.add(var7);
      }

      int var12 = var5 * var6;
      int var13 = 0;
      boolean var14 = false;
      int var15 = var1;
      int var16 = var2;
      int var17 = 0;
      int var18 = 0;

      while (!var14) {
         int var19 = var17;
         int var20 = var18;
         int var21 = var15;
         int var22 = 0;
         if (var6 <= var5) {
            var22 = var18 >= var6 - 1 ? (var5 - var17 >= var6 ? var6 - 1 : var5 - var17 - 1) : var18;
         } else {
            var22 = var18 >= var5 - 1 ? (var5 - var17 >= var6 ? var5 - 1 : var5 - var17 - 1) : var18;
         }

         for (int var23 = 0; var23 <= var22; var23++) {
            for (int var24 = 0; var24 < var11.size(); var24++) {
               class_6012 var25 = (class_6012)var11.get(var24);
               var25.method_27449(var21, var16, var19, var20, 1, 0, var8, this.field_43469, this.field_43468);
            }

            var21 += this.field_43469;
            var13++;
            var19++;
            var20--;
         }

         if (var18 >= var6 - 1) {
            var17++;
            var15 += this.field_43469 / 2;
            var16 += this.field_43468 / 2;
         } else {
            var18++;
            var15 -= this.field_43469 / 2;
            var16 += this.field_43468 / 2;
         }

         if (var13 >= var12) {
            var14 = true;
         }
      }
   }

   public int method_39115() {
      return this.field_43479.size();
   }

   private int method_39096(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var5) {
         return 0;
      }
   }

   private void method_39111(InputStream var1, String var2) throws SlickException {
      this.field_43480 = var2;

      try {
         DocumentBuilderFactory var5 = DocumentBuilderFactory.newInstance();
         var5.setValidating(false);
         DocumentBuilder var6 = var5.newDocumentBuilder();
         var6.setEntityResolver(new class_2474(this));
         Document var7 = var6.parse(var1);
         Element var8 = var7.getDocumentElement();
         if (var8.getAttribute("orientation").equals("orthogonal")) {
            this.field_43467 = 1;
         } else {
            this.field_43467 = 2;
         }

         this.field_43471 = this.method_39096(var8.getAttribute("width"));
         this.field_43477 = this.method_39096(var8.getAttribute("height"));
         this.field_43469 = this.method_39096(var8.getAttribute("tilewidth"));
         this.field_43468 = this.method_39096(var8.getAttribute("tileheight"));
         Element var9 = (Element)var8.getElementsByTagName("properties").item(0);
         if (var9 != null) {
            NodeList var10 = var9.getElementsByTagName("property");
            if (var10 != null) {
               this.field_43478 = new Properties();

               for (int var11 = 0; var11 < var10.getLength(); var11++) {
                  Element var12 = (Element)var10.item(var11);
                  String var13 = var12.getAttribute("name");
                  String var14 = var12.getAttribute("value");
                  this.field_43478.setProperty(var13, var14);
               }
            }
         }

         if (this.field_43473) {
            class_2280 var16 = null;
            class_2280 var19 = null;
            NodeList var22 = var8.getElementsByTagName("tileset");

            for (int var25 = 0; var25 < var22.getLength(); var25++) {
               Element var28 = (Element)var22.item(var25);
               var16 = new class_2280(this, var28, !field_43476);
               var16.field_11392 = var25;
               if (var19 != null) {
                  var19.method_10507(var16.field_11398 - 1);
               }

               var19 = var16;
               this.field_43466.add(var16);
            }
         }

         NodeList var18 = var8.getElementsByTagName("layer");

         for (int var20 = 0; var20 < var18.getLength(); var20++) {
            Element var23 = (Element)var18.item(var20);
            class_6012 var26 = new class_6012(this, var23);
            var26.field_30621 = var20;
            this.field_43479.add(var26);
         }

         NodeList var21 = var8.getElementsByTagName("objectgroup");

         for (int var24 = 0; var24 < var21.getLength(); var24++) {
            Element var27 = (Element)var21.item(var24);
            class_5078 var29 = new class_5078(this, var27);
            var29.field_26226 = var24;
            this.field_43470.add(var29);
         }
      } catch (Exception var15) {
         class_2598.method_11785(var15);
         throw new class_1162("Failed to parse tilemap", var15);
      }
   }

   public int method_39092() {
      return this.field_43466.size();
   }

   public class_2280 method_39098(int var1) {
      return (class_2280)this.field_43466.get(var1);
   }

   public class_2280 method_39102(int var1) {
      for (int var4 = 0; var4 < this.field_43466.size(); var4++) {
         class_2280 var5 = (class_2280)this.field_43466.get(var4);
         if (var5.method_10508(var1)) {
            return var5;
         }
      }

      return null;
   }

   public class_2280 method_39106(int var1) {
      for (int var4 = 0; var4 < this.field_43466.size(); var4++) {
         class_2280 var5 = (class_2280)this.field_43466.get(var4);
         if (var5.method_10508(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method_39107(int var1, int var2, int var3) {
   }

   public int method_39087() {
      return this.field_43470.size();
   }

   public int method_39109(int var1) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var4 = (class_5078)this.field_43470.get(var1);
         return var4.field_26230.size();
      } else {
         return -1;
      }
   }

   public String method_39086(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12580;
         }
      }

      return null;
   }

   public String method_39088(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12578;
         }
      }

      return null;
   }

   public int method_39103(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12584;
         }
      }

      return -1;
   }

   public int method_39100(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12582;
         }
      }

      return -1;
   }

   public int method_39101(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12587;
         }
      }

      return -1;
   }

   public int method_39093(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            return var6.field_12583;
         }
      }

      return -1;
   }

   public String method_39114(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var5 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var5.field_26230.size()) {
            class_2537 var6 = (class_2537)var5.field_26230.get(var2);
            if (var6 != null) {
               return class_2537.method_11565(var6);
            }

            return null;
         }
      }

      return null;
   }

   public String method_39121(int var1, int var2, String var3, String var4) {
      if (var1 >= 0 && var1 < this.field_43470.size()) {
         class_5078 var7 = (class_5078)this.field_43470.get(var1);
         if (var2 >= 0 && var2 < var7.field_26230.size()) {
            class_2537 var8 = (class_2537)var7.field_26230.get(var2);
            if (var8 != null) {
               if (var8.field_12579 != null) {
                  return var8.field_12579.getProperty(var3, var4);
               }

               return var4;
            }

            return var4;
         }
      }

      return var4;
   }
}
