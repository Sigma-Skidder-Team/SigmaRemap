package net.minecraft.entity.item;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneDiodeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.commons.lang3.Validate;

public abstract class HangingEntity extends Entity
{
    protected static final Predicate<Entity> IS_HANGING_ENTITY = (p_210144_0_) ->
    {
        return p_210144_0_ instanceof HangingEntity;
    };
    private int tickCounter1;
    protected BlockPos hangingPosition;
    protected Direction facingDirection = Direction.SOUTH;

    protected HangingEntity(EntityType <? extends HangingEntity > p_i2765_1_, World p_i2765_2_)
    {
        super(p_i2765_1_, p_i2765_2_);
    }

    protected HangingEntity(EntityType <? extends HangingEntity > p_i2766_1_, World p_i2766_2_, BlockPos p_i2766_3_)
    {
        this(p_i2766_1_, p_i2766_2_);
        this.hangingPosition = p_i2766_3_;
    }

    protected void registerData()
    {
    }

    protected void updateFacingWithBoundingBox(Direction facingDirectionIn)
    {
        Validate.notNull(facingDirectionIn);
        Validate.isTrue(facingDirectionIn.getAxis().isHorizontal());
        this.facingDirection = facingDirectionIn;
        this.rotationYaw = (float)(this.facingDirection.getHorizontalIndex() * 90);
        this.prevRotationYaw = this.rotationYaw;
        this.updateBoundingBox();
    }

    protected void updateBoundingBox()
    {
        if (this.facingDirection != null)
        {
            double d0 = (double)this.hangingPosition.getX() + 0.5D;
            double d1 = (double)this.hangingPosition.getY() + 0.5D;
            double d2 = (double)this.hangingPosition.getZ() + 0.5D;
            double d3 = 0.46875D;
            double d4 = this.offs(this.getWidthPixels());
            double d5 = this.offs(this.getHeightPixels());
            d0 = d0 - (double)this.facingDirection.getXOffset() * 0.46875D;
            d2 = d2 - (double)this.facingDirection.getZOffset() * 0.46875D;
            d1 = d1 + d5;
            Direction direction = this.facingDirection.rotateYCCW();
            d0 = d0 + d4 * (double)direction.getXOffset();
            d2 = d2 + d4 * (double)direction.getZOffset();
            this.setRawPosition(d0, d1, d2);
            double d6 = (double)this.getWidthPixels();
            double d7 = (double)this.getHeightPixels();
            double d8 = (double)this.getWidthPixels();

            if (this.facingDirection.getAxis() == Direction.Axis.Z)
            {
                d8 = 1.0D;
            }
            else
            {
                d6 = 1.0D;
            }

            d6 = d6 / 32.0D;
            d7 = d7 / 32.0D;
            d8 = d8 / 32.0D;
            this.setBoundingBox(new AxisAlignedBB(d0 - d6, d1 - d7, d2 - d8, d0 + d6, d1 + d7, d2 + d8));
        }
    }

    private double offs(int p_190202_1_)
    {
        return p_190202_1_ % 32 == 0 ? 0.5D : 0.0D;
    }

    public void tick()
    {
        if (this.tickCounter1++ == 100 && !this.world.isRemote)
        {
            this.tickCounter1 = 0;

            if (!this.removed && !this.onValidSurface())
            {
                this.remove();
                this.onBroken((Entity)null);
            }
        }
    }

