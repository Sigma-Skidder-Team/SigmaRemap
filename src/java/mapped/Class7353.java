// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.TimeZone;
import java.util.Map;

public class Class7353 extends Class7352
{
    public Map<Class<?>, Class8542> field28381;
    public TimeZone field28382;
    public static Pattern field28383;
    
    public Class7353() {
        this.field28382 = null;
        this.field28373 = new Class3410(this);
        this.field28372.put(String.class, new Class3403(this));
        this.field28372.put(Boolean.class, new Class3409(this));
        this.field28372.put(Character.class, new Class3403(this));
        this.field28372.put(UUID.class, new Class3407(this));
        this.field28372.put(byte[].class, new Class3406(this));
        final Class3412 class3412 = new Class3412(this);
        this.field28372.put(short[].class, class3412);
        this.field28372.put(int[].class, class3412);
        this.field28372.put(long[].class, class3412);
        this.field28372.put(float[].class, class3412);
        this.field28372.put(double[].class, class3412);
        this.field28372.put(char[].class, class3412);
        this.field28372.put(boolean[].class, class3412);
        this.field28374.put(Number.class, new Class3397(this));
        this.field28374.put(List.class, new Class3402(this));
        this.field28374.put(Map.class, new Class3408(this));
        this.field28374.put(Set.class, new Class3400(this));
        this.field28374.put(Iterator.class, new Class3405(this));
        this.field28374.put(new Object[0].getClass(), new Class3411(this));
        this.field28374.put(Date.class, new Class3404(this));
        this.field28374.put(Enum.class, new Class3399(this));
        this.field28374.put(Calendar.class, new Class3404(this));
        this.field28381 = new HashMap<Class<?>, Class8542>();
    }
    
    public Class8542 method22585(final Class<?> clazz, final Class8542 class8542) {
        if (!this.field28381.containsKey(clazz)) {
            return class8542;
        }
        return this.field28381.get(clazz);
    }
    
    public Class8542 method22586(final Class<?> clazz, final Class8542 class8542) {
        if (class8542 != null) {
            return this.field28381.put(clazz, class8542);
        }
        throw new NullPointerException("Tag must be provided.");
    }
    
    public TimeZone method22587() {
        return this.field28382;
    }
    
    public void method22588(final TimeZone field28382) {
        this.field28382 = field28382;
    }
    
    static {
        Class7353.field28383 = Pattern.compile("\n|\u0085|\u2028|\u2029");
    }
}
