package remapped;

public class class_3314 extends class_2526<Short, Integer> {
   private static String[] field_16374;

   public class_3314(class_8786 var1, class_8039 var2) {
      super(var2);
      this.field_16373 = var1;
   }

   public Integer method_15198(class_5051 var1, Short var2) throws Exception {
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      int var6 = var1.method_23255().<class_1189>method_6746(class_1189.class).method_14874();
      return var5 != var6 ? var2 <= 0 ? var2.intValue() : var2.intValue() + 1 : var2.intValue() + 2;
   }
}
