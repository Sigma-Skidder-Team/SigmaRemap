// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5584 extends Class5509
{
    public Class5584() {
        super(EntityType.field29042, "villager", 0.5f);
    }
    
    public Class5584(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5856<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5856)) {
            return null;
        }
        final Class5856 class5902 = (Class5856)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 0);
        }
        if (s.equals("headwear")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 1);
        }
        if (s.equals("headwear2")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 2);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 3);
        }
        if (s.equals("bodywear")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 4);
        }
        if (s.equals("arms")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 5);
        }
        if (s.equals("right_leg")) {
            return (Class6300)Class9570.field41557.method21625(class5902, 6);
        }
        if (!s.equals("left_leg")) {
            return s.equals("nose") ? ((Class6300)Class9570.field41557.method21625(class5902, 8)) : null;
        }
        return (Class6300)Class9570.field41557.method21625(class5902, 7);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "headwear", "headwear2", "body", "bodywear", "arms", "right_leg", "left_leg", "nose" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4757 class5902 = new Class4757(Class869.method5277().method5306(), (Class6580)Class869.method5277().method5291());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
