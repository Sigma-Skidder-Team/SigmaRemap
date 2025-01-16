// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4526 extends Class4469
{
    private static String[] field19946;
    
    public Class4526(final Direction class179, final Class8123 class180) {
        super(Class9520.field40984, 1, class179, class180, 2, 1, 1);
    }
    
    public Class4526(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40984, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        final Class8123 class1855 = Class8123.method26743(this.field19840)[Direction.EAST.getIndex()];
        final Class8123 field19840 = this.field19840;
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 8, 0, Class8123.method26745(class1855)[Direction.DOWN.getIndex()]);
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(field19840)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 4, 1, 7, 4, 6, Class4526.field19829);
        }
        if (Class8123.method26743(class1855)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 8, 4, 1, 14, 4, 6, Class4526.field19829);
        }
        this.method13444(class1851, class1853, 0, 3, 0, 0, 3, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 15, 3, 0, 15, 3, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 0, 15, 3, 0, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 7, 14, 3, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 2, 7, Class4526.field19829, Class4526.field19829, false);
        this.method13444(class1851, class1853, 15, 2, 0, 15, 2, 7, Class4526.field19829, Class4526.field19829, false);
        this.method13444(class1851, class1853, 1, 2, 0, 15, 2, 0, Class4526.field19829, Class4526.field19829, false);
        this.method13444(class1851, class1853, 1, 2, 7, 14, 2, 7, Class4526.field19829, Class4526.field19829, false);
        this.method13444(class1851, class1853, 0, 1, 0, 0, 1, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 15, 1, 0, 15, 1, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 0, 15, 1, 0, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 7, 14, 1, 7, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 5, 1, 0, 10, 1, 4, Class4526.field19830, Class4526.field19830, false);
        this.method13444(class1851, class1853, 6, 2, 0, 9, 2, 3, Class4526.field19829, Class4526.field19829, false);
        this.method13444(class1851, class1853, 5, 3, 0, 10, 3, 4, Class4526.field19830, Class4526.field19830, false);
        this.method13440(class1851, Class4526.field19833, 6, 2, 3, class1853);
        this.method13440(class1851, Class4526.field19833, 9, 2, 3, class1853);
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
        return true;
    }
}
