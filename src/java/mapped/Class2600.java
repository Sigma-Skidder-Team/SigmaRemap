package mapped;

public class Class2600 extends Class2595 {
   private static String[] field16838;
   private int field16839;
   public final Class1057 field16840;

   public Class2600(Class1057 var1) {
      this.field16840 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16840.method4232() == null && Class1057.method4861(this.field16840).nextInt(40) == 0;
   }

   @Override
   public boolean method10806() {
      return this.field16840.method4232() == null && this.field16839 > 0;
   }

   @Override
   public void method10804() {
      this.field16839 = 20 * (1 + Class1057.method4862(this.field16840).nextInt(3));
      this.field16840.method4852(30);
   }

   @Override
   public void method10807() {
      if (this.field16840.method4232() == null) {
         this.field16840.method4852(0);
      }
   }

   @Override
   public void method10805() {
      this.field16839--;
   }
}
