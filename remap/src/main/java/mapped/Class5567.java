// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5567 extends Class5509
{
    public Class5567() {
        super(EntityType.field29034, "tropical_fish_a", 0.2f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5849<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5849)) {
            return null;
        }
        final Class5849 class5902 = (Class5849)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.field41548.method21625(class5902, 0);
        }
        if (s.equals("tail")) {
            return (Class6300)Class9570.field41548.method21625(class5902, 1);
        }
        if (s.equals("fin_right")) {
            return (Class6300)Class9570.field41548.method21625(class5902, 2);
        }
        if (!s.equals("fin_left")) {
            return s.equals("fin_top") ? ((Class6300)Class9570.field41548.method21625(class5902, 4)) : null;
        }
        return (Class6300)Class9570.field41548.method21625(class5902, 3);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "tail", "fin_right", "fin_left", "fin_top" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class8551 method5306 = Minecraft.method5277().method5306();
        Class4703 obj = method5306.method28719().get(Class835.class);
        if (!(obj instanceof Class4773)) {
            Config.warn("Not a TropicalFishRenderer: " + obj);
            return null;
        }
        if (obj.method13960() == null) {
            final Class4773 class5902 = new Class4773(method5306);
            class5902.field20284 = field20284;
            obj = class5902;
        }
        final Class4773 class5903 = (Class4773)obj;
        if (Class9570.field41580.method22634()) {
            Class9570.field41580.method22633(class5903, class5901);
            return (Class9559)class5903;
        }
        Config.warn("Model field not found: RenderTropicalFish.modelA");
        return null;
    }
}
