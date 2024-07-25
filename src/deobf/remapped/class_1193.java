package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;

public final class class_1193<E extends class_5834> {
   private static String[] field_6686;
   private final Collection<? extends class_6044<?>> field_6687;
   private final Collection<? extends class_3172<? extends class_6127<? super E>>> field_6684;
   private final Codec<class_1150<E>> field_6685;

   private class_1193(Collection<? extends class_6044<?>> var1, Collection<? extends class_3172<? extends class_6127<? super E>>> var2) {
      this.field_6687 = var1;
      this.field_6684 = var2;
      this.field_6685 = class_1150.<E>method_5120(var1, var2);
   }

   public class_1150<E> method_5284(Dynamic<?> var1) {
      return this.field_6685
         .parse(var1)
         .resultOrPartial(class_1150.method_5125()::error)
         .orElseGet(() -> new class_1150<E>(this.field_6687, this.field_6684, ImmutableList.of(), () -> this.field_6685));
   }
}
