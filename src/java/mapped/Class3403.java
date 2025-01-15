// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;

public class Class3403 implements Class3398
{
    public final /* synthetic */ Class7353 field16126;
    
    public Class3403(final Class7353 field16126) {
        this.field16126 = field16126;
    }
    
    @Override
    public Class7576 method10839(final Object o) {
        Class8542 class8542 = Class8542.field35875;
        Class2031 class8543 = null;
        String s = o.toString();
        if (!Class8028.method26319(s)) {
            class8542 = Class8542.field35869;
            char[] method23159;
            try {
                final byte[] bytes = s.getBytes("UTF-8");
                if (!new String(bytes, "UTF-8").equals(s)) {
                    throw new Class2386("invalid string value has occurred");
                }
                method23159 = Class7484.method23159(bytes);
            }
            catch (final UnsupportedEncodingException ex) {
                throw new Class2386(ex);
            }
            s = String.valueOf(method23159);
            class8543 = Class2031.field11577;
        }
        if (this.field16126.field28375 == Class2031.field11579 && Class7353.field28383.matcher(s).find()) {
            class8543 = Class2031.field11577;
        }
        return this.field16126.method22574(class8542, s, class8543);
    }
}
