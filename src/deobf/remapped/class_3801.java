package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public enum class_3801 implements class_4530 {
   field_18598("WORLD_SURFACE_WG", class_7195.field_36998, class_2131.method_9950()),
   field_18592("WORLD_SURFACE", class_7195.field_37001, class_2131.method_9950()),
   field_18591("OCEAN_FLOOR_WG", class_7195.field_36998, class_2131.method_9952()),
   field_18599("OCEAN_FLOOR", class_7195.field_36997, class_2131.method_9952()),
   field_18595("MOTION_BLOCKING", class_7195.field_37001, var0 -> var0.method_8362().method_24502() || !var0.method_8364().method_22001()),
   field_18590(
      "MOTION_BLOCKING_NO_LEAVES",
      class_7195.field_36997,
      var0 -> (var0.method_8362().method_24502() || !var0.method_8364().method_22001()) && !(var0.method_8360() instanceof class_4423)
   );

   public static final Codec<class_3801> field_18596 = class_4530.<class_3801>method_21048(class_3801::values, class_3801::method_17673);
   private final String field_18601;
   private final class_7195 field_18594;
   private final Predicate<class_2522> field_18597;
   private static final Map<String, class_3801> field_18600 = Util.<Map<String, class_3801>>make(Maps.newHashMap(), var0 -> {
      for (class_3801 var6 : values()) {
         var0.put(var6.field_18601, var6);
      }
   });

   private class_3801(String var3, class_7195 var4, Predicate<class_2522> var5) {
      this.field_18601 = var3;
      this.field_18594 = var4;
      this.field_18597 = var5;
   }

   public String method_17676() {
      return this.field_18601;
   }

   public boolean method_17677() {
      return this.field_18594 == class_7195.field_37001;
   }

   public boolean method_17678() {
      return this.field_18594 != class_7195.field_36998;
   }

   @Nullable
   public static class_3801 method_17673(String var0) {
      return field_18600.get(var0);
   }

   public Predicate<class_2522> method_17675() {
      return this.field_18597;
   }

   @Override
   public String method_21049() {
      return this.field_18601;
   }
}
