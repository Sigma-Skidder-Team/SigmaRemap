package remapped;

import net.sourceforge.jaad.aac.AACException;

public enum class_6954 {
   field_35755,
   field_35757,
   field_35756,
   field_35758;

   public static class_6954 method_31801(int var0) throws AACException {
      class_6954 var3;
      switch (var0) {
         case 0:
            var3 = field_35755;
            break;
         case 1:
            var3 = field_35757;
            break;
         case 2:
            var3 = field_35756;
            break;
         case 3:
            var3 = field_35758;
            break;
         default:
            throw new class_5060("unknown window sequence type");
      }

      return var3;
   }
}
