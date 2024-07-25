package remapped;

public class class_5040 extends class_7934 {
   private static String[] field_26067;
   private final class_8383 field_26066;

   public class_5040(class_8383 var1, class_6867 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field_26066 = var1;
   }

   @Override
   public boolean method_35889(class_6098 var1) {
      return this.field_26066.method_38634(var1) || method_23213(var1);
   }

   @Override
   public int method_35890(class_6098 var1) {
      return !method_23213(var1) ? super.method_35890(var1) : 1;
   }

   public static boolean method_23213(class_6098 var0) {
      return var0.method_27960() == class_4897.field_24548;
   }
}
