// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.Validate;
import java.util.function.Predicate;

public abstract class Class860 extends Entity
{
    public static final Predicate<Entity> field4597;
    private int field4598;
    public BlockPos field4599;
    public Direction field4600;
    
    public Class860(final Class7499<? extends Class860> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4600 = Direction.SOUTH;
    }
    
    public Class860(final Class7499<? extends Class860> class7499, final Class1847 class7500, final BlockPos field4599) {
        this(class7499, class7500);
        this.field4599 = field4599;
    }
    
    @Override
    public void method1649() {
    }
    
    public void method5186(final Direction field4600) {
        Validate.notNull((Object)field4600);
        Validate.isTrue(field4600.getAxis().isHorizontal());
        this.field4600 = field4600;
        this.field2399 = (float)(this.field4600.getHorizontalIndex() * 90);
        this.field2401 = this.field2399;
        this.method5187();
    }
    
    public void method5187() {
        if (this.field4600 != null) {
            final double n = this.field4599.getX() + 0.5;
            final double n2 = this.field4599.getY() + 0.5;
            final double n3 = this.field4599.getZ() + 0.5;
            final double method5188 = this.method5188(this.method5190());
            final double method5189 = this.method5188(this.method5191());
            final double n4 = n - this.field4600.getXOffset() * 0.46875;
            final double n5 = n3 - this.field4600.getZOffset() * 0.46875;
            final double n6 = n2 + method5189;
            final Direction method5190 = this.field4600.method784();
            final double n7 = n4 + method5188 * method5190.getXOffset();
            final double n8 = n5 + method5188 * method5190.getZOffset();
            this.method1948(n7, n6, n8);
            double n9 = this.method5190();
            final double n10 = this.method5191();
            double n11 = this.method5190();
            if (this.field4600.getAxis() != Axis.Z) {
                n9 = 1.0;
            }
            else {
                n11 = 1.0;
            }
            final double n12 = n9 / 32.0;
            final double n13 = n10 / 32.0;
            final double n14 = n11 / 32.0;
            this.method1889(new Class6221(n7 - n12, n6 - n13, n8 - n14, n7 + n12, n6 + n13, n8 + n14));
        }
    }
    
    private double method5188(final int n) {
        return (n % 32 != 0) ? 0.0 : 0.5;
    }
    
    @Override
    public void method1659() {
        if (this.field4598++ == 100) {
            if (!this.field2391.field10067) {
                this.field4598 = 0;
                if (!this.field2410) {
                    if (!this.method5189()) {
                        this.method1652();
                        this.method5192(null);
                    }
                }
            }
        }
    }
    
    public boolean method5189() {
        if (this.field2391.method6977(this)) {
            final int max = Math.max(1, this.method5190() / 16);
            final int max2 = Math.max(1, this.method5191() / 16);
            final BlockPos method1149 = this.field4599.method1149(this.field4600.getOpposite());
            final Direction method1150 = this.field4600.method784();
            final Class385 class385 = new Class385();
            for (int i = 0; i < max; ++i) {
                for (int j = 0; j < max2; ++j) {
                    class385.method1287(method1149).method1291(method1150, i + (max - 1) / -2).method1291(Direction.UP, j + (max2 - 1) / -2);
                    final Class7096 method1151 = this.field2391.method6701(class385);
                    if (!method1151.method21697().method26439() && !Class3895.method11975(method1151)) {
                        return false;
                    }
                }
            }
            return this.field2391.method6737(this, this.method1886(), Class860.field4597).isEmpty();
        }
        return false;
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public boolean method1848(final Entity class399) {
        if (!(class399 instanceof Class512)) {
            return false;
        }
        final Class512 class400 = (Class512)class399;
        return !this.field2391.method6760(class400, this.field4599) || this.method1740(Class7929.method25695(class400), 0.0f);
    }
    
    @Override
    public Direction method1882() {
        return this.field4600;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (!this.field2410) {
                if (!this.field2391.field10067) {
                    this.method1652();
                    this.method1739();
                    this.method5192(class7929.method25714());
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Vec3d class2161) {
        if (!this.field2391.field10067) {
            if (!this.field2410) {
                if (class2161.method16753() > 0.0) {
                    this.method1652();
                    this.method5192(null);
                }
            }
        }
    }
    
    @Override
    public void method1738(final double n, final double n2, final double n3) {
        if (!this.field2391.field10067) {
            if (!this.field2410) {
                if (n * n + n2 * n2 + n3 * n3 > 0.0) {
                    this.method1652();
                    this.method5192(null);
                }
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method296("Facing", (byte)this.field4600.getHorizontalIndex());
        final BlockPos method5194 = this.method5194();
        class51.method298("TileX", method5194.getX());
        class51.method298("TileY", method5194.getY());
        class51.method298("TileZ", method5194.getZ());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field4599 = new BlockPos(class51.method319("TileX"), class51.method319("TileY"), class51.method319("TileZ"));
        this.field4600 = Direction.byHorizontalIndex(class51.method317("Facing"));
    }
    
    public abstract int method5190();
    
    public abstract int method5191();
    
    public abstract void method5192(final Entity p0);
    
    public abstract void method5193();
    
    @Override
    public Class427 method1767(final Class8321 class8321, final float n) {
        final Class427 class8322 = new Class427(this.field2391, this.method1938() + this.field4600.getXOffset() * 0.15f, this.method1941() + n, this.method1945() + this.field4600.getZOffset() * 0.15f, class8321);
        class8322.method2114();
        this.field2391.method6886(class8322);
        return class8322;
    }
    
    @Override
    public boolean method1758() {
        return false;
    }
    
    @Override
    public void method1656(final double n, final double n2, final double n3) {
        this.field4599 = new BlockPos(n, n2, n3);
        this.method5187();
        this.field2448 = true;
    }
    
    public BlockPos method5194() {
        return this.field4599;
    }
    
    @Override
    public float method1903(final Class2052 class2052) {
        if (this.field4600.getAxis() != Axis.Y) {
            switch (Class7786.field31868[class2052.ordinal()]) {
                case 1: {
                    this.field4600 = this.field4600.getOpposite();
                    break;
                }
                case 2: {
                    this.field4600 = this.field4600.method784();
                    break;
                }
                case 3: {
                    this.field4600 = this.field4600.rotateY();
                    break;
                }
            }
        }
        final float method35668 = MathHelper.method35668(this.field2399);
        switch (Class7786.field31868[class2052.ordinal()]) {
            case 1: {
                return method35668 + 180.0f;
            }
            case 2: {
                return method35668 + 90.0f;
            }
            case 3: {
                return method35668 + 270.0f;
            }
            default: {
                return method35668;
            }
        }
    }
    
    @Override
    public float method1904(final Class2181 class2181) {
        return this.method1903(class2181.method8344(this.field4600));
    }
    
    @Override
    public void method1834(final Class422 class422) {
    }
    
    @Override
    public void method1881() {
    }
    
    static {
        field4597 = (class399 -> class399 instanceof Class860);
    }
}
