// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public final class Class7224 implements Class7220
{
    public final /* synthetic */ Set field28019;
    public final /* synthetic */ Class3644 field28020;
    
    public Class7224(final Set field28019, final Class3644 field28020) {
        this.field28019 = field28019;
        this.field28020 = field28020;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (this.field28019.contains(class9223.method34010())) {
            Class8881.field37361.put(class9223.method34011(), this.field28020);
            if (class9223.method34008("half").equals("lower")) {
                class9223.method34007("half", "upper");
                Class3644.method11208().put(class9223.method34011(), class9223.method34006());
            }
        }
    }
}
