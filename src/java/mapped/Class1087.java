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

public class Class1087 extends Class1018 {
   private static String[] field5955;

   public Class1087(EntityType<? extends Class1087> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2747(this, 2.0));
      this.field5600.addGoal(2, new Class2785(this, 1.0));
      this.field5600.addGoal(3, new Class2680(this, 1.25, Class120.method339(Items.field37842), false));
      this.field5600.addGoal(4, new Class2764(this, 1.25));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(7, new Class2668(this));
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
         ItemStack var6 = Class8482.method29979(var5, var1, Items.MILK_BUCKET.getDefaultInstance());
         var1.setHeldItem(var2, var6);
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public Class1087 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.COW.create(var1);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? 1.3F : var2.field39969 * 0.95F;
   }
}
