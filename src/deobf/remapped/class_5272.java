package remapped;

import java.util.function.Function;

public abstract class class_5272<E extends class_8145> extends class_6521<E> {
   public class_5272() {
      this(class_3581::method_16755);
   }

   public class_5272(Function<Identifier, class_3581> var1) {
      super(var1);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method_24058().forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public abstract Iterable<class_1549> method_24058();
}
