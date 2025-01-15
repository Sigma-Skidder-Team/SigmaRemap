// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.stream.Stream;
import java.util.Set;
import java.util.Random;

public interface Class1851 extends Class1874, Class1852, Class1875
{
    long method6753();
    
    default float method6951() {
        return Class6737.field26491[this.method6789().method20496(this.method6764().method29540())];
    }
    
    default float method6952(final float n) {
        return this.method6789().method20491(this.method6764().method29540(), n);
    }
    
    default int method6953() {
        return this.method6789().method20496(this.method6764().method29540());
    }
    
    Class6952<Class3833> method6833();
    
    Class6952<Class7255> method6834();
    
    Class1847 method6744();
    
    Class8660 method6764();
    
    Class9592 method6784(final BlockPos p0);
    
    default Class2113 method6954() {
        return this.method6764().method29597();
    }
    
    Class1906 method6762();
    
    default boolean method6814(final int n, final int n2) {
        return this.method6762().method7401(n, n2);
    }
    
    Random method6790();
    
    void method6694(final BlockPos p0, final Class3833 p1);
    
    BlockPos method6758();
    
    void method6705(final Class512 p0, final BlockPos p1, final Class7795 p2, final Class286 p3, final float p4, final float p5);
    
    void method6709(final Class6909 p0, final double p1, final double p2, final double p3, final double p4, final double p5, final double p6);
    
    void method6839(final Class512 p0, final int p1, final BlockPos p2, final int p3);
    
    default void method6955(final int n, final BlockPos class354, final int n2) {
        this.method6839(null, n, class354, n2);
    }
    
    default Stream<Class7702> method6956(final Entity class399, final Class6221 class400, final Set<Entity> set) {
        return super.method6956(class399, class400, set);
    }
    
    default boolean method6957(final Entity class399, final Class7702 class400) {
        return super.method6957(class399, class400);
    }
    
    default BlockPos method6958(final Class2020 class2020, final BlockPos class2021) {
        return super.method6958(class2020, class2021);
    }
}
