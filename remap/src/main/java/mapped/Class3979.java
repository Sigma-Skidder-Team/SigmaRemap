// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class Class3979 extends Block
{
    private static String[] field17971;
    private final Block field17972;
    private static final Map<Block, Block> field17973;
    
    public Class3979(final Block field17972, final Class9288 class9288) {
        super(class9288);
        this.field17972 = field17972;
        Class3979.field17973.put(field17972, this);
    }
    
    public Block method12122() {
        return this.field17972;
    }
    
    public static boolean method12123(final Class7096 class7096) {
        return Class3979.field17973.containsKey(class7096.method21696());
    }
    
    @Override
    public void method11831(final Class7096 class7096, final World class7097, final BlockPos class7098, final ItemStack class7099) {
        super.method11831(class7096, class7097, class7098, class7099);
        if (!class7097.isRemote) {
            if (class7097.method6765().method31216(Class8878.field37320)) {
                if (Class8742.method30195(Class7882.field32366, class7099) == 0) {
                    final Class848 class7100 = EntityType.field29022.method23371(class7097);
                    class7100.method1730(class7098.getX() + 0.5, class7098.getY(), class7098.getZ() + 0.5, 0.0f, 0.0f);
                    class7097.method6886(class7100);
                    class7100.method4158();
                }
            }
        }
    }
    
    public static Class7096 method12124(final Block class3833) {
        return Class3979.field17973.get(class3833).getDefaultState();
    }
    
    static {
        field17973 = Maps.newIdentityHashMap();
    }
}
