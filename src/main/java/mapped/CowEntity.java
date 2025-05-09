package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CowEntity extends AnimalEntity {
   private static String[] field5955;

   public CowEntity(EntityType<? extends CowEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new Class2747(this, 2.0));
      this.goalSelector.addGoal(2, new BreedGoal(this, 1.0));
      this.goalSelector.addGoal(3, new TemptGoal(this, 1.25, Ingredient.fromItems(Items.field37842), false));
      this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
   }

   public static MutableAttribute method5040() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 10.0).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26477;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26479;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26478;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26481, 0.15F, 1.0F);
   }

   @Override
   public float getSoundVolume() {
      return 0.4F;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.BUCKET && !this.isChild()) {
         var1.playSound(SoundEvents.field26480, 1.0F, 1.0F);
         ItemStack var6 = DrinkHelper.method29979(var5, var1, Items.MILK_BUCKET.method11742());
         var1.setHeldItem(var2, var6);
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public CowEntity method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.COW.create(var1);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? 1.3F : var2.height * 0.95F;
   }
}
