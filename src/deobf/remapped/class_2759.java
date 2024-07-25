package remapped;

public class class_2759 extends class_7164<class_2022, class_5301> {
   private static final class_4639 field_13490 = new class_4639("textures/entity/bat.png");

   public class_2759(class_6122 var1) {
      super(var1, new class_5301(), 0.25F);
   }

   public class_4639 method_12555(class_2022 var1) {
      return field_13490;
   }

   public void method_12556(class_2022 var1, class_7966 var2, float var3) {
      var2.method_36062(0.35F, 0.35F, 0.35F);
   }

   public void method_12554(class_2022 var1, class_7966 var2, float var3, float var4, float var5) {
      if (!var1.method_9392()) {
         var2.method_36065(0.0, (double)(class_9299.method_42840(var3 * 0.3F) * 0.1F), 0.0);
      } else {
         var2.method_36065(0.0, -0.1F, 0.0);
      }

      super.method_29099(var1, var2, var3, var4, var5);
   }
}
