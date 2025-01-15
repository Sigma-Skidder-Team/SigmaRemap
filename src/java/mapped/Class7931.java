// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class7931 extends Class7930
{
    private final Class399 field32596;
    
    public Class7931(final String s, final Class399 class399, final Class399 field32596) {
        super(s, class399);
        this.field32596 = field32596;
    }
    
    @Nullable
    @Override
    public Class399 method25713() {
        return this.field32594;
    }
    
    @Nullable
    @Override
    public Class399 method25714() {
        return this.field32596;
    }
    
    @Override
    public Class2250 method25690(final Class511 class511) {
        final Class2250 class512 = (this.field32596 != null) ? this.field32596.method1871() : this.field32594.method1871();
        final Class8321 class513 = (this.field32596 instanceof Class511) ? ((Class511)this.field32596).method2713() : Class8321.field34174;
        final String string = "death.attack." + this.field32593;
        final String string2 = string + ".item";
        return (!class513.method27620() && class513.method27667()) ? new Class2259(string2, new Object[] { class511.method1871(), class512, class513.method27684() }) : new Class2259(string, new Object[] { class511.method1871(), class512 });
    }
}
