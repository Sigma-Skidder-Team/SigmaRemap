package mapped;

import net.minecraft.item.DyeColor;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.GameRules;

import java.util.List;

public class Class2676 extends Class2672 {
   private static String[] field17068;
   private final EntityPredicate field17069;
   public final EvokerEntity field17070;

   public Class2676(EvokerEntity var1) {
      super(var1);
      this.field17070 = var1;
      this.field17069 = new EntityPredicate().method30203(16.0).method30204().method30209(var0 -> ((SheepEntity)var0).method4517() == DyeColor.field397);
   }

   @Override
   public boolean method10803() {
      if (this.field17070.method4232() == null) {
         if (!this.field17070.method4594()) {
            if (this.field17070.ticksExisted >= this.field17058) {
               if (this.field17070.world.getGameRules().getBoolean(GameRules.field24224)) {
                  List var3 = this.field17070
                     .world
                     .<SheepEntity>method7195(SheepEntity.class, this.field17069, this.field17070, this.field17070.getBoundingBox().grow(16.0, 4.0, 16.0));
                  if (!var3.isEmpty()) {
                     EvokerEntity.method4609(this.field17070, (SheepEntity)var3.get(EvokerEntity.method4608(this.field17070).nextInt(var3.size())));
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
      return EvokerEntity.method4603(this.field17070) != null && this.field17057 > 0;
   }

   @Override
   public void method10807() {
      super.method10807();
      EvokerEntity.method4609(this.field17070, (SheepEntity)null);
   }

   @Override
   public void method10890() {
      SheepEntity var3 = EvokerEntity.method4603(this.field17070);
      if (var3 != null && var3.isAlive()) {
         var3.method4518(DyeColor.field400);
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
