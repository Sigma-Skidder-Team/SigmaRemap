package mapped;

import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

public class Class2781 extends Class2595 {
   private static String[] field17385;
   private final Class1043 field17386;

   public Class2781(Class1043 var1) {
      this.field17386 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field17386.isAlive()) {
         if (!this.field17386.isInWater()) {
            if (this.field17386.isOnGround()) {
               if (!this.field17386.velocityChanged) {
                  PlayerEntity var3 = this.field17386.method4740();
                  if (var3 != null) {
                     return !(this.field17386.getDistanceSq(var3) > 16.0) ? var3.field4905 != null : false;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17386.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field17386.method4683((PlayerEntity)null);
   }
}
