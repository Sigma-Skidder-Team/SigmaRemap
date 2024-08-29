package mapped;

public class Class2673 extends Class2672 {
   private static String[] field17060;
   private int field17061;
   public final Class1033 field17062;

   public Class2673(Class1033 var1) {
      super(var1);
      this.field17062 = var1;
   }

   @Override
   public boolean method10803() {
      if (super.method10803()) {
         if (this.field17062.method4232() != null) {
            return this.field17062.method4232().method3205() != this.field17061
               ? this.field17062.world.method6807(this.field17062.getPosition()).method38329((float)Class2197.field14353.ordinal())
               : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field17061 = this.field17062.method4232().method3205();
   }

   @Override
   public int method10892() {
      return 20;
   }

   @Override
   public int method10893() {
      return 180;
   }

   @Override
   public void method10890() {
      this.field17062.method4232().method3035(new Class2023(Class8254.field35481, 400));
   }

   @Override
   public Class9455 method10894() {
      return Class6067.field26696;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13186;
   }
}
