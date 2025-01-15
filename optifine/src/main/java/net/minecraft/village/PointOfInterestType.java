package net.minecraft.village;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.state.properties.BedPart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

public class PointOfInterestType
{
    private static final Predicate<PointOfInterestType> ANY_VILLAGER_WORKSTATION = (p_221041_0_) ->
    {
        return Registry.VILLAGER_PROFESSION.stream().map(VillagerProfession::getPointOfInterest).collect(Collectors.toSet()).contains(p_221041_0_);
    };
    public static final Predicate<PointOfInterestType> field_221053_a = (p_221049_0_) ->
    {
        return true;
    };
    private static final Set<BlockState> BED_HEADS = ImmutableList.of(Blocks.RED_BED, Blocks.BLACK_BED, Blocks.BLUE_BED, Blocks.BROWN_BED, Blocks.CYAN_BED, Blocks.GRAY_BED, Blocks.GREEN_BED, Blocks.LIGHT_BLUE_BED, Blocks.LIGHT_GRAY_BED, Blocks.LIME_BED, Blocks.MAGENTA_BED, Blocks.ORANGE_BED, Blocks.PINK_BED, Blocks.PURPLE_BED, Blocks.WHITE_BED, Blocks.YELLOW_BED).stream().flatMap((p_221043_0_) ->
    {
        return p_221043_0_.getStateContainer().getValidStates().stream();
    }).filter((p_221050_0_) ->
    {
        return p_221050_0_.get(BedBlock.PART) == BedPart.HEAD;
    }).collect(ImmutableSet.toImmutableSet());
    private static final Map<BlockState, PointOfInterestType> field_221073_u = Maps.newHashMap();
    public static final PointOfInterestType UNEMPLOYED = func_226360_a_("unemployed", ImmutableSet.of(), 1, ANY_VILLAGER_WORKSTATION, 1);
    public static final PointOfInterestType ARMORER = func_226359_a_("armorer", getAllStates(Blocks.BLAST_FURNACE), 1, 1);
    public static final PointOfInterestType BUTCHER = func_226359_a_("butcher", getAllStates(Blocks.SMOKER), 1, 1);
    public static final PointOfInterestType CARTOGRAPHER = func_226359_a_("cartographer", getAllStates(Blocks.CARTOGRAPHY_TABLE), 1, 1);
    public static final PointOfInterestType CLERIC = func_226359_a_("cleric", getAllStates(Blocks.BREWING_STAND), 1, 1);
    public static final PointOfInterestType FARMER = func_226359_a_("farmer", getAllStates(Blocks.COMPOSTER), 1, 1);
    public static final PointOfInterestType FISHERMAN = func_226359_a_("fisherman", getAllStates(Blocks.BARREL), 1, 1);
    public static final PointOfInterestType FLETCHER = func_226359_a_("fletcher", getAllStates(Blocks.FLETCHING_TABLE), 1, 1);
    public static final PointOfInterestType LEATHERWORKER = func_226359_a_("leatherworker", getAllStates(Blocks.CAULDRON), 1, 1);
    public static final PointOfInterestType LIBRARIAN = func_226359_a_("librarian", getAllStates(Blocks.LECTERN), 1, 1);
    public static final PointOfInterestType MASON = func_226359_a_("mason", getAllStates(Blocks.STONECUTTER), 1, 1);
    public static final PointOfInterestType NITWIT = func_226359_a_("nitwit", ImmutableSet.of(), 1, 1);
    public static final PointOfInterestType SHEPHERD = func_226359_a_("shepherd", getAllStates(Blocks.LOOM), 1, 1);
    public static final PointOfInterestType TOOLSMITH = func_226359_a_("toolsmith", getAllStates(Blocks.SMITHING_TABLE), 1, 1);
    public static final PointOfInterestType WEAPONSMITH = func_226359_a_("weaponsmith", getAllStates(Blocks.GRINDSTONE), 1, 1);
    public static final PointOfInterestType HOME = func_226359_a_("home", BED_HEADS, 1, 1);
    public static final PointOfInterestType MEETING = func_226359_a_("meeting", getAllStates(Blocks.BELL), 32, 6);
    public static final PointOfInterestType field_226356_s_ = func_226359_a_("beehive", getAllStates(Blocks.BEEHIVE), 0, 1);
    public static final PointOfInterestType field_226357_t_ = func_226359_a_("bee_nest", getAllStates(Blocks.BEE_NEST), 0, 1);
    public static final PointOfInterestType field_226358_u_ = func_226359_a_("nether_portal", getAllStates(Blocks.NETHER_PORTAL), 0, 1);
    private final String name;
    private final Set<BlockState> field_221075_w;
    private final int maxFreeTickets;
    private final Predicate<PointOfInterestType> field_221078_z;
    private final int field_225481_A;

