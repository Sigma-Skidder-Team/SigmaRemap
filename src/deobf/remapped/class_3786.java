package remapped;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.newdawn.slick.SlickException;

public class class_3786 implements class_4027 {
   private static final int field_18502 = 200;
   private static final int field_18490 = 1114111;
   private static final int field_18488 = 512;
   private static final int field_18482 = 2175;
   private static final class_1299 field_18481 = class_3980.method_18363();
   private static final class_5733 field_18486 = new class_5733();
   private static final Comparator field_18489 = new class_7102();
   private Font field_18479;
   private String field_18497;
   private int field_18492;
   private int field_18494;
   private int field_18472;
   private int field_18484;
   private final class_6060[][] field_18475 = new class_6060[2175][];
   private final List field_18473 = new ArrayList();
   private final List field_18496 = new ArrayList(256);
   private final List field_18495 = new ArrayList();
   private int field_18478;
   private int field_18491;
   private int field_18474;
   private int field_18499;
   private int field_18476;
   private int field_18498;
   private class_6060 field_18485;
   private int field_18501 = 512;
   private int field_18480 = 512;
   private boolean field_18483 = true;
   private int field_18500 = -1;
   private int field_18477;
   private class_5733 field_18493;
   private final LinkedHashMap field_18503 = new class_3126(this, 200, 1.0F, true);

   private static Font method_17552(String var0) throws SlickException {
      try {
         return Font.createFont(0, class_8975.method_41153(var0));
      } catch (FontFormatException var4) {
         throw new class_1162("Invalid font: " + var0, var4);
      } catch (IOException var5) {
         throw new class_1162("Error reading font: " + var0, var5);
      }
   }

   public class_3786(String var1, String var2) throws SlickException {
      this(var1, new class_4518(var2));
   }

   public class_3786(String var1, class_4518 var2) throws SlickException {
      this.field_18497 = var1;
      Font var5 = method_17552(var1);
      this.method_17563(var5, var2.method_21006(), var2.method_21000(), var2.method_20989());
      this.method_17586(var2);
   }

   public class_3786(String var1, int var2, boolean var3, boolean var4) throws SlickException {
      this.field_18497 = var1;
      this.method_17563(method_17552(var1), var2, var3, var4);
   }

   public class_3786(Font var1, String var2) throws SlickException {
      this(var1, new class_4518(var2));
   }

   public class_3786(Font var1, class_4518 var2) {
      this.method_17563(var1, var2.method_21006(), var2.method_21000(), var2.method_20989());
      this.method_17586(var2);
   }

   public class_3786(Font var1) {
      this.method_17563(var1, var1.getSize(), var1.isBold(), var1.isItalic());
   }

   public class_3786(Font var1, int var2, boolean var3, boolean var4) {
      this.method_17563(var1, var2, var3, var4);
   }

