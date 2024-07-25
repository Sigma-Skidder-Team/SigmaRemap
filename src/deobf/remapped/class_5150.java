package remapped;

public class class_5150 extends class_2526<Boolean, Void> {
   private static String[] field_26512;

   public class_5150(class_1640 var1, class_8039 var2) {
      super(var2);
      this.field_26511 = var1;
   }

   public Void method_23579(class_5051 var1, Boolean var2) throws Exception {
      class_1189 var5 = var1.method_23255().<class_1189>method_6746(class_1189.class);
      if (!var2) {
         int var6 = var1.<Integer>method_23248(class_8039.field_41179, 0);
         int var7 = var1.<Integer>method_23248(class_8039.field_41179, 1);
         var1.method_23245();
         class_5051 var8 = var1.method_23259(64);
         if (var7 != -1) {
            var8.method_23236(class_8039.field_41157, var7);
            var8.method_23236(class_8039.field_41144, new int[]{var6});
            var5.method_5271().put(var6, var7);
         } else {
            if (!var5.method_5271().containsKey(var6)) {
               return null;
            }

            var8.method_23236(class_8039.field_41157, var5.method_5271().remove(var6));
            var8.method_23236(class_8039.field_41144, new int[0]);
         }

         var8.method_23233(class_6890.class);
      }

      return null;
   }
}
