package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class class_7260<T extends class_9795> extends class_2255<T> {
   public static final Identifier field_37199 = new Identifier("textures/environment/end_sky.png");
   public static final Identifier field_37196 = new Identifier("textures/entity/end_portal.png");
   private static final Random field_37198 = new Random(31100L);
   private static final List<RenderLayer> field_37197 = IntStream.range(0, 16)
      .<RenderLayer>mapToObj(var0 -> RenderLayer.method_16712(var0 + 1))
      .collect(ImmutableList.toImmutableList());

   public class_7260(class_3569 var1) {
      super(var1);
   }

   public void method_33179(T var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (!Config.method_14424() || !class_293.method_1305(var1, var2, this.method_33180(), var3, var4, var5, var6)) {
         field_37198.setSeed(31100L);
         double var9 = var1.method_17399().method_12179(this.field_11222.field_17463.method_41627(), true);
         int var11 = this.method_33182(var9);
         float var12 = this.method_33180();
         class_8107 var13 = var3.method_36058().method_28620();
         this.method_33181((T)var1, var12, 0.15F, var13, var4.method_11645(field_37197.get(0)));

         for (int var14 = 1; var14 < var11; var14++) {
            this.method_33181((T)var1, var12, 2.0F / (float)(18 - var14), var13, var4.method_11645(field_37197.get(var14)));
         }
      }
   }

   private void method_33181(T var1, float var2, float var3, class_8107 var4, class_7907 var5) {
      float var8 = (field_37198.nextFloat() * 0.5F + 0.1F) * var3;
      float var9 = (field_37198.nextFloat() * 0.5F + 0.4F) * var3;
      float var10 = (field_37198.nextFloat() * 0.5F + 0.5F) * var3;
      this.method_33183((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, var8, var9, var10, Direction.field_800);
      this.method_33183((T)var1, var4, var5, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var8, var9, var10, Direction.field_818);
      this.method_33183((T)var1, var4, var5, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, var8, var9, var10, Direction.field_804);
      this.method_33183((T)var1, var4, var5, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, var8, var9, var10, Direction.field_809);
      this.method_33183((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8, var9, var10, Direction.field_802);
      this.method_33183((T)var1, var4, var5, 0.0F, 1.0F, var2, var2, 1.0F, 1.0F, 0.0F, 0.0F, var8, var9, var10, Direction.field_817);
   }

   private void method_33183(
      T var1,
      class_8107 var2,
      class_7907 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      Direction var15
   ) {
      if (var1.method_45197(var15)) {
         var3.method_35762(var2, var4, var6, var8).method_35742(var12, var13, var14, 1.0F).method_35735();
         var3.method_35762(var2, var5, var6, var9).method_35742(var12, var13, var14, 1.0F).method_35735();
         var3.method_35762(var2, var5, var7, var10).method_35742(var12, var13, var14, 1.0F).method_35735();
         var3.method_35762(var2, var4, var7, var11).method_35742(var12, var13, var14, 1.0F).method_35735();
      }
   }

   public int method_33182(double var1) {
      if (!(var1 > 36864.0)) {
         if (!(var1 > 25600.0)) {
            if (!(var1 > 16384.0)) {
               if (!(var1 > 9216.0)) {
                  if (!(var1 > 4096.0)) {
                     if (!(var1 > 1024.0)) {
                        if (!(var1 > 576.0)) {
                           return !(var1 > 256.0) ? 15 : 14;
                        } else {
                           return 13;
                        }
                     } else {
                        return 11;
                     }
                  } else {
                     return 9;
                  }
               } else {
                  return 7;
               }
            } else {
               return 5;
            }
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   public float method_33180() {
      return 0.75F;
   }
}
