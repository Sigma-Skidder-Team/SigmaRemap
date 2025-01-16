// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;

import java.util.function.Function;
import java.util.Optional;
import java.util.Set;
import java.util.List;

public class Class8233<U>
{
    public static final Class8233<Void> field33799;
    public static final Class8233<Class363> field33800;
    public static final Class8233<Class363> field33801;
    public static final Class8233<Class363> field33802;
    public static final Class8233<List<Class363>> field33803;
    public static final Class8233<List<LivingEntity>> field33804;
    public static final Class8233<List<LivingEntity>> field33805;
    public static final Class8233<List<LivingEntity>> field33806;
    public static final Class8233<List<PlayerEntity>> field33807;
    public static final Class8233<PlayerEntity> field33808;
    public static final Class8233<Class6949> field33809;
    public static final Class8233<Class6438> field33810;
    public static final Class8233<LivingEntity> field33811;
    public static final Class8233<Class824> field33812;
    public static final Class8233<Class9468> field33813;
    public static final Class8233<List<Class363>> field33814;
    public static final Class8233<Set<Class363>> field33815;
    public static final Class8233<BlockPos> field33816;
    public static final Class8233<DamageSource> field33817;
    public static final Class8233<LivingEntity> field33818;
    public static final Class8233<LivingEntity> field33819;
    public static final Class8233<Class363> field33820;
    public static final Class8233<Long> field33821;
    public static final Class8233<Long> field33822;
    public static final Class8233<Long> field33823;
    public static final Class8233<Class366> field33824;
    public static final Class8233<Class366> field33825;
    public static final Class8233<Class366> field33826;
    private final Optional<Function<Dynamic<?>, U>> field33827;
    
    private Class8233(final Optional<Function<Dynamic<?>, U>> field33827) {
        this.field33827 = field33827;
    }
    
    @Override
    public String toString() {
        return Registry.field242.getKey(this).toString();
    }
    
    public Optional<Function<Dynamic<?>, U>> method27285() {
        return this.field33827;
    }
    
    private static <U extends IDynamicSerializable> Class8233<U> method27286(final String s, final Optional<Function<Dynamic<?>, U>> optional) {
        return Registry.method512(Registry.field242, new ResourceLocation(s), new Class8233<U>(optional));
    }
    
    private static <U> Class8233<U> method27287(final String s) {
        return Registry.method512(Registry.field242, new ResourceLocation(s), new Class8233<U>(Optional.empty()));
    }
    
    static {
        field33799 = method27287("dummy");
        field33800 = method27286("home", (Optional<Function<Dynamic<?>, Class363>>)Optional.of((Function<Dynamic<?>, U>)Class363::method1168));
        field33801 = method27286("job_site", (Optional<Function<Dynamic<?>, Class363>>)Optional.of((Function<Dynamic<?>, U>)Class363::method1168));
        field33802 = method27286("meeting_point", (Optional<Function<Dynamic<?>, Class363>>)Optional.of((Function<Dynamic<?>, U>)Class363::method1168));
        field33803 = method27287("secondary_job_site");
        field33804 = method27287("mobs");
        field33805 = method27287("visible_mobs");
        field33806 = method27287("visible_villager_babies");
        field33807 = method27287("nearest_players");
        field33808 = method27287("nearest_visible_player");
        field33809 = method27287("walk_target");
        field33810 = method27287("look_target");
        field33811 = method27287("interaction_target");
        field33812 = method27287("breed_target");
        field33813 = method27287("path");
        field33814 = method27287("interactable_doors");
        field33815 = method27287("opened_doors");
        field33816 = method27287("nearest_bed");
        field33817 = method27287("hurt_by");
        field33818 = method27287("hurt_by_entity");
        field33819 = method27287("nearest_hostile");
        field33820 = method27287("hiding_place");
        field33821 = method27287("heard_bell_time");
        field33822 = method27287("cant_reach_walk_target_since");
        field33823 = method27287("golem_last_seen_time");
        field33824 = method27286("last_slept", (Optional<Function<Dynamic<?>, Class366>>)Optional.of((Function<Dynamic<?>, U>)Class366::method1239));
        field33825 = method27286("last_woken", (Optional<Function<Dynamic<?>, Class366>>)Optional.of((Function<Dynamic<?>, U>)Class366::method1239));
        field33826 = method27286("last_worked_at_poi", (Optional<Function<Dynamic<?>, Class366>>)Optional.of((Function<Dynamic<?>, U>)Class366::method1239));
    }
}