    public boolean onValidSurface()
    {
        if (!this.world.hasNoCollisions(this))
        {
            return false;
        }
        else
        {
            int i = Math.max(1, this.getWidthPixels() / 16);
            int j = Math.max(1, this.getHeightPixels() / 16);
            BlockPos blockpos = this.hangingPosition.offset(this.facingDirection.getOpposite());
            Direction direction = this.facingDirection.rotateYCCW();
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for (int k = 0; k < i; ++k)
            {
                for (int l = 0; l < j; ++l)
                {
                    int i1 = (i - 1) / -2;
                    int j1 = (j - 1) / -2;
                    blockpos$mutable.setPos(blockpos).move(direction, k + i1).move(Direction.UP, l + j1);
                    BlockState blockstate = this.world.getBlockState(blockpos$mutable);

                    if (!blockstate.getMaterial().isSolid() && !RedstoneDiodeBlock.isDiode(blockstate))
                    {
                        return false;
                    }
                }
            }

            return this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox(), IS_HANGING_ENTITY).isEmpty();
        }
    }

    public boolean canBeCollidedWith()
    {
        return true;
    }

    public boolean hitByEntity(Entity entityIn)
    {
        if (entityIn instanceof PlayerEntity)
        {
            PlayerEntity playerentity = (PlayerEntity)entityIn;
            return !this.world.isBlockModifiable(playerentity, this.hangingPosition) ? true : this.attackEntityFrom(DamageSource.causePlayerDamage(playerentity), 0.0F);
        }
        else
        {
            return false;
        }
    }

    public Direction getHorizontalFacing()
    {
        return this.facingDirection;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isInvulnerableTo(source))
        {
            return false;
        }
        else
        {
            if (!this.removed && !this.world.isRemote)
            {
                this.remove();
                this.markVelocityChanged();
                this.onBroken(source.getTrueSource());
            }

            return true;
        }
    }

    public void move(MoverType typeIn, Vec3d pos)
    {
        if (!this.world.isRemote && !this.removed && pos.lengthSquared() > 0.0D)
        {
            this.remove();
            this.onBroken((Entity)null);
        }
    }

    public void addVelocity(double x, double y, double z)
    {
        if (!this.world.isRemote && !this.removed && x * x + y * y + z * z > 0.0D)
        {
            this.remove();
            this.onBroken((Entity)null);
        }
    }

    public void writeAdditional(CompoundNBT compound)
    {
        compound.putByte("Facing", (byte)this.facingDirection.getHorizontalIndex());
        BlockPos blockpos = this.getHangingPosition();
        compound.putInt("TileX", blockpos.getX());
        compound.putInt("TileY", blockpos.getY());
        compound.putInt("TileZ", blockpos.getZ());
    }

    public void readAdditional(CompoundNBT compound)
    {
        this.hangingPosition = new BlockPos(compound.getInt("TileX"), compound.getInt("TileY"), compound.getInt("TileZ"));
        this.facingDirection = Direction.byHorizontalIndex(compound.getByte("Facing"));
    }

    public abstract int getWidthPixels();

    public abstract int getHeightPixels();

    public abstract void onBroken(@Nullable Entity brokenEntity);

    public abstract void playPlaceSound();

    public ItemEntity entityDropItem(ItemStack stack, float offsetY)
    {
        ItemEntity itementity = new ItemEntity(this.world, this.getPosX() + (double)((float)this.facingDirection.getXOffset() * 0.15F), this.getPosY() + (double)offsetY, this.getPosZ() + (double)((float)this.facingDirection.getZOffset() * 0.15F), stack);
        itementity.setDefaultPickupDelay();
        this.world.addEntity(itementity);
        return itementity;
    }

    protected boolean shouldSetPosAfterLoading()
    {
        return false;
    }

    public void setPosition(double x, double y, double z)
    {
        this.hangingPosition = new BlockPos(x, y, z);
        this.updateBoundingBox();
        this.isAirBorne = true;
    }

    public BlockPos getHangingPosition()
    {
        return this.hangingPosition;
    }

    public float getRotatedYaw(Rotation transformRotation)
    {
        if (this.facingDirection.getAxis() != Direction.Axis.Y)
        {
            switch (transformRotation)
            {
                case CLOCKWISE_180:
                    this.facingDirection = this.facingDirection.getOpposite();
                    break;

                case COUNTERCLOCKWISE_90:
                    this.facingDirection = this.facingDirection.rotateYCCW();
                    break;

                case CLOCKWISE_90:
                    this.facingDirection = this.facingDirection.rotateY();
            }
        }

        float f = MathHelper.wrapDegrees(this.rotationYaw);

        switch (transformRotation)
        {
            case CLOCKWISE_180:
                return f + 180.0F;

            case COUNTERCLOCKWISE_90:
                return f + 90.0F;

            case CLOCKWISE_90:
                return f + 270.0F;

            default:
                return f;
        }
    }

    public float getMirroredYaw(Mirror transformMirror)
    {
        return this.getRotatedYaw(transformMirror.toRotation(this.facingDirection));
    }

    public void onStruckByLightning(LightningBoltEntity lightningBolt)
    {
    }

    public void recalculateSize()
    {
    }
}
