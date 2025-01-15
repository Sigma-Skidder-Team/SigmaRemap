// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Deprecated
public class Class7965 extends Class7966
{
    private Field field32733;
    private Object field32734;
    
    public static boolean method25809(final Field field) {
        if (field.getDeclaringClass().isAnnotationPresent(Class6756.class)) {
            if (field.getType().isPrimitive() || field.getType() == String.class) {
                if (field.isAnnotationPresent(Class6751.class)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public Class7965(final Field field32733, final Object field32734) {
        this.field32734 = field32734;
        (this.field32733 = field32733).setAccessible(true);
        final String method20566 = field32733.getAnnotation(Class6751.class).method20566();
        this.field32735 = method20566;
        if (Class8272.method27500(method20566)) {
            this.field32735 = field32733.getName();
        }
    }
    
    public Field method25810() {
        return this.field32733;
    }
    
    @Override
    public void method25811(final String s, final String... array) {
        try {
            if (this.field32733.getType() == Byte.TYPE) {
                this.field32733.setByte(this.field32734, Byte.parseByte(array[0]));
            }
            else if (this.field32733.getType() == Character.TYPE) {
                this.field32733.setChar(this.field32734, array[0].charAt(0));
            }
            else if (this.field32733.getType() == Boolean.TYPE) {
                this.field32733.setBoolean(this.field32734, Boolean.parseBoolean(array[0]));
            }
            else if (this.field32733.getType() == Short.TYPE) {
                this.field32733.setShort(this.field32734, Short.parseShort(array[0]));
            }
            else if (this.field32733.getType() == Integer.TYPE) {
                this.field32733.setInt(this.field32734, Integer.parseInt(array[0]));
            }
            else if (this.field32733.getType() == Long.TYPE) {
                this.field32733.setLong(this.field32734, Long.parseLong(array[0]));
            }
            else if (this.field32733.getType() == Float.TYPE) {
                this.field32733.setFloat(this.field32734, Float.parseFloat(array[0]));
            }
            else if (this.field32733.getType() == Double.TYPE) {
                this.field32733.setDouble(this.field32734, Double.parseDouble(array[0]));
            }
            else {
                if (this.field32733.getType() != String.class) {
                    throw new IllegalStateException("Should never have gotten here, forgot to implement " + this.field32733.getType().getName() + "?");
                }
                this.field32733.set(this.field32734, array[0]);
            }
        }
        catch (final Exception ex) {
            Class9463.method35173().method35187().method20242(array[0] + "is an invalid input for variable " + this.field32734.getClass().getName() + "::" + this.field32733.getName());
            ex.printStackTrace();
        }
    }
    
    public static String method25812(final Class clazz) {
        if (clazz != Byte.TYPE) {
            if (clazz != Short.TYPE) {
                if (clazz != Integer.TYPE) {
                    if (clazz != Long.TYPE) {
                        if (clazz == Character.TYPE) {
                            return "[char]";
                        }
                        if (clazz == Float.TYPE || clazz == Double.TYPE) {
                            return "[decimal]";
                        }
                        if (clazz != String.class && clazz != Object.class) {
                            return null;
                        }
                        return "[string]";
                    }
                }
            }
        }
        return "[number]";
    }
    
    @Override
    public String method25813(final String str, final String... array) {
        final StringBuilder sb = new StringBuilder(str);
        if (array != null) {
            if (array.length > 0) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    sb.append(" ").append(array[i]);
                }
            }
            else {
                sb.append(" ").append(method25812(this.field32733.getType()));
            }
        }
        return sb.toString();
    }
}
