package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;

public final class class_7529 {
   private static final Map<class_4269, Pair<String, String>> field_38446 = ImmutableMap.of(
      class_4269.field_20684,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      class_4269.field_20685,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      class_4269.field_20681,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      class_4269.field_20680,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<class_4269, class_7670> field_38444;

   private class_7529(Map<class_4269, class_7670> var1) {
      this.field_38444 = var1;
   }

   public class_7529() {
      this(class_9665.<Map<class_4269, class_7670>>method_44659(Maps.newEnumMap(class_4269.class), var0 -> {
         for (class_4269 var6 : class_4269.values()) {
            var0.put(var6, new class_7670(false, false));
         }
      }));
   }

   public boolean method_34301(class_4269 var1) {
      return class_7670.method_34758(this.field_38444.get(var1));
   }

   public void method_34308(class_4269 var1, boolean var2) {
      class_7670.method_34757(this.field_38444.get(var1), var2);
   }

   public boolean method_34305(class_4269 var1) {
      return class_7670.method_34756(this.field_38444.get(var1));
   }

   public void method_34302(class_4269 var1, boolean var2) {
      class_7670.method_34753(this.field_38444.get(var1), var2);
   }

   public static class_7529 method_34307(class_8248 var0) {
      EnumMap var3 = Maps.newEnumMap(class_4269.class);

      for (class_4269 var7 : class_4269.values()) {
         boolean var8 = var0.readBoolean();
         boolean var9 = var0.readBoolean();
         var3.put(var7, new class_7670(var8, var9));
      }

      return new class_7529(var3);
   }

   public void method_34303(class_8248 var1) {
      for (class_4269 var7 : class_4269.values()) {
         class_7670 var8 = this.field_38444.get(var7);
         if (var8 != null) {
            var1.writeBoolean(class_7670.method_34758(var8));
            var1.writeBoolean(class_7670.method_34756(var8));
         } else {
            var1.writeBoolean(false);
            var1.writeBoolean(false);
         }
      }
   }

   public static class_7529 method_34304(class_5734 var0) {
      EnumMap var3 = Maps.newEnumMap(class_4269.class);
      field_38446.forEach((var2, var3x) -> {
         boolean var6 = var0.method_25933((String)var3x.getFirst());
         boolean var7 = var0.method_25933((String)var3x.getSecond());
         var3.put(var2, new class_7670(var6, var7));
      });
      return new class_7529(var3);
   }

   public void method_34309(class_5734 var1) {
      field_38446.forEach((var2, var3) -> {
         class_7670 var6 = this.field_38444.get(var2);
         var1.method_25934((String)var3.getFirst(), class_7670.method_34758(var6));
         var1.method_25934((String)var3.getSecond(), class_7670.method_34756(var6));
      });
   }

   public class_7529 method_34310() {
      EnumMap var3 = Maps.newEnumMap(class_4269.class);

      for (class_4269 var7 : class_4269.values()) {
         class_7670 var8 = this.field_38444.get(var7);
         var3.put(var7, var8.method_34755());
      }

      return new class_7529(var3);
   }

   public void method_34311(class_7529 var1) {
      this.field_38444.clear();

      for (class_4269 var7 : class_4269.values()) {
         class_7670 var8 = var1.field_38444.get(var7);
         this.field_38444.put(var7, var8.method_34755());
      }
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class_7529 && this.field_38444.equals(((class_7529)var1).field_38444);
   }

   @Override
   public int hashCode() {
      return this.field_38444.hashCode();
   }
}
