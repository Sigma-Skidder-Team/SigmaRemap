package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class241 extends Class219<TropicalFishEntity, Class2827<TropicalFishEntity>> {
   private static String[] field894;
   private final Class2809<TropicalFishEntity> field895 = new Class2809<TropicalFishEntity>(0.008F);
   private final Class2810<TropicalFishEntity> field896 = new Class2810<TropicalFishEntity>(0.008F);

   public Class241(Class5714<TropicalFishEntity, Class2827<TropicalFishEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, IRenderTypeBuffer var2, int var3, TropicalFishEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Object var13 = var4.method4824() != 0 ? this.field896 : this.field895;
      float[] var14 = var4.method4822();
      method823(
         this.method825(),
         (Class2827<TropicalFishEntity>)var13,
         var4.method4826(),
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var8,
         var9,
         var10,
         var7,
         var14[0],
         var14[1],
         var14[2]
      );
   }
}
