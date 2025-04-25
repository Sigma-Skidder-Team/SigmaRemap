// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5535 extends Class5509
{
    public Class5535() {
        super(EntityType.field28976, "dragon", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5898();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5898)) {
            return null;
        }
        final Class5898 class5902 = (Class5898)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 0);
        }
        if (s.equals("spine")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 1);
        }
        if (s.equals("jaw")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 2);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 3);
        }
        if (s.equals("rear_leg")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 4);
        }
        if (s.equals("front_leg")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 5);
        }
        if (s.equals("rear_leg_tip")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 6);
        }
        if (s.equals("front_leg_tip")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 7);
        }
        if (s.equals("rear_foot")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 8);
        }
        if (s.equals("front_foot")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 9);
        }
        if (!s.equals("wing")) {
            return s.equals("wing_tip") ? ((Class6300)Class9570.method35831(class5902, Class9570.field41469, 11)) : null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41469, 10);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "spine", "jaw", "body", "rear_leg", "front_leg", "rear_leg_tip", "front_leg_tip", "rear_foot", "front_foot", "wing", "wing_tip" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4794 class5902 = new Class4794(Minecraft.getInstance().method5306());
        if (Class9570.field41432.method22634()) {
            Class9570.method35837(class5902, Class9570.field41432, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Config.warn("Field not found: EnderDragonRenderer.model");
        return null;
    }
}
