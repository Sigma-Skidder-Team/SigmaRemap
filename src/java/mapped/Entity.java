package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4432;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.util.text.event.HoverEvent$EntityHover;
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
   public static final DataParameter<Byte> FLAGS = EntityDataManager.<Byte>method35441(Entity.class, Class7784.field33390);
   private static final DataParameter<Integer> AIR = EntityDataManager.<Integer>method35441(Entity.class, Class7784.field33391);
   private static final DataParameter<Optional<ITextComponent>> CUSTOM_NAME = EntityDataManager.<Optional<ITextComponent>>method35441(Entity.class, Class7784.field33395);
   public static final DataParameter<Boolean> CUSTOM_NAME_VISIBLE = EntityDataManager.<Boolean>method35441(Entity.class, Class7784.field33398);
   private static final DataParameter<Boolean> SILENT = EntityDataManager.<Boolean>method35441(Entity.class, Class7784.field33398);
   private static final DataParameter<Boolean> NO_GRAVITY = EntityDataManager.<Boolean>method35441(Entity.class, Class7784.field33398);
   public static final DataParameter<Pose> POSE = EntityDataManager.<Pose>method35441(Entity.class, Class7784.field33408);
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
      this.eyeHeight = this.method3181(Pose.STANDING, this.size);
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

   public Vector3d func_242274_V() {
      return this.field_242272_av;
   }

   public EntityType<?> getType() {
      return this.type;
   }

   public int method3205() {
      return this.entityId;
   }

   public void method3206(int var1) {
      this.entityId = var1;
   }

   public Set<String> method3207() {
      return this.tags;
   }

   public boolean method3208(String var1) {
      return this.tags.size() < 1024 ? this.tags.add(var1) : false;
   }

   public boolean method3209(String var1) {
      return this.tags.remove(var1);
   }

   public void method2995() {
      this.method2904();
   }

   public abstract void registerData();

   public EntityDataManager method3210() {
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

   public void method2869() {
      if (this.world != null) {
         for (double var3 = this.getPosY(); var3 > 0.0 && var3 < 256.0; var3++) {
            this.setPosition(this.getPosX(), var3, this.getPosZ());
            if (this.world.method7052(this)) {
               break;
            }
         }

         this.method3434(Vector3d.ZERO);
         this.rotationPitch = 0.0F;
      }
   }

   public void method2904() {
      this.removed = true;
   }

   public void method3211(Pose var1) {
      this.dataManager.method35446(POSE, var1);
   }

   public Pose method3212() {
      return this.dataManager.<Pose>method35445(POSE);
   }

   public boolean method3213(Entity var1, double var2) {
      double var6 = var1.positionVec.field18048 - this.positionVec.field18048;
      double var8 = var1.positionVec.field18049 - this.positionVec.field18049;
      double var10 = var1.positionVec.field18050 - this.positionVec.field18050;
      return var6 * var6 + var8 * var8 + var10 * var10 < var2 * var2;
   }

   public void method3214(float var1, float var2) {
      this.rotationYaw = var1 % 360.0F;
      this.rotationPitch = var2 % 360.0F;
   }

   public void setPosition(double var1, double var3, double var5) {
      this.method3446(var1, var3, var5);
      this.method3391(this.size.method32098(var1, var3, var5));
   }

   public void method3216() {
      this.setPosition(this.positionVec.field18048, this.positionVec.field18049, this.positionVec.field18050);
   }

   public void method3217(double var1, double var3) {
      double var7 = var3 * 0.15;
      double var9 = var1 * 0.15;
      this.rotationPitch = (float)((double)this.rotationPitch + var7);
      this.rotationYaw = (float)((double)this.rotationYaw + var9);
      this.rotationPitch = MathHelper.method37777(this.rotationPitch, -90.0F, 90.0F);
      this.prevRotationPitch = (float)((double)this.prevRotationPitch + var7);
      this.prevRotationYaw = (float)((double)this.prevRotationYaw + var9);
      this.prevRotationPitch = MathHelper.method37777(this.prevRotationPitch, -90.0F, 90.0F);
      if (this.ridingEntity != null) {
         this.ridingEntity.method3309(this);
      }
   }

   public void tick() {
      if (!this.world.field9020) {
         this.method3349(6, this.isGlowing());
      }

      this.method3000();
   }

   public void method3000() {
      this.world.method6820().startSection("entityBaseTick");
      if (this.isPassenger() && this.getRidingEntity().removed) {
         this.stopRiding();
      }

      if (this.rideCooldown > 0) {
         this.rideCooldown--;
      }

      this.prevDistanceWalkedModified = this.distanceWalkedModified;
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
      this.method3324();
      if (this.method3261()) {
         this.method3262();
      }

      this.method3257();
      this.method3259();
      this.method2916();
      if (!this.world.field9020) {
         if (this.fire > 0) {
            if (!this.method3249()) {
               if (this.fire % 20 == 0 && !this.method3264()) {
                  this.method2741(Class8654.field38994, 1.0F);
               }

               this.method2966(this.fire - 1);
            } else {
               this.method2966(this.fire - 4);
               if (this.fire < 0) {
                  this.method3223();
               }
            }
         }
      } else {
         this.method3223();
      }

      if (this.method3264()) {
         this.method3220();
         this.fallDistance *= 0.5F;
      }

      if (this.getPosY() < -64.0) {
         this.method3083();
      }

      if (!this.world.field9020) {
         this.method3349(0, this.fire > 0);
      }

      this.firstUpdate = false;
      this.world.method6820().endSection();
   }

   public void method3218() {
      this.field_242273_aw = this.method2862();
   }

   public boolean method3219() {
      return this.field_242273_aw > 0;
   }

   public void method2816() {
      if (this.method3219()) {
         this.field_242273_aw--;
      }
   }

   public int method2858() {
      return 0;
   }

   public void method3220() {
      if (!this.method3249()) {
         this.method3221(15);
         this.method2741(Class8654.field38995, 4.0F);
      }
   }

   public void method3221(int var1) {
      int var4 = var1 * 20;
      if (this instanceof Class880) {
         var4 = Class6096.method18834((Class880)this, var4);
      }

      if (this.fire < var4) {
         this.method2966(var4);
      }
   }

   public void method2966(int var1) {
      this.fire = var1;
   }

   public int method3222() {
      return this.fire;
   }

   public void method3223() {
      this.method2966(0);
   }

   public void method3083() {
      this.method2904();
   }

   public boolean method3224(double var1, double var3, double var5) {
      return this.method3225(this.getBoundingBox().method19667(var1, var3, var5));
   }

   private boolean method3225(AxisAlignedBB var1) {
      return this.world.method7053(this, var1) && !this.world.method7014(var1);
   }

   public void method3061(boolean var1) {
      this.onGround = var1;
   }

   public boolean method3226() {
      return this.onGround;
   }

   public void move(Class2107 var1, Vector3d var2) {
      if (Minecraft.getInstance().player != null
         && Minecraft.getInstance().player.getRidingEntity() != null
         && Minecraft.getInstance().player.getRidingEntity().method3205() == this.method3205()) {
         Class4432 var5 = new Class4432(var2.field18048, var2.field18049, var2.field18050);
         Client.getInstance().getEventManager().call(var5);
         if (var5.isCancelled()) {
            return;
         }

         var2 = new Vector3d(var5.method13981(), var5.method13983(), var5.method13985());
      }

      if (this.noClip) {
         this.method3391(this.getBoundingBox().method19669(var2));
         this.method3239();
      } else {
         if (var1 == Class2107.field13744) {
            var2 = this.method3231(var2);
            if (var2.equals(Vector3d.ZERO)) {
               return;
            }
         }

         this.world.method6820().startSection("move");
         if (this.motionMultiplier.method11349() > 1.0E-7) {
            var2 = var2.method11346(this.motionMultiplier);
            this.motionMultiplier = Vector3d.ZERO;
            this.method3434(Vector3d.ZERO);
         }

         var2 = this.method2898(var2, var1);
         Vector3d var25 = this.method3233(var2);
         if (var25.method11349() > 1.0E-7) {
            this.method3391(this.getBoundingBox().method19669(var25));
            this.method3239();
         }

         this.world.method6820().endSection();
         this.world.method6820().startSection("rest");
         this.collidedHorizontally = !MathHelper.method37787(var2.field18048, var25.field18048) || !MathHelper.method37787(var2.field18050, var25.field18050);
         this.collidedVertically = var2.field18049 != var25.field18049;
         this.onGround = this.collidedVertically && var2.field18049 < 0.0;
         BlockPos var6 = this.method3228();
         BlockState var7 = this.world.getBlockState(var6);
         this.method2761(var25.field18049, this.onGround, var7, var6);
         Vector3d var8 = this.method3433();
         if (var2.field18048 != var25.field18048) {
            this.method3435(0.0, var8.field18049, var8.field18050);
         }

         if (var2.field18050 != var25.field18050) {
            this.method3435(var8.field18048, var8.field18049, 0.0);
         }

         Block var9 = var7.getBlock();
         if (var2.field18049 != var25.field18049) {
            var9.method11568(this.world, this);
         }

         if (this.onGround && !this.method3332()) {
            var9.method11561(this.world, var6, this);
         }

         if (this.method2940() && !this.isPassenger()) {
            double var10 = var25.field18048;
            double var12 = var25.field18049;
            double var14 = var25.field18050;
            if (!var9.method11540(Class7645.field32804)) {
               var12 = 0.0;
            }

            this.distanceWalkedModified = (float)((double)this.distanceWalkedModified + (double) MathHelper.method37766(method3234(var25)) * 0.6);
            this.distanceWalkedOnStepModified = (float)((double)this.distanceWalkedOnStepModified + (double) MathHelper.method37766(var10 * var10 + var12 * var12 + var14 * var14) * 0.6);
            if (this.distanceWalkedOnStepModified > this.nextStepDistance && !var7.isAir()) {
               this.nextStepDistance = this.method3238();
               if (!this.method3250()) {
                  this.method3241(var6, var7);
               } else {
                  Entity var16 = this.isBeingRidden() && this.method3407() != null ? this.method3407() : this;
                  float var17 = var16 == this ? 0.35F : 0.4F;
                  Vector3d var18 = var16.method3433();
                  float var19 = MathHelper.method37766(
                        var18.field18048 * var18.field18048 * 0.2F + var18.field18049 * var18.field18049 + var18.field18050 * var18.field18050 * 0.2F
                     )
                     * var17;
                  if (var19 > 1.0F) {
                     var19 = 1.0F;
                  }

                  this.method3242(var19);
               }
            } else if (this.distanceWalkedOnStepModified > this.nextFlap && this.method3244() && var7.isAir()) {
               this.nextFlap = this.method3243(this.distanceWalkedOnStepModified);
            }
         }

         try {
            this.method3240();
         } catch (Throwable var23) {
            CrashReport var21 = CrashReport.makeCrashReport(var23, "Checking entity block collision");
            CrashReportCategory var22 = var21.makeCategory("Entity being checked for collision");
            this.method3372(var22);
            throw new ReportedException(var21);
         }

         float var20 = this.method2977();
         this.method3434(this.method3433().method11347((double)var20, 1.0, (double)var20));
         if (this.world
               .method7004(this.getBoundingBox().method19679(0.001))
               .noneMatch(var0 -> var0.method23446(Class7645.field32798) || var0.method23448(Blocks.LAVA))
            && this.fire <= 0) {
            this.method2966(-this.getFireImmuneTicks());
         }

         if (this.method3254() && this.method3327()) {
            this.method2863(Sounds.field26611, 0.7F, 1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
            this.method2966(-this.getFireImmuneTicks());
         }

         this.world.method6820().endSection();
      }
   }

   public BlockPos method3228() {
      int var3 = MathHelper.floor(this.positionVec.field18048);
      int var4 = MathHelper.floor(this.positionVec.field18049 - 0.2F);
      int var5 = MathHelper.floor(this.positionVec.field18050);
      BlockPos var6 = new BlockPos(var3, var4, var5);
      if (this.world.getBlockState(var6).isAir()) {
         BlockPos var7 = var6.method8313();
         BlockState var8 = this.world.getBlockState(var7);
         Block var9 = var8.getBlock();
         if (var9.method11540(Class7645.field32771) || var9.method11540(Class7645.field32764) || var9 instanceof Class3199) {
            return var7;
         }
      }

      return var6;
   }

   public float method3229() {
      float var3 = this.world.getBlockState(this.getPosition()).getBlock().method11573();
      float var4 = this.world.getBlockState(this.method3230()).getBlock().method11573();
      return (double)var3 != 1.0 ? var3 : var4;
   }

   public float method2977() {
      Block var3 = this.world.getBlockState(this.getPosition()).getBlock();
      float var4 = var3.method11572();
      if (var3 != Blocks.WATER && var3 != Blocks.field37013) {
         return (double)var4 != 1.0 ? var4 : this.world.getBlockState(this.method3230()).getBlock().method11572();
      } else {
         return var4;
      }
   }

   public BlockPos method3230() {
      return new BlockPos(this.positionVec.field18048, this.getBoundingBox().field28450 - 0.5000001, this.positionVec.field18050);
   }

   public Vector3d method2898(Vector3d var1, Class2107 var2) {
      return var1;
   }

   public Vector3d method3231(Vector3d var1) {
      if (!(var1.method11349() <= 1.0E-7)) {
         long var4 = this.world.method6783();
         if (var4 != this.pistonDeltasGameTime) {
            Arrays.fill(this.pistonDeltas, 0.0);
            this.pistonDeltasGameTime = var4;
         }

         if (var1.field18048 == 0.0) {
            if (var1.field18049 == 0.0) {
               if (var1.field18050 == 0.0) {
                  return Vector3d.ZERO;
               } else {
                  double var9 = this.method3232(Class113.field415, var1.field18050);
                  return !(Math.abs(var9) <= 1.0E-5F) ? new Vector3d(0.0, 0.0, var9) : Vector3d.ZERO;
               }
            } else {
               double var8 = this.method3232(Class113.field414, var1.field18049);
               return !(Math.abs(var8) <= 1.0E-5F) ? new Vector3d(0.0, var8, 0.0) : Vector3d.ZERO;
            }
         } else {
            double var6 = this.method3232(Class113.field413, var1.field18048);
            return !(Math.abs(var6) <= 1.0E-5F) ? new Vector3d(var6, 0.0, 0.0) : Vector3d.ZERO;
         }
      } else {
         return var1;
      }
   }

   private double method3232(Class113 var1, double var2) {
      int var6 = var1.ordinal();
      double var7 = MathHelper.method37778(var2 + this.pistonDeltas[var6], -0.51, 0.51);
      var2 = var7 - this.pistonDeltas[var6];
      this.pistonDeltas[var6] = var7;
      return var2;
   }

   public Vector3d method3233(Vector3d var1) {
      AxisAlignedBB var4 = this.getBoundingBox();
      ISelectionContext var5 = ISelectionContext.forEntity(this);
      VoxelShape var6 = this.world.method6810().method24527();
      Stream var7 = ! VoxelShapes.compare(var6, VoxelShapes.create(var4.method19679(1.0E-7)), IBooleanFunction.AND)
         ? Stream.<VoxelShape>of(var6)
         : Stream.empty();
      Stream var8 = this.world.method7046(this, var4.method19661(var1), var0 -> true);
      Class8544 var9 = new Class8544(Stream.concat(var8, var7));
      Vector3d var10 = var1.method11349() != 0.0 ? method3235(this, var1, var4, this.world, var5, var9) : var1;
      boolean var11 = var1.field18048 != var10.field18048;
      boolean var12 = var1.field18049 != var10.field18049;
      boolean var13 = var1.field18050 != var10.field18050;
      boolean var14 = this.onGround || var12 && var1.field18049 < 0.0;
      if (this.stepHeight > 0.0F && var14 && (var11 || var13)) {
         Vector3d var15 = method3235(this, new Vector3d(var1.field18048, (double)this.stepHeight, var1.field18050), var4, this.world, var5, var9);
         Vector3d var16 = method3235(
            this, new Vector3d(0.0, (double)this.stepHeight, 0.0), var4.method19662(var1.field18048, 0.0, var1.field18050), this.world, var5, var9
         );
         if (var16.field18049 < (double)this.stepHeight) {
            Vector3d var17 = method3235(this, new Vector3d(var1.field18048, 0.0, var1.field18050), var4.method19669(var16), this.world, var5, var9)
               .method11338(var16);
            if (method3234(var17) > method3234(var15)) {
               var15 = var17;
            }
         }

         double var18 = !(this instanceof ClientPlayerEntity)
            ? 0.0
            : method3235(this, new Vector3d(0.0, -var15.field18049, 0.0), var4.method19669(var15), this.world, var5, var9).field18049 + var15.field18049;
         boolean var20 = false;
         if (var18 != 0.0) {
            Class4434 var21 = new Class4434(var18, var10);
            Client.getInstance().getEventManager().call(var21);
            var20 = var21.isCancelled();
         }

         if (method3234(var15) > method3234(var10) && !var20) {
            return var15.method11338(
               method3235(this, new Vector3d(0.0, -var15.field18049 + var1.field18049, 0.0), var4.method19669(var15), this.world, var5, var9)
            );
         }
      }

      return var10;
   }

   public static double method3234(Vector3d var0) {
      return var0.field18048 * var0.field18048 + var0.field18050 * var0.field18050;
   }

   public static Vector3d method3235(Entity var0, Vector3d var1, AxisAlignedBB var2, World var3, ISelectionContext var4, Class8544<VoxelShape> var5) {
      boolean var8 = var1.field18048 == 0.0;
      boolean var9 = var1.field18049 == 0.0;
      boolean var10 = var1.field18050 == 0.0;
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         boolean var12 = var0 != null && var0 instanceof ClientPlayerEntity;
         return method3237(var1, var2, var3, var4, var5, var12);
      } else {
         Class8544 var11 = new Class8544<VoxelShape>(Stream.<VoxelShape>concat(var5.method30440(), var3.method7055(var0, var2.method19661(var1))));
         return method3236(var1, var2, var11);
      }
   }

   public static Vector3d method3236(Vector3d var0, AxisAlignedBB var1, Class8544<VoxelShape> var2) {
      double var5 = var0.field18048;
      double var7 = var0.field18049;
      double var9 = var0.field18050;
      if (var7 != 0.0) {
         var7 = VoxelShapes.method27437(Class113.field414, var1, var2.method30440(), var7);
         if (var7 != 0.0) {
            var1 = var1.method19667(0.0, var7, 0.0);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9);
      if (var11 && var9 != 0.0) {
         var9 = VoxelShapes.method27437(Class113.field415, var1, var2.method30440(), var9);
         if (var9 != 0.0) {
            var1 = var1.method19667(0.0, 0.0, var9);
         }
      }

      if (var5 != 0.0) {
         var5 = VoxelShapes.method27437(Class113.field413, var1, var2.method30440(), var5);
         if (!var11 && var5 != 0.0) {
            var1 = var1.method19667(var5, 0.0, 0.0);
         }
      }

      if (!var11 && var9 != 0.0) {
         var9 = VoxelShapes.method27437(Class113.field415, var1, var2.method30440(), var9);
      }

      return new Vector3d(var5, var7, var9);
   }

   public static Vector3d method3237(Vector3d var0, AxisAlignedBB var1, Class1662 var2, ISelectionContext var3, Class8544<VoxelShape> var4, boolean var5) {
      double var8 = var0.field18048;
      double var10 = var0.field18049;
      double var12 = var0.field18050;
      if (var10 != 0.0) {
         var10 = VoxelShapes.method27438(Class113.field414, var1, var2, var10, var3, var4.method30440(), var5);
         if (var10 != 0.0) {
            var1 = var1.method19667(0.0, var10, 0.0);
         }
      }

      boolean var14 = Math.abs(var8) < Math.abs(var12);
      if (var14 && var12 != 0.0) {
         var12 = VoxelShapes.method27438(Class113.field415, var1, var2, var12, var3, var4.method30440(), var5);
         if (var12 != 0.0) {
            var1 = var1.method19667(0.0, 0.0, var12);
         }
      }

      if (var8 != 0.0) {
         var8 = VoxelShapes.method27438(Class113.field413, var1, var2, var8, var3, var4.method30440(), var5);
         if (!var14 && var8 != 0.0) {
            var1 = var1.method19667(var8, 0.0, 0.0);
         }
      }

      if (!var14 && var12 != 0.0) {
         var12 = VoxelShapes.method27438(Class113.field415, var1, var2, var12, var3, var4.method30440(), var5);
      }

      return new Vector3d(var8, var10, var12);
   }

   public float method3238() {
      return (float)((int)this.distanceWalkedOnStepModified + 1);
   }

   public void method3239() {
      AxisAlignedBB var3 = this.getBoundingBox();
      this.method3446((var3.field28449 + var3.field28452) / 2.0, var3.field28450, (var3.field28451 + var3.field28454) / 2.0);
   }

   public Class9455 method2859() {
      return Sounds.field26615;
   }

   public Class9455 method2860() {
      return Sounds.field26614;
   }

   public Class9455 method2861() {
      return Sounds.field26614;
   }

   public void method3240() {
      AxisAlignedBB var3 = this.getBoundingBox();
      BlockPos var4 = new BlockPos(var3.field28449 + 0.001, var3.field28450 + 0.001, var3.field28451 + 0.001);
      BlockPos var5 = new BlockPos(var3.field28452 - 0.001, var3.field28453 - 0.001, var3.field28454 - 0.001);
      Mutable var6 = new Mutable();
      if (this.world.method7018(var4, var5)) {
         for (int var7 = var4.getX(); var7 <= var5.getX(); var7++) {
            for (int var8 = var4.getY(); var8 <= var5.getY(); var8++) {
               for (int var9 = var4.getZ(); var9 <= var5.getZ(); var9++) {
                  var6.method8372(var7, var8, var9);
                  BlockState var10 = this.world.getBlockState(var6);

                  try {
                     var10.method23432(this.world, var6, this);
                     this.method2732(var10);
                  } catch (Throwable var14) {
                     CrashReport var12 = CrashReport.makeCrashReport(var14, "Colliding entity with block");
                     CrashReportCategory var13 = var12.makeCategory("Block being collided with");
                     CrashReportCategory.method32814(var13, var6, var10);
                     throw new ReportedException(var12);
                  }
               }
            }
         }
      }
   }

   public void method2732(BlockState var1) {
   }

   public void method3241(BlockPos var1, BlockState var2) {
      if (!var2.method23384().method31085()) {
         BlockState var5 = this.world.getBlockState(var1.method8311());
         Class8447 var6 = !var5.method23448(Blocks.SNOW) ? var2.method23452() : var5.method23452();
         this.method2863(var6.method29713(), var6.method29710() * 0.15F, var6.method29711());
      }
   }

   public void method3242(float var1) {
      this.method2863(this.method2859(), var1, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
   }

   public float method3243(float var1) {
      return 0.0F;
   }

   public boolean method3244() {
      return false;
   }

   public void method2863(Class9455 var1, float var2, float var3) {
      if (!this.method3245()) {
         this.world.method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.method2864(), var2, var3);
      }
   }

   public boolean method3245() {
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

   public boolean method2940() {
      return true;
   }

   public void method2761(double var1, boolean var3, BlockState var4, BlockPos var5) {
      if (!var3) {
         if (var1 < 0.0) {
            this.fallDistance = (float)((double)this.fallDistance - var1);
         }
      } else {
         if (this.fallDistance > 0.0F) {
            var4.getBlock().method11567(this.world, var5, this, this.fallDistance);
         }

         this.fallDistance = 0.0F;
      }
   }

   public boolean method3249() {
      return this.getType().method33207();
   }

   public boolean method2921(float var1, float var2) {
      if (this.isBeingRidden()) {
         for (Entity var6 : this.method3408()) {
            var6.method2921(var1, var2);
         }
      }

      return false;
   }

   public boolean method3250() {
      return this.inWater;
   }

   private boolean method3251() {
      BlockPos var3 = this.getPosition();
      return this.world.method6796(var3)
         || this.world.method6796(new BlockPos((double)var3.getX(), this.getBoundingBox().field28453, (double)var3.getZ()));
   }

   private boolean method3252() {
      return this.world.getBlockState(this.getPosition()).method23448(Blocks.field37013);
   }

   public boolean method3253() {
      return this.method3250() || this.method3251();
   }

   public boolean method3254() {
      return this.method3250() || this.method3251() || this.method3252();
   }

   public boolean method3255() {
      return this.method3250() || this.method3252();
   }

   public boolean canSwim() {
      return this.eyesInWater && this.method3250();
   }

   public void method2916() {
      if (!this.method2951()) {
         this.method3339(this.method3337() && this.canSwim() && !this.isPassenger());
      } else {
         this.method3339(this.method3337() && this.method3250() && !this.isPassenger());
      }
   }

   public boolean method3257() {
      this.eyesFluidLevel.clear();
      this.method3258();
      double var3 = !this.world.method6812().method36877() ? 0.0023333333333333335 : 0.007;
      boolean var5 = this.method3426(Class8953.field40470, var3);
      return this.method3250() || var5;
   }

   public void method3258() {
      if (!(this.getRidingEntity() instanceof BoatEntity)) {
         if (!this.method3426(Class8953.field40469, 0.014)) {
            this.inWater = false;
         } else {
            if (!this.inWater && !this.firstUpdate) {
               this.method2925();
            }

            this.fallDistance = 0.0F;
            this.inWater = true;
            this.method3223();
         }
      } else {
         this.inWater = false;
      }
   }

   private void method3259() {
      this.eyesInWater = this.method3263(Class8953.field40469);
      this.field_241335_O_ = null;
      double var3 = this.method3442() - 0.11111111F;
      Entity var5 = this.getRidingEntity();
      if (var5 instanceof BoatEntity) {
         BoatEntity var6 = (BoatEntity)var5;
         if (!var6.canSwim() && var6.getBoundingBox().field28453 >= var3 && var6.getBoundingBox().field28450 <= var3) {
            return;
         }
      }

      BlockPos var12 = new BlockPos(this.getPosX(), var3, this.getPosZ());
      Class7379 var7 = this.world.method6739(var12);

      for (ITag var9 : Class8953.method32717()) {
         if (var7.method23486(var9)) {
            double var10 = (double)((float)var12.getY() + var7.method23475(this.world, var12));
            if (var10 > var3) {
               this.field_241335_O_ = var9;
            }

            return;
         }
      }
   }

   public void method2925() {
      Entity var3 = this.isBeingRidden() && this.method3407() != null ? this.method3407() : this;
      float var4 = var3 != this ? 0.9F : 0.2F;
      Vector3d var5 = var3.method3433();
      float var6 = MathHelper.method37766(
            var5.field18048 * var5.field18048 * 0.2F + var5.field18049 * var5.field18049 + var5.field18050 * var5.field18050 * 0.2F
         )
         * var4;
      if (var6 > 1.0F) {
         var6 = 1.0F;
      }

      if (!((double)var6 < 0.25)) {
         this.method2863(this.method2861(), var6, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
      } else {
         this.method2863(this.method2860(), var6, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
      }

      float var7 = (float) MathHelper.floor(this.getPosY());

      for (int var8 = 0; (float)var8 < 1.0F + this.size.field39968 * 20.0F; var8++) {
         double var9 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         double var11 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         this.world
            .method6746(
               Class7940.field34052,
               this.getPosX() + var9,
               (double)(var7 + 1.0F),
               this.getPosZ() + var11,
               var5.field18048,
               var5.field18049 - this.rand.nextDouble() * 0.2F,
               var5.field18050
            );
      }

      for (int var13 = 0; (float)var13 < 1.0F + this.size.field39968 * 20.0F; var13++) {
         double var14 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         double var15 = (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.size.field39968;
         this.world
            .method6746(
               Class7940.field34099,
               this.getPosX() + var14,
               (double)(var7 + 1.0F),
               this.getPosZ() + var15,
               var5.field18048,
               var5.field18049,
               var5.field18050
            );
      }
   }

   public BlockState method3260() {
      return this.world.getBlockState(this.method3228());
   }

   public boolean method3261() {
      return this.method3337() && !this.method3250() && !this.isSpectator() && !this.method3336() && !this.method3264() && this.method3066();
   }

   public void method3262() {
      int var3 = MathHelper.floor(this.getPosX());
      int var4 = MathHelper.floor(this.getPosY() - 0.2F);
      int var5 = MathHelper.floor(this.getPosZ());
      BlockPos var6 = new BlockPos(var3, var4, var5);
      BlockState var7 = this.world.getBlockState(var6);
      if (var7.getRenderType() != BlockRenderType.field9885) {
         Vector3d var8 = this.method3433();
         this.world
            .method6746(
               new Class7439(Class7940.field34051, var7),
               this.getPosX() + (this.rand.nextDouble() - 0.5) * (double)this.size.field39968,
               this.getPosY() + 0.1,
               this.getPosZ() + (this.rand.nextDouble() - 0.5) * (double)this.size.field39968,
               var8.field18048 * -4.0,
               1.5,
               var8.field18050 * -4.0
            );
      }
   }

   public boolean method3263(ITag<Fluid> var1) {
      return this.field_241335_O_ == var1;
   }

   public boolean method3264() {
      return !this.firstUpdate && this.eyesFluidLevel.getDouble(Class8953.field40470) > 0.0;
   }

   public void method3265(float var1, Vector3d var2) {
      Vector3d var5 = method3266(var2, var1, this.rotationYaw);
      this.method3434(this.method3433().method11338(var5));
   }

   private static Vector3d method3266(Vector3d var0, float var1, float var2) {
      double var5 = var0.method11349();
      if (!(var5 < 1.0E-7)) {
         Vector3d var7 = (!(var5 > 1.0) ? var0 : var0.method11333()).method11344((double)var1);
         float var8 = MathHelper.sin(var2 * (float) (Math.PI / 180.0));
         float var9 = MathHelper.cos(var2 * (float) (Math.PI / 180.0));
         return new Vector3d(
            var7.field18048 * (double)var9 - var7.field18050 * (double)var8, var7.field18049, var7.field18050 * (double)var9 + var7.field18048 * (double)var8
         );
      } else {
         return Vector3d.ZERO;
      }
   }

   public float method3267() {
      Mutable var3 = new Mutable(this.getPosX(), 0.0, this.getPosZ());
      if (!this.world.method7017(var3)) {
         return 0.0F;
      } else {
         var3.method8308(MathHelper.floor(this.method3442()));
         return this.world.method7009(var3);
      }
   }

   public void method3268(World var1) {
      this.world = var1;
   }

   public void method3269(double var1, double var3, double var5, float var7, float var8) {
      this.method3270(var1, var3, var5);
      this.rotationYaw = var7 % 360.0F;
      this.rotationPitch = MathHelper.method37777(var8, -90.0F, 90.0F) % 360.0F;
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
   }

   public void method3270(double var1, double var3, double var5) {
      double var9 = MathHelper.method37778(var1, -3.0E7, 3.0E7);
      double var11 = MathHelper.method37778(var5, -3.0E7, 3.0E7);
      this.prevPosX = var9;
      this.prevPosY = var3;
      this.prevPosZ = var11;
      this.setPosition(var9, var3, var11);
   }

   public void method3271(Vector3d var1) {
      this.method2794(var1.field18048, var1.field18049, var1.field18050);
   }

   public void method2794(double var1, double var3, double var5) {
      this.method3273(var1, var3, var5, this.rotationYaw, this.rotationPitch);
   }

   public void method3272(BlockPos var1, float var2, float var3) {
      this.method3273((double)var1.getX() + 0.5, (double)var1.getY(), (double)var1.getZ() + 0.5, var2, var3);
   }

   public void method3273(double var1, double var3, double var5, float var7, float var8) {
      this.method3274(var1, var3, var5);
      this.rotationYaw = var7;
      this.rotationPitch = var8;
      this.method3216();
   }

   public void method3274(double var1, double var3, double var5) {
      this.method3446(var1, var3, var5);
      this.prevPosX = var1;
      this.prevPosY = var3;
      this.prevPosZ = var5;
      this.lastTickPosX = var1;
      this.lastTickPosY = var3;
      this.lastTickPosZ = var5;
   }

   public float method3275(Entity var1) {
      float var4 = (float)(this.getPosX() - var1.getPosX());
      float var5 = (float)(this.getPosY() - var1.getPosY());
      float var6 = (float)(this.getPosZ() - var1.getPosZ());
      return MathHelper.method37765(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public double method3276(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public double getDistanceSq(Entity var1) {
      return this.method3278(var1.getPositionVec());
   }

   public double method3278(Vector3d var1) {
      double var4 = this.getPosX() - var1.field18048;
      double var6 = this.getPosY() - var1.field18049;
      double var8 = this.getPosZ() - var1.field18050;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public void method3279(PlayerEntity var1) {
   }

   public void method3101(Entity var1) {
      if (!this.method3416(var1) && !var1.noClip && !this.noClip) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = MathHelper.method37780(var4, var6);
         if (var8 >= 0.01F) {
            var8 = (double) MathHelper.method37766(var8);
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
               this.method3280(-var4, 0.0, -var6);
            }

            if (!var1.isBeingRidden()) {
               var1.method3280(var4, 0.0, var6);
            }
         }
      }
   }

   public void method3280(double var1, double var3, double var5) {
      this.method3434(this.method3433().method11339(var1, var3, var5));
      this.isAirBorne = true;
   }

   public void method3141() {
      this.velocityChanged = true;
   }

   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method3141();
         return false;
      } else {
         return false;
      }
   }

   public final Vector3d method3281(float var1) {
      return this.method3283(this.method3282(var1), this.method3136(var1));
   }

   public float method3282(float var1) {
      return var1 != 1.0F ? MathHelper.method37821(var1, this.prevRotationPitch, this.rotationPitch) : this.rotationPitch;
   }

   public float method3136(float var1) {
      return var1 != 1.0F ? MathHelper.method37821(var1, this.prevRotationYaw, this.rotationYaw) : this.rotationYaw;
   }

   public final Vector3d method3283(float var1, float var2) {
      float var5 = var1 * (float) (Math.PI / 180.0);
      float var6 = -var2 * (float) (Math.PI / 180.0);
      float var7 = MathHelper.cos(var6);
      float var8 = MathHelper.sin(var6);
      float var9 = MathHelper.cos(var5);
      float var10 = MathHelper.sin(var5);
      return new Vector3d((double)(var8 * var9), (double)(-var10), (double)(var7 * var9));
   }

   public final Vector3d method3284(float var1) {
      return this.method3285(this.method3282(var1), this.method3136(var1));
   }

   public final Vector3d method3285(float var1, float var2) {
      return this.method3283(var1 - 90.0F, var2);
   }

   public final Vector3d method3286(float var1) {
      if (var1 != 1.0F) {
         double var4 = MathHelper.method37822((double)var1, this.prevPosX, this.getPosX());
         double var6 = MathHelper.method37822((double)var1, this.prevPosY, this.getPosY()) + (double)this.method3393();
         double var8 = MathHelper.method37822((double)var1, this.prevPosZ, this.getPosZ());
         return new Vector3d(var4, var6, var8);
      } else {
         return new Vector3d(this.getPosX(), this.method3442(), this.getPosZ());
      }
   }

   public Vector3d method3287(float var1) {
      return this.method3286(var1);
   }

   public final Vector3d method3288(float var1) {
      double var4 = MathHelper.method37822((double)var1, this.prevPosX, this.getPosX());
      double var6 = MathHelper.method37822((double)var1, this.prevPosY, this.getPosY());
      double var8 = MathHelper.method37822((double)var1, this.prevPosZ, this.getPosZ());
      return new Vector3d(var4, var6, var8);
   }

   public RayTraceResult method3289(double var1, float var3, boolean var4) {
      Vector3d var7 = this.method3286(var3);
      Vector3d var8 = this.method3281(var3);
      Vector3d var9 = var7.method11339(var8.field18048 * var1, var8.field18049 * var1, var8.field18050 * var1);
      return this.world.method7036(new Class6809(var7, var9, Class2271.field14775, !var4 ? Class1985.field12962 : Class1985.field12964, this));
   }

   public boolean method3139() {
      return false;
   }

   public boolean method3140() {
      return false;
   }

   public void method2739(Entity var1, int var2, Class8654 var3) {
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44467.method15158((ServerPlayerEntity)var1, this, var3);
      }
   }

   public boolean method3290(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      return this.method3291(var15);
   }

   public boolean method3291(double var1) {
      double var5 = this.getBoundingBox().method19675();
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * renderDistanceWeight;
      return var1 < var5 * var5;
   }

   public boolean method3292(CompoundNBT var1) {
      String var4 = this.method3297();
      if (!this.removed && var4 != null) {
         var1.method109("id", var4);
         this.method3294(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean method3293(CompoundNBT var1) {
      return !this.isPassenger() ? this.method3292(var1) : false;
   }

   public CompoundNBT method3294(CompoundNBT var1) {
      try {
         if (this.ridingEntity != null) {
            var1.put("Pos", this.method3298(this.ridingEntity.getPosX(), this.getPosY(), this.ridingEntity.getPosZ()));
         } else {
            var1.put("Pos", this.method3298(this.getPosX(), this.getPosY(), this.getPosZ()));
         }

         Vector3d var4 = this.method3433();
         var1.put("Motion", this.method3298(var4.field18048, var4.field18049, var4.field18050));
         var1.put("Rotation", this.method3299(this.rotationYaw, this.rotationPitch));
         var1.method107("FallDistance", this.fallDistance);
         var1.method101("Fire", (short)this.fire);
         var1.method101("Air", (short)this.method3351());
         var1.method115("OnGround", this.onGround);
         var1.method115("Invulnerable", this.invulnerable);
         var1.method102("PortalCooldown", this.field_242273_aw);
         var1.method104("UUID", this.getUniqueID());
         ITextComponent var11 = this.method3380();
         if (var11 != null) {
            var1.method109("CustomName", ITextComponent$Serializer.toJson(var11));
         }

         if (this.method3383()) {
            var1.method115("CustomNameVisible", this.method3383());
         }

         if (this.method3245()) {
            var1.method115("Silent", this.method3245());
         }

         if (this.method3247()) {
            var1.method115("NoGravity", this.method3247());
         }

         if (this.glowing) {
            var1.method115("Glowing", this.glowing);
         }

         if (!this.tags.isEmpty()) {
            ListNBT var12 = new ListNBT();

            for (String var8 : this.tags) {
               var12.add(StringNBT.valueOf(var8));
            }

            var1.put("Tags", var12);
         }

         this.method2724(var1);
         if (this.isBeingRidden()) {
            ListNBT var13 = new ListNBT();

            for (Entity var15 : this.method3408()) {
               CompoundNBT var9 = new CompoundNBT();
               if (var15.method3292(var9)) {
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
         this.method3372(var6);
         throw new ReportedException(var5);
      }
   }

   public void method3295(CompoundNBT var1) {
      try {
         ListNBT var4 = var1.method131("Pos", 6);
         ListNBT var18 = var1.method131("Motion", 6);
         ListNBT var19 = var1.method131("Rotation", 5);
         double var7 = var18.method158(0);
         double var9 = var18.method158(1);
         double var11 = var18.method158(2);
         this.method3435(Math.abs(var7) > 10.0 ? 0.0 : var7, Math.abs(var9) > 10.0 ? 0.0 : var9, Math.abs(var11) > 10.0 ? 0.0 : var11);
         this.method3274(var4.method158(0), var4.method158(1), var4.method158(2));
         this.rotationYaw = var19.method159(0);
         this.rotationPitch = var19.method159(1);
         this.prevRotationYaw = this.rotationYaw;
         this.prevRotationPitch = this.rotationPitch;
         this.method3143(this.rotationYaw);
         this.method3144(this.rotationYaw);
         this.fallDistance = var1.method124("FallDistance");
         this.fire = var1.method121("Fire");
         this.method3352(var1.method121("Air"));
         this.onGround = var1.method132("OnGround");
         this.invulnerable = var1.method132("Invulnerable");
         this.field_242273_aw = var1.method122("PortalCooldown");
         if (var1.method106("UUID")) {
            this.entityUniqueID = var1.method105("UUID");
            this.cachedUniqueIdString = this.entityUniqueID.toString();
         }

         if (!Double.isFinite(this.getPosX()) || !Double.isFinite(this.getPosY()) || !Double.isFinite(this.getPosZ())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.rotationYaw) && Double.isFinite((double)this.rotationPitch)) {
            this.method3216();
            this.method3214(this.rotationYaw, this.rotationPitch);
            if (var1.method119("CustomName", 8)) {
               String var13 = var1.method126("CustomName");

               try {
                  this.method3379(ITextComponent$Serializer.func_240643_a_(var13));
               } catch (Exception var16) {
                  LOGGER.warn("Failed to parse entity custom name {}", var13, var16);
               }
            }

            this.method3382(var1.method132("CustomNameVisible"));
            this.method3246(var1.method132("Silent"));
            this.method3248(var1.method132("NoGravity"));
            this.method3341(var1.method132("Glowing"));
            if (var1.method119("Tags", 9)) {
               this.tags.clear();
               ListNBT var20 = var1.method131("Tags", 8);
               int var14 = Math.min(var20.size(), 1024);

               for (int var15 = 0; var15 < var14; var15++) {
                  this.tags.add(var20.method160(var15));
               }
            }

            this.method2723(var1);
            if (this.method3296()) {
               this.method3216();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         CrashReport var5 = CrashReport.makeCrashReport(var17, "Loading entity NBT");
         CrashReportCategory var6 = var5.makeCategory("Entity being loaded");
         this.method3372(var6);
         throw new ReportedException(var5);
      }
   }

   public boolean method3296() {
      return true;
   }

   @Nullable
   public final String method3297() {
      EntityType var3 = this.getType();
      ResourceLocation var4 = EntityType.method33198(var3);
      return var3.method33205() && var4 != null ? var4.toString() : null;
   }

   public abstract void method2723(CompoundNBT var1);

   public abstract void method2724(CompoundNBT var1);

   public ListNBT method3298(double... var1) {
      ListNBT var4 = new ListNBT();

      for (double var8 : var1) {
         var4.add(Class34.method93(var8));
      }

      return var4;
   }

   public ListNBT method3299(float... var1) {
      ListNBT var4 = new ListNBT();

      for (float var8 : var1) {
         var4.add(Class32.method90(var8));
      }

      return var4;
   }

   @Nullable
   public ItemEntity method3300(Class3303 var1) {
      return this.method3301(var1, 0);
   }

   @Nullable
   public ItemEntity method3301(Class3303 var1, int var2) {
      return this.method3303(new ItemStack(var1), (float)var2);
   }

   @Nullable
   public ItemEntity method3302(ItemStack var1) {
      return this.method3303(var1, 0.0F);
   }

   @Nullable
   public ItemEntity method3303(ItemStack var1, float var2) {
      if (!var1.isEmpty()) {
         if (!this.world.field9020) {
            ItemEntity var5 = new ItemEntity(this.world, this.getPosX(), this.getPosY() + (double)var2, this.getPosZ(), var1);
            var5.method4131();
            this.world.method6916(var5);
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean method3066() {
      return !this.removed;
   }

   public boolean method3180() {
      if (!this.noClip) {
         float var3 = 0.1F;
         float var4 = this.size.field39968 * 0.8F;
         AxisAlignedBB var5 = AxisAlignedBB.method19686((double)var4, 0.1F, (double)var4).method19667(this.getPosX(), this.method3442(), this.getPosZ());
         return this.world.method7057(this, var5, (var1, var2) -> var1.method23437(this.world, var2)).findAny().isPresent();
      } else {
         return false;
      }
   }

   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      return ActionResultType.field14820;
   }

   public boolean method3305(Entity var1) {
      return var1.method3306() && !this.method3416(var1);
   }

   public boolean method3306() {
      return false;
   }

   public void method2868() {
      this.method3434(Vector3d.ZERO);
      this.tick();
      if (this.isPassenger()) {
         this.getRidingEntity().method3307(this);
      }
   }

   public void method3307(Entity var1) {
      this.method3308(var1, Entity::setPosition);
   }

   private void method3308(Entity var1, Class9347 var2) {
      if (this.method3409(var1)) {
         double var5 = this.getPosY() + this.method3310() + var1.method2894();
         var2.method35390(var1, this.getPosX(), var5, this.getPosZ());
      }
   }

   public void method3309(Entity var1) {
   }

   public double method2894() {
      return 0.0;
   }

   public double method3310() {
      return (double)this.size.field39969 * 0.75;
   }

   public boolean method3311(Entity var1) {
      return this.method2758(var1, false);
   }

   public boolean method3312() {
      return this instanceof Class880;
   }

   public boolean method2758(Entity var1, boolean var2) {
      for (Entity var5 = var1; var5.ridingEntity != null; var5 = var5.ridingEntity) {
         if (var5.ridingEntity == this) {
            return false;
         }
      }

      if (var2 || this.method3313(var1) && var1.method3318(this)) {
         if (this.isPassenger()) {
            this.stopRiding();
         }

         this.method3211(Pose.STANDING);
         this.ridingEntity = var1;
         this.ridingEntity.method3316(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean method3313(Entity var1) {
      return !this.method3331() && this.rideCooldown <= 0;
   }

   public boolean method3314(Pose var1) {
      return this.world.method7053(this, this.method3390(var1).method19679(1.0E-7));
   }

   public void removePassengers() {
      for (int var3 = this.passengers.size() - 1; var3 >= 0; var3--) {
         this.passengers.get(var3).stopRiding();
      }
   }

   public void method2895() {
      if (this.ridingEntity != null) {
         Entity var3 = this.ridingEntity;
         this.ridingEntity = null;
         var3.method3317(this);
      }
   }

   public void stopRiding() {
      this.method2895();
   }

   public void method3316(Entity var1) {
      if (var1.getRidingEntity() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (!this.world.field9020 && var1 instanceof PlayerEntity && !(this.method3407() instanceof PlayerEntity)) {
            this.passengers.add(0, var1);
         } else {
            this.passengers.add(var1);
         }
      }
   }

   public void method3317(Entity var1) {
      if (var1.getRidingEntity() != this) {
         this.passengers.remove(var1);
         var1.rideCooldown = 60;
      } else {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      }
   }

   public boolean method3318(Entity var1) {
      return this.method3408().size() < 1;
   }

   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.setPosition(var1, var3, var5);
      this.method3214(var7, var8);
   }

   public void method3132(float var1, int var2) {
      this.method3143(var1);
   }

   public float method3319() {
      return 0.0F;
   }

   public Vector3d method3320() {
      return this.method3283(this.rotationPitch, this.rotationYaw);
   }

   public Class8513 method3321() {
      return new Class8513(this.rotationPitch, this.rotationYaw);
   }

   public Vector3d method3322() {
      return Vector3d.method11353(this.method3321());
   }

   public void method3323(BlockPos var1) {
      if (!this.method3219()) {
         if (!this.world.field9020 && !var1.equals(this.field_242271_ac)) {
            this.field_242271_ac = var1.method8353();
         }

         this.inPortal = true;
      } else {
         this.method3218();
      }
   }

   public void method3324() {
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
            MinecraftServer var5 = var4.method6715();
            RegistryKey var6 = this.world.getDimensionKey() != World.THE_NETHER ? World.THE_NETHER : World.field8999;
            ServerWorld var7 = var5.method1318(var6);
            if (var7 != null && var5.method1312() && !this.isPassenger() && this.portalCounter++ >= var3) {
               this.world.method6820().startSection("portal");
               this.portalCounter = var3;
               this.method3218();
               this.method2745(var7);
               this.world.method6820().endSection();
            }

            this.inPortal = false;
         }

         this.method2816();
      }
   }

   public int method2862() {
      return 300;
   }

   public void method3325(double var1, double var3, double var5) {
      this.method3435(var1, var3, var5);
   }

   public void method2866(byte var1) {
      switch (var1) {
         case 53:
            Class3379.method11976(this);
      }
   }

   public void method3069() {
   }

   public Iterable<ItemStack> method2946() {
      return EMPTY_EQUIPMENT;
   }

   public Iterable<ItemStack> method2947() {
      return EMPTY_EQUIPMENT;
   }

   public Iterable<ItemStack> method3326() {
      return Iterables.concat(this.method2946(), this.method2947());
   }

   public void method2944(Class2106 var1, ItemStack var2) {
   }

   public boolean method3327() {
      boolean var3 = this.world != null && this.world.field9020;
      return !this.method3249() && (this.fire > 0 || var3 && this.method3348(0));
   }

   public boolean isPassenger() {
      return this.getRidingEntity() != null;
   }

   public boolean isBeingRidden() {
      return !this.method3408().isEmpty();
   }

   public boolean method3007() {
      return true;
   }

   public void setSneaking(boolean var1) {
      this.method3349(1, var1);
   }

   public boolean method3331() {
      return this.method3348(1);
   }

   public boolean method3332() {
      return this.method3331();
   }

   public boolean method3333() {
      return this.method3331();
   }

   public boolean method3334() {
      return this.method3331();
   }

   public boolean method3335() {
      return this.method3331();
   }

   public boolean method3336() {
      return this.method3212() == Pose.field13624;
   }

   public boolean method3337() {
      return this.method3348(3);
   }

   public void setSprinting(boolean var1) {
      this.method3349(3, var1);
   }

   public boolean method2951() {
      return this.method3348(4);
   }

   public boolean method3166() {
      return this.method3212() == Pose.field13622;
   }

   public boolean method3338() {
      return this.method3166() && !this.method3250();
   }

   public void method3339(boolean var1) {
      this.method3349(4, var1);
   }

   public boolean isGlowing() {
      return this.glowing || this.world.field9020 && this.method3348(6);
   }

   public void method3341(boolean var1) {
      this.glowing = var1;
      if (!this.world.field9020) {
         this.method3349(6, this.glowing);
      }
   }

   public boolean method3342() {
      return this.method3348(5);
   }

   public boolean method3343(PlayerEntity var1) {
      if (var1.isSpectator()) {
         return false;
      } else {
         Team var4 = this.getTeam();
         return var4 != null && var1 != null && var1.getTeam() == var4 && var4.method28580() ? false : this.method3342();
      }
   }

   @Nullable
   public Team getTeam() {
      return this.world.method6805().method20998(this.method2956());
   }

   public boolean method3345(Entity var1) {
      return this.method3346(var1.getTeam());
   }

   public boolean method3346(Team var1) {
      return this.getTeam() == null ? false : this.getTeam().method28592(var1);
   }

   public void method3347(boolean var1) {
      this.method3349(5, var1);
   }

   public boolean method3348(int var1) {
      return (this.dataManager.<Byte>method35445(FLAGS) & 1 << var1) != 0;
   }

   public void method3349(int var1, boolean var2) {
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

   public int method3351() {
      return this.dataManager.<Integer>method35445(AIR);
   }

   public void method3352(int var1) {
      this.dataManager.method35446(AIR, var1);
   }

   public void method3353(ServerWorld var1, Class906 var2) {
      this.method2966(this.fire + 1);
      if (this.fire == 0) {
         this.method3221(8);
      }

      this.method2741(Class8654.field38993, 5.0F);
   }

   public void method3354(boolean var1) {
      Vector3d var4 = this.method3433();
      double var5;
      if (!var1) {
         var5 = Math.min(1.8, var4.field18049 + 0.1);
      } else {
         var5 = Math.max(-0.9, var4.field18049 - 0.03);
      }

      this.method3435(var4.field18048, var5, var4.field18050);
   }

   public void method3355(boolean var1) {
      Vector3d var4 = this.method3433();
      double var5;
      if (!var1) {
         var5 = Math.min(0.7, var4.field18049 + 0.06);
      } else {
         var5 = Math.max(-0.3, var4.field18049 - 0.03);
      }

      this.method3435(var4.field18048, var5, var4.field18050);
      this.fallDistance = 0.0F;
   }

   public void method2927(ServerWorld var1, Class880 var2) {
   }

   public void pushOutOfBlocks(double var1, double var3, double var5) {
      BlockPos var9 = new BlockPos(var1, var3, var5);
      Vector3d var10 = new Vector3d(var1 - (double)var9.getX(), var3 - (double)var9.getY(), var5 - (double)var9.getZ());
      Mutable var11 = new Mutable();
      Direction var12 = Direction.field673;
      double var13 = Double.MAX_VALUE;

      for (Direction var18 : new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.field673}) {
         var11.method8377(var9, var18);
         if (!this.world.getBlockState(var11).method23456(this.world, var11)) {
            double var19 = var10.method11356(var18.method544());
            double var21 = var18.method535() != Class1892.field11092 ? var19 : 1.0 - var19;
            if (var21 < var13) {
               var13 = var21;
               var12 = var18;
            }
         }
      }

      float var23 = this.rand.nextFloat() * 0.2F + 0.1F;
      float var24 = (float)var12.method535().method8150();
      Vector3d var25 = this.method3433().method11344(0.75);
      if (var12.method544() != Class113.field413) {
         if (var12.method544() != Class113.field414) {
            if (var12.method544() == Class113.field415) {
               this.method3435(var25.field18048, var25.field18049, (double)(var24 * var23));
            }
         } else {
            this.method3435(var25.field18048, (double)(var24 * var23), var25.field18050);
         }
      } else {
         this.method3435((double)(var24 * var23), var25.field18049, var25.field18050);
      }
   }

   public void method2928(BlockState var1, Vector3d var2) {
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
      return var3 == null ? this.method3358() : method3357(var3);
   }

   public ITextComponent method3358() {
      return this.type.method33211();
   }

   public boolean method3359(Entity var1) {
      return this == var1;
   }

   public float method3142() {
      return 0.0F;
   }

   public void method3143(float var1) {
   }

   public void method3144(float var1) {
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

   public boolean method2760(Class8654 var1) {
      return this.invulnerable && var1 != Class8654.field39004 && !var1.method31146();
   }

   public boolean method3362() {
      return this.invulnerable;
   }

   public void method3363(boolean var1) {
      this.invulnerable = var1;
   }

   public void method3364(Entity var1) {
      this.method3273(var1.getPosX(), var1.getPosY(), var1.getPosZ(), var1.rotationYaw, var1.rotationPitch);
   }

   public void method3365(Entity var1) {
      CompoundNBT var4 = var1.method3294(new CompoundNBT());
      var4.method133("Dimension");
      this.method3295(var4);
      this.field_242273_aw = var1.field_242273_aw;
      this.field_242271_ac = var1.field_242271_ac;
   }

   @Nullable
   public Entity method2745(ServerWorld var1) {
      if (this.world instanceof ServerWorld && !this.removed) {
         this.world.method6820().startSection("changeDimension");
         this.detach();
         this.world.method6820().startSection("reposition");
         Class9761 var4 = this.method2744(var1);
         if (var4 != null) {
            this.world.method6820().endStartSection("reloading");
            Entity var5 = this.getType().method33215(var1);
            if (var5 != null) {
               var5.method3365(this);
               var5.method3273(var4.field45665.field18048, var4.field45665.field18049, var4.field45665.field18050, var4.field45667, var5.rotationPitch);
               var5.method3434(var4.field45666);
               var1.method6918(var5);
               if (var1.getDimensionKey() == World.THE_END) {
                  ServerWorld.method6973(var1);
               }
            }

            this.method3366();
            this.world.method6820().endSection();
            ((ServerWorld)this.world).method6904();
            var1.method6904();
            this.world.method6820().endSection();
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void method3366() {
      this.removed = true;
   }

   @Nullable
   public Class9761 method2744(ServerWorld var1) {
      boolean var4 = this.world.getDimensionKey() == World.THE_END && var1.getDimensionKey() == World.field8999;
      boolean var5 = var1.getDimensionKey() == World.THE_END;
      if (!var4 && !var5) {
         boolean var19 = var1.getDimensionKey() == World.THE_NETHER;
         if (this.world.getDimensionKey() != World.THE_NETHER && !var19) {
            return null;
         } else {
            Class7522 var7 = var1.method6810();
            double var8 = Math.max(-2.9999872E7, var7.method24530() + 16.0);
            double var10 = Math.max(-2.9999872E7, var7.method24531() + 16.0);
            double var12 = Math.min(2.9999872E7, var7.method24532() - 16.0);
            double var14 = Math.min(2.9999872E7, var7.method24533() - 16.0);
            double var16 = Class9535.method36872(this.world.method6812(), var1.method6812());
            BlockPos var18 = new BlockPos(
               MathHelper.method37778(this.getPosX() * var16, var8, var12), this.getPosY(), MathHelper.method37778(this.getPosZ() * var16, var10, var14)
            );
            return this.method2747(var1, var18, var19).<Class9761>map(var2 -> {
               BlockState var5x = this.world.getBlockState(this.field_242271_ac);
               Class113 var6x;
               Vector3d var7x;
               if (!var5x.method23462(Class8820.field39712)) {
                  var6x = Class113.field413;
                  var7x = new Vector3d(0.5, 0.0, 0.0);
               } else {
                  var6x = var5x.<Class113>method23463(Class8820.field39712);
                  Class9502 var8x = Class7215.method22658(this.field_242271_ac, var6x, 21, Class113.field414, 21, var2x -> this.world.getBlockState(var2x) == var5x);
                  var7x = this.method3145(var6x, var8x);
               }

               return Class7473.method24207(var1, var2, var6x, var7x, this.method2981(this.method3212()), this.method3433(), this.rotationYaw, this.rotationPitch);
            }).orElse((Class9761)null);
         }
      } else {
         BlockPos var6;
         if (!var5) {
            var6 = var1.method7006(Class101.field300, var1.method6947());
         } else {
            var6 = ServerWorld.field9038;
         }

         return new Class9761(
            new Vector3d((double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5),
            this.method3433(),
            this.rotationYaw,
            this.rotationPitch
         );
      }
   }

   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return Class7473.method24206(var2, var1, this.getPositionVec(), this.method2981(this.method3212()));
   }

   public Optional<Class9502> method2747(ServerWorld var1, BlockPos var2, boolean var3) {
      return var1.method6937().method12331(var2, var3);
   }

   public boolean method3367() {
      return true;
   }

   public float method3368(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, Class7379 var5, float var6) {
      return var6;
   }

   public boolean method3369(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, float var5) {
      return true;
   }

   public int method3370() {
      return 3;
   }

   public boolean method3371() {
      return false;
   }

   public void method3372(CrashReportCategory var1) {
      var1.addDetail("Entity Type", () -> EntityType.method33198(this.getType()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.addDetail("Entity ID", this.entityId);
      var1.addDetail("Entity Name", () -> this.getName().getString());
      var1.addDetail("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.getPosX(), this.getPosY(), this.getPosZ()));
      var1.addDetail(
         "Entity's Block location",
         CrashReportCategory.method32805(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY()), MathHelper.floor(this.getPosZ()))
      );
      Vector3d var4 = this.method3433();
      var1.addDetail("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", var4.field18048, var4.field18049, var4.field18050));
      var1.addDetail("Entity's Passengers", () -> this.method3408().toString());
      var1.addDetail("Entity's Vehicle", () -> this.getRidingEntity().toString());
   }

   public boolean method3373() {
      return this.method3327() && !this.isSpectator();
   }

   public void method3374(UUID var1) {
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

   public static double method3377() {
      return renderDistanceWeight;
   }

   public static void method3378(double var0) {
      renderDistanceWeight = var0;
   }

   @Override
   public ITextComponent getDisplayName() {
      return Class8218.method28577(this.getTeam(), this.getName())
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

   public final void method3384(double var1, double var3, double var5) {
      if (this.world instanceof ServerWorld) {
         Class7481 var9 = new Class7481(new BlockPos(var1, var3, var5));
         ((ServerWorld)this.world).method6883().method7374(Class8561.field38486, var9, 0, this.method3205());
         this.world.method6824(var9.field32174, var9.field32175);
         this.method2793(var1, var3, var5);
      }
   }

   public void method2793(double var1, double var3, double var5) {
      if (this.world instanceof ServerWorld) {
         ServerWorld var9 = (ServerWorld)this.world;
         this.method3273(var1, var3, var5, this.rotationYaw, this.rotationPitch);
         this.method3412().forEach(var1x -> {
            var9.method6909(var1x);
            var1x.isPositionDirty = true;

            for (Entity var5x : var1x.passengers) {
               var1x.method3308(var5x, Entity::method2794);
            }
         });
      }
   }

   public boolean method2939() {
      return this.method3383();
   }

   public void method3155(DataParameter<?> var1) {
      if (POSE.equals(var1)) {
         this.method3385();
      }
   }

   public void method3385() {
      EntitySize var3 = this.size;
      Pose var4 = this.method3212();
      EntitySize var5 = this.method2981(var4);
      this.size = var5;
      this.eyeHeight = this.method3181(var4, var5);
      if (!(var5.field39968 < var3.field39968)) {
         AxisAlignedBB var6 = this.getBoundingBox();
         this.method3391(
            new AxisAlignedBB(
               var6.field28449,
               var6.field28450,
               var6.field28451,
               var6.field28449 + (double)var5.field39968,
               var6.field28450 + (double)var5.field39969,
               var6.field28451 + (double)var5.field39968
            )
         );
         if (var5.field39968 > var3.field39968 && !this.firstUpdate && !this.world.field9020) {
            float var9 = var3.field39968 - var5.field39968;
            this.move(Class2107.field13742, new Vector3d((double)var9, 0.0, (double)var9));
         }
      } else {
         double var7 = (double)var5.field39968 / 2.0;
         this.method3391(
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

   public Direction method3386() {
      return Direction.method549((double)this.rotationYaw);
   }

   public Direction method3387() {
      return this.method3386();
   }

   public HoverEvent method3388() {
      return new HoverEvent(HoverEvent$Action.SHOW_ENTITY, new HoverEvent$EntityHover(this.getType(), this.getUniqueID(), this.getName()));
   }

   public boolean method2749(ServerPlayerEntity var1) {
      return true;
   }

   public AxisAlignedBB getBoundingBox() {
      return this.boundingBox;
   }

   public AxisAlignedBB method3186() {
      return this.getBoundingBox();
   }

   public AxisAlignedBB method3390(Pose var1) {
      EntitySize var4 = this.method2981(var1);
      float var5 = var4.field39968 / 2.0F;
      Vector3d var6 = new Vector3d(this.getPosX() - (double)var5, this.getPosY(), this.getPosZ() - (double)var5);
      Vector3d var7 = new Vector3d(this.getPosX() + (double)var5, this.getPosY() + (double)var4.field39969, this.getPosZ() + (double)var5);
      return new AxisAlignedBB(var6, var7);
   }

   public void method3391(AxisAlignedBB var1) {
      this.boundingBox = var1;
   }

   public float method3181(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.85F;
   }

   public float method3392(Pose var1) {
      return this.method3181(var1, this.method2981(var1));
   }

   public final float method3393() {
      return this.eyeHeight;
   }

   public Vector3d method3394() {
      return new Vector3d(0.0, (double)this.method3393(), (double)(this.method3429() * 0.4F));
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
      return this.world.method6715();
   }

   public ActionResultType applyPlayerInteraction(PlayerEntity var1, Vector3d var2, Hand var3) {
      return ActionResultType.field14820;
   }

   public boolean method3398() {
      return false;
   }

   public void method3399(Class880 var1, Entity var2) {
      if (var2 instanceof Class880) {
         Class7858.method26320((Class880)var2, var1);
      }

      Class7858.method26321(var1, var2);
   }

   public void method3400(ServerPlayerEntity var1) {
   }

   public void method3401(ServerPlayerEntity var1) {
   }

   public float method3402(Class80 var1) {
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

   public float method3403(Class2089 var1) {
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

   public List<Entity> method3408() {
      return (List<Entity>)(!this.passengers.isEmpty() ? Lists.newArrayList(this.passengers) : Collections.<Entity>emptyList());
   }

   public boolean method3409(Entity var1) {
      for (Entity var5 : this.method3408()) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3410(Class<? extends Entity> var1) {
      for (Entity var5 : this.method3408()) {
         if (var1.isAssignableFrom(var5.getClass())) {
            return true;
         }
      }

      return false;
   }

   public Collection<Entity> method3411() {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : this.method3408()) {
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
      for (Entity var6 : this.method3408()) {
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
      for (Entity var5 : this.method3408()) {
         if (var5.equals(var1)) {
            return true;
         }

         if (var5.method3417(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3418() {
      Entity var3 = this.method3407();
      return !(var3 instanceof PlayerEntity) ? !this.world.field9020 : ((PlayerEntity)var3).method2905();
   }

   public static Vector3d method3419(double var0, double var2, float var4) {
      double var7 = (var0 + var2 + 1.0E-5F) / 2.0;
      float var9 = -MathHelper.sin(var4 * (float) (Math.PI / 180.0));
      float var10 = MathHelper.cos(var4 * (float) (Math.PI / 180.0));
      float var11 = Math.max(Math.abs(var9), Math.abs(var10));
      return new Vector3d((double)var9 * var7 / (double)var11, 0.0, (double)var10 * var7 / (double)var11);
   }

   public Vector3d method3420(Class880 var1) {
      return new Vector3d(this.getPosX(), this.getBoundingBox().field28453, this.getPosZ());
   }

   @Nullable
   public Entity getRidingEntity() {
      return this.ridingEntity;
   }

   public Class2315 method3422() {
      return Class2315.field15862;
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
         this.method3321(),
         !(this.world instanceof ServerWorld) ? null : (ServerWorld)this.world,
         this.method2807(),
         this.getName().getString(),
         this.getDisplayName(),
         this.world.method6715(),
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
      return this.world.method6789().method17135(Class5462.field24236);
   }

   @Override
   public boolean method1406() {
      return true;
   }

   @Override
   public boolean method3425() {
      return true;
   }

   public void method2787(Class2062 var1, Vector3d var2) {
      Vector3d var5 = var1.method8711(this);
      double var6 = var2.field18048 - var5.field18048;
      double var8 = var2.field18049 - var5.field18049;
      double var10 = var2.field18050 - var5.field18050;
      double var12 = (double) MathHelper.method37766(var6 * var6 + var10 * var10);
      this.rotationPitch = MathHelper.method37792((float)(-(MathHelper.method37814(var8, var12) * 180.0F / (float)Math.PI)));
      this.rotationYaw = MathHelper.method37792((float)(MathHelper.method37814(var10, var6) * 180.0F / (float)Math.PI) - 90.0F);
      this.method3143(this.rotationYaw);
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
   }

   public boolean method3426(ITag<Fluid> var1, double var2) {
      AxisAlignedBB var6 = this.getBoundingBox().method19679(0.001);
      int var7 = MathHelper.floor(var6.field28449);
      int var8 = MathHelper.method37774(var6.field28452);
      int var9 = MathHelper.floor(var6.field28450);
      int var10 = MathHelper.method37774(var6.field28453);
      int var11 = MathHelper.floor(var6.field28451);
      int var12 = MathHelper.method37774(var6.field28454);
      if (!this.world.method7019(var7, var9, var11, var8, var10, var12)) {
         return false;
      } else {
         double var13 = 0.0;
         boolean var15 = this.method2952();
         boolean var16 = false;
         Vector3d var17 = Vector3d.ZERO;
         int var18 = 0;
         Mutable var19 = new Mutable();

         for (int var20 = var7; var20 < var8; var20++) {
            for (int var21 = var9; var21 < var10; var21++) {
               for (int var22 = var11; var22 < var12; var22++) {
                  var19.method8372(var20, var21, var22);
                  Class7379 var23 = this.world.method6739(var19);
                  if (var23.method23486(var1)) {
                     double var24 = (double)((float)var21 + var23.method23475(this.world, var19));
                     if (var24 >= var6.field28450) {
                        var16 = true;
                        var13 = Math.max(var24 - var6.field28450, var13);
                        if (var15) {
                           Vector3d var26 = var23.method23483(this.world, var19);
                           if (var13 < 0.4) {
                              var26 = var26.method11344(var13);
                           }

                           var17 = var17.method11338(var26);
                           var18++;
                        }
                     }
                  }
               }
            }
         }

         if (var17.method11348() > 0.0) {
            if (var18 > 0) {
               var17 = var17.method11344(1.0 / (double)var18);
            }

            if (!(this instanceof PlayerEntity)) {
               var17 = var17.method11333();
            }

            Vector3d var30 = this.method3433();
            var17 = var17.method11344(var2 * 1.0);
            double var27 = 0.003;
            if (Math.abs(var30.field18048) < 0.003 && Math.abs(var30.field18050) < 0.003 && var17.method11348() < 0.0045000000000000005) {
               var17 = var17.method11333().method11344(0.0045000000000000005);
            }

            this.method3434(this.method3433().method11338(var17));
         }

         this.eyesFluidLevel.put(var1, var13);
         return var16;
      }
   }

   public double method3427(ITag<Fluid> var1) {
      return this.eyesFluidLevel.getDouble(var1);
   }

   public double method3428() {
      return !((double)this.method3393() < 0.4) ? 0.4 : 0.0;
   }

   public final float method3429() {
      return this.size.field39968;
   }

   public final float method3430() {
      return this.size.field39969;
   }

   public abstract Packet<?> method2835();

   public EntitySize method2981(Pose var1) {
      return this.type.getSize();
   }

   public Vector3d getPositionVec() {
      return this.positionVec;
   }

   public BlockPos getPosition() {
      return this.position;
   }

   public Vector3d method3433() {
      return this.motion;
   }

   public void method3434(Vector3d var1) {
      this.motion = var1;
   }

   public void method3435(double var1, double var3, double var5) {
      this.method3434(new Vector3d(var1, var3, var5));
   }

   public final double getPosX() {
      return this.positionVec.field18048;
   }

   public double method3437(double var1) {
      return this.positionVec.field18048 + (double)this.method3429() * var1;
   }

   public double method3438(double var1) {
      return this.method3437((2.0 * this.rand.nextDouble() - 1.0) * var1);
   }

   public final double getPosY() {
      return this.positionVec.field18049;
   }

   public double method3440(double var1) {
      return this.positionVec.field18049 + (double)this.method3430() * var1;
   }

   public double method3441() {
      return this.method3440(this.rand.nextDouble());
   }

   public double method3442() {
      return this.positionVec.field18049 + (double)this.eyeHeight;
   }

   public final double getPosZ() {
      return this.positionVec.field18050;
   }

   public double method3444(double var1) {
      return this.positionVec.field18050 + (double)this.method3429() * var1;
   }

   public double method3445(double var1) {
      return this.method3444((2.0 * this.rand.nextDouble() - 1.0) * var1);
   }

   public void method3446(double var1, double var3, double var5) {
      if (this.positionVec.field18048 != var1 || this.positionVec.field18049 != var3 || this.positionVec.field18050 != var5) {
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

   public Vector3d method2986(float var1) {
      return this.method3288(var1).method11339(0.0, (double)this.eyeHeight * 0.7, 0.0);
   }
}
