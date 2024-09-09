package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.function.Predicate;

public class Class2710 extends Class2709<PlayerEntity> {
   private static String[] field17187;
   private final Class1010 field17192;
   private PlayerEntity field17193;
   private int field17194;
   private int field17195;
   private final Class8522 field17196;
   private final Class8522 field17197 = new Class8522().method30206();

   public Class2710(Class1010 var1, Predicate<LivingEntity> var2) {
      super(var1, PlayerEntity.class, 10, false, false, var2);
      this.field17192 = var1;
      this.field17196 = new Class8522().method30203(this.method10914()).method30209(var1x -> Class1010.method4362(var1, (PlayerEntity)var1x));
   }

   @Override
   public boolean method10803() {
      this.field17193 = this.field17192.world.method7188(this.field17196, this.field17192);
      return this.field17193 != null;
   }

   @Override
   public void method10804() {
      this.field17194 = 5;
      this.field17195 = 0;
      this.field17192.method4360();
   }

   @Override
   public void method10807() {
      this.field17193 = null;
      super.method10807();
   }

   @Override
   public boolean method10806() {
      if (this.field17193 != null) {
         if (Class1010.method4362(this.field17192, this.field17193)) {
            this.field17192.method4262(this.field17193, 10.0F, 10.0F);
            return true;
         } else {
            return false;
         }
      } else {
         return this.field17190 != null && this.field17197.canTarget(this.field17192, this.field17190) ? true : super.method10806();
      }
   }

   @Override
   public void method10805() {
      if (this.field17192.method4232() == null) {
         super.method10923((LivingEntity)null);
      }

      if (this.field17193 == null) {
         if (this.field17190 != null && !this.field17192.isPassenger()) {
            if (!Class1010.method4362(this.field17192, (PlayerEntity)this.field17190)) {
               if (this.field17190.getDistanceSq(this.field17192) > 256.0 && this.field17195++ >= 30 && Class1010.method4363(this.field17192, this.field17190)) {
                  this.field17195 = 0;
               }
            } else {
               if (this.field17190.getDistanceSq(this.field17192) < 16.0) {
                  this.field17192.method4353();
               }

               this.field17195 = 0;
            }
         }

         super.method10805();
      } else if (--this.field17194 <= 0) {
         this.field17190 = this.field17193;
         this.field17193 = null;
         super.method10804();
      }
   }
}
