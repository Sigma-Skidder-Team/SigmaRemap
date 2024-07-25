package remapped;

import java.util.function.Consumer;

public enum class_6681 {
   field_34532(var0 -> {
   }),
   field_34531(class_1634::method_7285);

   private final Consumer<class_1634<?>> field_34530;

   private class_6681(Consumer<class_1634<?>> var3) {
      this.field_34530 = var3;
   }

   public void method_30653(class_1634<?> var1) {
      this.field_34530.accept(var1);
   }
}
