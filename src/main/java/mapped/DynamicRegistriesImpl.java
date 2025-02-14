package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class DynamicRegistriesImpl extends DynamicRegistries {
   public static final Codec<DynamicRegistriesImpl> field40301 = method32473();
   private final Map<? extends RegistryKey<? extends Registry<?>>, ? extends SimpleRegistry<?>> field40302;

   private static <E> Codec<DynamicRegistriesImpl> method32473() {
      Codec<RegistryKey<? extends Registry<E>>> var2 = ResourceLocation.CODEC.xmap(RegistryKey::getOrCreateRootKey, RegistryKey::getLocation);
      Codec<SimpleRegistry<E>> var3 = var2.partialDispatch(
         "type",
         var0 -> DataResult.success(var0.method9180()),
         var0 -> method32475(var0).map(var1 -> SimpleRegistry.method9255(var0, Lifecycle.experimental(), var1))
      );
      UnboundedMapCodec var4 = Codec.unboundedMap(var2, var3);
      return method32474(var4);
   }

   private static <K extends RegistryKey<? extends Registry<?>>, V extends SimpleRegistry<?>> Codec<DynamicRegistriesImpl> method32474(UnboundedMapCodec<K, V> var0) {
      return var0.xmap(DynamicRegistriesImpl::new, var0x ->
              ((java.util.Set<Entry<K, V>>)(Object)(var0x.field40302.entrySet()))
               .stream()
               .filter(var0xx -> DynamicRegistries.method32472().get(var0xx.getKey()).method35119())
               .collect(ImmutableMap.toImmutableMap(Entry::getKey, Entry::getValue))
      );
   }

   private static <E> DataResult<? extends Codec<E>> method32475(RegistryKey<? extends Registry<E>> var0) {
      return Optional.ofNullable((Class9305<E>) DynamicRegistries.method32472().get(var0))
         .map(Class9305::method35118)
         .map(DataResult::success)
         .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + var0));
   }

   public DynamicRegistriesImpl() {
      this(DynamicRegistries.method32472().keySet().stream().collect(Collectors.toMap(Function.identity(), DynamicRegistriesImpl::method32476)));
   }

   private DynamicRegistriesImpl(Map<? extends RegistryKey<? extends Registry<?>>, ? extends SimpleRegistry<?>> var1) {
      this.field40302 = var1;
   }

   private static <E> SimpleRegistry<?> method32476(RegistryKey<? extends Registry<?>> var0) {
      return new SimpleRegistry(var0, Lifecycle.stable());
   }

   @Override
   public <E> Optional<MutableRegistry<E>> method32452(RegistryKey<? extends Registry<E>> var1) {
      return Optional.ofNullable(this.field40302.get(var1)).<MutableRegistry<E>>map(var0 -> (MutableRegistry<E>)var0);
   }

   // $VF: synthetic method
   public static Map method32485(DynamicRegistriesImpl var0) {
      return var0.field40302;
   }
}
