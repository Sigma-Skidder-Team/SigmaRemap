// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

public class Class6209<T> extends Class6208<T>
{
    private static String[] field25051;
    private final Class90<T> field25052;
    
    public Class6209(final Class90<T> field25052, final String s, final String s2) {
        super(field25052::method506, s, false, s2);
        this.field25052 = field25052;
    }
    
    public void method18474(final Class8654 class8654) {
        final Map<Class1932, Class7909<T>> method18467 = this.method18467();
        class8654.method29505(method18467.size());
        for (final Map.Entry<Class1932, V> entry : method18467.entrySet()) {
            class8654.method29517(entry.getKey());
            class8654.method29505(((Class7909)entry.getValue()).method25616().size());
            final Iterator iterator2 = ((Class7909)entry.getValue()).method25616().iterator();
            while (iterator2.hasNext()) {
                class8654.method29505(this.field25052.method504((T)iterator2.next()));
            }
        }
    }
    
    public void method18475(final Class8654 class8654) {
        final HashMap hashMap = Maps.newHashMap();
        for (int method29501 = class8654.method29501(), i = 0; i < method29501; ++i) {
            final Class1932 method29502 = class8654.method29516();
            final int method29503 = class8654.method29501();
            final Class8162<Object> method29504 = Class8162.method26975();
            for (int j = 0; j < method29503; ++j) {
                method29504.method26977(this.field25052.method499(class8654.method29501()));
            }
            hashMap.put(method29502, method29504.method26982(method29502));
        }
        this.method18466(hashMap);
    }
}
