// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Class8912
{
    private static final Predicate<Class8912> field37457;
    public static final Predicate<Class8912> field37458;
    private static final Set<BlockState> field37459;
    private static final Map<BlockState, Class8912> field37460;
    public static final Class8912 field37461;
    public static final Class8912 field37462;
    public static final Class8912 field37463;
    public static final Class8912 field37464;
    public static final Class8912 field37465;
    public static final Class8912 field37466;
    public static final Class8912 field37467;
    public static final Class8912 field37468;
    public static final Class8912 field37469;
    public static final Class8912 field37470;
    public static final Class8912 field37471;
    public static final Class8912 field37472;
    public static final Class8912 field37473;
    public static final Class8912 field37474;
    public static final Class8912 field37475;
    public static final Class8912 field37476;
    public static final Class8912 field37477;
    public static final Class8912 field37478;
    public static final Class8912 field37479;
    public static final Class8912 field37480;
    private final String field37481;
    private final Set<BlockState> field37482;
    private final int field37483;
    private final Predicate<Class8912> field37484;
    private final int field37485;
    
    private static Set<BlockState> method31394(final Block class3833) {
        return (Set<BlockState>)ImmutableSet.copyOf((Collection)class3833.getStateContainer().method32902());
    }
    
    private Class8912(final String field37481, final Set<BlockState> set, final int field37482, final Predicate<Class8912> field37483, final int field37484) {
        this.field37481 = field37481;
        this.field37482 = (Set<BlockState>)ImmutableSet.copyOf((Collection)set);
        this.field37483 = field37482;
        this.field37484 = field37483;
        this.field37485 = field37484;
    }
    
    private Class8912(final String field37481, final Set<BlockState> set, final int field37482, final int field37483) {
        this.field37481 = field37481;
        this.field37482 = (Set<BlockState>)ImmutableSet.copyOf((Collection)set);
        this.field37483 = field37482;
        this.field37484 = (class8912 -> class8912 == this);
        this.field37485 = field37483;
    }
    
    public int method31395() {
        return this.field37483;
    }
    
    public Predicate<Class8912> method31396() {
        return this.field37484;
    }
    
    public int method31397() {
        return this.field37485;
    }
    
    @Override
    public String toString() {
        return this.field37481;
    }
    
    private static Class8912 method31398(final String s, final Set<BlockState> set, final int n, final int n2) {
        return method31400(Registry.field241.method558(new ResourceLocation(s), new Class8912(s, set, n, n2)));
    }
    
    private static Class8912 method31399(final String s, final Set<BlockState> set, final int n, final Predicate<Class8912> predicate, final int n2) {
        return method31400(Registry.field241.method558(new ResourceLocation(s), new Class8912(s, set, n, predicate, n2)));
    }
    
    private static Class8912 method31400(final Class8912 class8912) {
        class8912.field37482.forEach(class8914 -> {
            if (Class8912.field37460.put(class8914, class8913) == null) {
            }
            else {
                new IllegalStateException(String.format("%s is defined in too many tags", class8914));
                final IllegalStateException ex;
                throw Util.pauseDevMode(ex);
            }
        });
        return class8912;
    }
    
    public static Optional<Class8912> method31401(final BlockState class7096) {
        return Optional.ofNullable(Class8912.field37460.get(class7096));
    }
    
    public static Stream<BlockState> method31402() {
        return Class8912.field37460.keySet().stream();
    }
    
    static {
        field37457 = (class8912 -> Registry.field240.method509().map((Function<? super Object, ?>)Class9334::method34575).collect((Collector<? super Object, ?, Set<? super Object>>)Collectors.toSet()).contains(class8912));
        field37458 = (p0 -> true);
        field37459 = ImmutableList.of(Blocks.field29235, Blocks.field29236, Blocks.field29232, Blocks.field29233, Blocks.field29230, Blocks.field29228, Blocks.field29234, Blocks.field29224, Blocks.field29229, Blocks.field29226, Blocks.field29223, Blocks.field29222, (Object[])new Block[] { Blocks.field29227, Blocks.field29231, Blocks.field29221, Blocks.field29225 }).stream().flatMap(class8913 -> class8913.method11876().method32902().stream()).filter(class8914 -> class8914.method21772(Class3900.field17599) == Class105.field323).collect((Collector<? super Object, Object, Set<BlockState>>)ImmutableSet.toImmutableSet());
        field37460 = Maps.newHashMap();
        field37461 = method31399("unemployed", ImmutableSet.of(), 1, Class8912.field37457, 1);
        field37462 = method31398("armorer", method31394(Blocks.BLAST_FURNACE), 1, 1);
        field37463 = method31398("butcher", method31394(Blocks.SMOKER), 1, 1);
        field37464 = method31398("cartographer", method31394(Blocks.CARTOGRAPHY_TABLE), 1, 1);
        field37465 = method31398("cleric", method31394(Blocks.field29399), 1, 1);
        field37466 = method31398("farmer", method31394(Blocks.COMPOSTER), 1, 1);
        field37467 = method31398("fisherman", method31394(Blocks.BARREL), 1, 1);
        field37468 = method31398("fletcher", method31394(Blocks.FLETCHING_TABLE), 1, 1);
        field37469 = method31398("leatherworker", method31394(Blocks.field29400), 1, 1);
        field37470 = method31398("librarian", method31394(Blocks.LECTERN), 1, 1);
        field37471 = method31398("mason", method31394(Blocks.STONECUTTER), 1, 1);
        field37472 = method31398("nitwit", ImmutableSet.of(), 1, 1);
        field37473 = method31398("shepherd", method31394(Blocks.LOOM), 1, 1);
        field37474 = method31398("toolsmith", method31394(Blocks.SMITHING_TABLE), 1, 1);
        field37475 = method31398("weaponsmith", method31394(Blocks.GRINDSTONE), 1, 1);
        field37476 = method31398("home", Class8912.field37459, 1, 1);
        field37477 = method31398("meeting", method31394(Blocks.BELL), 32, 6);
        field37478 = method31398("beehive", method31394(Blocks.BEEHIVE), 0, 1);
        field37479 = method31398("bee_nest", method31394(Blocks.BEE_NEST), 0, 1);
        field37480 = method31398("nether_portal", method31394(Blocks.field29341), 0, 1);
    }
}
