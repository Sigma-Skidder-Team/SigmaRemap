package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_731 extends class_6414 {
   private static String[] field_3988;
   private static final Map<class_6414, class_6414> field_3990 = Maps.newHashMap();
   public static final class_4190 field_3989 = class_6414.method_29292(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final class_6414 field_3991;

   public class_731(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_3991 = var1;
      field_3990.put(var1, this);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_3989;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      ItemStack var9 = var4.method_26617(var5);
      class_2451 var10 = var9.method_27960();
      class_6414 var11 = !(var10 instanceof class_6201)
         ? class_4783.field_23184
         : field_3990.getOrDefault(((class_6201)var10).method_28392(), class_4783.field_23184);
      boolean var12 = var11 == class_4783.field_23184;
      boolean var13 = this.field_3991 == class_4783.field_23184;
      if (var12 == var13) {
         return class_6910.field_35518;
      } else {
         if (!var13) {
            ItemStack var14 = new ItemStack(this.field_3991);
            if (!var9.method_28022()) {
               if (!var4.method_3245(var14)) {
                  var4.method_3153(var14, false);
               }
            } else {
               var4.method_26615(var5, var14);
            }

            var2.method_7513(var3, class_4783.field_23660.method_29260(), 3);
         } else {
            var2.method_7513(var3, var11.method_29260(), 3);
            var4.method_3209(class_6234.field_31892);
            if (!var4.playerAbilities.isCreativeMode) {
               var9.method_27970(1);
            }
         }

         return class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return this.field_3991 != class_4783.field_23184 ? new ItemStack(this.field_3991) : super.method_29276(var1, var2, var3);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == Direction.field_802 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   public class_6414 method_3340() {
      return this.field_3991;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
