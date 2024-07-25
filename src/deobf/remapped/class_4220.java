package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class class_4220 extends class_3077 {
   private static String[] field_20483;
   private static final Set<class_6414> field_20482 = ImmutableSet.of(
      class_4783.field_23273,
      class_4783.field_23490,
      class_4783.field_23429,
      class_4783.field_23848,
      class_4783.field_23302,
      class_4783.field_23752,
      new class_6414[]{
         class_4783.field_23626,
         class_4783.field_23172,
         class_4783.field_23386,
         class_4783.field_23539,
         class_4783.field_23493,
         class_4783.field_23268,
         class_4783.field_23756,
         class_4783.field_23467
      }
   );
   public static final Map<class_6414, class_2522> field_20481 = Maps.newHashMap(
      ImmutableMap.of(
         class_4783.field_23259,
         class_4783.field_23421.method_29260(),
         class_4783.field_23608,
         class_4783.field_23421.method_29260(),
         class_4783.field_23592,
         class_4783.field_23421.method_29260(),
         class_4783.field_23577,
         class_4783.field_23592.method_29260()
      )
   );

   public class_4220(class_1525 var1, int var2, float var3, class_317 var4) {
      super((float)var2, var3, var1, field_20482, var4);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      if (var1.method_21857() != Direction.field_802 && var4.method_28262(var5.method_6081()).method_8345()) {
         class_2522 var6 = field_20481.get(var4.method_28262(var5).method_8360());
         if (var6 != null) {
            class_704 var7 = var1.method_21868();
            var4.method_43359(var7, var5, class_463.field_2160, class_562.field_3322, 1.0F, 1.0F);
            if (!var4.field_33055) {
               var4.method_7513(var5, var6, 11);
               if (var7 != null) {
                  var1.method_21867().method_28003(1, var7, var1x -> var1x.method_26447(var1.method_21860()));
               }
            }

            return class_6910.method_31659(var4.field_33055);
         }
      }

      return class_6910.field_35521;
   }
}
