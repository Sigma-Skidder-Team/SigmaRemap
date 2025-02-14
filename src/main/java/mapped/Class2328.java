package mapped;



public enum Class2328 {
   field15934(0),
   field15935(1),
   field15936(2),
   field15937(3);

   private int field15938;
   private static final Class2328[] field15939 = new Class2328[]{field15934, field15935, field15936, field15937};

   public static Class2328 method9104(int var0) throws Class2460 {
      Class2328 var3;
      switch (var0) {
         case 0:
            var3 = field15934;
            break;
         case 1:
            var3 = field15935;
            break;
         case 2:
            var3 = field15936;
            break;
         case 3:
            var3 = field15937;
            break;
         default:
            throw new Class2460("unknown MS mask type");
      }

      return var3;
   }

   private Class2328(int var3) {
      this.field15938 = var3;
   }
}
