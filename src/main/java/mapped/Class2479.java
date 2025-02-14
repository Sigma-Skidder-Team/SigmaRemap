package mapped;

// i think this is something yaml
public class Class2479 extends Class2478 {
   private static final long field16568 = -9119388488683035101L;
   private String field16569;
   private Class2512 field16570;
   private String field16571;
   private Class2512 field16572;
   private String field16573;

   public Class2479(String var1, Class2512 var2, String var3, Class2512 var4, String var5) {
      this(var1, var2, var3, var4, var5, null);
   }

   public Class2479(String var1, Class2512 var2, String var3, Class2512 var4, String var5, Throwable var6) {
      super(var1 + "; " + var3 + "; " + var4, var6);
      this.field16569 = var1;
      this.field16570 = var2;
      this.field16571 = var3;
      this.field16572 = var4;
      this.field16573 = var5;
   }

   public Class2479(String var1, Class2512 var2, String var3, Class2512 var4) {
      this(var1, var2, var3, var4, null, null);
   }

   public Class2479(String var1, Class2512 var2, String var3, Class2512 var4, Throwable var5) {
      this(var1, var2, var3, var4, null, var5);
   }

   @Override
   public String getMessage() {
      return this.toString();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      if (this.field16569 != null) {
         var3.append(this.field16569);
         var3.append("\n");
      }

      if (this.field16570 != null
         && (
            this.field16571 == null
               || this.field16572 == null
               || this.field16570.method10493().equals(this.field16572.method10493())
               || this.field16570.method10494() != this.field16572.method10494()
               || this.field16570.method10495() != this.field16572.method10495()
         )) {
         var3.append(this.field16570.toString());
         var3.append("\n");
      }

      if (this.field16571 != null) {
         var3.append(this.field16571);
         var3.append("\n");
      }

      if (this.field16572 != null) {
         var3.append(this.field16572.toString());
         var3.append("\n");
      }

      if (this.field16573 != null) {
         var3.append(this.field16573);
         var3.append("\n");
      }

      return var3.toString();
   }

   public String method10474() {
      return this.field16569;
   }

   public Class2512 method10475() {
      return this.field16570;
   }

   public String method10476() {
      return this.field16571;
   }

   public Class2512 method10477() {
      return this.field16572;
   }
}
