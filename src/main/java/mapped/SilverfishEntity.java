package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.InfestedBlock;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class SilverfishEntity extends MonsterEntity {
   private static String[] field6079;
   private Class2753 field6080;

   public SilverfishEntity(EntityType<? extends SilverfishEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field6080 = new Class2753(this);
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(3, this.field6080);
      this.field5600.addGoal(4, new Class2647(this, 1.0, false));
      this.field5600.addGoal(5, new Class2744(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public double getYOffset() {
      return 0.1;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.13F;
   }

   public static MutableAttribute method5316() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 8.0).method21849(Attributes.MOVEMENT_SPEED, 0.25).method21849(Attributes.ATTACK_DAMAGE, 1.0);
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27055;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27057;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27056;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field27058, 0.15F, 1.0F);
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (this.isInvulnerableTo(source)) {
         return false;
      } else {
         if ((source instanceof EntityDamageSource || source == DamageSource.field39006) && this.field6080 != null) {
            this.field6080.method10958();
         }

         return super.attackEntityFrom(source, var2);
      }
   }

   @Override
   public void tick() {
      this.renderYawOffset = this.rotationYaw;
      super.tick();
   }

   @Override
   public void setRenderYawOffset(float var1) {
      this.rotationYaw = var1;
      super.setRenderYawOffset(var1);
   }

   @Override
   public float getBlockPathWeight(BlockPos var1, IWorldReader var2) {
      return !InfestedBlock.method12119(var2.getBlockState(var1.down())) ? super.getBlockPathWeight(var1, var2) : 10.0F;
   }

   public static boolean method5317(EntityType<SilverfishEntity> var0, IWorld var1, SpawnReason var2, BlockPos var3, Random var4) {
      if (!canMonsterSpawn(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method7186((double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33507;
   }
}
