// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Class622 extends Class593<Class622>
{
    private static String[] field3601;
    private final List<Class573> field3602;
    
    private Class622(final List<Class573> field3602) {
        this.field3602 = field3602;
    }
    
    public static Class622 method3620(final Class5760 class5760, final int n, final Class6469 class5761) {
        return new Class622((List<Class573>)ImmutableList.of((Object)class5761.method19362(class5760, n / 2 - 155, 0, 310)));
    }
    
    public static Class622 method3621(final Class5760 class5760, final int n, final Class6469 class5761, final Class6469 class5762) {
        final Class573 method19362 = class5761.method19362(class5760, n / 2 - 155, 0, 150);
        return (class5762 != null) ? new Class622((List<Class573>)ImmutableList.of((Object)method19362, (Object)class5762.method19362(class5760, n / 2 - 155 + 160, 0, 150))) : new Class622((List<Class573>)ImmutableList.of((Object)method19362));
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3602.forEach(class573 -> {
            class573.field3427 = field3427;
            class573.method2975(n9, n10, n11);
        });
    }
    
    @Override
    public List<? extends IGuiEventListener> children() {
        return this.field3602;
    }
}
