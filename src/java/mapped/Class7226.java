// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public final class Class7226 implements Class7220
{
    public final /* synthetic */ Class3657 field28025;
    
    public Class7226(final Class3657 field28025) {
        this.field28025 = field28025;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (!class9223.method34010().equals("minecraft:tripwire_hook")) {
            if (class9223.method34010().equals("minecraft:tripwire")) {
                Class3657.method11256().put(class9223.method34011(), new Class8387(class9223.method34008("attached").equals("true"), class9223.method34008("disarmed").equals("true"), class9223.method34008("powered").equals("true")));
                Class3657.method11258().put(Class3657.method11257(class9223), class9223.method34011());
                Class8881.field37361.put(class9223.method34011(), this.field28025);
            }
        }
        else {
            Class3657.method11255().put(class9223.method34011(), Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)));
        }
    }
}
