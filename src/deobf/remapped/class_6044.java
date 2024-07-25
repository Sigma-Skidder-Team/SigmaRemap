package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class class_6044<U> {
   public static final class_6044<Void> field_30882 = method_27596("dummy");
   public static final class_6044<class_8150> field_30854 = method_27595("home", class_8150.field_41784);
   public static final class_6044<class_8150> field_30883 = method_27595("job_site", class_8150.field_41784);
   public static final class_6044<class_8150> field_30868 = method_27595("potential_job_site", class_8150.field_41784);
   public static final class_6044<class_8150> field_30871 = method_27595("meeting_point", class_8150.field_41784);
   public static final class_6044<List<class_8150>> field_30887 = method_27596("secondary_job_site");
   public static final class_6044<List<class_5834>> field_30907 = method_27596("mobs");
   public static final class_6044<List<class_5834>> field_30901 = method_27596("visible_mobs");
   public static final class_6044<List<class_5834>> field_30875 = method_27596("visible_villager_babies");
   public static final class_6044<List<PlayerEntity>> field_30886 = method_27596("nearest_players");
   public static final class_6044<PlayerEntity> field_30870 = method_27596("nearest_visible_player");
   public static final class_6044<PlayerEntity> field_30912 = method_27596("nearest_visible_targetable_player");
   public static final class_6044<class_6651> field_30889 = method_27596("walk_target");
   public static final class_6044<class_7835> field_30874 = method_27596("look_target");
   public static final class_6044<class_5834> field_30884 = method_27596("attack_target");
   public static final class_6044<Boolean> field_30865 = method_27596("attack_cooling_down");
   public static final class_6044<class_5834> field_30861 = method_27596("interaction_target");
   public static final class_6044<class_1899> field_30892 = method_27596("breed_target");
   public static final class_6044<Entity> field_30903 = method_27596("ride_target");
   public static final class_6044<class_3998> field_30888 = method_27596("path");
   public static final class_6044<List<class_8150>> field_30900 = method_27596("interactable_doors");
   public static final class_6044<Set<class_8150>> field_30872 = method_27596("doors_to_close");
   public static final class_6044<BlockPos> field_30910 = method_27596("nearest_bed");
   public static final class_6044<DamageSource> field_30867 = method_27596("hurt_by");
   public static final class_6044<class_5834> field_30859 = method_27596("hurt_by_entity");
   public static final class_6044<class_5834> field_30913 = method_27596("avoid_target");
   public static final class_6044<class_5834> field_30896 = method_27596("nearest_hostile");
   public static final class_6044<class_8150> field_30899 = method_27596("hiding_place");
   public static final class_6044<Long> field_30894 = method_27596("heard_bell_time");
   public static final class_6044<Long> field_30909 = method_27596("cant_reach_walk_target_since");
   public static final class_6044<Boolean> field_30877 = method_27595("golem_detected_recently", Codec.BOOL);
   public static final class_6044<Long> field_30898 = method_27595("last_slept", Codec.LONG);
   public static final class_6044<Long> field_30858 = method_27595("last_woken", Codec.LONG);
   public static final class_6044<Long> field_30881 = method_27595("last_worked_at_poi", Codec.LONG);
   public static final class_6044<class_1899> field_30885 = method_27596("nearest_visible_adult");
   public static final class_6044<class_91> field_30869 = method_27596("nearest_visible_wanted_item");
   public static final class_6044<MobEntity> field_30891 = method_27596("nearest_visible_nemesis");
   public static final class_6044<UUID> field_30866 = method_27595("angry_at", class_5753.field_29117);
   public static final class_6044<Boolean> field_30880 = method_27595("universal_anger", Codec.BOOL);
   public static final class_6044<Boolean> field_30897 = method_27595("admiring_item", Codec.BOOL);
   public static final class_6044<Integer> field_30893 = method_27596("time_trying_to_reach_admire_item");
   public static final class_6044<Boolean> field_30890 = method_27596("disable_walk_to_admire_item");
   public static final class_6044<Boolean> field_30879 = method_27595("admiring_disabled", Codec.BOOL);
   public static final class_6044<Boolean> field_30864 = method_27595("hunted_recently", Codec.BOOL);
   public static final class_6044<BlockPos> field_30895 = method_27596("celebrate_location");
   public static final class_6044<Boolean> field_30862 = method_27596("dancing");
   public static final class_6044<class_6704> field_30873 = method_27596("nearest_visible_huntable_hoglin");
   public static final class_6044<class_6704> field_30914 = method_27596("nearest_visible_baby_hoglin");
   public static final class_6044<PlayerEntity> field_30904 = method_27596("nearest_targetable_player_not_wearing_gold");
   public static final class_6044<List<class_6993>> field_30876 = method_27596("nearby_adult_piglins");
   public static final class_6044<List<class_6993>> field_30902 = method_27596("nearest_visible_adult_piglins");
   public static final class_6044<List<class_6704>> field_30915 = method_27596("nearest_visible_adult_hoglins");
   public static final class_6044<class_6993> field_30863 = method_27596("nearest_visible_adult_piglin");
   public static final class_6044<class_5834> field_30908 = method_27596("nearest_visible_zombified");
   public static final class_6044<Integer> field_30878 = method_27596("visible_adult_piglin_count");
   public static final class_6044<Integer> field_30906 = method_27596("visible_adult_hoglin_count");
   public static final class_6044<PlayerEntity> field_30911 = method_27596("nearest_player_holding_wanted_item");
   public static final class_6044<Boolean> field_30857 = method_27596("ate_recently");
   public static final class_6044<BlockPos> field_30905 = method_27596("nearest_repellent");
   public static final class_6044<Boolean> field_30860 = method_27596("pacified");
   private final Optional<Codec<class_3909<U>>> field_30855;

   private class_6044(Optional<Codec<U>> var1) {
      this.field_30855 = var1.<Codec<class_3909<U>>>map(class_3909::method_18103);
   }

   @Override
   public String toString() {
      return class_8669.field_44431.method_39797(this).toString();
   }

   public Optional<Codec<class_3909<U>>> method_27594() {
      return this.field_30855;
   }

   private static <U> class_6044<U> method_27595(String var0, Codec<U> var1) {
      return class_8669.<class_6044<?>, class_6044<U>>method_39792(class_8669.field_44431, new Identifier(var0), new class_6044<U>(Optional.<Codec<U>>of(var1)));
   }

   private static <U> class_6044<U> method_27596(String var0) {
      return class_8669.<class_6044<?>, class_6044<U>>method_39792(class_8669.field_44431, new Identifier(var0), new class_6044<U>(Optional.<Codec<U>>empty()));
   }
}
