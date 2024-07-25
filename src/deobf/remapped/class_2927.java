package remapped;

import java.util.function.Predicate;

public class class_2927 implements Predicate<class_2522> {
   private static String[] field_14268;
   private static final class_2927 field_14269 = new class_4945(class_5371.field_27403);
   private final class_5371 field_14267;

   private class_2927(class_5371 var1) {
      this.field_14267 = var1;
   }

   public static class_2927 method_13381(class_5371 var0) {
      return var0 != class_5371.field_27403 ? new class_2927(var0) : field_14269;
   }

   public boolean test(class_2522 var1) {
      return var1 != null && var1.method_8362() == this.field_14267;
   }
}
