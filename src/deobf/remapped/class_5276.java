package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_5276 {
   public static final Identifier field_26958 = new Identifier("textures/atlas/shulker_boxes.png");
   public static final Identifier field_26970 = new Identifier("textures/atlas/beds.png");
   public static final Identifier field_26965 = new Identifier("textures/atlas/banner_patterns.png");
   public static final Identifier field_26973 = new Identifier("textures/atlas/shield_patterns.png");
   public static final Identifier field_26955 = new Identifier("textures/atlas/signs.png");
   public static final Identifier field_26980 = new Identifier("textures/atlas/chest.png");
   private static final RenderLayer field_26971 = RenderLayer.method_16755(field_26958);
   private static final RenderLayer field_26962 = RenderLayer.method_16734(field_26970);
   private static final RenderLayer field_26966 = RenderLayer.method_16750(field_26965);
   private static final RenderLayer field_26972 = RenderLayer.method_16750(field_26973);
   private static final RenderLayer field_26967 = RenderLayer.method_16755(field_26955);
   private static final RenderLayer field_26963 = RenderLayer.method_16747(field_26980);
   private static final RenderLayer field_26959 = RenderLayer.method_16734(class_8359.field_42824);
   private static final RenderLayer field_26977 = RenderLayer.method_16747(class_8359.field_42824);
   private static final RenderLayer field_26961 = RenderLayer.method_16766(class_8359.field_42824);
   private static final RenderLayer field_26954 = RenderLayer.method_16735(class_8359.field_42824);
   public static final class_2843 field_26968 = new class_2843(field_26958, new Identifier("entity/shulker/shulker"));
   public static final List<class_2843> field_26969 = Stream.<String>of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .<class_2843>map(var0 -> new class_2843(field_26958, new Identifier("entity/shulker/shulker_" + var0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<class_9271, class_2843> field_26953 = class_9271.method_42720()
      .collect(Collectors.toMap(Function.<class_9271>identity(), class_5276::method_24073));
   public static final class_2843[] field_26956 = Arrays.<class_9077>stream(class_9077.values())
      .sorted(Comparator.comparingInt(class_9077::method_41794))
      .<class_2843>map(var0 -> new class_2843(field_26970, new Identifier("entity/bed/" + var0.method_41796())))
      .<class_2843>toArray(class_2843[]::new);
   public static final class_2843 field_26960 = method_24077("trapped");
   public static final class_2843 field_26957 = method_24077("trapped_left");
   public static final class_2843 field_26964 = method_24077("trapped_right");
   public static final class_2843 field_26981 = method_24077("christmas");
   public static final class_2843 field_26976 = method_24077("christmas_left");
   public static final class_2843 field_26978 = method_24077("christmas_right");
   public static final class_2843 field_26974 = method_24077("normal");
   public static final class_2843 field_26975 = method_24077("normal_left");
   public static final class_2843 field_26951 = method_24077("normal_right");
   public static final class_2843 field_26952 = method_24077("ender");

   public static RenderLayer method_24081() {
      return field_26966;
   }

   public static RenderLayer method_24084() {
      return field_26972;
   }

   public static RenderLayer method_24070() {
      return field_26962;
   }

   public static RenderLayer method_24071() {
      return field_26971;
   }

   public static RenderLayer method_24080() {
      return field_26967;
   }

   public static RenderLayer method_24082() {
      return field_26963;
   }

   public static RenderLayer method_24074() {
      return field_26959;
   }

   public static RenderLayer method_24083() {
      return field_26977;
   }

   public static RenderLayer method_24076() {
      return field_26961;
   }

   public static RenderLayer method_24072() {
      return field_26954;
   }

   public static void method_24069(Consumer<class_2843> var0) {
      var0.accept(field_26968);
      field_26969.forEach(var0);

      for (class_8427 var6 : class_8427.values()) {
         var0.accept(new class_2843(field_26965, var6.method_38784(true)));
         var0.accept(new class_2843(field_26973, var6.method_38784(false)));
      }

      field_26953.values().forEach(var0);

      for (class_2843 var10 : field_26956) {
         var0.accept(var10);
      }

      var0.accept(field_26960);
      var0.accept(field_26957);
      var0.accept(field_26964);
      var0.accept(field_26981);
      var0.accept(field_26976);
      var0.accept(field_26978);
      var0.accept(field_26974);
      var0.accept(field_26975);
      var0.accept(field_26951);
      var0.accept(field_26952);
   }

   public static class_2843 method_24073(class_9271 var0) {
      return new class_2843(field_26955, new Identifier("entity/signs/" + var0.method_42719()));
   }

   private static class_2843 method_24077(String var0) {
      return new class_2843(field_26980, new Identifier("entity/chest/" + var0));
   }

   public static class_2843 method_24078(class_3757 var0, class_9264 var1, boolean var2) {
      if (!var2) {
         if (!(var0 instanceof class_1962)) {
            return !(var0 instanceof class_9180) ? method_24079(var1, field_26974, field_26975, field_26951) : field_26952;
         } else {
            return method_24079(var1, field_26960, field_26957, field_26964);
         }
      } else {
         return method_24079(var1, field_26981, field_26976, field_26978);
      }
   }

   private static class_2843 method_24079(class_9264 var0, class_2843 var1, class_2843 var2, class_2843 var3) {
      switch (var0) {
         case field_47279:
            return var2;
         case field_47277:
            return var3;
         case field_47274:
         default:
            return var1;
      }
   }
}
