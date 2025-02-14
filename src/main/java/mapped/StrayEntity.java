package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class StrayEntity extends Class1082 {
   private static String[] field5948;

   public StrayEntity(EntityType<? extends StrayEntity> var1, World var2) {
      super(var1, var2);
   }

   public static boolean method5033(EntityType<StrayEntity> var0, ServerWorldAccess var1, SpawnReason var2, BlockPos var3, Random var4) {
      return canMonsterSpawnInLight(var0, var1, var2, var3, var4) && (var2 == SpawnReason.field14393 || var1.method7022(var3));
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27138;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27140;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27139;
   }

   @Override
   public SoundEvent method5030() {
      return SoundEvents.field27141;
   }

   @Override
   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      AbstractArrowEntity var5 = super.method5032(var1, var2);
      if (var5 instanceof ArrowEntity) {
         ((ArrowEntity)var5).method3500(new EffectInstance(Effects.SLOWNESS, 600));
      }

      return var5;
   }
}
