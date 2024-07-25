package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.function.Function;

public class class_5356<E, T extends class_2491<E>> {
   private static String[] field_27346;
   private final class_8669<T> field_27345;
   private final String field_27343;
   private final String field_27347;
   private final Function<E, T> field_27344;
   private Pair<T, class_4367<? extends E>> field_27348;

   private class_5356(class_8669<T> var1, String var2, String var3, Function<E, T> var4) {
      this.field_27345 = var1;
      this.field_27343 = var2;
      this.field_27347 = var3;
      this.field_27344 = var4;
   }

   public Object method_24455() {
      return new class_1346(this.field_27345, this.field_27343, this.field_27347, this.field_27344, this.field_27348, null);
   }
}
