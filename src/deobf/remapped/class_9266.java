package remapped;

public class class_9266 implements class_857 {
   private static String[] field_47284;

   public class_9266(class_8786 var1) {
      this.field_47283 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_1189 var4 = var1.method_23255().<class_1189>method_6746(class_1189.class);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      class_9530 var6 = var1.<class_9530>method_23248(class_8039.field_41149, 0);
      if (var6 != null && class_6890.method_31575(var6.method_43963())) {
         var4.method_5262().add(var5);
      } else {
         var4.method_5262().remove(var5);
      }
   }
}
