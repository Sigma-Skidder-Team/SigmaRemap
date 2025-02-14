package mapped;

public abstract class Class6553 {
   private final Class2512 field28913;
   private final Class2512 field28914;

   public Class6553(Class2512 var1, Class2512 var2) {
      if (var1 != null && var2 != null) {
         this.field28913 = var1;
         this.field28914 = var2;
      } else {
         throw new Class2478("Token requires marks.");
      }
   }

   public Class2512 method19895() {
      return this.field28913;
   }

   public Class2512 method19896() {
      return this.field28914;
   }

   public abstract Class2228 method19894();
}
