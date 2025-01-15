// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

public class Class6015 implements Class5997
{
    public final /* synthetic */ Class6589 field24490;
    
    public Class6015(final Class6589 field24490) {
        this.field24490 = field24490;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Class7575 class7577 = (Class7575)class7576;
        if (!Map.class.isAssignableFrom(class7576.method23849())) {
            if (!Collection.class.isAssignableFrom(class7576.method23849())) {
                final Object method19992 = this.field24490.method19992(class7577);
                if (!class7576.method23852()) {
                    return this.method17927(class7577, method19992);
                }
                return method19992;
            }
            else {
                if (!class7576.method23852()) {
                    return this.field24490.method20003(class7577);
                }
                return this.field24490.method19995(class7577);
            }
        }
        else {
            if (!class7576.method23852()) {
                return this.field24490.method20004(class7577);
            }
            return this.field24490.method19997(class7577);
        }
    }
    
    @Override
    public void method17923(final Class7576 class7576, final Object o) {
        if (!Map.class.isAssignableFrom(class7576.method23849())) {
            if (!Set.class.isAssignableFrom(class7576.method23849())) {
                this.method17927((Class7575)class7576, o);
            }
            else {
                this.field24490.method20006((Class7575)class7576, (Set<Object>)o);
            }
        }
        else {
            this.field24490.method20005((Class7575)class7576, (Map<Object, Object>)o);
        }
    }
    
    public Object method17927(final Class7575 class7575, final Object obj) {
        this.field24490.method20013(class7575);
        final Class<?> method23849 = class7575.method23849();
        for (final Class9474 class7576 : class7575.method23835()) {
            if (!(class7576.method35260() instanceof Class7577)) {
                throw new Class2386("Keys must be scalars but found: " + class7576.method35260());
            }
            final Class7577 class7577 = (Class7577)class7576.method35260();
            final Class7576 method23850 = class7576.method35261();
            class7577.method23850(String.class);
            final String s = (String)this.field24490.method19983(class7577);
            try {
                final Class8051 class7578 = this.field24490.field26140.get(method23849);
                final Class1935 class7579 = (class7578 == null) ? this.method17929(method23849, s) : class7578.method26414(s);
                if (!class7579.method7824()) {
                    throw new Class2386("No writable property '" + s + "' on class: " + method23849.getName());
                }
                method23850.method23850(class7579.method7821());
                if ((class7578 == null || !class7578.method26421(s, method23850)) && method23850.method23834() != Class2085.field12055) {
                    final Class<?>[] method23851 = class7579.method7822();
                    if (method23851 != null && method23851.length > 0) {
                        if (method23850.method23834() == Class2085.field12056) {
                            ((Class7573)method23850).method23836(method23851[0]);
                        }
                        else if (Set.class.isAssignableFrom(method23850.method23849())) {
                            final Class<?> clazz = method23851[0];
                            final Class7575 class7580 = (Class7575)method23850;
                            class7580.method23841(clazz);
                            class7580.method23854(true);
                        }
                        else if (Map.class.isAssignableFrom(method23850.method23849())) {
                            final Class<?> clazz2 = method23851[0];
                            final Class<?> clazz3 = method23851[1];
                            final Class7575 class7581 = (Class7575)method23850;
                            class7581.method23842(clazz2, clazz3);
                            class7581.method23854(true);
                        }
                    }
                }
                Object value = (class7578 != null) ? this.method17928(class7578, s, method23850) : this.field24490.method19983(method23850);
                if ((class7579.method7821() == Float.TYPE || class7579.method7821() == Float.class) && value instanceof Double) {
                    value = ((Double)value).floatValue();
                }
                if (class7579.method7821() == String.class && Class8542.field35869.equals(method23850.method23845()) && value instanceof byte[]) {
                    value = new String((byte[])value);
                }
                if (class7578 != null && class7578.method26422(obj, s, value)) {
                    continue;
                }
                class7579.method7826(obj, value);
            }
            catch (final Class2391 class7582) {
                throw class7582;
            }
            catch (final Exception ex) {
                throw new Class2390("Cannot create property=" + s + " for JavaBean=" + obj, class7575.method23847(), ex.getMessage(), method23850.method23847(), ex);
            }
        }
        return obj;
    }
    
    private Object method17928(final Class8051 class8051, final String s, final Class7576 class8052) {
        final Object method26424 = class8051.method26424(s, class8052);
        if (method26424 == null) {
            return this.field24490.method19983(class8052);
        }
        this.field24490.field26132.put(class8052, method26424);
        return this.field24490.method19984(class8052);
    }
    
    public Class1935 method17929(final Class<?> clazz, final String s) {
        return this.field24490.method20008().method15355(clazz, s);
    }
}
