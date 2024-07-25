package remapped;

public class class_3566 {
   private byte field_17452;
   private String field_17450;
   private String field_17451;

   public class_3566(byte var1, String var2, String var3) {
      this.field_17452 = var1;
      this.field_17450 = var2;
      this.field_17451 = var3.replaceAll(".ogg", "");
   }

   public byte method_16571() {
      return this.field_17452;
   }

   public String method_16574() {
      return this.field_17450;
   }

   public String method_16572() {
      return this.field_17451;
   }
}
