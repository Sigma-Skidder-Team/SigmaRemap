// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ResourceBundle;

public class Class7517 implements Class7518
{
    private final ResourceBundle field29125;
    
    public Class7517(final String baseName) {
        this.field29125 = ResourceBundle.getBundle(baseName);
    }
    
    @Override
    public String method23447(final String s) {
        return this.field29125.containsKey(s) ? this.field29125.getString(s) : null;
    }
    
    public ResourceBundle method23448() {
        return this.field29125;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7517)) {
            return false;
        }
        final Class7517 class7517 = (Class7517)o;
        if (class7517.method23449(this)) {
            final ResourceBundle method23448 = this.method23448();
            final ResourceBundle method23449 = class7517.method23448();
            if (method23448 != null) {
                return method23448.equals(method23449);
            }
            else return method23449 == null;
        }
        return false;
    }
    
    public boolean method23449(final Object o) {
        return o instanceof Class7517;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final ResourceBundle method23448 = this.method23448();
        return n * 59 + ((method23448 != null) ? method23448.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "TranslationRegistry.ResourceBundleProvider(bundle=" + this.method23448() + ")";
    }
}
