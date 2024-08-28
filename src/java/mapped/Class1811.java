package mapped;

public final class Class1811 implements AutoCloseable {
   private static String[] field9771;
   private final Class313 field9772;
   private final Class1701 field9773;
   private final Class6611 field9774;

   public Class1811(Class313 var1, Class1701 var2, Class6611 var3) {
      this.field9772 = var1;
      this.field9773 = var2;
      this.field9774 = var3;
   }

   public Class313 method7957() {
      return this.field9772;
   }

   public Class1701 method7958() {
      return this.field9773;
   }

   public Class6611 method7959() {
      return this.field9774;
   }

   @Override
   public void close() {
      this.field9772.close();
      this.field9773.close();
   }
}
