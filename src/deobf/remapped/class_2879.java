package remapped;

public class class_2879 implements class_857 {
   public class_2879(class_2793 var1) {
      this.field_14096 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9530 var4 = var1.<class_9530>method_23261(class_8039.field_41162);
      class_5830.method_26387(var4);
      if (class_3446.method_15884().method_25813()) {
         if (var4 == null) {
            return;
         }

         class_5531 var5 = var4.method_43959();
         if (var5 == null) {
            return;
         }

         class_5287 var6 = var5.<class_5287>method_25123("pages");
         if (!(var6 instanceof class_913)) {
            return;
         }

         class_913 var7 = (class_913)var6;
         if (var7.method_3917() <= 50) {
            return;
         }

         var7.method_3921(var7.method_3922().subList(0, 50));
      }
   }
}
