package mapped;

public class Class8545 {
   private final Class187 field38411;
   private final int field38412;

   public Class8545(Class187 var1, int var2) {
      this.field38411 = var1;
      this.field38412 = var2;
   }

   public Class187 method30443() {
      return this.field38411;
   }

   public int method30444() {
      return this.field38412;
   }

   @Override
   public String toString() {
      return "Packet{state=" + this.field38411 + ", packetId=" + this.field38412 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class8545 var4 = (Class8545)var1;
         return this.field38412 == var4.field38412 && this.field38411 == var4.field38411;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field38411 == null ? 0 : this.field38411.hashCode();
      return 31 * var3 + this.field38412;
   }
}
