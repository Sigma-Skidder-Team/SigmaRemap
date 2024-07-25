package remapped;

public class class_8241 implements class_857 {
   private static String[] field_42322;

   public class_8241(class_8134 var1) {
      this.field_42323 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23248(class_8039.field_41175, 0);
      if (var4 != 255) {
         class_9371 var5 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
         int var6 = var5.method_43340();
         short var7 = var5.method_43342();
         int var8 = var5.method_43343();
         switch (var4) {
            case 0:
               var7--;
               break;
            case 1:
               var7++;
               break;
            case 2:
               var8--;
               break;
            case 3:
               var8++;
               break;
            case 4:
               var6--;
               break;
            case 5:
               var6++;
         }

         class_1189 var9 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         var9.method_5261(new class_9371(var6, var7, var8));
      }
   }
}
