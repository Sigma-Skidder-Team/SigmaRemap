package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class Class2766 extends Class2595 {
   private static String[] field17339;
   public final Class1100 field17340;

   public Class2766(Class1100 var1) {
      this.field17340 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return this.field17340.method4232() != null && !this.field17340.method4228().method20811() && Class1100.method5279(this.field17340).nextInt(7) == 0
         ? this.field17340.getDistanceSq(this.field17340.method4232()) > 4.0
         : false;
   }

   @Override
   public boolean method10806() {
      return this.field17340.method4228().method20811()
         && this.field17340.method5275()
         && this.field17340.method4232() != null
         && this.field17340.method4232().isAlive();
   }

   @Override
   public void method10804() {
      LivingEntity var3 = this.field17340.method4232();
      Vector3d var4 = var3.method3286(1.0F);
      Class1100.method5280(this.field17340).method20813(var4.x, var4.y, var4.z, 1.0);
      this.field17340.method5276(true);
      this.field17340.method2863(SoundEvents.field27186, 1.0F, 1.0F);
   }

   @Override
   public void method10807() {
      this.field17340.method5276(false);
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field17340.method4232();
      if (!this.field17340.getBoundingBox().method19670(var3.getBoundingBox())) {
         double var4 = this.field17340.getDistanceSq(var3);
         if (var4 < 9.0) {
            Vector3d var6 = var3.method3286(1.0F);
            Class1100.method5281(this.field17340).method20813(var6.x, var6.y, var6.z, 1.0);
         }
      } else {
         this.field17340.method3114(var3);
         this.field17340.method5276(false);
      }
   }
}
