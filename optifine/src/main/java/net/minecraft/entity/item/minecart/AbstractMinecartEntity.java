package net.minecraft.entity.item.minecart;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.passive.IronGolemEntity;
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
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Util;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public abstract class AbstractMinecartEntity extends Entity
{
    private static final DataParameter<Integer> ROLLING_AMPLITUDE = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> ROLLING_DIRECTION = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Float> DAMAGE = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.FLOAT);
    private static final DataParameter<Integer> DISPLAY_TILE = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> DISPLAY_TILE_OFFSET = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> SHOW_BLOCK = EntityDataManager.createKey(AbstractMinecartEntity.class, DataSerializers.BOOLEAN);
    private boolean isInReverse;
    private static final Map<RailShape, Pair<Vec3i, Vec3i>> MATRIX = Util.make(Maps.newEnumMap(RailShape.class), (p_226574_0_) ->
    {
        Vec3i vec3i = Direction.WEST.getDirectionVec();
        Vec3i vec3i1 = Direction.EAST.getDirectionVec();
        Vec3i vec3i2 = Direction.NORTH.getDirectionVec();
        Vec3i vec3i3 = Direction.SOUTH.getDirectionVec();
        Vec3i vec3i4 = vec3i.down();
        Vec3i vec3i5 = vec3i1.down();
        Vec3i vec3i6 = vec3i2.down();
        Vec3i vec3i7 = vec3i3.down();
        p_226574_0_.put(RailShape.NORTH_SOUTH, Pair.of(vec3i2, vec3i3));
        p_226574_0_.put(RailShape.EAST_WEST, Pair.of(vec3i, vec3i1));
        p_226574_0_.put(RailShape.ASCENDING_EAST, Pair.of(vec3i4, vec3i1));
        p_226574_0_.put(RailShape.ASCENDING_WEST, Pair.of(vec3i, vec3i5));
        p_226574_0_.put(RailShape.ASCENDING_NORTH, Pair.of(vec3i2, vec3i7));
        p_226574_0_.put(RailShape.ASCENDING_SOUTH, Pair.of(vec3i6, vec3i3));
        p_226574_0_.put(RailShape.SOUTH_EAST, Pair.of(vec3i3, vec3i1));
        p_226574_0_.put(RailShape.SOUTH_WEST, Pair.of(vec3i3, vec3i));
        p_226574_0_.put(RailShape.NORTH_WEST, Pair.of(vec3i2, vec3i));
        p_226574_0_.put(RailShape.NORTH_EAST, Pair.of(vec3i2, vec3i1));
    });
    private int turnProgress;
    private double minecartX;
    private double minecartY;
    private double minecartZ;
    private double minecartYaw;
    private double minecartPitch;
    private double velocityX;
    private double velocityY;
    private double velocityZ;

    protected AbstractMinecartEntity(EntityType<?> p_i2921_1_, World p_i2921_2_)
    {
        super(p_i2921_1_, p_i2921_2_);
        this.preventEntitySpawning = true;
    }

    protected AbstractMinecartEntity(EntityType<?> p_i2922_1_, World p_i2922_2_, double p_i2922_3_, double p_i2922_5_, double p_i2922_7_)
    {
        this(p_i2922_1_, p_i2922_2_);
        this.setPosition(p_i2922_3_, p_i2922_5_, p_i2922_7_);
        this.setMotion(Vec3d.ZERO);
        this.prevPosX = p_i2922_3_;
        this.prevPosY = p_i2922_5_;
        this.prevPosZ = p_i2922_7_;
    }

    public static AbstractMinecartEntity create(World worldIn, double x, double y, double z, AbstractMinecartEntity.Type typeIn)
    {
        if (typeIn == AbstractMinecartEntity.Type.CHEST)
        {
            return new ChestMinecartEntity(worldIn, x, y, z);
        }
        else if (typeIn == AbstractMinecartEntity.Type.FURNACE)
        {
            return new FurnaceMinecartEntity(worldIn, x, y, z);
        }
        else if (typeIn == AbstractMinecartEntity.Type.TNT)
        {
            return new TNTMinecartEntity(worldIn, x, y, z);
        }
        else if (typeIn == AbstractMinecartEntity.Type.SPAWNER)
        {
            return new SpawnerMinecartEntity(worldIn, x, y, z);
        }
        else if (typeIn == AbstractMinecartEntity.Type.HOPPER)
        {
            return new HopperMinecartEntity(worldIn, x, y, z);
        }
        else
        {
            return (AbstractMinecartEntity)(typeIn == AbstractMinecartEntity.Type.COMMAND_BLOCK ? new MinecartCommandBlockEntity(worldIn, x, y, z) : new MinecartEntity(worldIn, x, y, z));
        }
    }

    protected boolean canTriggerWalking()
    {
        return false;
    }

    protected void registerData()
    {
        this.dataManager.register(ROLLING_AMPLITUDE, 0);
        this.dataManager.register(ROLLING_DIRECTION, 1);
        this.dataManager.register(DAMAGE, 0.0F);
        this.dataManager.register(DISPLAY_TILE, Block.getStateId(Blocks.AIR.getDefaultState()));
        this.dataManager.register(DISPLAY_TILE_OFFSET, 6);
        this.dataManager.register(SHOW_BLOCK, false);
    }

    @Nullable
    public AxisAlignedBB getCollisionBox(Entity entityIn)
    {
        return entityIn.canBePushed() ? entityIn.getBoundingBox() : null;
    }

    public boolean canBePushed()
    {
        return true;
    }

    public double getMountedYOffset()
    {
        return 0.0D;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (!this.world.isRemote && !this.removed)
        {
            if (this.isInvulnerableTo(source))
            {
                return false;
            }
            else
            {
                this.setRollingDirection(-this.getRollingDirection());
                this.setRollingAmplitude(10);
                this.markVelocityChanged();
                this.setDamage(this.getDamage() + amount * 10.0F);
                boolean flag = source.getTrueSource() instanceof PlayerEntity && ((PlayerEntity)source.getTrueSource()).abilities.isCreativeMode;

                if (flag || this.getDamage() > 40.0F)
                {
                    this.removePassengers();

                    if (flag && !this.hasCustomName())
                    {
                        this.remove();
                    }
                    else
                    {
                        this.killMinecart(source);
                    }
                }

                return true;
            }
        }
        else
        {
            return true;
        }
    }

    public void killMinecart(DamageSource source)
    {
        this.remove();

        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS))
        {
            ItemStack itemstack = new ItemStack(Items.MINECART);

            if (this.hasCustomName())
            {
                itemstack.setDisplayName(this.getCustomName());
            }

            this.entityDropItem(itemstack);
        }
    }

    public void performHurtAnimation()
    {
        this.setRollingDirection(-this.getRollingDirection());
        this.setRollingAmplitude(10);
        this.setDamage(this.getDamage() + this.getDamage() * 10.0F);
    }

    public boolean canBeCollidedWith()
    {
        return !this.removed;
    }

    private static Pair<Vec3i, Vec3i> func_226573_a_(RailShape p_226573_0_)
    {
        return MATRIX.get(p_226573_0_);
    }

    public Direction getAdjustedHorizontalFacing()
    {
        return this.isInReverse ? this.getHorizontalFacing().getOpposite().rotateY() : this.getHorizontalFacing().rotateY();
    }

    public void tick()
    {
        if (this.getRollingAmplitude() > 0)
        {
            this.setRollingAmplitude(this.getRollingAmplitude() - 1);
        }

        if (this.getDamage() > 0.0F)
        {
            this.setDamage(this.getDamage() - 1.0F);
        }

        if (this.getPosY() < -64.0D)
        {
            this.outOfWorld();
        }

        this.updatePortal();

        if (this.world.isRemote)
        {
            if (this.turnProgress > 0)
            {
                double d4 = this.getPosX() + (this.minecartX - this.getPosX()) / (double)this.turnProgress;
                double d5 = this.getPosY() + (this.minecartY - this.getPosY()) / (double)this.turnProgress;
                double d6 = this.getPosZ() + (this.minecartZ - this.getPosZ()) / (double)this.turnProgress;
                double d1 = MathHelper.wrapDegrees(this.minecartYaw - (double)this.rotationYaw);
                this.rotationYaw = (float)((double)this.rotationYaw + d1 / (double)this.turnProgress);
                this.rotationPitch = (float)((double)this.rotationPitch + (this.minecartPitch - (double)this.rotationPitch) / (double)this.turnProgress);
                --this.turnProgress;
                this.setPosition(d4, d5, d6);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            }
            else
            {
                this.recenterBoundingBox();
                this.setRotation(this.rotationYaw, this.rotationPitch);
            }
        }
        else
        {
            if (!this.hasNoGravity())
            {
                this.setMotion(this.getMotion().add(0.0D, -0.04D, 0.0D));
            }

            int i = MathHelper.floor(this.getPosX());
            int j = MathHelper.floor(this.getPosY());
            int k = MathHelper.floor(this.getPosZ());

            if (this.world.getBlockState(new BlockPos(i, j - 1, k)).isIn(BlockTags.RAILS))
            {
                --j;
            }

            BlockPos blockpos = new BlockPos(i, j, k);
            BlockState blockstate = this.world.getBlockState(blockpos);

            if (blockstate.isIn(BlockTags.RAILS))
            {
                this.moveAlongTrack(blockpos, blockstate);

                if (blockstate.getBlock() == Blocks.ACTIVATOR_RAIL)
                {
                    this.onActivatorRailPass(i, j, k, blockstate.get(PoweredRailBlock.POWERED));
                }
            }
            else
            {
                this.moveDerailedMinecart();
            }

            this.doBlockCollisions();
            this.rotationPitch = 0.0F;
            double d0 = this.prevPosX - this.getPosX();
            double d2 = this.prevPosZ - this.getPosZ();

            if (d0 * d0 + d2 * d2 > 0.001D)
            {
                this.rotationYaw = (float)(MathHelper.atan2(d2, d0) * 180.0D / Math.PI);

                if (this.isInReverse)
                {
                    this.rotationYaw += 180.0F;
                }
            }

            double d3 = (double)MathHelper.wrapDegrees(this.rotationYaw - this.prevRotationYaw);

            if (d3 < -170.0D || d3 >= 170.0D)
            {
                this.rotationYaw += 180.0F;
                this.isInReverse = !this.isInReverse;
            }

            this.setRotation(this.rotationYaw, this.rotationPitch);

            if (this.getMinecartType() == AbstractMinecartEntity.Type.RIDEABLE && horizontalMag(this.getMotion()) > 0.01D)
            {
                List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox().grow((double)0.2F, 0.0D, (double)0.2F), EntityPredicates.pushableBy(this));

                if (!list.isEmpty())
                {
                    for (int l = 0; l < list.size(); ++l)
                    {
                        Entity entity1 = list.get(l);

                        if (!(entity1 instanceof PlayerEntity) && !(entity1 instanceof IronGolemEntity) && !(entity1 instanceof AbstractMinecartEntity) && !this.isBeingRidden() && !entity1.isPassenger())
                        {
                            entity1.startRiding(this);
                        }
                        else
                        {
                            entity1.applyEntityCollision(this);
                        }
                    }
                }
            }
            else
            {
                for (Entity entity : this.world.getEntitiesWithinAABBExcludingEntity(this, this.getBoundingBox().grow((double)0.2F, 0.0D, (double)0.2F)))
                {
                    if (!this.isPassenger(entity) && entity.canBePushed() && entity instanceof AbstractMinecartEntity)
                    {
                        entity.applyEntityCollision(this);
                    }
                }
            }

            this.handleWaterMovement();
        }
    }

    protected double getMaximumSpeed()
    {
        return 0.4D;
    }

    public void onActivatorRailPass(int x, int y, int z, boolean receivingPower)
    {
    }

    protected void moveDerailedMinecart()
    {
        double d0 = this.getMaximumSpeed();
        Vec3d vec3d = this.getMotion();
        this.setMotion(MathHelper.clamp(vec3d.x, -d0, d0), vec3d.y, MathHelper.clamp(vec3d.z, -d0, d0));

        if (this.onGround)
        {
            this.setMotion(this.getMotion().scale(0.5D));
        }

        this.move(MoverType.SELF, this.getMotion());

        if (!this.onGround)
        {
            this.setMotion(this.getMotion().scale(0.95D));
        }
    }

    protected void moveAlongTrack(BlockPos pos, BlockState state)
    {
        this.fallDistance = 0.0F;
        double d0 = this.getPosX();
        double d1 = this.getPosY();
        double d2 = this.getPosZ();
        Vec3d vec3d = this.getPos(d0, d1, d2);
        d1 = (double)pos.getY();
        boolean flag = false;
        boolean flag1 = false;
        AbstractRailBlock abstractrailblock = (AbstractRailBlock)state.getBlock();

        if (abstractrailblock == Blocks.POWERED_RAIL)
        {
            flag = state.get(PoweredRailBlock.POWERED);
            flag1 = !flag;
        }

        double d3 = 0.0078125D;
        Vec3d vec3d1 = this.getMotion();
        RailShape railshape = state.get(abstractrailblock.getShapeProperty());

        switch (railshape)
        {
            case ASCENDING_EAST:
                this.setMotion(vec3d1.add(-0.0078125D, 0.0D, 0.0D));
                ++d1;
                break;

            case ASCENDING_WEST:
                this.setMotion(vec3d1.add(0.0078125D, 0.0D, 0.0D));
                ++d1;
                break;

            case ASCENDING_NORTH:
                this.setMotion(vec3d1.add(0.0D, 0.0D, 0.0078125D));
                ++d1;
                break;

            case ASCENDING_SOUTH:
                this.setMotion(vec3d1.add(0.0D, 0.0D, -0.0078125D));
                ++d1;
        }

        vec3d1 = this.getMotion();
        Pair<Vec3i, Vec3i> pair = func_226573_a_(railshape);
        Vec3i vec3i = pair.getFirst();
        Vec3i vec3i1 = pair.getSecond();
        double d4 = (double)(vec3i1.getX() - vec3i.getX());
        double d5 = (double)(vec3i1.getZ() - vec3i.getZ());
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        double d7 = vec3d1.x * d4 + vec3d1.z * d5;

        if (d7 < 0.0D)
        {
            d4 = -d4;
            d5 = -d5;
        }

        double d8 = Math.min(2.0D, Math.sqrt(horizontalMag(vec3d1)));
        vec3d1 = new Vec3d(d8 * d4 / d6, vec3d1.y, d8 * d5 / d6);
        this.setMotion(vec3d1);
        Entity entity = this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);

        if (entity instanceof PlayerEntity)
        {
            Vec3d vec3d2 = entity.getMotion();
            double d9 = horizontalMag(vec3d2);
            double d11 = horizontalMag(this.getMotion());

            if (d9 > 1.0E-4D && d11 < 0.01D)
            {
                this.setMotion(this.getMotion().add(vec3d2.x * 0.1D, 0.0D, vec3d2.z * 0.1D));
                flag1 = false;
            }
        }

        if (flag1)
        {
            double d22 = Math.sqrt(horizontalMag(this.getMotion()));

            if (d22 < 0.03D)
            {
                this.setMotion(Vec3d.ZERO);
            }
            else
            {
                this.setMotion(this.getMotion().mul(0.5D, 0.0D, 0.5D));
            }
        }

        double d23 = (double)pos.getX() + 0.5D + (double)vec3i.getX() * 0.5D;
        double d10 = (double)pos.getZ() + 0.5D + (double)vec3i.getZ() * 0.5D;
        double d12 = (double)pos.getX() + 0.5D + (double)vec3i1.getX() * 0.5D;
        double d13 = (double)pos.getZ() + 0.5D + (double)vec3i1.getZ() * 0.5D;
        d4 = d12 - d23;
        d5 = d13 - d10;
        double d14;

        if (d4 == 0.0D)
        {
            d14 = d2 - (double)pos.getZ();
        }
        else if (d5 == 0.0D)
        {
            d14 = d0 - (double)pos.getX();
        }
        else
        {
            double d15 = d0 - d23;
            double d16 = d2 - d10;
            d14 = (d15 * d4 + d16 * d5) * 2.0D;
        }

        d0 = d23 + d4 * d14;
        d2 = d10 + d5 * d14;
        this.setPosition(d0, d1, d2);
        double d24 = this.isBeingRidden() ? 0.75D : 1.0D;
        double d25 = this.getMaximumSpeed();
        vec3d1 = this.getMotion();
        this.move(MoverType.SELF, new Vec3d(MathHelper.clamp(d24 * vec3d1.x, -d25, d25), 0.0D, MathHelper.clamp(d24 * vec3d1.z, -d25, d25)));

        if (vec3i.getY() != 0 && MathHelper.floor(this.getPosX()) - pos.getX() == vec3i.getX() && MathHelper.floor(this.getPosZ()) - pos.getZ() == vec3i.getZ())
        {
            this.setPosition(this.getPosX(), this.getPosY() + (double)vec3i.getY(), this.getPosZ());
        }
        else if (vec3i1.getY() != 0 && MathHelper.floor(this.getPosX()) - pos.getX() == vec3i1.getX() && MathHelper.floor(this.getPosZ()) - pos.getZ() == vec3i1.getZ())
        {
            this.setPosition(this.getPosX(), this.getPosY() + (double)vec3i1.getY(), this.getPosZ());
        }

        this.applyDrag();
        Vec3d vec3d3 = this.getPos(this.getPosX(), this.getPosY(), this.getPosZ());

        if (vec3d3 != null && vec3d != null)
        {
            double d17 = (vec3d.y - vec3d3.y) * 0.05D;
            Vec3d vec3d4 = this.getMotion();
            double d18 = Math.sqrt(horizontalMag(vec3d4));

            if (d18 > 0.0D)
            {
                this.setMotion(vec3d4.mul((d18 + d17) / d18, 1.0D, (d18 + d17) / d18));
            }

            this.setPosition(this.getPosX(), vec3d3.y, this.getPosZ());
        }

        int j = MathHelper.floor(this.getPosX());
        int i = MathHelper.floor(this.getPosZ());

        if (j != pos.getX() || i != pos.getZ())
        {
            Vec3d vec3d5 = this.getMotion();
            double d26 = Math.sqrt(horizontalMag(vec3d5));
            this.setMotion(d26 * (double)(j - pos.getX()), vec3d5.y, d26 * (double)(i - pos.getZ()));
        }

        if (flag)
        {
            Vec3d vec3d6 = this.getMotion();
            double d27 = Math.sqrt(horizontalMag(vec3d6));

            if (d27 > 0.01D)
            {
                double d19 = 0.06D;
                this.setMotion(vec3d6.add(vec3d6.x / d27 * 0.06D, 0.0D, vec3d6.z / d27 * 0.06D));
            }
            else
            {
                Vec3d vec3d7 = this.getMotion();
                double d20 = vec3d7.x;
                double d21 = vec3d7.z;

                if (railshape == RailShape.EAST_WEST)
                {
                    if (this.func_213900_a(pos.west()))
                    {
                        d20 = 0.02D;
                    }
                    else if (this.func_213900_a(pos.east()))
                    {
                        d20 = -0.02D;
                    }
                }
                else
                {
                    if (railshape != RailShape.NORTH_SOUTH)
                    {
                        return;
                    }

                    if (this.func_213900_a(pos.north()))
                    {
                        d21 = 0.02D;
                    }
                    else if (this.func_213900_a(pos.south()))
                    {
                        d21 = -0.02D;
                    }
                }

                this.setMotion(d20, vec3d7.y, d21);
            }
        }
    }

    private boolean func_213900_a(BlockPos p_213900_1_)
    {
        return this.world.getBlockState(p_213900_1_).isNormalCube(this.world, p_213900_1_);
    }

    protected void applyDrag()
    {
        double d0 = this.isBeingRidden() ? 0.997D : 0.96D;
        this.setMotion(this.getMotion().mul(d0, 0.0D, d0));
    }

    @Nullable
    public Vec3d getPosOffset(double x, double y, double z, double offset)
    {
        int i = MathHelper.floor(x);
        int j = MathHelper.floor(y);
        int k = MathHelper.floor(z);

        if (this.world.getBlockState(new BlockPos(i, j - 1, k)).isIn(BlockTags.RAILS))
        {
            --j;
        }

        BlockState blockstate = this.world.getBlockState(new BlockPos(i, j, k));

        if (blockstate.isIn(BlockTags.RAILS))
        {
            RailShape railshape = blockstate.get(((AbstractRailBlock)blockstate.getBlock()).getShapeProperty());
            y = (double)j;

            if (railshape.isAscending())
            {
                y = (double)(j + 1);
            }

            Pair<Vec3i, Vec3i> pair = func_226573_a_(railshape);
            Vec3i vec3i = pair.getFirst();
            Vec3i vec3i1 = pair.getSecond();
            double d0 = (double)(vec3i1.getX() - vec3i.getX());
            double d1 = (double)(vec3i1.getZ() - vec3i.getZ());
            double d2 = Math.sqrt(d0 * d0 + d1 * d1);
            d0 = d0 / d2;
            d1 = d1 / d2;
            x = x + d0 * offset;
            z = z + d1 * offset;

            if (vec3i.getY() != 0 && MathHelper.floor(x) - i == vec3i.getX() && MathHelper.floor(z) - k == vec3i.getZ())
            {
                y += (double)vec3i.getY();
            }
            else if (vec3i1.getY() != 0 && MathHelper.floor(x) - i == vec3i1.getX() && MathHelper.floor(z) - k == vec3i1.getZ())
            {
                y += (double)vec3i1.getY();
            }

            return this.getPos(x, y, z);
        }
        else
        {
            return null;
        }
    }

    @Nullable
    public Vec3d getPos(double p_70489_1_, double p_70489_3_, double p_70489_5_)
    {
        int i = MathHelper.floor(p_70489_1_);
        int j = MathHelper.floor(p_70489_3_);
        int k = MathHelper.floor(p_70489_5_);

        if (this.world.getBlockState(new BlockPos(i, j - 1, k)).isIn(BlockTags.RAILS))
        {
            --j;
        }

        BlockState blockstate = this.world.getBlockState(new BlockPos(i, j, k));

        if (blockstate.isIn(BlockTags.RAILS))
        {
            RailShape railshape = blockstate.get(((AbstractRailBlock)blockstate.getBlock()).getShapeProperty());
            Pair<Vec3i, Vec3i> pair = func_226573_a_(railshape);
            Vec3i vec3i = pair.getFirst();
            Vec3i vec3i1 = pair.getSecond();
            double d0 = (double)i + 0.5D + (double)vec3i.getX() * 0.5D;
            double d1 = (double)j + 0.0625D + (double)vec3i.getY() * 0.5D;
            double d2 = (double)k + 0.5D + (double)vec3i.getZ() * 0.5D;
            double d3 = (double)i + 0.5D + (double)vec3i1.getX() * 0.5D;
            double d4 = (double)j + 0.0625D + (double)vec3i1.getY() * 0.5D;
            double d5 = (double)k + 0.5D + (double)vec3i1.getZ() * 0.5D;
            double d6 = d3 - d0;
            double d7 = (d4 - d1) * 2.0D;
            double d8 = d5 - d2;
            double d9;

            if (d6 == 0.0D)
            {
                d9 = p_70489_5_ - (double)k;
            }
            else if (d8 == 0.0D)
            {
                d9 = p_70489_1_ - (double)i;
            }
            else
            {
                double d10 = p_70489_1_ - d0;
                double d11 = p_70489_5_ - d2;
                d9 = (d10 * d6 + d11 * d8) * 2.0D;
            }

            p_70489_1_ = d0 + d6 * d9;
            p_70489_3_ = d1 + d7 * d9;
            p_70489_5_ = d2 + d8 * d9;

            if (d7 < 0.0D)
            {
                ++p_70489_3_;
            }
            else if (d7 > 0.0D)
            {
                p_70489_3_ += 0.5D;
            }

            return new Vec3d(p_70489_1_, p_70489_3_, p_70489_5_);
        }
        else
        {
            return null;
        }
    }

    public AxisAlignedBB getRenderBoundingBox()
    {
        AxisAlignedBB axisalignedbb = this.getBoundingBox();
        return this.hasDisplayTile() ? axisalignedbb.grow((double)Math.abs(this.getDisplayTileOffset()) / 16.0D) : axisalignedbb;
    }

    protected void readAdditional(CompoundNBT compound)
    {
        if (compound.getBoolean("CustomDisplayTile"))
        {
            this.setDisplayTile(NBTUtil.readBlockState(compound.getCompound("DisplayState")));
            this.setDisplayTileOffset(compound.getInt("DisplayOffset"));
        }
    }

    protected void writeAdditional(CompoundNBT compound)
    {
        if (this.hasDisplayTile())
        {
            compound.putBoolean("CustomDisplayTile", true);
            compound.put("DisplayState", NBTUtil.writeBlockState(this.getDisplayTile()));
            compound.putInt("DisplayOffset", this.getDisplayTileOffset());
        }
    }

    public void applyEntityCollision(Entity entityIn)
    {
        if (!this.world.isRemote)
        {
            if (!entityIn.noClip && !this.noClip)
            {
                if (!this.isPassenger(entityIn))
                {
                    double d0 = entityIn.getPosX() - this.getPosX();
                    double d1 = entityIn.getPosZ() - this.getPosZ();
                    double d2 = d0 * d0 + d1 * d1;

                    if (d2 >= (double)1.0E-4F)
                    {
                        d2 = (double)MathHelper.sqrt(d2);
                        d0 = d0 / d2;
                        d1 = d1 / d2;
                        double d3 = 1.0D / d2;

                        if (d3 > 1.0D)
                        {
                            d3 = 1.0D;
                        }

                        d0 = d0 * d3;
                        d1 = d1 * d3;
                        d0 = d0 * (double)0.1F;
                        d1 = d1 * (double)0.1F;
                        d0 = d0 * (double)(1.0F - this.entityCollisionReduction);
                        d1 = d1 * (double)(1.0F - this.entityCollisionReduction);
                        d0 = d0 * 0.5D;
                        d1 = d1 * 0.5D;

                        if (entityIn instanceof AbstractMinecartEntity)
                        {
                            double d4 = entityIn.getPosX() - this.getPosX();
                            double d5 = entityIn.getPosZ() - this.getPosZ();
                            Vec3d vec3d = (new Vec3d(d4, 0.0D, d5)).normalize();
                            Vec3d vec3d1 = (new Vec3d((double)MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F)), 0.0D, (double)MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F)))).normalize();
                            double d6 = Math.abs(vec3d.dotProduct(vec3d1));

                            if (d6 < (double)0.8F)
                            {
                                return;
                            }

                            Vec3d vec3d2 = this.getMotion();
                            Vec3d vec3d3 = entityIn.getMotion();

                            if (((AbstractMinecartEntity)entityIn).getMinecartType() == AbstractMinecartEntity.Type.FURNACE && this.getMinecartType() != AbstractMinecartEntity.Type.FURNACE)
                            {
                                this.setMotion(vec3d2.mul(0.2D, 1.0D, 0.2D));
                                this.addVelocity(vec3d3.x - d0, 0.0D, vec3d3.z - d1);
                                entityIn.setMotion(vec3d3.mul(0.95D, 1.0D, 0.95D));
                            }
                            else if (((AbstractMinecartEntity)entityIn).getMinecartType() != AbstractMinecartEntity.Type.FURNACE && this.getMinecartType() == AbstractMinecartEntity.Type.FURNACE)
                            {
                                entityIn.setMotion(vec3d3.mul(0.2D, 1.0D, 0.2D));
                                entityIn.addVelocity(vec3d2.x + d0, 0.0D, vec3d2.z + d1);
                                this.setMotion(vec3d2.mul(0.95D, 1.0D, 0.95D));
                            }
                            else
                            {
                                double d7 = (vec3d3.x + vec3d2.x) / 2.0D;
                                double d8 = (vec3d3.z + vec3d2.z) / 2.0D;
                                this.setMotion(vec3d2.mul(0.2D, 1.0D, 0.2D));
                                this.addVelocity(d7 - d0, 0.0D, d8 - d1);
                                entityIn.setMotion(vec3d3.mul(0.2D, 1.0D, 0.2D));
                                entityIn.addVelocity(d7 + d0, 0.0D, d8 + d1);
                            }
                        }
                        else
                        {
                            this.addVelocity(-d0, 0.0D, -d1);
                            entityIn.addVelocity(d0 / 4.0D, 0.0D, d1 / 4.0D);
                        }
                    }
                }
            }
        }
    }

    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
        this.minecartX = x;
        this.minecartY = y;
        this.minecartZ = z;
        this.minecartYaw = (double)yaw;
        this.minecartPitch = (double)pitch;
        this.turnProgress = posRotationIncrements + 2;
        this.setMotion(this.velocityX, this.velocityY, this.velocityZ);
    }

    public void setVelocity(double x, double y, double z)
    {
        this.velocityX = x;
        this.velocityY = y;
        this.velocityZ = z;
        this.setMotion(this.velocityX, this.velocityY, this.velocityZ);
    }

    public void setDamage(float damage)
    {
        this.dataManager.set(DAMAGE, damage);
    }

    public float getDamage()
    {
        return this.dataManager.get(DAMAGE);
    }

    public void setRollingAmplitude(int rollingAmplitude)
    {
        this.dataManager.set(ROLLING_AMPLITUDE, rollingAmplitude);
    }

    public int getRollingAmplitude()
    {
        return this.dataManager.get(ROLLING_AMPLITUDE);
    }

    public void setRollingDirection(int rollingDirection)
    {
        this.dataManager.set(ROLLING_DIRECTION, rollingDirection);
    }

    public int getRollingDirection()
    {
        return this.dataManager.get(ROLLING_DIRECTION);
    }

    public abstract AbstractMinecartEntity.Type getMinecartType();

    public BlockState getDisplayTile()
    {
        return !this.hasDisplayTile() ? this.getDefaultDisplayTile() : Block.getStateById(this.getDataManager().get(DISPLAY_TILE));
    }

    public BlockState getDefaultDisplayTile()
    {
        return Blocks.AIR.getDefaultState();
    }

    public int getDisplayTileOffset()
    {
        return !this.hasDisplayTile() ? this.getDefaultDisplayTileOffset() : this.getDataManager().get(DISPLAY_TILE_OFFSET);
    }

    public int getDefaultDisplayTileOffset()
    {
        return 6;
    }

    public void setDisplayTile(BlockState displayTile)
    {
        this.getDataManager().set(DISPLAY_TILE, Block.getStateId(displayTile));
        this.setHasDisplayTile(true);
    }

    public void setDisplayTileOffset(int displayTileOffset)
    {
        this.getDataManager().set(DISPLAY_TILE_OFFSET, displayTileOffset);
        this.setHasDisplayTile(true);
    }

    public boolean hasDisplayTile()
    {
        return this.getDataManager().get(SHOW_BLOCK);
    }

    public void setHasDisplayTile(boolean showBlock)
    {
        this.getDataManager().set(SHOW_BLOCK, showBlock);
    }

    public IPacket<?> createSpawnPacket()
    {
        return new SSpawnObjectPacket(this);
    }

    public static enum Type
    {
        RIDEABLE,
        CHEST,
        FURNACE,
        TNT,
        SPAWNER,
        HOPPER,
        COMMAND_BLOCK;
    }
}
