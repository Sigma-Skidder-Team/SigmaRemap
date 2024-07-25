package remapped;

public class class_5903 extends class_7164<class_8829, class_618<class_8829>> {
   private static final class_4639 field_29966 = new class_4639("textures/entity/bee/bee_angry.png");
   private static final class_4639 field_29963 = new class_4639("textures/entity/bee/bee_angry_nectar.png");
   private static final class_4639 field_29964 = new class_4639("textures/entity/bee/bee.png");
   private static final class_4639 field_29962 = new class_4639("textures/entity/bee/bee_nectar.png");

   public class_5903(class_6122 var1) {
      super(var1, new class_618<class_8829>(), 0.4F);
   }

   public class_4639 method_27006(class_8829 var1) {
      if (!var1.method_28537()) {
         return !var1.method_40592() ? field_29964 : field_29962;
      } else {
         return !var1.method_40592() ? field_29966 : field_29963;
      }
   }
}
