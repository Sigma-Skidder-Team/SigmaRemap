// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class4470 extends Class4469
{
    private static String[] field19841;
    private int field19842;
    
    public Class4470(final Direction class179, final Class8123 class180, final Random random) {
        super(Class9520.field40991, 1, class179, class180, 1, 1, 1);
        this.field19842 = random.nextInt(3);
    }
    
    public Class4470(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40991, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(this.field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(this.field19840)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 4, 1, 6, 4, 6, Class4470.field19829);
        }
        boolean b = false;
        Label_0160: {
            if (this.field19842 != 0) {
                if (random.nextBoolean()) {
                    if (!Class8123.method26745(this.field19840)[Direction.DOWN.getIndex()]) {
                        if (!Class8123.method26745(this.field19840)[Direction.UP.getIndex()]) {
                            if (this.field19840.method26742() > 1) {
                                b = true;
                                break Label_0160;
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        if (this.field19842 != 0) {
            if (this.field19842 != 1) {
                if (this.field19842 == 2) {
                    this.method13444(class1851, class1853, 0, 1, 0, 0, 1, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 7, 1, 0, 7, 1, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 1, 0, 6, 1, 0, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 1, 7, 6, 1, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 0, 2, 0, 0, 2, 7, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 7, 2, 0, 7, 2, 7, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 1, 2, 0, 6, 2, 0, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 1, 2, 7, 6, 2, 7, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 0, 3, 0, 0, 3, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 7, 3, 0, 7, 3, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 3, 0, 6, 3, 0, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 3, 7, 6, 3, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 0, 1, 3, 0, 2, 4, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 7, 1, 3, 7, 2, 4, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 3, 1, 0, 4, 2, 0, Class4470.field19831, Class4470.field19831, false);
                    this.method13444(class1851, class1853, 3, 1, 7, 4, 2, 7, Class4470.field19831, Class4470.field19831, false);
                    if (Class8123.method26745(this.field19840)[Direction.SOUTH.getIndex()]) {
                        this.method13416(class1851, class1853, 3, 1, 0, 4, 2, 0);
                    }
                    if (Class8123.method26745(this.field19840)[Direction.NORTH.getIndex()]) {
                        this.method13416(class1851, class1853, 3, 1, 7, 4, 2, 7);
                    }
                    if (Class8123.method26745(this.field19840)[Direction.WEST.getIndex()]) {
                        this.method13416(class1851, class1853, 0, 1, 3, 0, 2, 4);
                    }
                    if (Class8123.method26745(this.field19840)[Direction.EAST.getIndex()]) {
                        this.method13416(class1851, class1853, 7, 1, 3, 7, 2, 4);
                    }
                }
            }
            else {
                this.method13444(class1851, class1853, 2, 1, 2, 2, 3, 2, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 2, 1, 5, 2, 3, 5, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 5, 1, 5, 5, 3, 5, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 5, 1, 2, 5, 3, 2, Class4470.field19830, Class4470.field19830, false);
                this.method13440(class1851, Class4470.field19833, 2, 2, 2, class1853);
                this.method13440(class1851, Class4470.field19833, 2, 2, 5, class1853);
                this.method13440(class1851, Class4470.field19833, 5, 2, 5, class1853);
                this.method13440(class1851, Class4470.field19833, 5, 2, 2, class1853);
                this.method13444(class1851, class1853, 0, 1, 0, 1, 3, 0, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 0, 1, 1, 0, 3, 1, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 0, 1, 7, 1, 3, 7, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 0, 1, 6, 0, 3, 6, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 6, 1, 7, 7, 3, 7, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 7, 1, 6, 7, 3, 6, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 6, 1, 0, 7, 3, 0, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 7, 1, 1, 7, 3, 1, Class4470.field19830, Class4470.field19830, false);
                this.method13440(class1851, Class4470.field19829, 1, 2, 0, class1853);
                this.method13440(class1851, Class4470.field19829, 0, 2, 1, class1853);
                this.method13440(class1851, Class4470.field19829, 1, 2, 7, class1853);
                this.method13440(class1851, Class4470.field19829, 0, 2, 6, class1853);
                this.method13440(class1851, Class4470.field19829, 6, 2, 7, class1853);
                this.method13440(class1851, Class4470.field19829, 7, 2, 6, class1853);
                this.method13440(class1851, Class4470.field19829, 6, 2, 0, class1853);
                this.method13440(class1851, Class4470.field19829, 7, 2, 1, class1853);
                if (!Class8123.method26745(this.field19840)[Direction.SOUTH.getIndex()]) {
                    this.method13444(class1851, class1853, 1, 3, 0, 6, 3, 0, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 2, 0, 6, 2, 0, Class4470.field19829, Class4470.field19829, false);
                    this.method13444(class1851, class1853, 1, 1, 0, 6, 1, 0, Class4470.field19830, Class4470.field19830, false);
                }
                if (!Class8123.method26745(this.field19840)[Direction.NORTH.getIndex()]) {
                    this.method13444(class1851, class1853, 1, 3, 7, 6, 3, 7, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 1, 2, 7, 6, 2, 7, Class4470.field19829, Class4470.field19829, false);
                    this.method13444(class1851, class1853, 1, 1, 7, 6, 1, 7, Class4470.field19830, Class4470.field19830, false);
                }
                if (!Class8123.method26745(this.field19840)[Direction.WEST.getIndex()]) {
                    this.method13444(class1851, class1853, 0, 3, 1, 0, 3, 6, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 0, 2, 1, 0, 2, 6, Class4470.field19829, Class4470.field19829, false);
                    this.method13444(class1851, class1853, 0, 1, 1, 0, 1, 6, Class4470.field19830, Class4470.field19830, false);
                }
                if (!Class8123.method26745(this.field19840)[Direction.EAST.getIndex()]) {
                    this.method13444(class1851, class1853, 7, 3, 1, 7, 3, 6, Class4470.field19830, Class4470.field19830, false);
                    this.method13444(class1851, class1853, 7, 2, 1, 7, 2, 6, Class4470.field19829, Class4470.field19829, false);
                    this.method13444(class1851, class1853, 7, 1, 1, 7, 1, 6, Class4470.field19830, Class4470.field19830, false);
                }
            }
        }
        else {
            this.method13444(class1851, class1853, 0, 1, 0, 2, 1, 2, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 0, 3, 0, 2, 3, 2, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 0, 2, 0, 0, 2, 2, Class4470.field19829, Class4470.field19829, false);
            this.method13444(class1851, class1853, 1, 2, 0, 2, 2, 0, Class4470.field19829, Class4470.field19829, false);
            this.method13440(class1851, Class4470.field19833, 1, 2, 1, class1853);
            this.method13444(class1851, class1853, 5, 1, 0, 7, 1, 2, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 5, 3, 0, 7, 3, 2, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 7, 2, 0, 7, 2, 2, Class4470.field19829, Class4470.field19829, false);
            this.method13444(class1851, class1853, 5, 2, 0, 6, 2, 0, Class4470.field19829, Class4470.field19829, false);
            this.method13440(class1851, Class4470.field19833, 6, 2, 1, class1853);
            this.method13444(class1851, class1853, 0, 1, 5, 2, 1, 7, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 0, 3, 5, 2, 3, 7, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 0, 2, 5, 0, 2, 7, Class4470.field19829, Class4470.field19829, false);
            this.method13444(class1851, class1853, 1, 2, 7, 2, 2, 7, Class4470.field19829, Class4470.field19829, false);
            this.method13440(class1851, Class4470.field19833, 1, 2, 6, class1853);
            this.method13444(class1851, class1853, 5, 1, 5, 7, 1, 7, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 5, 3, 5, 7, 3, 7, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 7, 2, 5, 7, 2, 7, Class4470.field19829, Class4470.field19829, false);
            this.method13444(class1851, class1853, 5, 2, 7, 6, 2, 7, Class4470.field19829, Class4470.field19829, false);
            this.method13440(class1851, Class4470.field19833, 6, 2, 6, class1853);
            if (!Class8123.method26745(this.field19840)[Direction.SOUTH.getIndex()]) {
                this.method13444(class1851, class1853, 3, 3, 0, 4, 3, 1, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 3, 2, 0, 4, 2, 0, Class4470.field19829, Class4470.field19829, false);
                this.method13444(class1851, class1853, 3, 1, 0, 4, 1, 1, Class4470.field19830, Class4470.field19830, false);
            }
            else {
                this.method13444(class1851, class1853, 3, 3, 0, 4, 3, 0, Class4470.field19830, Class4470.field19830, false);
            }
            if (!Class8123.method26745(this.field19840)[Direction.NORTH.getIndex()]) {
                this.method13444(class1851, class1853, 3, 3, 6, 4, 3, 7, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 3, 2, 7, 4, 2, 7, Class4470.field19829, Class4470.field19829, false);
                this.method13444(class1851, class1853, 3, 1, 6, 4, 1, 7, Class4470.field19830, Class4470.field19830, false);
            }
            else {
                this.method13444(class1851, class1853, 3, 3, 7, 4, 3, 7, Class4470.field19830, Class4470.field19830, false);
            }
            if (!Class8123.method26745(this.field19840)[Direction.WEST.getIndex()]) {
                this.method13444(class1851, class1853, 0, 3, 3, 1, 3, 4, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 0, 2, 3, 0, 2, 4, Class4470.field19829, Class4470.field19829, false);
                this.method13444(class1851, class1853, 0, 1, 3, 1, 1, 4, Class4470.field19830, Class4470.field19830, false);
            }
            else {
                this.method13444(class1851, class1853, 0, 3, 3, 0, 3, 4, Class4470.field19830, Class4470.field19830, false);
            }
            if (!Class8123.method26745(this.field19840)[Direction.EAST.getIndex()]) {
                this.method13444(class1851, class1853, 6, 3, 3, 7, 3, 4, Class4470.field19830, Class4470.field19830, false);
                this.method13444(class1851, class1853, 7, 2, 3, 7, 2, 4, Class4470.field19829, Class4470.field19829, false);
                this.method13444(class1851, class1853, 6, 1, 3, 7, 1, 4, Class4470.field19830, Class4470.field19830, false);
            }
            else {
                this.method13444(class1851, class1853, 7, 3, 3, 7, 3, 4, Class4470.field19830, Class4470.field19830, false);
            }
        }
        if (b2) {
            this.method13444(class1851, class1853, 3, 1, 3, 4, 1, 4, Class4470.field19830, Class4470.field19830, false);
            this.method13444(class1851, class1853, 3, 2, 3, 4, 2, 4, Class4470.field19829, Class4470.field19829, false);
            this.method13444(class1851, class1853, 3, 3, 3, 4, 3, 4, Class4470.field19830, Class4470.field19830, false);
        }
        return true;
    }
}
