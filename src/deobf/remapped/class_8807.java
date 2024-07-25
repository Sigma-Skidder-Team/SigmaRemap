package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_8807 {
   private static final Map<class_4639, class_911<?>> field_45039 = Maps.newHashMap();
   public static final class_5656 field_45045 = method_40480(new class_5656());
   public static final class_2544 field_45078 = method_40480(new class_2544(new class_4639("player_killed_entity")));
   public static final class_2544 field_45060 = method_40480(new class_2544(new class_4639("entity_killed_player")));
   public static final class_1836 field_45077 = method_40480(new class_1836());
   public static final class_8281 field_45062 = method_40480(new class_8281());
   public static final class_8435 field_45065 = method_40480(new class_8435());
   public static final class_7121 field_45070 = method_40480(new class_7121());
   public static final class_3242 field_45041 = method_40480(new class_3242());
   public static final class_5800 field_45073 = method_40480(new class_5800());
   public static final class_9620 field_45082 = method_40480(new class_9620());
   public static final class_2809 field_45068 = method_40480(new class_2809());
   public static final class_1986 field_45076 = method_40480(new class_1986());
   public static final class_5027 field_45080 = method_40480(new class_5027());
   public static final class_4950 field_45046 = method_40480(new class_4950());
   public static final class_1283 field_45072 = method_40480(new class_1283());
   public static final class_1663 field_45067 = method_40480(new class_1663(new class_4639("location")));
   public static final class_1663 field_45071 = method_40480(new class_1663(new class_4639("slept_in_bed")));
   public static final class_8565 field_45048 = method_40480(new class_8565());
   public static final class_3488 field_45051 = method_40480(new class_3488());
   public static final class_1819 field_45042 = method_40480(new class_1819());
   public static final class_8558 field_45050 = method_40480(new class_8558());
   public static final class_8459 field_45058 = method_40480(new class_8459());
   public static final class_232 field_45079 = method_40480(new class_232());
   public static final class_7997 field_45047 = method_40480(new class_7997());
   public static final class_2319 field_45052 = method_40480(new class_2319());
   public static final class_9386 field_45081 = method_40480(new class_9386());
   public static final class_4947 field_45059 = method_40480(new class_4947());
   public static final class_2074 field_45043 = method_40480(new class_2074());
   public static final class_3052 field_45049 = method_40480(new class_3052());
   public static final class_1441 field_45056 = method_40480(new class_1441());
   public static final class_3279 field_45044 = method_40480(new class_3279());
   public static final class_3989 field_45069 = method_40480(new class_3989());
   public static final class_4577 field_45057 = method_40480(new class_4577());
   public static final class_1663 field_45064 = method_40480(new class_1663(new class_4639("hero_of_the_village")));
   public static final class_1663 field_45053 = method_40480(new class_1663(new class_4639("voluntary_exile")));
   public static final class_7363 field_45061 = method_40480(new class_7363());
   public static final class_5784 field_45040 = method_40480(new class_5784());
   public static final class_8892 field_45066 = method_40480(new class_8892());
   public static final class_321 field_45074 = method_40480(new class_321());
   public static final class_6087 field_45075 = method_40480(new class_6087());
   public static final class_3165 field_45055 = method_40480(new class_3165());
   public static final class_3662 field_45063 = method_40480(new class_3662());

   private static <T extends class_911<?>> T method_40480(T var0) {
      if (!field_45039.containsKey(var0.method_3899())) {
         field_45039.put(var0.method_3899(), var0);
         return (T)var0;
      } else {
         throw new IllegalArgumentException("Duplicate criterion id " + var0.method_3899());
      }
   }

   @Nullable
   public static <T extends class_5154> class_911<T> method_40478(class_4639 var0) {
      return (class_911<T>)field_45039.get(var0);
   }

   public static Iterable<? extends class_911<?>> method_40477() {
      return field_45039.values();
   }
}
