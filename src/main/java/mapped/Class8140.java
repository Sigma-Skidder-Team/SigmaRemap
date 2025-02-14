package mapped;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;

public class Class8140 {
   private static String[] field35025;
   private int field35026;
   private short field35027;
   private short field35028;
   private short field35029;
   private boolean field35030;
   private Shape field35031;
   private Image field35032;

   public Class8140(int var1, Rectangle var2, GlyphVector var3, int var4, Class7431 var5) {
      this.field35026 = var1;
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
         int var13 = var5.method23970();
         int var14 = var5.method23976();
         int var15 = var5.method23974();
         int var16 = var5.method23972();
         int var17 = 1;
         this.field35027 = (short)(var11 + var16 + var14 + var17);
         this.field35028 = (short)(var12 + var13 + var15 + var17);
         this.field35029 = (short)(var5.method23982() + var2.y - var13);
      }

      this.field35031 = var3.getGlyphOutline(var4, (float)(-var2.x + var5.method23972()), (float)(-var2.y + var5.method23970()));
      this.field35030 = !var5.method23969().canDisplay((char)var1);
   }

   public int method28221() {
      return this.field35026;
   }

   public boolean method28220() {
      return this.field35030;
   }

   public int method28222() {
      return this.field35027;
   }

   public int method28223() {
      return this.field35028;
   }

   public Shape method28224() {
      return this.field35031;
   }

   public void method28225(Shape var1) {
      this.field35031 = var1;
   }

   public Image method28226() {
      return this.field35032;
   }

   public void method28227(Image var1) {
      this.field35032 = var1;
   }

   public int method28228() {
      return this.field35029;
   }
}
