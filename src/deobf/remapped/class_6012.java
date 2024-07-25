package remapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class class_6012 {
   private static byte[] field_30628 = new byte[256];
   private final class_8485 field_30622;
   public int field_30621;
   public String field_30626;
   public int[][][] field_30623;
   public int field_30625;
   public int field_30624;
   public Properties field_30627;

   public class_6012(class_8485 var1, Element var2) throws SlickException {
      this.field_30622 = var1;
      this.field_30626 = var2.getAttribute("name");
      this.field_30625 = Integer.parseInt(var2.getAttribute("width"));
      this.field_30624 = Integer.parseInt(var2.getAttribute("height"));
      this.field_30623 = new int[this.field_30625][this.field_30624][3];
      Element var5 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var5 != null) {
         NodeList var6 = var5.getElementsByTagName("property");
         if (var6 != null) {
            this.field_30627 = new Properties();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Element var8 = (Element)var6.item(var7);
               String var9 = var8.getAttribute("name");
               String var10 = var8.getAttribute("value");
               this.field_30627.setProperty(var9, var10);
            }
         }
      }

      Element var18 = (Element)var2.getElementsByTagName("data").item(0);
      String var19 = var18.getAttribute("encoding");
      String var20 = var18.getAttribute("compression");
      if (var19.equals("base64") && var20.equals("gzip")) {
         try {
            Node var21 = var18.getFirstChild();
            char[] var22 = var21.getNodeValue().trim().toCharArray();
            byte[] var11 = this.method_27448(var22);
            GZIPInputStream var12 = new GZIPInputStream(new ByteArrayInputStream(var11));

            for (int var13 = 0; var13 < this.field_30624; var13++) {
               for (int var14 = 0; var14 < this.field_30625; var14++) {
                  int var15 = 0;
                  var15 |= var12.read();
                  var15 |= var12.read() << 8;
                  var15 |= var12.read() << 16;
                  var15 |= var12.read() << 24;
                  if (var15 == 0) {
                     this.field_30623[var14][var13][0] = -1;
                     this.field_30623[var14][var13][1] = 0;
                     this.field_30623[var14][var13][2] = 0;
                  } else {
                     class_2280 var16 = var1.method_39106(var15);
                     if (var16 != null) {
                        this.field_30623[var14][var13][0] = var16.field_11392;
                        this.field_30623[var14][var13][1] = var15 - var16.field_11398;
                     }

                     this.field_30623[var14][var13][2] = var15;
                  }
               }
            }
         } catch (IOException var17) {
            class_2598.method_11785(var17);
            throw new class_1162("Unable to decode base 64 block");
         }
      } else {
         throw new class_1162("Unsupport tiled map type: " + var19 + "," + var20 + " (only gzip base64 supported)");
      }
   }

   public int method_27447(int var1, int var2) {
      return this.field_30623[var1][var2][2];
   }

   public void method_27446(int var1, int var2, int var3) {
      if (var3 != 0) {
         class_2280 var6 = this.field_30622.method_39106(var3);
         this.field_30623[var1][var2][0] = var6.field_11392;
         this.field_30623[var1][var2][1] = var3 - var6.field_11398;
         this.field_30623[var1][var2][2] = var3;
      } else {
         this.field_30623[var1][var2][0] = -1;
         this.field_30623[var1][var2][1] = 0;
         this.field_30623[var1][var2][2] = 0;
      }
   }

   public void method_27449(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      for (int var12 = 0; var12 < this.field_30622.method_39092(); var12++) {
         class_2280 var13 = null;

         for (int var14 = 0; var14 < var5; var14++) {
            if (var3 + var14 >= 0
               && var4 + var6 >= 0
               && var3 + var14 < this.field_30625
               && var4 + var6 < this.field_30624
               && this.field_30623[var3 + var14][var4 + var6][0] == var12) {
               if (var13 == null) {
                  var13 = this.field_30622.method_39098(var12);
                  var13.field_11404.method_36880();
               }

               int var15 = var13.method_10509(this.field_30623[var3 + var14][var4 + var6][1]);
               int var16 = var13.method_10512(this.field_30623[var3 + var14][var4 + var6][1]);
               int var17 = var13.field_11403 - var9;
               var13.field_11404.method_8426(var1 + var14 * var8, var2 + var6 * var9 - var17, var15, var16);
            }
         }

         if (var7) {
            if (var13 != null) {
               var13.field_11404.method_36878();
               var13 = null;
            }

            this.field_30622.method_39107(var6, var6 + var4, this.field_30621);
         }

         if (var13 != null) {
            var13.field_11404.method_36878();
         }
      }
   }

   private byte[] method_27448(char[] var1) {
      int var4 = var1.length;

      for (int var5 = 0; var5 < var1.length; var5++) {
         if (var1[var5] > 255 || field_30628[var1[var5]] < 0) {
            var4--;
         }
      }

      int var12 = var4 / 4 * 3;
      if (var4 % 4 == 3) {
         var12 += 2;
      }

      if (var4 % 4 == 2) {
         var12++;
      }

      byte[] var6 = new byte[var12];
      byte var7 = 0;
      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length; var10++) {
         byte var11 = var1[var10] <= 255 ? field_30628[var1[var10]] : -1;
         if (var11 >= 0) {
            var8 <<= 6;
            var7 += 6;
            var8 |= var11;
            if (var7 >= 8) {
               var7 -= 8;
               var6[var9++] = (byte)(var8 >> var7 & 0xFF);
            }
         }
      }

      if (var9 == var6.length) {
         return var6;
      } else {
         throw new RuntimeException("Data length appears to be wrong (wrote " + var9 + " should be " + var6.length + ")");
      }
   }

   static {
      for (int var4 = 0; var4 < 256; var4++) {
         field_30628[var4] = -1;
      }

      for (int var7 = 65; var7 <= 90; var7++) {
         field_30628[var7] = (byte)(var7 - 65);
      }

      for (int var8 = 97; var8 <= 122; var8++) {
         field_30628[var8] = (byte)(26 + var8 - 97);
      }

      for (int var9 = 48; var9 <= 57; var9++) {
         field_30628[var9] = (byte)(52 + var9 - 48);
      }

      field_30628[43] = 62;
      field_30628[47] = 63;
   }
}
