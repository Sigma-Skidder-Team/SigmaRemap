package remapped;

public class class_7540 extends class_5251 {
   private static final long field_38478 = 8710781187529689083L;
   private final String field_38480;
   private final int field_38477;
   private final int field_38479;

   public class_7540(String var1, int var2, int var3, String var4) {
      super(var4);
      this.field_38480 = var1;
      this.field_38477 = var3;
      this.field_38479 = var2;
   }

   public String method_34336() {
      return this.field_38480;
   }

   public int method_34337() {
      return this.field_38477;
   }

   public int method_34338() {
      return this.field_38479;
   }

   @Override
   public String toString() {
      String var3 = new String(Character.toChars(this.field_38477));
      return "unacceptable code point '"
         + var3
         + "' (0x"
         + Integer.toHexString(this.field_38477).toUpperCase()
         + ") "
         + this.getMessage()
         + "\nin \""
         + this.field_38480
         + "\", position "
         + this.field_38479;
   }
}
