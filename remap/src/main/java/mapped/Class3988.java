// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class3988 extends Class3986
{
    private static String[] field17995;
    private final BlockState field17997;
    
    public Class3988(final Class3833 class3833, final Class9288 class3834) {
        super(class3834);
        this.field17997 = class3833.method11878();
    }
    
    @Override
    public void method12132(final World class1847, final BlockPos class1848, final BlockState class1849, final BlockState class1850) {
        if (method12136(class1847, class1848, class1850)) {
            class1847.method6688(class1848, this.field17997, 3);
        }
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        return method12136(method21654, method21655, method21654.method6701(method21655)) ? this.field17997 : super.method11846(class7074);
    }
    
    private static boolean method12136(final Class1855 class1855, final BlockPos class1856, final BlockState class1857) {
        return method12138(class1857) || method12137(class1855, class1856);
    }
    
    private static boolean method12137(final Class1855 class1855, final BlockPos class1856) {
        boolean b = false;
        final Mutable class1857 = new Mutable(class1856);
        for (final Direction class1858 : Direction.values()) {
            final BlockState method6701 = class1855.method6701(class1857);
            if (class1858 != Direction.DOWN || method12138(method6701)) {
                class1857.method1287(class1856).method1290(class1858);
                final BlockState method6702 = class1855.method6701(class1857);
                if (method12138(method6702)) {
                    if (!method6702.method21761(class1855, class1856, class1858.getOpposite())) {
                        b = true;
                        break;
                    }
                }
            }
        }
        return b;
    }
    
    private static boolean method12138(final BlockState class7096) {
        return class7096.method21756().method21793(Class7324.field28319);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return method12137(class7099, class7100) ? this.field17997 : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
}
