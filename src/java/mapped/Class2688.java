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
      if (this.field17114 > this.field17115.field5055) {
         return false;
      } else {
         List var3 = this.field17115
            .field5024
            .<Class1000>method6772(Class1000.class, this.field17115.method3389().method19663(8.0, 8.0, 8.0), Class1048.field5808);
         return !var3.isEmpty() || !this.field17115.method2943(Class2106.field13731).method32105();
      }
   }

   @Override
   public void method10804() {
      List var3 = this.field17115
         .field5024
         .<Class1000>method6772(Class1000.class, this.field17115.method3389().method19663(8.0, 8.0, 8.0), Class1048.field5808);
      if (!var3.isEmpty()) {
         this.field17115.method4230().method21655((Entity)var3.get(0), 1.2F);
         this.field17115.method2863(Class6067.field26505, 1.0F, 1.0F);
      }

      this.field17114 = 0;
   }

   @Override
   public void method10807() {
      ItemStack var3 = this.field17115.method2943(Class2106.field13731);
      if (!var3.method32105()) {
         this.method10906(var3);
         this.field17115.method2944(Class2106.field13731, ItemStack.EMPTY);
         this.field17114 = this.field17115.field5055 + Class1048.method4787(this.field17115).nextInt(100);
      }
   }

   @Override
   public void method10805() {
      List var3 = this.field17115
         .field5024
         .<Class1000>method6772(Class1000.class, this.field17115.method3389().method19663(8.0, 8.0, 8.0), Class1048.field5808);
      ItemStack var4 = this.field17115.method2943(Class2106.field13731);
      if (var4.method32105()) {
         if (!var3.isEmpty()) {
            this.field17115.method4230().method21655((Entity)var3.get(0), 1.2F);
         }
      } else {
         this.method10906(var4);
         this.field17115.method2944(Class2106.field13731, ItemStack.EMPTY);
      }
   }

   private void method10906(ItemStack var1) {
      if (!var1.method32105()) {
         double var4 = this.field17115.method3442() - 0.3F;
         Class1000 var6 = new Class1000(this.field17115.field5024, this.field17115.getPosX(), var4, this.field17115.getPosZ(), var1);
         var6.method4134(40);
         var6.method4129(this.field17115.getUniqueID());
         float var7 = 0.3F;
         float var8 = Class1048.method4788(this.field17115).nextFloat() * (float) (Math.PI * 2);
         float var9 = 0.02F * Class1048.method4789(this.field17115).nextFloat();
         var6.method3435(
            (double)(
               0.3F
                     * -MathHelper.method37763(this.field17115.field5031 * (float) (Math.PI / 180.0))
                     * MathHelper.method37764(this.field17115.field5032 * (float) (Math.PI / 180.0))
                  + MathHelper.method37764(var8) * var9
            ),
            (double)(0.3F * MathHelper.method37763(this.field17115.field5032 * (float) (Math.PI / 180.0)) * 1.5F),
            (double)(
               0.3F
                     * MathHelper.method37764(this.field17115.field5031 * (float) (Math.PI / 180.0))
                     * MathHelper.method37764(this.field17115.field5032 * (float) (Math.PI / 180.0))
                  + MathHelper.method37763(var8) * var9
            )
         );
         this.field17115.field5024.method6916(var6);
      }
   }
}
