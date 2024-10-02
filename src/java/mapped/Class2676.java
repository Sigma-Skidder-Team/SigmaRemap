package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.GameRules;

import java.util.List;

public class Class2676 extends Class2672 {
   private static String[] field17068;
   private final Class8522 field17069;
   public final Class1032 field17070;

   public Class2676(Class1032 var1) {
      super(var1);
      this.field17070 = var1;
      this.field17069 = new Class8522().method30203(16.0).method30204().method30209(var0 -> ((Class1019)var0).method4517() == Class112.field397);
   }

   @Override
   public boolean method10803() {
      if (this.field17070.method4232() == null) {
         if (!this.field17070.method4594()) {
            if (this.field17070.ticksExisted >= this.field17058) {
               if (this.field17070.world.getGameRules().getBoolean(GameRules.field24224)) {
                  List var3 = this.field17070
                     .world
                     .<Class1019>method7195(Class1019.class, this.field17069, this.field17070, this.field17070.getBoundingBox().grow(16.0, 4.0, 16.0));
                  if (!var3.isEmpty()) {
                     Class1032.method4609(this.field17070, (Class1019)var3.get(Class1032.method4608(this.field17070).nextInt(var3.size())));
                     return true;
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
   public boolean method10806() {
      return Class1032.method4603(this.field17070) != null && this.field17057 > 0;
   }

   @Override
   public void method10807() {
      super.method10807();
      Class1032.method4609(this.field17070, (Class1019)null);
   }

   @Override
   public void method10890() {
      Class1019 var3 = Class1032.method4603(this.field17070);
      if (var3 != null && var3.isAlive()) {
         var3.method4518(Class112.field400);
      }
   }

   @Override
   public int method10891() {
      return 40;
   }

   @Override
   public int method10892() {
      return 60;
   }

   @Override
   public int method10893() {
      return 140;
   }

   @Override
   public SoundEvent method10894() {
      return SoundEvents.field26567;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13184;
   }
}
