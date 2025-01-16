package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public abstract class Class1082 extends MonsterEntity implements Class1022 {
   private final Class2758<Class1082> field5946 = new Class2758<Class1082>(this, 1.0, 20, 15.0F);
   private final Class2647 field5947 = new Class2652(this, this, 1.2, false);

   public Class1082(EntityType<? extends Class1082> var1, World var2) {
      super(var1, var2);
      this.method5031();
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(2, new Class2617(this));
      this.field5600.addGoal(3, new Class2640(this, 1.0));
      this.field5600.addGoal(3, new Class2770<WolfEntity>(this, WolfEntity.class, 6.0F, 1.0, 1.2));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(6, new Class2668(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this));
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<TurtleEntity>(this, TurtleEntity.class, 10, true, false, TurtleEntity.field5963));
   }

   public static MutableAttribute method5029() {
      return MonsterEntity.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(this.method5030(), 0.15F, 1.0F);
   }

   public abstract SoundEvent method5030();

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33506;
   }

   @Override
   public void livingTick() {
      boolean var3 = this.method4310();
      if (var3) {
         ItemStack var4 = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
         if (!var4.isEmpty()) {
            if (var4.method32115()) {
               var4.method32118(var4.method32117() + this.rand.nextInt(2));
               if (var4.method32117() >= var4.method32119()) {
                  this.sendBreakAnimation(EquipmentSlotType.HEAD);
                  this.setItemStackToSlot(EquipmentSlotType.HEAD, ItemStack.EMPTY);
               }
            }

            var3 = false;
         }

         if (var3) {
            this.setFire(8);
         }
      }

      super.livingTick();
   }

   @Override
   public void updateRidden() {
      super.updateRidden();
      if (this.getRidingEntity() instanceof CreatureEntity) {
         CreatureEntity var3 = (CreatureEntity)this.getRidingEntity();
         this.renderYawOffset = var3.renderYawOffset;
      }
   }

   @Override
   public void method4270(Class9755 var1) {
      super.method4270(var1);
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BOW));
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      this.method4270(var2);
      this.method4273(var2);
      this.method5031();
      this.method4281(this.rand.nextFloat() < 0.55F * var2.method38330());
      if (this.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()) {
         LocalDate var8 = LocalDate.now();
         int var9 = var8.get(ChronoField.DAY_OF_MONTH);
         int var10 = var8.get(ChronoField.MONTH_OF_YEAR);
         if (var10 == 10 && var9 == 31 && this.rand.nextFloat() < 0.25F) {
            this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(!(this.rand.nextFloat() < 0.1F) ? Blocks.field36589 : Blocks.field36590));
            this.field5607[EquipmentSlotType.HEAD.getIndex()] = 0.0F;
         }
      }

      return var4;
   }

   public void method5031() {
      if (this.world != null && !this.world.isRemote) {
         this.field5600.method20003(this.field5947);
         this.field5600.method20003(this.field5946);
         ItemStack var3 = this.getHeldItem(ProjectileHelper.method36389(this, Items.BOW));
         if (var3.getItem() != Items.BOW) {
            this.field5600.addGoal(4, this.field5947);
         } else {
            int var4 = 20;
            if (this.world.method6997() != Difficulty.HARD) {
               var4 = 40;
            }

            this.field5946.method10961(var4);
            this.field5600.addGoal(4, this.field5946);
         }
      }
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      ItemStack var5 = this.findAmmo(this.getHeldItem(ProjectileHelper.method36389(this, Items.BOW)));
      AbstractArrowEntity var6 = this.method5032(var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.getPosYHeight(0.3333333333333333) - var6.getPosY();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double) MathHelper.sqrt(var7 * var7 + var11 * var11);
      var6.shoot(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.world.method6997().getId() * 4));
      this.playSound(SoundEvents.field27070, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
      this.world.addEntity(var6);
   }

   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      return ProjectileHelper.method36390(this, var1, var2);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Items.BOW;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5031();
   }

   @Override
   public void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2) {
      super.setItemStackToSlot(var1, var2);
      if (!this.world.isRemote) {
         this.method5031();
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 1.74F;
   }

   @Override
   public double getYOffset() {
      return -0.6;
   }
}
