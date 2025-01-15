// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5564 extends Class5509
{
    public Class5564() {
        super(EntityType.field28986, "ghast", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5890<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5890)) {
            return null;
        }
        final Class5890 class5902 = (Class5890)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.method35828(class5902, Class9570.field41478);
        }
        final String prefix = "tentacle";
        if (!s.startsWith(prefix)) {
            return null;
        }
        final Class6300[] array = (Class6300[])Class9570.method35828(class5902, Class9570.field41479);
        if (array != null) {
            int method28933 = Class8571.method28933(s.substring(prefix.length()), -1);
            return (--method28933 >= 0 && method28933 < array.length) ? array[method28933] : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4758 class5902 = new Class4758(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
