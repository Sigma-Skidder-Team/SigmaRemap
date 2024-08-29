package mapped;

public class Class2689 extends Class2595 {
   private static String[] field17116;
   private final Class1097 field17117;
   private int field17118;

   public Class2689(Class1097 var1) {
      this.field17117 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17118 < this.field17117.ticksExisted
         && this.field17117.method5210()
         && this.field17117.method5230()
         && Class1097.method5234(this.field17117).nextInt(400) == 1;
   }

   @Override
   public boolean method10806() {
      return !this.field17117.method3250() && (this.field17117.method5210() || Class1097.method5235(this.field17117).nextInt(600) != 1)
         ? Class1097.method5236(this.field17117).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method10804() {
      this.field17117.method5192(true);
      this.field17118 = 0;
   }

   @Override
   public void method10807() {
      this.field17117.method5192(false);
      this.field17118 = this.field17117.ticksExisted + 200;
   }
}
