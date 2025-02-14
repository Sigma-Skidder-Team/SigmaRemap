package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2190 {
   field14317(0),
   field14318(1),
   field14319(2),
   field14320(3),
   field14321(4),
   field14322(5),
   field14323(6);

   private static final Class2190[] field14324 = Arrays.<Class2190>stream(values())
      .sorted(Comparator.comparingInt(Class2190::method8899))
      .<Class2190>toArray(Class2190[]::new);
   private final int field14325;
   private static final Class2190[] field14326 = new Class2190[]{field14317, field14318, field14319, field14320, field14321, field14322, field14323};

   private Class2190(int var3) {
      this.field14325 = var3;
   }

   public int method8899() {
      return this.field14325;
   }

   public static Class2190 method8900(int var0) {
      return field14324[var0 % field14324.length];
   }
}
