package mapped;

import java.util.List;

public class Class938 extends Class919 implements Class937 {
   private boolean field5299 = true;
   private int field5300 = -1;
   private final BlockPos field5301 = BlockPos.field13032;

   public Class938(Class8992<? extends Class938> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class938(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41054, var2, var4, var6, var1);
   }

   @Override
   public Class2177 method3602() {
      return Class2177.field14292;
   }

   @Override
   public Class7380 method3604() {
      return Blocks.field36723.method11579();
   }

   @Override
   public int method3606() {
      return 1;
   }

   @Override
   public int method3629() {
      return 5;
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      boolean var7 = !var4;
      if (var7 != this.method3735()) {
         this.method3736(var7);
      }
   }

   public boolean method3735() {
      return this.field5299;
   }

   public void method3736(boolean var1) {
      this.field5299 = var1;
   }

   @Override
   public Class1655 method3734() {
      return this.field5024;
   }

   @Override
   public double method3718() {
      return this.getPosX();
   }

   @Override
   public double method3719() {
      return this.getPosY() + 0.5;
   }

   @Override
   public double method3720() {
      return this.getPosZ();
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.field5024.field9020 && this.method3066() && this.method3735()) {
         BlockPos var3 = this.method3432();
         if (!var3.equals(this.field5301)) {
            this.method3738(0);
         } else {
            this.field5300--;
         }

         if (!this.method3739()) {
            this.method3738(0);
            if (this.method3737()) {
               this.method3738(4);
               this.method3622();
            }
         }
      }
   }

   public boolean method3737() {
      if (!Class936.method3705(this)) {
         List var3 = this.field5024.<Entity>method6772(Class1000.class, this.method3389().method19663(0.25, 0.0, 0.25), Class8088.field34757);
         if (!var3.isEmpty()) {
            Class936.method3707(this, (Class1000)var3.get(0));
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method3586(Class8654 var1) {
      super.method3586(var1);
      if (this.field5024.method6789().method17135(Class5462.field24229)) {
         this.method3300(Blocks.field36723);
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("TransferCooldown", this.field5300);
      var1.method115("Enabled", this.field5299);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5300 = var1.method122("TransferCooldown");
      this.field5299 = !var1.method118("Enabled") ? true : var1.method132("Enabled");
   }

   public void method3738(int var1) {
      this.field5300 = var1;
   }

   public boolean method3739() {
      return this.field5300 > 0;
   }

   @Override
   public Class5812 method3628(int var1, Class974 var2) {
      return new Class5816(var1, var2, this);
   }
}
