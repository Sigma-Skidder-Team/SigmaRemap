package mapped;

public class Class2486 extends Class2478 {
   private static final long field16576 = 8710781187529689083L;
   private final String field16577;
   private final int field16578;
   private final int field16579;

   public Class2486(String var1, int var2, int var3, String var4) {
      super(var4);
      this.field16577 = var1;
      this.field16578 = var3;
      this.field16579 = var2;
   }

   public String method10478() {
      return this.field16577;
   }

   public int method10479() {
      return this.field16578;
   }

   public int method10480() {
      return this.field16579;
   }

   @Override
   public String toString() {
      String var3 = new String(Character.toChars(this.field16578));
      return "unacceptable code point '"
         + var3
         + "' (0x"
         + Integer.toHexString(this.field16578).toUpperCase()
         + ") "
         + this.getMessage()
         + "\nin \""
         + this.field16577
         + "\", position "
         + this.field16579;
   }
}
