package remapped;

import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Set;

public class class_7938 extends class_3077 {
   private static String[] field_40601;
   private static final Set<class_5371> field_40599 = Sets.newHashSet(
      new class_5371[]{
         class_5371.field_27441, class_5371.field_27389, class_5371.field_27440, class_5371.field_27428, class_5371.field_27412, class_5371.field_27437
      }
   );
   private static final Set<class_6414> field_40600 = Sets.newHashSet(
      new class_6414[]{
         class_4783.field_23748,
         class_4783.field_23348,
         class_4783.field_23200,
         class_4783.field_23699,
         class_4783.field_23672,
         class_4783.field_23630,
         class_4783.field_23669,
         class_4783.field_23494,
         class_4783.field_23728,
         class_4783.field_23530
      }
   );
   public static final Map<class_6414, class_6414> field_40598 = new Builder()
      .put(class_4783.field_23732, class_4783.field_23237)
      .put(class_4783.field_23365, class_4783.field_23903)
      .put(class_4783.field_23171, class_4783.field_23805)
      .put(class_4783.field_23197, class_4783.field_23832)
      .put(class_4783.field_23882, class_4783.field_23798)
      .put(class_4783.field_23189, class_4783.field_23185)
      .put(class_4783.field_23241, class_4783.field_23631)
      .put(class_4783.field_23764, class_4783.field_23872)
      .put(class_4783.field_23199, class_4783.field_23907)
      .put(class_4783.field_23876, class_4783.field_23599)
      .put(class_4783.field_23270, class_4783.field_23443)
      .put(class_4783.field_23579, class_4783.field_23691)
      .put(class_4783.field_23442, class_4783.field_23612)
      .put(class_4783.field_23537, class_4783.field_23844)
      .put(class_4783.field_23912, class_4783.field_23880)
      .put(class_4783.field_23780, class_4783.field_23473)
      .build();

   public class_7938(class_1525 var1, float var2, float var3, class_317 var4) {
      super(var2, var3, var1, field_40600, var4);
   }

   @Override
   public float method_11235(ItemStack var1, class_2522 var2) {
      class_5371 var5 = var2.method_8362();
      return !field_40599.contains(var5) ? super.method_11235(var1, var2) : this.field_15134;
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      class_6414 var7 = field_40598.get(var6.method_8360());
      if (var7 == null) {
         return class_6910.field_35521;
      } else {
         PlayerEntity var8 = var1.method_21868();
         var4.method_43359(var8, var5, SoundEvents.field_2534, class_562.field_3322, 1.0F, 1.0F);
         if (!var4.field_33055) {
            var4.method_7513(var5, var7.method_29260().method_10308(class_7947.field_40671, var6.<class_9249>method_10313(class_7947.field_40671)), 11);
            if (var8 != null) {
               var1.method_21867().method_28003(1, var8, var1x -> var1x.method_26447(var1.method_21860()));
            }
         }

         return class_6910.method_31659(var4.field_33055);
      }
   }
}
