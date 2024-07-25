package remapped;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_3384 implements class_4027 {
   private static final class_1299 field_16672 = class_3980.method_18363();
   private class_4035[] field_16675 = new class_4035[256];
   private Map field_16679 = new HashMap();
   private boolean field_16678;
   private int field_16682 = 0;
   private int field_16677 = 0;
   public class_8343 field_16680;
   private int field_16676 = 512;
   private int field_16671 = 512;
   private Font field_16683;
   private FontMetrics field_16673;
   private final int field_16674;

   public class_3384(Font var1, boolean var2, char[] var3, int var4) {
      class_5750.method_26030();
      this.field_16683 = var1;
      this.field_16682 = var1.getSize();
      this.field_16678 = var2;
      this.field_16674 = var4;
      if (var4 > 0) {
         this.field_16676 = 1024;
         this.field_16671 = 1024;
      }

      this.method_15649(var3);
   }

   public class_3384(Font var1, boolean var2, char[] var3) {
      this(var1, var2, var3, 0);
   }

   public class_3384(Font var1, boolean var2) {
      this(var1, var2, null);
   }

   public class_3384(Font var1, int var2) {
      this(var1, true, null, var2);
   }

   private BufferedImage method_15652(char var1) {
      BufferedImage var4 = new BufferedImage(1, 1, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      if (this.field_16678) {
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      var5.setFont(this.field_16683);
      this.field_16673 = var5.getFontMetrics();
      int var6 = this.field_16673.charWidth(var1);
      if (var6 <= 0) {
         var6 = 1;
      }

      int var7 = this.field_16673.getHeight();
      if (var7 <= 0) {
         var7 = this.field_16682;
      }

      BufferedImage var8 = new BufferedImage(var6 + this.field_16674 * 2, var7 + this.field_16674 * 2, 2);
      Graphics2D var9 = (Graphics2D)var8.getGraphics();
      if (this.field_16678) {
         var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      var9.setFont(this.field_16683);
      var9.setColor(Color.WHITE);
      int var10 = this.field_16674;
      int var11 = this.field_16674;
      var9.drawString(String.valueOf(var1), var10, var11 + this.field_16673.getAscent());
      return this.field_16674 <= 0 ? var8 : class_7849.method_35500(var8, this.field_16674);
   }

   private int method_15651(char var1) {
      BufferedImage var4 = new BufferedImage(1, 1, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      if (this.field_16678) {
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      var5.setFont(this.field_16683);
      this.field_16673 = var5.getFontMetrics();
      int var6 = this.field_16673.charWidth(var1);
      if (var6 <= 0) {
         var6 = 1;
      }

      return var6;
   }

   private void method_15649(char[] var1) {
      if (var1 != null && var1.length > 0) {
         this.field_16676 *= 2;
      }

      try {
         BufferedImage var4 = this.method_15652('\u0000');
         if (var4.getHeight() > 60) {
            this.field_16676 *= 2;
            this.field_16671 *= 2;
         }

         BufferedImage var5 = new BufferedImage(this.field_16676, this.field_16671, 2);
         Graphics2D var6 = (Graphics2D)var5.getGraphics();
         var6.setColor(new Color(255, 255, 255, 1));
         var6.fillRect(0, 0, this.field_16676, this.field_16671);
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = var1 != null ? var1.length : 0;

         for (int var11 = 0; var11 < 256 + var10; var11++) {
            char var12 = var11 < 256 ? (char)var11 : var1[var11 - 256];
            BufferedImage var13 = this.method_15652(var12);
            class_4035 var14 = new class_4035(this);
            var14.field_19597 = var13.getWidth();
            var14.field_19598 = var13.getHeight();
            if (this.field_16674 > 0) {
               var14.field_19595 = this.method_15651(var12);
            } else {
               var14.field_19595 = var14.field_19597;
            }

            if (var8 + var14.field_19597 >= this.field_16676) {
               var8 = 0;
               var9 += var7;
               var7 = 0;
            }

            var14.field_19596 = var8;
            var14.field_19593 = var9;
            if (var14.field_19598 > this.field_16677) {
               this.field_16677 = var14.field_19598;
            }

            if (var14.field_19598 > var7) {
               var7 = var14.field_19598 + 1;
            }

            var6.drawImage(var13, var8, var9, null);
            var8 += var14.field_19597 + 1;
            if (var11 < 256) {
               this.field_16675[var11] = var14;
            } else {
               this.field_16679.put(new Character(var12), var14);
            }

            Object var16 = null;
         }

         this.field_16680 = class_6568.method_30015(this.field_16683.toString(), var5);
      } catch (IOException var15) {
         System.err.println("Failed to create font.");
         var15.printStackTrace();
      }
   }

   private void method_15653(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var11 = var3 - var1;
      float var12 = var4 - var2;
      float var13 = var5 / (float)this.field_16676;
      float var14 = var6 / (float)this.field_16671;
      float var15 = var7 - var5;
      float var16 = var8 - var6;
      float var17 = var15 / (float)this.field_16676;
      float var18 = var16 / (float)this.field_16671;
      field_16672.method_5924(var13, var14);
      field_16672.method_5919(var1, var2);
      field_16672.method_5924(var13, var14 + var18);
      field_16672.method_5919(var1, var2 + var12);
      field_16672.method_5924(var13 + var17, var14 + var18);
      field_16672.method_5919(var1 + var11, var2 + var12);
      field_16672.method_5924(var13 + var17, var14);
      field_16672.method_5919(var1 + var11, var2);
   }

   @Override
   public int method_18547(String var1) {
      int var4 = 0;
      class_4035 var5 = null;
      char var6 = '\u0000';
      if (var1 != null) {
         for (int var7 = 0; var7 < var1.length(); var7++) {
            var6 = var1.charAt(var7);
            if (var6 >= 256) {
               var5 = (class_4035)this.field_16679.get(new Character((char)var6));
            } else {
               var5 = this.field_16675[var6];
            }

            if (var5 != null) {
               var4 += var5.field_19595;
            }
         }

         return var4;
      } else {
         return 0;
      }
   }

   public int method_15654() {
      return this.field_16677;
   }

   @Override
   public int method_18548(String var1) {
      return this.field_16677;
   }

   @Override
   public int method_18543() {
      return this.field_16677;
   }

   @Override
   public void method_18545(float var1, float var2, String var3, class_8709 var4) {
      this.method_18546(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void method_18546(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      var4.method_40021();
      this.field_16680.method_38419();
      class_4035 var9 = null;
      if (this.field_16674 > 0) {
         var2 -= (float)(this.field_16674 / 2 - 1);
         var1 -= (float)(this.field_16674 - 1);
      }

      field_16672.method_5934(7);
      int var10 = 0;

      for (int var11 = 0; var11 < var3.length(); var11++) {
         char var12 = var3.charAt(var11);
         if (var12 >= 256) {
            var9 = (class_4035)this.field_16679.get(new Character((char)var12));
         } else {
            var9 = this.field_16675[var12];
         }

         if (var9 != null) {
            if (var11 >= var5 || var11 <= var6) {
               this.method_15653(
                  var1 + (float)var10,
                  var2,
                  var1 + (float)var10 + (float)var9.field_19597,
                  var2 + (float)var9.field_19598,
                  (float)var9.field_19596,
                  (float)var9.field_19593,
                  (float)(var9.field_19596 + var9.field_19597),
                  (float)(var9.field_19593 + var9.field_19598)
               );
            }

            var10 += var9.field_19595;
         }
      }

      field_16672.method_5940();
   }

   @Override
   public void method_18544(float var1, float var2, String var3) {
      this.method_18545(var1, var2, var3, class_8709.field_44646);
   }
}
