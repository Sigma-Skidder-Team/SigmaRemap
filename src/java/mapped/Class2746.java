package mapped;

import java.util.EnumSet;

public class Class2746 extends Class2595 {
   private static String[] field17277;
   private int field17278;
   public final Class1057 field17279;

   public Class2746(Class1057 var1) {
      this.field17279 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field17279.method4232();
      return var3 != null && var3.isAlive() ? this.field17279.world.method6997() != Class2197.field14351 : false;
   }

   @Override
   public void method10804() {
      this.field17278 = 20;
      this.field17279.method4852(100);
   }

   @Override
   public void method10807() {
      this.field17279.method4852(0);
   }

   @Override
   public void method10805() {
      if (this.field17279.world.method6997() != Class2197.field14351) {
         this.field17278--;
         Class880 var3 = this.field17279.method4232();
         this.field17279.method4227().method28040(var3, 180.0F, 180.0F);
         double var4 = this.field17279.getDistanceSq(var3);
         if (!(var4 < 400.0)) {
            this.field17279.method4233((Class880)null);
         } else if (this.field17278 <= 0) {
            this.field17278 = 20 + Class1057.method4858(this.field17279).nextInt(10) * 20 / 2;
            this.field17279.world.method6916(new Class905(this.field17279.world, this.field17279, var3, this.field17279.method4848().method544()));
            this.field17279
               .method2863(
                  Sounds.field27053,
                  2.0F,
                  (Class1057.method4859(this.field17279).nextFloat() - Class1057.method4860(this.field17279).nextFloat()) * 0.2F + 1.0F
               );
         }

         super.method10805();
      }
   }
}
