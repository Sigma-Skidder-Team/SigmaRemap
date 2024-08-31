package mapped;

import net.minecraft.entity.LivingEntity;

public class Class247<T extends LivingEntity> extends Class219<T, Class2826<T>> {
   private static String[] field902;
   private final Class2827<T> field903 = new Class2826<T>(0);

   public Class247(Class5714<T, Class2826<T>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method3342()) {
         this.method825().method11027(this.field903);
         this.field903.method10997((T)var4, var5, var6, var7);
         this.field903.method10998((T)var4, var5, var6, var8, var9, var10);
         Class5422 var13 = var2.method25597(RenderType.method14318(this.method826((T)var4)));
         this.field903.method11016(var1, var13, var3, Class5712.method17883(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
