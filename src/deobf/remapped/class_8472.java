package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.function.Supplier;

public final class class_8472 {
   public static final Codec<class_8472> field_43409 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8760.field_44831.fieldOf("type").forGetter(class_8472::method_38992),
               class_6541.field_33265.fieldOf("generator").forGetter(class_8472::method_38996)
            )
            .apply(var0, var0.stable(class_8472::new))
   );
   public static final class_5621<class_8472> field_43412 = class_5621.<class_8472>method_25497(class_8669.field_44420, new class_4639("overworld"));
   public static final class_5621<class_8472> field_43413 = class_5621.<class_8472>method_25497(class_8669.field_44420, new class_4639("the_nether"));
   public static final class_5621<class_8472> field_43410 = class_5621.<class_8472>method_25497(class_8669.field_44420, new class_4639("the_end"));
   private static final LinkedHashSet<class_5621<class_8472>> field_43411 = Sets.newLinkedHashSet(ImmutableList.of(field_43412, field_43413, field_43410));
   private final Supplier<class_8760> field_43414;
   private final class_6541 field_43415;

   public class_8472(Supplier<class_8760> var1, class_6541 var2) {
      this.field_43414 = var1;
      this.field_43415 = var2;
   }

   public Supplier<class_8760> method_38992() {
      return this.field_43414;
   }

   public class_8760 method_38995() {
      return this.field_43414.get();
   }

   public class_6541 method_38996() {
      return this.field_43415;
   }

   public static class_5383<class_8472> method_38997(class_5383<class_8472> var0) {
      class_5383 var3 = new class_5383<class_8472>(class_8669.field_44420, Lifecycle.experimental());

      for (class_5621 var5 : field_43411) {
         class_8472 var6 = (class_8472)var0.method_39799(var5);
         if (var6 != null) {
            var3.<class_8472>method_29381(var5, var6, var0.method_39813(var6));
         }
      }

      for (Entry var8 : var0.method_39808()) {
         class_5621 var9 = (class_5621)var8.getKey();
         if (!field_43411.contains(var9)) {
            var3.<Object>method_29381(var9, var8.getValue(), var0.method_39813(var8.getValue()));
         }
      }

      return var3;
   }

   public static boolean method_38993(long var0, class_5383<class_8472> var2) {
      ArrayList var5 = Lists.newArrayList(var2.method_39808());
      if (var5.size() == field_43411.size()) {
         Entry var6 = (Entry)var5.get(0);
         Entry var7 = (Entry)var5.get(1);
         Entry var8 = (Entry)var5.get(2);
         if (var6.getKey() != field_43412 || var7.getKey() != field_43413 || var8.getKey() != field_43410) {
            return false;
         } else if (!((class_8472)var6.getValue()).method_38995().method_40222(class_8760.field_44823)
            && ((class_8472)var6.getValue()).method_38995() != class_8760.field_44847) {
            return false;
         } else if (!((class_8472)var7.getValue()).method_38995().method_40222(class_8760.field_44838)) {
            return false;
         } else if (!((class_8472)var8.getValue()).method_38995().method_40222(class_8760.field_44822)) {
            return false;
         } else if (((class_8472)var7.getValue()).method_38996() instanceof class_322 && ((class_8472)var8.getValue()).method_38996() instanceof class_322) {
            class_322 var9 = (class_322)((class_8472)var7.getValue()).method_38996();
            class_322 var10 = (class_322)((class_8472)var8.getValue()).method_38996();
            if (!var9.method_1503(var0, class_7902.field_40413)) {
               return false;
            } else if (!var10.method_1503(var0, class_7902.field_40410)) {
               return false;
            } else if (var9.method_29817() instanceof class_7258) {
               class_7258 var11 = (class_7258)var9.method_29817();
               if (!var11.method_33176(var0)) {
                  return false;
               } else if (var10.method_29817() instanceof class_8627) {
                  class_8627 var12 = (class_8627)var10.method_29817();
                  return var12.method_39622(var0);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
