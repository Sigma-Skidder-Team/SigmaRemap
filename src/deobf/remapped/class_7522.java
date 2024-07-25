package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class class_7522 extends class_6322 {
   public static final Codec<class_7522> field_38395 = method_34274();
   private final Map<? extends class_5621<? extends class_8669<?>>, ? extends class_5383<?>> field_38394;

   private static <E> Codec<class_7522> method_34274() {
      Codec var2 = class_4639.field_22655.xmap(class_5621::method_25494, class_5621::method_25499);
      Codec var3 = var2.partialDispatch(
         "type",
         var0 -> DataResult.success(var0.method_39798()),
         var0 -> method_34275(var0).map(var1 -> class_5383.method_24527(var0, Lifecycle.experimental(), var1))
      );
      UnboundedMapCodec var4 = Codec.unboundedMap(var2, var3);
      return method_34272(var4);
   }

   private static <K extends class_5621<? extends class_8669<?>>, V extends class_5383<?>> Codec<class_7522> method_34272(UnboundedMapCodec<K, V> var0) {
      return var0.xmap(
         class_7522::new,
         var0x -> var0x.field_38394
               .entrySet()
               .stream()
               .filter(var0xx -> ((class_7883)class_6322.method_28807().get(var0xx.getKey())).method_35648())
               .collect(ImmutableMap.toImmutableMap(Entry::getKey, Entry::getValue))
      );
   }

   private static <E> DataResult<? extends Codec<E>> method_34275(class_5621<? extends class_8669<E>> var0) {
      return Optional.<Object>ofNullable((class_7883)class_6322.method_28807().get(var0))
         .<Codec>map(var0x -> ((class_7883)var0x).method_35646())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + var0));
   }

   public class_7522() {
      this(
         class_6322.method_28807()
            .keySet()
            .stream()
            .collect(Collectors.toMap(Function.<class_5621<? extends class_8669<?>>>identity(), class_7522::method_34273))
      );
   }

   private class_7522(Map<? extends class_5621<? extends class_8669<?>>, ? extends class_5383<?>> var1) {
      this.field_38394 = var1;
   }

   private static <E> class_5383<?> method_34273(class_5621<? extends class_8669<?>> var0) {
      return new class_5383((class_5621<? extends class_8669<?>>)var0, Lifecycle.stable());
   }

   @Override
   public <E> Optional<class_6433<E>> method_28814(class_5621<? extends class_8669<E>> var1) {
      return Optional.ofNullable(this.field_38394.get(var1)).<class_6433<E>>map(var0 -> (class_6433<E>)var0);
   }
}
