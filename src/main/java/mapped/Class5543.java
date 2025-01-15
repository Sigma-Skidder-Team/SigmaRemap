// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5543 extends Class5509
{
    public Class5543(final Class7499 class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5853)) {
            return null;
        }
        final Class5853 class5902 = (Class5853)class5901;
        if (s.equals("head")) {
            return class5902.field23993;
        }
        if (s.equals("headwear")) {
            return class5902.field23994;
        }
        if (s.equals("body")) {
            return class5902.field23995;
        }
        if (s.equals("left_arm")) {
            return class5902.field23997;
        }
        if (s.equals("right_arm")) {
            return class5902.field23996;
        }
        if (!s.equals("left_leg")) {
            return s.equals("right_leg") ? class5902.field23998 : null;
        }
        return class5902.field23999;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg" };
    }
}