    private static Set<BlockState> getAllStates(Block p_221042_0_)
    {
        return ImmutableSet.copyOf(p_221042_0_.getStateContainer().getValidStates());
    }

    private PointOfInterestType(String dataIn, Set<BlockState> depthBitsIn, int p_i1998_3_, Predicate<PointOfInterestType> p_i1998_4_, int p_i1998_5_)
    {
        this.name = dataIn;
        this.field_221075_w = ImmutableSet.copyOf(depthBitsIn);
        this.maxFreeTickets = p_i1998_3_;
        this.field_221078_z = p_i1998_4_;
        this.field_225481_A = p_i1998_5_;
    }

    private PointOfInterestType(String xIn, Set<BlockState> zIn, int p_i1999_3_, int p_i1999_4_)
    {
        this.name = xIn;
        this.field_221075_w = ImmutableSet.copyOf(zIn);
        this.maxFreeTickets = p_i1999_3_;
        this.field_221078_z = (p_221046_1_) ->
        {
            return p_221046_1_ == this;
        };
        this.field_225481_A = p_i1999_4_;
    }

    public int getMaxFreeTickets()
    {
        return this.maxFreeTickets;
    }

    public Predicate<PointOfInterestType> func_221045_c()
    {
        return this.field_221078_z;
    }

    public int func_225478_d()
    {
        return this.field_225481_A;
    }

    public String toString()
    {
        return this.name;
    }

    private static PointOfInterestType func_226359_a_(String p_226359_0_, Set<BlockState> p_226359_1_, int p_226359_2_, int p_226359_3_)
    {
        return func_221052_a(Registry.POINT_OF_INTEREST_TYPE.register(new ResourceLocation(p_226359_0_), new PointOfInterestType(p_226359_0_, p_226359_1_, p_226359_2_, p_226359_3_)));
    }

    private static PointOfInterestType func_226360_a_(String p_226360_0_, Set<BlockState> p_226360_1_, int p_226360_2_, Predicate<PointOfInterestType> p_226360_3_, int p_226360_4_)
    {
        return func_221052_a(Registry.POINT_OF_INTEREST_TYPE.register(new ResourceLocation(p_226360_0_), new PointOfInterestType(p_226360_0_, p_226360_1_, p_226360_2_, p_226360_3_, p_226360_4_)));
    }

    private static PointOfInterestType func_221052_a(PointOfInterestType p_221052_0_)
    {
        p_221052_0_.field_221075_w.forEach((p_221040_1_) ->
        {
            PointOfInterestType pointofinteresttype = field_221073_u.put(p_221040_1_, p_221052_0_);

            if (pointofinteresttype != null)
            {
                throw(IllegalStateException)Util.pauseDevMode(new IllegalStateException(String.format("%s is defined in too many tags", p_221040_1_)));
            }
        });
        return p_221052_0_;
    }

    public static Optional<PointOfInterestType> forState(BlockState state)
    {
        return Optional.ofNullable(field_221073_u.get(state));
    }

    public static Stream<BlockState> getAllStates()
    {
        return field_221073_u.keySet().stream();
    }
}
