package mapped;

import java.util.EnumSet;
import java.util.Set;

public enum Flags {
   field13198(0),
   field13199(1),
   field13200(2),
   field13201(3),
   field13202(4);

   private final int field13203;
   private static final Flags[] field13204 = new Flags[]{field13198, field13199, field13200, field13201, field13202};

   private Flags(int var3) {
      this.field13203 = var3;
   }

   private int method8672() {
      return 1 << this.field13203;
   }

   private boolean method8673(int var1) {
      return (var1 & this.method8672()) == this.method8672();
   }

   public static Set<Flags> method8674(int var0) {
      EnumSet var3 = EnumSet.<Flags>noneOf(Flags.class);

      for (Flags var7 : values()) {
         if (var7.method8673(var0)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static int method8675(Set<Flags> var0) {
      int var3 = 0;

      for (Flags var5 : var0) {
         var3 |= var5.method8672();
      }

      return var3;
   }
}
