// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Constructor;
import java.util.UUID;
import java.util.Calendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Class6008 extends Class6002
{
    public final /* synthetic */ Class6589 field24482;
    
    public Class6008(final Class6589 field24482) {
        this.field24482 = field24482;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Class7577 class7577 = (Class7577)class7576;
        final Class<?> method23849 = class7577.method23849();
        try {
            return this.field24482.method19994(method23849, class7577, false);
        }
        catch (final InstantiationException ex) {
            Object o;
            if (method23849.isPrimitive() || method23849 == String.class || Number.class.isAssignableFrom(method23849) || method23849 == Boolean.class || Date.class.isAssignableFrom(method23849) || method23849 == Character.class || method23849 == BigInteger.class || method23849 == BigDecimal.class || Enum.class.isAssignableFrom(method23849) || Class8542.field35869.equals(class7577.method23845()) || Calendar.class.isAssignableFrom(method23849) || method23849 == UUID.class) {
                o = this.method17926(method23849, class7577);
            }
            else {
                final Constructor[] declaredConstructors = method23849.getDeclaredConstructors();
                int n = 0;
                Constructor declaredConstructor = null;
                for (final Constructor constructor : declaredConstructors) {
                    if (constructor.getParameterTypes().length == 1) {
                        ++n;
                        declaredConstructor = constructor;
                    }
                }
                if (declaredConstructor == null) {
                    try {
                        return this.field24482.method19994(method23849, class7577, false);
                    }
                    catch (final InstantiationException ex2) {
                        throw new Class2386("No single argument constructor found for " + method23849 + " : " + ex2.getMessage());
                    }
                }
                Object o2;
                if (n == 1) {
                    o2 = this.method17926(declaredConstructor.getParameterTypes()[0], class7577);
                }
                else {
                    o2 = this.field24482.method19986(class7577);
                    try {
                        declaredConstructor = method23849.getDeclaredConstructor(String.class);
                    }
                    catch (final Exception ex3) {
                        throw new Class2386("Can't construct a java object for scalar " + class7577.method23845() + "; No String constructor found. Exception=" + ex3.getMessage(), ex3);
                    }
                }
                try {
                    declaredConstructor.setAccessible(true);
                    o = declaredConstructor.newInstance(o2);
                }
                catch (final Exception ex4) {
                    throw new Class2390(null, null, "Can't construct a java object for scalar " + class7577.method23845() + "; exception=" + ex4.getMessage(), class7577.method23847(), ex4);
                }
            }
            return o;
        }
    }
    
    private Object method17926(final Class obj, final Class7577 class7577) {
        Object o;
        if (obj == String.class) {
            o = this.field24482.field26129.get(Class8542.field35875).method17922(class7577);
        }
        else if (obj == Boolean.class || obj == Boolean.TYPE) {
            o = this.field24482.field26129.get(Class8542.field35873).method17922(class7577);
        }
        else if (obj == Character.class || obj == Character.TYPE) {
            final String str = (String)this.field24482.field26129.get(Class8542.field35875).method17922(class7577);
            if (str.length() == 0) {
                o = null;
            }
            else {
                if (str.length() != 1) {
                    throw new Class2386("Invalid node Character: '" + str + "'; length: " + str.length());
                }
                o = str.charAt(0);
            }
        }
        else if (Date.class.isAssignableFrom(obj)) {
            final Date date = (Date)this.field24482.field26129.get(Class8542.field35872).method17922(class7577);
            if (obj == Date.class) {
                o = date;
            }
            else {
                try {
                    o = obj.getConstructor(Long.TYPE).newInstance(date.getTime());
                }
                catch (final RuntimeException ex) {
                    throw ex;
                }
                catch (final Exception ex2) {
                    throw new Class2386("Cannot construct: '" + obj + "'");
                }
            }
        }
        else if (obj == Float.class || obj == Double.class || obj == Float.TYPE || obj == Double.TYPE || obj == BigDecimal.class) {
            if (obj == BigDecimal.class) {
                o = new BigDecimal(class7577.method23856());
            }
            else {
                o = this.field24482.field26129.get(Class8542.field35871).method17922(class7577);
                if (obj == Float.class || obj == Float.TYPE) {
                    o = ((Double)o).floatValue();
                }
            }
        }
        else if (obj == Byte.class || obj == Short.class || obj == Integer.class || obj == Long.class || obj == BigInteger.class || obj == Byte.TYPE || obj == Short.TYPE || obj == Integer.TYPE || obj == Long.TYPE) {
            final Object method17922 = this.field24482.field26129.get(Class8542.field35870).method17922(class7577);
            if (obj == Byte.class || obj == Byte.TYPE) {
                o = Byte.valueOf(method17922.toString());
            }
            else if (obj == Short.class || obj == Short.TYPE) {
                o = Short.valueOf(method17922.toString());
            }
            else if (obj == Integer.class || obj == Integer.TYPE) {
                o = Integer.parseInt(method17922.toString());
            }
            else if (obj == Long.class || obj == Long.TYPE) {
                o = Long.valueOf(method17922.toString());
            }
            else {
                o = new BigInteger(method17922.toString());
            }
        }
        else if (Enum.class.isAssignableFrom(obj)) {
            final String method17923 = class7577.method23856();
            try {
                o = Enum.valueOf((Class<Double>)obj, method17923);
            }
            catch (final Exception ex3) {
                throw new Class2386("Unable to find enum value '" + method17923 + "' for enum class: " + obj.getName());
            }
        }
        else if (Calendar.class.isAssignableFrom(obj)) {
            final Class6007 class7578 = new Class6007();
            class7578.method17922(class7577);
            o = class7578.method17925();
        }
        else if (Number.class.isAssignableFrom(obj)) {
            o = new Class6009(this.field24482).method17922(class7577);
        }
        else if (UUID.class == obj) {
            o = UUID.fromString(class7577.method23856());
        }
        else {
            if (!this.field24482.field26129.containsKey(class7577.method23845())) {
                throw new Class2386("Unsupported class: " + obj);
            }
            o = this.field24482.field26129.get(class7577.method23845()).method17922(class7577);
        }
        return o;
    }
}
