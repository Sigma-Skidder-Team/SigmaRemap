// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5508 extends Class5509
{
    public Class5508() {
        super(EntityType.field29050, "wither_skull", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5918();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5918) {
            final Class5918 class5902 = (Class5918)class5901;
            return s.equals("head") ? ((Class6300)Class9570.field41534.method22631(class5902)) : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4705 class5902 = new Class4705(Class869.method5277().method5306());
        if (Class9570.field41583.method22634()) {
            Class9570.method35837(class5902, Class9570.field41583, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Class8571.method28848("Field not found: RenderWitherSkull_model");
        return null;
    }
}
