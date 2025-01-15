// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5511 extends Class5509
{
    public Class5511() {
        super(EntityType.field28988, "guardian", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5879();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5879)) {
            return null;
        }
        final Class5879 class5902 = (Class5879)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.method35828(class5902, Class9570.field41481);
        }
        if (s.equals("eye")) {
            return (Class6300)Class9570.method35828(class5902, Class9570.field41482);
        }
        final String prefix = "spine";
        if (!s.startsWith(prefix)) {
            final String prefix2 = "tail";
            if (!s.startsWith(prefix2)) {
                return null;
            }
            final Class6300[] array = (Class6300[])Class9570.method35828(class5902, Class9570.field41484);
            if (array != null) {
                int method28933 = Class8571.method28933(s.substring(prefix2.length()), -1);
                return (--method28933 >= 0 && method28933 < array.length) ? array[method28933] : null;
            }
            return null;
        }
        else {
            final Class6300[] array2 = (Class6300[])Class9570.method35828(class5902, Class9570.field41483);
            if (array2 != null) {
                int method28934 = Class8571.method28933(s.substring(prefix.length()), -1);
                return (--method28934 >= 0 && method28934 < array2.length) ? array2[method28934] : null;
            }
            return null;
        }
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "eye", "spine1", "spine2", "spine3", "spine4", "spine5", "spine6", "spine7", "spine8", "spine9", "spine10", "spine11", "spine12", "tail1", "tail2", "tail3" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4764 class5902 = new Class4764(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
