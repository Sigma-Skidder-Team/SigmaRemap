package remapped;

public enum class_7826 {
   field_39690(new Integer[]{1, 0}),
   field_39688(new Integer[]{1, 1});

   private Integer[] field_39687;

   private class_7826(Integer[] var3) {
      this.field_39687 = var3;
   }

   public int method_35433() {
      return this.field_39687[0];
   }

   public int method_35436() {
      return this.field_39687[1];
   }

   public String method_35434() {
      return this.field_39687[0] + "." + this.field_39687[1];
   }

   @Override
   public String toString() {
      return "Version: " + this.method_35434();
   }
}
