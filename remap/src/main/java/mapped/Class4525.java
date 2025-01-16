// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4525 extends Class4469
{
    private static String[] field19945;
    
    public Class4525(final Direction class179, final Class8123 class180) {
        super(Class9520.field40986, 1, class179, class180, 1, 2, 1);
    }
    
    public Class4525(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40986, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(this.field19840)[Direction.DOWN.getIndex()]);
        }
        final Class8123 class1855 = Class8123.method26743(this.field19840)[Direction.UP.getIndex()];
        if (Class8123.method26743(class1855)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 8, 1, 6, 8, 6, Class4525.field19829);
        }
        this.method13444(class1851, class1853, 0, 4, 0, 0, 4, 7, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 7, 4, 0, 7, 4, 7, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 1, 4, 0, 6, 4, 0, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 1, 4, 7, 6, 4, 7, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 2, 4, 1, 2, 4, 2, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 1, 4, 2, 1, 4, 2, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 5, 4, 1, 5, 4, 2, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 6, 4, 2, 6, 4, 2, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 2, 4, 5, 2, 4, 6, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 1, 4, 5, 1, 4, 5, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 5, 4, 5, 5, 4, 6, Class4525.field19830, Class4525.field19830, false);
        this.method13444(class1851, class1853, 6, 4, 5, 6, 4, 5, Class4525.field19830, Class4525.field19830, false);
        Class8123 field19840 = this.field19840;
        for (int i = 1; i <= 5; i += 4) {
            final int n = 0;
            if (!Class8123.method26745(field19840)[Direction.SOUTH.getIndex()]) {
                this.method13444(class1851, class1853, 0, i, n, 7, i + 2, n, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 0, i + 1, n, 7, i + 1, n, Class4525.field19829, Class4525.field19829, false);
            }
            else {
                this.method13444(class1851, class1853, 2, i, n, 2, i + 2, n, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 5, i, n, 5, i + 2, n, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 3, i + 2, n, 4, i + 2, n, Class4525.field19830, Class4525.field19830, false);
            }
            final int n2 = 7;
            if (!Class8123.method26745(field19840)[Direction.NORTH.getIndex()]) {
                this.method13444(class1851, class1853, 0, i, n2, 7, i + 2, n2, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 0, i + 1, n2, 7, i + 1, n2, Class4525.field19829, Class4525.field19829, false);
            }
            else {
                this.method13444(class1851, class1853, 2, i, n2, 2, i + 2, n2, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 5, i, n2, 5, i + 2, n2, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, 3, i + 2, n2, 4, i + 2, n2, Class4525.field19830, Class4525.field19830, false);
            }
            final int n3 = 0;
            if (!Class8123.method26745(field19840)[Direction.WEST.getIndex()]) {
                this.method13444(class1851, class1853, n3, i, 0, n3, i + 2, 7, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n3, i + 1, 0, n3, i + 1, 7, Class4525.field19829, Class4525.field19829, false);
            }
            else {
                this.method13444(class1851, class1853, n3, i, 2, n3, i + 2, 2, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n3, i, 5, n3, i + 2, 5, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n3, i + 2, 3, n3, i + 2, 4, Class4525.field19830, Class4525.field19830, false);
            }
            final int n4 = 7;
            if (!Class8123.method26745(field19840)[Direction.EAST.getIndex()]) {
                this.method13444(class1851, class1853, n4, i, 0, n4, i + 2, 7, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n4, i + 1, 0, n4, i + 1, 7, Class4525.field19829, Class4525.field19829, false);
            }
            else {
                this.method13444(class1851, class1853, n4, i, 2, n4, i + 2, 2, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n4, i, 5, n4, i + 2, 5, Class4525.field19830, Class4525.field19830, false);
                this.method13444(class1851, class1853, n4, i + 2, 3, n4, i + 2, 4, Class4525.field19830, Class4525.field19830, false);
            }
            field19840 = class1855;
        }
        return true;
    }
}
