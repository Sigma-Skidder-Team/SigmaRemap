package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.Style;

public class class_3762 implements class_5255 {
   private static String[] field_18396;
   public final class_2565 field_18384;
   private final boolean field_18395;
   private final float field_18392;
   private final float field_18388;
   private final float field_18390;
   private final float field_18393;
   private final float field_18387;
   private final class_8107 field_18382;
   private final boolean field_18394;
   private final int field_18383;
   private float field_18389;
   private float field_18386;
   private List<class_4598> field_18381;
   private Style field_18380;
   private class_6988 field_18385;

   private void method_17431(class_4598 var1) {
      if (this.field_18381 == null) {
         this.field_18381 = Lists.newArrayList();
      }

      this.field_18381.add(var1);
   }

   public class_3762(TextRenderer var1, class_2565 var2, float var3, float var4, int var5, boolean var6, class_8107 var7, boolean var8, int var9) {
      this.field_18391 = var1;
      this.field_18384 = var2;
      this.field_18389 = var3;
      this.field_18386 = var4;
      this.field_18395 = var6;
      this.field_18392 = !var6 ? 1.0F : 0.25F;
      this.field_18388 = (float)(var5 >> 16 & 0xFF) / 255.0F * this.field_18392;
      this.field_18390 = (float)(var5 >> 8 & 0xFF) / 255.0F * this.field_18392;
      this.field_18393 = (float)(var5 & 0xFF) / 255.0F * this.field_18392;
      this.field_18387 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      this.field_18382 = !var7.method_36810() ? var7 : class_6938.field_35666;
      this.field_18394 = var8;
      this.field_18383 = var9;
   }

   public boolean 钘댠醧䖼䕦娍(int var1, Style var2, int var3) {
      class_6988 var6 = this.method_17429(var2);
      class_5543 var7 = var6.method_31974(var3);
      class_6938 var8 = var2.getObfuscated() && var3 != 32 ? var6.method_31978(var7) : var6.method_31980(var3);
      boolean var9 = var2.getBold();
      float var10 = this.field_18387;
      Color var11 = var2.getColor();
      float var12;
      float var13;
      float var14;
      if (var11 == null) {
         var12 = this.field_18388;
         var13 = this.field_18390;
         var14 = this.field_18393;
      } else {
         int var15 = var11.func_240742_a_();
         var12 = (float)(var15 >> 16 & 0xFF) / 255.0F * this.field_18392;
         var13 = (float)(var15 >> 8 & 0xFF) / 255.0F * this.field_18392;
         var14 = (float)(var15 & 0xFF) / 255.0F * this.field_18392;
      }

      if (!(var8 instanceof class_6575)) {
         float var18 = !var9 ? 0.0F : var7.method_25218();
         float var16 = !this.field_18395 ? 0.0F : var7.method_25217();
         class_7907 var17 = this.field_18384.method_11645(var8.method_31740(this.field_18394));
         TextRenderer.method_45388(
            this.field_18391,
            var8,
            var9,
            var2.getItalic(),
            var18,
            this.field_18389 + var16,
            this.field_18386 + var16,
            this.field_18382,
            var17,
            var12,
            var13,
            var14,
            var10,
            this.field_18383
         );
      }

      float var19 = var7.method_25221(var9);
      float var20 = !this.field_18395 ? 0.0F : 1.0F;
      if (var2.getStrikethrough()) {
         this.method_17431(
            new class_4598(
               this.field_18389 + var20 - 1.0F,
               this.field_18386 + var20 + 4.5F,
               this.field_18389 + var20 + var19,
               this.field_18386 + var20 + 4.5F - 1.0F,
               0.01F,
               var12,
               var13,
               var14,
               var10
            )
         );
      }

      if (var2.getUnderlined()) {
         this.method_17431(
            new class_4598(
               this.field_18389 + var20 - 1.0F,
               this.field_18386 + var20 + 9.0F,
               this.field_18389 + var20 + var19,
               this.field_18386 + var20 + 9.0F - 1.0F,
               0.01F,
               var12,
               var13,
               var14,
               var10
            )
         );
      }

      this.field_18389 += var19;
      return true;
   }

   public float method_17432(int var1, float var2) {
      if (var1 != 0) {
         float var5 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var6 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(var1 & 0xFF) / 255.0F;
         this.method_17431(
            new class_4598(var2 - 1.0F, this.field_18386 + 9.0F, this.field_18389 + 1.0F, this.field_18386 - 1.0F, 0.01F, var6, var7, var8, var5)
         );
      }

      if (this.field_18381 != null) {
         class_6938 var9 = TextRenderer.method_45406(this.field_18391, Style.DEFAULT_FONT).method_31975();
         class_7907 var10 = this.field_18384.method_11645(var9.method_31740(this.field_18394));

         for (class_4598 var12 : this.field_18381) {
            var9.method_31741(var12, this.field_18382, var10, this.field_18383);
         }
      }

      return this.field_18389;
   }

   private class_6988 method_17429(Style var1) {
      if (var1 != this.field_18380) {
         this.field_18380 = var1;
         this.field_18385 = TextRenderer.method_45406(this.field_18391, var1.getFontId());
         return this.field_18385;
      } else {
         return this.field_18385;
      }
   }
}
