// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3986 extends Class3833
{
    private static String[] field17995;
    
    public Class3986(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        class7097.method6833().method21345(class7098, this, this.method11826(class7097));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        class7099.method6833().method21345(class7100, this, this.method11826(class7099));
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (method12131(class7097.method6701(class7098.method1139()))) {
            if (class7098.getY() >= 0) {
                final Class424 class7099 = new Class424(class7097, class7098.getX() + 0.5, class7098.getY(), class7098.getZ() + 0.5, class7097.method6701(class7098));
                this.method12130(class7099);
                class7097.method6886(class7099);
            }
        }
    }
    
    public void method12130(final Class424 class424) {
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 2;
    }
    
    public static boolean method12131(final Class7096 class7096) {
        final Class3833 method21696 = class7096.method21696();
        final Class8059 method21697 = class7096.method21697();
        if (!class7096.method21706()) {
            if (method21696 != Class7521.field29289) {
                if (!method21697.method26438()) {
                    if (!method21697.method26442()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public void method12132(final World class1847, final BlockPos class1848, final Class7096 class1849, final Class7096 class1850) {
    }
    
    public void method12133(final World class1847, final BlockPos class1848) {
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (random.nextInt(16) == 0) {
            if (method12131(class7097.method6701(class7098.method1139()))) {
                class7097.method6709(new Class6911(Class8432.field34620, class7096), class7098.getX() + (double)random.nextFloat(), class7098.getY() - 0.05, class7098.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    public int method12134(final Class7096 class7096) {
        return -16777216;
    }
}
