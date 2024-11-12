package mapped;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.ResourceLoader;

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

public class Class7431 implements Font {
   private static final int field31947 = 200;
   private static final int field31948 = 1114111;
   private static final int field31949 = 512;
   private static final int field31950 = 2175;
   private static final SGL field31951 = Renderer.get();
   private static final Class8741 field31952 = new Class8741();
   private static final Comparator field31953 = new Class3582();
   private java.awt.Font field31954;
   private String field31955;
   private int field31956;
   private int field31957;
   private int field31958;
   private int field31959;
   private final Class8140[][] field31960 = new Class8140[2175][];
   private final List<Class7301> field31961 = new ArrayList();
   private final List field31962 = new ArrayList(256);
   private final List<Class7183> field31963 = new ArrayList();
   private int field31964;
   private int field31965;
   private int field31966;
   private int field31967;
   private int field31968;
   private int field31969;
   private Class8140 field31970;
   private int field31971 = 512;
   private int field31972 = 512;
   private boolean field31973 = true;
   private int field31974 = -1;
   private int field31975;
   private Class8741 field31976;
   private final LinkedHashMap field31977 = new Class18(this, 200, 1.0F, true);

   private static java.awt.Font method23953(String var0) throws Class2451 {
      try {
         return java.awt.Font.createFont(0, ResourceLoader.getResourceAsStream(var0));
      } catch (FontFormatException var4) {
         throw new Class2451("Invalid font: " + var0, var4);
      } catch (IOException var5) {
         throw new Class2451("Error reading font: " + var0, var5);
      }
   }

   public Class7431(String var1, String var2) throws Class2451 {
      this(var1, new Class8415(var2));
   }

   public Class7431(String var1, Class8415 var2) throws Class2451 {
      this.field31955 = var1;
      java.awt.Font var5 = method23953(var1);
      this.method23954(var5, var2.method29563(), var2.method29565(), var2.method29567());
      this.method23955(var2);
   }

   public Class7431(String var1, int var2, boolean var3, boolean var4) throws Class2451 {
      this.field31955 = var1;
      this.method23954(method23953(var1), var2, var3, var4);
   }

   public Class7431(java.awt.Font var1, String var2) throws Class2451 {
      this(var1, new Class8415(var2));
   }

   public Class7431(java.awt.Font var1, Class8415 var2) {
      this.method23954(var1, var2.method29563(), var2.method29565(), var2.method29567());
      this.method23955(var2);
   }

   public Class7431(java.awt.Font var1) {
      this.method23954(var1, var1.getSize(), var1.isBold(), var1.isItalic());
   }

   public Class7431(java.awt.Font var1, int var2, boolean var3, boolean var4) {
      this.method23954(var1, var2, var3, var4);
   }

   private void method23954(java.awt.Font var1, int var2, boolean var3, boolean var4) {
      Map var7 = var1.getAttributes();
      var7.put(TextAttribute.SIZE, new Float((float)var2));
      var7.put(TextAttribute.WEIGHT, var3 ? TextAttribute.WEIGHT_BOLD : TextAttribute.WEIGHT_REGULAR);
      var7.put(TextAttribute.POSTURE, var4 ? TextAttribute.POSTURE_OBLIQUE : TextAttribute.POSTURE_REGULAR);

      try {
         var7.put(TextAttribute.class.getDeclaredField("KERNING").get(null), TextAttribute.class.getDeclaredField("KERNING_ON").get(null));
      } catch (Exception var11) {
      }

      this.field31954 = var1.deriveFont(var7);
      FontMetrics var8 = Class7301.method23072().getFontMetrics(this.field31954);
      this.field31956 = var8.getAscent();
      this.field31957 = var8.getDescent();
      this.field31958 = var8.getLeading();
      char[] var9 = " ".toCharArray();
      GlyphVector var10 = this.field31954.layoutGlyphVector(Class7301.field31289, var9, 0, var9.length, 0);
      this.field31959 = var10.getGlyphLogicalBounds(0).getBounds().width;
   }

   private void method23955(Class8415 var1) {
      this.field31964 = var1.method29547();
      this.field31965 = var1.method29549();
      this.field31966 = var1.method29551();
      this.field31967 = var1.method29553();
      this.field31968 = var1.method29555();
      this.field31969 = var1.method29557();
      this.field31971 = var1.method29559();
      this.field31972 = var1.method29561();
      this.field31963.addAll(var1.method29569());
   }

