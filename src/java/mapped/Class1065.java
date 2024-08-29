package mapped;

import javax.annotation.Nullable;

public class Class1065 extends Class1064 {
   private int field5876 = 47999;

   public Class1065(EntityType<? extends Class1065> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method4884() {
      return true;
   }

   @Override
   public Class1064 method4908() {
      return EntityType.field41094.method33215(this.world);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("DespawnDelay", this.field5876);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("DespawnDelay", 99)) {
         this.field5876 = var1.method122("DespawnDelay");
      }
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(1, new Class2747(this, 2.0));
      this.field5601.method20002(1, new Class2701(this, this));
   }

   @Override
   public void method4920(PlayerEntity var1) {
      Entity var4 = this.method4297();
      if (!(var4 instanceof Class1044)) {
         super.method4920(var1);
      }
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.world.field9020) {
         this.method4921();
      }
   }

   private void method4921() {
      if (this.method4922()) {
         this.field5876 = !this.method4923() ? this.field5876 - 1 : ((Class1044)this.method4297()).method4756() - 1;
         if (this.field5876 <= 0) {
            this.method4294(true, false);
            this.method2904();
         }
      }
   }

   private boolean method4922() {
      return !this.method4932() && !this.method4924() && !this.method3413();
   }

   private boolean method4923() {
      return this.method4297() instanceof Class1044;
   }

   private boolean method4924() {
      return this.method4296() && !this.method4923();
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var3 == Class2202.field14398) {
         this.method4770(0);
      }

      if (var4 == null) {
         var4 = new Class5097(false);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
