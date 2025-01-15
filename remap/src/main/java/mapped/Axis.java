// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

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
    
    private Axis(final String name) {
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
