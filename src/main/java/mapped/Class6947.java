// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;

public class Class6947 implements Class6943
{
    private Class7363 field27203;
    private String field27204;
    
    public Class6947(final Class7363 field27203, final String field27204) {
        this.field27203 = null;
        this.field27204 = null;
        this.field27203 = field27203;
        this.field27204 = field27204;
    }
    
    @Override
    public Field method21325() {
        final Class method22622 = this.field27203.method22622();
        if (method22622 == null) {
            return null;
        }
        try {
            final Field method22623 = this.method21326(method22622, this.field27204);
            method22623.setAccessible(true);
            return method22623;
        }
        catch (final NoSuchFieldException ex) {
            Class7497.method23338("(Reflector) Field not present: " + method22622.getName() + "." + this.field27204);
            return null;
        }
        catch (final SecurityException ex2) {
            ex2.printStackTrace();
            return null;
        }
        catch (final Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
    
    private Field method21326(final Class clazz, final String s) throws NoSuchFieldException {
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; ++i) {
            final Field field = declaredFields[i];
            if (field.getName().equals(s)) {
                return field;
            }
        }
        if (clazz != Object.class) {
            return this.method21326(clazz.getSuperclass(), s);
        }
        throw new NoSuchFieldException(s);
    }
}
