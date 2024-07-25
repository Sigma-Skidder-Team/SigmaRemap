package remapped;

import java.util.List;

public class class_3006 implements class_857 {
   private static String[] field_14759;

   public class_3006(class_3375 var1) {
      this.field_14760 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 1);
      class_6548 var6 = class_2249.method_10330(var5, var1.<List<class_5407>>method_23248(class_2287.field_11420, 0));
      if (var6 != null) {
         var1.method_23257(class_8039.field_41157, 1, var6.method_3416());
         var1.method_23255().<class_9709>method_6746(class_9709.class).method_14878(var4, var6);
         this.field_14760.field_16642.method_33131(var4, var1.<List<class_5407>>method_23248(class_2287.field_11420, 0), var1.method_23255());
      }
   }
}
