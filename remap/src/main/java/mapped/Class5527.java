// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5527 extends Class5509
{
    public Class5527() {
        super(EntityType.field29013, "puffer_fish_medium", 0.2f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5883<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5883)) {
            return null;
        }
        final Class5883 class5902 = (Class5883)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 0);
        }
        if (s.equals("fin_right")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 1);
        }
        if (s.equals("fin_left")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 2);
        }
        if (s.equals("spikes_front_top")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 3);
        }
        if (s.equals("spikes_back_top")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 4);
        }
        if (s.equals("spikes_front_right")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 5);
        }
        if (s.equals("spikes_back_right")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 6);
        }
        if (s.equals("spikes_back_left")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 7);
        }
        if (s.equals("spikes_front_left")) {
            return (Class6300)Class9570.field41516.method21625(class5902, 8);
        }
        if (!s.equals("spikes_back_bottom")) {
            return s.equals("spikes_front_bottom") ? ((Class6300)Class9570.field41516.method21625(class5902, 10)) : null;
        }
        return (Class6300)Class9570.field41516.method21625(class5902, 9);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "fin_right", "fin_left", "spikes_front_top", "spikes_back_top", "spikes_front_right", "spikes_back_right", "spikes_back_left", "spikes_front_left", "spikes_back_bottom", "spikes_front_bottom" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class8551 method5306 = Minecraft.getInstance().method5306();
        Class4703 obj = method5306.method28719().get(Class838.class);
        if (!(obj instanceof Class4741)) {
            Config.warn("Not a PufferfishRenderer: " + obj);
            return null;
        }
        if (obj.method13960() == null) {
            final Class4741 class5902 = new Class4741(method5306);
            class5902.field20284 = field20284;
            obj = class5902;
        }
        final Class4741 class5903 = (Class4741)obj;
        if (Class9570.field41573.method22634()) {
            Class9570.field41573.method22633(class5903, class5901);
            return (Class9559)class5903;
        }
        Config.warn("Model field not found: RenderPufferfish.modelMedium");
        return null;
    }
}
