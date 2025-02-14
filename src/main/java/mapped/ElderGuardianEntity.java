package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class ElderGuardianEntity extends GuardianEntity {
   private static String[] field6077;
   public static final float field6078 = EntityType.ELDER_GUARDIAN.method33213() / EntityType.GUARDIAN.method33213();

   public ElderGuardianEntity(EntityType<? extends ElderGuardianEntity> var1, World var2) {
      super(var1, var2);
      this.method4278();
      if (this.field6076 != null) {
         this.field6076.method10945(400);
      }
   }

   public static MutableAttribute method5314() {
      return GuardianEntity.method5300().method21849(Attributes.MOVEMENT_SPEED, 0.3F).method21849(Attributes.ATTACK_DAMAGE, 8.0).method21849(Attributes.MAX_HEALTH, 80.0);
   }

   @Override
   public int method5303() {
      return 60;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method3255() ? SoundEvents.field26525 : SoundEvents.field26524;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.method3255() ? SoundEvents.field26531 : SoundEvents.field26530;
   }

   @Override
   public SoundEvent getDeathSound() {
      return !this.method3255() ? SoundEvents.field26528 : SoundEvents.field26527;
   }

   @Override
   public SoundEvent method5307() {
      return SoundEvents.field26529;
   }

   @Override
   public void updateAITasks() {
      super.updateAITasks();
      if ((this.ticksExisted + this.getEntityId()) % 1200 == 0) {
         Effect var4 = Effects.MINING_FATIGUE;
         List<ServerPlayerEntity> var5 = ((ServerWorld)this.world).method6914(var1 -> this.getDistanceSq(var1) < 2500.0 && var1.interactionManager.method33865());

         for (ServerPlayerEntity var10 : var5) {
            if (!var10.isPotionActive(var4) || var10.getActivePotionEffect(var4).getAmplifier() < 2 || var10.getActivePotionEffect(var4).getDuration() < 1200) {
               var10.connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24570, !this.isSilent() ? 1.0F : 0.0F));
               var10.addPotionEffect(new EffectInstance(var4, 6000, 2));
            }
         }
      }

      if (!this.method4291()) {
         this.method4288(this.getPosition(), 16);
      }
   }
}
