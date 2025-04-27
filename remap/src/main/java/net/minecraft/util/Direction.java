// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.Locale;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import mapped.*;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.Vector4f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

import java.util.Map;

public enum Direction implements IStringSerializable
{
    DOWN(0, 1, -1, "down", AxisDirection.NEGATIVE, Axis.Y, new Vec3i(0, -1, 0)),
    UP(1, 0, -1, "up", AxisDirection.POSITIVE, Axis.Y, new Vec3i(0, 1, 0)),
    NORTH(2, 3, 2, "north", AxisDirection.NEGATIVE, Axis.Z, new Vec3i(0, 0, -1)),
    SOUTH(3, 2, 0, "south", AxisDirection.POSITIVE, Axis.Z, new Vec3i(0, 0, 1)),
    WEST(4, 5, 1, "west", AxisDirection.NEGATIVE, Axis.X, new Vec3i(-1, 0, 0)),
    EAST(5, 4, 3, "east", AxisDirection.POSITIVE, Axis.X, new Vec3i(1, 0, 0));
    
    private final int index;
    private final int opposite;
    private final int horizontalIndex;
    private final String name;
    private final Axis axis;
    private final AxisDirection axisDirection;
    private final Vec3i directionVec;
    public static final Direction[] VALUES = values();
    private static final Map<String, Direction> NAME_LOOKUP = Arrays.stream(VALUES).collect(Collectors.toMap(Direction::getName2, (p_lambda$static$0_0_) -> {
        return p_lambda$static$0_0_;
    }));
    public static final Direction[] BY_INDEX = Arrays.stream(VALUES).sorted(Comparator.comparingInt((p_lambda$static$1_0_) -> {
        return p_lambda$static$1_0_.index;
    })).toArray((p_lambda$static$2_0_) -> {
        return new Direction[p_lambda$static$2_0_];
    });
    private static final Direction[] BY_HORIZONTAL_INDEX = Arrays.stream(VALUES).filter((p_lambda$static$3_0_) -> {
        return p_lambda$static$3_0_.getAxis().isHorizontal();
    }).sorted(Comparator.comparingInt((p_lambda$static$4_0_) -> {
        return p_lambda$static$4_0_.horizontalIndex;
    })).toArray((p_lambda$static$5_0_) -> {
        return new Direction[p_lambda$static$5_0_];
    });
    private static final Long2ObjectMap<Direction> BY_LONG = Arrays.stream(VALUES).collect(Collectors.toMap((p_lambda$static$6_0_) -> {
        return (new BlockPos(p_lambda$static$6_0_.getDirectionVec())).toLong();
    }, (p_lambda$static$7_0_) -> {
        return p_lambda$static$7_0_;
    }, (p_lambda$static$8_0_, p_lambda$static$8_1_) -> {
        throw new IllegalArgumentException("Duplicate keys");
    }, Long2ObjectOpenHashMap::new));
    
    Direction(final int index, final int opposite, final int horizontalIndex, final String name, final AxisDirection axisDirection, final Axis axis, final Vec3i directionVec) {
        this.index = index;
        this.horizontalIndex = horizontalIndex;
        this.opposite = opposite;
        this.name = name;
        this.axis = axis;
        this.axisDirection = axisDirection;
        this.directionVec = directionVec;
    }
    
