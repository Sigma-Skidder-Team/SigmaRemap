// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class Class7969
{
    private static String[] field32746;
    private static final Map<Block, Class6332> field32747;
    private static final Map<Fluid, Class6332> field32748;
    private static boolean field32749;
    
    public static Class6332 method25824(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        if (!(method21696 instanceof Class3972)) {
            final Class6332 class7097 = Class7969.field32747.get(method21696);
            return (class7097 == null) ? Class6332.method18761() : class7097;
        }
        return Class7969.field32749 ? Class6332.method18762() : Class6332.method18761();
    }
    
    public static Class6332 method25825(final BlockState class7096) {
        return (method25824(class7096) != Class6332.method18765()) ? Class8752.method30264() : Class8752.method30265();
    }
    
    public static Class6332 method25826(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        if (!(method27622 instanceof Class4036)) {
            return Class8752.method30265();
        }
        return method25825(((Class4036)method27622).method12240().getDefaultState());
    }
    
    public static Class6332 method25827(final IFluidState IFluidState) {
        final Class6332 class7100 = Class7969.field32748.get(IFluidState.getFluid());
        return (class7100 == null) ? Class6332.method18761() : class7100;
    }
    
    public static void method25828(final boolean field32749) {
        Class7969.field32749 = field32749;
    }
    
    static {
        field32747 = Util.method27851(Maps.newHashMap(), hashMap -> {
            Class6332.method18762();
            final Class6332 value;
            hashMap.put(Blocks.GRASS_BLOCK, value);
            hashMap.put(Blocks.field29381, value);
            hashMap.put(Blocks.field29382, value);
            hashMap.put(Blocks.field29410, value);
            hashMap.put(Blocks.field29475, value);
            hashMap.put(Blocks.field29208, value);
            hashMap.put(Blocks.field29205, value);
            hashMap.put(Blocks.field29206, value);
            hashMap.put(Blocks.field29209, value);
            hashMap.put(Blocks.field29207, value);
            hashMap.put(Blocks.field29210, value);
            Class6332.method18763();
            final Class6332 value2;
            hashMap.put(Blocks.field29166, value2);
            hashMap.put(Blocks.field29167, value2);
            hashMap.put(Blocks.field29168, value2);
            hashMap.put(Blocks.field29169, value2);
            hashMap.put(Blocks.field29170, value2);
            hashMap.put(Blocks.field29171, value2);
            hashMap.put(Blocks.field29213, value2);
            hashMap.put(Blocks.field29221, value2);
            hashMap.put(Blocks.field29222, value2);
            hashMap.put(Blocks.field29223, value2);
            hashMap.put(Blocks.field29224, value2);
            hashMap.put(Blocks.field29225, value2);
            hashMap.put(Blocks.field29226, value2);
            hashMap.put(Blocks.field29227, value2);
            hashMap.put(Blocks.field29228, value2);
            hashMap.put(Blocks.field29229, value2);
            hashMap.put(Blocks.field29230, value2);
            hashMap.put(Blocks.field29231, value2);
            hashMap.put(Blocks.field29232, value2);
            hashMap.put(Blocks.field29233, value2);
            hashMap.put(Blocks.field29234, value2);
            hashMap.put(Blocks.field29235, value2);
            hashMap.put(Blocks.field29236, value2);
            hashMap.put(Blocks.field29237, value2);
            hashMap.put(Blocks.field29238, value2);
            hashMap.put(Blocks.field29240, value2);
            hashMap.put(Blocks.field29241, value2);
            hashMap.put(Blocks.field29242, value2);
            hashMap.put(Blocks.field29243, value2);
            hashMap.put(Blocks.field29244, value2);
            hashMap.put(Blocks.field29245, value2);
            hashMap.put(Blocks.DANDELION, value2);
            hashMap.put(Blocks.POPPY, value2);
            hashMap.put(Blocks.BLUE_ORCHID, value2);
            hashMap.put(Blocks.ALLIUM, value2);
            hashMap.put(Blocks.AZURE_BLUET, value2);
            hashMap.put(Blocks.RED_TULIP, value2);
            hashMap.put(Blocks.ORANGE_TULIP, value2);
            hashMap.put(Blocks.WHITE_TULIP, value2);
            hashMap.put(Blocks.PINK_TULIP, value2);
            hashMap.put(Blocks.OXEYE_DAISY, value2);
            hashMap.put(Blocks.CORNFLOWER, value2);
            hashMap.put(Blocks.WITHER_ROSE, value2);
            hashMap.put(Blocks.LILY_OF_THE_VALLEY, value2);
            hashMap.put(Blocks.BROWN_MUSHROOM, value2);
            hashMap.put(Blocks.RED_MUSHROOM, value2);
            hashMap.put(Blocks.TORCH, value2);
            hashMap.put(Blocks.WALL_TORCH, value2);
            hashMap.put(Blocks.FIRE, value2);
            hashMap.put(Blocks.SPAWNER, value2);
            hashMap.put(Blocks.REDSTONE_WIRE, value2);
            hashMap.put(Blocks.field29297, value2);
            hashMap.put(Blocks.field29306, value2);
            hashMap.put(Blocks.field29307, value2);
            hashMap.put(Blocks.field29308, value2);
            hashMap.put(Blocks.field29318, value2);
            hashMap.put(Blocks.field29326, value2);
            hashMap.put(Blocks.field29327, value2);
            hashMap.put(Blocks.field29332, value2);
            hashMap.put(Blocks.field29334, value2);
            hashMap.put(Blocks.field29345, value2);
            hashMap.put(Blocks.field29362, value2);
            hashMap.put(Blocks.field29363, value2);
            hashMap.put(Blocks.field29364, value2);
            hashMap.put(Blocks.field29365, value2);
            hashMap.put(Blocks.field29366, value2);
            hashMap.put(Blocks.field29367, value2);
            hashMap.put(Blocks.field29384, value2);
            hashMap.put(Blocks.field29385, value2);
            hashMap.put(Blocks.field29386, value2);
            hashMap.put(Blocks.field29387, value2);
            hashMap.put(Blocks.field29388, value2);
            hashMap.put(Blocks.field29393, value2);
            hashMap.put(Blocks.field29397, value2);
            hashMap.put(Blocks.field29399, value2);
            hashMap.put(Blocks.field29406, value2);
            hashMap.put(Blocks.field29417, value2);
            hashMap.put(Blocks.field29420, value2);
            hashMap.put(Blocks.field29421, value2);
            hashMap.put(Blocks.field29422, value2);
            hashMap.put(Blocks.field29423, value2);
            hashMap.put(Blocks.field29424, value2);
            hashMap.put(Blocks.field29425, value2);
            hashMap.put(Blocks.field29426, value2);
            hashMap.put(Blocks.field29427, value2);
            hashMap.put(Blocks.field29428, value2);
            hashMap.put(Blocks.field29429, value2);
            hashMap.put(Blocks.field29430, value2);
            hashMap.put(Blocks.field29431, value2);
            hashMap.put(Blocks.field29432, value2);
            hashMap.put(Blocks.field29433, value2);
            hashMap.put(Blocks.field29434, value2);
            hashMap.put(Blocks.field29435, value2);
            hashMap.put(Blocks.field29436, value2);
            hashMap.put(Blocks.field29437, value2);
            hashMap.put(Blocks.field29438, value2);
            hashMap.put(Blocks.field29439, value2);
            hashMap.put(Blocks.field29440, value2);
            hashMap.put(Blocks.field29441, value2);
            hashMap.put(Blocks.field29442, value2);
            hashMap.put(Blocks.field29443, value2);
            hashMap.put(Blocks.field29444, value2);
            hashMap.put(Blocks.field29445, value2);
            hashMap.put(Blocks.field29446, value2);
            hashMap.put(Blocks.field29471, value2);
            hashMap.put(Blocks.field29480, value2);
            hashMap.put(Blocks.field29518, value2);
            hashMap.put(Blocks.field29549, value2);
            hashMap.put(Blocks.field29550, value2);
            hashMap.put(Blocks.field29551, value2);
            hashMap.put(Blocks.field29552, value2);
            hashMap.put(Blocks.field29553, value2);
            hashMap.put(Blocks.field29554, value2);
            hashMap.put(Blocks.SPRUCE_DOOR, value2);
            hashMap.put(Blocks.BIRCH_DOOR, value2);
            hashMap.put(Blocks.JUNGLE_DOOR, value2);
            hashMap.put(Blocks.ACACIA_DOOR, value2);
            hashMap.put(Blocks.DARK_OAK_DOOR, value2);
            hashMap.put(Blocks.END_ROD, value2);
            hashMap.put(Blocks.CHORUS_PLANT, value2);
            hashMap.put(Blocks.CHORUS_FLOWER, value2);
            hashMap.put(Blocks.BEETROOTS, value2);
            hashMap.put(Blocks.KELP, value2);
            hashMap.put(Blocks.KELP_PLANT, value2);
            hashMap.put(Blocks.TURTLE_EGG, value2);
            hashMap.put(Blocks.DEAD_TUBE_CORAL, value2);
            hashMap.put(Blocks.DEAD_BRAIN_CORAL, value2);
            hashMap.put(Blocks.DEAD_BUBBLE_CORAL, value2);
            hashMap.put(Blocks.DEAD_FIRE_CORAL, value2);
            hashMap.put(Blocks.DEAD_HORN_CORAL, value2);
            hashMap.put(Blocks.TUBE_CORAL, value2);
            hashMap.put(Blocks.BRAIN_CORAL, value2);
            hashMap.put(Blocks.BUBBLE_CORAL, value2);
            hashMap.put(Blocks.FIRE_CORAL, value2);
            hashMap.put(Blocks.HORN_CORAL, value2);
            hashMap.put(Blocks.DEAD_TUBE_CORAL_FAN, value2);
            hashMap.put(Blocks.DEAD_BRAIN_CORAL_FAN, value2);
            hashMap.put(Blocks.DEAD_BUBBLE_CORAL_FAN, value2);
            hashMap.put(Blocks.DEAD_FIRE_CORAL_FAN, value2);
            hashMap.put(Blocks.DEAD_HORN_CORAL_FAN, value2);
            hashMap.put(Blocks.TUBE_CORAL_FAN, value2);
            hashMap.put(Blocks.BRAIN_CORAL_FAN, value2);
            hashMap.put(Blocks.BUBBLE_CORAL_FAN, value2);
            hashMap.put(Blocks.FIRE_CORAL_FAN, value2);
            hashMap.put(Blocks.HORN_CORAL_FAN, value2);
            hashMap.put(Blocks.DEAD_TUBE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.DEAD_BRAIN_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.DEAD_BUBBLE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.DEAD_FIRE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.DEAD_HORN_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.TUBE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.BRAIN_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.BUBBLE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.FIRE_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.HORN_CORAL_WALL_FAN, value2);
            hashMap.put(Blocks.SEA_PICKLE, value2);
            hashMap.put(Blocks.CONDUIT, value2);
            hashMap.put(Blocks.BAMBOO_SAPLING, value2);
            hashMap.put(Blocks.BAMBOO, value2);
            hashMap.put(Blocks.POTTED_BAMBOO, value2);
            hashMap.put(Blocks.SCAFFOLDING, value2);
            hashMap.put(Blocks.STONECUTTER, value2);
            hashMap.put(Blocks.LANTERN, value2);
            hashMap.put(Blocks.CAMPFIRE, value2);
            hashMap.put(Blocks.SWEET_BERRY_BUSH, value2);
            Class6332.method18765();
            final Class6332 value3;
            hashMap.put(Blocks.field29330, value3);
            hashMap.put(Blocks.field29341, value3);
            hashMap.put(Blocks.field29346, value3);
            hashMap.put(Blocks.field29347, value3);
            hashMap.put(Blocks.field29348, value3);
            hashMap.put(Blocks.field29349, value3);
            hashMap.put(Blocks.field29350, value3);
            hashMap.put(Blocks.field29351, value3);
            hashMap.put(Blocks.field29352, value3);
            hashMap.put(Blocks.field29353, value3);
            hashMap.put(Blocks.field29354, value3);
            hashMap.put(Blocks.field29355, value3);
            hashMap.put(Blocks.field29356, value3);
            hashMap.put(Blocks.field29357, value3);
            hashMap.put(Blocks.field29358, value3);
            hashMap.put(Blocks.field29359, value3);
            hashMap.put(Blocks.field29360, value3);
            hashMap.put(Blocks.field29361, value3);
            hashMap.put(Blocks.field29411, value3);
            hashMap.put(Blocks.field29498, value3);
            hashMap.put(Blocks.field29499, value3);
            hashMap.put(Blocks.field29500, value3);
            hashMap.put(Blocks.field29501, value3);
            hashMap.put(Blocks.field29502, value3);
            hashMap.put(Blocks.field29503, value3);
            hashMap.put(Blocks.field29504, value3);
            hashMap.put(Blocks.field29505, value3);
            hashMap.put(Blocks.field29506, value3);
            hashMap.put(Blocks.field29507, value3);
            hashMap.put(Blocks.field29508, value3);
            hashMap.put(Blocks.field29509, value3);
            hashMap.put(Blocks.field29510, value3);
            hashMap.put(Blocks.field29511, value3);
            hashMap.put(Blocks.field29512, value3);
            hashMap.put(Blocks.field29513, value3);
            hashMap.put(Blocks.field29516, value3);
            hashMap.put(Blocks.HONEY_BLOCK, value3);
            hashMap.put(Blocks.FROSTED_ICE, value3);
            hashMap.put(Blocks.BUBBLE_COLUMN, value3);
        });
        field32748 = Util.method27851(Maps.newHashMap(), hashMap2 -> {
            Class6332.method18765();
            final Class6332 class6332;
            hashMap2.put(Class7558.field29975, class6332);
            hashMap2.put(Class7558.field29976, class6332);
        });
    }
}
