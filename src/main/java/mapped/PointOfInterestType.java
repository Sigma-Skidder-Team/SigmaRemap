package mapped;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BedPart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PointOfInterestType {
    private static final Supplier<Set<PointOfInterestType>> WORKSTATIONS = Suppliers.memoize(
            () -> Registry.VILLAGER_PROFESSION.stream().<PointOfInterestType>map(VillagerProfession::getPointOfInterest).collect(Collectors.toSet())
    );
    public static final Predicate<PointOfInterestType> ANY_VILLAGER_WORKSTATION = var0 -> WORKSTATIONS.get().contains(var0);
    public static final Predicate<PointOfInterestType> MATCH_ANY = var0 -> true;
    private static final Set<BlockState> BED_HEADS = ImmutableList.of(
                    Blocks.RED_BED,
                    Blocks.BLACK_BED,
                    Blocks.BLUE_BED,
                    Blocks.BROWN_RED,
                    Blocks.CYAN_BED,
                    Blocks.GRAY_BED,
                    Blocks.GREEN_BED,
                    Blocks.LIGHT_BLUE_BED,
                    Blocks.LIGHT_GRAY_BED,
                    Blocks.LIME_BED,
                    Blocks.MAGENTA_BED,
                    Blocks.ORANGE_BED,
                    new Block[]{Blocks.PINK_BED, Blocks.PURPLE_BED, Blocks.WHITE_BED, Blocks.YELLOW_BED}
            )
            .stream()
            .<BlockState>flatMap(var0 -> var0.getStateContainer().getValidStates().stream())
            .filter(var0 -> var0.<BedPart>get(BedBlock.PART) == BedPart.HEAD)
            .collect(ImmutableSet.toImmutableSet());
    private static final Map<BlockState, PointOfInterestType> POIT_BY_BLOCKSTATE = Maps.newHashMap();
    public static final PointOfInterestType UNEMPLOYED = register("unemployed", ImmutableSet.of(), 1, ANY_VILLAGER_WORKSTATION, 1);
    public static final PointOfInterestType ARMORER = register("armorer", method15180(Blocks.BLAST_FURNACE), 1, 1);
    public static final PointOfInterestType BUTCHER = register("butcher", method15180(Blocks.SMOKER), 1, 1);
    public static final PointOfInterestType CARTOGRAPHER = register("cartographer", method15180(Blocks.CARTOGRAPHY_TABLE), 1, 1);
    public static final PointOfInterestType CLERIC = register("cleric", method15180(Blocks.BREWING_STAND), 1, 1);
    public static final PointOfInterestType FARMER = register("farmer", method15180(Blocks.COMPOSTER), 1, 1);
    public static final PointOfInterestType FISHERMAN = register("fisherman", method15180(Blocks.BARREL), 1, 1);
    public static final PointOfInterestType FLETCHER = register("fletcher", method15180(Blocks.FLETCHING_TABLE), 1, 1);
    public static final PointOfInterestType LEATHERWORKER = register("leatherworker", method15180(Blocks.CAULDRON), 1, 1);
    public static final PointOfInterestType LIBRARIAN = register("librarian", method15180(Blocks.LECTERN), 1, 1);
    public static final PointOfInterestType MASON = register("mason", method15180(Blocks.STONECUTTER), 1, 1);
    public static final PointOfInterestType NITWIT = register("nitwit", ImmutableSet.of(), 1, 1);
    public static final PointOfInterestType SHEPHERD = register("shepherd", method15180(Blocks.LOOM), 1, 1);
    public static final PointOfInterestType TOOLSMITH = register("toolsmith", method15180(Blocks.SMITHING_TABLE), 1, 1);
    public static final PointOfInterestType WEAPONSMITH = register("weaponsmith", method15180(Blocks.GRINDSTONE), 1, 1);
    public static final PointOfInterestType HOME = register("home", BED_HEADS, 1, 1);
    public static final PointOfInterestType MEETING = register("meeting", method15180(Blocks.BELL), 32, 6);
    public static final PointOfInterestType BEEHIVE = register("beehive", method15180(Blocks.BEEHIVE), 0, 1);
    public static final PointOfInterestType BEE_NEST = register("bee_nest", method15180(Blocks.BEE_NEST), 0, 1);
    public static final PointOfInterestType NETHER_PORTAL = register("nether_portal", method15180(Blocks.NETHER_PORTAL), 0, 1);
    public static final PointOfInterestType LODESTONE = register("lodestone", method15180(Blocks.LODESTONE), 0, 1);
    public static final Set<BlockState> BLOCKS_OF_INTEREST = new ObjectOpenHashSet(POIT_BY_BLOCKSTATE.keySet());
    private final String name;
    private final Set<BlockState> blockStates;
    private final int maxFreeTickets;
    private final Predicate<PointOfInterestType> predicate;
    private final int validRange;

    private static Set<BlockState> method15180(Block var0) {
        return ImmutableSet.copyOf(var0.getStateContainer().getValidStates());
    }

    private PointOfInterestType(String var1, Set<BlockState> var2, int var3, Predicate<PointOfInterestType> var4, int var5) {
        this.name = var1;
        this.blockStates = ImmutableSet.copyOf(var2);
        this.maxFreeTickets = var3;
        this.predicate = var4;
        this.validRange = var5;
    }

    private PointOfInterestType(String var1, Set<BlockState> var2, int var3, int var4) {
        this.name = var1;
        this.blockStates = ImmutableSet.copyOf(var2);
        this.maxFreeTickets = var3;
        this.predicate = var1x -> var1x == this;
        this.validRange = var4;
    }

    public int getMaxFreeTickets() {
        return this.maxFreeTickets;
    }

    public Predicate<PointOfInterestType> getPredicate() {
        return this.predicate;
    }

    public int getValidRange() {
        return this.validRange;
    }

    @Override
    public String toString() {
        return this.name;
    }

    private static PointOfInterestType register(String var0, Set<BlockState> var1, int var2, int var3) {
        return registerBlockStates(Registry.<PointOfInterestType, PointOfInterestType>register(Registry.POINT_OF_INTEREST_TYPE, new ResourceLocation(var0), new PointOfInterestType(var0, var1, var2, var3)));
    }

    private static PointOfInterestType register(String var0, Set<BlockState> var1, int var2, Predicate<PointOfInterestType> var3, int var4) {
        return registerBlockStates(Registry.<PointOfInterestType, PointOfInterestType>register(Registry.POINT_OF_INTEREST_TYPE, new ResourceLocation(var0), new PointOfInterestType(var0, var1, var2, var3, var4)));
    }

    private static PointOfInterestType registerBlockStates(PointOfInterestType var0) {
        var0.blockStates.forEach(var1 -> {
            PointOfInterestType var4 = POIT_BY_BLOCKSTATE.put(var1, var0);
            if (var4 != null) {
                throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException(String.format("%s is defined in too many tags", var1)));
            }
        });
        return var0;
    }

    public static Optional<PointOfInterestType> forState(BlockState var0) {
        return Optional.<PointOfInterestType>ofNullable(POIT_BY_BLOCKSTATE.get(var0));
    }
}
