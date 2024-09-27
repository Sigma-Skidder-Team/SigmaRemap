package net.minecraft.entity;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventMoveRideable;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import mapped.*;
import mapped.Direction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.util.text.event.HoverEvent$EntityHover;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public abstract class Entity implements INameable, ICommandSource {
   public static final Logger LOGGER = LogManager.getLogger();
   private static final AtomicInteger NEXT_ENTITY_ID = new AtomicInteger();
   private static final List<ItemStack> EMPTY_EQUIPMENT = Collections.<ItemStack>emptyList();
   private static final AxisAlignedBB ZERO_AABB = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static double renderDistanceWeight = 1.0;
   private final EntityType<?> type;
   private int entityId = NEXT_ENTITY_ID.incrementAndGet();
   public boolean preventEntitySpawning;
   private final List<Entity> passengers = Lists.newArrayList();
   public int rideCooldown;
   private Entity ridingEntity;
   public boolean forceSpawn;
   public World world;
   public double prevPosX;
   public double prevPosY;
   public double prevPosZ;
   public Vector3d positionVec;
   public BlockPos position;
   private Vector3d motion = Vector3d.ZERO;
   public float rotationYaw;
   public float rotationPitch;
   public float prevRotationYaw;
   public float prevRotationPitch;
   public AxisAlignedBB boundingBox = ZERO_AABB;
   public boolean onGround;
   public boolean collidedHorizontally;
   public boolean collidedVertically;
   public boolean velocityChanged;
   public Vector3d motionMultiplier = Vector3d.ZERO;
   public boolean removed;
   public float prevDistanceWalkedModified;
   public float distanceWalkedModified;
   public float distanceWalkedOnStepModified;
   public float fallDistance;
   private float nextStepDistance = 1.0F;
   private float nextFlap = 1.0F;
   public double lastTickPosX;
   public double lastTickPosY;
   public double lastTickPosZ;
   public float stepHeight;
   public boolean noClip;
   public float entityCollisionReduction;
   public final Random rand = new Random();
   public int ticksExisted;
   private int fire = -this.getFireImmuneTicks();
   public boolean inWater;
   public Object2DoubleMap<ITag<Fluid>> eyesFluidLevel = new Object2DoubleArrayMap<>(2);
   public boolean eyesInWater;
   public ITag<Fluid> field_241335_O_;
   public int hurtResistantTime;
   public boolean firstUpdate = true;
   public final EntityDataManager dataManager;
   public static final DataParameter<Byte> FLAGS = EntityDataManager.<Byte>createKey(Entity.class, DataSerializers.field33390);
   private static final DataParameter<Integer> AIR = EntityDataManager.<Integer>createKey(Entity.class, DataSerializers.VARINT);
   private static final DataParameter<Optional<ITextComponent>> CUSTOM_NAME = EntityDataManager.<Optional<ITextComponent>>createKey(Entity.class, DataSerializers.field33395);
   public static final DataParameter<Boolean> CUSTOM_NAME_VISIBLE = EntityDataManager.<Boolean>createKey(Entity.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> SILENT = EntityDataManager.<Boolean>createKey(Entity.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> NO_GRAVITY = EntityDataManager.<Boolean>createKey(Entity.class, DataSerializers.field33398);
   public static final DataParameter<Pose> POSE = EntityDataManager.<Pose>createKey(Entity.class, DataSerializers.field33408);
   public boolean addedToChunk;
   public int chunkCoordX;
   public int chunkCoordY;
   public int chunkCoordZ;
   private boolean isLoaded;
   public Vector3d field_242272_av;
   public boolean ignoreFrustumCheck;
   public boolean isAirBorne;
   private int field_242273_aw;
   public boolean inPortal;
   public int portalCounter;
   public BlockPos field_242271_ac;
   private boolean invulnerable;
   public UUID entityUniqueID = MathHelper.getRandomUUID(this.rand);
   public String cachedUniqueIdString = this.entityUniqueID.toString();
   public boolean glowing;
   private final Set<String> tags = Sets.newHashSet();
   private boolean isPositionDirty;
   private final double[] pistonDeltas = new double[]{0.0, 0.0, 0.0};
   private long pistonDeltasGameTime;
   private EntitySize size;
   public float eyeHeight;

   public Entity(EntityType<?> var1, World var2) {
      this.type = var1;
      this.world = var2;
      this.size = var1.getSize();
      this.positionVec = Vector3d.ZERO;
      this.position = BlockPos.ZERO;
      this.field_242272_av = Vector3d.ZERO;
      this.setPosition(0.0, 0.0, 0.0);
      this.dataManager = new EntityDataManager(this);
      this.dataManager.register(FLAGS, (byte)0);
      this.dataManager.register(AIR, this.getMaxAir());
      this.dataManager.register(CUSTOM_NAME_VISIBLE, false);
      this.dataManager.register(CUSTOM_NAME, Optional.<ITextComponent>empty());
      this.dataManager.register(SILENT, false);
      this.dataManager.register(NO_GRAVITY, false);
      this.dataManager.register(POSE, Pose.STANDING);
      this.registerData();
      this.eyeHeight = this.getEyeHeight(Pose.STANDING, this.size);
   }

   public boolean func_242278_a(BlockPos var1, BlockState var2) {
      VoxelShape var5 = var2.getCollisionShape(this.world, var1, ISelectionContext.forEntity(this));
      VoxelShape var6 = var5.withOffset((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
      return VoxelShapes.compare(var6, VoxelShapes.create(this.getBoundingBox()), IBooleanFunction.AND);
   }

   public int getTeamColor() {
      Team var3 = this.getTeam();
      return var3 != null && var3.getColor().getColor() != null ? var3.getColor().getColor() : 16777215;
   }

   public boolean isSpectator() {
      return false;
   }

   public final void detach() {
      if (this.isBeingRidden()) {
         this.removePassengers();
      }

      if (this.isPassenger()) {
         this.stopRiding();
      }
   }

   public void setPacketCoordinates(double var1, double var3, double var5) {
      this.func_242277_a(new Vector3d(var1, var3, var5));
   }

   public void func_242277_a(Vector3d var1) {
      this.field_242272_av = var1;
   }

   public Vector3d getServerPos() {
      return this.field_242272_av;
   }

   public EntityType<?> getType() {
      return this.type;
   }

   public int getEntityId() {
      return this.entityId;
   }

   public void setEntityId(int var1) {
      this.entityId = var1;
   }

   public Set<String> getTags() {
      return this.tags;
   }

   public boolean addTag(String var1) {
      return this.tags.size() < 1024 ? this.tags.add(var1) : false;
   }

   public boolean removeTag(String var1) {
      return this.tags.remove(var1);
   }

   public void onKillCommand() {
      this.remove();
   }

   public abstract void registerData();

   public EntityDataManager getDataManager() {
      return this.dataManager;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Entity) ? false : ((Entity)var1).entityId == this.entityId;
   }

   @Override
   public int hashCode() {
      return this.entityId;
   }

   public void preparePlayerToSpawn() {
      if (this.world != null) {
         for (double var3 = this.getPosY(); var3 > 0.0 && var3 < 256.0; var3++) {
            this.setPosition(this.getPosX(), var3, this.getPosZ());
            if (this.world.hasNoCollisions(this)) {
               break;
            }
         }

         this.setMotion(Vector3d.ZERO);
         this.rotationPitch = 0.0F;
      }
   }

   public void remove() {
      this.removed = true;
   }

   public void setPose(Pose var1) {
      this.dataManager.method35446(POSE, var1);
   }

   public Pose getPose() {
      return this.dataManager.<Pose>method35445(POSE);
   }

   public boolean isEntityInRange(Entity var1, double var2) {
      double var6 = var1.positionVec.x - this.positionVec.x;
      double var8 = var1.positionVec.y - this.positionVec.y;
      double var10 = var1.positionVec.z - this.positionVec.z;
      return var6 * var6 + var8 * var8 + var10 * var10 < var2 * var2;
   }

   public void setRotation(float var1, float var2) {
      this.rotationYaw = var1 % 360.0F;
      this.rotationPitch = var2 % 360.0F;
   }

   public void setPosition(double var1, double var3, double var5) {
      this.setRawPosition(var1, var3, var5);
      this.setBoundingBox(this.size.method32098(var1, var3, var5));
   }

   public void recenterBoundingBox() {
      this.setPosition(this.positionVec.x, this.positionVec.y, this.positionVec.z);
   }

   public void rotateTowards(double var1, double var3) {
      double var7 = var3 * 0.15;
      double var9 = var1 * 0.15;
      this.rotationPitch = (float)((double)this.rotationPitch + var7);
      this.rotationYaw = (float)((double)this.rotationYaw + var9);
      this.rotationPitch = MathHelper.clamp(this.rotationPitch, -90.0F, 90.0F);
      this.prevRotationPitch = (float)((double)this.prevRotationPitch + var7);
      this.prevRotationYaw = (float)((double)this.prevRotationYaw + var9);
      this.prevRotationPitch = MathHelper.clamp(this.prevRotationPitch, -90.0F, 90.0F);
      if (this.ridingEntity != null) {
         this.ridingEntity.applyOrientationToEntity(this);
      }
   }

   public void tick() {
      if (!this.world.isRemote) {
         this.setFlag(6, this.isGlowing());
      }

      this.baseTick();
   }

   public void baseTick() {
      this.world.getProfiler().startSection("entityBaseTick");
      if (this.isPassenger() && this.getRidingEntity().removed) {
         this.stopRiding();
      }

      if (this.rideCooldown > 0) {
         this.rideCooldown--;
      }

      this.prevDistanceWalkedModified = this.distanceWalkedModified;
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
      this.updatePortal();
      if (this.method3261()) {
         this.method3262();
      }

      this.method3257();
      this.updateEyesInWater();
      this.updateSwimming();
      if (!this.world.isRemote) {
         if (this.fire > 0) {
            if (!this.isImmuneToFire()) {
               if (this.fire % 20 == 0 && !this.isInLava()) {
                  this.attackEntityFrom(DamageSource.field38994, 1.0F);
               }

               this.forceFireTicks(this.fire - 1);
            } else {
               this.forceFireTicks(this.fire - 4);
               if (this.fire < 0) {
                  this.extinguish();
               }
            }
         }
      } else {
         this.extinguish();
      }

      if (this.isInLava()) {
         this.setOnFireFromLava();
         this.fallDistance *= 0.5F;
      }

      if (this.getPosY() < -64.0) {
         this.outOfWorld();
      }

      if (!this.world.isRemote) {
         this.setFlag(0, this.fire > 0);
      }

      this.firstUpdate = false;
      this.world.getProfiler().endSection();
   }

   public void method3218() {
      this.field_242273_aw = this.getPortalCooldown();
   }

   public boolean method3219() {
      return this.field_242273_aw > 0;
   }

   public void decrementTimeUntilPortal() {
      if (this.method3219()) {
         this.field_242273_aw--;
      }
   }

   public int method2858() {
      return 0;
   }

   public void setOnFireFromLava() {
      if (!this.isImmuneToFire()) {
         this.setFire(15);
         this.attackEntityFrom(DamageSource.field38995, 4.0F);
      }
   }

   public void setFire(int var1) {
      int var4 = var1 * 20;
      if (this instanceof LivingEntity) {
         var4 = ProtectionEnchantment.getFireTimeForEntity((LivingEntity)this, var4);
      }

      if (this.fire < var4) {
         this.forceFireTicks(var4);
      }
   }

   public void forceFireTicks(int var1) {
      this.fire = var1;
   }

   public int getFireTimer() {
      return this.fire;
   }

   public void extinguish() {
      this.forceFireTicks(0);
   }

   public void outOfWorld() {
      this.remove();
   }

   public boolean isOffsetPositionInLiquid(double var1, double var3, double var5) {
      return this.isLiquidPresentInAABB(this.getBoundingBox().offset(var1, var3, var5));
   }

   private boolean isLiquidPresentInAABB(AxisAlignedBB var1) {
      return this.world.hasNoCollisions(this, var1) && !this.world.method7014(var1);
   }

   public void setOnGround(boolean var1) {
      this.onGround = var1;
   }

   public boolean isOnGround() {
      return this.onGround;
   }

   public void move(MoverType var1, Vector3d var2) {
      if (Minecraft.getInstance().player != null
         && Minecraft.getInstance().player.getRidingEntity() != null
         && Minecraft.getInstance().player.getRidingEntity().getEntityId() == this.getEntityId()) {
         EventMoveRideable var5 = new EventMoveRideable(var2.x, var2.y, var2.z);
         Client.getInstance().getEventManager().call(var5);
         if (var5.isCancelled()) {
            return;
         }

         var2 = new Vector3d(var5.getX(), var5.getY(), var5.getZ());
      }

      if (this.noClip) {
         this.setBoundingBox(this.getBoundingBox().offset(var2));
         this.resetPositionToBB();
      } else {
         if (var1 == MoverType.field13744) {
            var2 = this.handlePistonMovement(var2);
            if (var2.equals(Vector3d.ZERO)) {
               return;
            }
         }

         this.world.getProfiler().startSection("move");
         if (this.motionMultiplier.lengthSquared() > 1.0E-7) {
            var2 = var2.method11346(this.motionMultiplier);
            this.motionMultiplier = Vector3d.ZERO;
            this.setMotion(Vector3d.ZERO);
         }

         var2 = this.maybeBackOffFromEdge(var2, var1);
         Vector3d var25 = this.getAllowedMovement(var2);
         if (var25.lengthSquared() > 1.0E-7) {
            this.setBoundingBox(this.getBoundingBox().offset(var25));
            this.resetPositionToBB();
         }

         this.world.getProfiler().endSection();
         this.world.getProfiler().startSection("rest");
         this.collidedHorizontally = !MathHelper.method37787(var2.x, var25.x) || !MathHelper.method37787(var2.z, var25.z);
         this.collidedVertically = var2.y != var25.y;
         this.onGround = this.collidedVertically && var2.y < 0.0;
         BlockPos var6 = this.getOnPosition();
         BlockState var7 = this.world.getBlockState(var6);
         this.updateFallState(var25.y, this.onGround, var7, var6);
         Vector3d var8 = this.getMotion();
         if (var2.x != var25.x) {
            this.setMotion(0.0, var8.y, var8.z);
         }

         if (var2.z != var25.z) {
            this.setMotion(var8.x, var8.y, 0.0);
         }

         Block var9 = var7.getBlock();
         if (var2.y != var25.y) {
            var9.method11568(this.world, this);
         }

         if (this.onGround && !this.isSteppingCarefully()) {
            var9.onEntityWalk(this.world, var6, this);
         }

         if (this.canTriggerWalking() && !this.isPassenger()) {
            double var10 = var25.x;
            double var12 = var25.y;
            double var14 = var25.z;
            if (!var9.isIn(BlockTags.field32804)) {
               var12 = 0.0;
            }

            this.distanceWalkedModified = (float)((double)this.distanceWalkedModified + (double) MathHelper.sqrt(horizontalMag(var25)) * 0.6);
            this.distanceWalkedOnStepModified = (float)((double)this.distanceWalkedOnStepModified + (double) MathHelper.sqrt(var10 * var10 + var12 * var12 + var14 * var14) * 0.6);
            if (this.distanceWalkedOnStepModified > this.nextStepDistance && !var7.isAir()) {
               this.nextStepDistance = this.determineNextStepDistance();
               if (!this.isInWater()) {
                  this.playStepSound(var6, var7);
               } else {
                  Entity var16 = this.isBeingRidden() && this.method3407() != null ? this.method3407() : this;
                  float var17 = var16 == this ? 0.35F : 0.4F;
                  Vector3d var18 = var16.getMotion();
                  float var19 = MathHelper.sqrt(
                        var18.x * var18.x * 0.2F + var18.y * var18.y + var18.z * var18.z * 0.2F
                     )
                     * var17;
                  if (var19 > 1.0F) {
                     var19 = 1.0F;
                  }

                  this.playSwimSound(var19);
               }
            } else if (this.distanceWalkedOnStepModified > this.nextFlap && this.makeFlySound() && var7.isAir()) {
               this.nextFlap = this.playFlySound(this.distanceWalkedOnStepModified);
            }
         }

         try {
            this.doBlockCollisions();
         } catch (Throwable var23) {
            CrashReport var21 = CrashReport.makeCrashReport(var23, "Checking entity block collision");
            CrashReportCategory var22 = var21.makeCategory("Entity being checked for collision");
            this.fillCrashReport(var22);
            throw new ReportedException(var21);
         }

         float var20 = this.getSpeedFactor();
         this.setMotion(this.getMotion().method11347((double)var20, 1.0, (double)var20));
         if (this.world
               .method7004(this.getBoundingBox().shrink(0.001))
               .noneMatch(var0 -> var0.isIn(BlockTags.field32798) || var0.isIn(Blocks.LAVA))
            && this.fire <= 0) {
            this.forceFireTicks(-this.getFireImmuneTicks());
         }

         if (this.isInWaterRainOrBubbleColumn() && this.isBurning()) {
            this.playSound(SoundEvents.field26611, 0.7F, 1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
            this.forceFireTicks(-this.getFireImmuneTicks());
         }

         this.world.getProfiler().endSection();
      }
   }

   public BlockPos getOnPosition() {
      int var3 = MathHelper.floor(this.positionVec.x);
      int var4 = MathHelper.floor(this.positionVec.y - 0.2F);
      int var5 = MathHelper.floor(this.positionVec.z);
      BlockPos var6 = new BlockPos(var3, var4, var5);
      if (this.world.getBlockState(var6).isAir()) {
         BlockPos var7 = var6.down();
         BlockState var8 = this.world.getBlockState(var7);
         Block var9 = var8.getBlock();
         if (var9.isIn(BlockTags.field32771) || var9.isIn(BlockTags.field32764) || var9 instanceof Class3199) {
            return var7;
         }
      }

      return var6;
   }

   public float getJumpFactor() {
      float var3 = this.world.getBlockState(this.getPosition()).getBlock().method11573();
      float var4 = this.world.getBlockState(this.getPositionUnderneath()).getBlock().method11573();
      return (double)var3 != 1.0 ? var3 : var4;
   }

   public float getSpeedFactor() {
      Block var3 = this.world.getBlockState(this.getPosition()).getBlock();
      float var4 = var3.method11572();
      if (var3 != Blocks.WATER && var3 != Blocks.field37013) {
         return (double)var4 != 1.0 ? var4 : this.world.getBlockState(this.getPositionUnderneath()).getBlock().method11572();
      } else {
         return var4;
      }
   }

   public BlockPos getPositionUnderneath() {
      return new BlockPos(this.positionVec.x, this.getBoundingBox().minY - 0.5000001, this.positionVec.z);
   }

   public Vector3d maybeBackOffFromEdge(Vector3d var1, MoverType var2) {
      return var1;
   }

   public Vector3d handlePistonMovement(Vector3d var1) {
      if (!(var1.lengthSquared() <= 1.0E-7)) {
         long var4 = this.world.getGameTime();
         if (var4 != this.pistonDeltasGameTime) {
            Arrays.fill(this.pistonDeltas, 0.0);
            this.pistonDeltasGameTime = var4;
         }

         if (var1.x == 0.0) {
            if (var1.y == 0.0) {
               if (var1.z == 0.0) {
                  return Vector3d.ZERO;
               } else {
                  double var9 = this.calculatePistonDeltas(Direction.Z, var1.z);
                  return !(Math.abs(var9) <= 1.0E-5F) ? new Vector3d(0.0, 0.0, var9) : Vector3d.ZERO;
               }
            } else {
               double var8 = this.calculatePistonDeltas(Direction.Y, var1.y);
               return !(Math.abs(var8) <= 1.0E-5F) ? new Vector3d(0.0, var8, 0.0) : Vector3d.ZERO;
            }
         } else {
            double var6 = this.calculatePistonDeltas(Direction.X, var1.x);
            return !(Math.abs(var6) <= 1.0E-5F) ? new Vector3d(var6, 0.0, 0.0) : Vector3d.ZERO;
         }
      } else {
         return var1;
      }
   }

   private double calculatePistonDeltas(Direction var1, double var2) {
      int var6 = var1.ordinal();
      double var7 = MathHelper.clamp(var2 + this.pistonDeltas[var6], -0.51, 0.51);
      var2 = var7 - this.pistonDeltas[var6];
      this.pistonDeltas[var6] = var7;
      return var2;
   }

   public Vector3d getAllowedMovement(Vector3d var1) {
      AxisAlignedBB var4 = this.getBoundingBox();
      ISelectionContext var5 = ISelectionContext.forEntity(this);
      VoxelShape var6 = this.world.getWorldBorder().getShape();
      Stream var7 = ! VoxelShapes.compare(var6, VoxelShapes.create(var4.shrink(1.0E-7)), IBooleanFunction.AND)
         ? Stream.<VoxelShape>of(var6)
         : Stream.empty();
      Stream var8 = this.world.func_230318_c_(this, var4.contract(var1), var0 -> true);
      Class8544 var9 = new Class8544(Stream.concat(var8, var7));
      Vector3d var10 = var1.lengthSquared() != 0.0 ? collideBoundingBoxHeuristically(this, var1, var4, this.world, var5, var9) : var1;
      boolean var11 = var1.x != var10.x;
      boolean var12 = var1.y != var10.y;
      boolean var13 = var1.z != var10.z;
      boolean var14 = this.onGround || var12 && var1.y < 0.0;
      if (this.stepHeight > 0.0F && var14 && (var11 || var13)) {
         Vector3d var15 = collideBoundingBoxHeuristically(this, new Vector3d(var1.x, (double)this.stepHeight, var1.z), var4, this.world, var5, var9);
         Vector3d var16 = collideBoundingBoxHeuristically(
            this, new Vector3d(0.0, (double)this.stepHeight, 0.0), var4.contract(var1.x, 0.0, var1.z), this.world, var5, var9
         );
         if (var16.y < (double)this.stepHeight) {
            Vector3d var17 = collideBoundingBoxHeuristically(this, new Vector3d(var1.x, 0.0, var1.z), var4.offset(var16), this.world, var5, var9)
               .add(var16);
            if (horizontalMag(var17) > horizontalMag(var15)) {
               var15 = var17;
            }
         }

         double var18 = !(this instanceof ClientPlayerEntity)
            ? 0.0
            : collideBoundingBoxHeuristically(this, new Vector3d(0.0, -var15.y, 0.0), var4.offset(var15), this.world, var5, var9).y + var15.y;
         boolean var20 = false;
         if (var18 != 0.0) {
            EventStep var21 = new EventStep(var18, var10);
            Client.getInstance().getEventManager().call(var21);
            var20 = var21.isCancelled();
         }

         if (horizontalMag(var15) > horizontalMag(var10) && !var20) {
            return var15.add(
               collideBoundingBoxHeuristically(this, new Vector3d(0.0, -var15.y + var1.y, 0.0), var4.offset(var15), this.world, var5, var9)
            );
         }
      }

      return var10;
   }

   public static double horizontalMag(Vector3d var0) {
      return var0.x * var0.x + var0.z * var0.z;
   }

   public static Vector3d collideBoundingBoxHeuristically(Entity var0, Vector3d var1, AxisAlignedBB var2, World var3, ISelectionContext var4, Class8544<VoxelShape> var5) {
      boolean var8 = var1.x == 0.0;
      boolean var9 = var1.y == 0.0;
      boolean var10 = var1.z == 0.0;
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         boolean var12 = var0 != null && var0 instanceof ClientPlayerEntity;
         return collideBoundingBox(var1, var2, var3, var4, var5, var12);
      } else {
         Class8544 var11 = new Class8544<VoxelShape>(Stream.<VoxelShape>concat(var5.method30440(), var3.getCollisionShapes(var0, var2.contract(var1))));
         return getAllowedMovement(var1, var2, var11);
      }
   }

   public static Vector3d getAllowedMovement(Vector3d var0, AxisAlignedBB var1, Class8544<VoxelShape> var2) {
      double var5 = var0.x;
      double var7 = var0.y;
      double var9 = var0.z;
      if (var7 != 0.0) {
         var7 = VoxelShapes.method27437(Direction.Y, var1, var2.method30440(), var7);
         if (var7 != 0.0) {
            var1 = var1.offset(0.0, var7, 0.0);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9);
      if (var11 && var9 != 0.0) {
         var9 = VoxelShapes.method27437(Direction.Z, var1, var2.method30440(), var9);
         if (var9 != 0.0) {
            var1 = var1.offset(0.0, 0.0, var9);
         }
      }

      if (var5 != 0.0) {
         var5 = VoxelShapes.method27437(Direction.X, var1, var2.method30440(), var5);
         if (!var11 && var5 != 0.0) {
            var1 = var1.offset(var5, 0.0, 0.0);
         }
      }

      if (!var11 && var9 != 0.0) {
         var9 = VoxelShapes.method27437(Direction.Z, var1, var2.method30440(), var9);
      }

      return new Vector3d(var5, var7, var9);
   }

   public static Vector3d collideBoundingBox(Vector3d var0, AxisAlignedBB var1, IWorldReader var2, ISelectionContext var3, Class8544<VoxelShape> var4, boolean var5) {
      double var8 = var0.x;
      double var10 = var0.y;
      double var12 = var0.z;
      if (var10 != 0.0) {
         var10 = VoxelShapes.method27438(Direction.Y, var1, var2, var10, var3, var4.method30440(), var5);
         if (var10 != 0.0) {
            var1 = var1.offset(0.0, var10, 0.0);
         }
      }

      boolean var14 = Math.abs(var8) < Math.abs(var12);
      if (var14 && var12 != 0.0) {
         var12 = VoxelShapes.method27438(Direction.Z, var1, var2, var12, var3, var4.method30440(), var5);
         if (var12 != 0.0) {
            var1 = var1.offset(0.0, 0.0, var12);
         }
      }

      if (var8 != 0.0) {
         var8 = VoxelShapes.method27438(Direction.X, var1, var2, var8, var3, var4.method30440(), var5);
         if (!var14 && var8 != 0.0) {
            var1 = var1.offset(var8, 0.0, 0.0);
         }
      }

      if (!var14 && var12 != 0.0) {
         var12 = VoxelShapes.method27438(Direction.Z, var1, var2, var12, var3, var4.method30440(), var5);
      }

      return new Vector3d(var8, var10, var12);
   }

   public float determineNextStepDistance() {
      return (float)((int)this.distanceWalkedOnStepModified + 1);
   }

   public void resetPositionToBB() {
      AxisAlignedBB var3 = this.getBoundingBox();
      this.setRawPosition((var3.minX + var3.maxX) / 2.0, var3.minY, (var3.minZ + var3.maxZ) / 2.0);
   }

   public SoundEvent method2859() {
      return SoundEvents.field26615;
   }

   public SoundEvent method2860() {
      return SoundEvents.field26614;
   }

   public SoundEvent getSplashSound() {
      return SoundEvents.field26614;
   }

   public void doBlockCollisions() {
      AxisAlignedBB var3 = this.getBoundingBox();
      BlockPos var4 = new BlockPos(var3.minX + 0.001, var3.minY + 0.001, var3.minZ + 0.001);
      BlockPos var5 = new BlockPos(var3.maxX - 0.001, var3.maxY - 0.001, var3.maxZ - 0.001);
      BlockPos.Mutable var6 = new BlockPos.Mutable();
      if (this.world.isAreaLoaded(var4, var5)) {
         for (int var7 = var4.getX(); var7 <= var5.getX(); var7++) {
            for (int var8 = var4.getY(); var8 <= var5.getY(); var8++) {
               for (int var9 = var4.getZ(); var9 <= var5.getZ(); var9++) {
                  var6.method8372(var7, var8, var9);
                  BlockState var10 = this.world.getBlockState(var6);

                  try {
                     var10.method23432(this.world, var6, this);
                     this.onInsideBlock(var10);
                  } catch (Throwable var14) {
                     CrashReport var12 = CrashReport.makeCrashReport(var14, "Colliding entity with block");
                     CrashReportCategory var13 = var12.makeCategory("Block being collided with");
                     CrashReportCategory.addBlockInfo(var13, var6, var10);
                     throw new ReportedException(var12);
                  }
               }
            }
         }
      }
   }

   public void onInsideBlock(BlockState var1) {
   }

   public void playStepSound(BlockPos var1, BlockState var2) {
      if (!var2.getMaterial().isLiquid()) {
         BlockState var5 = this.world.getBlockState(var1.up());
         SoundType var6 = !var5.isIn(Blocks.SNOW) ? var2.getSoundType() : var5.getSoundType();
         this.playSound(var6.method29713(), var6.getVolume() * 0.15F, var6.method29711());
      }
   }

   public void playSwimSound(float var1) {
      this.playSound(this.method2859(), var1, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
   }

   public float playFlySound(float var1) {
      return 0.0F;
   }

   public boolean makeFlySound() {
      return false;
   }

   public void playSound(SoundEvent var1, float var2, float var3) {
      if (!this.isSilent()) {
         this.world.method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.method2864(), var2, var3);
      }
   }

   public boolean isSilent() {
      return this.dataManager.<Boolean>method35445(SILENT);
   }

   public void method3246(boolean var1) {
      this.dataManager.method35446(SILENT, var1);
   }

   public boolean method3247() {
      return this.dataManager.<Boolean>method35445(NO_GRAVITY);
   }

   public void method3248(boolean var1) {
      this.dataManager.method35446(NO_GRAVITY, var1);
   }

   public boolean canTriggerWalking() {
      return true;
   }

   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
      if (!var3) {
         if (var1 < 0.0) {
            this.fallDistance = (float)((double)this.fallDistance - var1);
         }
      } else {
         if (this.fallDistance > 0.0F) {
            var4.getBlock().onFallenUpon(this.world, var5, this, this.fallDistance);
         }

         this.fallDistance = 0.0F;
      }
   }

   public boolean isImmuneToFire() {
      return this.getType().method33207();
   }

   public boolean onLivingFall(float var1, float var2) {
      if (this.isBeingRidden()) {
         for (Entity var6 : this.getPassengers()) {
            var6.onLivingFall(var1, var2);
         }
      }

      return false;
   }

   public boolean isInWater() {
      return this.inWater;
   }

   private boolean isInRain() {
      BlockPos var3 = this.getPosition();
      return this.world.isRainingAt(var3)
         || this.world.isRainingAt(new BlockPos((double)var3.getX(), this.getBoundingBox().maxY, (double)var3.getZ()));
   }

   private boolean isInBubbleColumn() {
      return this.world.getBlockState(this.getPosition()).isIn(Blocks.field37013);
   }

   public boolean method3253() {
      return this.isInWater() || this.isInRain();
   }

   public boolean isInWaterRainOrBubbleColumn() {
      return this.isInWater() || this.isInRain() || this.isInBubbleColumn();
   }

   public boolean method3255() {
      return this.isInWater() || this.isInBubbleColumn();
   }

   public boolean canSwim() {
      return this.eyesInWater && this.isInWater();
   }

   public void updateSwimming() {
      if (!this.isSwimming()) {
         this.setSwimming(this.isSprinting() && this.canSwim() && !this.isPassenger());
      } else {
         this.setSwimming(this.isSprinting() && this.isInWater() && !this.isPassenger());
      }
   }

   public boolean method3257() {
      this.eyesFluidLevel.clear();
      this.method3258();
      double var3 = !this.world.method6812().isUltrawarm() ? 0.0023333333333333335 : 0.007;
      boolean var5 = this.handleFluidAcceleration(FluidTags.field40470, var3);
      return this.isInWater() || var5;
   }

   public void method3258() {
      if (!(this.getRidingEntity() instanceof BoatEntity)) {
         if (!this.handleFluidAcceleration(FluidTags.field40469, 0.014)) {
            this.inWater = false;
         } else {
            if (!this.inWater && !this.firstUpdate) {
               this.doWaterSplashEffect();
            }

            this.fallDistance = 0.0F;
            this.inWater = true;
            this.extinguish();
         }
      } else {
         this.inWater = false;
      }
   }

   private void updateEyesInWater() {
      this.eyesInWater = this.areEyesInFluid(FluidTags.field40469);
      this.field_241335_O_ = null;
      double var3 = this.getPosYEye() - 0.11111111F;
      Entity var5 = this.getRidingEntity();
      if (var5 instanceof BoatEntity) {
         BoatEntity var6 = (BoatEntity)var5;
         if (!var6.canSwim() && var6.getBoundingBox().maxY >= var3 && var6.getBoundingBox().minY <= var3) {
            return;
         }
      }

      BlockPos var12 = new BlockPos(this.getPosX(), var3, this.getPosZ());
      FluidState var7 = this.world.getFluidState(var12);

      for (ITag var9 : FluidTags.method32717()) {
         if (var7.method23486(var9)) {
            double var10 = (double)((float)var12.getY() + var7.method23475(this.world, var12));
            if (var10 > var3) {
               this.field_241335_O_ = var9;
            }

            return;
         }
      }
   }

   public void doWaterSplashEffect() {
      Entity var3 = this.isBeingRidden() && this.method3407() != null ? this.method3407() : this;
      float var4 = var3 != this ? 0.9F : 0.2F;
      Vector3d var5 = var3.getMotion();
      float var6 = MathHelper.sqrt(
            var5.x * var5.x * 0.2F + var5.y * var5.y + var5.z * var5.z * 0.2F
         )
         * var4;
      if (var6 > 1.0F) {
         var6 = 1.0F;
      }

      if (!((double)var6 < 0.25)) {
         this.playSound(this.getSplashSound(), var6, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
      } else {
         this.playSound(this.method2860(), var6, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
      }

      float var7 = (float) MathHelper.floor(this.getPosY());

      for (int var8 = 0; (float)var8 < 1.0F + this.size.field39968 * 20.0F; var8++) {
         double var9 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         double var11 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         this.world
            .addParticle(
               ParticleTypes.field34052,
               this.getPosX() + var9,
               (double)(var7 + 1.0F),
               this.getPosZ() + var11,
               var5.x,
               var5.y - this.rand.nextDouble() * 0.2F,
               var5.z
            );
      }

      for (int var13 = 0; (float)var13 < 1.0F + this.size.field39968 * 20.0F; var13++) {
         double var14 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         double var15 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         this.world
            .addParticle(
               ParticleTypes.field34099,
               this.getPosX() + var14,
               (double)(var7 + 1.0F),
               this.getPosZ() + var15,
               var5.x,
               var5.y,
               var5.z
            );
      }
   }

   public BlockState getStateBelow() {
      return this.world.getBlockState(this.getOnPosition());
   }

   public boolean method3261() {
      return this.isSprinting() && !this.isInWater() && !this.isSpectator() && !this.method3336() && !this.isInLava() && this.isAlive();
   }

   public void method3262() {
      int var3 = MathHelper.floor(this.getPosX());
      int var4 = MathHelper.floor(this.getPosY() - 0.2F);
      int var5 = MathHelper.floor(this.getPosZ());
      BlockPos var6 = new BlockPos(var3, var4, var5);
      BlockState var7 = this.world.getBlockState(var6);
      if (var7.getRenderType() != BlockRenderType.field9885) {
         Vector3d var8 = this.getMotion();
         this.world
            .addParticle(
               new BlockParticleData(ParticleTypes.field34051, var7),
               this.getPosX() + (this.rand.nextDouble() - 0.5) * (double)this.size.field39968,
               this.getPosY() + 0.1,
               this.getPosZ() + (this.rand.nextDouble() - 0.5) * (double)this.size.field39968,
               var8.x * -4.0,
               1.5,
               var8.z * -4.0
            );
      }
   }

   public boolean areEyesInFluid(ITag<Fluid> var1) {
      return this.field_241335_O_ == var1;
   }

   public boolean isInLava() {
      return !this.firstUpdate && this.eyesFluidLevel.getDouble(FluidTags.field40470) > 0.0;
   }

   public void moveRelative(float var1, Vector3d var2) {
      Vector3d var5 = getAbsoluteMotion(var2, var1, this.rotationYaw);
      this.setMotion(this.getMotion().add(var5));
   }

   private static Vector3d getAbsoluteMotion(Vector3d var0, float var1, float var2) {
      double var5 = var0.lengthSquared();
      if (!(var5 < 1.0E-7)) {
         Vector3d var7 = (!(var5 > 1.0) ? var0 : var0.method11333()).scale((double)var1);
         float var8 = MathHelper.sin(var2 * (float) (Math.PI / 180.0));
         float var9 = MathHelper.cos(var2 * (float) (Math.PI / 180.0));
         return new Vector3d(
            var7.x * (double)var9 - var7.z * (double)var8, var7.y, var7.z * (double)var9 + var7.x * (double)var8
         );
      } else {
         return Vector3d.ZERO;
      }
   }

   public float getBrightness() {
      BlockPos.Mutable var3 = new BlockPos.Mutable(this.getPosX(), 0.0, this.getPosZ());
      if (!this.world.method7017(var3)) {
         return 0.0F;
      } else {
         var3.method8308(MathHelper.floor(this.getPosYEye()));
         return this.world.method7009(var3);
      }
   }

   public void setWorld(World var1) {
      this.world = var1;
   }

   public void setPositionAndRotation(double var1, double var3, double var5, float var7, float var8) {
      this.method3270(var1, var3, var5);
      this.rotationYaw = var7 % 360.0F;
      this.rotationPitch = MathHelper.clamp(var8, -90.0F, 90.0F) % 360.0F;
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
   }

   public void method3270(double var1, double var3, double var5) {
      double var9 = MathHelper.clamp(var1, -3.0E7, 3.0E7);
      double var11 = MathHelper.clamp(var5, -3.0E7, 3.0E7);
      this.prevPosX = var9;
      this.prevPosY = var3;
      this.prevPosZ = var11;
      this.setPosition(var9, var3, var11);
   }

   public void moveForced(Vector3d var1) {
      this.moveForced(var1.x, var1.y, var1.z);
   }

   public void moveForced(double var1, double var3, double var5) {
      this.setLocationAndAngles(var1, var3, var5, this.rotationYaw, this.rotationPitch);
   }

   public void moveToBlockPosAndAngles(BlockPos var1, float var2, float var3) {
      this.setLocationAndAngles((double)var1.getX() + 0.5, (double)var1.getY(), (double)var1.getZ() + 0.5, var2, var3);
   }

   public void setLocationAndAngles(double var1, double var3, double var5, float var7, float var8) {
      this.setLocationAndAngles(var1, var3, var5);
      this.rotationYaw = var7;
      this.rotationPitch = var8;
      this.recenterBoundingBox();
   }

   public void setLocationAndAngles(double var1, double var3, double var5) {
      this.setRawPosition(var1, var3, var5);
      this.prevPosX = var1;
      this.prevPosY = var3;
      this.prevPosZ = var5;
      this.lastTickPosX = var1;
      this.lastTickPosY = var3;
      this.lastTickPosZ = var5;
   }

   public float getDistance(Entity var1) {
      float var4 = (float)(this.getPosX() - var1.getPosX());
      float var5 = (float)(this.getPosY() - var1.getPosY());
      float var6 = (float)(this.getPosZ() - var1.getPosZ());
      return MathHelper.method37765(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public double getDistanceNearest(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public double getDistanceSq(Entity var1) {
      return this.getDistanceNearest3(var1.getPositionVec());
   }

   public double getDistanceNearest3(Vector3d var1) {
      double var4 = this.getPosX() - var1.x;
      double var6 = this.getPosY() - var1.y;
      double var8 = this.getPosZ() - var1.z;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public void onCollideWithPlayer(PlayerEntity var1) {
   }

   public void applyEntityCollision(Entity var1) {
      if (!this.method3416(var1) && !var1.noClip && !this.noClip) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = MathHelper.absMax(var4, var6);
         if (var8 >= 0.01F) {
            var8 = (double) MathHelper.sqrt(var8);
            var4 /= var8;
            var6 /= var8;
            double var10 = 1.0 / var8;
            if (var10 > 1.0) {
               var10 = 1.0;
            }

            var4 *= var10;
            var6 *= var10;
            var4 *= 0.05F;
            var6 *= 0.05F;
            var4 *= (double)(1.0F - this.entityCollisionReduction);
            var6 *= (double)(1.0F - this.entityCollisionReduction);
            if (!this.isBeingRidden()) {
               this.addVelocity(-var4, 0.0, -var6);
            }

            if (!var1.isBeingRidden()) {
               var1.addVelocity(var4, 0.0, var6);
            }
         }
      }
   }

   public void addVelocity(double var1, double var3, double var5) {
      this.setMotion(this.getMotion().add(var1, var3, var5));
      this.isAirBorne = true;
   }

   public void markVelocityChanged() {
      this.velocityChanged = true;
   }

   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         this.markVelocityChanged();
         return false;
      } else {
         return false;
      }
   }

   public final Vector3d getLook(float var1) {
      return this.getVectorForRotation(this.getPitch(var1), this.getYaw(var1));
   }

   public float getPitch(float var1) {
      return var1 != 1.0F ? MathHelper.lerp(var1, this.prevRotationPitch, this.rotationPitch) : this.rotationPitch;
   }

   public float getYaw(float var1) {
      return var1 != 1.0F ? MathHelper.lerp(var1, this.prevRotationYaw, this.rotationYaw) : this.rotationYaw;
   }

   public final Vector3d getVectorForRotation(float var1, float var2) {
      float var5 = var1 * (float) (Math.PI / 180.0);
      float var6 = -var2 * (float) (Math.PI / 180.0);
      float var7 = MathHelper.cos(var6);
      float var8 = MathHelper.sin(var6);
      float var9 = MathHelper.cos(var5);
      float var10 = MathHelper.sin(var5);
      return new Vector3d((double)(var8 * var9), (double)(-var10), (double)(var7 * var9));
   }

   public final Vector3d getUpVector(float var1) {
      return this.calculateUpVector(this.getPitch(var1), this.getYaw(var1));
   }

   public final Vector3d calculateUpVector(float var1, float var2) {
      return this.getVectorForRotation(var1 - 90.0F, var2);
   }

   public final Vector3d getEyePosition(float var1) {
      if (var1 != 1.0F) {
         double var4 = MathHelper.lerp((double)var1, this.prevPosX, this.getPosX());
         double var6 = MathHelper.lerp((double)var1, this.prevPosY, this.getPosY()) + (double)this.getEyeHeight();
         double var8 = MathHelper.lerp((double)var1, this.prevPosZ, this.getPosZ());
         return new Vector3d(var4, var6, var8);
      } else {
         return new Vector3d(this.getPosX(), this.getPosYEye(), this.getPosZ());
      }
   }

   public Vector3d method3287(float var1) {
      return this.getEyePosition(var1);
   }

   public final Vector3d method3288(float var1) {
      double var4 = MathHelper.lerp((double)var1, this.prevPosX, this.getPosX());
      double var6 = MathHelper.lerp((double)var1, this.prevPosY, this.getPosY());
      double var8 = MathHelper.lerp((double)var1, this.prevPosZ, this.getPosZ());
      return new Vector3d(var4, var6, var8);
   }

   public RayTraceResult customPick(double var1, float var3, boolean var4) {
      Vector3d var7 = this.getEyePosition(var3);
      Vector3d var8 = this.getLook(var3);
      Vector3d var9 = var7.add(var8.x * var1, var8.y * var1, var8.z * var1);
      return this.world.rayTraceBlocks(new RayTraceContext(var7, var9, Class2271.field14775, !var4 ? Class1985.field12962 : Class1985.field12964, this));
   }

   public boolean canBeCollidedWith() {
      return false;
   }

   public boolean canBePushed() {
      return false;
   }

   public void awardKillScore(Entity var1, int var2, DamageSource var3) {
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44467.method15158((ServerPlayerEntity)var1, this, var3);
      }
   }

   public boolean isInRangeToRender3d(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      return this.isInRangeToRenderDist(var15);
   }

   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength();
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * renderDistanceWeight;
      return var1 < var5 * var5;
   }

   public boolean writeUnlessRemoved(CompoundNBT var1) {
      String var4 = this.getEntityString();
      if (!this.removed && var4 != null) {
         var1.method109("id", var4);
         this.writeWithoutTypeId(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean writeUnlessPassenger(CompoundNBT var1) {
      return !this.isPassenger() ? this.writeUnlessRemoved(var1) : false;
   }

   public CompoundNBT writeWithoutTypeId(CompoundNBT var1) {
      try {
         if (this.ridingEntity != null) {
            var1.put("Pos", this.newDoubleNBTList(this.ridingEntity.getPosX(), this.getPosY(), this.ridingEntity.getPosZ()));
         } else {
            var1.put("Pos", this.newDoubleNBTList(this.getPosX(), this.getPosY(), this.getPosZ()));
         }

         Vector3d var4 = this.getMotion();
         var1.put("Motion", this.newDoubleNBTList(var4.x, var4.y, var4.z));
         var1.put("Rotation", this.newFloatNBTList(this.rotationYaw, this.rotationPitch));
         var1.putFloat("FallDistance", this.fallDistance);
         var1.putShort("Fire", (short)this.fire);
         var1.putShort("Air", (short)this.getAir());
         var1.putBoolean("OnGround", this.onGround);
         var1.putBoolean("Invulnerable", this.invulnerable);
         var1.putInt("PortalCooldown", this.field_242273_aw);
         var1.method104("UUID", this.getUniqueID());
         ITextComponent var11 = this.method3380();
         if (var11 != null) {
            var1.method109("CustomName", ITextComponent$Serializer.toJson(var11));
         }

         if (this.method3383()) {
            var1.putBoolean("CustomNameVisible", this.method3383());
         }

         if (this.isSilent()) {
            var1.putBoolean("Silent", this.isSilent());
         }

         if (this.method3247()) {
            var1.putBoolean("NoGravity", this.method3247());
         }

         if (this.glowing) {
            var1.putBoolean("Glowing", this.glowing);
         }

         if (!this.tags.isEmpty()) {
            ListNBT var12 = new ListNBT();

            for (String var8 : this.tags) {
               var12.add(StringNBT.valueOf(var8));
            }

            var1.put("Tags", var12);
         }

         this.writeAdditional(var1);
         if (this.isBeingRidden()) {
            ListNBT var13 = new ListNBT();

            for (Entity var15 : this.getPassengers()) {
               CompoundNBT var9 = new CompoundNBT();
               if (var15.writeUnlessRemoved(var9)) {
                  var13.add(var9);
               }
            }

            if (!var13.isEmpty()) {
               var1.put("Passengers", var13);
            }
         }

         return var1;
      } catch (Throwable var10) {
         CrashReport var5 = CrashReport.makeCrashReport(var10, "Saving entity NBT");
         CrashReportCategory var6 = var5.makeCategory("Entity being saved");
         this.fillCrashReport(var6);
         throw new ReportedException(var5);
      }
   }

   public void read(CompoundNBT var1) {
      try {
         ListNBT var4 = var1.method131("Pos", 6);
         ListNBT var18 = var1.method131("Motion", 6);
         ListNBT var19 = var1.method131("Rotation", 5);
         double var7 = var18.method158(0);
         double var9 = var18.method158(1);
         double var11 = var18.method158(2);
         this.setMotion(Math.abs(var7) > 10.0 ? 0.0 : var7, Math.abs(var9) > 10.0 ? 0.0 : var9, Math.abs(var11) > 10.0 ? 0.0 : var11);
         this.setLocationAndAngles(var4.method158(0), var4.method158(1), var4.method158(2));
         this.rotationYaw = var19.method159(0);
         this.rotationPitch = var19.method159(1);
         this.prevRotationYaw = this.rotationYaw;
         this.prevRotationPitch = this.rotationPitch;
         this.setRotationYawHead(this.rotationYaw);
         this.setRenderYawOffset(this.rotationYaw);
         this.fallDistance = var1.getFloat("FallDistance");
         this.fire = var1.getShort("Fire");
         this.setAir(var1.getShort("Air"));
         this.onGround = var1.getBoolean("OnGround");
         this.invulnerable = var1.getBoolean("Invulnerable");
         this.field_242273_aw = var1.getInt("PortalCooldown");
         if (var1.method106("UUID")) {
            this.entityUniqueID = var1.method105("UUID");
            this.cachedUniqueIdString = this.entityUniqueID.toString();
         }

         if (!Double.isFinite(this.getPosX()) || !Double.isFinite(this.getPosY()) || !Double.isFinite(this.getPosZ())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.rotationYaw) && Double.isFinite((double)this.rotationPitch)) {
            this.recenterBoundingBox();
            this.setRotation(this.rotationYaw, this.rotationPitch);
            if (var1.contains("CustomName", 8)) {
               String var13 = var1.getString("CustomName");

               try {
                  this.method3379(ITextComponent$Serializer.func_240643_a_(var13));
               } catch (Exception var16) {
                  LOGGER.warn("Failed to parse entity custom name {}", var13, var16);
               }
            }

            this.method3382(var1.getBoolean("CustomNameVisible"));
            this.method3246(var1.getBoolean("Silent"));
            this.method3248(var1.getBoolean("NoGravity"));
            this.setGlowing(var1.getBoolean("Glowing"));
            if (var1.contains("Tags", 9)) {
               this.tags.clear();
               ListNBT var20 = var1.method131("Tags", 8);
               int var14 = Math.min(var20.size(), 1024);

               for (int var15 = 0; var15 < var14; var15++) {
                  this.tags.add(var20.method160(var15));
               }
            }

            this.readAdditional(var1);
            if (this.method3296()) {
               this.recenterBoundingBox();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         CrashReport var5 = CrashReport.makeCrashReport(var17, "Loading entity NBT");
         CrashReportCategory var6 = var5.makeCategory("Entity being loaded");
         this.fillCrashReport(var6);
         throw new ReportedException(var5);
      }
   }

   public boolean method3296() {
      return true;
   }

   @Nullable
   public final String getEntityString() {
      EntityType var3 = this.getType();
      ResourceLocation var4 = EntityType.method33198(var3);
      return var3.method33205() && var4 != null ? var4.toString() : null;
   }

   public abstract void readAdditional(CompoundNBT var1);

   public abstract void writeAdditional(CompoundNBT var1);

   public ListNBT newDoubleNBTList(double... var1) {
      ListNBT var4 = new ListNBT();

      for (double var8 : var1) {
         var4.add(Class34.method93(var8));
      }

      return var4;
   }

   public ListNBT newFloatNBTList(float... var1) {
      ListNBT var4 = new ListNBT();

      for (float var8 : var1) {
         var4.add(Class32.method90(var8));
      }

      return var4;
   }

   @Nullable
   public ItemEntity entityDropItem(IItemProvider var1) {
      return this.entityDropItem(var1, 0);
   }

   @Nullable
   public ItemEntity entityDropItem(IItemProvider var1, int var2) {
      return this.method3303(new ItemStack(var1), (float)var2);
   }

   @Nullable
   public ItemEntity method3302(ItemStack var1) {
      return this.method3303(var1, 0.0F);
   }

   @Nullable
   public ItemEntity method3303(ItemStack var1, float var2) {
      if (!var1.isEmpty()) {
         if (!this.world.isRemote) {
            ItemEntity var5 = new ItemEntity(this.world, this.getPosX(), this.getPosY() + (double)var2, this.getPosZ(), var1);
            var5.setDefaultPickupDelay();
            this.world.addEntity(var5);
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean isAlive() {
      return !this.removed;
   }

   public boolean isEntityInsideOpaqueBlock() {
      if (!this.noClip) {
         float var3 = 0.1F;
         float var4 = this.size.field39968 * 0.8F;
         AxisAlignedBB var5 = AxisAlignedBB.method19686((double)var4, 0.1F, (double)var4).offset(this.getPosX(), this.getPosYEye(), this.getPosZ());
         return this.world.func_241457_a_(this, var5, (var1, var2) -> var1.method23437(this.world, var2)).findAny().isPresent();
      } else {
         return false;
      }
   }

   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      return ActionResultType.field14820;
   }

   public boolean canCollide(Entity var1) {
      return var1.method3306() && !this.method3416(var1);
   }

   public boolean method3306() {
      return false;
   }

   public void updateRidden() {
      this.setMotion(Vector3d.ZERO);
      this.tick();
      if (this.isPassenger()) {
         this.getRidingEntity().method3307(this);
      }
   }

   public void method3307(Entity var1) {
      this.positionRider(var1, Entity::setPosition);
   }

   private void positionRider(Entity var1, Class9347 var2) {
      if (this.method3409(var1)) {
         double var5 = this.getPosY() + this.method3310() + var1.getYOffset();
         var2.method35390(var1, this.getPosX(), var5, this.getPosZ());
      }
   }

   public void applyOrientationToEntity(Entity var1) {
   }

   public double getYOffset() {
      return 0.0;
   }

   public double method3310() {
      return (double)this.size.field39969 * 0.75;
   }

   public boolean method3311(Entity var1) {
      return this.startRiding(var1, false);
   }

   public boolean method3312() {
      return this instanceof LivingEntity;
   }

   public boolean startRiding(Entity var1, boolean var2) {
      for (Entity var5 = var1; var5.ridingEntity != null; var5 = var5.ridingEntity) {
         if (var5.ridingEntity == this) {
            return false;
         }
      }

      if (var2 || this.canBeRidden(var1) && var1.canFitPassenger(this)) {
         if (this.isPassenger()) {
            this.stopRiding();
         }

         this.setPose(Pose.STANDING);
         this.ridingEntity = var1;
         this.ridingEntity.addPassenger(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean canBeRidden(Entity var1) {
      return !this.isSneaking() && this.rideCooldown <= 0;
   }

   public boolean isPoseClear(Pose var1) {
      return this.world.hasNoCollisions(this, this.getBoundingBox(var1).shrink(1.0E-7));
   }

   public void removePassengers() {
      for (int var3 = this.passengers.size() - 1; var3 >= 0; var3--) {
         this.passengers.get(var3).stopRiding();
      }
   }

   public void dismount() {
      if (this.ridingEntity != null) {
         Entity var3 = this.ridingEntity;
         this.ridingEntity = null;
         var3.removePassenger(this);
      }
   }

   public void stopRiding() {
      this.dismount();
   }

   public void addPassenger(Entity var1) {
      if (var1.getRidingEntity() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (!this.world.isRemote && var1 instanceof PlayerEntity && !(this.method3407() instanceof PlayerEntity)) {
            this.passengers.add(0, var1);
         } else {
            this.passengers.add(var1);
         }
      }
   }

   public void removePassenger(Entity var1) {
      if (var1.getRidingEntity() != this) {
         this.passengers.remove(var1);
         var1.rideCooldown = 60;
      } else {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      }
   }

   public boolean canFitPassenger(Entity var1) {
      return this.getPassengers().size() < 1;
   }

   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.setPosition(var1, var3, var5);
      this.setRotation(var7, var8);
   }

   public void setHeadRotation(float var1, int var2) {
      this.setRotationYawHead(var1);
   }

   public float getCollisionBorderSize() {
      return 0.0F;
   }

   public Vector3d getLookVec() {
      return this.getVectorForRotation(this.rotationPitch, this.rotationYaw);
   }

   public Vector2f getPitchYaw() {
      return new Vector2f(this.rotationPitch, this.rotationYaw);
   }

   public Vector3d getForward() {
      return Vector3d.method11353(this.getPitchYaw());
   }

   public void setPortal(BlockPos var1) {
      if (!this.method3219()) {
         if (!this.world.isRemote && !var1.equals(this.field_242271_ac)) {
            this.field_242271_ac = var1.toImmutable();
         }

         this.inPortal = true;
      } else {
         this.method3218();
      }
   }

   public void updatePortal() {
      if (this.world instanceof ServerWorld) {
         int var3 = this.method2858();
         ServerWorld var4 = (ServerWorld)this.world;
         if (!this.inPortal) {
            if (this.portalCounter > 0) {
               this.portalCounter -= 4;
            }

            if (this.portalCounter < 0) {
               this.portalCounter = 0;
            }
         } else {
            MinecraftServer var5 = var4.getServer();
            RegistryKey var6 = this.world.getDimensionKey() != World.THE_NETHER ? World.THE_NETHER : World.OVERWORLD;
            ServerWorld var7 = var5.method1318(var6);
            if (var7 != null && var5.method1312() && !this.isPassenger() && this.portalCounter++ >= var3) {
               this.world.getProfiler().startSection("portal");
               this.portalCounter = var3;
               this.method3218();
               this.changeDimension(var7);
               this.world.getProfiler().endSection();
            }

            this.inPortal = false;
         }

         this.decrementTimeUntilPortal();
      }
   }

   public int getPortalCooldown() {
      return 300;
   }

   public void method3325(double var1, double var3, double var5) {
      this.setMotion(var1, var3, var5);
   }

   public void handleStatusUpdate(byte var1) {
      switch (var1) {
         case 53:
            HoneyBlock.method11976(this);
      }
   }

   public void performHurtAnimation() {
   }

   public Iterable<ItemStack> method2946() {
      return EMPTY_EQUIPMENT;
   }

   public Iterable<ItemStack> getArmorInventoryList() {
      return EMPTY_EQUIPMENT;
   }

   public Iterable<ItemStack> method3326() {
      return Iterables.concat(this.method2946(), this.getArmorInventoryList());
   }

   public void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2) {
   }

   public boolean isBurning() {
      boolean var3 = this.world != null && this.world.isRemote;
      return !this.isImmuneToFire() && (this.fire > 0 || var3 && this.getFlag(0));
   }

   public boolean isPassenger() {
      return this.getRidingEntity() != null;
   }

   public boolean isBeingRidden() {
      return !this.getPassengers().isEmpty();
   }

   public boolean onDeathUpdate() {
      return true;
   }

   public void setSneaking(boolean var1) {
      this.setFlag(1, var1);
   }

   public boolean isSneaking() {
      return this.getFlag(1);
   }

   public boolean isSteppingCarefully() {
      return this.isSneaking();
   }

   public boolean method3333() {
      return this.isSneaking();
   }

   public boolean isDiscrete() {
      return this.isSneaking();
   }

   public boolean method3335() {
      return this.isSneaking();
   }

   public boolean method3336() {
      return this.getPose() == Pose.field13624;
   }

   public boolean isSprinting() {
      return this.getFlag(3);
   }

   public void setSprinting(boolean var1) {
      this.setFlag(3, var1);
   }

   public boolean isSwimming() {
      return this.getFlag(4);
   }

   public boolean isActualySwimming() {
      return this.getPose() == Pose.field13622;
   }

   public boolean method3338() {
      return this.isActualySwimming() && !this.isInWater();
   }

   public void setSwimming(boolean var1) {
      this.setFlag(4, var1);
   }

   public boolean isGlowing() {
      return this.glowing || this.world.isRemote && this.getFlag(6);
   }

   public void setGlowing(boolean var1) {
      this.glowing = var1;
      if (!this.world.isRemote) {
         this.setFlag(6, this.glowing);
      }
   }

   public boolean isInvisible() {
      return this.getFlag(5);
   }

   public boolean isInvisibleToPlayer(PlayerEntity var1) {
      if (var1.isSpectator()) {
         return false;
      } else {
         Team var4 = this.getTeam();
         return var4 != null && var1 != null && var1.getTeam() == var4 && var4.method28580() ? false : this.isInvisible();
      }
   }

   @Nullable
   public Team getTeam() {
      return this.world.method6805().method20998(this.method2956());
   }

   public boolean isOnSameTeam(Entity var1) {
      return this.isOnScoreboardTeam(var1.getTeam());
   }

   public boolean isOnScoreboardTeam(Team var1) {
      return this.getTeam() == null ? false : this.getTeam().method28592(var1);
   }

   public void setInvisible(boolean var1) {
      this.setFlag(5, var1);
   }

   public boolean getFlag(int var1) {
      return (this.dataManager.<Byte>method35445(FLAGS) & 1 << var1) != 0;
   }

   public void setFlag(int var1, boolean var2) {
      byte var5 = this.dataManager.<Byte>method35445(FLAGS);
      if (!var2) {
         this.dataManager.method35446(FLAGS, (byte)(var5 & ~(1 << var1)));
      } else {
         this.dataManager.method35446(FLAGS, (byte)(var5 | 1 << var1));
      }
   }

   public int getMaxAir() {
      return 300;
   }

   public int getAir() {
      return this.dataManager.<Integer>method35445(AIR);
   }

   public void setAir(int var1) {
      this.dataManager.method35446(AIR, var1);
   }

   public void method3353(ServerWorld var1, Class906 var2) {
      this.forceFireTicks(this.fire + 1);
      if (this.fire == 0) {
         this.setFire(8);
      }

      this.attackEntityFrom(DamageSource.field38993, 5.0F);
   }

   public void method3354(boolean var1) {
      Vector3d var4 = this.getMotion();
      double var5;
      if (!var1) {
         var5 = Math.min(1.8, var4.y + 0.1);
      } else {
         var5 = Math.max(-0.9, var4.y - 0.03);
      }

      this.setMotion(var4.x, var5, var4.z);
   }

   public void onEnterBubbleColumnWithAirAbove(boolean var1) {
      Vector3d var4 = this.getMotion();
      double var5;
      if (!var1) {
         var5 = Math.min(0.7, var4.y + 0.06);
      } else {
         var5 = Math.max(-0.3, var4.y - 0.03);
      }

      this.setMotion(var4.x, var5, var4.z);
      this.fallDistance = 0.0F;
   }

   public void method2927(ServerWorld var1, LivingEntity var2) {
   }

   public void pushOutOfBlocks(double var1, double var3, double var5) {
      BlockPos var9 = new BlockPos(var1, var3, var5);
      Vector3d var10 = new Vector3d(var1 - (double)var9.getX(), var3 - (double)var9.getY(), var5 - (double)var9.getZ());
      BlockPos.Mutable var11 = new BlockPos.Mutable();
      net.minecraft.util.Direction var12 = net.minecraft.util.Direction.field673;
      double var13 = Double.MAX_VALUE;

      for (net.minecraft.util.Direction var18 : new net.minecraft.util.Direction[]{net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.WEST, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.field673}) {
         var11.method8377(var9, var18);
         if (!this.world.getBlockState(var11).method23456(this.world, var11)) {
            double var19 = var10.getCoordinate(var18.getAxis());
            double var21 = var18.getAxisDirection() != Class1892.field11092 ? var19 : 1.0 - var19;
            if (var21 < var13) {
               var13 = var21;
               var12 = var18;
            }
         }
      }

      float var23 = this.rand.nextFloat() * 0.2F + 0.1F;
      float var24 = (float)var12.getAxisDirection().getOffset();
      Vector3d var25 = this.getMotion().scale(0.75);
      if (var12.getAxis() != Direction.X) {
         if (var12.getAxis() != Direction.Y) {
            if (var12.getAxis() == Direction.Z) {
               this.setMotion(var25.x, var25.y, (double)(var24 * var23));
            }
         } else {
            this.setMotion(var25.x, (double)(var24 * var23), var25.z);
         }
      } else {
         this.setMotion((double)(var24 * var23), var25.y, var25.z);
      }
   }

   public void setMotionMultiplier(BlockState var1, Vector3d var2) {
      this.fallDistance = 0.0F;
      this.motionMultiplier = var2;
   }

   private static ITextComponent method3357(ITextComponent var0) {
      IFormattableTextComponent var3 = var0.copyRaw().setStyle(var0.getStyle().setClickEvent((ClickEvent)null));

      for (ITextComponent var5 : var0.getSiblings()) {
         var3.append(method3357(var5));
      }

      return var3;
   }

   @Override
   public ITextComponent getName() {
      ITextComponent var3 = this.method3380();
      return var3 == null ? this.getProfessionName() : method3357(var3);
   }

   public ITextComponent getProfessionName() {
      return this.type.method33211();
   }

   public boolean isEntityEqual(Entity var1) {
      return this == var1;
   }

   public float getRotationYawHead() {
      return 0.0F;
   }

   public void setRotationYawHead(float var1) {
   }

   public void setRenderYawOffset(float var1) {
   }

   public boolean method3360() {
      return true;
   }

   public boolean method3361(Entity var1) {
      return false;
   }

   @Override
   public String toString() {
      return String.format(
         Locale.ROOT,
         "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
         this.getClass().getSimpleName(),
         this.getName().getString(),
         this.entityId,
         this.world != null ? this.world.toString() : "~NULL~",
         this.getPosX(),
         this.getPosY(),
         this.getPosZ()
      );
   }

   public boolean isInvulnerableTo(DamageSource var1) {
      return this.invulnerable && var1 != DamageSource.field39004 && !var1.method31146();
   }

   public boolean method3362() {
      return this.invulnerable;
   }

   public void method3363(boolean var1) {
      this.invulnerable = var1;
   }

   public void method3364(Entity var1) {
      this.setLocationAndAngles(var1.getPosX(), var1.getPosY(), var1.getPosZ(), var1.rotationYaw, var1.rotationPitch);
   }

   public void method3365(Entity var1) {
      CompoundNBT var4 = var1.writeWithoutTypeId(new CompoundNBT());
      var4.method133("Dimension");
      this.read(var4);
      this.field_242273_aw = var1.field_242273_aw;
      this.field_242271_ac = var1.field_242271_ac;
   }

   @Nullable
   public Entity changeDimension(ServerWorld var1) {
      if (this.world instanceof ServerWorld && !this.removed) {
         this.world.getProfiler().startSection("changeDimension");
         this.detach();
         this.world.getProfiler().startSection("reposition");
         PortalInfo var4 = this.method2744(var1);
         if (var4 != null) {
            this.world.getProfiler().endStartSection("reloading");
            Entity var5 = this.getType().create(var1);
            if (var5 != null) {
               var5.method3365(this);
               var5.setLocationAndAngles(var4.field45665.x, var4.field45665.y, var4.field45665.z, var4.field45667, var5.rotationPitch);
               var5.setMotion(var4.field45666);
               var1.method6918(var5);
               if (var1.getDimensionKey() == World.THE_END) {
                  ServerWorld.method6973(var1);
               }
            }

            this.setDead();
            this.world.getProfiler().endSection();
            ((ServerWorld)this.world).resetUpdateEntityTick();
            var1.resetUpdateEntityTick();
            this.world.getProfiler().endSection();
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void setDead() {
      this.removed = true;
   }

   @Nullable
   public PortalInfo method2744(ServerWorld var1) {
      boolean var4 = this.world.getDimensionKey() == World.THE_END && var1.getDimensionKey() == World.OVERWORLD;
      boolean var5 = var1.getDimensionKey() == World.THE_END;
      if (!var4 && !var5) {
         boolean var19 = var1.getDimensionKey() == World.THE_NETHER;
         if (this.world.getDimensionKey() != World.THE_NETHER && !var19) {
            return null;
         } else {
            WorldBorder var7 = var1.getWorldBorder();
            double var8 = Math.max(-2.9999872E7, var7.method24530() + 16.0);
            double var10 = Math.max(-2.9999872E7, var7.method24531() + 16.0);
            double var12 = Math.min(2.9999872E7, var7.method24532() - 16.0);
            double var14 = Math.min(2.9999872E7, var7.method24533() - 16.0);
            double var16 = DimensionType.getCoordinateDifference(this.world.method6812(), var1.method6812());
            BlockPos var18 = new BlockPos(
               MathHelper.clamp(this.getPosX() * var16, var8, var12), this.getPosY(), MathHelper.clamp(this.getPosZ() * var16, var10, var14)
            );
            return this.method2747(var1, var18, var19).<PortalInfo>map(var2 -> {
               BlockState var5x = this.world.getBlockState(this.field_242271_ac);
               Direction var6x;
               Vector3d var7x;
               if (!var5x.method23462(Class8820.field39712)) {
                  var6x = Direction.X;
                  var7x = new Vector3d(0.5, 0.0, 0.0);
               } else {
                  var6x = var5x.<Direction>method23463(Class8820.field39712);
                  TeleportationRepositioner var8x = Class7215.method22658(this.field_242271_ac, var6x, 21, Direction.Y, 21, var2x -> this.world.getBlockState(var2x) == var5x);
                  var7x = this.func_241839_a(var6x, var8x);
               }

               return Class7473.method24207(var1, var2, var6x, var7x, this.getSize(this.getPose()), this.getMotion(), this.rotationYaw, this.rotationPitch);
            }).orElse((PortalInfo)null);
         }
      } else {
         BlockPos var6;
         if (!var5) {
            var6 = var1.method7006(Heightmap.Type.field300, var1.method6947());
         } else {
            var6 = ServerWorld.field9038;
         }

         return new PortalInfo(
            new Vector3d((double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5),
            this.getMotion(),
            this.rotationYaw,
            this.rotationPitch
         );
      }
   }

   public Vector3d func_241839_a(Direction var1, TeleportationRepositioner var2) {
      return Class7473.method24206(var2, var1, this.getPositionVec(), this.getSize(this.getPose()));
   }

   public Optional<TeleportationRepositioner> method2747(ServerWorld var1, BlockPos var2, boolean var3) {
      return var1.method6937().method12331(var2, var3);
   }

   public boolean method3367() {
      return true;
   }

   public float getExplosionResistance(Explosion var1, IBlockReader var2, BlockPos var3, BlockState var4, FluidState var5, float var6) {
      return var6;
   }

   public boolean method3369(Explosion var1, IBlockReader var2, BlockPos var3, BlockState var4, float var5) {
      return true;
   }

   public int getMaxFallHeight() {
      return 3;
   }

   public boolean method3371() {
      return false;
   }

   public void fillCrashReport(CrashReportCategory var1) {
      var1.addDetail("Entity Type", () -> EntityType.method33198(this.getType()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.addDetail("Entity ID", this.entityId);
      var1.addDetail("Entity Name", () -> this.getName().getString());
      var1.addDetail("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.getPosX(), this.getPosY(), this.getPosZ()));
      var1.addDetail(
         "Entity's Block location",
         CrashReportCategory.method32805(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY()), MathHelper.floor(this.getPosZ()))
      );
      Vector3d var4 = this.getMotion();
      var1.addDetail("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", var4.x, var4.y, var4.z));
      var1.addDetail("Entity's Passengers", () -> this.getPassengers().toString());
      var1.addDetail("Entity's Vehicle", () -> this.getRidingEntity().toString());
   }

   public boolean canRenderOnFire() {
      return this.isBurning() && !this.isSpectator();
   }

   public void setUniqueId(UUID var1) {
      this.entityUniqueID = var1;
      this.cachedUniqueIdString = this.entityUniqueID.toString();
   }

   public UUID getUniqueID() {
      return this.entityUniqueID;
   }

   public String method3376() {
      return this.cachedUniqueIdString;
   }

   public String method2956() {
      return this.cachedUniqueIdString;
   }

   public boolean method2952() {
      return true;
   }

   public static double getRenderDistanceWeight() {
      return renderDistanceWeight;
   }

   public static void method3378(double var0) {
      renderDistanceWeight = var0;
   }

   @Override
   public ITextComponent getDisplayName() {
      return ScorePlayerTeam.method28577(this.getTeam(), this.getName())
         .modifyStyle(var1 -> var1.setHoverEvent(this.method3388()).setInsertion(this.method3376()));
   }

   public void method3379(ITextComponent var1) {
      this.dataManager.method35446(CUSTOM_NAME, Optional.<ITextComponent>ofNullable(var1));
   }

   @Nullable
   @Override
   public ITextComponent method3380() {
      return this.dataManager.<Optional<ITextComponent>>method35445(CUSTOM_NAME).orElse((ITextComponent)null);
   }

   @Override
   public boolean method3381() {
      return this.dataManager.<Optional<ITextComponent>>method35445(CUSTOM_NAME).isPresent();
   }

   public void method3382(boolean var1) {
      this.dataManager.method35446(CUSTOM_NAME_VISIBLE, var1);
   }

   public boolean method3383() {
      return this.dataManager.<Boolean>method35445(CUSTOM_NAME_VISIBLE);
   }

   public final void teleportKeepLoaded(double var1, double var3, double var5) {
      if (this.world instanceof ServerWorld) {
         ChunkPos var9 = new ChunkPos(new BlockPos(var1, var3, var5));
         ((ServerWorld)this.world).getChunkProvider().registerTicket(Class8561.field38486, var9, 0, this.getEntityId());
         this.world.getChunk(var9.x, var9.z);
         this.setPositionAndUpdate(var1, var3, var5);
      }
   }

   public void setPositionAndUpdate(double var1, double var3, double var5) {
      if (this.world instanceof ServerWorld) {
         ServerWorld var9 = (ServerWorld)this.world;
         this.setLocationAndAngles(var1, var3, var5, this.rotationYaw, this.rotationPitch);
         this.method3412().forEach(var1x -> {
            var9.method6909(var1x);
            var1x.isPositionDirty = true;

            for (Entity var5x : var1x.passengers) {
               var1x.positionRider(var5x, Entity::moveForced);
            }
         });
      }
   }

   public boolean getAlwaysRenderNameTagForRender() {
      return this.method3383();
   }

   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (POSE.equals(var1)) {
         this.recalculateSize();
      }
   }

   public void recalculateSize() {
      EntitySize var3 = this.size;
      Pose var4 = this.getPose();
      EntitySize var5 = this.getSize(var4);
      this.size = var5;
      this.eyeHeight = this.getEyeHeight(var4, var5);
      if (!(var5.field39968 < var3.field39968)) {
         AxisAlignedBB var6 = this.getBoundingBox();
         this.setBoundingBox(
            new AxisAlignedBB(
               var6.minX,
               var6.minY,
               var6.minZ,
               var6.minX + (double)var5.field39968,
               var6.minY + (double)var5.field39969,
               var6.minZ + (double)var5.field39968
            )
         );
         if (var5.field39968 > var3.field39968 && !this.firstUpdate && !this.world.isRemote) {
            float var9 = var3.field39968 - var5.field39968;
            this.move(MoverType.SELF, new Vector3d((double)var9, 0.0, (double)var9));
         }
      } else {
         double var7 = (double)var5.field39968 / 2.0;
         this.setBoundingBox(
            new AxisAlignedBB(
               this.getPosX() - var7,
               this.getPosY(),
               this.getPosZ() - var7,
               this.getPosX() + var7,
               this.getPosY() + (double)var5.field39969,
               this.getPosZ() + var7
            )
         );
      }
   }

   public net.minecraft.util.Direction method3386() {
      return net.minecraft.util.Direction.method549((double)this.rotationYaw);
   }

   public net.minecraft.util.Direction method3387() {
      return this.method3386();
   }

   public HoverEvent method3388() {
      return new HoverEvent(HoverEvent$Action.SHOW_ENTITY, new HoverEvent$EntityHover(this.getType(), this.getUniqueID(), this.getName()));
   }

   public boolean isSpectatedByPlayer(ServerPlayerEntity var1) {
      return true;
   }

   public AxisAlignedBB getBoundingBox() {
      return this.boundingBox;
   }

   public AxisAlignedBB getRenderBoundingBox() {
      return this.getBoundingBox();
   }

   public AxisAlignedBB getBoundingBox(Pose var1) {
      EntitySize var4 = this.getSize(var1);
      float var5 = var4.field39968 / 2.0F;
      Vector3d var6 = new Vector3d(this.getPosX() - (double)var5, this.getPosY(), this.getPosZ() - (double)var5);
      Vector3d var7 = new Vector3d(this.getPosX() + (double)var5, this.getPosY() + (double)var4.field39969, this.getPosZ() + (double)var5);
      return new AxisAlignedBB(var6, var7);
   }

   public void setBoundingBox(AxisAlignedBB var1) {
      this.boundingBox = var1;
   }

   public float getEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.85F;
   }

   public float getEyeHeight(Pose var1) {
      return this.getEyeHeight(var1, this.getSize(var1));
   }

   public final float getEyeHeight() {
      return this.eyeHeight;
   }

   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)this.getEyeHeight(), (double)(this.getWidth() * 0.4F));
   }

   public boolean method2963(int var1, ItemStack var2) {
      return false;
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
   }

   public World method3395() {
      return this.world;
   }

   @Nullable
   public MinecraftServer method3396() {
      return this.world.getServer();
   }

   public ActionResultType applyPlayerInteraction(PlayerEntity var1, Vector3d var2, Hand var3) {
      return ActionResultType.field14820;
   }

   public boolean method3398() {
      return false;
   }

   public void applyEnchantments(LivingEntity var1, Entity var2) {
      if (var2 instanceof LivingEntity) {
         EnchantmentHelper.applyThornEnchantments((LivingEntity)var2, var1);
      }

      EnchantmentHelper.applyArthropodEnchantments(var1, var2);
   }

   public void method3400(ServerPlayerEntity var1) {
   }

   public void method3401(ServerPlayerEntity var1) {
   }

   public float getRotatedYaw(Rotation var1) {
      float var4 = MathHelper.method37792(this.rotationYaw);
      switch (Class9228.field42477[var1.ordinal()]) {
         case 1:
            return var4 + 180.0F;
         case 2:
            return var4 + 270.0F;
         case 3:
            return var4 + 90.0F;
         default:
            return var4;
      }
   }

   public float getMirroredYaw(Class2089 var1) {
      float var4 = MathHelper.method37792(this.rotationYaw);
      switch (Class9228.field42478[var1.ordinal()]) {
         case 1:
            return -var4;
         case 2:
            return 180.0F - var4;
         default:
            return var4;
      }
   }

   public boolean method3404() {
      return false;
   }

   public boolean method3405() {
      boolean var3 = this.isPositionDirty;
      this.isPositionDirty = false;
      return var3;
   }

   public boolean method3406() {
      boolean var3 = this.isLoaded;
      this.isLoaded = false;
      return var3;
   }

   @Nullable
   public Entity method3407() {
      return null;
   }

   public List<Entity> getPassengers() {
      return (List<Entity>)(!this.passengers.isEmpty() ? Lists.newArrayList(this.passengers) : Collections.<Entity>emptyList());
   }

   public boolean method3409(Entity var1) {
      for (Entity var5 : this.getPassengers()) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3410(Class<? extends Entity> var1) {
      for (Entity var5 : this.getPassengers()) {
         if (var1.isAssignableFrom(var5.getClass())) {
            return true;
         }
      }

      return false;
   }

   public Collection<Entity> method3411() {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : this.getPassengers()) {
         var3.add(var5);
         var5.method3414(false, var3);
      }

      return var3;
   }

   public Stream<Entity> method3412() {
      return Stream.<Entity>concat(Stream.of(this), this.passengers.stream().flatMap(Entity::method3412));
   }

   public boolean method3413() {
      HashSet var3 = Sets.newHashSet();
      this.method3414(true, var3);
      return var3.size() == 1;
   }

   private void method3414(boolean var1, Set<Entity> var2) {
      for (Entity var6 : this.getPassengers()) {
         if (!var1 || ServerPlayerEntity.class.isAssignableFrom(var6.getClass())) {
            var2.add(var6);
         }

         var6.method3414(var1, var2);
      }
   }

   public Entity method3415() {
      Entity var3 = this;

      while (var3.isPassenger()) {
         var3 = var3.getRidingEntity();
      }

      return var3;
   }

   public boolean method3416(Entity var1) {
      return this.method3415() == var1.method3415();
   }

   public boolean method3417(Entity var1) {
      for (Entity var5 : this.getPassengers()) {
         if (var5.equals(var1)) {
            return true;
         }

         if (var5.method3417(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean canPassengerSteer() {
      Entity var3 = this.method3407();
      return !(var3 instanceof PlayerEntity) ? !this.world.isRemote : ((PlayerEntity)var3).method2905();
   }

   public static Vector3d method3419(double var0, double var2, float var4) {
      double var7 = (var0 + var2 + 1.0E-5F) / 2.0;
      float var9 = -MathHelper.sin(var4 * (float) (Math.PI / 180.0));
      float var10 = MathHelper.cos(var4 * (float) (Math.PI / 180.0));
      float var11 = Math.max(Math.abs(var9), Math.abs(var10));
      return new Vector3d((double)var9 * var7 / (double)var11, 0.0, (double)var10 * var7 / (double)var11);
   }

   public Vector3d method3420(LivingEntity var1) {
      return new Vector3d(this.getPosX(), this.getBoundingBox().maxY, this.getPosZ());
   }

   @Nullable
   public Entity getRidingEntity() {
      return this.ridingEntity;
   }

   public PushReaction method3422() {
      return PushReaction.field15862;
   }

   public Class2266 method2864() {
      return Class2266.field14734;
   }

   public int getFireImmuneTicks() {
      return 1;
   }

   public Class6619 getCommandSource() {
      return new Class6619(
         this,
         this.getPositionVec(),
         this.getPitchYaw(),
         !(this.world instanceof ServerWorld) ? null : (ServerWorld)this.world,
         this.method2807(),
         this.getName().getString(),
         this.getDisplayName(),
         this.world.getServer(),
         this
      );
   }

   public int method2807() {
      return 0;
   }

   public boolean method3424(int var1) {
      return this.method2807() >= var1;
   }

   @Override
   public boolean method1405() {
      return this.world.getGameRules().getBoolean(Class5462.field24236);
   }

   @Override
   public boolean method1406() {
      return true;
   }

   @Override
   public boolean method3425() {
      return true;
   }

   public void lookAt(Class2062 var1, Vector3d var2) {
      Vector3d var5 = var1.method8711(this);
      double var6 = var2.x - var5.x;
      double var8 = var2.y - var5.y;
      double var10 = var2.z - var5.z;
      double var12 = (double) MathHelper.sqrt(var6 * var6 + var10 * var10);
      this.rotationPitch = MathHelper.method37792((float)(-(MathHelper.method37814(var8, var12) * 180.0F / (float)Math.PI)));
      this.rotationYaw = MathHelper.method37792((float)(MathHelper.method37814(var10, var6) * 180.0F / (float)Math.PI) - 90.0F);
      this.setRotationYawHead(this.rotationYaw);
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
   }

   public boolean handleFluidAcceleration(ITag<Fluid> var1, double var2) {
      AxisAlignedBB var6 = this.getBoundingBox().shrink(0.001);
      int var7 = MathHelper.floor(var6.minX);
      int var8 = MathHelper.method37774(var6.maxX);
      int var9 = MathHelper.floor(var6.minY);
      int var10 = MathHelper.method37774(var6.maxY);
      int var11 = MathHelper.floor(var6.minZ);
      int var12 = MathHelper.method37774(var6.maxZ);
      if (!this.world.method7019(var7, var9, var11, var8, var10, var12)) {
         return false;
      } else {
         double var13 = 0.0;
         boolean var15 = this.method2952();
         boolean var16 = false;
         Vector3d var17 = Vector3d.ZERO;
         int var18 = 0;
         BlockPos.Mutable var19 = new BlockPos.Mutable();

         for (int var20 = var7; var20 < var8; var20++) {
            for (int var21 = var9; var21 < var10; var21++) {
               for (int var22 = var11; var22 < var12; var22++) {
                  var19.method8372(var20, var21, var22);
                  FluidState var23 = this.world.getFluidState(var19);
                  if (var23.method23486(var1)) {
                     double var24 = (double)((float)var21 + var23.method23475(this.world, var19));
                     if (var24 >= var6.minY) {
                        var16 = true;
                        var13 = Math.max(var24 - var6.minY, var13);
                        if (var15) {
                           Vector3d var26 = var23.method23483(this.world, var19);
                           if (var13 < 0.4) {
                              var26 = var26.scale(var13);
                           }

                           var17 = var17.add(var26);
                           var18++;
                        }
                     }
                  }
               }
            }
         }

         if (var17.length() > 0.0) {
            if (var18 > 0) {
               var17 = var17.scale(1.0 / (double)var18);
            }

            if (!(this instanceof PlayerEntity)) {
               var17 = var17.method11333();
            }

            Vector3d var30 = this.getMotion();
            var17 = var17.scale(var2 * 1.0);
            double var27 = 0.003;
            if (Math.abs(var30.x) < 0.003 && Math.abs(var30.z) < 0.003 && var17.length() < 0.0045000000000000005) {
               var17 = var17.method11333().scale(0.0045000000000000005);
            }

            this.setMotion(this.getMotion().add(var17));
         }

         this.eyesFluidLevel.put(var1, var13);
         return var16;
      }
   }

   public double method3427(ITag<Fluid> var1) {
      return this.eyesFluidLevel.getDouble(var1);
   }

   public double func_233579_cu_() {
      return !((double)this.getEyeHeight() < 0.4) ? 0.4 : 0.0;
   }

   public final float getWidth() {
      return this.size.field39968;
   }

   public final float getHeight() {
      return this.size.field39969;
   }

   public abstract IPacket<?> createSpawnPacket();

   public EntitySize getSize(Pose var1) {
      return this.type.getSize();
   }

   public Vector3d getPositionVec() {
      return this.positionVec;
   }

   public BlockPos getPosition() {
      return this.position;
   }

   public Vector3d getMotion() {
      return this.motion;
   }

   public void setMotion(Vector3d var1) {
      this.motion = var1;
   }

   public void setMotion(double var1, double var3, double var5) {
      this.setMotion(new Vector3d(var1, var3, var5));
   }

   public final double getPosX() {
      return this.positionVec.x;
   }

   public double getPosXWidth(double var1) {
      return this.positionVec.x + (double)this.getWidth() * var1;
   }

   public double getPosXRandom(double var1) {
      return this.getPosXWidth((2.0 * this.rand.nextDouble() - 1.0) * var1);
   }

   public final double getPosY() {
      return this.positionVec.y;
   }

   public double getPosYHeight(double var1) {
      return this.positionVec.y + (double)this.getHeight() * var1;
   }

   public double getPosYRandom() {
      return this.getPosYHeight(this.rand.nextDouble());
   }

   public double getPosYEye() {
      return this.positionVec.y + (double)this.eyeHeight;
   }

   public final double getPosZ() {
      return this.positionVec.z;
   }

   public double getPosZWidth(double var1) {
      return this.positionVec.z + (double)this.getWidth() * var1;
   }

   public double getPosZRandom(double var1) {
      return this.getPosZWidth((2.0 * this.rand.nextDouble() - 1.0) * var1);
   }

   public void setRawPosition(double var1, double var3, double var5) {
      if (this.positionVec.x != var1 || this.positionVec.y != var3 || this.positionVec.z != var5) {
         this.positionVec = new Vector3d(var1, var3, var5);
         int var9 = MathHelper.floor(var1);
         int var10 = MathHelper.floor(var3);
         int var11 = MathHelper.floor(var5);
         if (var9 != this.position.getX() || var10 != this.position.getY() || var11 != this.position.getZ()) {
            this.position = new BlockPos(var9, var10, var11);
         }

         this.isLoaded = true;
      }
   }

   public void method3447() {
   }

   public Vector3d getLeashPosition(float var1) {
      return this.method3288(var1).add(0.0, (double)this.eyeHeight * 0.7, 0.0);
   }
}
