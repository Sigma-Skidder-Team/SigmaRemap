package mapped;

public enum Class2195 {
   field14342(0),
   field14343(-1),
   field14344(1);

   private final int field14345;
   private static final Class2195[] field14346 = new Class2195[]{field14342, field14343, field14344};

   private Class2195(int var3) {
      this.field14345 = var3;
   }

   public int method8903() {
      return this.field14345;
   }

   public static Class2195 method8904(int var0) {
      switch (var0) {
         case -1:
         default:
            return field14343;
         case 0:
            return field14342;
         case 1:
            return field14344;
      }
   }
}
