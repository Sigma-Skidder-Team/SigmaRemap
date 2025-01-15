// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.math.BigInteger;

public class Class3397 implements Class3398
{
    public final /* synthetic */ Class7353 field16117;
    
    public Class3397(final Class7353 field16117) {
        this.field16117 = field16117;
    }
    
    @Override
    public Class7576 method10839(final Object o) {
        if (!(o instanceof Byte)) {
            if (!(o instanceof Short)) {
                if (!(o instanceof Integer)) {
                    if (!(o instanceof Long)) {
                        if (!(o instanceof BigInteger)) {
                            final Number n = (Number)o;
                            final Class8542 class8542 = Class8542.field35871;
                            if (n.equals(Double.NaN)) {
                                final String s = ".NaN";
                                return this.field16117.method22575(this.field16117.method22585(o.getClass(), class8542), s);
                            }
                            if (n.equals(Double.POSITIVE_INFINITY)) {
                                final String s = ".inf";
                                return this.field16117.method22575(this.field16117.method22585(o.getClass(), class8542), s);
                            }
                            if (!n.equals(Double.NEGATIVE_INFINITY)) {
                                final String s = n.toString();
                                return this.field16117.method22575(this.field16117.method22585(o.getClass(), class8542), s);
                            }
                            final String s = "-.inf";
                            return this.field16117.method22575(this.field16117.method22585(o.getClass(), class8542), s);
                        }
                    }
                }
            }
        }
        final Class8542 class8542 = Class8542.field35870;
        final String s = o.toString();
        return this.field16117.method22575(this.field16117.method22585(o.getClass(), class8542), s);
    }
}