   public void method23956(int var1, int var2) {
      for (int var5 = var1; var5 <= var2; var5++) {
         this.method23957(new String(Character.toChars(var5)));
      }
   }

   public void method23957(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null.");
      } else {
         char[] var4 = var1.toCharArray();
         GlyphVector var5 = this.field31954.layoutGlyphVector(Class7301.field31289, var4, 0, var4.length, 0);
         int var6 = 0;

         for (int var7 = var5.getNumGlyphs(); var6 < var7; var6++) {
            int var8 = var1.codePointAt(var5.getGlyphCharIndex(var6));
            Rectangle var9 = this.method23966(var5, var6, var8);
            this.method23965(var5.getGlyphCode(var6), var8, var9, var5, var6);
         }
      }
   }

   public void method23958() {
      this.method23956(32, 255);
   }

   public void method23959() {
      this.method23956(32, 128);
   }

   public boolean method23960() throws Class2451 {
      return this.method23961(-1);
   }

   public boolean method23961(int var1) throws Class2451 {
      if (this.field31962.isEmpty()) {
         return false;
      } else if (this.field31963.isEmpty()) {
         throw new IllegalStateException("The UnicodeFont must have at least one effect before any glyphs can be loaded.");
      } else {
         Iterator var4 = this.field31962.iterator();

         while (var4.hasNext()) {
            Class8140 var5 = (Class8140)var4.next();
            int var6 = var5.method28221();
            if (var5.method28222() == 0 || var6 == 32) {
               var4.remove();
            } else if (var5.method28220()) {
               if (this.field31970 == null) {
                  this.field31970 = var5;
               } else if (var5 != this.field31970) {
                  var4.remove();
               }
            }
         }

         Collections.sort(this.field31962, field31953);

         for (Class7301 var9 : this.field31961) {
            var1 -= var9.method23073(this.field31962, var1);
            if (var1 == 0 || this.field31962.isEmpty()) {
               return true;
            }
         }

         while (!this.field31962.isEmpty()) {
            Class7301 var8 = new Class7301(this, this.field31971, this.field31972);
            this.field31961.add(var8);
            var1 -= var8.method23073(this.field31962, var1);
            if (var1 == 0) {
               return true;
            }
         }

         return true;
      }
   }

   public void method23962() {
      for (int var3 = 0; var3 < 2175; var3++) {
         this.field31960[var3] = null;
      }

      for (Class7301 var4 : this.field31961) {
         try {
            var4.method23077().method23569();
         } catch (Class2451 var6) {
         }
      }

      this.field31961.clear();
      if (this.field31974 != -1) {
         field31951.glDeleteLists(this.field31974, this.field31977.size());
         this.field31974 = -1;
      }

      this.field31962.clear();
      this.field31970 = null;
   }

   public void method23963() {
      this.method23962();
   }

   public Class8741 method23964(float var1, float var2, String var3, Color var4, int var5, int var6) {
      if (var3 == null) {
         throw new IllegalArgumentException("text cannot be null.");
      } else if (var3.length() == 0) {
         return field31952;
      } else if (var4 == null) {
         throw new IllegalArgumentException("color cannot be null.");
      } else {
         var1 -= (float)this.field31965;
         var2 -= (float)this.field31964;
         String var9 = var3.substring(var5, var6);
         var4.bind();
         TextureImpl.bindNone();
         Class8741 var10 = null;
         if (this.field31973 && this.field31962.isEmpty()) {
            if (this.field31974 == -1) {
               this.field31974 = field31951.glGenLists(200);
               if (this.field31974 == 0) {
                  this.field31974 = -1;
                  this.field31973 = false;
                  return new Class8741();
               }
            }

            var10 = (Class8741)this.field31977.get(var9);
            if (var10 == null) {
               if (var10 == null) {
                  var10 = new Class8741();
                  int var11 = this.field31977.size();
                  this.field31977.put(var9, var10);
                  if (var11 >= 200) {
                     var10.field39414 = this.field31975;
                  } else {
                     var10.field39414 = this.field31974 + var11;
                  }
               }
            } else {
               if (!var10.field39413) {
                  field31951.glTranslatef(var1, var2, 0.0F);
                  field31951.glCallList(var10.field39414);
                  field31951.glTranslatef(-var1, -var2, 0.0F);
                  return var10;
               }

               var10.field39413 = false;
            }

            this.field31977.put(var9, var10);
         }

         field31951.glTranslatef(var1, var2, 0.0F);
         if (var10 != null) {
            field31951.glNewList(var10.field39414, 4865);
         }

         char[] var30 = var3.substring(0, var6).toCharArray();
         GlyphVector var12 = this.field31954.layoutGlyphVector(Class7301.field31289, var30, 0, var30.length, 0);
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = this.field31956;
         boolean var18 = false;
         Texture var19 = null;
         int var20 = 0;

         for (int var21 = var12.getNumGlyphs(); var20 < var21; var20++) {
            int var22 = var12.getGlyphCharIndex(var20);
            if (var22 >= var5) {
               if (var22 > var6) {
                  break;
               }

               int var23 = var3.codePointAt(var22);
               Rectangle var24 = this.method23966(var12, var20, var23);
               Class8140 var25 = this.method23965(var12.getGlyphCode(var20), var23, var24, var12, var20);
               if (var18 && var23 != 10) {
                  var16 = -var24.x;
                  var18 = false;
               }

               Image var26 = var25.method28226();
               if (var26 == null && this.field31970 != null && var25.method28220()) {
                  var26 = this.field31970.method28226();
               }

               if (var26 != null) {
                  Texture var27 = var26.method23565();
                  if (var19 != null && var19 != var27) {
                     field31951.glEnd();
                     var19 = null;
                  }

                  if (var19 == null) {
                     var27.bind();
                     field31951.glBegin(7);
                     var19 = var27;
                  }

                  var26.method23529((float)(var24.x + var16), (float)(var24.y + var17), (float)var26.method23558(), (float)var26.method23559());
               }

               if (var20 >= 0) {
                  var16 += this.field31967 + this.field31965 + this.field31968;
               }

               var13 = Math.max(var13, var24.x + var16 + var24.width);
               var14 = Math.max(var14, this.field31956 + var24.y + var24.height);
               if (var23 == 10) {
                  var18 = true;
                  var17 += this.getLineHeight();
                  var15++;
                  var14 = 0;
               }
            }
         }

         if (var19 != null) {
            field31951.glEnd();
         }

         if (var10 != null) {
            field31951.glEndList();
            if (!this.field31962.isEmpty()) {
               var10.field39413 = true;
            }
         }

         field31951.glTranslatef(-var1, -var2, 0.0F);
         if (var10 == null) {
            var10 = new Class8741();
         }

         var10.field39416 = (short)var13;
         var10.field39417 = (short)(var15 * this.getLineHeight() + var14);
         return var10;
      }
   }

   @Override
   public void drawString(float var1, float var2, String var3, Color var4, int var5, int var6) {
      this.method23964(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawString(float var1, float var2, String var3) {
      this.drawString(var1, var2, var3, Color.white);
   }

   @Override
   public void drawString(float var1, float var2, String var3, Color var4) {
      this.drawString(var1, var2, var3, var4, 0, var3.length());
   }

   private Class8140 method23965(int var1, int var2, Rectangle var3, GlyphVector var4, int var5) {
      if (var1 >= 0 && var1 < 1114111) {
         int var8 = var1 / 512;
         int var9 = var1 & 511;
         Class8140 var10 = null;
         Class8140[] var11 = this.field31960[var8];
         if (var11 == null) {
            var11 = this.field31960[var8] = new Class8140[512];
         } else {
            var10 = var11[var9];
            if (var10 != null) {
               return var10;
            }
         }

         var10 = var11[var9] = new Class8140(var2, var3, var4, var5, this);
         this.field31962.add(var10);
         return var10;
      } else {
         return new Class8139(this, var2, var3, var4, var5, this);
      }
   }

   private Rectangle method23966(GlyphVector var1, int var2, int var3) {
      Rectangle var6 = var1.getGlyphPixelBounds(var2, Class7301.field31289, 0.0F, 0.0F);
      if (var3 == 32) {
         var6.width = this.field31959;
      }

      return var6;
   }

   public int method23967() {
      return this.field31959;
   }

   @Override
   public int getWidth(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (this.field31973) {
               Class8741 var4 = (Class8741)this.field31977.get(var1);
               if (var4 != null) {
                  return var4.field39416;
               }
            }

            char[] var14 = var1.toCharArray();
            GlyphVector var5 = this.field31954.layoutGlyphVector(Class7301.field31289, var14, 0, var14.length, 0);
            int var6 = 0;
            int var7 = 0;
            boolean var8 = false;
            int var9 = 0;

            for (int var10 = var5.getNumGlyphs(); var9 < var10; var9++) {
               int var11 = var5.getGlyphCharIndex(var9);
               int var12 = var1.codePointAt(var11);
               Rectangle var13 = this.method23966(var5, var9, var12);
               if (var8 && var12 != 10) {
                  var7 = -var13.x;
               }

               if (var9 > 0) {
                  var7 += this.field31965 + this.field31967 + this.field31968;
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
   public int getHeight(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (this.field31973) {
               Class8741 var4 = (Class8741)this.field31977.get(var1);
               if (var4 != null) {
                  return var4.field39417;
               }
            }

            char[] var13 = var1.toCharArray();
            GlyphVector var5 = this.field31954.layoutGlyphVector(Class7301.field31289, var13, 0, var13.length, 0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (int var9 = var5.getNumGlyphs(); var8 < var9; var8++) {
               int var10 = var5.getGlyphCharIndex(var8);
               int var11 = var1.codePointAt(var10);
               if (var11 != 32) {
                  Rectangle var12 = this.method23966(var5, var8, var11);
                  var7 = Math.max(var7, this.field31956 + var12.y + var12.height);
                  if (var11 == 10) {
                     var6++;
                     var7 = 0;
                  }
               }
            }

            return var6 * this.getLineHeight() + var7;
         } else {
            return 0;
         }
      } else {
         throw new IllegalArgumentException("text cannot be null.");
      }
   }

   public int method23968(String var1) {
      if (var1 != null) {
         Class8741 var4 = null;
         if (this.field31973) {
            var4 = (Class8741)this.field31977.get(var1);
            if (var4 != null && var4.field39415 != null) {
               return var4.field39415.intValue();
            }
         }

         int var5 = var1.indexOf(10);
         if (var5 != -1) {
            var1 = var1.substring(0, var5);
         }

         char[] var6 = var1.toCharArray();
         GlyphVector var7 = this.field31954.layoutGlyphVector(Class7301.field31289, var6, 0, var6.length, 0);
         int var8 = this.field31956 + var7.getPixelBounds(null, 0.0F, 0.0F).y;
         if (var4 != null) {
            var4.field39415 = new Short((short)var8);
         }

         return var8;
      } else {
         throw new IllegalArgumentException("text cannot be null.");
      }
   }

   public java.awt.Font method23969() {
      return this.field31954;
   }

   public int method23970() {
      return this.field31964;
   }

   public void method23971(int var1) {
      this.field31964 = var1;
   }

   public int method23972() {
      return this.field31965;
   }

   public void method23973(int var1) {
      this.field31965 = var1;
   }

   public int method23974() {
      return this.field31966;
   }

   public void method23975(int var1) {
      this.field31966 = var1;
   }

   public int method23976() {
      return this.field31967;
   }

   public void method23977(int var1) {
      this.field31967 = var1;
   }

   public int method23978() {
      return this.field31968;
   }

   public void method23979(int var1) {
      this.field31968 = var1;
   }

   public int method23980() {
      return this.field31969;
   }

   public void method23981(int var1) {
      this.field31969 = var1;
   }

   @Override
   public int getLineHeight() {
      return this.field31957 + this.field31956 + this.field31958 + this.field31964 + this.field31966 + this.field31969;
   }

   public int method23982() {
      return this.field31956;
   }

   public int method23983() {
      return this.field31957;
   }

   public int method23984() {
      return this.field31958;
   }

   public int method23985() {
      return this.field31971;
   }

   public void method23986(int var1) {
      this.field31971 = var1;
   }

   public int method23987() {
      return this.field31972;
   }

   public void method23988(int var1) {
      this.field31972 = var1;
   }

   public List method23989() {
      return this.field31961;
   }

   public List<Class7183> method23990() {
      return this.field31963;
   }

   public boolean method23991() {
      return this.field31973;
   }

   public void method23992(boolean var1) {
      this.field31973 = var1;
   }

   public String method23993() {
      if (this.field31955 == null) {
         try {
            Object var3 = Class.forName("sun.font.FontManager").getDeclaredMethod("getFont2D", java.awt.Font.class).invoke(null, this.field31954);
            Field var4 = Class.forName("sun.font.PhysicalFont").getDeclaredField("platName");
            var4.setAccessible(true);
            this.field31955 = (String)var4.get(var3);
         } catch (Throwable var5) {
         }

         if (this.field31955 == null) {
            this.field31955 = "";
         }
      }

      return this.field31955.length() == 0 ? null : this.field31955;
   }

   // $VF: synthetic method
   public static int method23994(Class7431 var0, int var1) {
      return var0.field31975 = var1;
   }
}
