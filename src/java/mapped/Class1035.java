package mapped;

import javax.annotation.Nullable;

public abstract class Class1035 extends Class1009 {
   public static final DataParameter<Boolean> field5750 = EntityDataManager.<Boolean>method35441(Class1035.class, Class7784.field33398);
   public int field5751 = 0;

   public Class1035(EntityType<? extends Class1035> var1, World var2) {
      super(var1, var2);
      this.method4281(true);
      this.method4631();
      this.method4224(Class2163.field14195, 16.0F);
      this.method4224(Class2163.field14196, -1.0F);
   }

   private void method4631() {
      if (Class8100.method28053(this)) {
         ((Class6991)this.method4230()).method21682(true);
      }
   }

   public abstract boolean method4618();

   public void method4632(boolean var1) {
      this.method3210().method35446(field5750, var1);
   }

   public boolean method4633() {
      return this.method3210().<Boolean>method35445(field5750);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5750, false);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      if (this.method4633()) {
         var1.method115("IsImmuneToZombification", true);
      }

      var1.method102("TimeInOverworld", this.field5751);
   }

   @Override
   public double method2894() {
      return !this.method3005() ? -0.45 : -0.05;
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4632(var1.method132("IsImmuneToZombification"));
      this.field5751 = var1.method122("TimeInOverworld");
   }

   @Override
   public void method4258() {
      super.method4258();
      if (!this.method4634()) {
         this.field5751 = 0;
      } else {
         this.field5751++;
      }

      if (this.field5751 > 300) {
         this.method4630();
         this.method4619((ServerWorld)this.world);
      }
   }

   public boolean method4634() {
      return !this.world.method6812().method36880() && !this.method4633() && !this.method4305();
   }

   public void method4619(ServerWorld var1) {
      Class1063 var4 = this.<Class1063>method4292(EntityType.field41110, true);
      if (var4 != null) {
         var4.method3035(new Class2023(Class8254.field35475, 200, 0));
      }
   }

   public boolean method4635() {
      return !this.method3005();
   }

   public abstract Class2172 method4622();

   @Nullable
   @Override
   public Class880 method4232() {
      return this.field5011.<Class880>method21410(Class8830.field39826).orElse((Class880)null);
   }

   public boolean method4636() {
      return this.method3090().getItem() instanceof Class3266;
   }

   @Override
   public void method4237() {
      if (Class4388.method13865(this)) {
         super.method4237();
      }
   }

   @Override
   public void method4257() {
      super.method4257();
      Class7393.method23622(this);
   }

   public abstract void method4630();
}
