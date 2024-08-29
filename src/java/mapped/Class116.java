package mapped;

import java.util.function.Predicate;

public class Class116 implements Predicate<BlockState> {
   private static String[] field421;
   private static final Class116 field422 = new Class117(Class8649.field38932);
   private final Class8649 field423;

   private Class116(Class8649 var1) {
      this.field423 = var1;
   }

   public static Class116 method330(Class8649 var0) {
      return var0 != Class8649.field38932 ? new Class116(var0) : field422;
   }

   public boolean test(BlockState var1) {
      return var1 != null && var1.method23384() == this.field423;
   }

   // $VF: synthetic method
   public Class116(Class8649 var1, Class117 var2) {
      this(var1);
   }
}
