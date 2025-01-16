// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class Class6683
{
    public static final Class7915<Entity> field26362;
    public static final Class7915<PlayerEntity> field26363;
    public static final Class7915<DamageSource> field26364;
    public static final Class7915<Entity> field26365;
    public static final Class7915<Entity> field26366;
    public static final Class7915<BlockPos> field26367;
    public static final Class7915<BlockState> field26368;
    public static final Class7915<TileEntity> field26369;
    public static final Class7915<ItemStack> field26370;
    public static final Class7915<Float> field26371;
    
    private static <T> Class7915<T> method20325(final String s) {
        return new Class7915<T>(new ResourceLocation(s));
    }
    
    static {
        field26362 = method20325("this_entity");
        field26363 = method20325("last_damage_player");
        field26364 = method20325("damage_source");
        field26365 = method20325("killer_entity");
        field26366 = method20325("direct_killer_entity");
        field26367 = method20325("position");
        field26368 = method20325("block_state");
        field26369 = method20325("block_entity");
        field26370 = method20325("tool");
        field26371 = method20325("explosion_radius");
    }
}
