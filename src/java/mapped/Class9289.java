package mapped;

public class Class9289<T> {
   private final int field42712;
   private final Class6466<T> field42713;

   public Class9289(int var1, Class6466<T> var2) {
      this.field42712 = var1;
      this.field42713 = var2;
   }

   public int method35015() {
      return this.field42712;
   }

   public Class6466<T> method35016() {
      return this.field42713;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9289 var4 = (Class9289)var1;
            return this.field42712 == var4.field42712;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field42712;
   }

   @Override
   public String toString() {
      return "<entity data: " + this.field42712 + ">";
   }
}
