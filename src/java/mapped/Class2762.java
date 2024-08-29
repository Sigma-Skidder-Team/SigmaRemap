package mapped;

import net.minecraft.entity.Entity;

import java.util.EnumSet;

public class Class2762 extends Class2595 {
   private static String[] field17324;
   private final AbstractHorseEntity field17325;
   private final double field17326;
   private double field17327;
   private double field17328;
   private double field17329;

   public Class2762(AbstractHorseEntity var1, double var2) {
      this.field17325 = var1;
      this.field17326 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17325.method4932() && this.field17325.isBeingRidden()) {
         Vector3d var3 = Class8037.method27581(this.field17325, 5, 4);
         if (var3 != null) {
            this.field17327 = var3.field18048;
            this.field17328 = var3.field18049;
            this.field17329 = var3.field18050;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17325.method4230().method21654(this.field17327, this.field17328, this.field17329, this.field17326);
   }

   @Override
   public boolean method10806() {
      return !this.field17325.method4932() && !this.field17325.method4230().method21664() && this.field17325.isBeingRidden();
   }

   @Override
   public void method10805() {
      if (!this.field17325.method4932() && this.field17325.method3013().nextInt(50) == 0) {
         Entity var3 = this.field17325.method3408().get(0);
         if (var3 == null) {
            return;
         }

         if (var3 instanceof PlayerEntity) {
            int var4 = this.field17325.method4944();
            int var5 = this.field17325.method4907();
            if (var5 > 0 && this.field17325.method3013().nextInt(var5) < var4) {
               this.field17325.method4959((PlayerEntity)var3);
               return;
            }

            this.field17325.method4946(5);
         }

         this.field17325.removePassengers();
         this.field17325.method4896();
         this.field17325.world.method6786(this.field17325, (byte)6);
      }
   }
}
