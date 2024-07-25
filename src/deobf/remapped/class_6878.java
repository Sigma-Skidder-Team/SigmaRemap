package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_6878 {
   private static final Map<class_4639, class_3825> field_35418 = Maps.newHashMap();
   private static final class_4639 field_35420 = new class_4639("damaged");
   private static final class_4639 field_35419 = new class_4639("damage");
   private static final class_3825 field_35422 = (var0, var1, var2) -> !var0.method_27995() ? 0.0F : 1.0F;
   private static final class_3825 field_35417 = (var0, var1, var2) -> class_9299.method_42828(
         (float)var0.method_28026() / (float)var0.method_27957(), 0.0F, 1.0F
      );
   private static final Map<class_2451, Map<class_4639, class_3825>> field_35416 = Maps.newHashMap();

   private static class_3825 method_31545(class_4639 var0, class_3825 var1) {
      field_35418.put(var0, var1);
      return var1;
   }

   private static void method_31547(class_2451 var0, class_4639 var1, class_3825 var2) {
      field_35416.computeIfAbsent(var0, var0x -> Maps.newHashMap()).put(var1, var2);
   }

   @Nullable
   public static class_3825 method_31546(class_2451 var0, class_4639 var1) {
      if (var0.method_11234() > 0) {
         if (field_35419.equals(var1)) {
            return field_35417;
         }

         if (field_35420.equals(var1)) {
            return field_35422;
         }
      }

      class_3825 var4 = field_35418.get(var1);
      if (var4 == null) {
         Map var5 = field_35416.get(var0);
         return var5 != null ? (class_3825)var5.get(var1) : null;
      } else {
         return var4;
      }
   }

   static {
      method_31545(new class_4639("lefthanded"), (var0, var1, var2) -> var2 != null && var2.method_26432() != class_1736.field_8943 ? 1.0F : 0.0F);
      method_31545(
         new class_4639("cooldown"),
         (var0, var1, var2) -> !(var2 instanceof class_704) ? 0.0F : ((class_704)var2).method_3173().method_32960(var0.method_27960(), 0.0F)
      );
      method_31545(
         new class_4639("custom_model_data"), (var0, var1, var2) -> !var0.method_28002() ? 0.0F : (float)var0.method_27990().method_25947("CustomModelData")
      );
      method_31547(class_4897.field_25206, new class_4639("pull"), (var0, var1, var2) -> {
         if (var2 != null) {
            return var2.method_26576() == var0 ? (float)(var0.method_28004() - var2.method_26466()) / 20.0F : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method_31547(
         class_4897.field_25206,
         new class_4639("pulling"),
         (var0, var1, var2) -> var2 != null && var2.method_26554() && var2.method_26576() == var0 ? 1.0F : 0.0F
      );
      method_31547(class_4897.field_24565, new class_4639("time"), new class_6180());
      method_31547(class_4897.field_24830, new class_4639("angle"), new class_9757());
      method_31547(class_4897.field_25030, new class_4639("pull"), (var0, var1, var2) -> {
         if (var2 != null) {
            return !class_4380.method_20408(var0) ? (float)(var0.method_28004() - var2.method_26466()) / (float)class_4380.method_20403(var0) : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method_31547(
         class_4897.field_25030,
         new class_4639("pulling"),
         (var0, var1, var2) -> var2 != null && var2.method_26554() && var2.method_26576() == var0 && !class_4380.method_20408(var0) ? 1.0F : 0.0F
      );
      method_31547(class_4897.field_25030, new class_4639("charged"), (var0, var1, var2) -> var2 != null && class_4380.method_20408(var0) ? 1.0F : 0.0F);
      method_31547(
         class_4897.field_25030,
         new class_4639("firework"),
         (var0, var1, var2) -> var2 != null && class_4380.method_20408(var0) && class_4380.method_20413(var0, class_4897.field_24479) ? 1.0F : 0.0F
      );
      method_31547(class_4897.field_24503, new class_4639("broken"), (var0, var1, var2) -> !class_3286.method_15061(var0) ? 1.0F : 0.0F);
      method_31547(class_4897.field_24505, new class_4639("cast"), (var0, var1, var2) -> {
         if (var2 != null) {
            boolean var5 = var2.method_26446() == var0;
            boolean var6 = var2.method_26568() == var0;
            if (var2.method_26446().method_27960() instanceof class_8411) {
               var6 = false;
            }

            return (var5 || var6) && var2 instanceof class_704 && ((class_704)var2).field_3841 != null ? 1.0F : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method_31547(
         class_4897.field_24840,
         new class_4639("blocking"),
         (var0, var1, var2) -> var2 != null && var2.method_26554() && var2.method_26576() == var0 ? 1.0F : 0.0F
      );
      method_31547(
         class_4897.field_25086,
         new class_4639("throwing"),
         (var0, var1, var2) -> var2 != null && var2.method_26554() && var2.method_26576() == var0 ? 1.0F : 0.0F
      );
   }
}
