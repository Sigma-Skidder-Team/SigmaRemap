package mapped;

public abstract class Class2661 extends Class2595 {
   public final BeeEntity field17022;

   private Class2661(BeeEntity var1) {
      this.field17022 = var1;
   }

   public abstract boolean method10860();

   public abstract boolean method10861();

   @Override
   public boolean method10803() {
      return this.method10860() && !this.field17022.method4369();
   }

   @Override
   public boolean method10806() {
      return this.method10861() && !this.field17022.method4369();
   }

   // $VF: synthetic method
   public Class2661(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}
