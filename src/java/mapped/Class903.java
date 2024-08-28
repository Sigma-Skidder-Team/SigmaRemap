package mapped;

import java.util.List;

public class Class903 extends Class901 {
   private static String[] field5146;

   public Class903(Class8992<? extends Class903> var1, World var2) {
      super(var1, var2);
   }

   public Class903(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(Class8992.field41020, var2, var4, var6, var8, var10, var12, var1);
   }

   public Class903(World var1, Class880 var2, double var3, double var5, double var7) {
      super(Class8992.field41020, var2, var3, var5, var7, var1);
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      Entity var4 = this.method3460();
      if ((var1.method31417() != Class2100.field13691 || !((Class8709)var1).method31416().method3359(var4)) && !this.field5024.field9020) {
         List<Class880> var5 = this.field5024.method7182(Class880.class, this.method3389().method19663(4.0, 2.0, 4.0));
         Class999 var6 = new Class999(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ());
         if (var4 instanceof Class880) {
            var6.method4113((Class880)var4);
         }

         var6.method4105(Class7940.field34056);
         var6.method4097(3.0F);
         var6.method4109(600);
         var6.method4111((7.0F - var6.method4098()) / (float)var6.method4108());
         var6.method4101(new Class2023(Class8254.field35473, 1, 1));
         if (!var5.isEmpty()) {
            for (Class880 var8 : var5) {
               double var9 = this.getDistanceSq(var8);
               if (var9 < 16.0) {
                  var6.method3215(var8.getPosX(), var8.getPosY(), var8.getPosZ());
                  break;
               }
            }
         }

         this.field5024.method6999(2006, this.method3432(), !this.method3245() ? 1 : -1);
         this.field5024.method6916(var6);
         this.method2904();
      }
   }

   @Override
   public boolean method3139() {
      return false;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return false;
   }

   @Override
   public Class7436 method3530() {
      return Class7940.field34056;
   }

   @Override
   public boolean method3529() {
      return false;
   }
}
