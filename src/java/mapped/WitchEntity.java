package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.*;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class WitchEntity extends Class1026 implements Class1022 {
   private static final UUID field5718 = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final AttributeModifier field5719 = new AttributeModifier(field5718, "Drinking speed penalty", -0.25, AttributeModifier.Operation.ADDITION);
   private static final DataParameter<Boolean> field5720 = EntityDataManager.<Boolean>createKey(WitchEntity.class, DataSerializers.BOOLEAN);
   private int field5721;
   private Class2712<Class1026> field5722;
   private Class2711<PlayerEntity> field5723;

   public WitchEntity(EntityType<? extends WitchEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5722 = new Class2712<Class1026>(
         this, Class1026.class, true, var1 -> var1 != null && this.method4552() && var1.getType() != EntityType.WITCH
      );
      this.field5723 = new Class2711<PlayerEntity>(this, PlayerEntity.class, 10, true, false, (Predicate<LivingEntity>)null);
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(2, new Class2598(this, 1.0, 60, 10.0F));
      this.field5600.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(3, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(3, new Class2668(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1026.class));
      this.field5601.addGoal(2, this.field5722);
      this.field5601.addGoal(3, this.field5723);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.getDataManager().register(field5720, false);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27233;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27237;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27235;
   }

   public void method4567(boolean var1) {
      this.getDataManager().set(field5720, var1);
   }

   public boolean method4568() {
      return this.getDataManager().<Boolean>method35445(field5720);
   }

   public static MutableAttribute method4569() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 26.0).method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void livingTick() {
      if (!this.world.isRemote && this.isAlive()) {
         this.field5722.method10927();
         if (this.field5722.method10926() > 0) {
            this.field5723.method10925(false);
         } else {
            this.field5723.method10925(true);
         }

         if (!this.method4568()) {
            Potion var7 = null;
            if (this.rand.nextFloat() < 0.15F && this.areEyesInFluid(FluidTags.WATER) && !this.isPotionActive(Effects.WATER_BREATHING)) {
               var7 = Potions.WATER_BREATHING;
            } else if (this.rand.nextFloat() < 0.15F
               && (this.isBurning() || this.getLastDamageSource() != null && this.getLastDamageSource().method31141())
               && !this.isPotionActive(Effects.FIRE_RESISTANCE)) {
               var7 = Potions.FIRE_RESISTANCE;
            } else if (this.rand.nextFloat() < 0.05F && this.getHealth() < this.getMaxHealth()) {
               var7 = Potions.HEALING;
            } else if (this.rand.nextFloat() < 0.5F
               && this.getAttackTarget() != null
               && !this.isPotionActive(Effects.SPEED)
               && this.getAttackTarget().getDistanceSq(this) > 121.0) {
               var7 = Potions.SWIFTNESS;
            }

            if (var7 != null) {
               this.setItemStackToSlot(EquipmentSlotType.MAINHAND, PotionUtils.addPotionToItemStack(new ItemStack(Items.field37971), var7));
               this.field5721 = this.getHeldItemMainhand().getUseDuration();
               this.method4567(true);
               if (!this.isSilent()) {
                  this.world
                     .playSound(
                        (PlayerEntity)null,
                        this.getPosX(),
                        this.getPosY(),
                        this.getPosZ(),
                        SoundEvents.field27236,
                        this.getSoundCategory(),
                        1.0F,
                        0.8F + this.rand.nextFloat() * 0.4F
                     );
               }

               ModifiableAttributeInstance var8 = this.getAttribute(Attributes.MOVEMENT_SPEED);
               var8.removeModifier(field5719);
               var8.applyNonPersistentModifier(field5719);
            }
         } else if (this.field5721-- <= 0) {
            this.method4567(false);
            ItemStack var3 = this.getHeldItemMainhand();
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
            if (var3.getItem() == Items.field37971) {
               List<EffectInstance> var4 = PotionUtils.getEffectsFromStack(var3);
               if (var4 != null) {
                  for (EffectInstance var6 : var4) {
                     this.addPotionEffect(new EffectInstance(var6));
                  }
               }
            }

            this.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(field5719);
         }

         if (this.rand.nextFloat() < 7.5E-4F) {
            this.world.setEntityState(this, (byte)15);
         }
      }

      super.livingTick();
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field27234;
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 15) {
         super.handleStatusUpdate(var1);
      } else {
         for (int var4 = 0; var4 < this.rand.nextInt(35) + 10; var4++) {
            this.world
               .addParticle(
                  ParticleTypes.field34100,
                  this.getPosX() + this.rand.nextGaussian() * 0.13F,
                  this.getBoundingBox().maxY + 0.5 + this.rand.nextGaussian() * 0.13F,
                  this.getPosZ() + this.rand.nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }
   }

   @Override
   public float applyPotionDamageCalculations(DamageSource var1, float var2) {
      var2 = super.applyPotionDamageCalculations(var1, var2);
      if (var1.getTrueSource() == this) {
         var2 = 0.0F;
      }

      if (var1.method31144()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      if (!this.method4568()) {
         Vector3d var5 = var1.getMotion();
         double var6 = var1.getPosX() + var5.x - this.getPosX();
         double var8 = var1.getPosYEye() - 1.1F - this.getPosY();
         double var10 = var1.getPosZ() + var5.z - this.getPosZ();
         float var12 = MathHelper.sqrt(var6 * var6 + var10 * var10);
         Potion var13 = Potions.HARMING;
         if (!(var1 instanceof Class1026)) {
            if (var12 >= 8.0F && !var1.isPotionActive(Effects.SLOWNESS)) {
               var13 = Potions.SLOWNESS;
            } else if (var1.getHealth() >= 8.0F && !var1.isPotionActive(Effects.POISON)) {
               var13 = Potions.POISON;
            } else if (var12 <= 3.0F && !var1.isPotionActive(Effects.WEAKNESS) && this.rand.nextFloat() < 0.25F) {
               var13 = Potions.WEAKNESS;
            }
         } else {
            if (!(var1.getHealth() <= 4.0F)) {
               var13 = Potions.REGENERATION;
            } else {
               var13 = Potions.HEALING;
            }

            this.setAttackTarget((LivingEntity)null);
         }

         PotionEntity var14 = new PotionEntity(this.world, this);
         var14.method3511(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), var13));
         var14.rotationPitch -= -20.0F;
         var14.shoot(var6, var8 + (double)(var12 * 0.2F), var10, 0.75F, 8.0F);
         if (!this.isSilent()) {
            this.world
               .playSound(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  SoundEvents.field27238,
                  this.getSoundCategory(),
                  1.0F,
                  0.8F + this.rand.nextFloat() * 0.4F
               );
         }

         this.world.addEntity(var14);
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 1.62F;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public boolean method4570() {
      return false;
   }
}
