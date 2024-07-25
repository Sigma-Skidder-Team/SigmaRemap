package remapped;

public enum class_3665 implements class_4530 {
   field_17829("north_south"),
   field_17831("east_west"),
   field_17835("ascending_east"),
   field_17826("ascending_west"),
   field_17833("ascending_north"),
   field_17836("ascending_south"),
   field_17830("south_east"),
   field_17825("south_west"),
   field_17837("north_west"),
   field_17832("north_east");

   private final String field_17827;

   private class_3665(String var3) {
      this.field_17827 = var3;
   }

   @Override
   public String toString() {
      return this.field_17827;
   }

   public boolean method_17011() {
      return this == field_17833 || this == field_17835 || this == field_17836 || this == field_17826;
   }

   @Override
   public String method_21049() {
      return this.field_17827;
   }
}