   private void method_17563(Font var1, int var2, boolean var3, boolean var4) {
      Map var7 = var1.getAttributes();
      var7.put(TextAttribute.SIZE, new Float((float)var2));
      var7.put(TextAttribute.WEIGHT, var3 ? TextAttribute.WEIGHT_BOLD : TextAttribute.WEIGHT_REGULAR);
      var7.put(TextAttribute.POSTURE, var4 ? TextAttribute.POSTURE_OBLIQUE : TextAttribute.POSTURE_REGULAR);

      try {
         var7.put(TextAttribute.class.getDeclaredField("KERNING").get(null), TextAttribute.class.getDeclaredField("KERNING_ON").get(null));
      } catch (Exception var11) {
      }

      this.field_18479 = var1.deriveFont(var7);
      FontMetrics var8 = class_1701.method_7637().getFontMetrics(this.field_18479);
      this.field_18492 = var8.getAscent();
      this.field_18494 = var8.getDescent();
      this.field_18472 = var8.getLeading();
      char[] var9 = " ".toCharArray();
      GlyphVector var10 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var9, 0, var9.length, 0);
      this.field_18484 = var10.getGlyphLogicalBounds(0).getBounds().width;
   }

   private void method_17586(class_4518 var1) {
      this.field_18478 = var1.method_20994();
      this.field_18491 = var1.method_21003();
      this.field_18474 = var1.method_21012();
      this.field_18499 = var1.method_20993();
      this.field_18476 = var1.method_20999();
      this.field_18498 = var1.method_21013();
      this.field_18501 = var1.method_21004();
      this.field_18480 = var1.method_21005();
      this.field_18495.addAll(var1.method_21007());
   }

   public void method_17566(int var1, int var2) {
      for (int var5 = var1; var5 <= var2; var5++) {
         this.method_17567(new String(Character.toChars(var5)));
      }
   }

   public void method_17567(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null.");
      } else {
         char[] var4 = var1.toCharArray();
         GlyphVector var5 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var4, 0, var4.length, 0);
         int var6 = 0;

         for (int var7 = var5.getNumGlyphs(); var6 < var7; var6++) {
            int var8 = var1.codePointAt(var5.getGlyphCharIndex(var6));
            Rectangle var9 = this.method_17571(var5, var6, var8);
            this.method_17584(var5.getGlyphCode(var6), var8, var9, var5, var6);
         }
      }
   }

   public void method_17579() {
      this.method_17566(32, 255);
   }

   public void method_17583() {
      this.method_17566(32, 128);
   }

   public boolean method_17590() throws SlickException {
      return this.method_17591(-1);
   }

   public boolean method_17591(int var1) throws SlickException {
      if (this.field_18496.isEmpty()) {
         return false;
      } else if (this.field_18495.isEmpty()) {
         throw new IllegalStateException("The UnicodeFont must have at least one effect before any glyphs can be loaded.");
      } else {
         Iterator var4 = this.field_18496.iterator();

         while (var4.hasNext()) {
            class_6060 var5 = (class_6060)var4.next();
            int var6 = var5.method_27713();
            if (var5.method_27708() == 0 || var6 == 32) {
               var4.remove();
            } else if (var5.method_27711()) {
               if (this.field_18485 == null) {
                  this.field_18485 = var5;
               } else if (var5 != this.field_18485) {
                  var4.remove();
               }
            }
         }

         Collections.sort(this.field_18496, field_18489);

         for (class_1701 var9 : this.field_18473) {
            var1 -= var9.method_7633(this.field_18496, var1);
            if (var1 == 0 || this.field_18496.isEmpty()) {
               return true;
            }
         }

         while (!this.field_18496.isEmpty()) {
            class_1701 var8 = new class_1701(this, this.field_18501, this.field_18480);
            this.field_18473.add(var8);
            var1 -= var8.method_7633(this.field_18496, var1);
            if (var1 == 0) {
               return true;
            }
         }

         return true;
      }
   }

   public void method_17550() {
      for (int var3 = 0; var3 < 2175; var3++) {
         this.field_18475[var3] = null;
      }

      for (class_1701 var4 : this.field_18473) {
         try {
            var4.method_7636().method_36857();
         } catch (class_1162 var6) {
         }
      }

      this.field_18473.clear();
      if (this.field_18500 != -1) {
         field_18481.method_5907(this.field_18500, this.field_18503.size());
         this.field_18500 = -1;
      }

      this.field_18496.clear();
      this.field_18485 = null;
   }

   public void method_17570() {
      this.method_17550();
   }

   public class_5733 method_17580(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      if (var3 == null) {
         throw new IllegalArgumentException("text cannot be null.");
      } else if (var3.length() == 0) {
         return field_18486;
      } else if (var4 == null) {
         throw new IllegalArgumentException("color cannot be null.");
      } else {
         var1 -= (float)this.field_18491;
         var2 -= (float)this.field_18478;
         String var9 = var3.substring(var5, var6);
         var4.method_40021();
         class_9162.method_42217();
         class_5733 var10 = null;
         if (this.field_18483 && this.field_18496.isEmpty()) {
            if (this.field_18500 == -1) {
               this.field_18500 = field_18481.method_5915(200);
               if (this.field_18500 == 0) {
                  this.field_18500 = -1;
                  this.field_18483 = false;
                  return new class_5733();
               }
            }

            var10 = (class_5733)this.field_18503.get(var9);
            if (var10 == null) {
               if (var10 == null) {
                  var10 = new class_5733();
                  int var11 = this.field_18503.size();
                  this.field_18503.put(var9, var10);
                  if (var11 >= 200) {
                     var10.field_28966 = this.field_18477;
                  } else {
                     var10.field_28966 = this.field_18500 + var11;
                  }
               }
            } else {
               if (!var10.field_28969) {
                  field_18481.method_5902(var1, var2, 0.0F);
                  field_18481.method_5936(var10.field_28966);
                  field_18481.method_5902(-var1, -var2, 0.0F);
                  return var10;
               }

               var10.field_28969 = false;
            }

            this.field_18503.put(var9, var10);
         }

         field_18481.method_5902(var1, var2, 0.0F);
         if (var10 != null) {
            field_18481.method_5928(var10.field_28966, 4865);
         }

         char[] var30 = var3.substring(0, var6).toCharArray();
         GlyphVector var12 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var30, 0, var30.length, 0);
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = this.field_18492;
         boolean var18 = false;
         class_8343 var19 = null;
         int var20 = 0;

         for (int var21 = var12.getNumGlyphs(); var20 < var21; var20++) {
            int var22 = var12.getGlyphCharIndex(var20);
            if (var22 >= var5) {
               if (var22 > var6) {
                  break;
               }

               int var23 = var3.codePointAt(var22);
               Rectangle var24 = this.method_17571(var12, var20, var23);
               class_6060 var25 = this.method_17584(var12.getGlyphCode(var20), var23, var24, var12, var20);
               if (var18 && var23 != 10) {
                  var16 = -var24.x;
                  var18 = false;
               }

               class_8112 var26 = var25.method_27716();
               if (var26 == null && this.field_18485 != null && var25.method_27711()) {
                  var26 = this.field_18485.method_27716();
               }

               if (var26 != null) {
                  class_8343 var27 = var26.method_36897();
                  if (var19 != null && var19 != var27) {
                     field_18481.method_5940();
                     var19 = null;
                  }

                  if (var19 == null) {
                     var27.method_38419();
                     field_18481.method_5934(7);
                     var19 = var27;
                  }

                  var26.method_36903((float)(var24.x + var16), (float)(var24.y + var17), (float)var26.method_36877(), (float)var26.method_36856());
               }

               if (var20 >= 0) {
                  var16 += this.field_18499 + this.field_18491 + this.field_18476;
               }

               var13 = Math.max(var13, var24.x + var16 + var24.width);
               var14 = Math.max(var14, this.field_18492 + var24.y + var24.height);
               if (var23 == 10) {
                  var18 = true;
                  var17 += this.method_18543();
                  var15++;
                  var14 = 0;
               }
            }
         }

         if (var19 != null) {
            field_18481.method_5940();
         }

         if (var10 != null) {
            field_18481.method_5930();
            if (!this.field_18496.isEmpty()) {
               var10.field_28969 = true;
            }
         }

         field_18481.method_5902(-var1, -var2, 0.0F);
         if (var10 == null) {
            var10 = new class_5733();
         }

         var10.field_28967 = (short)var13;
         var10.field_28965 = (short)(var15 * this.method_18543() + var14);
         return var10;
      }
   }

   @Override
   public void method_18546(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      this.method_17580(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_18544(float var1, float var2, String var3) {
      this.method_18545(var1, var2, var3, class_8709.field_44646);
   }

   @Override
   public void method_18545(float var1, float var2, String var3, class_8709 var4) {
      this.method_18546(var1, var2, var3, var4, 0, var3.length());
   }

   private class_6060 method_17584(int var1, int var2, Rectangle var3, GlyphVector var4, int var5) {
      if (var1 >= 0 && var1 < 1114111) {
         int var8 = var1 / 512;
         int var9 = var1 & 511;
         class_6060 var10 = null;
         class_6060[] var11 = this.field_18475[var8];
         if (var11 == null) {
            var11 = this.field_18475[var8] = new class_6060[512];
         } else {
            var10 = var11[var9];
            if (var10 != null) {
               return var10;
            }
         }

         var10 = var11[var9] = new class_6060(var2, var3, var4, var5, this);
         this.field_18496.add(var10);
         return var10;
      } else {
         return new class_3699(this, var2, var3, var4, var5, this);
      }
   }

   private Rectangle method_17571(GlyphVector var1, int var2, int var3) {
      Rectangle var6 = var1.getGlyphPixelBounds(var2, class_1701.field_8796, 0.0F, 0.0F);
      if (var3 == 32) {
         var6.width = this.field_18484;
      }

      return var6;
   }

   public int method_17575() {
      return this.field_18484;
   }

   @Override
   public int method_18547(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (this.field_18483) {
               class_5733 var4 = (class_5733)this.field_18503.get(var1);
               if (var4 != null) {
                  return var4.field_28967;
               }
            }

            char[] var14 = var1.toCharArray();
            GlyphVector var5 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var14, 0, var14.length, 0);
            int var6 = 0;
            int var7 = 0;
            boolean var8 = false;
            int var9 = 0;

            for (int var10 = var5.getNumGlyphs(); var9 < var10; var9++) {
               int var11 = var5.getGlyphCharIndex(var9);
               int var12 = var1.codePointAt(var11);
               Rectangle var13 = this.method_17571(var5, var9, var12);
               if (var8 && var12 != 10) {
                  var7 = -var13.x;
               }

               if (var9 > 0) {
                  var7 += this.field_18491 + this.field_18499 + this.field_18476;
               }

               var6 = Math.max(var6, var13.x + var7 + var13.width);
               if (var12 == 10) {
                  var8 = true;
               }
            }

            return var6;
         } else {
            return 0;
         }
      } else {
         throw new IllegalArgumentException("text cannot be null.");
      }
   }

   @Override
   public int method_18548(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (this.field_18483) {
               class_5733 var4 = (class_5733)this.field_18503.get(var1);
               if (var4 != null) {
                  return var4.field_28965;
               }
            }

            char[] var13 = var1.toCharArray();
            GlyphVector var5 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var13, 0, var13.length, 0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (int var9 = var5.getNumGlyphs(); var8 < var9; var8++) {
               int var10 = var5.getGlyphCharIndex(var8);
               int var11 = var1.codePointAt(var10);
               if (var11 != 32) {
                  Rectangle var12 = this.method_17571(var5, var8, var11);
                  var7 = Math.max(var7, this.field_18492 + var12.y + var12.height);
                  if (var11 == 10) {
                     var6++;
                     var7 = 0;
                  }
               }
            }

            return var6 * this.method_18543() + var7;
         } else {
            return 0;
         }
      } else {
         throw new IllegalArgumentException("text cannot be null.");
      }
   }

   public int method_17561(String var1) {
      if (var1 != null) {
         class_5733 var4 = null;
         if (this.field_18483) {
            var4 = (class_5733)this.field_18503.get(var1);
            if (var4 != null && var4.field_28970 != null) {
               return var4.field_28970.intValue();
            }
         }

         int var5 = var1.indexOf(10);
         if (var5 != -1) {
            var1 = var1.substring(0, var5);
         }

         char[] var6 = var1.toCharArray();
         GlyphVector var7 = this.field_18479.layoutGlyphVector(class_1701.field_8796, var6, 0, var6.length, 0);
         int var8 = this.field_18492 + var7.getPixelBounds(null, 0.0F, 0.0F).y;
         if (var4 != null) {
            var4.field_28970 = new Short((short)var8);
         }

         return var8;
      } else {
         throw new IllegalArgumentException("text cannot be null.");
      }
   }

   public Font method_17564() {
      return this.field_18479;
   }

   public int method_17582() {
      return this.field_18478;
   }

   public void method_17558(int var1) {
      this.field_18478 = var1;
   }

   public int method_17562() {
      return this.field_18491;
   }

   public void method_17549(int var1) {
      this.field_18491 = var1;
   }

   public int method_17573() {
      return this.field_18474;
   }

   public void method_17578(int var1) {
      this.field_18474 = var1;
   }

   public int method_17588() {
      return this.field_18499;
   }

   public void method_17576(int var1) {
      this.field_18499 = var1;
   }

   public int method_17587() {
      return this.field_18476;
   }

   public void method_17572(int var1) {
      this.field_18476 = var1;
   }

   public int method_17574() {
      return this.field_18498;
   }

   public void method_17554(int var1) {
      this.field_18498 = var1;
   }

   @Override
   public int method_18543() {
      return this.field_18494 + this.field_18492 + this.field_18472 + this.field_18478 + this.field_18474 + this.field_18498;
   }

   public int method_17553() {
      return this.field_18492;
   }

   public int method_17577() {
      return this.field_18494;
   }

   public int method_17559() {
      return this.field_18472;
   }

   public int method_17560() {
      return this.field_18501;
   }

   public void method_17565(int var1) {
      this.field_18501 = var1;
   }

   public int method_17551() {
      return this.field_18480;
   }

   public void method_17585(int var1) {
      this.field_18480 = var1;
   }

   public List method_17557() {
      return this.field_18473;
   }

   public List method_17589() {
      return this.field_18495;
   }

   public boolean method_17556() {
      return this.field_18483;
   }

   public void method_17569(boolean var1) {
      this.field_18483 = var1;
   }

   public String method_17555() {
      if (this.field_18497 == null) {
         try {
            Object var3 = Class.forName("sun.font.FontManager").getDeclaredMethod("getFont2D", Font.class).invoke(null, this.field_18479);
            Field var4 = Class.forName("sun.font.PhysicalFont").getDeclaredField("platName");
            var4.setAccessible(true);
            this.field_18497 = (String)var4.get(var3);
         } catch (Throwable var5) {
         }

         if (this.field_18497 == null) {
            this.field_18497 = "";
         }
      }

      return this.field_18497.length() == 0 ? null : this.field_18497;
   }
}
