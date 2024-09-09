package mapped;

import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.LinkedHashSet;
import java.util.Random;

public class Class1070 extends Class1018 implements Class1071, Class1069 {
   private static String[] field5902;
   private static final Class120 field5903 = Class120.method339(Items.field37349);
   private static final Class120 field5904 = Class120.method339(Items.field37349, Items.field38065);
   private static final DataParameter<Integer> field5905 = EntityDataManager.<Integer>createKey(Class1070.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5906 = EntityDataManager.<Boolean>createKey(Class1070.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5907 = EntityDataManager.<Boolean>createKey(Class1070.class, DataSerializers.field33398);
   private final Class6500 field5908 = new Class6500(this.dataManager, field5905, field5907);
   private Class2680 field5909;
   private Class2747 field5910;

   public Class1070(EntityType<? extends Class1070> var1, World var2) {
      super(var1, var2);
      this.preventEntitySpawning = true;
      this.method4224(Class2163.field14191, -1.0F);
      this.method4224(Class2163.field14190, 0.0F);
      this.method4224(Class2163.field14195, 0.0F);
      this.method4224(Class2163.field14196, 0.0F);
   }

   public static boolean method4976(EntityType<Class1070> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockPos.Mutable var7 = var3.method8354();

      do {
         var7.method8379(Direction.field673);
      } while (var1.getFluidState(var7).method23486(FluidTags.field40470));

      return var1.getBlockState(var7).isAir();
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5905.equals(var1) && this.world.isRemote) {
         this.field5908.method19689();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5905, 0);
      this.dataManager.register(field5906, false);
      this.dataManager.register(field5907, false);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      this.field5908.method19691(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5908.method19692(var1);
   }

   @Override
   public boolean method4943() {
      return this.field5908.method19694();
   }

   @Override
   public boolean method4901() {
      return this.isAlive() && !this.isChild();
   }

   @Override
   public void method4942(Class2266 var1) {
      this.field5908.method19693(true);
      if (var1 != null) {
         this.world.method6744((PlayerEntity)null, this, SoundEvents.field27101, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4219() {
      this.field5910 = new Class2747(this, 1.65);
      this.field5600.method20002(1, this.field5910);
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5909 = new Class2680(this, 1.4, false, field5904);
      this.field5600.method20002(3, this.field5909);
      this.field5600.method20002(4, new Class2638(this, 1.5));
      this.field5600.method20002(5, new Class2764(this, 1.1));
      this.field5600.method20002(7, new Class2736(this, 1.0, 60));
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5600.method20002(9, new Class2612(this, Class1070.class, 8.0F));
   }

   public void method4977(boolean var1) {
      this.dataManager.method35446(field5906, var1);
   }

   public boolean method4978() {
      return !(this.getRidingEntity() instanceof Class1070) ? this.dataManager.<Boolean>method35445(field5906) : ((Class1070)this.getRidingEntity()).method4978();
   }

   @Override
   public boolean method3107(Fluid var1) {
      return var1.method25067(FluidTags.field40470);
   }

   @Override
   public double method3310() {
      float var3 = Math.min(0.25F, this.field4960);
      float var4 = this.field4961;
      return (double)this.getHeight() - 0.19 + (double)(0.12F * MathHelper.cos(var4 * 1.5F) * 2.0F * var3);
   }

   @Override
   public boolean method4277() {
      Entity var3 = this.method3407();
      if (!(var3 instanceof PlayerEntity)) {
         return false;
      } else {
         PlayerEntity var4 = (PlayerEntity)var3;
         return var4.getHeldItemMainhand().getItem() == Items.field38065 || var4.method3091().getItem() == Items.field38065;
      }
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.checkNoEntityCollision(this);
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Override
   public Vector3d method3420(LivingEntity var1) {
      Vector3d[] var4 = new Vector3d[]{
         method3419((double)this.getWidth(), (double)var1.getWidth(), var1.rotationYaw),
         method3419((double)this.getWidth(), (double)var1.getWidth(), var1.rotationYaw - 22.5F),
         method3419((double)this.getWidth(), (double)var1.getWidth(), var1.rotationYaw + 22.5F),
         method3419((double)this.getWidth(), (double)var1.getWidth(), var1.rotationYaw - 45.0F),
         method3419((double)this.getWidth(), (double)var1.getWidth(), var1.rotationYaw + 45.0F)
      };
      LinkedHashSet<BlockPos> var5 = Sets.newLinkedHashSet();
      double var6 = this.getBoundingBox().maxY;
      double var8 = this.getBoundingBox().minY - 0.5;
      BlockPos.Mutable var10 = new BlockPos.Mutable();

      for (Vector3d var14 : var4) {
         var10.method8373(this.getPosX() + var14.x, var6, this.getPosZ() + var14.z);

         for (double var15 = var6; var15 > var8; var15--) {
            var5.add(var10.toImmutable());
            var10.method8379(Direction.DOWN);
         }
      }

      for (BlockPos var24 : var5) {
         if (!this.world.getFluidState(var24).method23486(FluidTags.field40470)) {
            double var17 = this.world.method7039(var24);
            if (Class4527.method14423(var17)) {
               Vector3d var19 = Vector3d.method11331(var24, var17);
               UnmodifiableIterator var20 = var1.getAvailablePoses().iterator();

               while (var20.hasNext()) {
                  Pose var21 = (Pose)var20.next();
                  AxisAlignedBB var22 = var1.getPoseAABB(var21);
                  if (Class4527.method14424(this.world, var1, var22.offset(var19))) {
                     var1.setPose(var21);
                     return var19;
                  }
               }
            }
         }
      }

      return new Vector3d(this.getPosX(), this.getBoundingBox().maxY, this.getPosZ());
   }

   @Override
   public void travel(Vector3d var1) {
      this.setAIMoveSpeed(this.method4979());
      this.method4988(this, this.field5908, var1);
   }

   public float method4979() {
      return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED) * (!this.method4978() ? 1.0F : 0.66F);
   }

   @Override
   public float method4980() {
      return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED) * (!this.method4978() ? 0.55F : 0.23F);
   }

   @Override
   public void method4981(Vector3d var1) {
      super.travel(var1);
   }

   @Override
   public float determineNextStepDistance() {
      return this.distanceWalkedOnStepModified + 0.6F;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(!this.isInLava() ? SoundEvents.field27098 : SoundEvents.field27099, 1.0F, 1.0F);
   }

   @Override
   public boolean method4982() {
      return this.field5908.method19690(this.getRNG());
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
      this.doBlockCollisions();
      if (!this.isInLava()) {
         super.updateFallState(var1, var3, var4, var5);
      } else {
         this.fallDistance = 0.0F;
      }
   }

   @Override
   public void tick() {
      if (this.method4984() && this.rand.nextInt(140) == 0) {
         this.playSound(SoundEvents.field27094, 1.0F, this.getSoundPitch());
      } else if (this.method4983() && this.rand.nextInt(60) == 0) {
         this.playSound(SoundEvents.field27095, 1.0F, this.getSoundPitch());
      }

      BlockState var3 = this.world.getBlockState(this.getPosition());
      BlockState var4 = this.getStateBelow();
      boolean var5 = var3.method23446(BlockTags.field32808) || var4.method23446(BlockTags.field32808) || this.method3427(FluidTags.field40470) > 0.0;
      this.method4977(!var5);
      super.tick();
      this.method4985();
      this.doBlockCollisions();
   }

   private boolean method4983() {
      return this.field5910 != null && this.field5910.method10956();
   }

   private boolean method4984() {
      return this.field5909 != null && this.field5909.method10900();
   }

   @Override
   public boolean method4222() {
      return true;
   }

   private void method4985() {
      if (this.isInLava()) {
         ISelectionContext var3 = ISelectionContext.forEntity(this);
         if (var3.method14950(Class3404.field19082, this.getPosition(), true)
            && !this.world.getFluidState(this.getPosition().up()).method23486(FluidTags.field40470)) {
            this.onGround = true;
         } else {
            this.setMotion(this.getMotion().scale(0.5).add(0.0, 0.05, 0.0));
         }
      }
   }

   public static Class7037 method4986() {
      return Class1006.method4220().method21849(Attributes.MOVEMENT_SPEED, 0.175F).method21849(Attributes.field42106, 16.0);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method4983() && !this.method4984() ? SoundEvents.field27093 : null;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27097;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27096;
   }

   @Override
   public boolean canFitPassenger(Entity var1) {
      return this.getPassengers().isEmpty() && !this.areEyesInFluid(FluidTags.field40470);
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public boolean isBurning() {
      return false;
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6994(this, var1);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      if (!var2.getBlockState(var1).method23449().method23486(FluidTags.field40470)) {
         return !this.isInLava() ? 0.0F : Float.NEGATIVE_INFINITY;
      } else {
         return 10.0F;
      }
   }

   public Class1070 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41088.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5903.test(var1);
   }

   @Override
   public void dropInventory() {
      super.dropInventory();
      if (this.method4943()) {
         this.entityDropItem(Items.field37886);
      }
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
            if (var5 && !this.isSilent()) {
               this.world
                  .method6743(
                     (PlayerEntity)null,
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     SoundEvents.field27100,
                     this.method2864(),
                     1.0F,
                     1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
                  );
            }

            return var6;
         } else {
            ItemStack var7 = var1.getHeldItem(var2);
            return var7.getItem() != Items.field37886 ? ActionResultType.field14820 : var7.method32125(var1, this, var2);
         }
      }
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.6F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (!this.isChild()) {
         Object var8;
         if (this.rand.nextInt(30) != 0) {
            if (this.rand.nextInt(10) != 0) {
               var8 = new Class5097(0.5F);
            } else {
               Class1045 var9 = EntityType.field41088.create(var1.method6970());
               var9.method4770(-24000);
               var8 = this.method4987(var1, var2, var9, (Class5093)null);
            }
         } else {
            Class1006 var10 = EntityType.field41110.create(var1.method6970());
            var8 = this.method4987(var1, var2, var10, new Class5096(Class1038.method4661(this.rand), false));
            var10.setItemStackToSlot(EquipmentSlotType.field13731, new ItemStack(Items.field38065));
            this.method4942((Class2266)null);
         }

         return super.method4276(var1, var2, var3, (Class5093)var8, var5);
      } else {
         return super.method4276(var1, var2, var3, var4, var5);
      }
   }

   private Class5093 method4987(Class1659 var1, Class9755 var2, Class1006 var3, Class5093 var4) {
      var3.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
      var3.method4276(var1, var2, Class2202.field14397, var4, (CompoundNBT)null);
      var3.startRiding(this, true);
      return new Class5097(0.0F);
   }
}
