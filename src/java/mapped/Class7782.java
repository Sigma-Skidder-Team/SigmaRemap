// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.Map;

public class Class7782
{
    private Class8867 field31856;
    private Map<String, Object> field31857;
    private JsonObject field31858;
    private JsonObject field31859;
    
    public Class8867 method24981() {
        return this.field31856;
    }
    
    public Map<String, Object> method24982() {
        return this.field31857;
    }
    
    public JsonObject method24983() {
        return this.field31858;
    }
    
    public JsonObject method24984() {
        return this.field31859;
    }
    
    public void method24985(final Class8867 field31856) {
        this.field31856 = field31856;
    }
    
    public void method24986(final Map<String, Object> field31857) {
        this.field31857 = field31857;
    }
    
    public void method24987(final JsonObject field31858) {
        this.field31858 = field31858;
    }
    
    public void method24988(final JsonObject field31859) {
        this.field31859 = field31859;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7782)) {
            return false;
        }
        final Class7782 class7782 = (Class7782)o;
        if (class7782.method24989(this)) {
            final Class8867 method24981 = this.method24981();
            final Class8867 method24982 = class7782.method24981();
            if (method24981 != null) {
                if (!method24981.equals(method24982)) {
                    return false;
                }
            }
            else if (method24982 != null) {
                return false;
            }
            final Map<String, Object> method24983 = this.method24982();
            final Map<String, Object> method24984 = class7782.method24982();
            if (method24983 != null) {
                if (!method24983.equals(method24984)) {
                    return false;
                }
            }
            else if (method24984 != null) {
                return false;
            }
            final JsonObject method24985 = this.method24983();
            final JsonObject method24986 = class7782.method24983();
            if (method24985 != null) {
                if (!method24985.equals(method24986)) {
                    return false;
                }
            }
            else if (method24986 != null) {
                return false;
            }
            final JsonObject method24987 = this.method24984();
            final JsonObject method24988 = class7782.method24984();
            if (method24987 != null) {
                if (!method24987.equals(method24988)) {
                    return false;
                }
            }
            else if (method24988 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method24989(final Object o) {
        return o instanceof Class7782;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Class8867 method24981 = this.method24981();
        final int n2 = n * 59 + ((method24981 != null) ? method24981.hashCode() : 43);
        final Map<String, Object> method24982 = this.method24982();
        final int n3 = n2 * 59 + ((method24982 != null) ? method24982.hashCode() : 43);
        final JsonObject method24983 = this.method24983();
        final int n4 = n3 * 59 + ((method24983 != null) ? method24983.hashCode() : 43);
        final JsonObject method24984 = this.method24984();
        return n4 * 59 + ((method24984 != null) ? method24984.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "DumpTemplate(versionInfo=" + this.method24981() + ", configuration=" + this.method24982() + ", platformDump=" + this.method24983() + ", injectionDump=" + this.method24984() + ")";
    }
    
    public Class7782(final Class8867 field31856, final Map<String, Object> field31857, final JsonObject field31858, final JsonObject field31859) {
        this.field31856 = field31856;
        this.field31857 = field31857;
        this.field31858 = field31858;
        this.field31859 = field31859;
    }
}
