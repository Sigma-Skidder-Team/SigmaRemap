// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5583 extends Class5509
{
    public Class5583() {
        super(Class7499.field28963, "boat", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5888();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5888) {
            final Class5888 class5902 = (Class5888)class5901;
            final Class6300[] array = (Class6300[])Class9570.field41452.method22631(class5902);
            if (array != null) {
                if (s.equals("bottom")) {
                    return array[0];
                }
                if (s.equals("back")) {
                    return array[1];
                }
                if (s.equals("front")) {
                    return array[2];
                }
                if (s.equals("right")) {
                    return array[3];
                }
                if (s.equals("left")) {
                    return array[4];
                }
            }
            final Class6300[] array2 = (Class6300[])Class9570.field41453.method22631(class5902);
            if (array2 != null) {
                if (s.equals("paddle_left")) {
                    return array2[0];
                }
                if (s.equals("paddle_right")) {
                    return array2[1];
                }
            }
            return s.equals("bottom_no_water") ? ((Class6300)Class9570.field41454.method22631(class5902)) : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4704 class5902 = new Class4704(Class869.method5277().method5306());
        if (Class9570.field41568.method22634()) {
            Class9570.method35837(class5902, Class9570.field41568, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Class8571.method28848("Field not found: RenderBoat.modelBoat");
        return null;
    }
}
