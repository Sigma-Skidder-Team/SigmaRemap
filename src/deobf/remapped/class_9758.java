package remapped;

public class class_9758 extends SecondModule {
   public class_9758() {
      super(
         Category.COMBAT,
         "AntiKnockBack",
         "Prevents you from taking knockback",
         new class_7244(),
         new class_7722(),
         new DelayModule(),
         new SpartanAntiKBModule(),
         new class_4246()
      );
   }

   @Override
   public String method_41987() {
      return SigmaMainClass.getInstance().method_3312() != class_6015.field_30644 ? super.method_41987() : "AntiVelocity";
   }
}
