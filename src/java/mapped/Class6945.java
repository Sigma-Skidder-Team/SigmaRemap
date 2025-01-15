// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;

public class Class6945 implements Class6943
{
    private Class7363 field27199;
    private Class field27200;
    private int field27201;
    
    public Class6945(final Class7363 class7363, final Class clazz) {
        this(class7363, clazz, 0);
    }
    
    public Class6945(final Class7363 field27199, final Class field27200, final int field27201) {
        this.field27199 = null;
        this.field27200 = null;
        this.field27199 = field27199;
        this.field27200 = field27200;
        this.field27201 = field27201;
    }
    
    @Override
    public Field method21325() {
        final Class method22622 = this.field27199.method22622();
        if (method22622 == null) {
            return null;
        }
        try {
            final Field[] declaredFields = method22622.getDeclaredFields();
            int n = 0;
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == this.field27200) {
                    if (n == this.field27201) {
                        field.setAccessible(true);
                        return field;
                    }
                    ++n;
                }
            }
            Class7497.method23338("(Reflector) Field not present: " + method22622.getName() + ".(type: " + this.field27200 + ", index: " + this.field27201 + ")");
            return null;
        }
        catch (final SecurityException ex) {
            ex.printStackTrace();
            return null;
        }
        catch (final Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
}
