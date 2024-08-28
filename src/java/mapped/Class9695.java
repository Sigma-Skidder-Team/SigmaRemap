package mapped;

public class Class9695 {
   private final int field45314;
   private final short field45315;
   private final int field45316;

   public Class9695(int var1, short var2, int var3) {
      this.field45314 = var1;
      this.field45315 = var2;
      this.field45316 = var3;
   }

   public Class9695(Class9695 var1) {
      this(var1.method37962(), var1.method37963(), var1.method37964());
   }

   public Class9695 method37961(Class1983 var1) {
      return new Class9695(this.field45314 + var1.method8266(), (short)(this.field45315 + var1.method8267()), this.field45316 + var1.method8268());
   }

   public int method37962() {
      return this.field45314;
   }

   public short method37963() {
      return this.field45315;
   }

   public int method37964() {
      return this.field45316;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9695 var4 = (Class9695)var1;
            if (this.field45314 != var4.field45314) {
               return false;
            } else {
               return this.field45315 == var4.field45315 ? this.field45316 == var4.field45316 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field45314;
      var3 = 31 * var3 + this.field45315;
      return 31 * var3 + this.field45316;
   }

   @Override
   public String toString() {
      return "Position{x=" + this.field45314 + ", y=" + this.field45315 + ", z=" + this.field45316 + '}';
   }
}
