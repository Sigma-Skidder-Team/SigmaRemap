package mapped;

import javax.annotation.Nullable;

public interface Class1023 extends Class1022 {
   void method4535(boolean var1);

   void method4536(Class880 var1, ItemStack var2, Class882 var3, float var4);

   @Nullable
   Class880 method4232();

   void method4537();

   default void method4538(Class880 var1, float var2) {
      Hand var5 = Class9456.method36389(var1, Items.field38148);
      ItemStack var6 = var1.getHeldItem(var5);
      if (var1.method3092(Items.field38148)) {
         Class3261.method11763(var1.world, var1, var5, var6, var2, (float)(14 - var1.world.method6997().method8905() * 4));
      }

      this.method4537();
   }

   default void method4539(Class880 var1, Class880 var2, Class882 var3, float var4, float var5) {
      double var8 = var2.getPosX() - var1.getPosX();
      double var10 = var2.getPosZ() - var1.getPosZ();
      double var12 = (double) MathHelper.method37766(var8 * var8 + var10 * var10);
      double var14 = var2.method3440(0.3333333333333333) - var3.getPosY() + var12 * 0.2F;
      Class7680 var16 = this.method4540(var1, new Vector3d(var8, var14, var10), var4);
      var3.method3462(
         (double)var16.method25269(),
         (double)var16.method25270(),
         (double)var16.method25271(),
         var5,
         (float)(14 - var1.world.method6997().method8905() * 4)
      );
      var1.method2863(Class6067.field26494, 1.0F, 1.0F / (var1.method3013().nextFloat() * 0.4F + 0.8F));
   }

   default Class7680 method4540(Class880 var1, Vector3d var2, float var3) {
      Vector3d var6 = var2.method11333();
      Vector3d var7 = var6.method11335(new Vector3d(0.0, 1.0, 0.0));
      if (var7.method11349() <= 1.0E-7) {
         var7 = var6.method11335(var1.method3284(1.0F));
      }

      Class8661 var8 = new Class8661(new Class7680(var7), 90.0F, true);
      Class7680 var9 = new Class7680(var6);
      var9.method25283(var8);
      Class8661 var10 = new Class8661(var9, var3, true);
      Class7680 var11 = new Class7680(var6);
      var11.method25283(var10);
      return var11;
   }
}
