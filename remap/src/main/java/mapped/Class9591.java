// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class Class9591
{
    private Entity field41804;
    private double field41805;
    private double field41806;
    private double field41807;
    private double field41808;
    private int field41809;
    private long field41810;
    private Set<BlockPos> field41811;
    private Class385 field41812;
    
    public Class9591(final Entity field41804) {
        this.field41804 = null;
        this.field41805 = 0.0;
        this.field41806 = -2.147483648E9;
        this.field41807 = -2.147483648E9;
        this.field41808 = -2.147483648E9;
        this.field41809 = 0;
        this.field41810 = 0L;
        this.field41811 = new HashSet<BlockPos>();
        this.field41812 = new Class385();
        this.field41804 = field41804;
        this.field41805 = field41804.method1892();
    }
    
    public void method35962(final Class1656 class1656) {
        if (Class8571.method29003()) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.field41810 + 500L) {
                return;
            }
            this.field41810 = currentTimeMillis;
        }
        final double field41806 = this.field41804.method1938() - 0.5;
        final double field41807 = this.field41804.method1941() - 0.5 + this.field41805;
        final double field41808 = this.field41804.method1945() - 0.5;
        final int method30995 = Class8850.method30995(this.field41804);
        final double a = field41806 - this.field41806;
        final double a2 = field41807 - this.field41807;
        final double a3 = field41808 - this.field41808;
        final double n = 0.1;
        if (Math.abs(a) <= n) {
            if (Math.abs(a2) <= n) {
                if (Math.abs(a3) <= n) {
                    if (this.field41809 == method30995) {
                        return;
                    }
                }
            }
        }
        this.field41806 = field41806;
        this.field41807 = field41807;
        this.field41808 = field41808;
        this.field41809 = method30995;
        final HashSet field41809 = new HashSet();
        if (method30995 > 0) {
            final Direction class1657 = ((MathHelper.floor(field41806) & 0xF) < 8) ? Direction.WEST : Direction.EAST;
            final Direction class1658 = ((MathHelper.floor(field41807) & 0xF) < 8) ? Direction.DOWN : Direction.UP;
            final Direction class1659 = ((MathHelper.floor(field41808) & 0xF) < 8) ? Direction.NORTH : Direction.SOUTH;
            final BlockPos class1660 = new BlockPos(field41806, field41807, field41808);
            final Class8974 method30996 = class1656.method5762(class1660);
            final BlockPos method30997 = this.method35963(method30996, class1660, class1657);
            final Class8974 method30998 = class1656.method5762(method30997);
            final Class8974 method30999 = class1656.method5762(this.method35963(method30996, class1660, class1659));
            final Class8974 method31000 = class1656.method5762(this.method35963(method30998, method30997, class1659));
            final BlockPos method31001 = this.method35963(method30996, class1660, class1658);
            final Class8974 method31002 = class1656.method5762(method31001);
            final BlockPos method31003 = this.method35963(method31002, method31001, class1657);
            final Class8974 method31004 = class1656.method5762(method31003);
            final Class8974 method31005 = class1656.method5762(this.method35963(method31002, method31001, class1659));
            final Class8974 method31006 = class1656.method5762(this.method35963(method31004, method31003, class1659));
            this.method35964(method30996, this.field41811, field41809);
            this.method35964(method30998, this.field41811, field41809);
            this.method35964(method30999, this.field41811, field41809);
            this.method35964(method31000, this.field41811, field41809);
            this.method35964(method31002, this.field41811, field41809);
            this.method35964(method31004, this.field41811, field41809);
            this.method35964(method31005, this.field41811, field41809);
            this.method35964(method31006, this.field41811, field41809);
        }
        this.method35965(class1656);
        this.field41811 = field41809;
    }
    
    private BlockPos method35963(final Class8974 class8974, final BlockPos class8975, final Direction class8976) {
        return (class8974 == null) ? class8975.method1150(class8976, 16) : class8974.method31878(class8976);
    }
    
    private void method35964(final Class8974 class8974, final Set<BlockPos> set, final Set<BlockPos> set2) {
        if (class8974 != null) {
            final Class9006 method31870 = class8974.method31870();
            if (method31870 != null) {
                if (!method31870.method32212()) {
                    class8974.method31874(false);
                }
            }
            final BlockPos method31871 = class8974.method31873().method1153();
            if (set != null) {
                set.remove(method31871);
            }
            if (set2 != null) {
                set2.add(method31871);
            }
        }
    }
    
    public void method35965(final Class1656 class1656) {
        final Iterator<BlockPos> iterator = this.field41811.iterator();
        while (iterator.hasNext()) {
            this.method35964(class1656.method5762(iterator.next()), null, null);
        }
    }
    
    public Entity method35966() {
        return this.field41804;
    }
    
    public double method35967() {
        return this.field41806;
    }
    
    public double method35968() {
        return this.field41807;
    }
    
    public double method35969() {
        return this.field41808;
    }
    
    public int method35970() {
        return this.field41809;
    }
    
    public double method35971() {
        return this.field41805;
    }
    
    @Override
    public String toString() {
        return "Entity: " + this.field41804 + ", offsetY: " + this.field41805;
    }
}
