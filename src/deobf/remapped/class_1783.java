package remapped;

import java.util.Optional;

public class class_1783 implements class_857 {
   private static String[] field_9119;

   public class_1783(class_8134 var1) {
      this.field_9120 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_1756 var4 = class_3446.method_15883().method_33743().<class_1756>method_24490(class_1756.class);
      class_9371 var5 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
      Optional var6 = var4.method_7857(var1.method_23255(), var5);
      if (var6.isPresent()) {
         class_5051 var7 = new class_5051(9, null, var1.method_23255());
         var7.method_23236(class_8039.field_41137, var5);
         var7.method_23236(class_8039.field_41175, (short)2);
         var7.method_23236(class_8039.field_41158, (class_5531)var6.get());
         var7.method_23233(class_6890.class);
      }
   }
}
