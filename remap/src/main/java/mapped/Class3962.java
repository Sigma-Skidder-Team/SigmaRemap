// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3962 extends Class3833
{
    private static String[] field17903;
    private final Class3833 field17904;
    
    public Class3962(final Class3833 field17904, final Class9288 class9288) {
        super(class9288);
        this.field17904 = field17904;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!this.method12091(class7097, class7098)) {
            class7097.method6688(class7098, this.field17904.method11878(), 2);
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!this.method12091(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 60 + class7099.method6790().nextInt(40));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public boolean method12091(final Class1855 class1855, final BlockPos class1856) {
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (class1855.method6702(class1856.method1149(values[i])).method21793(Class7324.field28319)) {
                return true;
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        if (!this.method12091(class7074.method21654(), class7074.method21639())) {
            class7074.method21654().method6833().method21345(class7074.method21639(), this, 60 + class7074.method21654().method6790().nextInt(40));
        }
        return this.method11878();
    }
}
