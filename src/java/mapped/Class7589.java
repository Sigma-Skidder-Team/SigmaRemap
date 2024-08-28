package mapped;

public class Class7589 {
   private int field32575;
   private int field32576;

   public Class7589(int var1, int var2) {
      this.field32575 = Math.min(var1, var2);
      this.field32576 = Math.max(var1, var2);
   }

   public boolean method24845(int var1) {
      return var1 >= this.field32575 ? var1 <= this.field32576 : false;
   }

   public int method24846() {
      return this.field32575;
   }

   public int method24847() {
      return this.field32576;
   }

   @Override
   public String toString() {
      return "min: " + this.field32575 + ", max: " + this.field32576;
   }
}