    public static Direction[] getFacingDirections(final Entity entityIn) {
        final float f = entityIn.getPitch(1.0f) * 0.017453292f;
        final float f1 = -entityIn.getYaw(1.0f) * 0.017453292f;
        final float f2 = MathHelper.sin(f);
        final float f3 = MathHelper.cos(f);
        final float f4 = MathHelper.sin(f1);
        final float f5 = MathHelper.cos(f1);
        final boolean flag = f4 > 0.0f;
        final boolean flag1 = f2 < 0.0f;
        final boolean flag2 = f5 > 0.0f;
        final float f6 = flag ? f4 : (-f4);
        final float f7 = flag1 ? (-f2) : f2;
        final float f8 = flag2 ? f5 : (-f5);
        final float f9 = f6 * f3;
        final float f10 = f8 * f3;
        final Direction direction = flag ? Direction.EAST : Direction.WEST;
        final Direction direction1 = flag1 ? Direction.UP : Direction.DOWN;
        final Direction direction2 = flag2 ? Direction.SOUTH : Direction.NORTH;
        if (f6 <= f8) {
            if (f7 <= f10) {
                return (f9 <= f7) ? compose(direction2, direction1, direction) : compose(direction2, direction, direction1);
            }
            return compose(direction1, direction2, direction);
        }
        else {
            if (f7 <= f9) {
                return (f10 <= f7) ? compose(direction, direction1, direction2) : compose(direction, direction2, direction1);
            }
            return compose(direction1, direction, direction2);
        }
    }

    private static Direction[] compose(Direction first, Direction second, Direction third)
    {
        return new Direction[] {first, second, third, third.getOpposite(), second.getOpposite(), first.getOpposite()};
    }
    
    public static Direction rotateFace(final Matrix4f class6789, final Direction class6790) {
        final Vec3i method802 = class6790.getDirectionVec();
        final Vector4f class6791 = new Vector4f((float)method802.getX(), (float)method802.getY(), (float)method802.getZ(), 0.0f);
        class6791.method28603(class6789);
        return getFacingFromVector(class6791.method28595(), class6791.method28596(), class6791.method28597());
    }
    
