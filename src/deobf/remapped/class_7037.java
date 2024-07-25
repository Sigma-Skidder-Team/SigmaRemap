package remapped;

import java.util.EnumSet;

public class class_7037 extends class_3599 {
   private static String[] field_36245;
   private final class_6163 field_36246;
   private final MobEntity field_36247;
   private LivingEntity field_36249;
   private int field_36248;

   public class_7037(MobEntity var1) {
      this.field_36247 = var1;
      this.field_36246 = var1.world;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      LivingEntity var3 = this.field_36247.getAttackTarget();
      if (var3 != null) {
         this.field_36249 = var3;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (this.field_36249.isAlive()) {
         return this.field_36247.method_37275(this.field_36249) > 225.0 ? false : !this.field_36247.method_26927().method_5591() || this.method_16795();
      } else {
         return false;
      }
   }

   @Override
   public void method_16793() {
      this.field_36249 = null;
      this.field_36247.method_26927().method_5620();
   }

   @Override
   public void method_16794() {
      this.field_36247.method_26865().method_17240(this.field_36249, 30.0F, 30.0F);
      double var3 = (double)(this.field_36247.method_37086() * 2.0F * this.field_36247.method_37086() * 2.0F);
      double var5 = this.field_36247.method_37273(this.field_36249.getPosX(), this.field_36249.method_37309(), this.field_36249.getPosZ());
      double var7 = 0.8;
      if (var5 > var3 && var5 < 16.0) {
         var7 = 1.33;
      } else if (var5 < 225.0) {
         var7 = 0.6;
      }

      this.field_36247.method_26927().method_5616(this.field_36249, var7);
      this.field_36248 = Math.max(this.field_36248 - 1, 0);
      if (!(var5 > var3) && this.field_36248 <= 0) {
         this.field_36248 = 20;
         this.field_36247.method_26442(this.field_36249);
      }
   }
}
