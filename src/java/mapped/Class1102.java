package mapped;

import net.minecraft.entity.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class1102 extends Class1101 {
   private static String[] field6058;

   public Class1102(EntityType<? extends Class1102> var1, World var2) {
      super(var1, var2);
   }

   public static Class7037 method5291() {
      return Class1101.method5288().method21849(Attributes.field42105, 12.0);
   }

   @Override
   public boolean method3114(Entity var1) {
      if (!super.method3114(var1)) {
         return false;
      } else {
         if (var1 instanceof LivingEntity) {
            byte var4 = 0;
            if (this.world.method6997() != Difficulty.field14353) {
               if (this.world.method6997() == Difficulty.field14354) {
                  var4 = 15;
               }
            } else {
               var4 = 7;
            }

            if (var4 > 0) {
               ((LivingEntity)var1).method3035(new Class2023(Effects.POISON, var4 * 20, 0));
            }
         }

         return true;
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      return var4;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 0.45F;
   }
}
