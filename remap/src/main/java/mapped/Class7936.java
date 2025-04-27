// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public final class Class7936
{
    public static final Class7936 field32604;
    private final List<Class7518> field32605;
    
    private void method25736(final Class7518 class7518) {
        this.field32605.add(class7518);
    }
    
    public String method25737(final String s) {
        final Iterator<Class7518> iterator = this.field32605.iterator();
        while (iterator.hasNext()) {
            final String method23447 = iterator.next().method23447(s);
            if (method23447 == null) {
                continue;
            }
            return method23447;
        }
        return s;
    }
    
    public List<Class7518> method25738() {
        return this.field32605;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class7936) {
            final Class7936 class7936 = (Class7936)o;
            final List<Class7518> method25738 = this.method25738();
            final List<Class7518> method25739 = class7936.method25738();
            if (method25738 != null) {
                return method25738.equals(method25739);
            }
            else return method25739 == null;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final List<Class7518> method25738 = this.method25738();
        return n * 59 + ((method25738 != null) ? method25738.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "TranslationRegistry(providers=" + this.method25738() + ")";
    }
    
    private Class7936() {
        this.field32605 = new LinkedList<Class7518>();
    }
    
    static {
        field32604 = new Class7936();
        try {
            Class7936.field32604.method25736(new Class7519("/assets/minecraft/lang/en_us.json"));
        }
        catch (final Exception ex) {}
        try {
            Class7936.field32604.method25736(new Class7517("mojang-translations/en_US"));
        }
        catch (final Exception ex2) {}
    }
}
