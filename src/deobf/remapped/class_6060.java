package remapped;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;

public class class_6060 {
   private static String[] field_30993;
   private int field_30991;
   private short field_30997;
   private short field_30992;
   private short field_30996;
   private boolean field_30994;
   private Shape field_30995;
   private class_8112 field_30990;

   public class_6060(int var1, Rectangle var2, GlyphVector var3, int var4, class_3786 var5) {
      this.field_30991 = var1;
      GlyphMetrics var8 = var3.getGlyphMetrics(var4);
      int var9 = (int)var8.getLSB();
      if (var9 > 0) {
         var9 = 0;
      }

      int var10 = (int)var8.getRSB();
      if (var10 > 0) {
         var10 = 0;
      }

      int var11 = var2.width - var9 - var10;
      int var12 = var2.height;
      if (var11 > 0 && var12 > 0) {
         int var13 = var5.method_17582();
         int var14 = var5.method_17588();
         int var15 = var5.method_17573();
         int var16 = var5.method_17562();
         byte var17 = 1;
         this.field_30997 = (short)(var11 + var16 + var14 + var17);
         this.field_30992 = (short)(var12 + var13 + var15 + var17);
         this.field_30996 = (short)(var5.method_17553() + var2.y - var13);
      }

      this.field_30995 = var3.getGlyphOutline(var4, (float)(-var2.x + var5.method_17562()), (float)(-var2.y + var5.method_17582()));
      this.field_30994 = !var5.method_17564().canDisplay((char)var1);
   }

   public int method_27713() {
      return this.field_30991;
   }

   public boolean method_27711() {
      return this.field_30994;
   }

   public int method_27708() {
      return this.field_30997;
   }

   public int method_27712() {
      return this.field_30992;
   }

   public Shape method_27714() {
      return this.field_30995;
   }

   public void method_27717(Shape var1) {
      this.field_30995 = var1;
   }

   public class_8112 method_27716() {
      return this.field_30990;
   }

   public void method_27710(class_8112 var1) {
      this.field_30990 = var1;
   }

   public int method_27715() {
      return this.field_30996;
   }
}
