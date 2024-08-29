package mapped;

public class Class2666 extends Class2661 {
   private static String[] field17039;
   public final Class1017 field17022;

   private Class2666(Class1017 var1) {
      super(var1, null);
      this.field17022 = var1;
   }

   @Override
   public boolean method10860() {
      if (this.field17022.method4432()
         && Class1017.method4452(this.field17022)
         && Class1017.method4453(this.field17022).method8317(this.field17022.getPositionVec(), 2.0)) {
         TileEntity var3 = this.field17022.world.getTileEntity(Class1017.method4453(this.field17022));
         if (var3 instanceof Class962) {
            Class962 var4 = (Class962)var3;
            if (!var4.method3914()) {
               return true;
            }

            Class1017.method4454(this.field17022, null);
         }
      }

      return false;
   }

   @Override
   public boolean method10861() {
      return false;
   }

   @Override
   public void method10804() {
      TileEntity var3 = this.field17022.world.getTileEntity(Class1017.method4453(this.field17022));
      if (var3 instanceof Class962) {
         Class962 var4 = (Class962)var3;
         var4.method3917(this.field17022, this.field17022.method4438());
      }
   }

   // $VF: synthetic method
   public Class2666(Class1017 var1, Class6996 var2) {
      this(var1);
   }
}
