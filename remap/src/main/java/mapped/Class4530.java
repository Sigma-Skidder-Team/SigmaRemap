// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4530 extends Class4469
{
    private static String[] field19951;
    
    public Class4530(final Direction class179, final Class8123 class180) {
        super(Class9520.field40985, 1, class179, class180, 2, 2, 1);
    }
    
    public Class4530(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40985, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        final Class8123 class1855 = Class8123.method26743(this.field19840)[Direction.EAST.getIndex()];
        final Class8123 field19840 = this.field19840;
        final Class8123 class1856 = Class8123.method26743(field19840)[Direction.UP.getIndex()];
        final Class8123 class1857 = Class8123.method26743(class1855)[Direction.UP.getIndex()];
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 8, 0, Class8123.method26745(class1855)[Direction.DOWN.getIndex()]);
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(class1856)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 8, 1, 7, 8, 6, Class4530.field19829);
        }
        if (Class8123.method26743(class1857)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 8, 8, 1, 14, 8, 6, Class4530.field19829);
        }
        for (int i = 1; i <= 7; ++i) {
            BlockState class1858 = Class4530.field19830;
            if (i == 2 || i == 6) {
                class1858 = Class4530.field19829;
            }
            this.method13444(class1851, class1853, 0, i, 0, 0, i, 7, class1858, class1858, false);
            this.method13444(class1851, class1853, 15, i, 0, 15, i, 7, class1858, class1858, false);
            this.method13444(class1851, class1853, 1, i, 0, 15, i, 0, class1858, class1858, false);
            this.method13444(class1851, class1853, 1, i, 7, 14, i, 7, class1858, class1858, false);
        }
        this.method13444(class1851, class1853, 2, 1, 3, 2, 7, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 3, 1, 2, 4, 7, 2, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 3, 1, 5, 4, 7, 5, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 13, 1, 3, 13, 7, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 11, 1, 2, 12, 7, 2, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 11, 1, 5, 12, 7, 5, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 5, 1, 3, 5, 3, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 10, 1, 3, 10, 3, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 5, 7, 2, 10, 7, 5, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 5, 5, 2, 5, 7, 2, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 10, 5, 2, 10, 7, 2, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 5, 5, 5, 5, 7, 5, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 10, 5, 5, 10, 7, 5, Class4530.field19830, Class4530.field19830, false);
        this.method13440(class1851, Class4530.field19830, 6, 6, 2, class1853);
        this.method13440(class1851, Class4530.field19830, 9, 6, 2, class1853);
        this.method13440(class1851, Class4530.field19830, 6, 6, 5, class1853);
        this.method13440(class1851, Class4530.field19830, 9, 6, 5, class1853);
        this.method13444(class1851, class1853, 5, 4, 3, 6, 4, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13444(class1851, class1853, 9, 4, 3, 10, 4, 4, Class4530.field19830, Class4530.field19830, false);
        this.method13440(class1851, Class4530.field19833, 5, 4, 2, class1853);
        this.method13440(class1851, Class4530.field19833, 5, 4, 5, class1853);
        this.method13440(class1851, Class4530.field19833, 10, 4, 2, class1853);
        this.method13440(class1851, Class4530.field19833, 10, 4, 5, class1853);
        if (Class8123.method26745(field19840)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 1, 0, 4, 2, 0);
        }
        if (Class8123.method26745(field19840)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 1, 7, 4, 2, 7);
        }
        if (Class8123.method26745(field19840)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 1, 3, 0, 2, 4);
        }
        if (Class8123.method26745(class1855)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 11, 1, 0, 12, 2, 0);
        }
        if (Class8123.method26745(class1855)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 11, 1, 7, 12, 2, 7);
        }
        if (Class8123.method26745(class1855)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 15, 1, 3, 15, 2, 4);
        }
        if (Class8123.method26745(class1856)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 5, 0, 4, 6, 0);
        }
        if (Class8123.method26745(class1856)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 5, 7, 4, 6, 7);
        }
        if (Class8123.method26745(class1856)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 5, 3, 0, 6, 4);
        }
        if (Class8123.method26745(class1857)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 11, 5, 0, 12, 6, 0);
        }
        if (Class8123.method26745(class1857)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 11, 5, 7, 12, 6, 7);
        }
        if (Class8123.method26745(class1857)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 15, 5, 3, 15, 6, 4);
        }
        return true;
    }
}
