package mapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Class8818 {
   private static byte[] field39671 = new byte[256];
   private final Class9466 field39672;
   public int field39673;
   public String field39674;
   public int[][][] field39675;
   public int field39676;
   public int field39677;
   public Properties field39678;

   public Class8818(Class9466 var1, Element var2) throws Class2451 {
      this.field39672 = var1;
      this.field39674 = var2.getAttribute("name");
      this.field39676 = Integer.parseInt(var2.getAttribute("width"));
      this.field39677 = Integer.parseInt(var2.getAttribute("height"));
      this.field39675 = new int[this.field39676][this.field39677][3];
      Element var5 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var5 != null) {
         NodeList var6 = var5.getElementsByTagName("property");
         if (var6 != null) {
            this.field39678 = new Properties();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Element var8 = (Element)var6.item(var7);
               String var9 = var8.getAttribute("name");
               String var10 = var8.getAttribute("value");
               this.field39678.setProperty(var9, var10);
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
            byte[] var11 = this.method31847(var22);
            GZIPInputStream var12 = new GZIPInputStream(new ByteArrayInputStream(var11));

            for (int var13 = 0; var13 < this.field39677; var13++) {
               for (int var14 = 0; var14 < this.field39676; var14++) {
                  int var15 = 0;
                  var15 |= var12.read();
                  var15 |= var12.read() << 8;
                  var15 |= var12.read() << 16;
                  var15 |= var12.read() << 24;
                  if (var15 == 0) {
                     this.field39675[var14][var13][0] = -1;
                     this.field39675[var14][var13][1] = 0;
                     this.field39675[var14][var13][2] = 0;
                  } else {
                     Class7590 var16 = var1.method36486(var15);
                     if (var16 != null) {
                        this.field39675[var14][var13][0] = var16.field32578;
                        this.field39675[var14][var13][1] = var15 - var16.field32580;
                     }

                     this.field39675[var14][var13][2] = var15;
                  }
               }
            }
         } catch (IOException var17) {
            Log.method25661(var17);
            throw new Class2451("Unable to decode base 64 block");
         }
      } else {
         throw new Class2451("Unsupport tiled map type: " + var19 + "," + var20 + " (only gzip base64 supported)");
      }
   }

   public int method31844(int var1, int var2) {
      return this.field39675[var1][var2][2];
   }

   public void method31845(int var1, int var2, int var3) {
      if (var3 != 0) {
         Class7590 var6 = this.field39672.method36486(var3);
         this.field39675[var1][var2][0] = var6.field32578;
         this.field39675[var1][var2][1] = var3 - var6.field32580;
         this.field39675[var1][var2][2] = var3;
      } else {
         this.field39675[var1][var2][0] = -1;
         this.field39675[var1][var2][1] = 0;
         this.field39675[var1][var2][2] = 0;
      }
   }

   public void method31846(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      for (int var12 = 0; var12 < this.field39672.method36483(); var12++) {
         Class7590 var13 = null;

         for (int var14 = 0; var14 < var5; var14++) {
            if (var3 + var14 >= 0
               && var4 + var6 >= 0
               && var3 + var14 < this.field39676
               && var4 + var6 < this.field39677
               && this.field39675[var3 + var14][var4 + var6][0] == var12) {
               if (var13 == null) {
                  var13 = this.field39672.method36484(var12);
                  var13.field32584.method23509();
               }

               int var15 = var13.method24854(this.field39675[var3 + var14][var4 + var6][1]);
               int var16 = var13.method24855(this.field39675[var3 + var14][var4 + var6][1]);
               int var17 = var13.field32583 - var9;
               var13.field32584.method23507(var1 + var14 * var8, var2 + var6 * var9 - var17, var15, var16);
            }
         }

         if (var7) {
            if (var13 != null) {
               var13.field32584.method23508();
               var13 = null;
            }

            this.field39672.method36487(var6, var6 + var4, this.field39673);
         }

         if (var13 != null) {
            var13.field32584.method23508();
         }
      }
   }

   private byte[] method31847(char[] var1) {
      int var4 = var1.length;

      for (int var5 = 0; var5 < var1.length; var5++) {
         if (var1[var5] > 255 || field39671[var1[var5]] < 0) {
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
         byte var11 = var1[var10] <= 255 ? field39671[var1[var10]] : -1;
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
         field39671[var4] = -1;
      }

      for (int var7 = 65; var7 <= 90; var7++) {
         field39671[var7] = (byte)(var7 - 65);
      }

      for (int var8 = 97; var8 <= 122; var8++) {
         field39671[var8] = (byte)(26 + var8 - 97);
      }

      for (int var9 = 48; var9 <= 57; var9++) {
         field39671[var9] = (byte)(52 + var9 - 48);
      }

      field39671[43] = 62;
      field39671[47] = 63;
   }
}
