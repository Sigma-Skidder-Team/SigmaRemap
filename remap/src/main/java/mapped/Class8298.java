// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.w3c.dom.Element;

public class Class8298 extends Class8299
{
    private static String[] field34108;
    private Element field34109;
    
    public Class8298(final String s, final Element field34109) {
        super(s);
        this.field34109 = field34109;
    }
    
    @Override
    public String method27579(final String s) {
        String s2 = super.method27579(s);
        if (s2 == null) {
            s2 = this.field34109.getAttribute(s);
        }
        return s2;
    }
    
    public Element method27580() {
        return this.field34109;
    }
}
