package remapped;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class class_5621<T> {
   private static final Map<String, class_5621<?>> field_28531 = Collections.<String, class_5621<?>>synchronizedMap(Maps.newIdentityHashMap());
   private final Identifier field_28532;
   private final Identifier field_28533;

   public static <T> class_5621<T> method_25497(class_5621<? extends class_8669<T>> var0, Identifier var1) {
      return method_25500(var0.field_28533, var1);
   }

   public static <T> class_5621<class_8669<T>> method_25494(Identifier var0) {
      return method_25500(class_8669.field_44448, var0);
   }

   private static <T> class_5621<T> method_25500(Identifier var0, Identifier var1) {
      String var4 = (var0 + ":" + var1).intern();
      return (class_5621<T>)field_28531.computeIfAbsent(var4, var2 -> new class_5621(var0, var1));
   }

   private class_5621(Identifier var1, Identifier var2) {
      this.field_28532 = var1;
      this.field_28533 = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.field_28532 + " / " + this.field_28533 + ']';
   }

   public boolean method_25498(class_5621<? extends class_8669<?>> var1) {
      return this.field_28532.equals(var1.method_25499());
   }

   public Identifier method_25499() {
      return this.field_28533;
   }

   public static <T> Function<Identifier, class_5621<T>> method_25495(class_5621<? extends class_8669<T>> var0) {
      return var1 -> method_25497(var0, var1);
   }
}
