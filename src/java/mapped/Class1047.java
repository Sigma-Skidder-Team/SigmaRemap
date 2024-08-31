package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;

public abstract class Class1047 extends Class1046 {
   public Class1047(EntityType<? extends Class1047> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, 0.0F);
   }

   @Override
   public boolean method2998() {
      return true;
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33509;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this);
   }

   @Override
   public int method4236() {
      return 120;
   }

   @Override
   public int method2937(PlayerEntity var1) {
      return 1 + this.world.rand.nextInt(3);
   }

   public void method4775(int var1) {
      if (this.isAlive() && !this.method3255()) {
         this.method3352(var1 - 1);
         if (this.method3351() == -20) {
            this.method3352(0);
            this.method2741(Class8654.field38999, 2.0F);
         }
      } else {
         this.method3352(300);
      }
   }

   @Override
   public void method3000() {
      int var3 = this.method3351();
      super.method3000();
      this.method4775(var3);
   }

   @Override
   public boolean method2952() {
      return false;
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }
}
