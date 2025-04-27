// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.util.Direction;

import java.util.Arrays;
import java.util.Set;

public enum Class322
{
    field1907(new Direction[] { Direction.NORTH}),
    field1908(new Direction[] { Direction.NORTH, Direction.EAST}),
    field1909(new Direction[] { Direction.EAST}),
    field1910(new Direction[] { Direction.SOUTH, Direction.EAST}),
    field1911(new Direction[] { Direction.SOUTH}),
    field1912(new Direction[] { Direction.SOUTH, Direction.WEST}),
    field1913(new Direction[] { Direction.WEST}),
    field1914(new Direction[] { Direction.NORTH, Direction.WEST});
    
    private static final int field1915;
    private static final int field1916;
    private static final int field1917;
    private static final int field1918;
    private static final int field1919;
    private static final int field1920;
    private static final int field1921;
    private static final int field1922;
    private final Set<Direction> field1923;
    
    Class322(final Direction[] a) {
        this.field1923 = (Set<Direction>)Sets.immutableEnumSet((Iterable)Arrays.asList(a));
    }
    
    public Set<Direction> method993() {
        return this.field1923;
    }
    
    static {
        field1915 = 1 << Class322.field1914.ordinal();
        field1916 = 1 << Class322.field1913.ordinal();
        field1917 = 1 << Class322.field1912.ordinal();
        field1918 = 1 << Class322.field1911.ordinal();
        field1919 = 1 << Class322.field1910.ordinal();
        field1920 = 1 << Class322.field1909.ordinal();
        field1921 = 1 << Class322.field1908.ordinal();
        field1922 = 1 << Class322.field1907.ordinal();
    }
}
