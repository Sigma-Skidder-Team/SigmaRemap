// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class1856 extends Class1855
{
    Class1886 method6700();
    
    int method6849(final BlockPos p0, final Class8895 p1);
    
    default int method6992(final Class237 class237, final BlockPos class238) {
        return this.method6700().method7288(class237).method7293(class238);
    }
    
    default int method6993(final BlockPos class354, final int n) {
        return this.method6700().method7290(class354, n);
    }
    
    default boolean method6994(final BlockPos class354) {
        return this.method6992(Class237.field911, class354) >= this.getMaxLightLevel();
    }
}
