// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class4532 extends Class4469
{
    private static String[] field19953;
    
    public Class4532(final Direction class179, final Class8123 class180) {
        super(Class9520.field40987, 1, class179, class180, 1, 2, 2);
    }
    
    public Class4532(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40987, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        final Class8123 class1855 = Class8123.method26743(this.field19840)[Direction.NORTH.getIndex()];
        final Class8123 field19840 = this.field19840;
        final Class8123 class1856 = Class8123.method26743(class1855)[Direction.UP.getIndex()];
        final Class8123 class1857 = Class8123.method26743(field19840)[Direction.UP.getIndex()];
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 0, 8, Class8123.method26745(class1855)[Direction.DOWN.getIndex()]);
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(class1857)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 8, 1, 6, 8, 7, Class4532.field19829);
        }
        if (Class8123.method26743(class1856)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 8, 8, 6, 8, 14, Class4532.field19829);
        }
        for (int i = 1; i <= 7; ++i) {
            BlockState class1858 = Class4532.field19830;
            if (i == 2 || i == 6) {
                class1858 = Class4532.field19829;
            }
            this.method13444(class1851, class1853, 0, i, 0, 0, i, 15, class1858, class1858, false);
            this.method13444(class1851, class1853, 7, i, 0, 7, i, 15, class1858, class1858, false);
            this.method13444(class1851, class1853, 1, i, 0, 6, i, 0, class1858, class1858, false);
            this.method13444(class1851, class1853, 1, i, 15, 6, i, 15, class1858, class1858, false);
        }
        for (int j = 1; j <= 7; ++j) {
            BlockState class1859 = Class4532.field19831;
            if (j == 2 || j == 6) {
                class1859 = Class4532.field19833;
            }
            this.method13444(class1851, class1853, 3, j, 7, 4, j, 8, class1859, class1859, false);
        }
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
        if (Class8123.method26745(class1857)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 5, 0, 4, 6, 0);
        }
        if (Class8123.method26745(class1857)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 7, 5, 3, 7, 6, 4);
            this.method13444(class1851, class1853, 5, 4, 2, 6, 4, 5, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 6, 1, 2, 6, 3, 2, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 6, 1, 5, 6, 3, 5, Class4532.field19830, Class4532.field19830, false);
        }
        if (Class8123.method26745(class1857)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 5, 3, 0, 6, 4);
            this.method13444(class1851, class1853, 1, 4, 2, 2, 4, 5, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 1, 1, 2, 1, 3, 2, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 1, 1, 5, 1, 3, 5, Class4532.field19830, Class4532.field19830, false);
        }
        if (Class8123.method26745(class1856)[Direction.NORTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 5, 15, 4, 6, 15);
        }
        if (Class8123.method26745(class1856)[Direction.WEST.getIndex()]) {
            this.method13416(class1851, class1853, 0, 5, 11, 0, 6, 12);
            this.method13444(class1851, class1853, 1, 4, 10, 2, 4, 13, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 1, 1, 10, 1, 3, 10, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 1, 1, 13, 1, 3, 13, Class4532.field19830, Class4532.field19830, false);
        }
        if (Class8123.method26745(class1856)[Direction.EAST.getIndex()]) {
            this.method13416(class1851, class1853, 7, 5, 11, 7, 6, 12);
            this.method13444(class1851, class1853, 5, 4, 10, 6, 4, 13, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 6, 1, 10, 6, 3, 10, Class4532.field19830, Class4532.field19830, false);
            this.method13444(class1851, class1853, 6, 1, 13, 6, 3, 13, Class4532.field19830, Class4532.field19830, false);
        }
        return true;
    }
}