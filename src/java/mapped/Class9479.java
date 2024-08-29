package mapped;

import com.google.common.collect.UnmodifiableIterator;

public class Class9479 {
   public static final Class7631 field44064 = method36604("empty", new Class7632());
   public static final Class7633 field44065 = method36604("flowing_water", new Class7636());
   public static final Class7633 field44066 = method36604("water", new Class7635());
   public static final Class7633 field44067 = method36604("flowing_lava", new Class7638());
   public static final Class7633 field44068 = method36604("lava", new Class7639());

   private static <T extends Class7631> T method36604(String var0, T var1) {
      return Registry.<T>method9194(Registry.field16070, var0, (T)var1);
   }

   static {
      for (Class7631 var7 : Registry.field16070) {
         UnmodifiableIterator var8 = var7.method25047().getValidStates().iterator();

         while (var8.hasNext()) {
            Class7379 var9 = (Class7379)var8.next();
            Class7631.field32708.method9269(var9);
         }
      }
   }
}
