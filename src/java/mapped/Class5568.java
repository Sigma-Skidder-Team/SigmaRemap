// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5568 extends Class5509
{
    public Class5568() {
        super(Class7499.field28960, "bat", 0.25f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5873();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5873)) {
            return null;
        }
        final Class5873 class5902 = (Class5873)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41450, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41450, 1);
        }
        if (s.equals("right_wing")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41450, 2);
        }
        if (s.equals("left_wing")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41450, 3);
        }
        if (!s.equals("outer_right_wing")) {
            return s.equals("outer_left_wing") ? ((Class6300)Class9570.method35831(class5902, Class9570.field41450, 5)) : null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41450, 4);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4742 class5902 = new Class4742(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
