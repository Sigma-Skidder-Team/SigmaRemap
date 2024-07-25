package remapped;

public class class_2509 extends class_2451 {
   private static String[] field_12458;
   private final class_6629<? extends class_4641> field_12457;

   public class_2509(class_6629<? extends class_4641> var1, class_317 var2) {
      super(var2);
      this.field_12457 = var1;
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_1331 var4 = var1.method_21858();
      class_240 var5 = var1.method_21857();
      class_1331 var6 = var4.method_6098(var5);
      class_704 var7 = var1.method_21868();
      class_6098 var8 = var1.method_21867();
      if (var7 != null && !this.method_11437(var7, var5, var8, var6)) {
         return class_6910.field_35517;
      } else {
         class_6486 var9 = var1.method_21862();
         Object var10;
         if (this.field_12457 != class_6629.field_34313) {
            if (this.field_12457 != class_6629.field_34319) {
               return class_6910.method_31659(var9.field_33055);
            }

            var10 = new class_7451(var9, var6, var5);
         } else {
            var10 = new class_5490(var9, var6, var5);
         }

         class_5734 var11 = var8.method_27990();
         if (var11 != null) {
            class_6629.method_30458(var9, var7, (class_8145)var10, var11);
         }

         if (!((class_4641)var10).method_21472()) {
            return class_6910.field_35518;
         } else {
            if (!var9.field_33055) {
               ((class_4641)var10).method_21471();
               var9.method_7509((class_8145)var10);
            }

            var8.method_27970(1);
            return class_6910.method_31659(var9.field_33055);
         }
      }
   }

   public boolean method_11437(class_704 var1, class_240 var2, class_6098 var3, class_1331 var4) {
      return !var2.method_1029().method_42626() && var1.method_3208(var4, var2, var3);
   }
}
