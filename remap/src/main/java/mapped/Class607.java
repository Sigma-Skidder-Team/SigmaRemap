// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Class607 extends Class605<Class594>
{
    private static String[] field3558;
    private final Class705 field3559;
    private int field3560;
    
    public Class607(final Class705 field3559, final Minecraft class869) {
        super(class869, field3559.width + 45, field3559.height, 43, field3559.height - 32, 20);
        this.field3559 = field3559;
        final Class350[] array = (Class350[])ArrayUtils.clone((Object[])class869.field4648.field23460);
        Arrays.sort(array);
        Object anObject = null;
        for (final Class350 class870 : array) {
            final String method1057 = class870.method1057();
            if (!method1057.equals(anObject)) {
                anObject = method1057;
                ((Class604<Class596>)this).method3536(new Class596(this, method1057));
            }
            final int method1058 = class869.fontRenderer.method6617(Class8822.method30773(class870.method1060(), new Object[0]));
            if (method1058 > this.field3560) {
                this.field3560 = method1058;
            }
            ((Class604<Class595>)this).method3536(new Class595(this, class870, null));
        }
    }
    
    @Override
    public int method3555() {
        return super.method3555() + 15;
    }
    
    @Override
    public int method3529() {
        return super.method3529() + 32;
    }
}
