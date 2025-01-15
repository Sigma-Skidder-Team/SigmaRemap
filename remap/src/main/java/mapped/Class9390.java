// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class9390
{
    private final Class1961 field40296;
    private final ITextComponent field40297;
    
    public Class9390(final Class1961 field40296, final ITextComponent field40297) {
        this.field40296 = field40296;
        this.field40297 = field40297;
    }
    
    public Class1961 method34911() {
        return this.field40296;
    }
    
    public ITextComponent method34912() {
        return this.field40297;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class9390 class9390 = (Class9390)o;
        if (this.field40296 == class9390.field40296) {
            if (this.field40297 == null) {
                if (class9390.field40297 != null) {
                    return false;
                }
            }
            else if (!this.field40297.equals(class9390.field40297)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "HoverEvent{action=" + this.field40296 + ", value='" + this.field40297 + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field40296.hashCode() + ((this.field40297 == null) ? 0 : this.field40297.hashCode());
    }
}
