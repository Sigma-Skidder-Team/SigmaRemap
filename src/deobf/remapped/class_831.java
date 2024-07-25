package remapped;

public class class_831 implements class_857 {
   private static String[] field_4368;

   public class_831(class_4632 var1) {
      this.field_4369 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9371 var4 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
      short var5 = var1.<Short>method_23248(class_8039.field_41175, 0);
      class_5531 var6 = var1.<class_5531>method_23248(class_8039.field_41158, 0);
      class_6104 var7 = class_3446.method_15883().method_33743().<class_6104>method_24490(class_6104.class);
      int var8 = var7.method_28046(var1.method_23255(), var4, var6, true);
      if (var8 != -1) {
         class_4081 var9 = var1.method_23255().<class_4081>method_6746(class_4081.class);
         class_8012 var10 = var9.method_18809(var4);
         if (var10 != null) {
            var10.method_36352(var8);
         }
      }

      if (var5 == 5) {
         var1.method_23245();
      }
   }
}
