// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity;

import com.mentalfrostbyte.Client;
import mapped.*;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.*;
import net.minecraft.util.Direction;
import net.minecraft.util.INameable;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;

import java.util.HashSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

import com.google.common.collect.Iterables;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableSet;

import java.util.Arrays;

import com.google.common.collect.Sets;
import com.google.common.collect.Lists;

import java.util.Set;
import java.util.UUID;
import java.util.Optional;
import java.util.Random;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.Logger;

public abstract class Entity implements INameable, ICommandSource {
    public static final Logger LOGGER;
    private static final AtomicInteger NEXT_ENTITY_ID;
    private static final List<ItemStack> EMPTY_EQUIPMENT;
    private static final AxisAlignedBB ZERO_AABB;
    private static double renderDistanceWeight;
    private final EntityType<?> type;
    private int entityId;
    public boolean preventEntitySpawning;
    private final List<Entity> passengers;
    public int rideCooldown;
    private Entity ridingEntity;
    public boolean forceSpawn;
    public World world;
    public double prevPosX;
    public double prevPosY;
    public double prevPosZ;
    public double posX;
    public double posY;
    public double posZ;
    private Vec3d motion;
    public float rotationYaw;
    public float rotationPitch;
    public float prevRotationYaw;
    public float prevRotationPitch;
    public AxisAlignedBB boundingBox;
    public boolean onGround;
    public boolean collidedHorizontally;
    public boolean collidedVertically;
    public boolean collided;
    public boolean velocityChanged;
    public Vec3d motionMultiplier;
    public boolean removed;
    public float prevDistanceWalkedModified;
    public float distanceWalkedModified;
    public float distanceWalkedOnStepModified;
    public float fallDistance;
    private float nextStepDistance;
    private float nextFlap;
    public double lastTickPosX;
    public double lastTickPosY;
    public double lastTickPosZ;
    public float stepHeight;
    public boolean noClip;
    public float entityCollisionReduction;
    public final Random rand;
    public int ticksExisted;
    private int fire;
    public boolean inWater;
    public double submergedHeight;
    public boolean eyesInWater;
    public boolean inLava;
    public int hurtResistantTime;
    public boolean firstUpdate;
    public final EntityDataManager dataManager;
    public static final DataParameter<Byte> FLAGS;
    private static final DataParameter<Integer> AIR;
    private static final DataParameter<Optional<ITextComponent>> CUSTOM_NAME;
    public static final DataParameter<Boolean> CUSTOM_NAME_VISIBLE;
    private static final DataParameter<Boolean> SILENT;
    private static final DataParameter<Boolean> NO_GRAVITY;
    public static final DataParameter<Pose> POSE;
    public boolean addedToChunk;
    public int chunkCoordX;
    public int chunkCoordY;
    public int chunkCoordZ;
    public long serverPosX;
    public long serverPosY;
    public long serverPosZ;
    public boolean ignoreFrustumCheck;
    public boolean isAirBorne;
    public int timeUntilPortal;
    public boolean inPortal;
    public int portalCounter;
    public DimensionType dimension;
    public BlockPos lastPortalPos;
    public Vec3d lastPortalVec;
    public Direction teleportDirection;
    private boolean invulnerable;
    public UUID entityUniqueID;
    public String cachedUniqueIdString;
    public boolean glowing;
    private final Set<String> tags;
    private boolean isPositionDirty;
    private final double[] pistonDeltas;
    private long pistonDeltasGameTime;
    private EntitySize size;
    public float eyeHeight;

    public Entity(final EntityType<?> p_i715_1_, final World p_i715_2_) {
        this.entityId = Entity.NEXT_ENTITY_ID.incrementAndGet();
        this.passengers = Lists.newArrayList();
        this.motion = Vec3d.ZERO;
        this.boundingBox = Entity.ZERO_AABB;
        this.motionMultiplier = Vec3d.ZERO;
        this.nextStepDistance = 1.0f;
        this.nextFlap = 1.0f;
        this.rand = new Random();
        this.fire = -this.method1923();
        this.firstUpdate = true;
        this.entityUniqueID = MathHelper.method35690(this.rand);
        this.cachedUniqueIdString = this.entityUniqueID.toString();
        this.tags = Sets.newHashSet();
        this.pistonDeltas = new double[]{0.0, 0.0, 0.0};
        this.type = p_i715_1_;
        this.world = p_i715_2_;
        this.size = p_i715_1_.getSize();
        this.setPosition(0.0, 0.0, 0.0);
        if (p_i715_2_ != null) {
            this.dimension = p_i715_2_.dimension.getType();
        }
        (this.dataManager = new EntityDataManager(this)).register(Entity.FLAGS, (byte) 0);
        this.dataManager.register(Entity.AIR, this.getMaxAir());
        this.dataManager.register(Entity.CUSTOM_NAME_VISIBLE, false);
        this.dataManager.register(Entity.CUSTOM_NAME, Optional.empty());
        this.dataManager.register(Entity.SILENT, false);
        this.dataManager.register(Entity.NO_GRAVITY, false);
        this.dataManager.register(Entity.POSE, Pose.field1663);
        this.method1649();
        this.eyeHeight = this.method1890(Pose.field1663, this.size);
    }

