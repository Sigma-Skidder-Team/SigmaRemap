package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8627 extends class_3498 {
   public static final Codec<class_8627> field_44259 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_5203.<class_6325>method_23878(class_8669.field_44359).forGetter(var0x -> var0x.field_44263),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field_44256)
            )
            .apply(var0, var0.stable(class_8627::new))
   );
   private final class_6567 field_44257;
   private final class_8669<class_6325> field_44263;
   private final long field_44256;
   private final class_6325 field_44260;
   private final class_6325 field_44261;
   private final class_6325 field_44262;
   private final class_6325 field_44258;
   private final class_6325 field_44264;

   public class_8627(class_8669<class_6325> var1, long var2) {
      this(
         var1,
         var2,
         var1.method_39807(class_8606.field_44105),
         var1.method_39807(class_8606.field_44108),
         var1.method_39807(class_8606.field_44085),
         var1.method_39807(class_8606.field_44122),
         var1.method_39807(class_8606.field_44131)
      );
   }

   private class_8627(class_8669<class_6325> var1, long var2, class_6325 var4, class_6325 var5, class_6325 var6, class_6325 var7, class_6325 var8) {
      super(ImmutableList.of(var4, var5, var6, var7, var8));
      this.field_44263 = var1;
      this.field_44256 = var2;
      this.field_44260 = var4;
      this.field_44261 = var5;
      this.field_44262 = var6;
      this.field_44258 = var7;
      this.field_44264 = var8;
      class_8679 var11 = new class_8679(var2);
      var11.method_39868(17292);
      this.field_44257 = new class_6567(var11);
   }

   @Override
   public Codec<? extends class_3498> method_16088() {
      return field_44259;
   }

   @Override
   public class_3498 method_16083(long var1) {
      return new class_8627(this.field_44263, var1, this.field_44260, this.field_44261, this.field_44262, this.field_44258, this.field_44264);
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      int var6 = var1 >> 2;
      int var7 = var3 >> 2;
      if ((long)var6 * (long)var6 + (long)var7 * (long)var7 > 4096L) {
         float var8 = method_39623(this.field_44257, var6 * 2 + 1, var7 * 2 + 1);
         if (!(var8 > 40.0F)) {
            if (!(var8 >= 0.0F)) {
               return !(var8 < -20.0F) ? this.field_44264 : this.field_44258;
            } else {
               return this.field_44262;
            }
         } else {
            return this.field_44261;
         }
      } else {
         return this.field_44260;
      }
   }

   public boolean method_39622(long var1) {
      return this.field_44256 == var1;
   }

   public static float method_39623(class_6567 var0, int var1, int var2) {
      int var5 = var1 / 2;
      int var6 = var2 / 2;
      int var7 = var1 % 2;
      int var8 = var2 % 2;
      float var9 = 100.0F - class_9299.method_42843((float)(var1 * var1 + var2 * var2)) * 8.0F;
      var9 = class_9299.method_42828(var9, -100.0F, 80.0F);

      for (int var10 = -12; var10 <= 12; var10++) {
         for (int var11 = -12; var11 <= 12; var11++) {
            long var12 = (long)(var5 + var10);
            long var14 = (long)(var6 + var11);
            if (var12 * var12 + var14 * var14 > 4096L && var0.method_30013((double)var12, (double)var14) < -0.9F) {
               float var16 = (class_9299.method_42804((float)var12) * 3439.0F + class_9299.method_42804((float)var14) * 147.0F) % 13.0F + 9.0F;
               float var17 = (float)(var7 - var10 * 2);
               float var18 = (float)(var8 - var11 * 2);
               float var19 = 100.0F - class_9299.method_42843(var17 * var17 + var18 * var18) * var16;
               var19 = class_9299.method_42828(var19, -100.0F, 80.0F);
               var9 = Math.max(var9, var19);
            }
         }
      }

      return var9;
   }
}
