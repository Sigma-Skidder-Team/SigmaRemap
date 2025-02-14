package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class HuskEntity extends ZombieEntity {
   private static String[] field5768;

   public HuskEntity(EntityType<? extends HuskEntity> var1, World var2) {
      super(var1, var2);
   }

   public static boolean canSpawn(EntityType<HuskEntity> var0, ServerWorldAccess var1, SpawnReason var2, BlockPos var3, Random var4) {
      return canMonsterSpawnInLight(var0, var1, var2, var3, var4) && (var2 == SpawnReason.field14393 || var1.method7022(var3));
   }

   @Override
   public boolean method4660() {
      return false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26686;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26689;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26688;
   }

   @Override
   public SoundEvent method4643() {
      return SoundEvents.field26690;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = super.attackEntityAsMob(var1);
      if (var4 && this.getHeldItemMainhand().isEmpty() && var1 instanceof LivingEntity) {
         float var5 = this.world.method6807(this.getPosition()).method38328();
         ((LivingEntity)var1).addPotionEffect(new EffectInstance(Effects.HUNGER, 140 * (int)var5));
      }

      return var4;
   }

   @Override
   public boolean shouldDrown() {
      return true;
   }

   @Override
   public void method4658() {
      this.method4659(EntityType.ZOMBIE);
      if (!this.isSilent()) {
         this.world.method6869((PlayerEntity)null, 1041, this.getPosition(), 0);
      }
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }
}
