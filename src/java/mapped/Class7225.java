// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public class Class7225 implements Class7220
{
    public final /* synthetic */ String field28021;
    public final /* synthetic */ Class3646 field28022;
    public final /* synthetic */ String field28023;
    public final /* synthetic */ Class3646 field28024;
    
    public Class7225(final Class3646 field28024, final String field28025, final Class3646 field28026, final String field28027) {
        this.field28024 = field28024;
        this.field28021 = field28025;
        this.field28022 = field28026;
        this.field28023 = field28027;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (class9223.method34011() == Class3646.method11219(this.field28024) || this.field28021.equals(class9223.method34010())) {
            if (class9223.method34011() != Class3646.method11219(this.field28024)) {
                Class3646.method11220(this.field28022).add(class9223.method34011());
            }
            Class8881.field37361.put(class9223.method34011(), this.field28022);
        }
        if (class9223.method34010().equals(this.field28023)) {
            Class3646.method11221(this.field28024).put(Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)), class9223.method34011());
        }
    }
}
