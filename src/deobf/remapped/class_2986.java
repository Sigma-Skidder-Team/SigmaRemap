package remapped;

public class class_2986 {
   private static String[] field_14688;
   private static class_7373 field_14689 = null;

   public static void method_13669() {
      field_14689 = class_3111.method_14327().method_8505().method_3716().method_43946(class_4783.field_23552.method_29260());
   }

   public static class_7373 method_13668() {
      return field_14689;
   }

   public static class_2522 method_13670() {
      return class_4783.field_23552.method_29260();
   }

   public static boolean method_13667(class_5561 var0, class_2522 var1, class_1331 var2) {
      if (var0 instanceof class_6163) {
         return method_13664(var0, var1, var2) ? method_13665(var0, var2) : false;
      } else {
         return false;
      }
   }

   private static boolean method_13665(class_6163 var0, class_1331 var1) {
      class_6414 var4 = class_4783.field_23552;
      if (var0.method_28262(var1.method_6094()).method_8360() == var4
         || var0.method_28262(var1.method_6073()).method_8360() == var4
         || var0.method_28262(var1.method_6108()).method_8360() == var4
         || var0.method_28262(var1.method_6090()).method_8360() == var4) {
         class_2522 var5 = var0.method_28262(var1.method_6100());
         if (var5.method_8321(var0, var1)) {
            return true;
         }

         class_6414 var6 = var5.method_8360();
         if (var6 instanceof class_3049) {
            return var5.<class_5122>method_10313(class_3049.field_14955) == class_5122.field_26440;
         }

         if (var6 instanceof class_6344) {
            return var5.<class_6666>method_10313(class_6344.field_32395) == class_6666.field_34466;
         }
      }

      return false;
   }

   private static boolean method_13664(class_6163 var0, class_2522 var1, class_1331 var2) {
      if (!var1.method_8321(var0, var2)) {
         class_6414 var5 = var1.method_8360();
         if (var5 == class_4783.field_23813) {
            return false;
         } else if (!(var5 instanceof class_2830)
            || !(var5 instanceof class_3064)
               && !(var5 instanceof class_8543)
               && !(var5 instanceof class_8259)
               && !(var5 instanceof class_74)
               && !(var5 instanceof class_7069)) {
            if (var5 instanceof class_3821
               || var5 instanceof class_1645
               || var5 instanceof class_731
               || var5 instanceof class_9787
               || var5 instanceof class_9281
               || var5 instanceof class_5177) {
               return true;
            } else if (var5 instanceof class_8601) {
               return true;
            } else if (var5 instanceof class_3049) {
               return var1.<class_5122>method_10313(class_3049.field_14955) == class_5122.field_26440;
            } else if (var5 instanceof class_6344) {
               return var1.<class_6666>method_10313(class_6344.field_32395) == class_6666.field_34466;
            } else if (var5 instanceof class_7812) {
               return var1.<class_1895>method_10313(class_7812.field_12920) != class_1895.field_9677;
            } else if (var5 instanceof class_9279) {
               return true;
            } else if (var5 instanceof class_5613) {
               return true;
            } else if (var5 instanceof class_1475) {
               return true;
            } else {
               return !(var5 instanceof class_1477) ? var5 instanceof class_4196 : true;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
