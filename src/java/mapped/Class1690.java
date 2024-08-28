package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class1690 extends Class1685 {
   public static final Codec<Class1690> field9191 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class8611.<Class8907>method30859(Class2348.field16106).forGetter(var0x -> var0x.field9193),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field9194)
            )
            .apply(var0, var0.stable(Class1690::new))
   );
   private final Class8972 field9192;
   private final Class2348<Class8907> field9193;
   private final long field9194;
   private final Class8907 field9195;
   private final Class8907 field9196;
   private final Class8907 field9197;
   private final Class8907 field9198;
   private final Class8907 field9199;

   public Class1690(Class2348<Class8907> var1, long var2) {
      this(
         var1,
         var2,
         var1.method9189(Class9495.field44130),
         var1.method9189(Class9495.field44163),
         var1.method9189(Class9495.field44162),
         var1.method9189(Class9495.field44161),
         var1.method9189(Class9495.field44164)
      );
   }

   private Class1690(Class2348<Class8907> var1, long var2, Class8907 var4, Class8907 var5, Class8907 var6, Class8907 var7, Class8907 var8) {
      super(ImmutableList.of(var4, var5, var6, var7, var8));
      this.field9193 = var1;
      this.field9194 = var2;
      this.field9195 = var4;
      this.field9196 = var5;
      this.field9197 = var6;
      this.field9198 = var7;
      this.field9199 = var8;
      Class2420 var11 = new Class2420(var2);
      var11.method10369(17292);
      this.field9192 = new Class8972(var11);
   }

   @Override
   public Codec<? extends Class1685> method7199() {
      return field9191;
   }

   @Override
   public Class1685 method7200(long var1) {
      return new Class1690(this.field9193, var1, this.field9195, this.field9196, this.field9197, this.field9198, this.field9199);
   }

   @Override
   public Class8907 method7005(int var1, int var2, int var3) {
      int var6 = var1 >> 2;
      int var7 = var3 >> 2;
      if ((long)var6 * (long)var6 + (long)var7 * (long)var7 > 4096L) {
         float var8 = method7237(this.field9192, var6 * 2 + 1, var7 * 2 + 1);
         if (!(var8 > 40.0F)) {
            if (!(var8 >= 0.0F)) {
               return !(var8 < -20.0F) ? this.field9199 : this.field9198;
            } else {
               return this.field9197;
            }
         } else {
            return this.field9196;
         }
      } else {
         return this.field9195;
      }
   }

   public boolean method7236(long var1) {
      return this.field9194 == var1;
   }

   public static float method7237(Class8972 var0, int var1, int var2) {
      int var5 = var1 / 2;
      int var6 = var2 / 2;
      int var7 = var1 % 2;
      int var8 = var2 % 2;
      float var9 = 100.0F - Class9679.method37765((float)(var1 * var1 + var2 * var2)) * 8.0F;
      var9 = Class9679.method37777(var9, -100.0F, 80.0F);

      for (int var10 = -12; var10 <= 12; var10++) {
         for (int var11 = -12; var11 <= 12; var11++) {
            long var12 = (long)(var5 + var10);
            long var14 = (long)(var6 + var11);
            if (var12 * var12 + var14 * var14 > 4096L && var0.method32931((double)var12, (double)var14) < -0.9F) {
               float var16 = (Class9679.method37771((float)var12) * 3439.0F + Class9679.method37771((float)var14) * 147.0F) % 13.0F + 9.0F;
               float var17 = (float)(var7 - var10 * 2);
               float var18 = (float)(var8 - var11 * 2);
               float var19 = 100.0F - Class9679.method37765(var17 * var17 + var18 * var18) * var16;
               var19 = Class9679.method37777(var19, -100.0F, 80.0F);
               var9 = Math.max(var9, var19);
            }
         }
      }

      return var9;
   }
}
