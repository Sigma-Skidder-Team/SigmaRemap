package mapped;

public class Class7728 {
   private int field33181;
   private int field33182;
   private int field33183;
   private String field33184;

   public Class7728(int var1, int var2) {
      this(var1, var2, 0);
   }

   public Class7728(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public Class7728(int var1, int var2, int var3, String var4) {
      this.field33181 = var1;
      this.field33182 = var2;
      this.field33183 = var3;
      this.field33184 = var4;
   }

   public int method25562() {
      return this.field33181;
   }

   public int method25563() {
      return this.field33182;
   }

   public int method25564() {
      return this.field33183;
   }

   public int method25565() {
      if (this.field33182 <= 9) {
         return this.field33183 <= 9 ? this.field33181 * 100 + this.field33182 * 10 + this.field33183 : this.field33181 * 100 + this.field33182 * 10 + 9;
      } else {
         return this.field33181 * 100 + this.field33182;
      }
   }

   @Override
   public String toString() {
      return this.field33184 != null
         ? "" + this.field33181 + "." + this.field33182 + "." + this.field33183 + this.field33184
         : "" + this.field33181 + "." + this.field33182 + "." + this.field33183;
   }
}
