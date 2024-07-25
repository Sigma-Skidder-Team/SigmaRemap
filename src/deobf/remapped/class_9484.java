package remapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class class_9484 extends class_4285<class_4069> {
   private static final LoadingCache<Long, List<class_9191>> field_48333 = CacheBuilder.newBuilder()
      .expireAfterWrite(5L, TimeUnit.MINUTES)
      .build(new class_8782(null));

   public class_9484(Codec<class_4069> var1) {
      super(var1);
   }

   public static List<class_9191> method_43809(class_700 var0) {
      Random var3 = new Random(var0.method_3133());
      long var4 = var3.nextLong() & 65535L;
      return (List<class_9191>)field_48333.getUnchecked(var4);
   }

   public boolean method_43808(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_4069 var5) {
      List var8 = var5.method_18769();
      if (var8.isEmpty()) {
         var8 = method_43809(var1);
      }

      for (class_9191 var10 : var8) {
         if (var10.method_42368(var4)) {
            this.method_43807(var1, var3, var5, var10);
         }
      }

      return true;
   }

   private void method_43807(class_1556 var1, Random var2, class_4069 var3, class_9191 var4) {
      int var7 = var4.method_42367();

      for (BlockPos var9 : BlockPos.method_6076(
         new BlockPos(var4.method_42371() - var7, 0, var4.method_42373() - var7),
         new BlockPos(var4.method_42371() + var7, var4.method_42370() + 10, var4.method_42373() + var7)
      )) {
         if (var9.method_12178((double)var4.method_42371(), (double)var9.getY(), (double)var4.method_42373(), false) <= (double)(var7 * var7 + 1)
            && var9.getY() < var4.method_42370()) {
            this.method_19906(var1, var9, class_4783.field_23881.method_29260());
         } else if (var9.getY() > 65) {
            this.method_19906(var1, var9, class_4783.field_23184.method_29260());
         }
      }

      if (var4.method_42366()) {
         byte var21 = -2;
         byte var23 = 2;
         byte var10 = 3;
         class_2921 var11 = new class_2921();

         for (int var12 = -2; var12 <= 2; var12++) {
            for (int var13 = -2; var13 <= 2; var13++) {
               for (int var14 = 0; var14 <= 3; var14++) {
                  boolean var15 = MathHelper.abs(var12) == 2;
                  boolean var16 = MathHelper.abs(var13) == 2;
                  boolean var17 = var14 == 3;
                  if (var15 || var16 || var17) {
                     boolean var18 = var12 == -2 || var12 == 2 || var17;
                     boolean var19 = var13 == -2 || var13 == 2 || var17;
                     class_2522 var20 = class_4783.field_23817
                        .method_29260()
                        .method_10308(class_6498.field_49671, Boolean.valueOf(var18 && var13 != -2))
                        .method_10308(class_6498.field_49670, Boolean.valueOf(var18 && var13 != 2))
                        .method_10308(class_6498.field_49664, Boolean.valueOf(var19 && var12 != -2))
                        .method_10308(class_6498.field_49667, Boolean.valueOf(var19 && var12 != 2));
                     this.method_19906(var1, var11.method_13362(var4.method_42371() + var12, var4.method_42370() + var14, var4.method_42373() + var13), var20);
                  }
               }
            }
         }
      }

      class_3577 var22 = EntityType.field_34273.method_30484(var1.method_7066());
      var22.method_16625(var3.method_18768());
      var22.method_37289(var3.method_18767());
      var22.method_37144(
         (double)var4.method_42371() + 0.5, (double)(var4.method_42370() + 1), (double)var4.method_42373() + 0.5, var2.nextFloat() * 360.0F, 0.0F
      );
      var1.method_7509(var22);
      this.method_19906(var1, new BlockPos(var4.method_42371(), var4.method_42370(), var4.method_42373()), class_4783.field_23433.method_29260());
   }
}
