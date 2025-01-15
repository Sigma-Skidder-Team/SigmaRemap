// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Class2328 extends Exception
{
    public final Map<String, Object> field14065;
    public int field14066;
    
    public Class2328(final Throwable cause) {
        super(cause);
        this.field14065 = new HashMap<String, Object>();
        this.field14066 = 0;
    }
    
    public Class2328 method9449(final String s, final Object o) {
        this.field14065.put(s, o);
        return this;
    }
    
    public Class2328 method9450(final Class<?> clazz) {
        return this.method9449("Source #" + this.field14066++, this.method9451(clazz));
    }
    
    private String method9451(final Class<?> clazz) {
        if (!clazz.isAnonymousClass()) {
            return clazz.getName();
        }
        return clazz.getName() + " (Anonymous)";
    }
    
    @Override
    public String getMessage() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Jello Portal Error\n{");
        int n = 0;
        for (final Map.Entry<String, V> entry : this.field14065.entrySet()) {
            sb.append(((n != 0) ? ", " : "") + entry.getKey() + ": " + entry.getValue().toString());
            ++n;
        }
        sb.append("}\nActual Error: ");
        return sb.toString();
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
