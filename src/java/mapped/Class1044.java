package mapped;

import javax.annotation.Nullable;

public class Class1044 extends Class1043 {
   private BlockPos field5798;
   private int field5799;

   public Class1044(Class8992<? extends Class1044> var1, Class1655 var2) {
      super(var1, var2);
      this.field5023 = true;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600
         .method20002(
            0,
            new Class2596<Class1044>(
               this,
               Class9741.method38187(new Class8848(Class8514.field37971), Class8137.field34983),
               Class6067.field27217,
               var1 -> this.field5024.method6741() && !var1.method3342()
            )
         );
      this.field5600
         .method20002(
            0,
            new Class2596<Class1044>(this, new Class8848(Class8514.field37891), Class6067.field27222, var1 -> this.field5024.method6740() && var1.method3342())
         );
      this.field5600.method20002(1, new Class2781(this));
      this.field5600.method20002(1, new Class2770<Class1038>(this, Class1038.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1032>(this, Class1032.class, 12.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1030>(this, Class1030.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1100>(this, Class1100.class, 8.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1024>(this, Class1024.class, 15.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1033>(this, Class1033.class, 12.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2770<Class1093>(this, Class1093.class, 10.0F, 0.5, 0.5));
      this.field5600.method20002(1, new Class2747(this, 0.5));
      this.field5600.method20002(1, new Class2615(this));
      this.field5600.method20002(2, new Class2789(this, this, 2.0, 0.35));
      this.field5600.method20002(4, new Class2660(this, 0.35));
      this.field5600.method20002(8, new Class2737(this, 0.35));
      this.field5600.method20002(9, new Class2613(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
   }

   @Nullable
   @Override
   public Class1045 method4389(Class1657 var1, Class1045 var2) {
      return null;
   }

   @Override
   public boolean method4746() {
      return false;
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (var5.method32107() != Class8514.field38034 && this.method3066() && !this.method4741() && !this.method3005()) {
         if (var2 == Class79.field182) {
            var1.method2911(Class8876.field40139);
         }

         if (!this.method4742().isEmpty()) {
            if (!this.field5024.field9020) {
               this.method4683(var1);
               this.method4872(var1, this.method2954(), 1);
            }

            return Class2274.method9002(this.field5024.field9020);
         } else {
            return Class2274.method9002(this.field5024.field9020);
         }
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method4713() {
      Class5391[] var3 = (Class5391[])Class9721.field45415.get(1);
      Class5391[] var4 = (Class5391[])Class9721.field45415.get(2);
      if (var3 != null && var4 != null) {
         Class46 var5 = this.method4742();
         this.method4754(var5, var3, 5);
         int var6 = this.field5054.nextInt(var4.length);
         Class5391 var7 = var4[var6];
         Class9346 var8 = var7.method16977(this, this.field5054);
         if (var8 != null) {
            var5.add(var8);
         }
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("DespawnDelay", this.field5799);
      if (this.field5798 != null) {
         var1.method99("WanderTarget", Class8354.method29284(this.field5798));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("DespawnDelay", 99)) {
         this.field5799 = var1.method122("DespawnDelay");
      }

      if (var1.method118("WanderTarget")) {
         this.field5798 = Class8354.method29283(var1.method130("WanderTarget"));
      }

      this.method4770(Math.max(0, this.method4767()));
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Override
   public void method4696(Class9346 var1) {
      if (var1.method35385()) {
         int var4 = 3 + this.field5054.nextInt(4);
         this.field5024.method6916(new Class1003(this.field5024, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public Class9455 method4241() {
      return !this.method4741() ? Class6067.field27215 : Class6067.field27223;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27220;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27216;
   }

   @Override
   public Class9455 method3059(Class8848 var1) {
      Class3257 var4 = var1.method32107();
      return var4 != Class8514.field37891 ? Class6067.field27219 : Class6067.field27218;
   }

   @Override
   public Class9455 method4749(boolean var1) {
      return !var1 ? Class6067.field27221 : Class6067.field27224;
   }

   @Override
   public Class9455 method4748() {
      return Class6067.field27224;
   }

   public void method4755(int var1) {
      this.field5799 = var1;
   }

   public int method4756() {
      return this.field5799;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020) {
         this.method4757();
      }
   }

   private void method4757() {
      if (this.field5799 > 0 && !this.method4741() && --this.field5799 == 0) {
         this.method2904();
      }
   }

   public void method4758(BlockPos var1) {
      this.field5798 = var1;
   }

   @Nullable
   private BlockPos method4759() {
      return this.field5798;
   }

   // $VF: synthetic method
   public static Class6990 method4762(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4763(Class1044 var0) {
      return var0.method4759();
   }

   // $VF: synthetic method
   public static Class6990 method4764(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4765(Class1044 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4766(Class1044 var0) {
      return var0.field5599;
   }
}
