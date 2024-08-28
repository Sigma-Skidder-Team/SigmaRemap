package mapped;

public class Class2697 extends Class2696 {
   private static String[] field17148;
   public final Class1032 field17149;

   Class2697(Class1032 var1) {
      super(var1);
      this.field17149 = var1;
   }

   @Override
   public void method10805() {
      if (this.field17149.method4232() == null) {
         if (Class1032.method4603(this.field17149) != null) {
            this.field17149
               .method4227()
               .method28040(Class1032.method4603(this.field17149), (float)this.field17149.method4260(), (float)this.field17149.method4259());
         }
      } else {
         this.field17149.method4227().method28040(this.field17149.method4232(), (float)this.field17149.method4260(), (float)this.field17149.method4259());
      }
   }
}
