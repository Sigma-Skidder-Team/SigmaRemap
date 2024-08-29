package mapped;

import java.util.List;

public class Class2688 extends Class2595 {
   private static String[] field17113;
   private int field17114;
   public final Class1048 field17115;

   Class2688(Class1048 var1) {
      this.field17115 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17114 > this.field17115.ticksExisted) {
         return false;
      } else {
         List var3 = this.field17115
            .world
            .<ItemEntity>method6772(ItemEntity.class, this.field17115.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1048.field5808);
         return !var3.isEmpty() || !this.field17115.method2943(Class2106.field13731).isEmpty();
      }
   }

   @Override
   public void method10804() {
      List var3 = this.field17115
         .world
         .<ItemEntity>method6772(ItemEntity.class, this.field17115.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1048.field5808);
      if (!var3.isEmpty()) {
         this.field17115.method4230().method21655((Entity)var3.get(0), 1.2F);
         this.field17115.method2863(Sounds.field26505, 1.0F, 1.0F);
      }

      this.field17114 = 0;
   }

   @Override
   public void method10807() {
      ItemStack var3 = this.field17115.method2943(Class2106.field13731);
      if (!var3.isEmpty()) {
         this.method10906(var3);
         this.field17115.method2944(Class2106.field13731, ItemStack.EMPTY);
         this.field17114 = this.field17115.ticksExisted + Class1048.method4787(this.field17115).nextInt(100);
      }
   }

   @Override
   public void method10805() {
      List var3 = this.field17115
         .world
         .<ItemEntity>method6772(ItemEntity.class, this.field17115.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1048.field5808);
      ItemStack var4 = this.field17115.method2943(Class2106.field13731);
      if (var4.isEmpty()) {
         if (!var3.isEmpty()) {
            this.field17115.method4230().method21655((Entity)var3.get(0), 1.2F);
         }
      } else {
         this.method10906(var4);
         this.field17115.method2944(Class2106.field13731, ItemStack.EMPTY);
      }
   }

   private void method10906(ItemStack var1) {
      if (!var1.isEmpty()) {
         double var4 = this.field17115.method3442() - 0.3F;
         ItemEntity var6 = new ItemEntity(this.field17115.world, this.field17115.getPosX(), var4, this.field17115.getPosZ(), var1);
         var6.method4134(40);
         var6.method4129(this.field17115.getUniqueID());
         float var7 = 0.3F;
         float var8 = Class1048.method4788(this.field17115).nextFloat() * (float) (Math.PI * 2);
         float var9 = 0.02F * Class1048.method4789(this.field17115).nextFloat();
         var6.method3435(
            (double)(
               0.3F
                     * -MathHelper.sin(this.field17115.rotationYaw * (float) (Math.PI / 180.0))
                     * MathHelper.cos(this.field17115.rotationPitch * (float) (Math.PI / 180.0))
                  + MathHelper.cos(var8) * var9
            ),
            (double)(0.3F * MathHelper.sin(this.field17115.rotationPitch * (float) (Math.PI / 180.0)) * 1.5F),
            (double)(
               0.3F
                     * MathHelper.cos(this.field17115.rotationYaw * (float) (Math.PI / 180.0))
                     * MathHelper.cos(this.field17115.rotationPitch * (float) (Math.PI / 180.0))
                  + MathHelper.sin(var8) * var9
            )
         );
         this.field17115.world.method6916(var6);
      }
   }
}
