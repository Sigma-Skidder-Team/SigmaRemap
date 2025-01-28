package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.UUIDCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class MemoryModuleType<U> {
   public static final MemoryModuleType<Void> field39812 = method31928("dummy");
   public static final MemoryModuleType<Class9378> field39813 = method31927("home", Class9378.field43522);
   public static final MemoryModuleType<Class9378> field39814 = method31927("job_site", Class9378.field43522);
   public static final MemoryModuleType<Class9378> field39815 = method31927("potential_job_site", Class9378.field43522);
   public static final MemoryModuleType<Class9378> field39816 = method31927("meeting_point", Class9378.field43522);
   public static final MemoryModuleType<List<Class9378>> field39817 = method31928("secondary_job_site");
   public static final MemoryModuleType<List<LivingEntity>> field39818 = method31928("mobs");
   public static final MemoryModuleType<List<LivingEntity>> field39819 = method31928("visible_mobs");
   public static final MemoryModuleType<List<LivingEntity>> field39820 = method31928("visible_villager_babies");
   public static final MemoryModuleType<List<PlayerEntity>> field39821 = method31928("nearest_players");
   public static final MemoryModuleType<PlayerEntity> field39822 = method31928("nearest_visible_player");
   public static final MemoryModuleType<PlayerEntity> field39823 = method31928("nearest_visible_targetable_player");
   public static final MemoryModuleType<Class8999> field39824 = method31928("walk_target");
   public static final MemoryModuleType<Class7864> field39825 = method31928("look_target");
   public static final MemoryModuleType<LivingEntity> ATTACK_TARGET = method31928("attack_target");
   public static final MemoryModuleType<Boolean> field39827 = method31928("attack_cooling_down");
   public static final MemoryModuleType<LivingEntity> field39828 = method31928("interaction_target");
   public static final MemoryModuleType<Class1045> field39829 = method31928("breed_target");
   public static final MemoryModuleType<Entity> field39830 = method31928("ride_target");
   public static final MemoryModuleType<Class8238> field39831 = method31928("path");
   public static final MemoryModuleType<List<Class9378>> field39832 = method31928("interactable_doors");
   public static final MemoryModuleType<Set<Class9378>> field39833 = method31928("doors_to_close");
   public static final MemoryModuleType<BlockPos> field39834 = method31928("nearest_bed");
   public static final MemoryModuleType<DamageSource> field39835 = method31928("hurt_by");
   public static final MemoryModuleType<LivingEntity> field39836 = method31928("hurt_by_entity");
   public static final MemoryModuleType<LivingEntity> field39837 = method31928("avoid_target");
   public static final MemoryModuleType<LivingEntity> field39838 = method31928("nearest_hostile");
   public static final MemoryModuleType<Class9378> field39839 = method31928("hiding_place");
   public static final MemoryModuleType<Long> field39840 = method31928("heard_bell_time");
   public static final MemoryModuleType<Long> field39841 = method31928("cant_reach_walk_target_since");
   public static final MemoryModuleType<Boolean> field39842 = method31927("golem_detected_recently", Codec.BOOL);
   public static final MemoryModuleType<Long> field39843 = method31927("last_slept", Codec.LONG);
   public static final MemoryModuleType<Long> field39844 = method31927("last_woken", Codec.LONG);
   public static final MemoryModuleType<Long> field39845 = method31927("last_worked_at_poi", Codec.LONG);
   public static final MemoryModuleType<Class1045> field39846 = method31928("nearest_visible_adult");
   public static final MemoryModuleType<ItemEntity> field39847 = method31928("nearest_visible_wanted_item");
   public static final MemoryModuleType<MobEntity> field39848 = method31928("nearest_visible_nemesis");
   public static final MemoryModuleType<UUID> field39849 = method31927("angry_at", UUIDCodec.field39430);
   public static final MemoryModuleType<Boolean> field39850 = method31927("universal_anger", Codec.BOOL);
   public static final MemoryModuleType<Boolean> field39851 = method31927("admiring_item", Codec.BOOL);
   public static final MemoryModuleType<Integer> field39852 = method31928("time_trying_to_reach_admire_item");
   public static final MemoryModuleType<Boolean> field39853 = method31928("disable_walk_to_admire_item");
   public static final MemoryModuleType<Boolean> field39854 = method31927("admiring_disabled", Codec.BOOL);
   public static final MemoryModuleType<Boolean> field39855 = method31927("hunted_recently", Codec.BOOL);
   public static final MemoryModuleType<BlockPos> field39856 = method31928("celebrate_location");
   public static final MemoryModuleType<Boolean> field39857 = method31928("dancing");
   public static final MemoryModuleType<HoglinEntity> field39858 = method31928("nearest_visible_huntable_hoglin");
   public static final MemoryModuleType<HoglinEntity> field39859 = method31928("nearest_visible_baby_hoglin");
   public static final MemoryModuleType<PlayerEntity> field39860 = method31928("nearest_targetable_player_not_wearing_gold");
   public static final MemoryModuleType<List<AbstractPiglinEntity>> field39861 = method31928("nearby_adult_piglins");
   public static final MemoryModuleType<List<AbstractPiglinEntity>> field39862 = method31928("nearest_visible_adult_piglins");
   public static final MemoryModuleType<List<HoglinEntity>> field39863 = method31928("nearest_visible_adult_hoglins");
   public static final MemoryModuleType<AbstractPiglinEntity> field39864 = method31928("nearest_visible_adult_piglin");
   public static final MemoryModuleType<LivingEntity> field39865 = method31928("nearest_visible_zombified");
   public static final MemoryModuleType<Integer> field39866 = method31928("visible_adult_piglin_count");
   public static final MemoryModuleType<Integer> field39867 = method31928("visible_adult_hoglin_count");
   public static final MemoryModuleType<PlayerEntity> field39868 = method31928("nearest_player_holding_wanted_item");
   public static final MemoryModuleType<Boolean> field39869 = method31928("ate_recently");
   public static final MemoryModuleType<BlockPos> field39870 = method31928("nearest_repellent");
   public static final MemoryModuleType<Boolean> field39871 = method31928("pacified");
   private final Optional<Codec<Class8222<U>>> field39872;

   private MemoryModuleType(Optional<Codec<U>> var1) {
      this.field39872 = var1.<Codec<Class8222<U>>>map(Class8222::method28607);
   }

   @Override
   public String toString() {
      return Registry.field16092.getKey(this).toString();
   }

   public Optional<Codec<Class8222<U>>> method31926() {
      return this.field39872;
   }

   private static <U> MemoryModuleType<U> method31927(String var0, Codec<U> var1) {
      return Registry.<MemoryModuleType<?>, MemoryModuleType<U>>register(Registry.field16092, new ResourceLocation(var0), new MemoryModuleType<U>(Optional.<Codec<U>>of(var1)));
   }

   private static <U> MemoryModuleType<U> method31928(String var0) {
      return Registry.<MemoryModuleType<?>, MemoryModuleType<U>>register(Registry.field16092, new ResourceLocation(var0), new MemoryModuleType<U>(Optional.<Codec<U>>empty()));
   }
}
