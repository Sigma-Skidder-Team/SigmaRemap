// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5569 extends Class5509
{
    public Class5569() {
        super(Class7499.field29018, "salmon", 0.3f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5877<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5877)) {
            return null;
        }
        final Class5877 class5902 = (Class5877)class5901;
        if (s.equals("body_front")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 0);
        }
        if (s.equals("body_back")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 1);
        }
        if (s.equals("head")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 2);
        }
        if (s.equals("fin_back_1")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 3);
        }
        if (s.equals("fin_back_2")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 4);
        }
        if (s.equals("tail")) {
            return (Class6300)Class9570.field41526.method21625(class5902, 5);
        }
        if (!s.equals("fin_right")) {
            return s.equals("fin_left") ? ((Class6300)Class9570.field41526.method21625(class5902, 7)) : null;
        }
        return (Class6300)Class9570.field41526.method21625(class5902, 6);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body_front", "body_back", "head", "fin_back_1", "fin_back_2", "tail", "fin_right", "fin_left" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4720 class5902 = new Class4720(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
