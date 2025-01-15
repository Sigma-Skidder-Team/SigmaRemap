// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Array;
import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public abstract class Class61 implements Cloneable
{
    private String field142;
    
    public Class61(final String field142) {
        this.field142 = field142;
    }
    
    public final String method375() {
        return this.field142;
    }
    
    public abstract Object method374();
    
    public abstract void method372(final DataInput p0) throws IOException;
    
    public abstract void method373(final DataOutput p0) throws IOException;
    
    public abstract Class61 clone();
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class61)) {
            return false;
        }
        final Class61 class61 = (Class61)o;
        if (!this.method375().equals(class61.method375())) {
            return false;
        }
        if (this.method374() == null) {
            return class61.method374() == null;
        }
        if (class61.method374() == null) {
            return false;
        }
        if (!this.method374().getClass().isArray() || !class61.method374().getClass().isArray()) {
            return this.method374().equals(class61.method374());
        }
        final int length = Array.getLength(this.method374());
        if (Array.getLength(class61.method374()) == length) {
            for (int i = 0; i < length; ++i) {
                final Object value = Array.get(this.method374(), i);
                final Object value2 = Array.get(class61.method374(), i);
                if ((value == null && value2 != null) || (value != null && !value.equals(value2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        final String str = (this.method375() != null && !this.method375().equals("")) ? ("(" + this.method375() + ")") : "";
        String str2 = "";
        if (this.method374() != null) {
            str2 = this.method374().toString();
            if (this.method374().getClass().isArray()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int i = 0; i < Array.getLength(this.method374()); ++i) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(Array.get(this.method374(), i));
                }
                sb.append("]");
                str2 = sb.toString();
            }
        }
        return this.getClass().getSimpleName() + str + " { " + str2 + " }";
    }
}
