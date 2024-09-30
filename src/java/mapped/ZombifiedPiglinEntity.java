package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.IAngerable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.UUID;

public class ZombifiedPiglinEntity extends ZombieEntity implements IAngerable {
   private static final UUID field5860 = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final AttributeModifier field5861 = new AttributeModifier(field5860, "Attacking speed boost", 0.05, AttributeModifier.Operation.ADDITION);
   private static final RangedInteger field5862 = TickRangeConverter.convertRange(0, 1);
   private int field5863;
   private static final RangedInteger field5864 = TickRangeConverter.convertRange(20, 39);
   private int field5865;
   private UUID field5866;
   private static final RangedInteger field5867 = TickRangeConverter.convertRange(4, 6);
   private int field5868;

   public ZombifiedPiglinEntity(EntityType<? extends ZombifiedPiglinEntity> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14190, 8.0F);
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field5866 = var1;
   }

   @Override
   public double getYOffset() {
      return !this.isChild() ? -0.45 : -0.05;
   }

   @Override
   public void applyEntityAI() {
      this.field5600.addGoal(2, new ZombieAttackGoal(this, 1.0, false));
      this.field5600.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5601.addGoal(1, new HurtByTargetGoal(this).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.addGoal(3, new ResetAngerGoal<ZombifiedPiglinEntity>(this, true));
   }

   public static Class7037 func_234352_eU_() {
      return ZombieEntity.method4653().method21849(Attributes.field42116, 0.0).method21849(Attributes.MOVEMENT_SPEED, 0.23F).method21849(Attributes.ATTACK_DAMAGE, 5.0);
   }

   @Override
   public boolean shouldDrown() {
      return false;
   }

   @Override
   public void updateAITasks() {
      ModifiableAttributeInstance var3 = this.getAttribute(Attributes.MOVEMENT_SPEED);
      if (!this.method4369()) {
         if (var3.method38665(field5861)) {
            var3.method38670(field5861);
         }
      } else {
         if (!this.isChild() && !var3.method38665(field5861)) {
            var3.method38667(field5861);
         }

         this.method4875();
      }

      this.method4366((ServerWorld)this.world, true);
      if (this.method4232() != null) {
         this.method4876();
      }

      if (this.method4369()) {
         this.field4971 = this.ticksExisted;
      }

      super.updateAITasks();
   }

   private void method4875() {
      if (this.field5863 > 0) {
         this.field5863--;
         if (this.field5863 == 0) {
            this.method4878();
         }
      }
   }

   private void method4876() {
      if (this.field5868 <= 0) {
         if (this.method4231().method35460(this.method4232())) {
            this.method4877();
         }

         this.field5868 = field5867.method29319(this.rand);
      } else {
         this.field5868--;
      }
   }

   private void method4877() {
      double var3 = this.getAttributeValue(Attributes.field42106);
      AxisAlignedBB var5 = AxisAlignedBB.method19657(this.getPositionVec()).grow(var3, 10.0, var3);
      this.world
         .<ZombifiedPiglinEntity>method7183(ZombifiedPiglinEntity.class, var5)
         .stream()
         .filter(var1 -> var1 != this)
         .filter(var0 -> var0.method4232() == null)
         .filter(var1 -> !var1.isOnSameTeam(this.method4232()))
         .forEach(var1 -> var1.method4233(this.method4232()));
   }

   private void method4878() {
      this.playSound(SoundEvents.field27295, this.getSoundVolume() * 2.0F, this.getSoundPitch() * 1.8F);
   }

   @Override
   public void method4233(LivingEntity var1) {
      if (this.method4232() == null && var1 != null) {
         this.field5863 = field5862.method29319(this.rand);
         this.field5868 = field5867.method29319(this.rand);
      }

      if (var1 instanceof PlayerEntity) {
         this.method3016((PlayerEntity)var1);
      }

      super.method4233(var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5864.method29319(this.rand));
   }



   public static boolean method4879(EntityType<ZombifiedPiglinEntity> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.PEACEFUL && var1.getBlockState(var3.down()).getBlock() != Blocks.field36891;
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      return var1.checkNoEntityCollision(this) && !var1.method7014(this.getBoundingBox());
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      this.method4364(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4365((ServerWorld)this.world, var1);
   }

   @Override
   public void method4347(int var1) {
      this.field5865 = var1;
   }

   @Override
   public int method4348() {
      return this.field5865;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      return !this.isInvulnerableTo(source) ? super.attackEntityFrom(source, var2) : false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method4369() ? SoundEvents.field27294 : SoundEvents.field27295;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27297;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27296;
   }

   @Override
   public void method4270(Class9755 var1) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field37815));
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }

   @Override
   public void method4663() {
      this.getAttribute(Attributes.field42116).method38661(0.0);
   }

   @Override
   public UUID method4350() {
      return this.field5866;
   }

   @Override
   public boolean method4344(PlayerEntity var1) {
      return this.method4367(var1);
   }
}
