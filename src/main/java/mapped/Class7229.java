// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.List;

public final class Class7229 implements Class7220
{
    public final /* synthetic */ List field28029;
    public final /* synthetic */ Class3650 field28030;
    
    public Class7229(final List field28029, final Class3650 field28030) {
        this.field28029 = field28029;
        this.field28030 = field28030;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        final int index = this.field28029.indexOf(class9223.method34010());
        if (index != -1) {
            final int method34011 = class9223.method34011();
            final Class7549 class9224 = new Class7549(class9223.method34008("half").equals("lower"), class9223.method34008("hinge").equals("right"), class9223.method34008("powered").equals("true"), class9223.method34008("open").equals("true"), Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)), index);
            Class3650.method11234().put(method34011, class9224);
            Class3650.method11236().put(Class3650.method11235(class9224), method34011);
            Class8881.field37361.put(method34011, this.field28030);
        }
    }
}
