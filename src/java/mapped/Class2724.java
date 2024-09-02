package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.Difficulty;

import java.util.EnumSet;

public class Class2724 extends Class2595 {
   private static String[] field17216;
   private final Class1105 field17217;
   private int field17218;
   private final boolean field17219;

   public Class2724(Class1105 var1) {
      this.field17217 = var1;
      this.field17219 = var1 instanceof Class1106;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17217.method4232();
      return var3 != null && var3.isAlive();
   }

   @Override
   public boolean method10806() {
      return super.method10806() && (this.field17219 || this.field17217.getDistanceSq(this.field17217.method4232()) > 9.0);
   }

   @Override
   public void method10804() {
      this.field17218 = -10;
      this.field17217.method4230().method21666();
      this.field17217.method4227().method28040(this.field17217.method4232(), 90.0F, 90.0F);
      this.field17217.isAirBorne = true;
   }

   @Override
   public void method10807() {
      Class1105.method5312(this.field17217, 0);
      this.field17217.method4233((LivingEntity)null);
      this.field17217.field6076.method10944();
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field17217.method4232();
      this.field17217.method4230().method21666();
      this.field17217.method4227().method28040(var3, 90.0F, 90.0F);
      if (this.field17217.method3135(var3)) {
         this.field17218++;
         if (this.field17218 != 0) {
            if (this.field17218 >= this.field17217.method5303()) {
               float var4 = 1.0F;
               if (this.field17217.world.method6997() == Difficulty.field14354) {
                  var4 += 2.0F;
               }

               if (this.field17219) {
                  var4 += 2.0F;
               }

               var3.method2741(Class8654.method31124(this.field17217, this.field17217), var4);
               var3.method2741(Class8654.method31115(this.field17217), (float)this.field17217.method3086(Attributes.field42110));
               this.field17217.method4233((LivingEntity)null);
            }
         } else {
            Class1105.method5312(this.field17217, this.field17217.method4232().getEntityId());
            if (!this.field17217.method3245()) {
               this.field17217.world.method6786(this.field17217, (byte)21);
            }
         }

         super.method10805();
      } else {
         this.field17217.method4233((LivingEntity)null);
      }
   }
}
