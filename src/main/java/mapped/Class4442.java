// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class Class4442 implements Comparator<Class9081>
{
    private Class4442() {
    }
    
    @Override
    public int compare(final Class9081 class9081, final Class9081 class9082) {
        final Class6749 method32729 = class9081.method32729();
        final Class6749 method32730 = class9082.method32729();
        return ComparisonChain.start().compareTrueFirst(class9081.method32720() != Class101.field301, class9082.method32720() != Class101.field301).compare((Comparable)((method32729 == null) ? "" : method32729.method20539()), (Comparable)((method32730 == null) ? "" : method32730.method20539())).compare((Object)class9081.method32719().getName(), (Object)class9082.method32719().getName(), String::compareToIgnoreCase).result();
    }
}
