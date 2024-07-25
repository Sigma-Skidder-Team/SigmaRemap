package remapped;

public class class_3945 implements class_857 {
   public class_3945(class_5486 var1) {
      this.field_19158 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      if (var1.<Short>method_23248(class_8039.field_41175, 0) == 9) {
         class_9371 var4 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
         class_5531 var5 = var1.<class_5531>method_23248(class_8039.field_41158, 0);
         var1.method_23240();
         var1.method_23253(class_7956.field_40721.method_31559());
         var1.method_23236(class_8039.field_41137, var4);

         for (int var6 = 1; var6 < 5; var6++) {
            var1.method_23236(class_8039.field_41171, (String)var5.<class_5287>method_25123("Text" + var6).method_24129());
         }
      }
   }
}
