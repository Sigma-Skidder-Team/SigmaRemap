// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4468 implements Comparator<Class354>
{
    private static String[] field19827;
    public final /* synthetic */ Class3219 field19828;
    
    public Class4468(final Class3219 field19828) {
        this.field19828 = field19828;
    }
    
    @Override
    public int compare(final Class354 class354, final Class354 class355) {
        return (Math.sqrt(Class3219.method10148().field4684.method1733(class354.method1074() + 0.5, class354.method1075() + 0.5, class354.method1076() + 0.5)) <= Math.sqrt(Class3219.method10149().field4684.method1733(class355.method1074() + 0.5, class355.method1075() + 0.5, class355.method1076() + 0.5))) ? -1 : 1;
    }
}
