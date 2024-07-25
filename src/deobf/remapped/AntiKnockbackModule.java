package remapped;

public class AntiKnockbackModule extends SecondModule {
   public AntiKnockbackModule() {
      super(
         Category.COMBAT,
         "AntiKnockBack",
         "Prevents you from taking knockback",
         new BasicAntiKB(),
         new AACAntiKB(),
         new DelayAntiKB(),
         new SpartanAntiKB(),
         new GommeAntiKB()
      );
   }

   @Override
   public String getName2() {
      return SigmaMainClass.getInstance().method_3312() != class_6015.field_30644 ? super.getName2() : "AntiVelocity";
   }
}
