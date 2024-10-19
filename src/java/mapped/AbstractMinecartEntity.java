package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.entity.*;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.state.properties.RailShape;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public abstract class AbstractMinecartEntity extends Entity {
   private static final DataParameter<Integer> field5213 = EntityDataManager.<Integer>createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5214 = EntityDataManager.<Integer>createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Float> field5215 = EntityDataManager.<Float>createKey(AbstractMinecartEntity.class, DataSerializers.field33392);
   private static final DataParameter<Integer> field5216 = EntityDataManager.<Integer>createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5217 = EntityDataManager.<Integer>createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5218 = EntityDataManager.<Boolean>createKey(AbstractMinecartEntity.class, DataSerializers.field33398);
   private static final ImmutableMap<Pose, ImmutableList<Integer>> field5219 = ImmutableMap.of(
      Pose.STANDING, ImmutableList.of(0, 1, -1), Pose.field13624, ImmutableList.of(0, 1, -1), Pose.field13622, ImmutableList.of(0, 1)
   );
   private boolean field5220;
   private static final Map<RailShape, Pair<Vector3i, Vector3i>> field5221 = Util.<Map<RailShape, Pair<Vector3i, Vector3i>>>make(
      Maps.newEnumMap(RailShape.class), var0 -> {
         Vector3i var3 = Direction.WEST.getDirectionVec();
         Vector3i var4 = Direction.EAST.getDirectionVec();
         Vector3i var5 = Direction.NORTH.getDirectionVec();
         Vector3i var6 = Direction.SOUTH.getDirectionVec();
         Vector3i var7 = var3.method8312();
         Vector3i var8 = var4.method8312();
         Vector3i var9 = var5.method8312();
         Vector3i var10 = var6.method8312();
         var0.put(RailShape.field247, Pair.of(var5, var6));
         var0.put(RailShape.field248, Pair.of(var3, var4));
         var0.put(RailShape.field249, Pair.of(var7, var4));
         var0.put(RailShape.field250, Pair.of(var3, var8));
         var0.put(RailShape.field251, Pair.of(var5, var10));
         var0.put(RailShape.field252, Pair.of(var9, var6));
         var0.put(RailShape.field253, Pair.of(var6, var4));
         var0.put(RailShape.field254, Pair.of(var6, var3));
         var0.put(RailShape.field255, Pair.of(var5, var3));
         var0.put(RailShape.field256, Pair.of(var5, var4));
      }
   );
   private int field5222;
   private double field5223;
   private double field5224;
   private double field5225;
   private double field5226;
   private double field5227;
   private double field5228;
   private double field5229;
   private double field5230;

   public AbstractMinecartEntity(EntityType<?> var1, World var2) {
      super(var1, var2);
      this.preventEntitySpawning = true;
   }

   public AbstractMinecartEntity(EntityType<?> var1, World var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.setPosition(var3, var5, var7);
      this.setMotion(Vector3d.ZERO);
      this.prevPosX = var3;
      this.prevPosY = var5;
      this.prevPosZ = var7;
   }

   public static AbstractMinecartEntity method3585(World var0, double var1, double var3, double var5, MinecartType var7) {
      if (var7 != MinecartType.CHEST) {
         if (var7 != MinecartType.FURNACE) {
            if (var7 != MinecartType.TNT) {
               if (var7 != MinecartType.field14291) {
                  if (var7 != MinecartType.HOPPER) {
                     return (AbstractMinecartEntity)(var7 != MinecartType.COMMAND_BLOCK ? new Class917(var0, var1, var3, var5) : new Class918(var0, var1, var3, var5));
                  } else {
                     return new Class938(var0, var1, var3, var5);
                  }
               } else {
                  return new Class992(var0, var1, var3, var5);
               }
            } else {
               return new Class993(var0, var1, var3, var5);
            }
         } else {
            return new Class994(var0, var1, var3, var5);
         }
      } else {
         return new Class991(var0, var1, var3, var5);
      }
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5213, 0);
      this.dataManager.register(field5214, 1);
      this.dataManager.register(field5215, 0.0F);
      this.dataManager.register(field5216, Block.getStateId(Blocks.AIR.getDefaultState()));
      this.dataManager.register(field5217, 6);
      this.dataManager.register(field5218, false);
   }

   @Override
   public boolean canCollide(Entity var1) {
      return BoatEntity.method4146(this, var1);
   }

   @Override
   public boolean canBePushed() {
      return true;
   }

   @Override
   public Vector3d func_241839_a(Direction.Axis var1, TeleportationRepositioner var2) {
      return LivingEntity.func_242288_h(super.func_241839_a(var1, var2));
   }

   @Override
   public double method3310() {
      return 0.0;
   }

   @Override
   public Vector3d method3420(LivingEntity var1) {
      Direction var4 = this.method3387();
      if (var4.getAxis() == Direction.Axis.Y) {
         return super.method3420(var1);
      } else {
         int[][] var5 = Class4527.method14422(var4);
         BlockPos var6 = this.getPosition();
         BlockPos.Mutable var7 = new BlockPos.Mutable();
         ImmutableList var8 = var1.getAvailablePoses();
         UnmodifiableIterator var9 = var8.iterator();

         while (var9.hasNext()) {
            Pose var13 = (Pose)var9.next();
            EntitySize var12 = var1.getSize(var13);
            float var14 = Math.min(var12.field39968, 1.0F) / 2.0F;
            UnmodifiableIterator var15 = ((ImmutableList)field5219.get(var13)).iterator();

            while (var15.hasNext()) {
               int var16 = (Integer)var15.next();

               for (int[] var20 : var5) {
                  var7.setPos(var6.getX() + var20[0], var6.getY() + var16, var6.getZ() + var20[1]);
                  double var21 = this.world
                     .method7038(Class4527.method14426(this.world, var7), () -> Class4527.method14426(this.world, var7.down()));
                  if (Class4527.method14423(var21)) {
                     AxisAlignedBB var23 = new AxisAlignedBB((double)(-var14), 0.0, (double)(-var14), (double)var14, (double)var12.field39969, (double)var14);
                     Vector3d var24 = Vector3d.method11331(var7, var21);
                     if (Class4527.method14424(this.world, var1, var23.offset(var24))) {
                        var1.setPose(var13);
                        return var24;
                     }
                  }
               }
            }
         }

         double var10 = this.getBoundingBox().maxY;
         var7.method8373((double)var6.getX(), var10, (double)var6.getZ());
         UnmodifiableIterator var29 = var8.iterator();

         while (var29.hasNext()) {
            Pose var30 = (Pose)var29.next();
            double var25 = (double)var1.getSize(var30).field39969;
            int var31 = MathHelper.method37774(var10 - (double)var7.getY() + var25);
            double var27 = Class4527.method14427(var7, var31, var1x -> this.world.getBlockState(var1x).method23414(this.world, var1x));
            if (var10 + var25 <= var27) {
               var1.setPose(var30);
               break;
            }
         }

         return super.method3420(var1);
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.world.isRemote || this.removed) {
         return true;
      } else if (this.isInvulnerableTo(var1)) {
         return false;
      } else {
         this.method3600(-this.method3601());
         this.method3598(10);
         this.markVelocityChanged();
         this.method3596(this.method3597() + var2 * 10.0F);
         boolean var5 = var1.getTrueSource() instanceof PlayerEntity && ((PlayerEntity)var1.getTrueSource()).abilities.isCreativeMode;
         if (var5 || this.method3597() > 40.0F) {
            this.removePassengers();
            if (var5 && !this.method3381()) {
               this.remove();
            } else {
               this.method3586(var1);
            }
         }

         return true;
      }
   }

   @Override
   public float getSpeedFactor() {
      BlockState var3 = this.world.getBlockState(this.getPosition());
      return !var3.isIn(BlockTags.field32766) ? super.getSpeedFactor() : 1.0F;
   }

   public void method3586(DamageSource var1) {
      this.remove();
      if (this.world.getGameRules().getBoolean(GameRules.field24229)) {
         ItemStack var4 = new ItemStack(Items.MINECART);
         if (this.method3381()) {
            var4.method32150(this.method3380());
         }

         this.method3302(var4);
      }
   }

   @Override
   public void performHurtAnimation() {
      this.method3600(-this.method3601());
      this.method3598(10);
      this.method3596(this.method3597() + this.method3597() * 10.0F);
   }

   @Override
   public boolean canBeCollidedWith() {
      return !this.removed;
   }

   private static Pair<Vector3i, Vector3i> method3587(RailShape var0) {
      return field5221.get(var0);
   }

   @Override
   public Direction method3387() {
      return !this.field5220 ? this.getHorizontalFacing().rotateY() : this.getHorizontalFacing().getOpposite().rotateY();
   }

   @Override
   public void tick() {
      if (this.method3599() > 0) {
         this.method3598(this.method3599() - 1);
      }

      if (this.method3597() > 0.0F) {
         this.method3596(this.method3597() - 1.0F);
      }

      if (this.getPosY() < -64.0) {
         this.outOfWorld();
      }

      this.updatePortal();
      if (!this.world.isRemote) {
         if (!this.method3247()) {
            this.setMotion(this.getMotion().add(0.0, -0.04, 0.0));
         }

         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.getPosY());
         int var5 = MathHelper.floor(this.getPosZ());
         if (this.world.getBlockState(new BlockPos(var3, var4 - 1, var5)).isIn(BlockTags.field32766)) {
            var4--;
         }

         BlockPos var6 = new BlockPos(var3, var4, var5);
         BlockState var7 = this.world.getBlockState(var6);
         if (!Class3429.method12087(var7)) {
            this.method3590();
         } else {
            this.method3591(var6, var7);
            if (var7.isIn(Blocks.field36728)) {
               this.method3589(var3, var4, var5, var7.<Boolean>get(Class3432.field19197));
            }
         }

         this.doBlockCollisions();
         this.rotationPitch = 0.0F;
         double var16 = this.prevPosX - this.getPosX();
         double var18 = this.prevPosZ - this.getPosZ();
         if (var16 * var16 + var18 * var18 > 0.001) {
            this.rotationYaw = (float)(MathHelper.method37814(var18, var16) * 180.0 / Math.PI);
            if (this.field5220) {
               this.rotationYaw += 180.0F;
            }
         }

         double var20 = (double) MathHelper.wrapDegrees(this.rotationYaw - this.prevRotationYaw);
         if (var20 < -170.0 || var20 >= 170.0) {
            this.rotationYaw += 180.0F;
            this.field5220 = !this.field5220;
         }

         this.setRotation(this.rotationYaw, this.rotationPitch);
         if (this.getMinecartType() == MinecartType.MINECART && horizontalMag(this.getMotion()) > 0.01) {
            List var25 = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox().grow(0.2F, 0.0, 0.2F), EntityPredicates.method27981(this));
            if (!var25.isEmpty()) {
               for (int var26 = 0; var26 < var25.size(); var26++) {
                  Entity var24 = (Entity)var25.get(var26);
                  if (!(var24 instanceof PlayerEntity)
                     && !(var24 instanceof Class1058)
                     && !(var24 instanceof AbstractMinecartEntity)
                     && !this.isBeingRidden()
                     && !var24.isPassenger()) {
                     var24.method3311(this);
                  } else {
                     var24.applyEntityCollision(this);
                  }
               }
            }
         } else {
            for (Entity var23 : this.world.method7181(this, this.getBoundingBox().grow(0.2F, 0.0, 0.2F))) {
               if (!this.method3409(var23) && var23.canBePushed() && var23 instanceof AbstractMinecartEntity) {
                  var23.applyEntityCollision(this);
               }
            }
         }

         this.method3257();
         if (this.isInLava()) {
            this.setOnFireFromLava();
            this.fallDistance *= 0.5F;
         }

         this.firstUpdate = false;
      } else if (this.field5222 <= 0) {
         this.recenterBoundingBox();
         this.setRotation(this.rotationYaw, this.rotationPitch);
      } else {
         double var8 = this.getPosX() + (this.field5223 - this.getPosX()) / (double)this.field5222;
         double var10 = this.getPosY() + (this.field5224 - this.getPosY()) / (double)this.field5222;
         double var12 = this.getPosZ() + (this.field5225 - this.getPosZ()) / (double)this.field5222;
         double var14 = MathHelper.wrapDegrees(this.field5226 - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var14 / (double)this.field5222);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field5227 - (double)this.rotationPitch) / (double)this.field5222);
         this.field5222--;
         this.setPosition(var8, var10, var12);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }
   }

   public double method3588() {
      return 0.4;
   }

   public void method3589(int var1, int var2, int var3, boolean var4) {
   }

   public void method3590() {
      double var3 = this.method3588();
      Vector3d var5 = this.getMotion();
      this.setMotion(MathHelper.clamp(var5.x, -var3, var3), var5.y, MathHelper.clamp(var5.z, -var3, var3));
      if (this.onGround) {
         this.setMotion(this.getMotion().scale(0.5));
      }

      this.move(MoverType.SELF, this.getMotion());
      if (!this.onGround) {
         this.setMotion(this.getMotion().scale(0.95));
      }
   }

   public void method3591(BlockPos var1, BlockState var2) {
      this.fallDistance = 0.0F;
      double var5 = this.getPosX();
      double var7 = this.getPosY();
      double var9 = this.getPosZ();
      Vector3d var11 = this.method3595(var5, var7, var9);
      var7 = (double)var1.getY();
      boolean var12 = false;
      boolean var13 = false;
      Class3429 var14 = (Class3429)var2.getBlock();
      if (var14 == Blocks.POWERED_RAIL) {
         var12 = var2.<Boolean>get(Class3432.field19197);
         var13 = !var12;
      }

      double var15 = 0.0078125;
      Vector3d var17 = this.getMotion();
      RailShape var18 = var2.<RailShape>get(var14.method12093());
      switch (Class9345.field43383[var18.ordinal()]) {
         case 1:
            this.setMotion(var17.add(-0.0078125, 0.0, 0.0));
            var7++;
            break;
         case 2:
            this.setMotion(var17.add(0.0078125, 0.0, 0.0));
            var7++;
            break;
         case 3:
            this.setMotion(var17.add(0.0, 0.0, 0.0078125));
            var7++;
            break;
         case 4:
            this.setMotion(var17.add(0.0, 0.0, -0.0078125));
            var7++;
      }

      var17 = this.getMotion();
      Pair var19 = method3587(var18);
      Vector3i var20 = (Vector3i)var19.getFirst();
      Vector3i var21 = (Vector3i)var19.getSecond();
      double var22 = (double)(var21.getX() - var20.getX());
      double var24 = (double)(var21.getZ() - var20.getZ());
      double var26 = Math.sqrt(var22 * var22 + var24 * var24);
      double var28 = var17.x * var22 + var17.z * var24;
      if (var28 < 0.0) {
         var22 = -var22;
         var24 = -var24;
      }

      double var30 = Math.min(2.0, Math.sqrt(horizontalMag(var17)));
      var17 = new Vector3d(var30 * var22 / var26, var17.y, var30 * var24 / var26);
      this.setMotion(var17);
      Entity var32 = this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
      if (var32 instanceof PlayerEntity) {
         Vector3d var33 = var32.getMotion();
         double var34 = horizontalMag(var33);
         double var36 = horizontalMag(this.getMotion());
         if (var34 > 1.0E-4 && var36 < 0.01) {
            this.setMotion(this.getMotion().add(var33.x * 0.1, 0.0, var33.z * 0.1));
            var13 = false;
         }
      }

      if (var13) {
         double var38 = Math.sqrt(horizontalMag(this.getMotion()));
         if (var38 < 0.03) {
            this.setMotion(Vector3d.ZERO);
         } else {
            this.setMotion(this.getMotion().mul(0.5, 0.0, 0.5));
         }
      }

      double var75 = (double)var1.getX() + 0.5 + (double)var20.getX() * 0.5;
      double var40 = (double)var1.getZ() + 0.5 + (double)var20.getZ() * 0.5;
      double var42 = (double)var1.getX() + 0.5 + (double)var21.getX() * 0.5;
      double var44 = (double)var1.getZ() + 0.5 + (double)var21.getZ() * 0.5;
      var22 = var42 - var75;
      var24 = var44 - var40;
      double var46;
      if (var22 == 0.0) {
         var46 = var9 - (double)var1.getZ();
      } else if (var24 == 0.0) {
         var46 = var5 - (double)var1.getX();
      } else {
         double var48 = var5 - var75;
         double var50 = var9 - var40;
         var46 = (var48 * var22 + var50 * var24) * 2.0;
      }

      var5 = var75 + var22 * var46;
      var9 = var40 + var24 * var46;
      this.setPosition(var5, var7, var9);
      double var76 = this.isBeingRidden() ? 0.75 : 1.0;
      double var77 = this.method3588();
      var17 = this.getMotion();
      this.move(
         MoverType.SELF,
         new Vector3d(MathHelper.clamp(var76 * var17.x, -var77, var77), 0.0, MathHelper.clamp(var76 * var17.z, -var77, var77))
      );
      if (var20.getY() != 0
         && MathHelper.floor(this.getPosX()) - var1.getX() == var20.getX()
         && MathHelper.floor(this.getPosZ()) - var1.getZ() == var20.getZ()) {
         this.setPosition(this.getPosX(), this.getPosY() + (double)var20.getY(), this.getPosZ());
      } else if (var21.getY() != 0
         && MathHelper.floor(this.getPosX()) - var1.getX() == var21.getX()
         && MathHelper.floor(this.getPosZ()) - var1.getZ() == var21.getZ()) {
         this.setPosition(this.getPosX(), this.getPosY() + (double)var21.getY(), this.getPosZ());
      }

      this.method3593();
      Vector3d var52 = this.method3595(this.getPosX(), this.getPosY(), this.getPosZ());
      if (var52 != null && var11 != null) {
         double var53 = (var11.y - var52.y) * 0.05;
         Vector3d var55 = this.getMotion();
         double var56 = Math.sqrt(horizontalMag(var55));
         if (var56 > 0.0) {
            this.setMotion(var55.mul((var56 + var53) / var56, 1.0, (var56 + var53) / var56));
         }

         this.setPosition(this.getPosX(), var52.y, this.getPosZ());
      }

      int var58 = MathHelper.floor(this.getPosX());
      int var59 = MathHelper.floor(this.getPosZ());
      if (var58 != var1.getX() || var59 != var1.getZ()) {
         Vector3d var78 = this.getMotion();
         double var80 = Math.sqrt(horizontalMag(var78));
         this.setMotion(var80 * (double)(var58 - var1.getX()), var78.y, var80 * (double)(var59 - var1.getZ()));
      }

      if (var12) {
         Vector3d var79 = this.getMotion();
         double var81 = Math.sqrt(horizontalMag(var79));
         if (var81 > 0.01) {
            double var60 = 0.06;
            this.setMotion(var79.add(var79.x / var81 * 0.06, 0.0, var79.z / var81 * 0.06));
         } else {
            Vector3d var62 = this.getMotion();
            double var63 = var62.x;
            double var65 = var62.z;
            if (var18 == RailShape.field248) {
               if (this.method3592(var1.west())) {
                  var63 = 0.02;
               } else if (this.method3592(var1.east())) {
                  var63 = -0.02;
               }
            } else {
               if (var18 != RailShape.field247) {
                  return;
               }

               if (this.method3592(var1.north())) {
                  var65 = 0.02;
               } else if (this.method3592(var1.south())) {
                  var65 = -0.02;
               }
            }

            this.setMotion(var63, var62.y, var65);
         }
      }
   }

   private boolean method3592(BlockPos var1) {
      return this.world.getBlockState(var1).method23400(this.world, var1);
   }

   public void method3593() {
      double var3 = !this.isBeingRidden() ? 0.96 : 0.997;
      this.setMotion(this.getMotion().mul(var3, 0.0, var3));
   }

   @Nullable
   public Vector3d method3594(double var1, double var3, double var5, double var7) {
      int var11 = MathHelper.floor(var1);
      int var12 = MathHelper.floor(var3);
      int var13 = MathHelper.floor(var5);
      if (this.world.getBlockState(new BlockPos(var11, var12 - 1, var13)).isIn(BlockTags.field32766)) {
         var12--;
      }

      BlockState var14 = this.world.getBlockState(new BlockPos(var11, var12, var13));
      if (!Class3429.method12087(var14)) {
         return null;
      } else {
         RailShape var15 = var14.<RailShape>get(((Class3429)var14.getBlock()).method12093());
         var3 = (double)var12;
         if (var15.method275()) {
            var3 = (double)(var12 + 1);
         }

         Pair var16 = method3587(var15);
         Vector3i var17 = (Vector3i)var16.getFirst();
         Vector3i var18 = (Vector3i)var16.getSecond();
         double var19 = (double)(var18.getX() - var17.getX());
         double var21 = (double)(var18.getZ() - var17.getZ());
         double var23 = Math.sqrt(var19 * var19 + var21 * var21);
         var19 /= var23;
         var21 /= var23;
         var1 += var19 * var7;
         var5 += var21 * var7;
         if (var17.getY() != 0 && MathHelper.floor(var1) - var11 == var17.getX() && MathHelper.floor(var5) - var13 == var17.getZ()) {
            var3 += (double)var17.getY();
         } else if (var18.getY() != 0
            && MathHelper.floor(var1) - var11 == var18.getX()
            && MathHelper.floor(var5) - var13 == var18.getZ()) {
            var3 += (double)var18.getY();
         }

         return this.method3595(var1, var3, var5);
      }
   }

   @Nullable
   public Vector3d method3595(double var1, double var3, double var5) {
      int var9 = MathHelper.floor(var1);
      int var10 = MathHelper.floor(var3);
      int var11 = MathHelper.floor(var5);
      if (this.world.getBlockState(new BlockPos(var9, var10 - 1, var11)).isIn(BlockTags.field32766)) {
         var10--;
      }

      BlockState var12 = this.world.getBlockState(new BlockPos(var9, var10, var11));
      if (!Class3429.method12087(var12)) {
         return null;
      } else {
         RailShape var13 = var12.<RailShape>get(((Class3429)var12.getBlock()).method12093());
         Pair var14 = method3587(var13);
         Vector3i var15 = (Vector3i)var14.getFirst();
         Vector3i var16 = (Vector3i)var14.getSecond();
         double var17 = (double)var9 + 0.5 + (double)var15.getX() * 0.5;
         double var19 = (double)var10 + 0.0625 + (double)var15.getY() * 0.5;
         double var21 = (double)var11 + 0.5 + (double)var15.getZ() * 0.5;
         double var23 = (double)var9 + 0.5 + (double)var16.getX() * 0.5;
         double var25 = (double)var10 + 0.0625 + (double)var16.getY() * 0.5;
         double var27 = (double)var11 + 0.5 + (double)var16.getZ() * 0.5;
         double var29 = var23 - var17;
         double var31 = (var25 - var19) * 2.0;
         double var33 = var27 - var21;
         double var39;
         if (var29 != 0.0) {
            if (var33 != 0.0) {
               double var35 = var1 - var17;
               double var37 = var5 - var21;
               var39 = (var35 * var29 + var37 * var33) * 2.0;
            } else {
               var39 = var1 - (double)var9;
            }
         } else {
            var39 = var5 - (double)var11;
         }

         var1 = var17 + var29 * var39;
         var3 = var19 + var31 * var39;
         var5 = var21 + var33 * var39;
         if (!(var31 < 0.0)) {
            if (var31 > 0.0) {
               var3 += 0.5;
            }
         } else {
            var3++;
         }

         return new Vector3d(var1, var3, var5);
      }
   }

   @Override
   public AxisAlignedBB getRenderBoundingBox() {
      AxisAlignedBB var3 = this.getBoundingBox();
      return !this.method3609() ? var3 : var3.grow((double)Math.abs(this.method3605()) / 16.0);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      if (var1.getBoolean("CustomDisplayTile")) {
         this.method3607(NBTUtil.readBlockState(var1.getCompound("DisplayState")));
         this.method3608(var1.getInt("DisplayOffset"));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      if (this.method3609()) {
         var1.putBoolean("CustomDisplayTile", true);
         var1.put("DisplayState", NBTUtil.writeBlockState(this.method3603()));
         var1.putInt("DisplayOffset", this.method3605());
      }
   }

   @Override
   public void applyEntityCollision(Entity var1) {
      if (!this.world.isRemote && !var1.noClip && !this.noClip && !this.method3409(var1)) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = var4 * var4 + var6 * var6;
         if (var8 >= 1.0E-4F) {
            var8 = (double) MathHelper.sqrt(var8);
            var4 /= var8;
            var6 /= var8;
            double var10 = 1.0 / var8;
            if (var10 > 1.0) {
               var10 = 1.0;
            }

            var4 *= var10;
            var6 *= var10;
            var4 *= 0.1F;
            var6 *= 0.1F;
            var4 *= (double)(1.0F - this.entityCollisionReduction);
            var6 *= (double)(1.0F - this.entityCollisionReduction);
            var4 *= 0.5;
            var6 *= 0.5;
            if (!(var1 instanceof AbstractMinecartEntity)) {
               this.addVelocity(-var4, 0.0, -var6);
               var1.addVelocity(var4 / 4.0, 0.0, var6 / 4.0);
            } else {
               double var12 = var1.getPosX() - this.getPosX();
               double var14 = var1.getPosZ() - this.getPosZ();
               Vector3d var16 = new Vector3d(var12, 0.0, var14).method11333();
               Vector3d var17 = new Vector3d(
                     (double) MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)),
                     0.0,
                     (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0))
                  )
                  .method11333();
               double var18 = Math.abs(var16.dotProduct(var17));
               if (var18 < 0.8F) {
                  return;
               }

               Vector3d var20 = this.getMotion();
               Vector3d var21 = var1.getMotion();
               if (((AbstractMinecartEntity)var1).getMinecartType() == MinecartType.FURNACE && this.getMinecartType() != MinecartType.FURNACE) {
                  this.setMotion(var20.mul(0.2, 1.0, 0.2));
                  this.addVelocity(var21.x - var4, 0.0, var21.z - var6);
                  var1.setMotion(var21.mul(0.95, 1.0, 0.95));
               } else if (((AbstractMinecartEntity)var1).getMinecartType() != MinecartType.FURNACE && this.getMinecartType() == MinecartType.FURNACE) {
                  var1.setMotion(var21.mul(0.2, 1.0, 0.2));
                  var1.addVelocity(var20.x + var4, 0.0, var20.z + var6);
                  this.setMotion(var20.mul(0.95, 1.0, 0.95));
               } else {
                  double var22 = (var21.x + var20.x) / 2.0;
                  double var24 = (var21.z + var20.z) / 2.0;
                  this.setMotion(var20.mul(0.2, 1.0, 0.2));
                  this.addVelocity(var22 - var4, 0.0, var24 - var6);
                  var1.setMotion(var21.mul(0.2, 1.0, 0.2));
                  var1.addVelocity(var22 + var4, 0.0, var24 + var6);
               }
            }
         }
      }
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field5223 = var1;
      this.field5224 = var3;
      this.field5225 = var5;
      this.field5226 = (double)var7;
      this.field5227 = (double)var8;
      this.field5222 = var9 + 2;
      this.setMotion(this.field5228, this.field5229, this.field5230);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.field5228 = var1;
      this.field5229 = var3;
      this.field5230 = var5;
      this.setMotion(this.field5228, this.field5229, this.field5230);
   }

   public void method3596(float var1) {
      this.dataManager.method35446(field5215, var1);
   }

   public float method3597() {
      return this.dataManager.<Float>method35445(field5215);
   }

   public void method3598(int var1) {
      this.dataManager.method35446(field5213, var1);
   }

   public int method3599() {
      return this.dataManager.<Integer>method35445(field5213);
   }

   public void method3600(int var1) {
      this.dataManager.method35446(field5214, var1);
   }

   public int method3601() {
      return this.dataManager.<Integer>method35445(field5214);
   }

   public abstract MinecartType getMinecartType();

   public BlockState method3603() {
      return this.method3609() ? Block.method11536(this.getDataManager().<Integer>method35445(field5216)) : this.method3604();
   }

   public BlockState method3604() {
      return Blocks.AIR.getDefaultState();
   }

   public int method3605() {
      return this.method3609() ? this.getDataManager().<Integer>method35445(field5217) : this.method3606();
   }

   public int method3606() {
      return 6;
   }

   public void method3607(BlockState var1) {
      this.getDataManager().method35446(field5216, Block.getStateId(var1));
      this.method3610(true);
   }

   public void method3608(int var1) {
      this.getDataManager().method35446(field5217, var1);
      this.method3610(true);
   }

   public boolean method3609() {
      return this.getDataManager().<Boolean>method35445(field5218);
   }

   public void method3610(boolean var1) {
      this.getDataManager().method35446(field5218, var1);
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
