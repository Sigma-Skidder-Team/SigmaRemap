package remapped;

import java.util.function.Supplier;

public class class_3172<U extends class_6127<?>> {
   public static final class_3172<class_8247> field_15871 = method_14625("dummy", class_8247::new);
   public static final class_3172<class_6597> field_15866 = method_14625("nearest_items", class_6597::new);
   public static final class_3172<class_6995> field_15861 = method_14625("nearest_living_entities", class_6995::new);
   public static final class_3172<class_8252> field_15860 = method_14625("nearest_players", class_8252::new);
   public static final class_3172<class_3528> field_15868 = method_14625("nearest_bed", class_3528::new);
   public static final class_3172<class_8872> field_15865 = method_14625("hurt_by", class_8872::new);
   public static final class_3172<class_3955> field_15870 = method_14625("villager_hostiles", class_3955::new);
   public static final class_3172<class_7591> field_15867 = method_14625("villager_babies", class_7591::new);
   public static final class_3172<class_6957> field_15864 = method_14625("secondary_pois", class_6957::new);
   public static final class_3172<class_9886> field_15858 = method_14625("golem_detected", class_9886::new);
   public static final class_3172<class_2987> field_15859 = method_14625("piglin_specific_sensor", class_2987::new);
   public static final class_3172<class_5275> field_15872 = method_14625("piglin_brute_specific_sensor", class_5275::new);
   public static final class_3172<class_7588> field_15873 = method_14625("hoglin_specific_sensor", class_7588::new);
   public static final class_3172<class_6960> field_15863 = method_14625("nearest_adult", class_6960::new);
   private final Supplier<U> field_15869;

   private class_3172(Supplier<U> var1) {
      this.field_15869 = var1;
   }

   public U method_14624() {
      return this.field_15869.get();
   }

   private static <U extends class_6127<?>> class_3172<U> method_14625(String var0, Supplier<U> var1) {
      return class_8669.<class_3172<?>, class_3172<U>>method_39792(class_8669.field_44389, new Identifier(var0), new class_3172<U>(var1));
   }
}
