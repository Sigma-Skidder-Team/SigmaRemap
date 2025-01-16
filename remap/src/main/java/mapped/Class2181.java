// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public enum Class2181
{
    field12917, 
    field12918, 
    field12919;
    
    public int method8343(final int n, final int n2) {
        final int n3 = n2 / 2;
        final int n4 = (n > n3) ? (n - n2) : n;
        switch (Class7913.field32493[this.ordinal()]) {
            case 1: {
                return (n2 - n4) % n2;
            }
            case 2: {
                return (n3 - n4 + n2) % n2;
            }
            default: {
                return n;
            }
        }
    }
    
    public Class2052 method8344(final Direction class179) {
        final Axis method790 = class179.getAxis();
        return ((this != Class2181.field12918 || method790 != Axis.Z) && (this != Class2181.field12919 || method790 != Axis.X)) ? Class2052.field11707 : Class2052.field11709;
    }
    
    public Direction method8345(final Direction class179) {
        if (this == Class2181.field12919 && class179.getAxis() == Axis.X) {
            return class179.getOpposite();
        }
        return (this == Class2181.field12918 && class179.getAxis() == Axis.Z) ? class179.getOpposite() : class179;
    }
}
