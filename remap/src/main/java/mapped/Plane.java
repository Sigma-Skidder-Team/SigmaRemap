// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import net.minecraft.util.Direction;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public enum Plane implements Iterable<Direction>, Predicate<Direction>
{
    HORIZONTAL(new Direction[] { Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}, new Direction.Axis[] { Direction.Axis.X, Direction.Axis.Z}),
    VERTICAL(new Direction[] { Direction.UP, Direction.DOWN}, new Direction.Axis[] { Direction.Axis.Y});
    
    private final Direction[] field270;
    private final Direction.Axis[] field271;
    
    Plane(final Direction[] field270, final Direction.Axis[] field271) {
        this.field270 = field270;
        this.field271 = field271;
    }
    
    public Direction method576(final Random random) {
        return this.field270[random.nextInt(this.field270.length)];
    }
    
    @Override
    public boolean test(final Direction class179) {
        return class179 != null && class179.getAxis().getPlane() == this;
    }
    
    @Override
    public Iterator<Direction> iterator() {
        return (Iterator<Direction>)Iterators.forArray((Object[])this.field270);
    }
}
