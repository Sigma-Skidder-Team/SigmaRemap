// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;

public class Class6121 implements Class6113
{
    private static String[] field24846;
    private final Class869 field24847;
    private double field24848;
    private List<VoxelShape> field24849;
    
    public Class6121(final Class869 field24847) {
        this.field24848 = Double.MIN_VALUE;
        this.field24849 = Collections.emptyList();
        this.field24847 = field24847;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final double field24848 = (double)Class8349.method27838();
        if (field24848 - this.field24848 > 1.0E8) {
            this.field24848 = field24848;
            final Entity method18166 = this.field24847.field4644.method5833().method18166();
            this.field24849 = method18166.world.method6980(method18166, method18166.getBoundingBox().method18496(6.0), Collections.emptySet()).collect((Collector<? super VoxelShape, ?, List<VoxelShape>>)Collectors.toList());
        }
        final Class4150 method18167 = class7352.method25214(Class6332.method18791());
        final Iterator<VoxelShape> iterator = this.field24849.iterator();
        while (iterator.hasNext()) {
            Class1656.method5728(class7351, method18167, iterator.next(), -n, -n2, -n3, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}