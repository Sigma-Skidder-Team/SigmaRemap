package mapped;

import java.util.function.Predicate;

public class Class1054 extends Class1049 {
   private static final Class9289<Integer> field5820 = Class9361.<Integer>method35441(Class1054.class, Class7784.field33391);
   private int field5821;
   private int field5822;
   private static final Predicate<Class880> field5823 = var0 -> {
      if (var0 == null) {
         return false;
      } else {
         return !(var0 instanceof PlayerEntity) || !var0.method2800() && !((PlayerEntity)var0).method2801() ? var0.method3089() != Class7809.field33509 : false;
      }
   };

   public Class1054(Class8992<? extends Class1054> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5820, 0);
   }

   public int method4828() {
      return this.field5063.<Integer>method35445(field5820);
   }

   public void method4829(int var1) {
      this.field5063.method35446(field5820, var1);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5820.equals(var1)) {
         this.method3385();
      }

      super.method3155(var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("PuffState", this.method4828());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4829(var1.method122("PuffState"));
   }

   @Override
   public Class8848 method4796() {
      return new Class8848(Class8514.field37892);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(1, new Class2767(this));
   }

   @Override
   public void tick() {
      if (!this.field5024.field9020 && this.method3066() && this.method3138()) {
         if (this.field5821 <= 0) {
            if (this.method4828() != 0) {
               if (this.field5822 > 60 && this.method4828() == 2) {
                  this.method2863(Class6067.field26980, this.method3099(), this.method3100());
                  this.method4829(1);
               } else if (this.field5822 > 100 && this.method4828() == 1) {
                  this.method2863(Class6067.field26980, this.method3099(), this.method3100());
                  this.method4829(0);
               }

               this.field5822++;
            }
         } else {
            if (this.method4828() != 0) {
               if (this.field5821 > 40 && this.method4828() == 1) {
                  this.method2863(Class6067.field26981, this.method3099(), this.method3100());
                  this.method4829(2);
               }
            } else {
               this.method2863(Class6067.field26981, this.method3099(), this.method3100());
               this.method4829(1);
            }

            this.field5821++;
         }
      }

      super.tick();
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.method3066() && this.method4828() > 0) {
         for (Class1006 var4 : this.field5024.method6772(Class1006.class, this.method3389().method19664(0.3), field5823)) {
            if (var4.method3066()) {
               this.method4830(var4);
            }
         }
      }
   }

   private void method4830(Class1006 var1) {
      int var4 = this.method4828();
      if (var1.method2741(Class8654.method31115(this), (float)(1 + var4))) {
         var1.method3035(new Class2023(Class8254.field35485, 60 * var4, 0));
         this.method2863(Class6067.field26985, 1.0F, 1.0F);
      }
   }

   @Override
   public void method3279(PlayerEntity var1) {
      int var4 = this.method4828();
      if (var1 instanceof Class878 && var4 > 0 && var1.method2741(Class8654.method31115(this), (float)(1 + var4))) {
         if (!this.method3245()) {
            ((Class878)var1).field4855.method15671(new Class5534(Class5534.field24569, 0.0F));
         }

         var1.method3035(new Class2023(Class8254.field35485, 60 * var4, 0));
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26979;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26982;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26984;
   }

   @Override
   public Class9455 method4798() {
      return Class6067.field26983;
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return super.method2981(var1).method32099(method4831(this.method4828()));
   }

   private static float method4831(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   // $VF: synthetic method
   public static Predicate method4833() {
      return field5823;
   }

   // $VF: synthetic method
   public static int method4834(Class1054 var0, int var1) {
      return var0.field5821 = var1;
   }

   // $VF: synthetic method
   public static int method4835(Class1054 var0, int var1) {
      return var0.field5822 = var1;
   }
}
