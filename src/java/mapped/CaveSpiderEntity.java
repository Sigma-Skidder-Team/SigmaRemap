package mapped;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class CaveSpiderEntity extends SpiderEntity {
   private static String[] field6058;

   public CaveSpiderEntity(EntityType<? extends CaveSpiderEntity> var1, World var2) {
      super(var1, var2);
   }

   public static MutableAttribute method5291() {
      return SpiderEntity.method5288().method21849(Attributes.MAX_HEALTH, 12.0);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      if (!super.attackEntityAsMob(var1)) {
         return false;
      } else {
         if (var1 instanceof LivingEntity) {
            int var4 = 0;
            if (this.world.method6997() != Difficulty.NORMAL) {
               if (this.world.method6997() == Difficulty.HARD) {
                  var4 = 15;
               }
            } else {
               var4 = 7;
            }

            if (var4 > 0) {
               ((LivingEntity)var1).addPotionEffect(new EffectInstance(Effects.POISON, var4 * 20, 0));
            }
         }

         return true;
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      return var4;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.45F;
   }
}
