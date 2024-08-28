package mapped;

import javax.annotation.Nullable;

public abstract class Class1045 extends Class1046 {
   private static final Class9289<Boolean> field5800 = Class9361.<Boolean>method35441(Class1045.class, Class7784.field33398);
   public int field5801;
   public int field5802;
   public int field5803;

   public Class1045(Class8992<? extends Class1045> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (var4 == null) {
         var4 = new Class5097(true);
      }

      Class5097 var8 = (Class5097)var4;
      if (var8.method15582() && var8.method15580() > 0 && this.field5054.nextFloat() <= var8.method15583()) {
         this.method4770(-24000);
      }

      var8.method15581();
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Nullable
   public abstract Class1045 method4389(Class1657 var1, Class1045 var2);

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5800, false);
   }

   public boolean method4700() {
      return false;
   }

   public int method4767() {
      if (!this.field5024.field9020) {
         return this.field5801;
      } else {
         return !this.field5063.<Boolean>method35445(field5800) ? 1 : -1;
      }
   }

   public void method4768(int var1, boolean var2) {
      int var5 = this.method4767();
      var5 += var1 * 20;
      if (var5 > 0) {
         var5 = 0;
      }

      int var6 = var5 - var5;
      this.method4770(var5);
      if (var2) {
         this.field5802 += var6;
         if (this.field5803 == 0) {
            this.field5803 = 40;
         }
      }

      if (this.method4767() == 0) {
         this.method4770(this.field5802);
      }
   }

   public void method4769(int var1) {
      this.method4768(var1, false);
   }

   public void method4770(int var1) {
      int var4 = this.field5801;
      this.field5801 = var1;
      if (var4 < 0 && var1 >= 0 || var4 >= 0 && var1 < 0) {
         this.field5063.method35446(field5800, var1 < 0);
         this.method4679();
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Age", this.method4767());
      var1.method102("ForcedAge", this.field5802);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4770(var1.method122("Age"));
      this.field5802 = var1.method122("ForcedAge");
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5800.equals(var1)) {
         this.method3385();
      }

      super.method3155(var1);
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020) {
         if (this.method3066()) {
            int var3 = this.method4767();
            if (var3 >= 0) {
               if (var3 > 0) {
                  this.method4770(--var3);
               }
            } else {
               this.method4770(++var3);
            }
         }
      } else if (this.field5803 > 0) {
         if (this.field5803 % 4 == 0) {
            this.field5024.method6746(Class7940.field34078, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), 0.0, 0.0, 0.0);
         }

         this.field5803--;
      }
   }

   public void method4679() {
   }

   @Override
   public boolean method3005() {
      return this.method4767() < 0;
   }

   @Override
   public void method4308(boolean var1) {
      this.method4770(!var1 ? 0 : -24000);
   }
}
