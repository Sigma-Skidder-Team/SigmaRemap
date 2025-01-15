// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import javax.annotation.Nullable;
import java.util.Map;

public class Class7770
{
    private static final Map<Class1932, Class4640<?>> field31774;
    public static final Class4641 field31775;
    public static final Class4614 field31776;
    public static final Class4614 field31777;
    public static final Class4632 field31778;
    public static final Class4645 field31779;
    public static final Class4620 field31780;
    public static final Class4622 field31781;
    public static final Class4627 field31782;
    public static final Class4612 field31783;
    public static final Class4644 field31784;
    public static final Class4617 field31785;
    public static final Class4642 field31786;
    public static final Class4615 field31787;
    public static final Class4626 field31788;
    public static final Class4630 field31789;
    public static final Class4635 field31790;
    public static final Class4635 field31791;
    public static final Class4613 field31792;
    public static final Class4619 field31793;
    public static final Class4616 field31794;
    public static final Class4634 field31795;
    public static final Class4628 field31796;
    public static final Class4618 field31797;
    public static final Class4623 field31798;
    public static final Class4637 field31799;
    public static final Class4633 field31800;
    public static final Class4624 field31801;
    public static final Class4639 field31802;
    public static final Class4629 field31803;
    public static final Class4631 field31804;
    public static final Class4610 field31805;
    public static final Class4638 field31806;
    public static final Class4636 field31807;
    public static final Class4635 field31808;
    public static final Class4635 field31809;
    public static final Class4621 field31810;
    public static final Class4625 field31811;
    public static final Class4643 field31812;
    
    private static <T extends Class4640<?>> T method24877(final T t) {
        if (!Class7770.field31774.containsKey(t.method13717())) {
            Class7770.field31774.put(t.method13717(), t);
            return t;
        }
        throw new IllegalArgumentException("Duplicate criterion id " + t.method13717());
    }
    
    @Nullable
    public static <T extends Class4220> Class4640<T> method24878(final Class1932 class1932) {
        return (Class4640)Class7770.field31774.get(class1932);
    }
    
    public static Iterable<? extends Class4640<?>> method24879() {
        return Class7770.field31774.values();
    }
    
    static {
        field31774 = Maps.newHashMap();
        field31775 = method24877(new Class4641());
        field31776 = method24877(new Class4614(new Class1932("player_killed_entity")));
        field31777 = method24877(new Class4614(new Class1932("entity_killed_player")));
        field31778 = method24877(new Class4632());
        field31779 = method24877(new Class4645());
        field31780 = method24877(new Class4620());
        field31781 = method24877(new Class4622());
        field31782 = method24877(new Class4627());
        field31783 = method24877(new Class4612());
        field31784 = method24877(new Class4644());
        field31785 = method24877(new Class4617());
        field31786 = method24877(new Class4642());
        field31787 = method24877(new Class4615());
        field31788 = method24877(new Class4626());
        field31789 = method24877(new Class4630());
        field31790 = method24877(new Class4635(new Class1932("location")));
        field31791 = method24877(new Class4635(new Class1932("slept_in_bed")));
        field31792 = method24877(new Class4613());
        field31793 = method24877(new Class4619());
        field31794 = method24877(new Class4616());
        field31795 = method24877(new Class4634());
        field31796 = method24877(new Class4628());
        field31797 = method24877(new Class4618());
        field31798 = method24877(new Class4623());
        field31799 = method24877(new Class4637());
        field31800 = method24877(new Class4633());
        field31801 = method24877(new Class4624());
        field31802 = method24877(new Class4639());
        field31803 = method24877(new Class4629());
        field31804 = method24877(new Class4631());
        field31805 = method24877(new Class4610());
        field31806 = method24877(new Class4638());
        field31807 = method24877(new Class4636());
        field31808 = method24877(new Class4635(new Class1932("hero_of_the_village")));
        field31809 = method24877(new Class4635(new Class1932("voluntary_exile")));
        field31810 = method24877(new Class4621(new Class1932("safely_harvest_honey")));
        field31811 = method24877(new Class4625());
        field31812 = method24877(new Class4643());
    }
}
