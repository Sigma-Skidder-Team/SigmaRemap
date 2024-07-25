package remapped;

public class class_9758 extends class_3620 {
   public class_9758() {
      super(
         class_5664.field_28714,
         "AntiKnockBack",
         "Prevents you from taking knockback",
         new class_7244(),
         new class_7722(),
         new class_6295(),
         new class_9760(),
         new class_4246()
      );
   }

   @Override
   public String method_41987() {
      return SigmaMainClass.method_3328().method_3312() != class_6015.field_30644 ? super.method_41987() : "AntiVelocity";
   }
}
