// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.w3c.dom.Element;

public class Class2325 extends Class2324
{
    public Class2325(final String str, final String str2, final Throwable t) {
        super("(" + str + ") " + str2, t);
    }
    
    public Class2325(final Element element, final String str, final Throwable t) {
        super("(" + element.getAttribute("id") + ") " + str, t);
    }
    
    public Class2325(final String str, final String str2) {
        super("(" + str + ") " + str2);
    }
    
    public Class2325(final Element element, final String str) {
        super("(" + element.getAttribute("id") + ") " + str);
    }
}
