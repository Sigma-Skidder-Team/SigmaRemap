// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5536 extends Class5509
{
    public Class5536() {
        super(EntityType.field29030, "spider", 1.0f);
    }
    
    public Class5536(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5880<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5880)) {
            return null;
        }
        final Class5880 class5902 = (Class5880)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 0);
        }
        if (s.equals("neck")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 1);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 2);
        }
        if (s.equals("leg1")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 3);
        }
        if (s.equals("leg2")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 4);
        }
        if (s.equals("leg3")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 5);
        }
        if (s.equals("leg4")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 6);
        }
        if (s.equals("leg5")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 7);
        }
        if (s.equals("leg6")) {
            return (Class6300)Class9570.field41543.method21625(class5902, 8);
        }
        if (!s.equals("leg7")) {
            return s.equals("leg8") ? ((Class6300)Class9570.field41543.method21625(class5902, 10)) : null;
        }
        return (Class6300)Class9570.field41543.method21625(class5902, 9);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4768 class5902 = new Class4768(Minecraft.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
