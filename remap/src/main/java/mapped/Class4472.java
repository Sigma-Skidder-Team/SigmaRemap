// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4472 extends Class4469
{
    private static String[] field19847;
    
    public Class4472(final Direction class179, final Class8123 class180) {
        super(Class9520.field40988, 1, class179, class180, 1, 1, 2);
    }
    
    public Class4472(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40988, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        final Class8123 class1855 = Class8123.method26743(this.field19840)[Direction.NORTH.getIndex()];
        final Class8123 field19840 = this.field19840;
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 0, 8, Class8123.method26745(class1855)[Direction.DOWN.getIndex()]);
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(field19840)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 4, 1, 6, 4, 7, Class4472.field19829);
        }
        if (Class8123.method26743(class1855)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 4, 8, 6, 4, 14, Class4472.field19829);
        }
        this.method13444(class1851, class1853, 0, 3, 0, 0, 3, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 7, 3, 0, 7, 3, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 0, 7, 3, 0, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 15, 6, 3, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 2, 15, Class4472.field19829, Class4472.field19829, false);
        this.method13444(class1851, class1853, 7, 2, 0, 7, 2, 15, Class4472.field19829, Class4472.field19829, false);
        this.method13444(class1851, class1853, 1, 2, 0, 7, 2, 0, Class4472.field19829, Class4472.field19829, false);
        this.method13444(class1851, class1853, 1, 2, 15, 6, 2, 15, Class4472.field19829, Class4472.field19829, false);
        this.method13444(class1851, class1853, 0, 1, 0, 0, 1, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 7, 1, 0, 7, 1, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 0, 7, 1, 0, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 15, 6, 1, 15, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 1, 1, 1, 2, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 6, 1, 1, 6, 1, 2, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 1, 1, 3, 2, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 6, 3, 1, 6, 3, 2, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 13, 1, 1, 14, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 6, 1, 13, 6, 1, 14, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 13, 1, 3, 14, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 6, 3, 13, 6, 3, 14, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 2, 1, 6, 2, 3, 6, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 5, 1, 6, 5, 3, 6, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 2, 1, 9, 2, 3, 9, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 5, 1, 9, 5, 3, 9, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 3, 2, 6, 4, 2, 6, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 3, 2, 9, 4, 2, 9, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 2, 2, 7, 2, 2, 8, Class4472.field19830, Class4472.field19830, false);
        this.method13444(class1851, class1853, 5, 2, 7, 5, 2, 8, Class4472.field19830, Class4472.field19830, false);
        this.method13440(class1851, Class4472.field19833, 2, 2, 5, class1853);
        this.method13440(class1851, Class4472.field19833, 5, 2, 5, class1853);
        this.method13440(class1851, Class4472.field19833, 2, 2, 10, class1853);
        this.method13440(class1851, Class4472.field19833, 5, 2, 10, class1853);
        this.method13440(class1851, Class4472.field19830, 2, 3, 5, class1853);
        this.method13440(class1851, Class4472.field19830, 5, 3, 5, class1853);
        this.method13440(class1851, Class4472.field19830, 2, 3, 10, class1853);
        this.method13440(class1851, Class4472.field19830, 5, 3, 10, class1853);
        if (Class8123.method26745(field19840)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 1, 0, 4, 2, 0);
        }
        if (Class8123.method26745(field19840)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 7, 1, 3, 7, 2, 4);
        }
        if (Class8123.method26745(field19840)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 1, 3, 0, 2, 4);
        }
        if (Class8123.method26745(class1855)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 1, 15, 4, 2, 15);
        }
        if (Class8123.method26745(class1855)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 1, 11, 0, 2, 12);
        }
        if (Class8123.method26745(class1855)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 7, 1, 11, 7, 2, 12);
        }
        return true;
    }
}
