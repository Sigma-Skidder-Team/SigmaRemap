// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

public class Class5465 extends Class5419<Class824>
{
    private static String[] field22729;
    private long field22730;
    
    public Class5465() {
        super((Map)ImmutableMap.of(Class8233.field33812, Class1952.field10628, (Object)Class8233.field33805, (Object)Class1952.field10628), 350, 350);
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        return this.method16695(class1850);
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return n <= this.field22730 && this.method16695(class1850);
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class824 method16694 = this.method16694(class1850);
        Class6793.method20784(class1850, method16694);
        class1849.method6761(method16694, (byte)18);
        class1849.method6761(class1850, (byte)18);
        this.field22730 = n + (275 + class1850.method2633().nextInt(50));
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class824 method16694 = this.method16694(class1850);
        if (class1850.method1734(method16694) <= 5.0) {
            Class6793.method20784(class1850, method16694);
            if (n < this.field22730) {
                if (class1850.method2633().nextInt(35) == 0) {
                    class1849.method6761(method16694, (byte)12);
                    class1849.method6761(class1850, (byte)12);
                }
            }
            else {
                class1850.method4878();
                method16694.method4878();
                this.method16693(class1849, class1850, method16694);
            }
        }
    }
    
    private void method16693(final Class1849 class1849, final Class824 class1850, final Class824 class1851) {
        final Optional<BlockPos> method16696 = this.method16696(class1849, class1850);
        if (method16696.isPresent()) {
            final Optional<Class824> method16697 = this.method16698(class1850, class1851);
            if (!method16697.isPresent()) {
                class1849.method6921().method7208(method16696.get());
                Class9324.method34534(class1849, method16696.get());
            }
            else {
                this.method16699(class1849, method16697.get(), method16696.get());
            }
        }
        else {
            class1849.method6761(class1851, (byte)13);
            class1849.method6761(class1850, (byte)13);
        }
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        class1850.method2618().method1195(Class8233.field33812);
    }
    
    private Class824 method16694(final Class824 class824) {
        return class824.method2618().method1198(Class8233.field33812).get();
    }
    
    private boolean method16695(final Class824 class824) {
        final Class365<Class824> method2618 = class824.method2618();
        if (method2618.method1198(Class8233.field33812).isPresent()) {
            final Class824 method2619 = this.method16694(class824);
            if (Class6793.method20786(method2618, Class8233.field33812, EntityType.field29042)) {
                if (class824.method4873()) {
                    return method2619.method4873();
                }
            }
            return false;
        }
        return false;
    }
    
    private Optional<BlockPos> method16696(final Class1849 class1849, final Class824 class1850) {
        return class1849.method6921().method7206(Class8912.field37476.method31396(), class1852 -> this.method16697(class1851, class1852), new BlockPos(class1850), 48);
    }
    
    private boolean method16697(final Class824 class824, final BlockPos class825) {
        final Class9468 method24721 = class824.method4150().method24721(class825, Class8912.field37476.method31397());
        return method24721 != null && method24721.method35228();
    }
    
    private Optional<Class824> method16698(final Class824 class824, final Class824 class825) {
        final Class824 method4882 = class824.method4882(class825);
        if (method4882 != null) {
            class824.method4354(6000);
            class825.method4354(6000);
            method4882.method4354(-24000);
            method4882.method1730(class824.getPosX(), class824.getPosY(), class824.getPosZ(), 0.0f, 0.0f);
            class824.world.method6886(method4882);
            class824.world.method6761(method4882, (byte)12);
            return Optional.of(method4882);
        }
        return Optional.empty();
    }
    
    private void method16699(final Class1849 class1849, final Class824 class1850, final BlockPos class1851) {
        class1850.method2618().method1196(Class8233.field33800, Class363.method1167(class1849.method6789().getType(), class1851));
    }
}
