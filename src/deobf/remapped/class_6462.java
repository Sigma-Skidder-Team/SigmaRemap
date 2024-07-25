package remapped;

import java.util.List;

public class class_6462 implements class_857 {
   private static String[] field_32940;

   public class_6462(class_8923 var1) {
      this.field_32941 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      List var4 = var1.<List>method_23248(class_2287.field_11420, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      class_1189 var6 = var1.method_23255().<class_1189>method_6746(class_1189.class);
      if (!var6.method_14875(var5)) {
         var6.method_5265(var5, var4);
         var1.method_23245();
      } else {
         this.field_32941.field_45756.<class_1206>method_18997(class_1206.class).method_33131(var5, var4, var1.method_23255());
      }
   }
}
