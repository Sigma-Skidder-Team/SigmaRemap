package mapped;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

public final class Class9802<U> {
   private static String[] field45820;
   private final Class8830<U> field45821;
   private final Optional<? extends Class8222<U>> field45822;

   private static <U> Class9802<U> method38645(Class8830<U> var0, Optional<? extends Class8222<?>> var1) {
      return new Class9802(var0, var1);
   }

   private Class9802(Class8830<U> var1, Optional<? extends Class8222<U>> var2) {
      this.field45821 = var1;
      this.field45822 = var2;
   }

   private void method38646(Brain<?> var1) {
      Brain.method21447(var1, this.field45821, this.field45822);
   }

   public <T> void method38647(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.field45821
         .method31926()
         .ifPresent(var3 -> this.field45822.ifPresent(var4 -> var2.add(Registry.field16092.encodeStart(var1, this.field45821), var3.encodeStart(var1, var4))));
   }

   // $VF: synthetic method
   public Class9802(Class8830 var1, Optional var2, Class9490 var3) {
      this(var1, var2);
   }

   // $VF: synthetic method
   public static void method38650(Class9802 var0, Brain var1) {
      var0.method38646(var1);
   }

   // $VF: synthetic method
   public static Class9802 method38651(Class8830 var0, Optional var1) {
      return method38645(var0, var1);
   }
}
