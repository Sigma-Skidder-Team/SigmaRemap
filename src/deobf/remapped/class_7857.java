package remapped;

public final class class_7857 extends class_9446 {
   private static String[] field_39818;
   private final class_9446 field_39819 = new class_9446();

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_6331 var5 = var1.method_40140();
      class_1331 var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      class_2522 var7 = var5.method_28262(var6);
      class_6414 var8 = var7.method_8360();
      if (!(var8 instanceof class_5978)) {
         return super.method_43688(var1, var2);
      } else {
         class_2340 var9 = ((class_5978)var8).method_27280(var5, var6, var7);
         if (var9 instanceof class_3798) {
            class_2451 var10 = var9.method_10721();
            var2.method_27970(1);
            if (!var2.method_28022()) {
               if (var1.<class_7434>method_40143().method_33832(new class_6098(var10)) < 0) {
                  this.field_39819.method_28324(var1, new class_6098(var10));
               }

               return var2;
            } else {
               return new class_6098(var10);
            }
         } else {
            return super.method_43688(var1, var2);
         }
      }
   }
}
