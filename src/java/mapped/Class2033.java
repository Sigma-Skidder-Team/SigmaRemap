package mapped;

import java.util.EnumSet;
import java.util.Set;

public enum Class2033 {
   field13198(0),
   field13199(1),
   field13200(2),
   field13201(3),
   field13202(4);

   private final int field13203;
   private static final Class2033[] field13204 = new Class2033[]{field13198, field13199, field13200, field13201, field13202};

   private Class2033(int var3) {
      this.field13203 = var3;
   }

   private int method8672() {
      return 1 << this.field13203;
   }

   private boolean method8673(int var1) {
      return (var1 & this.method8672()) == this.method8672();
   }

   public static Set<Class2033> method8674(int var0) {
      EnumSet var3 = EnumSet.<Class2033>noneOf(Class2033.class);

      for (Class2033 var7 : values()) {
         if (var7.method8673(var0)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static int method8675(Set<Class2033> var0) {
      int var3 = 0;

      for (Class2033 var5 : var0) {
         var3 |= var5.method8672();
      }

      return var3;
   }
}
