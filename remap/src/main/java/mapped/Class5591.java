// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5591 extends Class5509
{
    public Class5591() {
        super(EntityType.field29048, "wither", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5872<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5872)) {
            return null;
        }
        final Class5872 class5902 = (Class5872)class5901;
        final String prefix = "body";
        if (!s.startsWith(prefix)) {
            final String prefix2 = "head";
            if (!s.startsWith(prefix2)) {
                return null;
            }
            final Class6300[] array = (Class6300[])Class9570.method35828(class5902, Class9570.field41562);
            if (array != null) {
                int method28933 = Class8571.method28933(s.substring(prefix2.length()), -1);
                return (--method28933 >= 0 && method28933 < array.length) ? array[method28933] : null;
            }
            return null;
        }
        else {
            final Class6300[] array2 = (Class6300[])Class9570.method35828(class5902, Class9570.field41561);
            if (array2 != null) {
                int method28934 = Class8571.method28933(s.substring(prefix.length()), -1);
                return (--method28934 >= 0 && method28934 < array2.length) ? array2[method28934] : null;
            }
            return null;
        }
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body1", "body2", "body3", "head1", "head2", "head3" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4770 class5902 = new Class4770(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
