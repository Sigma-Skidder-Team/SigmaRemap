// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public final class Class7221 implements Class7220
{
    public final /* synthetic */ Class3659 field28016;
    
    public Class7221(final Class3659 field28016) {
        this.field28016 = field28016;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (!class9223.method34010().equals("minecraft:chest") && !class9223.method34010().equals("minecraft:trapped_chest")) {
            return;
        }
        if (!class9223.method34008("waterlogged").equals("true")) {
            Class3659.method11265().put(class9223.method34011(), Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)));
            if (class9223.method34010().equalsIgnoreCase("minecraft:trapped_chest")) {
                Class3659.method11266().add(class9223.method34011());
            }
            Class3659.method11268().put(Class3659.method11267(class9223), class9223.method34011());
            Class8881.field37361.put(class9223.method34011(), this.field28016);
        }
    }
}
