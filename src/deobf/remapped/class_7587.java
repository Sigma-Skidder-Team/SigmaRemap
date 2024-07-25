package remapped;

public enum class_7587 {
   field_38643('"'),
   field_38649('\''),
   field_38644('|'),
   field_38648('>'),
   field_38646(null);

   private Character field_38645;

   private class_7587(Character var3) {
      this.field_38645 = var3;
   }

   public Character method_34477() {
      return this.field_38645;
   }

   @Override
   public String toString() {
      return "Scalar style: '" + this.field_38645 + "'";
   }

   public static class_7587 method_34479(Character var0) {
      if (var0 == null) {
         return field_38646;
      } else {
         switch (var0) {
            case '"':
               return field_38643;
            case '\'':
               return field_38649;
            case '>':
               return field_38648;
            case '|':
               return field_38644;
            default:
               throw new class_5251("Unknown scalar style character: " + var0);
         }
      }
   }
}
