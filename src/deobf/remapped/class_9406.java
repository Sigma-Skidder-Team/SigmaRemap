package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class class_9406 extends class_3077 {
   private static String[] field_48092;
   private static final Set<class_6414> field_48090 = Sets.newHashSet(
      new class_6414[]{
         class_4783.field_23389,
         class_4783.field_23592,
         class_4783.field_23577,
         class_4783.field_23201,
         class_4783.field_23421,
         class_4783.field_23259,
         class_4783.field_23709,
         class_4783.field_23162,
         class_4783.field_23216,
         class_4783.field_23814,
         class_4783.field_23813,
         class_4783.field_23552,
         class_4783.field_23784,
         class_4783.field_23608,
         class_4783.field_23891,
         class_4783.field_23339,
         class_4783.field_23307,
         class_4783.field_23187,
         class_4783.field_23572,
         class_4783.field_23295,
         class_4783.field_23167,
         class_4783.field_23602,
         class_4783.field_23529,
         class_4783.field_23652,
         class_4783.field_23458,
         class_4783.field_23182,
         class_4783.field_23606,
         class_4783.field_23383,
         class_4783.field_23715,
         class_4783.field_23378,
         class_4783.field_23531
      }
   );
   public static final Map<class_6414, class_2522> field_48091 = Maps.newHashMap(ImmutableMap.of(class_4783.field_23259, class_4783.field_23608.method_29260()));

   public class_9406(class_1525 var1, float var2, float var3, class_317 var4) {
      super(var2, var3, var1, field_48090, var4);
   }

   @Override
   public boolean method_11222(class_2522 var1) {
      return var1.method_8350(class_4783.field_23552) || var1.method_8350(class_4783.field_23813);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (var1.method_21857() == Direction.field_802) {
         return class_6910.field_35521;
      } else {
         PlayerEntity var7 = var1.method_21868();
         class_2522 var8 = field_48091.get(var6.method_8360());
         class_2522 var9 = null;
         if (var8 != null && var4.method_28262(var5.method_6081()).method_8345()) {
            var4.method_43359(var7, var5, SoundEvents.field_2221, class_562.field_3322, 1.0F, 1.0F);
            var9 = var8;
         } else if (var6.method_8360() instanceof class_8474 && var6.<Boolean>method_10313(class_8474.field_43423)) {
            if (!var4.method_22567()) {
               var4.method_43365((PlayerEntity)null, 1009, var5, 0);
            }

            class_8474.method_39006(var4, var5, var6);
            var9 = var6.method_10308(class_8474.field_43423, Boolean.valueOf(false));
         }

         if (var9 == null) {
            return class_6910.field_35521;
         } else {
            if (!var4.field_33055) {
               var4.method_7513(var5, var9, 11);
               if (var7 != null) {
                  var1.method_21867().method_28003(1, var7, var1x -> var1x.method_26447(var1.method_21860()));
               }
            }

            return class_6910.method_31659(var4.field_33055);
         }
      }
   }
}
