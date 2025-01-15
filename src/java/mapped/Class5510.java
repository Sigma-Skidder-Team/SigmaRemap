// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5510 extends Class5509
{
    public Class5510() {
        super(Class7499.field28967, "cod", 0.3f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5850<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5850)) {
            return null;
        }
        final Class5850 class5902 = (Class5850)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.field41463.method21625(class5902, 0);
        }
        if (s.equals("fin_back")) {
            return (Class6300)Class9570.field41463.method21625(class5902, 1);
        }
        if (s.equals("head")) {
            return (Class6300)Class9570.field41463.method21625(class5902, 2);
        }
        if (s.equals("nose")) {
            return (Class6300)Class9570.field41463.method21625(class5902, 3);
        }
        if (s.equals("fin_right")) {
            return (Class6300)Class9570.field41463.method21625(class5902, 4);
        }
        if (!s.equals("fin_left")) {
            return s.equals("tail") ? ((Class6300)Class9570.field41463.method21625(class5902, 6)) : null;
        }
        return (Class6300)Class9570.field41463.method21625(class5902, 5);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "fin_back", "head", "nose", "fin_right", "fin_left", "tail" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4735 class5902 = new Class4735(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
