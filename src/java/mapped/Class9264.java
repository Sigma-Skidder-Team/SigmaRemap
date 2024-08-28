package mapped;

public class Class9264 {
   private static String[] field42602;
   public static final Class9264 field42603 = new Class9264();
   public final Class6792 field42604;
   public final Class6792 field42605;
   public final Class6792 field42606;
   public final Class6792 field42607;
   public final Class6792 field42608;
   public final Class6792 field42609;
   public final Class6792 field42610;
   public final Class6792 field42611;

   private Class9264() {
      this(
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588,
         Class6792.field29588
      );
   }

   public Class9264(Class9264 var1) {
      this.field42604 = var1.field42604;
      this.field42605 = var1.field42605;
      this.field42606 = var1.field42606;
      this.field42607 = var1.field42607;
      this.field42608 = var1.field42608;
      this.field42609 = var1.field42609;
      this.field42610 = var1.field42610;
      this.field42611 = var1.field42611;
   }

   public Class9264(Class6792 var1, Class6792 var2, Class6792 var3, Class6792 var4, Class6792 var5, Class6792 var6, Class6792 var7, Class6792 var8) {
      this.field42604 = var1;
      this.field42605 = var2;
      this.field42606 = var3;
      this.field42607 = var4;
      this.field42608 = var5;
      this.field42609 = var6;
      this.field42610 = var7;
      this.field42611 = var8;
   }

   public Class6792 method34866(Class2327 var1) {
      switch (Class7791.field33424[var1.ordinal()]) {
         case 1:
            return this.field42604;
         case 2:
            return this.field42605;
         case 3:
            return this.field42606;
         case 4:
            return this.field42607;
         case 5:
            return this.field42608;
         case 6:
            return this.field42609;
         case 7:
            return this.field42610;
         case 8:
            return this.field42611;
         default:
            return Class6792.field29588;
      }
   }

   public boolean method34867(Class2327 var1) {
      return this.method34866(var1) != Class6792.field29588;
   }
}
