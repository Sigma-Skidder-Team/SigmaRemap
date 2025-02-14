package mapped;

public abstract class Class2661 extends Class2595 {
   public final BeeEntity field17022;

   private Class2661(BeeEntity var1) {
      this.field17022 = var1;
   }

   public abstract boolean canBeeStart();

   public abstract boolean canBeeContinue();

   @Override
   public boolean method10803() {
      return this.canBeeStart() && !this.field17022.method4369();
   }

   @Override
   public boolean method10806() {
      return this.canBeeContinue() && !this.field17022.method4369();
   }

   // $VF: synthetic method
   public Class2661(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}
