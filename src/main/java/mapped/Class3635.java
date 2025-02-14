package mapped;

public class Class3635 {
   private static String[] field19669;
   private final Class2032 field19670;
   private int field19671;
   private int field19672;
   private final int field19673;

   public Class3635(Class2032 var1, int var2, int var3) {
      this.field19670 = var1;
      this.field19671 = var2;
      this.field19672 = var2;
      this.field19673 = var3;
   }

   public void method12340(int var1) {
      if (var1 >= this.field19671) {
         if (var1 > this.field19672) {
            this.field19672 = var1;
         }
      } else {
         this.field19671 = var1;
      }
   }

   public Class2032 method12341() {
      return this.field19670;
   }

   public int method12342() {
      return this.field19671;
   }

   public int method12343() {
      return this.field19672;
   }

   public int method12344() {
      return this.field19673;
   }
}
