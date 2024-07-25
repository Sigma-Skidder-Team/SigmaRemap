package remapped;

import net.sourceforge.jaad.aac.AACException;

public enum class_4836 {
   field_24135(0),
   field_24136(1),
   field_24132(2),
   field_24134(3);

   private int field_24137;

   public static class_4836 method_22257(int var0) throws AACException {
      class_4836 var3;
      switch (var0) {
         case 0:
            var3 = field_24135;
            break;
         case 1:
            var3 = field_24136;
            break;
         case 2:
            var3 = field_24132;
            break;
         case 3:
            var3 = field_24134;
            break;
         default:
            throw new class_5060("unknown MS mask type");
      }

      return var3;
   }

   private class_4836(int var3) {
      this.field_24137 = var3;
   }
}
