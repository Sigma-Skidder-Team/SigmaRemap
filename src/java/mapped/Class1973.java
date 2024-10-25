package mapped;

public enum Class1973 {
   field12843,
   field12844,
   field12845,
   field12846;

   public static Class1973 method8255(int var0) throws AACException {
      Class1973 var3;
      switch (var0) {
         case 0:
            var3 = field12843;
            break;
         case 1:
            var3 = field12844;
            break;
         case 2:
            var3 = field12845;
            break;
         case 3:
            var3 = field12846;
            break;
         default:
            throw new AACException("unknown window sequence type");
      }

      return var3;
   }
}
