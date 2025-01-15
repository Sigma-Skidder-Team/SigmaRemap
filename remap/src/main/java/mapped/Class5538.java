// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public abstract class Class5538 extends Class5509
{
    public Class5538(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    public Class5538(final EntityType class7499, final String s, final float n, final String[] array) {
        super(class7499, s, n, array);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5851)) {
            return null;
        }
        final Class5851 class5902 = (Class5851)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 0);
        }
        if (s.equals("hat")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 1);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 2);
        }
        if (s.equals("arms")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 3);
        }
        if (s.equals("right_leg")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 4);
        }
        if (s.equals("left_leg")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 5);
        }
        if (s.equals("nose")) {
            return (Class6300)Class9570.field41491.method21625(class5902, 6);
        }
        if (!s.equals("right_arm")) {
            return s.equals("left_arm") ? ((Class6300)Class9570.field41491.method21625(class5902, 8)) : null;
        }
        return (Class6300)Class9570.field41491.method21625(class5902, 7);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "hat", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm" };
    }
}
