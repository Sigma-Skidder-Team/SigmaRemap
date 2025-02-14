package mapped;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class WitherSkeletonEntity extends Class1082 {
   private static String[] field5949;

   public WitherSkeletonEntity(EntityType<? extends WitherSkeletonEntity> var1, World var2) {
      super(var1, var2);
      this.method4224(PathNodeType.LAVA, 8.0F);
   }

   @Override
   public void method4219() {
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<AbstractPiglinEntity>(this, AbstractPiglinEntity.class, true));
      super.method4219();
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27244;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27246;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27245;
   }

   @Override
   public SoundEvent method5030() {
      return SoundEvents.field27247;
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      Entity var6 = var1.getTrueSource();
      if (var6 instanceof CreeperEntity) {
         CreeperEntity var7 = (CreeperEntity)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.entityDropItem(Items.field38059);
         }
      }
   }

   @Override
   public void method4270(Class9755 var1) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_SWORD));
   }

   @Override
   public void method4273(Class9755 var1) {
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      Class5093 var8 = super.method4276(var1, var2, var3, var4, var5);
      this.getAttribute(Attributes.ATTACK_DAMAGE).method38661(4.0);
      this.method5031();
      return var8;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 2.1F;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      if (super.attackEntityAsMob(var1)) {
         if (var1 instanceof LivingEntity) {
            ((LivingEntity)var1).addPotionEffect(new EffectInstance(Effects.WITHER, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      AbstractArrowEntity var5 = super.method5032(var1, var2);
      var5.setFire(100);
      return var5;
   }

   @Override
   public boolean isPotionApplicable(EffectInstance potion) {
      return potion.getPotion() != Effects.WITHER ? super.isPotionApplicable(potion) : false;
   }
}
