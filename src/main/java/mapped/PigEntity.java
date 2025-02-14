package mapped;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class PigEntity extends AnimalEntity implements Class1071, Class1069 {
   private static String[] field5911;
   private static final DataParameter<Boolean> field5912 = EntityDataManager.<Boolean>createKey(PigEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Integer> field5913 = EntityDataManager.<Integer>createKey(PigEntity.class, DataSerializers.VARINT);
   private static final Ingredient field5914 = Ingredient.fromItems(Items.field38052, Items.field38053, Items.field38111);
   private final Class6500 field5915 = new Class6500(this.dataManager, field5913, field5912);

   public PigEntity(EntityType<? extends PigEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2747(this, 1.25));
      this.field5600.addGoal(3, new Class2785(this, 1.0));
      this.field5600.addGoal(4, new Class2680(this, 1.2, Ingredient.fromItems(Items.field38064), false));
      this.field5600.addGoal(4, new Class2680(this, 1.2, false, field5914));
      this.field5600.addGoal(5, new Class2764(this, 1.1));
      this.field5600.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(8, new Class2668(this));
   }

   public static MutableAttribute method4989() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 10.0).method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Override
   public boolean method4277() {
      Entity var3 = this.method3407();
      if (!(var3 instanceof PlayerEntity)) {
         return false;
      } else {
         PlayerEntity var4 = (PlayerEntity)var3;
         return var4.getHeldItemMainhand().getItem() == Items.field38064 || var4.getHeldItemOffhand().getItem() == Items.field38064;
      }
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5913.equals(var1) && this.world.isRemote) {
         this.field5915.method19689();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5912, false);
      this.dataManager.register(field5913, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      this.field5915.method19691(compound);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.field5915.method19692(compound);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26924;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26926;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26925;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26928, 0.15F, 1.0F);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      boolean var5 = this.method4381(var1.getHeldItem(var2));
      if (!var5 && this.method4943() && !this.isBeingRidden() && !var1.method2851()) {
         if (!this.world.isRemote) {
            var1.method3311(this);
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else {
         ActionResultType var6 = super.method4285(var1, var2);
         if (var6.isSuccessOrConsume()) {
            return var6;
         } else {
            ItemStack var7 = var1.getHeldItem(var2);
            return var7.getItem() != Items.field37886 ? ActionResultType.field14820 : var7.method32125(var1, this, var2);
         }
      }
   }

   @Override
   public boolean method4901() {
      return this.isAlive() && !this.isChild();
   }

   @Override
   public void dropInventory() {
      super.dropInventory();
      if (this.method4943()) {
         this.entityDropItem(Items.field37886);
      }
   }

   @Override
   public boolean method4943() {
      return this.field5915.method19694();
   }

   @Override
   public void method4942(SoundCategory var1) {
      this.field5915.method19693(true);
      if (var1 != null) {
         this.world.playSoundFromEntity((PlayerEntity)null, this, SoundEvents.field26927, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public Vector3d method3420(LivingEntity var1) {
      net.minecraft.util.Direction var4 = this.method3387();
      if (var4.getAxis() == Direction.Axis.Y) {
         return super.method3420(var1);
      } else {
         int[][] var5 = Class4527.method14422(var4);
         BlockPos var6 = this.getPosition();
         BlockPos.Mutable var7 = new BlockPos.Mutable();
         UnmodifiableIterator var8 = var1.getAvailablePoses().iterator();

         while (var8.hasNext()) {
            Pose var9 = (Pose)var8.next();
            AxisAlignedBB var10 = var1.getPoseAABB(var9);

            for (int[] var14 : var5) {
               var7.setPos(var6.getX() + var14[0], var6.getY(), var6.getZ() + var14[1]);
               double var15 = this.world.method7039(var7);
               if (Class4527.method14423(var15)) {
                  Vector3d var17 = Vector3d.method11331(var7, var15);
                  if (Class4527.method14424(this.world, var1, var10.offset(var17))) {
                     var1.setPose(var9);
                     return var17;
                  }
               }
            }
         }

         return super.method3420(var1);
      }
   }

   @Override
   public void method3353(ServerWorld var1, LightningBoltEntity var2) {
      if (var1.method6997() == Difficulty.PEACEFUL) {
         super.method3353(var1, var2);
      } else {
         ZombifiedPiglinEntity var5 = EntityType.ZOMBIFIED_PIGLIN.create(var1);
         var5.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
         var5.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
         var5.method4302(this.method4305());
         var5.method4308(this.isChild());
         if (this.method3381()) {
            var5.method3379(this.method3380());
            var5.method3382(this.method3383());
         }

         var5.method4278();
         var1.addEntity(var5);
         this.remove();
      }
   }

   @Override
   public void travel(Vector3d var1) {
      this.method4988(this, this.field5915, var1);
   }

   @Override
   public float method4980() {
      return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED) * 0.225F;
   }

   @Override
   public void method4981(Vector3d var1) {
      super.travel(var1);
   }

   @Override
   public boolean method4982() {
      return this.field5915.method19690(this.getRNG());
   }

   public PigEntity method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.PIG.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5914.test(var1);
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.6F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }
}
