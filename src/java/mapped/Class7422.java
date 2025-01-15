// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

public abstract class Class7422
{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        for (final Field field : this.getClass().getFields()) {
            if (!method22836(field)) {
                try {
                    sb.append(field.getName()).append("=").append(field.get(this)).append(" ");
                }
                catch (final IllegalAccessException ex) {}
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append('}');
        return sb.toString();
    }
    
    private static boolean method22836(final Field field) {
        return Modifier.isStatic(field.getModifiers());
    }
}
