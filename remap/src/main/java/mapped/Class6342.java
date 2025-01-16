// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class6342 extends Class6343<Class7069>
{
    private static String[] field25357;
    private final BlockPos field25358;
    
    public Class6342(final Class1851 class1851, final Class1868 class1852, final Class7069 class1853) {
        super(class1851, class1852, 8, 4, 128, class1853, true);
        this.field25358 = class1853.method21620();
    }
    
    @Override
    public void method18847(final double[] array, final int n, final int n2) {
        this.method18856(array, n, n2, 1368.824, 684.412, 17.110300000000002, 4.277575000000001, 64, -3000);
    }
    
    @Override
    public double[] method18848(final int n, final int n2) {
        return new double[] { this.field25385.method7120(n, n2), 0.0 };
    }
    
    @Override
    public double method18849(final double n, final double n2, final int n3) {
        return 8.0 - n;
    }
    
    @Override
    public double method18850() {
        return (int)super.method18850() / 2;
    }
    
    @Override
    public double method18851() {
        return 8.0;
    }
    
    @Override
    public int method18852() {
        return 50;
    }
    
    @Override
    public int method18853() {
        return 0;
    }
}
