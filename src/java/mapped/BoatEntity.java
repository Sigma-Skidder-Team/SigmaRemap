package mapped;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CSteerBoatPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BoatEntity extends Entity {
   private static final DataParameter<Integer> field5524 = EntityDataManager.<Integer>createKey(BoatEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5525 = EntityDataManager.<Integer>createKey(BoatEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Float> field5526 = EntityDataManager.<Float>createKey(BoatEntity.class, DataSerializers.field33392);
   private static final DataParameter<Integer> field5527 = EntityDataManager.<Integer>createKey(BoatEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5528 = EntityDataManager.<Boolean>createKey(BoatEntity.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5529 = EntityDataManager.<Boolean>createKey(BoatEntity.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field5530 = EntityDataManager.<Integer>createKey(BoatEntity.class, DataSerializers.VARINT);
   private final float[] field5531 = new float[2];
   private float field5532;
   private float field5533;
   private float field5534;
   private int field5535;
   private double field5536;
   private double field5537;
   private double field5538;
   private double field5539;
   private double field5540;
   private boolean field5541;
   private boolean field5542;
   private boolean field5543;
   private boolean field5544;
   private double field5545;
   private float field5546;
   private Class2096 field5547;
   private Class2096 field5548;
   private double field5549;
   private boolean field5550;
   private boolean field5551;
   private float field5552;
   private float field5553;
   private float field5554;

   public BoatEntity(EntityType<? extends BoatEntity> var1, World var2) {
      super(var1, var2);
      this.preventEntitySpawning = true;
   }

   public BoatEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.field41011, var1);
      this.setPosition(var2, var4, var6);
      this.setMotion(Vector3d.ZERO);
      this.prevPosX = var2;
      this.prevPosY = var4;
      this.prevPosZ = var6;
   }

   @Override
   public float getEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969;
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5524, 0);
      this.dataManager.register(field5525, 1);
      this.dataManager.register(field5526, 0.0F);
      this.dataManager.register(field5527, Class2099.field13680.ordinal());
      this.dataManager.register(field5528, false);
      this.dataManager.register(field5529, false);
      this.dataManager.register(field5530, 0);
   }

   @Override
   public boolean canCollide(Entity var1) {
      return method4146(this, var1);
   }

   public static boolean method4146(Entity var0, Entity var1) {
      return (var1.method3306() || var1.canBePushed()) && !var0.method3416(var1);
   }

   @Override
   public boolean method3306() {
      return true;
   }

   @Override
   public boolean canBePushed() {
      return true;
   }

   @Override
   public Vector3d func_241839_a(Direction var1, TeleportationRepositioner var2) {
      return LivingEntity.func_242288_h(super.func_241839_a(var1, var2));
   }

   @Override
   public double method3310() {
      return -0.1;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.isInvulnerableTo(var1)) {
         return false;
      } else if (!this.world.isRemote && !this.removed) {
         this.method4169(-this.method4170());
         this.method4164(10);
         this.method4162(this.method4163() + var2 * 10.0F);
         this.markVelocityChanged();
         boolean var5 = var1.getTrueSource() instanceof PlayerEntity && ((PlayerEntity)var1.getTrueSource()).abilities.isCreativeMode;
         if (var5 || this.method4163() > 40.0F) {
            if (!var5 && this.world.getGameRules().getBoolean(Class5462.field24229)) {
               this.entityDropItem(this.getItemBoat());
            }

            this.remove();
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public void method3354(boolean var1) {
      if (!this.world.isRemote) {
         this.field5550 = true;
         this.field5551 = var1;
         if (this.method4167() == 0) {
            this.method4166(60);
         }
      }

      this.world
         .addParticle(
            ParticleTypes.field34099,
            this.getPosX() + (double)this.rand.nextFloat(),
            this.getPosY() + 0.7,
            this.getPosZ() + (double)this.rand.nextFloat(),
            0.0,
            0.0,
            0.0
         );
      if (this.rand.nextInt(20) == 0) {
         this.world
            .method6745(
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               this.method2860(),
               this.method2864(),
               1.0F,
               0.8F + 0.4F * this.rand.nextFloat(),
               false
            );
      }
   }

   @Override
   public void applyEntityCollision(Entity var1) {
      if (!(var1 instanceof BoatEntity)) {
         if (var1.getBoundingBox().minY <= this.getBoundingBox().minY) {
            super.applyEntityCollision(var1);
         }
      } else if (var1.getBoundingBox().minY < this.getBoundingBox().maxY) {
         super.applyEntityCollision(var1);
      }
   }

   public Item getItemBoat() {
      switch (Class7986.field34313[this.method4172().ordinal()]) {
         case 1:
         default:
            return Items.field37889;
         case 2:
            return Items.field38121;
         case 3:
            return Items.field38122;
         case 4:
            return Items.field38123;
         case 5:
            return Items.field38124;
         case 6:
            return Items.field38125;
      }
   }

   @Override
   public void performHurtAnimation() {
      this.method4169(-this.method4170());
      this.method4164(10);
      this.method4162(this.method4163() * 11.0F);
   }

   @Override
   public boolean canBeCollidedWith() {
      return !this.removed;
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field5536 = var1;
      this.field5537 = var3;
      this.field5538 = var5;
      this.field5539 = (double)var7;
      this.field5540 = (double)var8;
      this.field5535 = 10;
   }

   @Override
   public net.minecraft.util.Direction method3387() {
      return this.method3386().method537();
   }

   @Override
   public void tick() {
      this.field5548 = this.field5547;
      this.field5547 = this.method4153();
      if (this.field5547 != Class2096.field13656 && this.field5547 != Class2096.field13657) {
         this.field5533 = 0.0F;
      } else {
         this.field5533++;
      }

      if (!this.world.isRemote && this.field5533 >= 60.0F) {
         this.removePassengers();
      }

      if (this.method4165() > 0) {
         this.method4164(this.method4165() - 1);
      }

      if (this.method4163() > 0.0F) {
         this.method4162(this.method4163() - 1.0F);
      }

      super.tick();
      this.method4150();
      if (!this.canPassengerSteer()) {
         this.setMotion(Vector3d.ZERO);
      } else {
         if (this.getPassengers().isEmpty() || !(this.getPassengers().get(0) instanceof PlayerEntity)) {
            this.method4151(false, false);
         }

         this.method4158();
         if (this.world.isRemote) {
            this.method4159();
            this.world.method6811(new CSteerBoatPacket(this.method4161(0), this.method4161(1)));
         }

         this.move(MoverType.SELF, this.getMotion());
      }

      this.method4148();

      for (int var3 = 0; var3 <= 1; var3++) {
         if (!this.method4161(var3)) {
            this.field5531[var3] = 0.0F;
         } else {
            if (!this.isSilent()
               && (double)(this.field5531[var3] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && ((double)this.field5531[var3] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               SoundEvent var4 = this.method4149();
               if (var4 != null) {
                  Vector3d var5 = this.getLook(1.0F);
                  double var6 = var3 != 1 ? var5.z : -var5.z;
                  double var8 = var3 != 1 ? -var5.x : var5.x;
                  this.world
                     .method6743(
                        (PlayerEntity)null,
                        this.getPosX() + var6,
                        this.getPosY(),
                        this.getPosZ() + var8,
                        var4,
                        this.method2864(),
                        1.0F,
                        0.8F + 0.4F * this.rand.nextFloat()
                     );
               }
            }

            this.field5531[var3] = (float)((double)this.field5531[var3] + (float) (Math.PI / 8));
         }
      }

      this.doBlockCollisions();
      List var11 = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox().method19663(0.2F, -0.01F, 0.2F), Class8088.method27981(this));
      if (!var11.isEmpty()) {
         boolean var12 = !this.world.isRemote && !(this.method3407() instanceof PlayerEntity);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            Entity var10 = (Entity)var11.get(var13);
            if (!var10.method3409(this)) {
               if (var12
                  && this.getPassengers().size() < 2
                  && !var10.isPassenger()
                  && var10.getWidth() < this.getWidth()
                  && var10 instanceof LivingEntity
                  && !(var10 instanceof WaterMobEntity)
                  && !(var10 instanceof PlayerEntity)) {
                  var10.method3311(this);
               } else {
                  this.applyEntityCollision(var10);
               }
            }
         }
      }
   }

   private void method4148() {
      if (!this.world.isRemote) {
         if (!this.field5550) {
            this.method4166(0);
         }

         int var3 = this.method4167();
         if (var3 > 0) {
            this.method4166(--var3);
            int var4 = 60 - var3 - 1;
            if (var4 > 0 && var3 == 0) {
               this.method4166(0);
               Vector3d var5 = this.getMotion();
               if (!this.field5551) {
                  this.setMotion(var5.x, !this.method3410(PlayerEntity.class) ? 0.6 : 2.7, var5.z);
               } else {
                  this.setMotion(var5.add(0.0, -0.7, 0.0));
                  this.removePassengers();
               }
            }

            this.field5550 = false;
         }
      } else {
         int var7 = this.method4167();
         if (var7 <= 0) {
            this.field5552 -= 0.1F;
         } else {
            this.field5552 += 0.05F;
         }

         this.field5552 = MathHelper.clamp(this.field5552, 0.0F, 1.0F);
         this.field5554 = this.field5553;
         this.field5553 = 10.0F * (float)Math.sin((double)(0.5F * (float)this.world.getGameTime())) * this.field5552;
      }
   }

   @Nullable
   public SoundEvent method4149() {
      switch (Class7986.field34314[this.method4153().ordinal()]) {
         case 1:
         case 2:
         case 3:
            return SoundEvents.field26408;
         case 4:
            return SoundEvents.field26407;
         case 5:
         default:
            return null;
      }
   }

   private void method4150() {
      if (this.canPassengerSteer()) {
         this.field5535 = 0;
         this.setPacketCoordinates(this.getPosX(), this.getPosY(), this.getPosZ());
      }

      if (this.field5535 > 0) {
         double var3 = this.getPosX() + (this.field5536 - this.getPosX()) / (double)this.field5535;
         double var5 = this.getPosY() + (this.field5537 - this.getPosY()) / (double)this.field5535;
         double var7 = this.getPosZ() + (this.field5538 - this.getPosZ()) / (double)this.field5535;
         double var9 = MathHelper.wrapDegrees(this.field5539 - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var9 / (double)this.field5535);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field5540 - (double)this.rotationPitch) / (double)this.field5535);
         this.field5535--;
         this.setPosition(var3, var5, var7);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }
   }

   public void method4151(boolean var1, boolean var2) {
      this.dataManager.method35446(field5528, var1);
      this.dataManager.method35446(field5529, var2);
   }

   public float method4152(int var1, float var2) {
      return !this.method4161(var1)
         ? 0.0F
         : (float) MathHelper.method37779((double)this.field5531[var1] - (float) (Math.PI / 8), (double)this.field5531[var1], (double)var2);
   }

   private Class2096 method4153() {
      Class2096 var3 = this.method4157();
      if (var3 == null) {
         if (!this.method4156()) {
            float var4 = this.method4155();
            if (!(var4 > 0.0F)) {
               return Class2096.field13659;
            } else {
               this.field5546 = var4;
               return Class2096.field13658;
            }
         } else {
            return Class2096.field13655;
         }
      } else {
         this.field5545 = this.getBoundingBox().maxY;
         return var3;
      }
   }

   public float method4154() {
      AxisAlignedBB var3 = this.getBoundingBox();
      int var4 = MathHelper.floor(var3.minX);
      int var5 = MathHelper.method37774(var3.maxX);
      int var6 = MathHelper.floor(var3.maxY);
      int var7 = MathHelper.method37774(var3.maxY - this.field5549);
      int var8 = MathHelper.floor(var3.minZ);
      int var9 = MathHelper.method37774(var3.maxZ);
      BlockPos.Mutable var10 = new BlockPos.Mutable();

      label45:
      for (int var11 = var6; var11 < var7; var11++) {
         float var12 = 0.0F;

         for (int var13 = var4; var13 < var5; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var10.method8372(var13, var11, var14);
               FluidState var15 = this.world.getFluidState(var10);
               if (var15.method23486(FluidTags.field40469)) {
                  var12 = Math.max(var12, var15.method23475(this.world, var10));
               }

               if (var12 >= 1.0F) {
                  continue label45;
               }
            }
         }

         if (var12 < 1.0F) {
            return (float)var10.getY() + var12;
         }
      }

      return (float)(var7 + 1);
   }

   public float method4155() {
      AxisAlignedBB var3 = this.getBoundingBox();
      AxisAlignedBB var4 = new AxisAlignedBB(var3.minX, var3.minY - 0.001, var3.minZ, var3.maxX, var3.minY, var3.maxZ);
      int var5 = MathHelper.floor(var4.minX) - 1;
      int var6 = MathHelper.method37774(var4.maxX) + 1;
      int var7 = MathHelper.floor(var4.minY) - 1;
      int var8 = MathHelper.method37774(var4.maxY) + 1;
      int var9 = MathHelper.floor(var4.minZ) - 1;
      int var10 = MathHelper.method37774(var4.maxZ) + 1;
      VoxelShape var11 = VoxelShapes.create(var4);
      float var12 = 0.0F;
      int var13 = 0;
      BlockPos.Mutable var14 = new BlockPos.Mutable();

      for (int var15 = var5; var15 < var6; var15++) {
         for (int var16 = var9; var16 < var10; var16++) {
            int var17 = (var15 != var5 && var15 != var6 - 1 ? 0 : 1) + (var16 != var9 && var16 != var10 - 1 ? 0 : 1);
            if (var17 != 2) {
               for (int var18 = var7; var18 < var8; var18++) {
                  if (var17 <= 0 || var18 != var7 && var18 != var8 - 1) {
                     var14.method8372(var15, var18, var16);
                     BlockState var19 = this.world.getBlockState(var14);
                     if (!(var19.getBlock() instanceof Class3494)
                        && VoxelShapes.compare(
                           var19.method23414(this.world, var14).withOffset((double)var15, (double)var18, (double)var16), var11, IBooleanFunction.AND
                        )) {
                        var12 += var19.getBlock().method11571();
                        var13++;
                     }
                  }
               }
            }
         }
      }

      return var12 / (float)var13;
   }

   private boolean method4156() {
      AxisAlignedBB var3 = this.getBoundingBox();
      int var4 = MathHelper.floor(var3.minX);
      int var5 = MathHelper.method37774(var3.maxX);
      int var6 = MathHelper.floor(var3.minY);
      int var7 = MathHelper.method37774(var3.minY + 0.001);
      int var8 = MathHelper.floor(var3.minZ);
      int var9 = MathHelper.method37774(var3.maxZ);
      boolean var10 = false;
      this.field5545 = Double.MIN_VALUE;
      BlockPos.Mutable var11 = new BlockPos.Mutable();

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var11.method8372(var12, var13, var14);
               FluidState var15 = this.world.getFluidState(var11);
               if (var15.method23486(FluidTags.field40469)) {
                  float var16 = (float)var13 + var15.method23475(this.world, var11);
                  this.field5545 = Math.max((double)var16, this.field5545);
                  var10 |= var3.minY < (double)var16;
               }
            }
         }
      }

      return var10;
   }

   @Nullable
   private Class2096 method4157() {
      AxisAlignedBB var3 = this.getBoundingBox();
      double var4 = var3.maxY + 0.001;
      int var6 = MathHelper.floor(var3.minX);
      int var7 = MathHelper.method37774(var3.maxX);
      int var8 = MathHelper.floor(var3.maxY);
      int var9 = MathHelper.method37774(var4);
      int var10 = MathHelper.floor(var3.minZ);
      int var11 = MathHelper.method37774(var3.maxZ);
      boolean var12 = false;
      BlockPos.Mutable var13 = new BlockPos.Mutable();

      for (int var14 = var6; var14 < var7; var14++) {
         for (int var15 = var8; var15 < var9; var15++) {
            for (int var16 = var10; var16 < var11; var16++) {
               var13.method8372(var14, var15, var16);
               FluidState var17 = this.world.getFluidState(var13);
               if (var17.method23486(FluidTags.field40469) && var4 < (double)((float)var13.getY() + var17.method23475(this.world, var13))) {
                  if (!var17.method23473()) {
                     return Class2096.field13657;
                  }

                  var12 = true;
               }
            }
         }
      }

      return !var12 ? null : Class2096.field13656;
   }

   private void method4158() {
      double var3 = -0.04F;
      double var5 = !this.method3247() ? -0.04F : 0.0;
      double var7 = 0.0;
      this.field5532 = 0.05F;
      if (this.field5548 == Class2096.field13659 && this.field5547 != Class2096.field13659 && this.field5547 != Class2096.field13658) {
         this.field5545 = this.getPosYHeight(1.0);
         this.setPosition(this.getPosX(), (double)(this.method4154() - this.getHeight()) + 0.101, this.getPosZ());
         this.setMotion(this.getMotion().method11347(1.0, 0.0, 1.0));
         this.field5549 = 0.0;
         this.field5547 = Class2096.field13655;
      } else {
         if (this.field5547 != Class2096.field13655) {
            if (this.field5547 != Class2096.field13657) {
               if (this.field5547 != Class2096.field13656) {
                  if (this.field5547 != Class2096.field13659) {
                     if (this.field5547 == Class2096.field13658) {
                        this.field5532 = this.field5546;
                        if (this.method3407() instanceof PlayerEntity) {
                           this.field5546 /= 2.0F;
                        }
                     }
                  } else {
                     this.field5532 = 0.9F;
                  }
               } else {
                  var7 = 0.01F;
                  this.field5532 = 0.45F;
               }
            } else {
               var5 = -7.0E-4;
               this.field5532 = 0.9F;
            }
         } else {
            var7 = (this.field5545 - this.getPosY()) / (double)this.getHeight();
            this.field5532 = 0.9F;
         }

         Vector3d var9 = this.getMotion();
         this.setMotion(var9.x * (double)this.field5532, var9.y + var5, var9.z * (double)this.field5532);
         this.field5534 = this.field5534 * this.field5532;
         if (var7 > 0.0) {
            Vector3d var10 = this.getMotion();
            this.setMotion(var10.x, (var10.y + var7 * 0.06153846016296973) * 0.75, var10.z);
         }
      }
   }

   private void method4159() {
      if (this.isBeingRidden()) {
         float var3 = 0.0F;
         if (this.field5541) {
            this.field5534--;
         }

         if (this.field5542) {
            this.field5534++;
         }

         if (this.field5542 != this.field5541 && !this.field5543 && !this.field5544) {
            var3 += 0.005F;
         }

         this.rotationYaw = this.rotationYaw + this.field5534;
         if (this.field5543) {
            var3 += 0.04F;
         }

         if (this.field5544) {
            var3 -= 0.005F;
         }

         this.setMotion(
            this.getMotion()
               .add(
                  (double)(MathHelper.sin(-this.rotationYaw * (float) (Math.PI / 180.0)) * var3),
                  0.0,
                  (double)(MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)) * var3)
               )
         );
         this.method4151(this.field5542 && !this.field5541 || this.field5543, this.field5541 && !this.field5542 || this.field5543);
      }
   }

   @Override
   public void method3307(Entity var1) {
      if (this.method3409(var1)) {
         float var4 = 0.0F;
         float var5 = (float)((!this.removed ? this.method3310() : 0.01F) + var1.getYOffset());
         if (this.getPassengers().size() > 1) {
            int var6 = this.getPassengers().indexOf(var1);
            if (var6 != 0) {
               var4 = -0.6F;
            } else {
               var4 = 0.2F;
            }

            if (var1 instanceof Class1018) {
               var4 = (float)((double)var4 + 0.2);
            }
         }

         Vector3d var8 = new Vector3d((double)var4, 0.0, 0.0).method11351(-this.rotationYaw * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         var1.setPosition(this.getPosX() + var8.x, this.getPosY() + (double)var5, this.getPosZ() + var8.z);
         var1.rotationYaw = var1.rotationYaw + this.field5534;
         var1.setRotationYawHead(var1.getRotationYawHead() + this.field5534);
         this.method4160(var1);
         if (var1 instanceof Class1018 && this.getPassengers().size() > 1) {
            int var7 = var1.getEntityId() % 2 != 0 ? 270 : 90;
            var1.setRenderYawOffset(((Class1018)var1).renderYawOffset + (float)var7);
            var1.setRotationYawHead(var1.getRotationYawHead() + (float)var7);
         }
      }
   }

   @Override
   public Vector3d method3420(LivingEntity var1) {
      Vector3d var4 = method3419((double)(this.getWidth() * MathHelper.field45205), (double)var1.getWidth(), this.rotationYaw);
      double var5 = this.getPosX() + var4.x;
      double var7 = this.getPosZ() + var4.z;
      BlockPos var9 = new BlockPos(var5, this.getBoundingBox().maxY, var7);
      BlockPos var10 = var9.down();
      if (!this.world.method7013(var10)) {
         double var11 = (double)var9.getY() + this.world.method7039(var9);
         double var13 = (double)var9.getY() + this.world.method7039(var10);
         UnmodifiableIterator var15 = var1.getAvailablePoses().iterator();

         while (var15.hasNext()) {
            Pose var16 = (Pose)var15.next();
            Vector3d var17 = Class4527.method14425(this.world, var5, var11, var7, var1, var16);
            if (var17 != null) {
               var1.setPose(var16);
               return var17;
            }

            Vector3d var18 = Class4527.method14425(this.world, var5, var13, var7, var1, var16);
            if (var18 != null) {
               var1.setPose(var16);
               return var18;
            }
         }
      }

      return super.method3420(var1);
   }

   public void method4160(Entity var1) {
      var1.setRenderYawOffset(this.rotationYaw);
      float var4 = MathHelper.method37792(var1.rotationYaw - this.rotationYaw);
      float var5 = MathHelper.clamp(var4, -105.0F, 105.0F);
      var1.prevRotationYaw += var5 - var4;
      var1.rotationYaw += var5 - var4;
      var1.setRotationYawHead(var1.rotationYaw);
   }

   @Override
   public void applyOrientationToEntity(Entity var1) {
      this.method4160(var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.method109("Type", this.method4172().method8761());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      if (var1.contains("Type", 8)) {
         this.method4171(Class2099.method8764(var1.getString("Type")));
      }
   }

   @Override
   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      if (!var1.method2851()) {
         if (!(this.field5533 < 60.0F)) {
            return ActionResultType.field14820;
         } else if (this.world.isRemote) {
            return ActionResultType.SUCCESS;
         } else {
            return !var1.method3311(this) ? ActionResultType.field14820 : ActionResultType.field14819;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
      this.field5549 = this.getMotion().y;
      if (!this.isPassenger()) {
         if (!var3) {
            if (!this.world.getFluidState(this.getPosition().down()).method23486(FluidTags.field40469) && var1 < 0.0) {
               this.fallDistance = (float)((double)this.fallDistance - var1);
            }
         } else {
            if (this.fallDistance > 3.0F) {
               if (this.field5547 != Class2096.field13658) {
                  this.fallDistance = 0.0F;
                  return;
               }

               this.onLivingFall(this.fallDistance, 1.0F);
               if (!this.world.isRemote && !this.removed) {
                  this.remove();
                  if (this.world.getGameRules().getBoolean(Class5462.field24229)) {
                     for (int var8 = 0; var8 < 3; var8++) {
                        this.entityDropItem(this.method4172().method8762());
                     }

                     for (int var9 = 0; var9 < 2; var9++) {
                        this.entityDropItem(Items.field37835);
                     }
                  }
               }
            }

            this.fallDistance = 0.0F;
         }
      }
   }

   public boolean method4161(int var1) {
      return this.dataManager.<Boolean>method35445(var1 != 0 ? field5529 : field5528) && this.method3407() != null;
   }

   public void method4162(float var1) {
      this.dataManager.method35446(field5526, var1);
   }

   public float method4163() {
      return this.dataManager.<Float>method35445(field5526);
   }

   public void method4164(int var1) {
      this.dataManager.method35446(field5524, var1);
   }

   public int method4165() {
      return this.dataManager.<Integer>method35445(field5524);
   }

   private void method4166(int var1) {
      this.dataManager.method35446(field5530, var1);
   }

   private int method4167() {
      return this.dataManager.<Integer>method35445(field5530);
   }

   public float method4168(float var1) {
      return MathHelper.lerp(var1, this.field5554, this.field5553);
   }

   public void method4169(int var1) {
      this.dataManager.method35446(field5525, var1);
   }

   public int method4170() {
      return this.dataManager.<Integer>method35445(field5525);
   }

   public void method4171(Class2099 var1) {
      this.dataManager.method35446(field5527, var1.ordinal());
   }

   public Class2099 method4172() {
      return Class2099.method8763(this.dataManager.<Integer>method35445(field5527));
   }

   @Override
   public boolean canFitPassenger(Entity var1) {
      return this.getPassengers().size() < 2 && !this.areEyesInFluid(FluidTags.field40469);
   }

   @Nullable
   @Override
   public Entity method3407() {
      List var3 = this.getPassengers();
      return !var3.isEmpty() ? (Entity)var3.get(0) : null;
   }

   public void method4173(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.field5541 = var1;
      this.field5542 = var2;
      this.field5543 = var3;
      this.field5544 = var4;
   }

   @Override
   public Packet<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }

   @Override
   public boolean canSwim() {
      return this.field5547 == Class2096.field13656 || this.field5547 == Class2096.field13657;
   }
}
