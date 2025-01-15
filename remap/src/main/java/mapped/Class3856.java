// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class3856 extends Class3857, Class3867
{
    default boolean method11920(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final Class7255 class1858) {
        return !class1857.method21772((Class7111<Boolean>)Class8970.field37747) && class1858 == Class7558.field29976;
    }
    
    default boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Class7099 class1854) {
        if (!class1853.method21772((Class7111<Boolean>)Class8970.field37747) && class1854.method21779() == Class7558.field29976) {
            if (!class1851.isRemote()) {
                class1851.method6688(class1852, ((Class7097<O, BlockState>)class1853).method21773((Class7111<Comparable>)Class8970.field37747, true), 3);
                class1851.method6834().method21345(class1852, class1854.method21779(), class1854.method21779().method22156(class1851));
            }
            return true;
        }
        return false;
    }
    
    default Class7255 method11922(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
        if (!class1853.method21772((Class7111<Boolean>)Class8970.field37747)) {
            return Class7558.field29974;
        }
        class1851.method6688(class1852, ((Class7097<O, BlockState>)class1853).method21773((Class7111<Comparable>)Class8970.field37747, false), 3);
        return Class7558.field29976;
    }
}
