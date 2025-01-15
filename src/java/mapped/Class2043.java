// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.List;

public enum Class2043
{
    field11642, 
    field11643;
    
    public <T, P extends Class1921> int method8128(final List<T> list, final T t, final Function<T, P> function, final boolean b) {
        if ((b ? this.method8129() : this) != Class2043.field11643) {
            int i;
            for (i = list.size() - 1; i >= 0; --i) {
                final Class1921 class1921 = function.apply(list.get(i));
                if (!class1921.method7623()) {
                    break;
                }
                if (class1921.method7624() != this) {
                    break;
                }
            }
            list.add(i + 1, t);
            return i + 1;
        }
        int j;
        for (j = 0; j < list.size(); ++j) {
            final Class1921 class1922 = function.apply(list.get(j));
            if (!class1922.method7623()) {
                break;
            }
            if (class1922.method7624() != this) {
                break;
            }
        }
        list.add(j, t);
        return j;
    }
    
    public Class2043 method8129() {
        return (this != Class2043.field11642) ? Class2043.field11642 : Class2043.field11643;
    }
}
