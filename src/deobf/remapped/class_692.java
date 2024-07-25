package remapped;

public final class class_692 implements Comparable<class_692> {
   private static String[] field_3800;
   public final double field_3803;
   public final double field_3802;
   public final long field_3799;
   public final String field_3801;

   public class_692(String var1, double var2, double var4, long var6) {
      this.field_3801 = var1;
      this.field_3803 = var2;
      this.field_3802 = var4;
      this.field_3799 = var6;
   }

   public int compareTo(class_692 var1) {
      if (!(var1.field_3803 < this.field_3803)) {
         return !(var1.field_3803 > this.field_3803) ? var1.field_3801.compareTo(this.field_3801) : 1;
      } else {
         return -1;
      }
   }

   public int method_3124() {
      return (this.field_3801.hashCode() & 11184810) + 4473924;
   }
}
