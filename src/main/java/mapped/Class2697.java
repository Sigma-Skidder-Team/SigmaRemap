package mapped;

public class Class2697 extends Class2696 {
   private static String[] field17148;
   public final EvokerEntity field17149;

   Class2697(EvokerEntity var1) {
      super(var1);
      this.field17149 = var1;
   }

   @Override
   public void method10805() {
      if (this.field17149.getAttackTarget() == null) {
         if (EvokerEntity.method4603(this.field17149) != null) {
            this.field17149
               .method4227()
               .method28040(EvokerEntity.method4603(this.field17149), (float)this.field17149.method4260(), (float)this.field17149.method4259());
         }
      } else {
         this.field17149.method4227().method28040(this.field17149.getAttackTarget(), (float)this.field17149.method4260(), (float)this.field17149.method4259());
      }
   }
}
