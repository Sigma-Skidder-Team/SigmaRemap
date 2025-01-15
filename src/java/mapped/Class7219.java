// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.List;

public final class Class7219 implements Class7220
{
    public final /* synthetic */ List field28014;
    public final /* synthetic */ Class3649 field28015;
    
    public Class7219(final List field28014, final Class3649 field28015) {
        this.field28014 = field28014;
        this.field28015 = field28015;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        final int index = this.field28014.indexOf(class9223.method34010());
        if (index == -1) {
            return;
        }
        if (class9223.method34008("waterlogged").equals("true")) {
            return;
        }
        final String method34008 = class9223.method34008("shape");
        byte b = 0;
        switch (method34008) {
            case "straight": {
                b = 0;
                break;
            }
            case "inner_left": {
                b = 1;
                break;
            }
            case "inner_right": {
                b = 2;
                break;
            }
            case "outer_left": {
                b = 3;
                break;
            }
            case "outer_right": {
                b = 4;
                break;
            }
            default: {
                return;
            }
        }
        final Class9068 class9224 = new Class9068(class9223.method34008("half").equals("bottom"), b, (byte)index, Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)));
        Class3649.method11229().put(class9223.method34011(), class9224);
        Class3649.method11231().put(Class3649.method11230(class9224), class9223.method34011());
        Class8881.field37361.put(class9223.method34011(), this.field28015);
    }
}
