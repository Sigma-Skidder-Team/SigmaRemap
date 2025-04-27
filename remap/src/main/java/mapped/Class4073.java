// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class Class4073 extends Class4072
{
    private static String[] field18171;
    private static final Set<Block> field18172;
    
    public Class4073(final Class2038 class2038, final int n, final float n2, final Properties class2039) {
        super((float)n, n2, class2038, Class4073.field18172, class2039);
    }
    
    @Override
    public boolean method11713(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        final int method21697 = this.method12274().method8112();
        if (method21696 != Blocks.OBSIDIAN) {
            if (method21696 != Blocks.DIAMOND_BLOCK) {
                if (method21696 != Blocks.DIAMOND_ORE) {
                    if (method21696 != Blocks.field29408) {
                        if (method21696 != Blocks.field29412) {
                            if (method21696 != Blocks.GOLD_BLOCK) {
                                if (method21696 != Blocks.field29178) {
                                    if (method21696 != Blocks.field29325) {
                                        if (method21696 != Blocks.IRON_BLOCK) {
                                            if (method21696 != Blocks.field29179) {
                                                if (method21696 != Blocks.field29215) {
                                                    if (method21696 != Blocks.field29214) {
                                                        final Material method21698 = class7096.getMaterial();
                                                        if (method21698 != Material.ROCK) {
                                                            if (method21698 != Material.IRON) {
                                                                return method21698 == Material.ANVIL;
                                                            }
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                        return method21697 >= 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return method21697 >= 2;
        }
        return method21697 == 3;
    }
    
    @Override
    public float method11706(final ItemStack class8321, final BlockState class8322) {
        final Material method21697 = class8322.getMaterial();
        if (method21697 != Material.IRON) {
            if (method21697 != Material.ANVIL) {
                if (method21697 != Material.ROCK) {
                    return super.method11706(class8321, class8322);
                }
            }
        }
        return this.field18168;
    }
    
    static {
        field18172 = (Set)ImmutableSet.of(Blocks.field29480, Blocks.field29180, Blocks.COBBLESTONE, Blocks.field29238, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, (Object[])new Block[] { Blocks.field29237, Blocks.GOLD_BLOCK, Blocks.field29178, Blocks.field29330, Blocks.IRON_BLOCK, Blocks.field29179, Blocks.field29215, Blocks.field29214, Blocks.MOSSY_COBBLESTONE, Blocks.field29338, Blocks.field29548, Blocks.BLUE_ICE, Blocks.field29308, Blocks.field29325, Blocks.field29217, Blocks.field29218, Blocks.field29219, Blocks.field29588, Blocks.field29589, Blocks.field29587, Blocks.STONE, Blocks.GRANITE, Blocks.POLISHED_GRANITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, Blocks.field29597, Blocks.field29598, Blocks.field29599, Blocks.PETRIFIED_OAK_SLAB, Blocks.COBBLESTONE_SLAB, Blocks.BRICK_SLAB, Blocks.STONE_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB, Blocks.QUARTZ_SLAB, Blocks.RED_SANDSTONE_SLAB, Blocks.PURPUR_SLAB, Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_STONE, Blocks.field29328, Blocks.field29317, Blocks.POLISHED_GRANITE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.END_STONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.GRANITE_SLAB, Blocks.ANDESITE_SLAB, Blocks.RED_NETHER_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB, Blocks.DIORITE_SLAB, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX});
    }
}
