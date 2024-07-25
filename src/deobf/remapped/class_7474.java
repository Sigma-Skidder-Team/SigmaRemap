package remapped;

public abstract class class_7474 {
   public final class_1343 field_38155;

   public class_7474(class_1343 var1) {
      this.field_38155 = var1;
   }

   public double method_33991(Entity var1) {
      double var4 = this.field_38155.field_7336 - var1.method_37302();
      double var6 = this.field_38155.field_7333 - var1.method_37309();
      double var8 = this.field_38155.field_7334 - var1.method_37156();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public abstract class_1430 method_33990();

   public class_1343 method_33993() {
      return this.field_38155;
   }
}
