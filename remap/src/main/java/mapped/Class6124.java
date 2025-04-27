// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

import com.google.common.collect.Maps;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;

import java.util.Map;

public class Class6124 implements Class6113
{
    private static String[] field24860;
    private final Minecraft field24861;
    private final Map<DimensionType, Map<String, MutableBoundingBox>> field24862;
    private final Map<DimensionType, Map<String, MutableBoundingBox>> field24863;
    private final Map<DimensionType, Map<String, Boolean>> field24864;
    
    public Class6124(final Minecraft field24861) {
        this.field24862 = Maps.newIdentityHashMap();
        this.field24863 = Maps.newIdentityHashMap();
        this.field24864 = Maps.newIdentityHashMap();
        this.field24861 = field24861;
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        final Class6092 method5833 = this.field24861.field4644.method5833();
        final DimensionType method5834 = this.field24861.world.method6789().getType();
        final BlockPos class7353 = new BlockPos(method5833.method18161().x, 0.0, method5833.method18161().z);
        final Class4150 method5835 = class7352.method25214(Class6332.method18791());
        if (this.field24862.containsKey(method5834)) {
            for (final MutableBoundingBox class7354 : this.field24862.get(method5834).values()) {
                if (!class7353.withinDistance(class7354.func_215126_f(), 500.0)) {
                    continue;
                }
                Class1656.method5730(method5835, class7354.minX - n, class7354.minY - n2, class7354.minZ - n3, class7354.maxX + 1 - n, class7354.maxY + 1 - n2, class7354.maxZ + 1 - n3, 1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (this.field24863.containsKey(method5834)) {
            for (final Map.Entry<String, V> entry : this.field24863.get(method5834).entrySet()) {
                final String s = entry.getKey();
                final MutableBoundingBox class7355 = (MutableBoundingBox)entry.getValue();
                final Boolean b = this.field24864.get(method5834).get(s);
                if (!class7353.withinDistance(class7355.func_215126_f(), 500.0)) {
                    continue;
                }
                if (!b) {
                    Class1656.method5730(method5835, class7355.minX - n, class7355.minY - n2, class7355.minZ - n3, class7355.maxX + 1 - n, class7355.maxY + 1 - n2, class7355.maxZ + 1 - n3, 0.0f, 0.0f, 1.0f, 1.0f);
                }
                else {
                    Class1656.method5730(method5835, class7355.minX - n, class7355.minY - n2, class7355.minZ - n3, class7355.maxX + 1 - n, class7355.maxY + 1 - n2, class7355.maxZ + 1 - n3, 0.0f, 1.0f, 0.0f, 1.0f);
                }
            }
        }
    }
    
    public void method18345(final MutableBoundingBox class6997, final List<MutableBoundingBox> list, final List<Boolean> list2, final DimensionType class6998) {
        if (!this.field24862.containsKey(class6998)) {
            this.field24862.put(class6998, Maps.newHashMap());
        }
        if (!this.field24863.containsKey(class6998)) {
            this.field24863.put(class6998, Maps.newHashMap());
            this.field24864.put(class6998, Maps.newHashMap());
        }
        this.field24862.get(class6998).put(class6997.toString(), class6997);
        for (int i = 0; i < list.size(); ++i) {
            final MutableBoundingBox class6999 = list.get(i);
            final Boolean b = list2.get(i);
            this.field24863.get(class6998).put(class6999.toString(), class6999);
            this.field24864.get(class6998).put(class6999.toString(), b);
        }
    }
    
    @Override
    public void method18270() {
        this.field24862.clear();
        this.field24863.clear();
        this.field24864.clear();
    }
}
