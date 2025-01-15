// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class Class5427 extends Class5419<Class824>
{
    private static String[] field22614;
    private List<Class427> field22615;
    
    public Class5427() {
        super((Map)ImmutableMap.of((Object)Class8233.field33810, (Object)Class1952.field10629, (Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22615 = Lists.newArrayList();
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        this.field22615 = class1849.method7128((Class<? extends Class427>)Class427.class, class1850.getBoundingBox().method18495(4.0, 2.0, 4.0));
        return !this.field22615.isEmpty();
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class427 class1851 = this.field22615.get(class1849.rand.nextInt(this.field22615.size()));
        if (class1850.method4883(class1851.method2107().getItem())) {
            final Vec3d method1934 = class1851.method1934();
            class1850.method2618().method1196((Class8233<Class6439>)Class8233.field33810, new Class6439(new BlockPos(method1934)));
            class1850.method2618().method1196(Class8233.field33809, new Class6949(method1934, 0.5f, 0));
        }
    }
}
