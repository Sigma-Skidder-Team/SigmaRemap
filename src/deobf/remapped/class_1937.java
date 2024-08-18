package remapped;

import java.util.EnumSet;

public class class_1937 extends class_3599 {
   private static String[] field_9898;
   private final MobEntity field_9897;
   private LivingEntity field_9899;
   private final float field_9900;

   public class_1937(MobEntity var1, float var2) {
      this.field_9897 = var1;
      this.field_9900 = var2;
      this.method_16800(EnumSet.<Flag>of(Flag.JUMP, Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_9897.method_37151()) {
         this.field_9899 = this.field_9897.getAttackTarget();
         if (this.field_9899 != null) {
            double var3 = this.field_9897.method_37275(this.field_9899);
            if (var3 < 4.0 || var3 > 16.0) {
               return false;
            } else {
               return this.field_9897.method_37360() ? this.field_9897.method_26594().nextInt(5) == 0 : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_9897.method_37360();
   }

   @Override
   public void method_16796() {
      Vector3d var3 = this.field_9897.method_37098();
      Vector3d var4 = new Vector3d(
         this.field_9899.getPosX() - this.field_9897.getPosX(), 0.0, this.field_9899.getPosZ() - this.field_9897.getPosZ()
      );
      if (var4.method_6221() > 1.0E-7) {
         var4 = var4.method_6213().method_6209(0.4).method_6215(var3.method_6209(0.2));
      }

      this.field_9897.method_37214(var4.field_7336, (double)this.field_9900, var4.field_7334);
   }
}