    public int getTeamColor() {
        final Team team = this.getTeam();
        return (team != null && team.getColor().getColor() != null) ? team.getColor().getColor() : 16777215;
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

    public void setPacketCoordinates(final double n, final double n2, final double n3) {
        this.serverPosX = SEntityPacket.func_218743_a(n);
        this.serverPosY = SEntityPacket.func_218743_a(n2);
        this.serverPosZ = SEntityPacket.func_218743_a(n3);
    }

    public EntityType<?> getType() {
        return this.type;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public void method1644(final int field2385) {
        this.entityId = field2385;
    }

    public Set<String> method1645() {
        return this.tags;
    }

    public boolean method1646(final String s) {
        return this.tags.size() < 1024 && this.tags.add(s);
    }

    public boolean method1647(final String s) {
        return this.tags.remove(s);
    }

    public void method1648() {
        this.method1652();
    }

    public abstract void method1649();

    public EntityDataManager method1650() {
        return this.dataManager;
    }

    @Override
    public boolean equals(final Object o) {
        return o instanceof Entity && ((Entity) o).entityId == this.entityId;
    }

    @Override
    public int hashCode() {
        return this.entityId;
    }

    public void method1651() {
        if (this.world != null) {
            for (double method1941 = this.getPosY(); method1941 > 0.0; ++method1941) {
                if (method1941 >= 256.0) {
                    break;
                }
                this.setPosition(this.getPosX(), method1941, this.getPosZ());
                if (this.world.method6977(this)) {
                    break;
                }
            }
            this.method1936(Vec3d.ZERO);
            this.rotationPitch = 0.0f;
        }
    }

    public void method1652() {
        this.removed = true;
    }

    public void method1653(final Pose class290) {
        this.dataManager.set(Entity.POSE, class290);
    }

    public Pose method1654() {
        return this.dataManager.get(Entity.POSE);
    }

    public void method1655(final float n, final float n2) {
        this.rotationYaw = n % 360.0f;
        this.rotationPitch = n2 % 360.0f;
    }

    public void setPosition(final double n, final double n2, final double n3) {
        this.method1948(n, n2, n3);
        final float n4 = this.size.field34097 / 2.0f;
        this.method1889(new AxisAlignedBB(n - n4, n2, n3 - n4, n + n4, n2 + this.size.field34098, n3 + n4));
    }

    public void method1657() {
        this.setPosition(this.posX, this.posY, this.posZ);
    }

    public void method1658(final double n, final double n2) {
        final double n3 = n2 * 0.15;
        final double n4 = n * 0.15;
        this.rotationPitch += (float) n3;
        this.rotationYaw += (float) n4;
        this.rotationPitch = MathHelper.clamp(this.rotationPitch, -90.0f, 90.0f);
        this.prevRotationPitch += (float) n3;
        this.prevRotationYaw += (float) n4;
        this.prevRotationPitch = MathHelper.clamp(this.prevRotationPitch, -90.0f, 90.0f);
        if (this.ridingEntity != null) {
            this.ridingEntity.method1775(this);
        }
    }

    public void method1659() {
        if (!this.world.isRemote) {
            this.setFlag(6, this.method1821());
        }
        this.method1660();
    }

    public void method1660() {
        this.world.method6796().startSection("entityBaseTick");
        if (this.isPassenger()) {
            if (this.method1920().removed) {
                this.stopRiding();
            }
        }
        if (this.rideCooldown > 0) {
            --this.rideCooldown;
        }
        this.prevDistanceWalkedModified = this.distanceWalkedModified;
        this.prevRotationPitch = this.rotationPitch;
        this.prevRotationYaw = this.rotationYaw;
        this.method1795();
        this.method1718();
        this.method1713();
        if (!this.world.isRemote) {
            if (this.fire > 0) {
                if (!this.method1704()) {
                    if (this.fire % 20 == 0) {
                        this.attackEntityFrom(DamageSource.field32564, 1.0f);
                    }
                    --this.fire;
                } else {
                    this.fire -= 4;
                    if (this.fire < 0) {
                        this.method1667();
                    }
                }
            }
        } else {
            this.method1667();
        }
        if (this.method1723()) {
            this.method1663();
            this.fallDistance *= 0.5f;
        }
        if (this.getPosY() < -64.0) {
            this.method1668();
        }
        if (!this.world.isRemote) {
            this.setFlag(0, this.fire > 0);
        }
        this.firstUpdate = false;
        this.world.method6796().endSection();
    }

    public void method1661() {
        if (this.timeUntilPortal > 0) {
            --this.timeUntilPortal;
        }
    }

    public int method1662() {
        return 1;
    }

    public void method1663() {
        if (!this.method1704()) {
            this.setFire(15);
            this.attackEntityFrom(DamageSource.field32565, 4.0f);
        }
    }

    public void setFire(final int n) {
        int method18607 = n * 20;
        if (this instanceof LivingEntity) {
            method18607 = Class6269.method18607((LivingEntity) this, method18607);
        }
        if (this.fire < method18607) {
            this.fire = method18607;
        }
    }

    public void method1665(final int field2425) {
        this.fire = field2425;
    }

    public int method1666() {
        return this.fire;
    }

    public void method1667() {
        this.fire = 0;
    }

    public void method1668() {
        this.method1652();
    }

    public boolean method1669(final double n, final double n2, final double n3) {
        return this.method1670(this.getBoundingBox().offset(n, n2, n3));
    }

    private boolean method1670(final AxisAlignedBB class6221) {
        return this.world.method6978(this, class6221) && !this.world.method6968(class6221);
    }

    public void method1671(final Class2160 class2160, Vec3d class2161) {
        if (Minecraft.getInstance().player != null && Minecraft.getInstance().player.method1920() != null && Minecraft.getInstance().player.method1920().getEntityId() == this.getEntityId()) {
            final Class5718 class2162 = new Class5718(class2161.x, class2161.y, class2161.z);
            Client.getInstance().getEventBus().post(class2162);
            if (class2162.isCancelled()) {
                return;
            }
            class2161 = new Vec3d(class2162.method16980(), class2162.method16982(), class2162.method16984());
        }
        if (this.noClip) {
            this.method1889(this.getBoundingBox().offset(class2161));
            this.method1685();
        } else {
            if (class2160 == Class2160.field12828) {
                class2161 = this.method1677(class2161);
                if (class2161.equals(Vec3d.ZERO)) {
                    return;
                }
            }
            this.world.method6796().startSection("move");
            if (this.motionMultiplier.lengthSquared() > 1.0E-7) {
                class2161 = class2161.mul(this.motionMultiplier);
                this.motionMultiplier = Vec3d.ZERO;
                this.method1936(Vec3d.ZERO);
            }
            class2161 = this.method1676(class2161, class2160);
            final Vec3d method1679 = this.getAllowedMovement(class2161);
            if (method1679.lengthSquared() > 1.0E-7) {
                this.method1889(this.getBoundingBox().offset(method1679));
                this.method1685();
            }
            this.world.method6796().endSection();
            this.world.method6796().startSection("rest");
            this.collidedHorizontally = (!MathHelper.method35663(class2161.x, method1679.x) || !MathHelper.method35663(class2161.z, method1679.z));
            this.collidedVertically = (class2161.y != method1679.y);
            this.onGround = (this.collidedVertically && class2161.y < 0.0);
            this.collided = (this.collidedHorizontally || this.collidedVertically);
            final BlockPos method1680 = this.method1672();
            final BlockState method1681 = this.world.getBlockState(method1680);
            this.method1701(method1679.y, this.onGround, method1681, method1680);
            final Vec3d method1682 = this.getMotion();
            if (class2161.x != method1679.x) {
                this.setMotion(0.0, method1682.y, method1682.z);
            }
            if (class2161.z != method1679.z) {
                this.setMotion(method1682.x, method1682.y, 0.0);
            }
            final Block method1683 = method1681.getBlock();
            if (class2161.y != method1679.y) {
                method1683.method11861(this.world, this);
            }
            if (this.onGround && !this.method1810()) {
                method1683.method11845(this.world, method1680, this);
            }
            if (this.method1700() && !this.isPassenger()) {
                final double field22770 = method1679.x;
                double field22771 = method1679.y;
                final double field22772 = method1679.z;
                if (method1683 != Blocks.field29307 && method1683 != Blocks.SCAFFOLDING) {
                    field22771 = 0.0;
                }
                this.distanceWalkedModified += (float) (MathHelper.sqrt(horizontalMag(method1679)) * 0.6);
                this.distanceWalkedOnStepModified += (float) (MathHelper.sqrt(field22770 * field22770 + field22771 * field22771 + field22772 * field22772) * 0.6);
                if (this.distanceWalkedOnStepModified > this.nextStepDistance && !method1681.method21706()) {
                    this.nextStepDistance = this.method1684();
                    if (this.method1706()) {
                        final Entity class2163 = (this.isBeingRidden() && this.method1907() != null) ? this.method1907() : this;
                        final float n = (class2163 == this) ? 0.35f : 0.4f;
                        final Vec3d method1684 = class2163.getMotion();
                        float n2 = MathHelper.sqrt(method1684.x * method1684.x * 0.20000000298023224 + method1684.y * method1684.y + method1684.z * method1684.z * 0.20000000298023224) * n;
                        if (n2 > 1.0f) {
                            n2 = 1.0f;
                        }
                        this.method1692(n2);
                    } else {
                        this.method1691(method1680, method1681);
                    }
                } else if (this.distanceWalkedOnStepModified > this.nextFlap && this.method1694() && method1681.method21706()) {
                    this.nextFlap = this.method1693(this.distanceWalkedOnStepModified);
                }
            }
            try {
                this.inLava = false;
                this.method1689();
            } catch (final Throwable t) {
                final CrashReport method1685 = CrashReport.makeCrashReport(t, "Checking entity block collision");
                this.method1862(method1685.makeCategory("Entity being checked for collision"));
                throw new ReportedException(method1685);
            }
            this.method1936(this.getMotion().mul(this.method1674(), 1.0, this.method1674()));
            final boolean method1686 = this.method1710();
            if (this.world.method6719(this.getBoundingBox().shrink(0.001))) {
                if (!method1686) {
                    ++this.fire;
                    if (this.fire == 0) {
                        this.setFire(8);
                    }
                }
                this.method1703(1);
            } else if (this.fire <= 0) {
                this.fire = -this.method1923();
            }
            if (method1686 && this.method1804()) {
                this.method1695(Class8520.field35219, 0.7f, 1.6f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
                this.fire = -this.method1923();
            }
            this.world.method6796().endSection();
        }
    }

    public BlockPos method1672() {
        final BlockPos class354 = new BlockPos(MathHelper.floor(this.posX), MathHelper.floor(this.posY - 0.20000000298023224), MathHelper.floor(this.posZ));
        if (this.world.getBlockState(class354).method21706()) {
            final BlockPos method1139 = class354.method1139();
            final Block method1140 = this.world.getBlockState(method1139).getBlock();
            if (!method1140.method11785(Class7188.field27911)) {
                if (!method1140.method11785(Class7188.field27904)) {
                    if (!(method1140 instanceof Class3898)) {
                        return class354;
                    }
                }
            }
            return method1139;
        }
        return class354;
    }

    public float method1673() {
        final float method11867 = this.world.getBlockState(new BlockPos(this)).getBlock().method11867();
        final float method11868 = this.world.getBlockState(this.getPositionUnderneath()).getBlock().method11867();
        return (method11867 != 1.0) ? method11867 : method11868;
    }

    public float method1674() {
        final Block getBlock = this.world.getBlockState(new BlockPos(this)).getBlock();
        final float method21697 = getBlock.method11866();
        if (getBlock != Blocks.field29173 && getBlock != Blocks.BUBBLE_COLUMN) {
            return (method21697 != 1.0) ? method21697 : this.world.getBlockState(this.getPositionUnderneath()).getBlock().method11866();
        }
        return method21697;
    }

    public BlockPos getPositionUnderneath() {
        return new BlockPos(this.posX, this.getBoundingBox().minY - 0.5000001, this.posZ);
    }

    public Vec3d method1676(final Vec3d class5487, final Class2160 class5488) {
        return class5487;
    }

    public Vec3d method1677(final Vec3d class5487) {
        if (class5487.lengthSquared() <= 1.0E-7) {
            return class5487;
        }
        final long method6754 = this.world.method6754();
        if (method6754 != this.pistonDeltasGameTime) {
            Arrays.fill(this.pistonDeltas, 0.0);
            this.pistonDeltasGameTime = method6754;
        }
        if (class5487.x != 0.0) {
            final double method6755 = this.calculatePistonDeltas(Direction.Axis.X, class5487.x);
            return (Math.abs(method6755) > 9.999999747378752E-6) ? new Vec3d(method6755, 0.0, 0.0) : Vec3d.ZERO;
        }
        if (class5487.y != 0.0) {
            final double method6756 = this.calculatePistonDeltas(Direction.Axis.Y, class5487.y);
            return (Math.abs(method6756) > 9.999999747378752E-6) ? new Vec3d(0.0, method6756, 0.0) : Vec3d.ZERO;
        }
        if (class5487.z == 0.0) {
            return Vec3d.ZERO;
        }
        final double method6757 = this.calculatePistonDeltas(Direction.Axis.Z, class5487.z);
        return (Math.abs(method6757) > 9.999999747378752E-6) ? new Vec3d(0.0, 0.0, method6757) : Vec3d.ZERO;
    }

    private double calculatePistonDeltas(final Direction.Axis class111, double distance) {
        int i = class111.ordinal();
        double d0 = MathHelper.clamp(distance + this.pistonDeltas[i], -0.51, 0.51);
        distance = d0 - this.pistonDeltas[i];
        this.pistonDeltas[i] = d0;
        return distance;
    }

    public Vec3d getAllowedMovement(Vec3d vec)
    {
        AxisAlignedBB axisalignedbb = this.getBoundingBox();
        ISelectionContext iselectioncontext = ISelectionContext.forEntity(this);
        VoxelShape voxelshape = this.world.getWorldBorder().getShape();
        Stream<VoxelShape> stream = VoxelShapes.compare(voxelshape, VoxelShapes.create(axisalignedbb.shrink(1.0E-7D)), IBooleanFunction.AND) ? Stream.empty() : Stream.of(voxelshape);
        Stream<VoxelShape> stream1 = this.world.getEmptyCollisionShapes(this, axisalignedbb.expand(vec), ImmutableSet.of());
        ReuseableStream<VoxelShape> reuseablestream = new ReuseableStream<>(Stream.concat(stream1, stream));
        Vec3d vec3d = vec.lengthSquared() == 0.0D ? vec : collideBoundingBoxHeuristically(this, vec, axisalignedbb, this.world, iselectioncontext, reuseablestream);
        boolean flag = vec.x != vec3d.x;
        boolean flag1 = vec.y != vec3d.y;
        boolean flag2 = vec.z != vec3d.z;
        boolean flag3 = this.onGround || flag1 && vec.y < 0.0D;

        if (this.stepHeight > 0.0F && flag3 && (flag || flag2))
        {
            Vec3d vec3d1 = collideBoundingBoxHeuristically(this, new Vec3d(vec.x, (double)this.stepHeight, vec.z), axisalignedbb, this.world, iselectioncontext, reuseablestream);
            Vec3d vec3d2 = collideBoundingBoxHeuristically(this, new Vec3d(0.0D, (double)this.stepHeight, 0.0D), axisalignedbb.expand(vec.x, 0.0D, vec.z), this.world, iselectioncontext, reuseablestream);

            if (vec3d2.y < (double)this.stepHeight)
            {
                Vec3d vec3d3 = collideBoundingBoxHeuristically(this, new Vec3d(vec.x, 0.0D, vec.z), axisalignedbb.offset(vec3d2), this.world, iselectioncontext, reuseablestream).add(vec3d2);

                if (horizontalMag(vec3d3) > horizontalMag(vec3d1))
                {
                    vec3d1 = vec3d3;
                }
            }

            if (horizontalMag(vec3d1) > horizontalMag(vec3d))
            {
                return vec3d1.add(collideBoundingBoxHeuristically(this, new Vec3d(0.0D, -vec3d1.y + vec.y, 0.0D), axisalignedbb.offset(vec3d1), this.world, iselectioncontext, reuseablestream));
            }
        }

        return vec3d;
    }

    public static double horizontalMag(final Vec3d class5487) {
        return class5487.x * class5487.x + class5487.z * class5487.z;
    }

    public static Vec3d collideBoundingBoxHeuristically(final Entity class399, final Vec3d class400, final AxisAlignedBB class401, final World class402, final ISelectionContext class403, final ReuseableStream<VoxelShape> class404) {
        final boolean b = class400.x == 0.0;
        final boolean b2 = class400.y == 0.0;
        final boolean b3 = class400.z == 0.0;
        if (!b || !b2) {
            if (!b || !b3) {
                if (!b2 || !b3) {
                    return collideBoundingBox(class400, class401, new ReuseableStream<>(Stream.concat(class404.createStream(), class402.method6981(class399, class401.expand(class400)))));
                }
            }
        }
        return getAllowedMovement(class400, class401, class402, class403, class404, class399 != null && class399 instanceof ClientPlayerEntity);
    }

    public static Vec3d collideBoundingBox(final Vec3d class5487, AxisAlignedBB class5488, final ReuseableStream<VoxelShape> class5489) {
        double a = class5487.x;
        double n = class5487.y;
        double a2 = class5487.z;
        if (n != 0.0) {
            n = VoxelShapes.method24498(Direction.Axis.Y, class5488, class5489.createStream(), n);
            if (n != 0.0) {
                class5488 = class5488.offset(0.0, n, 0.0);
            }
        }
        final boolean b = Math.abs(a) < Math.abs(a2);
        if (b) {
            if (a2 != 0.0) {
                a2 = VoxelShapes.method24498(Direction.Axis.Z, class5488, class5489.createStream(), a2);
                if (a2 != 0.0) {
                    class5488 = class5488.offset(0.0, 0.0, a2);
                }
            }
        }
        if (a != 0.0) {
            a = VoxelShapes.method24498(Direction.Axis.X, class5488, class5489.createStream(), a);
            if (!b) {
                if (a != 0.0) {
                    class5488 = class5488.offset(a, 0.0, 0.0);
                }
            }
        }
        if (!b) {
            if (a2 != 0.0) {
                a2 = VoxelShapes.method24498(Direction.Axis.Z, class5488, class5489.createStream(), a2);
            }
        }
        return new Vec3d(a, n, a2);
    }

    public static Vec3d getAllowedMovement(final Vec3d class5487, AxisAlignedBB class5488, final Class1852 class5489, final ISelectionContext class5490, final ReuseableStream<VoxelShape> class5491, final boolean b) {
        double a = class5487.x;
        double n = class5487.y;
        double a2 = class5487.z;
        if (n != 0.0) {
            n = VoxelShapes.method24499(Direction.Axis.Y, class5488, class5489, n, class5490, class5491.createStream(), b);
            if (n != 0.0) {
                class5488 = class5488.offset(0.0, n, 0.0);
            }
        }
        final boolean b2 = Math.abs(a) < Math.abs(a2);
        if (b2) {
            if (a2 != 0.0) {
                a2 = VoxelShapes.method24499(Direction.Axis.Z, class5488, class5489, a2, class5490, class5491.createStream(), b);
                if (a2 != 0.0) {
                    class5488 = class5488.offset(0.0, 0.0, a2);
                }
            }
        }
        if (a != 0.0) {
            a = VoxelShapes.method24499(Direction.Axis.X, class5488, class5489, a, class5490, class5491.createStream(), b);
            if (!b2) {
                if (a != 0.0) {
                    class5488 = class5488.offset(a, 0.0, 0.0);
                }
            }
        }
        if (!b2) {
            if (a2 != 0.0) {
                a2 = VoxelShapes.method24499(Direction.Axis.Z, class5488, class5489, a2, class5490, class5491.createStream(), b);
            }
        }
        return new Vec3d(a, n, a2);
    }

    public float method1684() {
        return (float) ((int) this.distanceWalkedOnStepModified + 1);
    }

    public void method1685() {
        final AxisAlignedBB method1886 = this.getBoundingBox();
        this.method1948((method1886.minX + method1886.maxX) / 2.0, method1886.minY, (method1886.minZ + method1886.maxZ) / 2.0);
    }

    public Class7795 method1686() {
        return Class8520.field35223;
    }

    public Class7795 method1687() {
        return Class8520.field35222;
    }

    public Class7795 method1688() {
        return Class8520.field35222;
    }

    public void method1689() {
        final AxisAlignedBB method1886 = this.getBoundingBox();
        try (final Class386 method1887 = Class386.method1298(method1886.minX + 0.001, method1886.minY + 0.001, method1886.minZ + 0.001);
             final Class386 method1888 = Class386.method1298(method1886.maxX - 0.001, method1886.maxY - 0.001, method1886.maxZ - 0.001);
             final Class386 method1889 = Class386.method1296()) {
            if (this.world.method6972(method1887, method1888)) {
                for (int i = method1887.getX(); i <= method1888.getX(); ++i) {
                    for (int j = method1887.getY(); j <= method1888.getY(); ++j) {
                        for (int k = method1887.getZ(); k <= method1888.getZ(); ++k) {
                            method1889.method1300(i, j, k);
                            final BlockState method1890 = this.world.getBlockState(method1889);
                            try {
                                method1890.method21741(this.world, method1889, this);
                                this.method1690(method1890);
                            } catch (final Throwable t4) {
                                final CrashReport method1891 = CrashReport.makeCrashReport(t4, "Colliding entity with block");
                                CrashReportCategory.method16304(method1891.makeCategory("Block being collided with"), method1889, method1890);
                                throw new ReportedException(method1891);
                            }
                        }
                    }
                }
            }
        }
    }

    public void method1690(final BlockState BlockState) {
    }

    public void method1691(final BlockPos class354, final BlockState class355) {
        if (!class355.method21697().method26438()) {
            final BlockState method6701 = this.world.getBlockState(class354.method1137());
            final SoundType class356 = (method6701.getBlock() != Blocks.field29329) ? class355.method21759() : method6701.method21759();
            this.method1695(class356.method24480(), class356.method24477() * 0.15f, class356.method24478());
        }
    }

    public void method1692(final float n) {
        this.method1695(this.method1686(), n, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
    }

    public float method1693(final float n) {
        return 0.0f;
    }

    public boolean method1694() {
        return false;
    }

    public void method1695(final Class7795 class7795, final float n, final float n2) {
        if (!this.method1696()) {
            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), class7795, this.method1922(), n, n2);
        }
    }

    public boolean method1696() {
        return this.dataManager.get(Entity.SILENT);
    }

    public void method1697(final boolean b) {
        this.dataManager.set(Entity.SILENT, b);
    }

    public boolean method1698() {
        return this.dataManager.get(Entity.NO_GRAVITY);
    }

    public void method1699(final boolean b) {
        this.dataManager.set(Entity.NO_GRAVITY, b);
    }

    public boolean method1700() {
        return true;
    }

    public void method1701(final double n, final boolean b, final BlockState BlockState, final BlockPos class7097) {
        if (!b) {
            if (n < 0.0) {
                this.fallDistance -= (float) n;
            }
        } else {
            if (this.fallDistance > 0.0f) {
                BlockState.getBlock().method11860(this.world, class7097, this, this.fallDistance);
            }
            this.fallDistance = 0.0f;
        }
    }

    @Nullable
    public AxisAlignedBB method1702() {
        return null;
    }

    public void method1703(final int n) {
        if (!this.method1704()) {
            this.attackEntityFrom(DamageSource.field32562, (float) n);
        }
    }

    public final boolean method1704() {
        return this.getType().method23363();
    }

    public boolean method1705(final float n, final float n2) {
        if (this.isBeingRidden()) {
            final Iterator<Entity> iterator = this.method1908().iterator();
            while (iterator.hasNext()) {
                iterator.next().method1705(n, n2);
            }
        }
        return false;
    }

    public boolean method1706() {
        return this.inWater;
    }

    private boolean method1707() {
        boolean b;
        try (final Class386 method1297 = Class386.method1297(this)) {
            b = (this.world.method6772(method1297) || this.world.method6772(method1297.method1302(this.getPosX(), this.getPosY() + this.size.field34098, this.getPosZ())));
        }
        return b;
    }

    private boolean method1708() {
        return this.world.getBlockState(new BlockPos(this)).getBlock() == Blocks.BUBBLE_COLUMN;
    }

    public boolean method1709() {
        return this.method1706() || this.method1707();
    }

    public boolean method1710() {
        if (!this.method1706()) {
            if (!this.method1707()) {
                if (!this.method1708()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean method1711() {
        return this.method1706() || this.method1708();
    }

    public boolean method1712() {
        return this.eyesInWater && this.method1706();
    }

    private void method1713() {
        this.method1715();
        this.method1716();
        this.method1714();
    }

    public void method1714() {
        if (!this.method1817()) {
            boolean b = false;
            Label_0086:
            {
                if (this.method1815()) {
                    if (this.method1712()) {
                        if (!this.isPassenger()) {
                            b = true;
                            break Label_0086;
                        }
                    }
                }
                b = false;
            }
            this.method1820(b);
        } else {
            boolean b2 = false;
            Label_0056:
            {
                if (this.method1815()) {
                    if (this.method1706()) {
                        if (!this.isPassenger()) {
                            b2 = true;
                            break Label_0056;
                        }
                    }
                }
                b2 = false;
            }
            this.method1820(b2);
        }
    }

    public boolean method1715() {
        if (!(this.method1920() instanceof Class423)) {
            if (!this.method1928(Class7324.field28319)) {
                this.inWater = false;
            } else {
                if (!this.inWater) {
                    if (!this.firstUpdate) {
                        this.method1717();
                    }
                }
                this.fallDistance = 0.0f;
                this.inWater = true;
                this.method1667();
            }
        } else {
            this.inWater = false;
        }
        return this.inWater;
    }

    private void method1716() {
        this.eyesInWater = this.method1721(Class7324.field28319, true);
    }

    public void method1717() {
        final Entity class399 = (this.isBeingRidden() && this.method1907() != null) ? this.method1907() : this;
        final float n = (class399 != this) ? 0.9f : 0.2f;
        final Vec3d method1935 = class399.getMotion();
        float n2 = MathHelper.sqrt(method1935.x * method1935.x * 0.20000000298023224 + method1935.y * method1935.y + method1935.z * method1935.z * 0.20000000298023224) * n;
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        if (n2 >= 0.25) {
            this.method1695(this.method1688(), n2, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
        } else {
            this.method1695(this.method1687(), n2, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
        }
        final float n3 = (float) MathHelper.floor(this.getPosY());
        for (int n4 = 0; n4 < 1.0f + this.size.field34097 * 20.0f; ++n4) {
            this.world.method6709(Class8432.field34601, this.getPosX() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.size.field34097, n3 + 1.0f, this.getPosZ() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.size.field34097, method1935.x, method1935.y - this.rand.nextFloat() * 0.2f, method1935.z);
        }
        for (int n5 = 0; n5 < 1.0f + this.size.field34097 * 20.0f; ++n5) {
            this.world.method6709(Class8432.field34646, this.getPosX() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.size.field34097, n3 + 1.0f, this.getPosZ() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.size.field34097, method1935.x, method1935.y, method1935.z);
        }
    }

    public void method1718() {
        if (this.method1815()) {
            if (!this.method1706()) {
                this.method1719();
            }
        }
    }

    public void method1719() {
        final BlockState method6701 = this.world.getBlockState(new BlockPos(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY() - 0.20000000298023224), MathHelper.floor(this.getPosZ())));
        if (method6701.method21710() != Class2115.field12305) {
            final Vec3d method6702 = this.getMotion();
            this.world.method6709(new Class6911(Class8432.field34600, method6701), this.getPosX() + (this.rand.nextFloat() - 0.5) * this.size.field34097, this.getPosY() + 0.1, this.getPosZ() + (this.rand.nextFloat() - 0.5) * this.size.field34097, method6702.x * -4.0, 1.5, method6702.z * -4.0);
        }
    }

    public boolean method1720(final Class7909<Fluid> class7909) {
        return this.method1721(class7909, false);
    }

    public boolean method1721(final Class7909<Fluid> class7909, final boolean b) {
        if (this.method1920() instanceof Class423) {
            return false;
        }
        final double method1944 = this.method1944();
        final BlockPos class7910 = new BlockPos(this.getPosX(), method1944, this.getPosZ());
        if (b && !this.world.method6814(class7910.getX() >> 4, class7910.getZ() >> 4)) {
            return false;
        }
        final IFluidState method1945 = this.world.getFluidState(class7910);
        return method1945.isTagged(class7909) && method1944 < class7910.getY() + method1945.getActualHeight(this.world, class7910) + 0.11111111f;
    }

    public void method1722() {
        this.inLava = true;
    }

    public boolean method1723() {
        return this.inLava;
    }

    public void method1724(final float n, final Vec3d class5487) {
        this.method1936(this.getMotion().add(method1725(class5487, n, this.rotationYaw)));
    }

    private static Vec3d method1725(final Vec3d class5487, final float n, final float n2) {
        final double method16753 = class5487.lengthSquared();
        if (method16753 >= 1.0E-7) {
            final Vec3d method16754 = ((method16753 <= 1.0) ? class5487 : class5487.normalize()).scale(n);
            final float method16755 = MathHelper.sin(n2 * 0.017453292f);
            final float method16756 = MathHelper.cos(n2 * 0.017453292f);
            return new Vec3d(method16754.x * method16756 - method16754.z * method16755, method16754.y, method16754.z * method16756 + method16754.x * method16755);
        }
        return Vec3d.ZERO;
    }

    public float method1726() {
        final Mutable class385 = new Mutable(this.getPosX(), 0.0, this.getPosZ());
        if (!this.world.method6971(class385)) {
            return 0.0f;
        }
        class385.method1294(MathHelper.floor(this.method1944()));
        return this.world.method6963(class385);
    }

    public void method1727(final World field2391) {
        this.world = field2391;
    }

    public void method1728(final double n, final double field2393, final double n2, final float n3, final float n4) {
        this.setPosition(this.prevPosX = MathHelper.clamp(n, -3.0E7, 3.0E7), this.prevPosY = field2393, this.prevPosZ = MathHelper.clamp(n2, -3.0E7, 3.0E7));
        this.rotationYaw = n3 % 360.0f;
        this.rotationPitch = MathHelper.clamp(n4, -90.0f, 90.0f) % 360.0f;
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
    }

    public void method1729(final BlockPos class354, final float n, final float n2) {
        this.method1730(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5, n, n2);
    }

    public void method1730(final double n, final double n2, final double n3, final float field2399, final float field2400) {
        this.method1731(n, n2, n3);
        this.rotationYaw = field2399;
        this.rotationPitch = field2400;
        this.method1657();
    }

    public void method1731(final double n, final double n2, final double n3) {
        this.method1948(n, n2, n3);
        this.prevPosX = n;
        this.prevPosY = n2;
        this.prevPosZ = n3;
        this.lastTickPosX = n;
        this.lastTickPosY = n2;
        this.lastTickPosZ = n3;
    }

    public float method1732(final Entity class399) {
        final float n = (float) (this.getPosX() - class399.getPosX());
        final float n2 = (float) (this.getPosY() - class399.getPosY());
        final float n3 = (float) (this.getPosZ() - class399.getPosZ());
        return MathHelper.method35640(n * n + n2 * n2 + n3 * n3);
    }

    public double method1733(final double n, final double n2, final double n3) {
        final double n4 = this.getPosX() - n;
        final double n5 = this.getPosY() - n2;
        final double n6 = this.getPosZ() - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public double method1734(final Entity class399) {
        return this.method1735(class399.method1934());
    }

    public double method1735(final Vec3d class5487) {
        final double n = this.getPosX() - class5487.x;
        final double n2 = this.getPosY() - class5487.y;
        final double n3 = this.getPosZ() - class5487.z;
        return n * n + n2 * n2 + n3 * n3;
    }

    public void method1736(final PlayerEntity playerEntity) {
    }

    public void method1737(final Entity class399) {
        if (!this.method1916(class399)) {
            if (!class399.noClip) {
                if (!this.noClip) {
                    final double n = class399.getPosX() - this.getPosX();
                    final double n2 = class399.getPosZ() - this.getPosZ();
                    final double method35656 = MathHelper.method35656(n, n2);
                    if (method35656 >= 0.009999999776482582) {
                        final double n3 = MathHelper.sqrt(method35656);
                        final double n4 = n / n3;
                        final double n5 = n2 / n3;
                        double n6 = 1.0 / n3;
                        if (n6 > 1.0) {
                            n6 = 1.0;
                        }
                        final double n7 = n4 * n6;
                        final double n8 = n5 * n6;
                        final double n9 = n7 * 0.05000000074505806;
                        final double n10 = n8 * 0.05000000074505806;
                        final double n11 = n9 * (1.0f - this.entityCollisionReduction);
                        final double n12 = n10 * (1.0f - this.entityCollisionReduction);
                        if (!this.isBeingRidden()) {
                            this.method1738(-n11, 0.0, -n12);
                        }
                        if (!class399.isBeingRidden()) {
                            class399.method1738(n11, 0.0, n12);
                        }
                    }
                }
            }
        }
    }

    public void method1738(final double n, final double n2, final double n3) {
        this.method1936(this.getMotion().add(n, n2, n3));
        this.isAirBorne = true;
    }

    public void method1739() {
        this.velocityChanged = true;
    }

    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            this.method1739();
            return false;
        }
        return false;
    }

    public final Vec3d method1741(final float n) {
        return this.method1744(this.getPitch(n), this.getYaw(n));
    }

    public float getPitch(final float n) {
        return (n != 1.0f) ? MathHelper.method35700(n, this.prevRotationPitch, this.rotationPitch) : this.rotationPitch;
    }

    public float getYaw(final float n) {
        return (n != 1.0f) ? MathHelper.method35700(n, this.prevRotationYaw, this.rotationYaw) : this.rotationYaw;
    }

    public final Vec3d method1744(final float n, final float n2) {
        final float n3 = n * 0.017453292f;
        final float n4 = -n2 * 0.017453292f;
        final float method35639 = MathHelper.cos(n4);
        final float method35640 = MathHelper.sin(n4);
        final float method35641 = MathHelper.cos(n3);
        return new Vec3d(method35640 * method35641, -MathHelper.sin(n3), method35639 * method35641);
    }

    public final Vec3d method1745(final float n) {
        return this.method1746(this.getPitch(n), this.getYaw(n));
    }

    public final Vec3d method1746(final float n, final float n2) {
        return this.method1744(n - 90.0f, n2);
    }

    public final Vec3d method1747(final float n) {
        if (n != 1.0f) {
            return new Vec3d(MathHelper.lerp(n, this.prevPosX, this.getPosX()), MathHelper.lerp(n, this.prevPosY, this.getPosY()) + this.method1892(), MathHelper.lerp(n, this.prevPosZ, this.getPosZ()));
        }
        return new Vec3d(this.getPosX(), this.method1944(), this.getPosZ());
    }

    public RayTraceResult method1748(final double n, final float n2, final boolean b) {
        final Vec3d method1747 = this.method1747(n2);
        final Vec3d method1748 = this.method1741(n2);
        return this.world.rayTraceBlocks(new RayTraceContext(method1747, method1747.add(method1748.x * n, method1748.y * n, method1748.z * n), RayTraceContext.BlockMode.OUTLINE, b ? RayTraceContext.FluidMode.ANY : RayTraceContext.FluidMode.NONE, this));
    }

    public boolean method1749() {
        return false;
    }

    public boolean method1750() {
        return false;
    }

    public void method1751(final Entity class399, final int n, final DamageSource class400) {
        if (class399 instanceof Class513) {
            Class7770.field31777.method13738((Class513) class399, this, class400);
        }
    }

    public boolean method1752(final double n, final double n2, final double n3) {
        final double n4 = this.getPosX() - n;
        final double n5 = this.getPosY() - n2;
        final double n6 = this.getPosZ() - n3;
        return this.method1753(n4 * n4 + n5 * n5 + n6 * n6);
    }

    public boolean method1753(final double n) {
        double method18507 = this.getBoundingBox().getAverageEdgeLength();
        if (Double.isNaN(method18507)) {
            method18507 = 1.0;
        }
        final double n2 = method18507 * 64.0 * Entity.renderDistanceWeight;
        return n < n2 * n2;
    }

    public boolean method1754(final CompoundNBT class51) {
        final String method1759 = this.method1759();
        if (!this.removed && method1759 != null) {
            class51.putString("id", method1759);
            this.method1756(class51);
            return true;
        }
        return false;
    }

    public boolean method1755(final CompoundNBT class51) {
        return !this.isPassenger() && this.method1754(class51);
    }

    public CompoundNBT method1756(final CompoundNBT class51) {
        try {
            class51.put("Pos", this.method1762(this.getPosX(), this.getPosY(), this.getPosZ()));
            final Vec3d method1935 = this.getMotion();
            class51.put("Motion", this.method1762(method1935.x, method1935.y, method1935.z));
            class51.put("Rotation", this.method1763(this.rotationYaw, this.rotationPitch));
            class51.putFloat("FallDistance", this.fallDistance);
            class51.putShort("Fire", (short) this.fire);
            class51.putShort("Air", (short) this.getAir());
            class51.putBoolean("OnGround", this.onGround);
            class51.putInt("Dimension", this.dimension.method1270());
            class51.putBoolean("Invulnerable", this.invulnerable);
            class51.putInt("PortalCooldown", this.timeUntilPortal);
            class51.putUniqueId("UUID", this.method1865());
            final ITextComponent method1936 = this.getCustomName();
            if (method1936 != null) {
                class51.putString("CustomName", Class5953.method17869(method1936));
            }
            if (this.method1876()) {
                class51.putBoolean("CustomNameVisible", this.method1876());
            }
            if (this.method1696()) {
                class51.putBoolean("Silent", this.method1696());
            }
            if (this.method1698()) {
                class51.putBoolean("NoGravity", this.method1698());
            }
            if (this.glowing) {
                class51.putBoolean("Glowing", this.glowing);
            }
            if (!this.tags.isEmpty()) {
                final ListNBT class52 = new ListNBT();
                final Iterator<String> iterator = this.tags.iterator();
                while (iterator.hasNext()) {
                    class52.add(StringNBT.method290(iterator.next()));
                }
                class51.put("Tags", class52);
            }
            this.method1761(class51);
            if (this.isBeingRidden()) {
                final ListNBT class53 = new ListNBT();
                for (final Entity class54 : this.method1908()) {
                    final CompoundNBT e = new CompoundNBT();
                    if (class54.method1754(e)) {
                        class53.add(e);
                    }
                }
                if (!class53.isEmpty()) {
                    class51.put("Passengers", class53);
                }
            }
            return class51;
        } catch (final Throwable t) {
            final CrashReport method1937 = CrashReport.makeCrashReport(t, "Saving entity NBT");
            this.method1862(method1937.makeCategory("Entity being saved"));
            throw new ReportedException(method1937);
        }
    }

    public void method1757(final CompoundNBT class51) {
        try {
            final ListNBT method328 = class51.getList("Pos", 6);
            final ListNBT method329 = class51.getList("Motion", 6);
            final ListNBT method330 = class51.getList("Rotation", 5);
            final double method331 = method329.method351(0);
            final double method332 = method329.method351(1);
            final double method333 = method329.method351(2);
            this.setMotion((Math.abs(method331) > 10.0) ? 0.0 : method331, (Math.abs(method332) > 10.0) ? 0.0 : method332, (Math.abs(method333) > 10.0) ? 0.0 : method333);
            this.method1731(method328.method351(0), method328.method351(1), method328.method351(2));
            this.rotationYaw = method330.method352(0);
            this.rotationPitch = method330.method352(1);
            this.prevRotationYaw = this.rotationYaw;
            this.prevRotationPitch = this.rotationPitch;
            this.method1845(this.rotationYaw);
            this.method1846(this.rotationYaw);
            this.fallDistance = class51.getFloat("FallDistance");
            this.fire = class51.getShort("Fire");
            this.setAir(class51.getShort("Air"));
            this.onGround = class51.getBoolean("OnGround");
            if (class51.contains("Dimension")) {
                this.dimension = DimensionType.method1274(class51.getInt("Dimension"));
            }
            this.invulnerable = class51.getBoolean("Invulnerable");
            this.timeUntilPortal = class51.getInt("PortalCooldown");
            if (class51.hasUniqueId("UUID")) {
                this.entityUniqueID = class51.getUniqueId("UUID");
                this.cachedUniqueIdString = this.entityUniqueID.toString();
            }
            if (!Double.isFinite(this.getPosX()) || !Double.isFinite(this.getPosY()) || !Double.isFinite(this.getPosZ())) {
                throw new IllegalStateException("Entity has invalid position");
            }
            if (!Double.isFinite(this.rotationYaw) || !Double.isFinite(this.rotationPitch)) {
                throw new IllegalStateException("Entity has invalid rotation");
            }
            this.method1657();
            this.method1655(this.rotationYaw, this.rotationPitch);
            if (class51.contains("CustomName", 8)) {
                this.method1872(Class5953.method17871(class51.getString("CustomName")));
            }
            this.method1875(class51.getBoolean("CustomNameVisible"));
            this.method1697(class51.getBoolean("Silent"));
            this.method1699(class51.getBoolean("NoGravity"));
            this.method1822(class51.getBoolean("Glowing"));
            if (class51.contains("Tags", 9)) {
                this.tags.clear();
                final ListNBT method334 = class51.getList("Tags", 8);
                for (int min = Math.min(method334.size(), 1024), i = 0; i < min; ++i) {
                    this.tags.add(method334.method353(i));
                }
            }
            this.method1760(class51);
            if (this.method1758()) {
                this.method1657();
            }
        } catch (final Throwable t) {
            final CrashReport method335 = CrashReport.makeCrashReport(t, "Loading entity NBT");
            this.method1862(method335.makeCategory("Entity being loaded"));
            throw new ReportedException(method335);
        }
    }

    public boolean method1758() {
        return true;
    }

    @Nullable
    public final String method1759() {
        final EntityType<?> method1642 = this.getType();
        final ResourceLocation method1643 = EntityType.method23354(method1642);
        return (method1642.method23361() && method1643 != null) ? method1643.toString() : null;
    }

    public abstract void method1760(final CompoundNBT p0);

    public abstract void method1761(final CompoundNBT p0);

    public ListNBT method1762(final double... array) {
        final ListNBT class52 = new ListNBT();
        for (int length = array.length, i = 0; i < length; ++i) {
            class52.add(DoubleNBT.method277(array[i]));
        }
        return class52;
    }

    public ListNBT method1763(final float... array) {
        final ListNBT class52 = new ListNBT();
        for (int length = array.length, i = 0; i < length; ++i) {
            class52.add(FloatNBT.method281(array[i]));
        }
        return class52;
    }

    @Nullable
    public Class427 method1764(final Class3832 class3832) {
        return this.method1765(class3832, 0);
    }

    @Nullable
    public Class427 method1765(final Class3832 class3832, final int n) {
        return this.method1767(new ItemStack(class3832), (float) n);
    }

    @Nullable
    public Class427 method1766(final ItemStack class8321) {
        return this.method1767(class8321, 0.0f);
    }

    @Nullable
    public Class427 method1767(final ItemStack class8321, final float n) {
        if (class8321.method27620()) {
            return null;
        }
        if (!this.world.isRemote) {
            final Class427 class8322 = new Class427(this.world, this.getPosX(), this.getPosY() + n, this.getPosZ(), class8321);
            class8322.method2114();
            this.world.method6886(class8322);
            return class8322;
        }
        return null;
    }

    public boolean isAlive() {
        return !this.removed;
    }

    public boolean method1769() {
        if (this.noClip) {
            return false;
        }
        try (final Class386 method1296 = Class386.method1296()) {
            for (int i = 0; i < 8; ++i) {
                final int method1297 = MathHelper.floor(this.getPosY() + ((i >> 0) % 2 - 0.5f) * 0.1f + this.eyeHeight);
                final int method1298 = MathHelper.floor(this.getPosX() + ((i >> 1) % 2 - 0.5f) * this.size.field34097 * 0.8f);
                final int method1299 = MathHelper.floor(this.getPosZ() + ((i >> 2) % 2 - 0.5f) * this.size.field34097 * 0.8f);
                if (method1296.getX() != method1298 || method1296.getY() != method1297 || method1296.getZ() != method1299) {
                    method1296.method1300(method1298, method1297, method1299);
                    if (this.world.getBlockState(method1296).method21746(this.world, method1296)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        return false;
    }

    @Nullable
    public AxisAlignedBB method1771(final Entity class399) {
        return null;
    }

    public void method1772() {
        this.method1936(Vec3d.ZERO);
        this.method1659();
        if (this.isPassenger()) {
            this.method1920().method1773(this);
        }
    }

    public void method1773(final Entity class399) {
        this.method1774(class399, Entity::setPosition);
    }

    public void method1774(final Entity class399, final Class9228 class400) {
        if (this.method1909(class399)) {
            class400.method34032(class399, this.getPosX(), this.getPosY() + this.method1777() + class399.method1776(), this.getPosZ());
        }
    }

    public void method1775(final Entity class399) {
    }

    public double method1776() {
        return 0.0;
    }

    public double method1777() {
        return this.size.field34098 * 0.75;
    }

    public boolean method1778(final Entity class399) {
        return this.method1780(class399, false);
    }

    public boolean method1779() {
        return this instanceof LivingEntity;
    }

    public boolean method1780(final Entity field2389, final boolean b) {
        for (Entity field2390 = field2389; field2390.ridingEntity != null; field2390 = field2390.ridingEntity) {
            if (field2390.ridingEntity == this) {
                return false;
            }
        }
        if (!b && (!this.method1781(field2389) || !field2389.method1787(this))) {
            return false;
        }
        if (this.isPassenger()) {
            this.stopRiding();
        }
        (this.ridingEntity = field2389).method1785(this);
        return true;
    }

    public boolean method1781(final Entity class399) {
        return this.rideCooldown <= 0;
    }

    public boolean method1782(final Pose class290) {
        return this.world.method6978(this, this.method1888(class290));
    }

    public void removePassengers() {
        for (int i = this.passengers.size() - 1; i >= 0; --i) {
            this.passengers.get(i).stopRiding();
        }
    }

    public void stopRiding() {
        if (this.ridingEntity != null) {
            final Entity field2389 = this.ridingEntity;
            this.ridingEntity = null;
            field2389.method1786(this);
        }
    }

    public void method1785(final Entity class399) {
        if (class399.method1920() == this) {
            if (!this.world.isRemote) {
                if (class399 instanceof PlayerEntity) {
                    if (!(this.method1907() instanceof PlayerEntity)) {
                        this.passengers.add(0, class399);
                        return;
                    }
                }
            }
            this.passengers.add(class399);
            return;
        }
        throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
    }

    public void method1786(final Entity class399) {
        if (class399.method1920() != this) {
            this.passengers.remove(class399);
            class399.rideCooldown = 60;
            return;
        }
        throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
    }

    public boolean method1787(final Entity class399) {
        return this.method1908().size() < 1;
    }

    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.setPosition(n, n2, n3);
        this.method1655(n4, n5);
    }

    public void method1789(final float n, final int n2) {
        this.method1845(n);
    }

    public float method1790() {
        return 0.0f;
    }

    public Vec3d method1791() {
        return this.method1744(this.rotationPitch, this.rotationYaw);
    }

    public Vec2f method1792() {
        return new Vec2f(this.rotationPitch, this.rotationYaw);
    }

    public Vec3d method1793() {
        return Vec3d.fromPitchYaw(this.method1792());
    }

    public void method1794(final BlockPos class354) {
        if (this.timeUntilPortal <= 0) {
            if (!this.world.isRemote) {
                if (!class354.equals(this.lastPortalPos)) {
                    this.lastPortalPos = new BlockPos(class354);
                    final Class3998 class355 = (Class3998) Blocks.field29341;
                    final Class7820 method12149 = Class3998.method12149(this.world, this.lastPortalPos);
                    final double n = (method12149.method25266().getAxis() != Direction.Axis.X) ? method12149.method25265().getX() : ((double) method12149.method25265().getZ());
                    this.lastPortalVec = new Vec3d(Math.abs(MathHelper.method35692(((method12149.method25266().getAxis() != Direction.Axis.X) ? this.getPosX() : this.getPosZ()) - (double) ((method12149.method25266().rotateY().getAxisDirection() == AxisDirection.NEGATIVE) ? 1 : 0), n, n - method12149.method25268())), MathHelper.method35692(this.getPosY() - 1.0, method12149.method25265().getY(), method12149.method25265().getY() - method12149.method25269()), 0.0);
                    this.teleportDirection = method12149.method25266();
                }
            }
            this.inPortal = true;
        } else {
            this.timeUntilPortal = this.method1796();
        }
    }

    public void method1795() {
        if (this.world instanceof Class1849) {
            final int method1662 = this.method1662();
            if (!this.inPortal) {
                if (this.portalCounter > 0) {
                    this.portalCounter -= 4;
                }
                if (this.portalCounter < 0) {
                    this.portalCounter = 0;
                }
            } else {
                if (this.world.getServer().method1471()) {
                    if (!this.isPassenger()) {
                        if (this.portalCounter++ >= method1662) {
                            this.world.method6796().startSection("portal");
                            this.portalCounter = method1662;
                            this.timeUntilPortal = this.method1796();
                            this.method1854((this.world.dimension.getType() != DimensionType.field2224) ? DimensionType.field2224 : DimensionType.field2223);
                            this.world.method6796().endSection();
                        }
                    }
                }
                this.inPortal = false;
            }
            this.method1661();
        }
    }

    public int method1796() {
        return 300;
    }

    public void method1797(final double n, final double n2, final double n3) {
        this.setMotion(n, n2, n3);
    }

    public void method1798(final byte b) {
        switch (b) {
            case 53: {
                Class3848.method11907(this);
                break;
            }
        }
    }

    public void method1799() {
    }

    public Iterable<ItemStack> method1800() {
        return Entity.EMPTY_EQUIPMENT;
    }

    public Iterable<ItemStack> method1801() {
        return Entity.EMPTY_EQUIPMENT;
    }

    public Iterable<ItemStack> method1802() {
        return Iterables.concat((Iterable) this.method1800(), (Iterable) this.method1801());
    }

    public void method1803(final Class2215 class2215, final ItemStack class2216) {
    }

    public boolean method1804() {
        final boolean b = this.world != null && this.world.isRemote;
        if (!this.method1704()) {
            if (this.fire <= 0) {
                if (!b) {
                    return false;
                }
                if (!this.method1829(0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPassenger() {
        return this.method1920() != null;
    }

    public boolean isBeingRidden() {
        return !this.method1908().isEmpty();
    }

    public boolean method1807() {
        return true;
    }

    public void method1808(final boolean b) {
        this.setFlag(1, b);
    }

    public boolean method1809() {
        return this.method1829(1);
    }

    public boolean method1810() {
        return this.method1809();
    }

    public boolean method1811() {
        return this.method1809();
    }

    public boolean method1812() {
        return this.method1809();
    }

    public boolean isDescending() {
        return this.method1809();
    }

    public boolean method1814() {
        return this.method1654() == Pose.field1668;
    }

    public boolean method1815() {
        return this.method1829(3);
    }

    public void method1816(final boolean b) {
        this.setFlag(3, b);
    }

    public boolean method1817() {
        return this.method1829(4);
    }

    public boolean method1818() {
        return this.method1654() == Pose.field1666;
    }

    public boolean method1819() {
        return this.method1818() && !this.method1706();
    }

    public void method1820(final boolean b) {
        this.setFlag(4, b);
    }

    public boolean method1821() {
        return this.glowing || (this.world.isRemote && this.method1829(6));
    }

    public void method1822(final boolean field2459) {
        this.glowing = field2459;
        if (!this.world.isRemote) {
            this.setFlag(6, this.glowing);
        }
    }

    public boolean method1823() {
        return this.method1829(5);
    }

    public boolean method1824(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            final Team method1825 = this.getTeam();
            if (method1825 != null) {
                if (playerEntity != null) {
                    if (playerEntity.getTeam() == method1825) {
                        if (method1825.method20552()) {
                            return false;
                        }
                    }
                }
            }
            return this.method1823();
        }
        return false;
    }

    @Nullable
    public Team getTeam() {
        return this.world.method6782().method19651(this.method1867());
    }

    public boolean method1826(final Entity class399) {
        return this.method1827(class399.getTeam());
    }

    public boolean method1827(final Team class6750) {
        return this.getTeam() != null && this.getTeam().method20565(class6750);
    }

    public void method1828(final boolean b) {
        this.setFlag(5, b);
    }

    public boolean method1829(final int n) {
        return (this.dataManager.get(Entity.FLAGS) & 1 << n) != 0x0;
    }

    public void setFlag(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(Entity.FLAGS);
        if (!b) {
            this.dataManager.set(Entity.FLAGS, (byte) (byteValue & ~(1 << n)));
        } else {
            this.dataManager.set(Entity.FLAGS, (byte) (byteValue | 1 << n));
        }
    }

    public int getMaxAir() {
        return 300;
    }

    public int getAir() {
        return this.dataManager.get(Entity.AIR);
    }

    public void setAir(final int i) {
        this.dataManager.set(Entity.AIR, i);
    }

    public void onStruckByLightning(final LightningBoltEntity class422) {
        ++this.fire;
        if (this.fire == 0) {
            this.setFire(8);
        }
        this.attackEntityFrom(DamageSource.LIGHTNING_BOLT, 5.0f);
    }

    public void onEnterBubbleColumnWithAirAbove(final boolean b) {
        final Vec3d method1935 = this.getMotion();
        double n;
        if (!b) {
            n = Math.min(1.8, method1935.y + 0.1);
        } else {
            n = Math.max(-0.9, method1935.y - 0.03);
        }
        this.setMotion(method1935.x, n, method1935.z);
    }

    public void onEnterBubbleColumn(final boolean b) {
        final Vec3d method1935 = this.getMotion();
        double n;
        if (!b) {
            n = Math.min(0.7, method1935.y + 0.06);
        } else {
            n = Math.max(-0.3, method1935.y - 0.03);
        }
        this.setMotion(method1935.x, n, method1935.z);
        this.fallDistance = 0.0f;
    }

    public void onKillEntity(final LivingEntity class511) {
    }

    public void pushOutOfBlocks(final double n, final double n2, final double n3) {
        final BlockPos class354 = new BlockPos(n, n2, n3);
        final Vec3d class355 = new Vec3d(n - class354.getX(), n2 - class354.getY(), n3 - class354.getZ());
        final Mutable class356 = new Mutable();
        Direction field512 = Direction.UP;
        double n4 = Double.MAX_VALUE;
        for (final Direction class357 : new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.UP}) {
            class356.method1287(class354).method1290(class357);
            if (!this.world.getBlockState(class356).isCollisionShapeOpaque(this.world, class356)) {
                final double method16759 = class355.getCoordinate(class357.getAxis());
                final double n5 = (class357.getAxisDirection() != AxisDirection.POSITIVE) ? method16759 : (1.0 - method16759);
                if (n5 < n4) {
                    n4 = n5;
                    field512 = class357;
                }
            }
        }
        final float n6 = this.rand.nextFloat() * 0.2f + 0.1f;
        final float n7 = (float) field512.getAxisDirection().getOffset();
        final Vec3d method16760 = this.getMotion().scale(0.75);
        if (field512.getAxis() != Direction.Axis.X) {
            if (field512.getAxis() != Direction.Axis.Y) {
                if (field512.getAxis() == Direction.Axis.Z) {
                    this.setMotion(method16760.x, method16760.y, n7 * n6);
                }
            } else {
                this.setMotion(method16760.x, n7 * n6, method16760.z);
            }
        } else {
            this.setMotion(n7 * n6, method16760.y, method16760.z);
        }
    }

    public void setMotionMultiplier(final BlockState BlockState, final Vec3d field2409) {
        this.fallDistance = 0.0f;
        this.motionMultiplier = field2409;
    }

    private static void method1840(final ITextComponent class2250) {
        class2250.applyTextStyle(class2251 -> class2251.method30419(null)).getSiblings().forEach(Entity::method1840);
    }

    @Override
    public ITextComponent getName() {
        final ITextComponent method1873 = this.getCustomName();
        if (method1873 == null) {
            return this.method1842();
        }
        final ITextComponent method1874 = method1873.deepCopy();
        method1840(method1874);
        return method1874;
    }

    public ITextComponent method1842() {
        return this.type.method23367();
    }

    public boolean method1843(final Entity class399) {
        return this == class399;
    }

    public float method1844() {
        return 0.0f;
    }

    public void method1845(final float n) {
    }

    public void method1846(final float n) {
    }

    public boolean method1847() {
        return true;
    }

    public boolean method1848(final Entity class399) {
        return false;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.getName().getUnformattedComponentText(), this.entityId, (this.world != null) ? this.world.method6764().method29549() : "~NULL~", this.getPosX(), this.getPosY(), this.getPosZ());
    }

    public boolean method1849(final DamageSource class7929) {
        if (this.invulnerable) {
            if (class7929 != DamageSource.field32574) {
                if (!class7929.method25725()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method1850() {
        return this.invulnerable;
    }

    public void method1851(final boolean field2456) {
        this.invulnerable = field2456;
    }

    public void method1852(final Entity class399) {
        this.method1730(class399.getPosX(), class399.getPosY(), class399.getPosZ(), class399.rotationYaw, class399.rotationPitch);
    }

    public void method1853(final Entity class399) {
        final CompoundNBT method1756 = class399.method1756(new CompoundNBT());
        method1756.remove("Dimension");
        this.method1757(method1756);
        this.timeUntilPortal = class399.timeUntilPortal;
        this.lastPortalPos = class399.lastPortalPos;
        this.lastPortalVec = class399.lastPortalVec;
        this.teleportDirection = class399.teleportDirection;
    }

    @Nullable
    public Entity method1854(final DimensionType field2452) {
        if (!this.world.isRemote && !this.removed) {
            this.world.method6796().startSection("changeDimension");
            final MinecraftServer method1897 = this.method1897();
            final DimensionType field2453 = this.dimension;
            final Class1849 method1898 = method1897.method1481(field2453);
            final Class1849 method1899 = method1897.method1481(field2452);
            this.dimension = field2452;
            this.detach();
            this.world.method6796().startSection("reposition");
            Vec3d class5487 = this.getMotion();
            float n = 0.0f;
            BlockPos class5488;
            if (field2453 == DimensionType.field2225 && field2452 == DimensionType.field2223) {
                class5488 = method1899.method6958(HeightmapType.field11526, method1899.method6758());
            } else if (field2452 != DimensionType.field2225) {
                double method1900 = this.getPosX();
                double method1901 = this.getPosZ();
                if (field2453 == DimensionType.field2223 && field2452 == DimensionType.field2224) {
                    method1900 /= 8.0;
                    method1901 /= 8.0;
                } else if (field2453 == DimensionType.field2224) {
                    if (field2452 == DimensionType.field2223) {
                        method1900 *= 8.0;
                        method1901 *= 8.0;
                    }
                }
                final double min = Math.min(-2.9999872E7, method1899.getWorldBorder().method34786() + 16.0);
                final double min2 = Math.min(-2.9999872E7, method1899.getWorldBorder().method34787() + 16.0);
                final double min3 = Math.min(2.9999872E7, method1899.getWorldBorder().method34788() - 16.0);
                final double min4 = Math.min(2.9999872E7, method1899.getWorldBorder().method34789() - 16.0);
                final double method1902 = MathHelper.clamp(method1900, min, min3);
                final double method1903 = MathHelper.clamp(method1901, min2, min4);
                final Vec3d method1904 = this.method1859();
                final Class9402 method1905 = method1899.method6909().method31768(new BlockPos(method1902, this.getPosY(), method1903), class5487, this.method1860(), method1904.x, method1904.y, this instanceof PlayerEntity);
                if (method1905 == null) {
                    return null;
                }
                class5488 = new BlockPos(method1905.field40340);
                class5487 = method1905.field40341;
                n = (float) method1905.field40342;
            } else {
                class5488 = method1899.method6878();
            }
            this.world.method6796().method15300("reloading");
            final Object method1906 = this.getType().method23371(method1899);
            if (method1906 != null) {
                ((Entity) method1906).method1853(this);
                ((Entity) method1906).method1729(class5488, ((Entity) method1906).rotationYaw + n, ((Entity) method1906).rotationPitch);
                ((Entity) method1906).method1936(class5487);
                method1899.method6888((Entity) method1906);
            }
            this.removed = true;
            this.world.method6796().endSection();
            method1898.method6870();
            method1899.method6870();
            this.world.method6796().endSection();
            return (Entity) method1906;
        }
        return null;
    }

    public boolean method1855() {
        return true;
    }

    public float method1856(final Explosion explosion, final IBlockReader class6155, final BlockPos class6156, final BlockState class6157, final IFluidState class6158, final float n) {
        return n;
    }

    public boolean method1857(final Explosion explosion, final IBlockReader class6155, final BlockPos class6156, final BlockState class6157, final float n) {
        return true;
    }

    public int method1858() {
        return 3;
    }

    public Vec3d method1859() {
        return this.lastPortalVec;
    }

    public Direction method1860() {
        return this.teleportDirection;
    }

    public boolean method1861() {
        return false;
    }

    public void method1862(final CrashReportCategory class5204) {
        class5204.addDetail("Entity Type", () -> EntityType.method23354(this.getType()) + " (" + this.getClass().getCanonicalName() + ")");
        class5204.addDetail("Entity ID", this.entityId);
        class5204.addDetail("Entity Name", () -> this.getName().getString());
        class5204.addDetail("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.getPosX(), this.getPosY(), this.getPosZ()));
        class5204.addDetail("Entity's Block location", CrashReportCategory.method16295(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY()), MathHelper.floor(this.getPosZ())));
        final Vec3d method1935 = this.getMotion();
        class5204.addDetail("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", method1935.x, method1935.y, method1935.z));
        class5204.addDetail("Entity's Passengers", () -> this.method1908().toString());
        class5204.addDetail("Entity's Vehicle", () -> this.method1920().toString());
    }

    public boolean method1863() {
        return this.method1804() && !this.isSpectator();
    }

    public void method1864(final UUID field2457) {
        this.entityUniqueID = field2457;
        this.cachedUniqueIdString = this.entityUniqueID.toString();
    }

    public UUID method1865() {
        return this.entityUniqueID;
    }

    public String method1866() {
        return this.cachedUniqueIdString;
    }

    public String method1867() {
        return this.cachedUniqueIdString;
    }

    public boolean method1868() {
        return true;
    }

    public static double method1869() {
        return Entity.renderDistanceWeight;
    }

    public static void method1870(final double field2383) {
        Entity.renderDistanceWeight = field2383;
    }

    @Override
    public ITextComponent getDisplayName() {
        return Class6749.method20549(this.getTeam(), this.getName()).applyTextStyle(class8768 -> class8768.method30420(this.method1884()).method30421(this.method1866()));
    }

    public void method1872(final ITextComponent value) {
        this.dataManager.set(Entity.CUSTOM_NAME, Optional.ofNullable(value));
    }

    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return this.dataManager.get(Entity.CUSTOM_NAME).orElse(null);
    }

    @Override
    public boolean hasCustomName() {
        return this.dataManager.get(Entity.CUSTOM_NAME).isPresent();
    }

    public void method1875(final boolean b) {
        this.dataManager.set(Entity.CUSTOM_NAME_VISIBLE, b);
    }

    public boolean method1876() {
        return this.dataManager.get(Entity.CUSTOM_NAME_VISIBLE);
    }

    public final void method1877(final double n, final double n2, final double n3) {
        if (this.world instanceof Class1849) {
            final ChunkPos class7859 = new ChunkPos(new BlockPos(n, n2, n3));
            ((Class1849) this.world).method6904().method7441(Class9105.field38571, class7859, 0, this.getEntityId());
            this.world.method6686(class7859.field32290, class7859.field32291);
            this.method1878(n, n2, n3);
        }
    }

    public void method1878(final double n, final double n2, final double n3) {
        if (this.world instanceof Class1849) {
            final Class1849 class1849 = (Class1849) this.world;
            this.method1730(n, n2, n3, this.rotationYaw, this.rotationPitch);
            this.func_226276_cg_().forEach(class1851 -> {
                class1849.method6875(class1851);
                class1851.isPositionDirty = true;
                class1851.method1918(Entity::method1950);
            });
        }
    }

    public boolean method1879() {
        return this.method1876();
    }

    public void method1880(final DataParameter<?> class8810) {
        if (Entity.POSE.equals(class8810)) {
            this.method1881();
        }
    }

    public void method1881() {
        final EntitySize field2464 = this.size;
        final Pose method1654 = this.method1654();
        final EntitySize method1655 = this.method1933(method1654);
        this.size = method1655;
        this.eyeHeight = this.method1890(method1654, method1655);
        if (method1655.field34097 >= field2464.field34097) {
            final AxisAlignedBB method1656 = this.getBoundingBox();
            this.method1889(new AxisAlignedBB(method1656.minX, method1656.minY, method1656.minZ, method1656.minX + method1655.field34097, method1656.minY + method1655.field34098, method1656.minZ + method1655.field34097));
            if (method1655.field34097 > field2464.field34097) {
                if (!this.firstUpdate) {
                    if (!this.world.isRemote) {
                        final float n = field2464.field34097 - method1655.field34097;
                        this.method1671(Class2160.field12826, new Vec3d(n, 0.0, n));
                    }
                }
            }
        } else {
            final double n2 = method1655.field34097 / 2.0;
            this.method1889(new AxisAlignedBB(this.getPosX() - n2, this.getPosY(), this.getPosZ() - n2, this.getPosX() + n2, this.getPosY() + method1655.field34098, this.getPosZ() + n2));
        }
    }

    public Direction method1882() {
        return Direction.fromAngle(this.rotationYaw);
    }

    public Direction method1883() {
        return this.method1882();
    }

    public HoverEvent method1884() {
        final CompoundNBT class51 = new CompoundNBT();
        final ResourceLocation method23354 = EntityType.method23354(this.getType());
        class51.putString("id", this.method1866());
        if (method23354 != null) {
            class51.putString("type", method23354.toString());
        }
        class51.putString("name", Class5953.method17869(this.getName()));
        return new HoverEvent(HoverEvent.Action.field10699, new StringTextComponent(class51.toString()));
    }

    public boolean method1885(final Class513 class513) {
        return true;
    }

    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }

    public AxisAlignedBB method1887() {
        return this.getBoundingBox();
    }

    public AxisAlignedBB method1888(final Pose class290) {
        final EntitySize method1933 = this.method1933(class290);
        final float n = method1933.field34097 / 2.0f;
        return new AxisAlignedBB(new Vec3d(this.getPosX() - n, this.getPosY(), this.getPosZ() - n), new Vec3d(this.getPosX() + n, this.getPosY() + method1933.field34098, this.getPosZ() + n));
    }

    public void method1889(final AxisAlignedBB field2403) {
        this.boundingBox = field2403;
    }

    public float method1890(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.85f;
    }

    public float method1891(final Pose class290) {
        return this.method1890(class290, this.method1933(class290));
    }

    public final float method1892() {
        return this.eyeHeight;
    }

    public boolean method1893(final int n, final ItemStack class8321) {
        return false;
    }

    @Override
    public void sendMessage(final ITextComponent class2250) {
    }

    public BlockPos method1894() {
        return new BlockPos(this);
    }

    public Vec3d method1895() {
        return this.method1934();
    }

    public World method1896() {
        return this.world;
    }

    @Nullable
    public MinecraftServer method1897() {
        return this.world.getServer();
    }

    public Class2201 method1898(final PlayerEntity playerEntity, final Vec3d class513, final Class316 class514) {
        return Class2201.field13402;
    }

    public boolean method1899() {
        return false;
    }

    public void method1900(final LivingEntity class511, final Entity class512) {
        if (class512 instanceof LivingEntity) {
            Class8742.method30204((LivingEntity) class512, class511);
        }
        Class8742.method30205(class511, class512);
    }

    public void method1901(final Class513 class513) {
    }

    public void method1902(final Class513 class513) {
    }

    public float method1903(final Class2052 class2052) {
        final float method35668 = MathHelper.method35668(this.rotationYaw);
        switch (class2052.ordinal()) {
            case 1: {
                return method35668 + 180.0f;
            }
            case 2: {
                return method35668 + 270.0f;
            }
            case 3: {
                return method35668 + 90.0f;
            }
            default: {
                return method35668;
            }
        }
    }

    public float method1904(final Class2181 class2181) {
        final float method35668 = MathHelper.method35668(this.rotationYaw);
        switch (class2181.ordinal()) {
            case 1: {
                return -method35668;
            }
            case 2: {
                return 180.0f - method35668;
            }
            default: {
                return method35668;
            }
        }
    }

    public boolean method1905() {
        return false;
    }

    public boolean method1906() {
        final boolean field2461 = this.isPositionDirty;
        this.isPositionDirty = false;
        return field2461;
    }

    @Nullable
    public Entity method1907() {
        return null;
    }

    public List<Entity> method1908() {
        return this.passengers.isEmpty() ? Collections.emptyList() : Lists.newArrayList((Iterable) this.passengers);
    }

    public boolean method1909(final Entity class399) {
        final Iterator<Entity> iterator = this.method1908().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(class399)) {
                continue;
            }
            return true;
        }
        return false;
    }

    public boolean method1910(final Class<? extends Entity> clazz) {
        final Iterator<Entity> iterator = this.method1908().iterator();
        while (iterator.hasNext()) {
            if (!clazz.isAssignableFrom(iterator.next().getClass())) {
                continue;
            }
            return true;
        }
        return false;
    }

    public Collection<Entity> method1911() {
        final HashSet hashSet = Sets.newHashSet();
        for (final Entity class399 : this.method1908()) {
            hashSet.add(class399);
            class399.method1914(false, hashSet);
        }
        return hashSet;
    }

    public Stream<Entity> func_226276_cg_() {
        return Stream.concat(Stream.of(this), this.passengers.stream().flatMap(Entity::func_226276_cg_));
    }

    public boolean method1913() {
        final HashSet hashSet = Sets.newHashSet();
        this.method1914(true, hashSet);
        return hashSet.size() == 1;
    }

    private void method1914(final boolean b, final Set<Entity> set) {
        for (final Entity class399 : this.method1908()) {
            if (!b || Class513.class.isAssignableFrom(class399.getClass())) {
                set.add(class399);
            }
            class399.method1914(b, set);
        }
    }

    public Entity method1915() {
        Entity method1920;
        for (method1920 = this; method1920.isPassenger(); method1920 = method1920.method1920()) {
        }
        return method1920;
    }

    public boolean method1916(final Entity class399) {
        return this.method1915() == class399.method1915();
    }

    public boolean method1917(final Entity class399) {
        for (final Entity class400 : this.method1908()) {
            if (class400.equals(class399)) {
                return true;
            }
            if (!class400.method1917(class399)) {
                continue;
            }
            return true;
        }
        return false;
    }

    public void method1918(final Class9228 class9228) {
        final Iterator<Entity> iterator = this.passengers.iterator();
        while (iterator.hasNext()) {
            this.method1774(iterator.next(), class9228);
        }
    }

    public boolean method1919() {
        final Entity method1907 = this.method1907();
        if (!(method1907 instanceof PlayerEntity)) {
            return !this.world.isRemote;
        }
        return ((PlayerEntity) method1907).method2843();
    }

    @Nullable
    public Entity method1920() {
        return this.ridingEntity;
    }

    public PushReaction method1921() {
        return PushReaction.NORMAL;
    }

    public Class286 method1922() {
        return Class286.field1584;
    }

    public int method1923() {
        return 1;
    }

    public Class7492 method1924() {
        return new Class7492(this, this.method1934(), this.method1792(), (this.world instanceof Class1849) ? ((Class1849) this.world) : null, this.method1925(), this.getName().getString(), this.getDisplayName(), this.world.getServer(), this);
    }

    public int method1925() {
        return 0;
    }

    public boolean method1926(final int n) {
        return this.method1925() >= n;
    }

    @Override
    public boolean shouldReceiveFeedback() {
        return this.world.method6765().method31216(Class8878.field37328);
    }

    @Override
    public boolean shouldReceiveErrors() {
        return true;
    }

    @Override
    public boolean allowLogging() {
        return true;
    }

    public void method1927(final Class2042 class2042, final Vec3d class2043) {
        final Vec3d method8122 = class2042.method8122(this);
        final double n = class2043.x - method8122.x;
        final double n2 = class2043.y - method8122.y;
        final double n3 = class2043.z - method8122.z;
        this.rotationPitch = MathHelper.method35668((float) (-(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875)));
        this.method1845(this.rotationYaw = MathHelper.method35668((float) (MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f));
        this.prevRotationPitch = this.rotationPitch;
        this.prevRotationYaw = this.rotationYaw;
    }

    public boolean method1928(final Class7909<Fluid> class7909) {
        final AxisAlignedBB method18511 = this.getBoundingBox().shrink(0.001);
        final int method18512 = MathHelper.floor(method18511.minX);
        final int method18513 = MathHelper.ceil(method18511.maxX);
        final int method18514 = MathHelper.floor(method18511.minY);
        final int method18515 = MathHelper.ceil(method18511.maxY);
        final int method18516 = MathHelper.floor(method18511.minZ);
        final int method18517 = MathHelper.ceil(method18511.maxZ);
        if (!this.world.method6973(method18512, method18514, method18516, method18513, method18515, method18517)) {
            return false;
        }
        double max = 0.0;
        final boolean method18518 = this.method1868();
        boolean b = false;
        Vec3d class7910 = Vec3d.ZERO;
        int n = 0;
        try (final Class386 method18519 = Class386.method1296()) {
            for (int i = method18512; i < method18513; ++i) {
                for (int j = method18514; j < method18515; ++j) {
                    for (int k = method18516; k < method18517; ++k) {
                        method18519.method1300(i, j, k);
                        final IFluidState method18520 = this.world.getFluidState(method18519);
                        if (method18520.isTagged(class7909)) {
                            final double n2 = j + method18520.getActualHeight(this.world, method18519);
                            if (n2 >= method18511.minY) {
                                b = true;
                                max = Math.max(n2 - method18511.minY, max);
                                if (method18518) {
                                    Vec3d class7911 = method18520.getFlow(this.world, method18519);
                                    if (max < 0.4) {
                                        class7911 = class7911.scale(max);
                                    }
                                    class7910 = class7910.add(class7911);
                                    ++n;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (class7910.length() > 0.0) {
            if (n > 0) {
                class7910 = class7910.scale(1.0 / n);
            }
            if (!(this instanceof PlayerEntity)) {
                class7910 = class7910.normalize();
            }
            this.method1936(this.getMotion().add(class7910.scale(0.014)));
        }
        this.submergedHeight = max;
        return b;
    }

    public double method1929() {
        return this.submergedHeight;
    }

    public final float method1930() {
        return this.size.field34097;
    }

    public final float method1931() {
        return this.size.field34098;
    }

    public abstract IPacket<?> method1932();

    public EntitySize method1933(final Pose class290) {
        return this.type.getSize();
    }

    public Vec3d method1934() {
        return new Vec3d(this.posX, this.posY, this.posZ);
    }

    public Vec3d getMotion() {
        return this.motion;
    }

    public void method1936(final Vec3d field2398) {
        this.motion = field2398;
    }

    public void setMotion(final double n, final double n2, final double n3) {
        this.method1936(new Vec3d(n, n2, n3));
    }

    public final double getPosX() {
        return this.posX;
    }

    public double method1939(final double n) {
        return this.posX + this.method1930() * n;
    }

    public double method1940(final double n) {
        return this.method1939((2.0 * this.rand.nextDouble() - 1.0) * n);
    }

    public final double getPosY() {
        return this.posY;
    }

    public double method1942(final double n) {
        return this.posY + this.method1931() * n;
    }

    public double method1943() {
        return this.method1942(this.rand.nextDouble());
    }

    public double method1944() {
        return this.posY + this.eyeHeight;
    }

    public final double getPosZ() {
        return this.posZ;
    }

    public double method1946(final double n) {
        return this.posZ + this.method1930() * n;
    }

    public double method1947(final double n) {
        return this.method1946((2.0 * this.rand.nextDouble() - 1.0) * n);
    }

    public void method1948(final double field2395, final double field2396, final double field2397) {
        this.posX = field2395;
        this.posY = field2396;
        this.posZ = field2397;
    }

    public void method1949() {
    }

    public void method1950(final double n, final double n2, final double n3) {
        this.method1730(n, n2, n3, this.rotationYaw, this.rotationPitch);
    }

    static {
        LOGGER = LogManager.getLogger();
        NEXT_ENTITY_ID = new AtomicInteger();
        EMPTY_EQUIPMENT = Collections.emptyList();
        ZERO_AABB = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        Entity.renderDistanceWeight = 1.0;
        FLAGS = EntityDataManager.method33564(Entity.class, Class7709.field30653);
        AIR = EntityDataManager.method33564(Entity.class, Class7709.field30654);
        CUSTOM_NAME = EntityDataManager.method33564(Entity.class, Class7709.field30658);
        CUSTOM_NAME_VISIBLE = EntityDataManager.method33564(Entity.class, Class7709.field30661);
        SILENT = EntityDataManager.method33564(Entity.class, Class7709.field30661);
        NO_GRAVITY = EntityDataManager.method33564(Entity.class, Class7709.field30661);
        POSE = EntityDataManager.method33564(Entity.class, Class7709.field30671);
    }
}
