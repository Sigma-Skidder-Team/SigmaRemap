// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.List;

public class Class6344 extends Class6343<Class7064>
{
    private static String[] field25373;
    private final double[] field25374;
    
    public Class6344(final World class1847, final Class1868 class1848, final Class7064 class1849) {
        super(class1847, class1848, 4, 8, 128, class1849, false);
        this.field25374 = this.method18865();
    }
    
    @Override
    public void method18847(final double[] array, final int n, final int n2) {
        this.method18856(array, n, n2, 684.412, 2053.236, 8.555150000000001, 34.2206, 3, -10);
    }
    
    @Override
    public double[] method18848(final int n, final int n2) {
        return new double[] { 0.0, 0.0 };
    }
    
    @Override
    public double method18849(final double n, final double n2, final int n3) {
        return this.field25374[n3];
    }
    
    private double[] method18865() {
        final double[] array = new double[this.method18858()];
        for (int i = 0; i < this.method18858(); ++i) {
            array[i] = Math.cos(i * 3.141592653589793 * 6.0 / this.method18858()) * 2.0;
            double n = i;
            if (i > this.method18858() / 2) {
                n = this.method18858() - 1 - i;
            }
            if (n < 4.0) {
                final double n2 = 4.0 - n;
                final double[] array2 = array;
                final int n3 = i;
                array2[n3] -= n2 * n2 * n2 * 10.0;
            }
        }
        return array;
    }
    
    @Override
    public List<Class6828> method18866(final Class1976 class1976, final BlockPos class1977) {
        if (class1976 == Class1976.field10948) {
            if (Class4535.field19969.method13590(this.field25383, class1977)) {
                return Class4535.field19969.method13530();
            }
            if (Class4535.field19969.method13589(this.field25383, class1977)) {
                if (this.field25383.getBlockState(class1977.method1139()).getBlock() == Class7521.field29394) {
                    return Class4535.field19969.method13530();
                }
            }
        }
        return super.method18866(class1976, class1977);
    }
    
    @Override
    public int method18852() {
        return this.field25383.method6743() + 1;
    }
    
    @Override
    public int method18867() {
        return 128;
    }
    
    @Override
    public int method18853() {
        return 32;
    }
}