    public Quaternion getRotation() {
        final Quaternion quaternion = Vector3f.XP.rotationDegrees(90.0f);
        switch (this) {
            case DOWN:
                return Vector3f.XP.rotationDegrees(180.0F);
            case UP:
                return Quaternion.ONE.copy();

            case NORTH:
                quaternion.multiply(Vector3f.ZP.rotationDegrees(180.0F));
                return quaternion;

            case SOUTH:
                return quaternion;

            case WEST:
                quaternion.multiply(Vector3f.ZP.rotationDegrees(90.0F));
                return quaternion;

            case EAST:
            default:
                quaternion.multiply(Vector3f.ZP.rotationDegrees(-90.0F));
                return quaternion;
        }
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getHorizontalIndex() {
        return this.horizontalIndex;
    }
    
    public AxisDirection getAxisDirection() {
        return this.axisDirection;
    }
    
    public Direction getOpposite() {
        return Direction.VALUES[this.opposite];
    }
    
    public Direction rotateY() {
        switch (this)
        {
            case NORTH:
                return EAST;

            case SOUTH:
                return WEST;

            case WEST:
                return NORTH;

            case EAST:
                return SOUTH;

            default:
                throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
        }
    }
    
    public Direction method784() {
        switch (this)
        {
            case NORTH:
                return WEST;

            case SOUTH:
                return EAST;

            case WEST:
                return SOUTH;

            case EAST:
                return NORTH;

            default:
                throw new IllegalStateException("Unable to get CCW facing of " + this);
        }
    }
    
    public int getXOffset() {
        return this.directionVec.getX();
    }
    
    public int getYOffset() {
        return this.directionVec.getY();
    }
    
    public int getZOffset() {
        return this.directionVec.getZ();
    }
    
    public Vector3f toVector3f() {
        return new Vector3f((float)this.getXOffset(), (float)this.getYOffset(), (float)this.getZOffset());
    }
    
    public String getName2() {
        return this.name;
    }
    
    public Axis getAxis() {
        return this.axis;
    }

    @Nullable
    public static Direction byName(@Nullable String name)
    {
        return name == null ? null : NAME_LOOKUP.get(name.toLowerCase(Locale.ROOT));
    }

    public static Direction byIndex(int index)
    {
        return BY_INDEX[MathHelper.abs(index % BY_INDEX.length)];
    }

    public static Direction byHorizontalIndex(int horizontalIndexIn)
    {
        return BY_HORIZONTAL_INDEX[MathHelper.abs(horizontalIndexIn % BY_HORIZONTAL_INDEX.length)];
    }

    @Nullable
    public static Direction byLong(int x, int y, int z)
    {
        return BY_LONG.get(BlockPos.pack(x, y, z));
    }

    public static Direction fromAngle(double angle)
    {
        return byHorizontalIndex(MathHelper.floor(angle / 90.0D + 0.5D) & 3);
    }

    public static Direction getFacingFromAxisDirection(Axis axisIn, AxisDirection axisDirectionIn)
    {
        switch (axisIn)
        {
            case X:
                return axisDirectionIn == AxisDirection.POSITIVE ? EAST : WEST;

            case Y:
                return axisDirectionIn == AxisDirection.POSITIVE ? UP : DOWN;

            case Z:
            default:
                return axisDirectionIn == AxisDirection.POSITIVE ? SOUTH : NORTH;
        }
    }
    
    public float getHorizontalAngle() {
        return (float)((this.horizontalIndex & 3) * 90);
    }

    public static Direction random(Random rand)
    {
        return values()[rand.nextInt(values().length)];
    }


    public static Direction getFacingFromVector(double x, double y, double z)
    {
        return getFacingFromVector((float)x, (float)y, (float)z);
    }

    public static Direction getFacingFromVector(float x, float y, float z)
    {
        Direction direction = NORTH;
        float f = Float.MIN_VALUE;

        for (Direction direction1 : VALUES)
        {
            float f1 = x * (float)direction1.directionVec.getX() + y * (float)direction1.directionVec.getY() + z * (float)direction1.directionVec.getZ();

            if (f1 > f)
            {
                f = f1;
                direction = direction1;
            }
        }

        return direction;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    public static Direction getFacingFromAxis(AxisDirection axisDirectionIn, Axis axisIn)
    {
        for (Direction direction : values())
        {
            if (direction.getAxisDirection() == axisDirectionIn && direction.getAxis() == axisIn)
            {
                return direction;
            }
        }

        throw new IllegalArgumentException("No such direction: " + axisDirectionIn + " " + axisIn);
    }

    public Vec3i getDirectionVec() {
        return this.directionVec;
    }

    public enum Axis implements IStringSerializable, Predicate<Direction>
    {
        X("x") {
            public int getCoordinate(int x, int y, int z)
            {
                return x;
            }
            public double getCoordinate(double x, double y, double z)
            {
                return x;
            }
        },
        Y("y") {
            public int getCoordinate(int x, int y, int z)
            {
                return y;
            }
            public double getCoordinate(double x, double y, double z)
            {
                return y;
            }
        },
        Z("z") {
            public int getCoordinate(int x, int y, int z)
            {
                return z;
            }
            public double getCoordinate(double x, double y, double z)
            {
                return z;
            }
        };

        private static final Map<String, Axis> NAME_LOOKUP;
        private final String name;

        Axis(final String name) {
            this.name = name;
        }

        @Nullable
        public static Axis byName(final String name) {
            return Axis.NAME_LOOKUP.get(name.toLowerCase(Locale.ROOT));
        }

        public String getName2() {
            return this.name;
        }

        public boolean isVertical() {
            return this == Axis.Y;
        }

        public boolean isHorizontal() {
            return this == Axis.X || this == Axis.Z;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static Axis random(final Random random) {
            return values()[random.nextInt(values().length)];
        }

        @Override
        public boolean test(final Direction class179) {
            return class179 != null && class179.getAxis() == this;
        }

        public Plane getPlane() {
            switch (this)
            {
                case X:
                case Z:
                    return Plane.HORIZONTAL;

                case Y:
                    return Plane.VERTICAL;

                default:
                    throw new Error("Someone's been tampering with the universe!");
            }
        }

        @Override
        public String getName() {
            return this.name;
        }

        public abstract int getCoordinate(final int p0, final int p1, final int p2);

        public abstract double getCoordinate(final double p0, final double p1, final double p2);

        static {
            NAME_LOOKUP = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Axis, ? extends String>) Axis::getName2, class111 -> class111));
        }
    }
}
