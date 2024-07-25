package remapped;

public class class_970 {
   private final BlockPos field_4967;
   private final class_6414 field_4965;
   private final int field_4963;
   private final int field_4964;

   public class_970(BlockPos var1, class_6414 var2, int var3, int var4) {
      this.field_4967 = var1;
      this.field_4965 = var2;
      this.field_4963 = var3;
      this.field_4964 = var4;
   }

   public BlockPos method_4248() {
      return this.field_4967;
   }

   public class_6414 method_4252() {
      return this.field_4965;
   }

   public int method_4251() {
      return this.field_4963;
   }

   public int method_4250() {
      return this.field_4964;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_970)) {
         return false;
      } else {
         class_970 var4 = (class_970)var1;
         return this.field_4967.equals(var4.field_4967)
            && this.field_4963 == var4.field_4963
            && this.field_4964 == var4.field_4964
            && this.field_4965 == var4.field_4965;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_4967.hashCode();
      var3 = 31 * var3 + this.field_4965.hashCode();
      var3 = 31 * var3 + this.field_4963;
      return 31 * var3 + this.field_4964;
   }

   @Override
   public String toString() {
      return "TE(" + this.field_4967 + ")," + this.field_4963 + "," + this.field_4964 + "," + this.field_4965;
   }
}
