package mapped;

public enum Class1857 {
   field9894('"'),
   field9895('\''),
   field9896('|'),
   field9897('>'),
   field9898(null);

   private Character field9899;
   private static final Class1857[] field9900 = new Class1857[]{field9894, field9895, field9896, field9897, field9898};

   private Class1857(Character var3) {
      this.field9899 = var3;
   }

   public Character method8099() {
      return this.field9899;
   }

   @Override
   public String toString() {
      return "Scalar style: '" + this.field9899 + "'";
   }

   public static Class1857 method8100(Character var0) {
      if (var0 == null) {
         return field9898;
      } else {
         switch (var0) {
            case '"':
               return field9894;
            case '\'':
               return field9895;
            case '>':
               return field9897;
            case '|':
               return field9896;
            default:
               throw new Class2478("Unknown scalar style character: " + var0);
         }
      }
   }
}
