// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public final class Class7228 implements Class7220
{
    public final /* synthetic */ Set field28027;
    public final /* synthetic */ Class3642 field28028;
    
    public Class7228(final Set field28027, final Class3642 field28028) {
        this.field28027 = field28027;
        this.field28028 = field28028;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (this.field28027.contains(class9223.method34010())) {
            Class8881.field37361.put(class9223.method34011(), this.field28028);
            class9223.method34007("snowy", "true");
            Class3642.method11203().put(new Class7803(class9223.method34011(), true), class9223.method34006());
            class9223.method34007("snowy", "false");
            Class3642.method11203().put(new Class7803(class9223.method34011(), false), class9223.method34006());
        }
        if (class9223.method34010().equals("minecraft:snow") || class9223.method34010().equals("minecraft:snow_block")) {
            Class8881.field37361.put(class9223.method34011(), this.field28028);
            Class3642.method11204().add(class9223.method34011());
        }
    }
}
