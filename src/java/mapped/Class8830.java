package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class Class8830<U> {
   public static final Class8830<Void> field39812 = method31928("dummy");
   public static final Class8830<Class9378> field39813 = method31927("home", Class9378.field43522);
   public static final Class8830<Class9378> field39814 = method31927("job_site", Class9378.field43522);
   public static final Class8830<Class9378> field39815 = method31927("potential_job_site", Class9378.field43522);
   public static final Class8830<Class9378> field39816 = method31927("meeting_point", Class9378.field43522);
   public static final Class8830<List<Class9378>> field39817 = method31928("secondary_job_site");
   public static final Class8830<List<Class880>> field39818 = method31928("mobs");
   public static final Class8830<List<Class880>> field39819 = method31928("visible_mobs");
   public static final Class8830<List<Class880>> field39820 = method31928("visible_villager_babies");
   public static final Class8830<List<PlayerEntity>> field39821 = method31928("nearest_players");
   public static final Class8830<PlayerEntity> field39822 = method31928("nearest_visible_player");
   public static final Class8830<PlayerEntity> field39823 = method31928("nearest_visible_targetable_player");
   public static final Class8830<Class8999> field39824 = method31928("walk_target");
   public static final Class8830<Class7864> field39825 = method31928("look_target");
   public static final Class8830<Class880> field39826 = method31928("attack_target");
   public static final Class8830<Boolean> field39827 = method31928("attack_cooling_down");
   public static final Class8830<Class880> field39828 = method31928("interaction_target");
   public static final Class8830<Class1045> field39829 = method31928("breed_target");
   public static final Class8830<Entity> field39830 = method31928("ride_target");
   public static final Class8830<Class8238> field39831 = method31928("path");
   public static final Class8830<List<Class9378>> field39832 = method31928("interactable_doors");
   public static final Class8830<Set<Class9378>> field39833 = method31928("doors_to_close");
   public static final Class8830<BlockPos> field39834 = method31928("nearest_bed");
   public static final Class8830<Class8654> field39835 = method31928("hurt_by");
   public static final Class8830<Class880> field39836 = method31928("hurt_by_entity");
   public static final Class8830<Class880> field39837 = method31928("avoid_target");
   public static final Class8830<Class880> field39838 = method31928("nearest_hostile");
   public static final Class8830<Class9378> field39839 = method31928("hiding_place");
   public static final Class8830<Long> field39840 = method31928("heard_bell_time");
   public static final Class8830<Long> field39841 = method31928("cant_reach_walk_target_since");
   public static final Class8830<Boolean> field39842 = method31927("golem_detected_recently", Codec.BOOL);
   public static final Class8830<Long> field39843 = method31927("last_slept", Codec.LONG);
   public static final Class8830<Long> field39844 = method31927("last_woken", Codec.LONG);
   public static final Class8830<Long> field39845 = method31927("last_worked_at_poi", Codec.LONG);
   public static final Class8830<Class1045> field39846 = method31928("nearest_visible_adult");
   public static final Class8830<ItemEntity> field39847 = method31928("nearest_visible_wanted_item");
   public static final Class8830<Class1006> field39848 = method31928("nearest_visible_nemesis");
   public static final Class8830<UUID> field39849 = method31927("angry_at", Class8749.field39430);
   public static final Class8830<Boolean> field39850 = method31927("universal_anger", Codec.BOOL);
   public static final Class8830<Boolean> field39851 = method31927("admiring_item", Codec.BOOL);
   public static final Class8830<Integer> field39852 = method31928("time_trying_to_reach_admire_item");
   public static final Class8830<Boolean> field39853 = method31928("disable_walk_to_admire_item");
   public static final Class8830<Boolean> field39854 = method31927("admiring_disabled", Codec.BOOL);
   public static final Class8830<Boolean> field39855 = method31927("hunted_recently", Codec.BOOL);
   public static final Class8830<BlockPos> field39856 = method31928("celebrate_location");
   public static final Class8830<Boolean> field39857 = method31928("dancing");
   public static final Class8830<Class1091> field39858 = method31928("nearest_visible_huntable_hoglin");
   public static final Class8830<Class1091> field39859 = method31928("nearest_visible_baby_hoglin");
   public static final Class8830<PlayerEntity> field39860 = method31928("nearest_targetable_player_not_wearing_gold");
   public static final Class8830<List<Class1035>> field39861 = method31928("nearby_adult_piglins");
   public static final Class8830<List<Class1035>> field39862 = method31928("nearest_visible_adult_piglins");
   public static final Class8830<List<Class1091>> field39863 = method31928("nearest_visible_adult_hoglins");
   public static final Class8830<Class1035> field39864 = method31928("nearest_visible_adult_piglin");
   public static final Class8830<Class880> field39865 = method31928("nearest_visible_zombified");
   public static final Class8830<Integer> field39866 = method31928("visible_adult_piglin_count");
   public static final Class8830<Integer> field39867 = method31928("visible_adult_hoglin_count");
   public static final Class8830<PlayerEntity> field39868 = method31928("nearest_player_holding_wanted_item");
   public static final Class8830<Boolean> field39869 = method31928("ate_recently");
   public static final Class8830<BlockPos> field39870 = method31928("nearest_repellent");
   public static final Class8830<Boolean> field39871 = method31928("pacified");
   private final Optional<Codec<Class8222<U>>> field39872;

   private Class8830(Optional<Codec<U>> var1) {
      this.field39872 = var1.<Codec<Class8222<U>>>map(Class8222::method28607);
   }

   @Override
   public String toString() {
      return Registry.field16092.method9181(this).toString();
   }

   public Optional<Codec<Class8222<U>>> method31926() {
      return this.field39872;
   }

   private static <U> Class8830<U> method31927(String var0, Codec<U> var1) {
      return Registry.<Class8830<?>, Class8830<U>>register(Registry.field16092, new ResourceLocation(var0), new Class8830<U>(Optional.<Codec<U>>of(var1)));
   }

   private static <U> Class8830<U> method31928(String var0) {
      return Registry.<Class8830<?>, Class8830<U>>register(Registry.field16092, new ResourceLocation(var0), new Class8830<U>(Optional.<Codec<U>>empty()));
   }
}
