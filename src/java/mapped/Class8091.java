package mapped;

public class Class8091 extends Class8092 {
   private static String[] field34809;
   public final Class1095 field34810;

   public Class8091(Class1095 var1) {
      super(var1);
      this.field34810 = var1;
   }

   @Override
   public void method28037() {
      if (!this.field34810.isSleeping()) {
         super.method28037();
      }
   }

   @Override
   public boolean method28038() {
      return !this.field34810.method5140() && !this.field34810.method3336() && !this.field34810.method5145() & !this.field34810.method5131();
   }
}
