package remapped;

import com.google.common.collect.UnmodifiableIterator;

public class class_8532 {
   public static final class_2340 field_43673 = method_39281("empty", new class_9055());
   public static final class_3798 field_43676 = method_39281("flowing_water", new class_3327());
   public static final class_3798 field_43674 = method_39281("water", new class_4015());
   public static final class_3798 field_43677 = method_39281("flowing_lava", new class_7005());
   public static final class_3798 field_43675 = method_39281("lava", new class_3788());

   private static <T extends class_2340> T method_39281(String var0, T var1) {
      return class_8669.<T>method_39791(class_8669.field_44447, var0, (T)var1);
   }

   static {
      for (class_2340 var7 : class_8669.field_44447) {
         UnmodifiableIterator var8 = var7.method_10720().method_36441().iterator();

         while (var8.hasNext()) {
            class_4774 var9 = (class_4774)var8.next();
            class_2340.field_11676.method_279(var9);
         }
      }
   }
}
