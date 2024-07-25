package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class class_2214<E extends LivingEntity> extends class_5920<E> {
   private final Predicate<E> field_11086;
   private final class_5920<? super E> field_11085;
   private final boolean field_11087;

   public class_2214(Map<class_6044<?>, class_561> var1, Predicate<E> var2, class_5920<? super E> var3, boolean var4) {
      super(method_10239(var1, var3.field_30040));
      this.field_11086 = var2;
      this.field_11085 = var3;
      this.field_11087 = var4;
   }

   private static Map<class_6044<?>, class_561> method_10239(Map<class_6044<?>, class_561> var0, Map<class_6044<?>, class_561> var1) {
      HashMap var4 = Maps.newHashMap();
      var4.putAll(var0);
      var4.putAll(var1);
      return var4;
   }

   public class_2214(Predicate<E> var1, class_5920<? super E> var2) {
      this(ImmutableMap.of(), var1, var2, false);
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      return this.field_11086.test((E)var2) && this.field_11085.method_27088(var1, (E)var2);
   }

   @Override
   public boolean method_27086(class_6331 var1, E var2, long var3) {
      return this.field_11087 && this.field_11086.test((E)var2) && this.field_11085.method_27086(var1, (E)var2, var3);
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      this.field_11085.method_27080(var1, (E)var2, var3);
   }

   @Override
   public void method_27078(class_6331 var1, E var2, long var3) {
      this.field_11085.method_27078(var1, (E)var2, var3);
   }

   @Override
   public void method_27081(class_6331 var1, E var2, long var3) {
      this.field_11085.method_27081(var1, (E)var2, var3);
   }

   @Override
   public String toString() {
      return "RunIf: " + this.field_11085;
   }
}
