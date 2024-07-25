package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public final class class_126 implements class_3940 {
   private final Map<class_5621<?>, JsonElement> field_307 = Maps.newIdentityHashMap();
   private final Object2IntMap<class_5621<?>> field_306 = new Object2IntOpenCustomHashMap(Util.method_44698());
   private final Map<class_5621<?>, Lifecycle> field_305 = Maps.newIdentityHashMap();

   public <E> void method_392(class_7522 var1, class_5621<E> var2, Encoder<E> var3, int var4, E var5, Lifecycle var6) {
      DataResult var9 = var3.encodeStart(class_8876.method_40843(JsonOps.INSTANCE, var1), var5);
      Optional var10 = var9.error();
      if (!var10.isPresent()) {
         this.field_307.put(var2, (JsonElement)var9.result().get());
         this.field_306.put(var2, var4);
         this.field_305.put(var2, var6);
      } else {
         class_888.method_3828().error("Error adding element: {}", ((PartialResult)var10.get()).message());
      }
   }

   @Override
   public Collection<Identifier> method_18209(class_5621<? extends class_8669<?>> var1) {
      return this.field_307
         .keySet()
         .stream()
         .filter(var1x -> var1x.method_25498(var1))
         .<Identifier>map(
            var1x -> new Identifier(
                  var1x.method_25499().method_21461(), var1.method_25499().method_21456() + "/" + var1x.method_25499().method_21456() + ".json"
               )
         )
         .collect(Collectors.<Identifier>toList());
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method_18208(
      DynamicOps<JsonElement> var1, class_5621<? extends class_8669<E>> var2, class_5621<E> var3, Decoder<E> var4
   ) {
      JsonElement var7 = this.field_307.get(var3);
      return var7 != null
         ? var4.parse(var1, var7).setLifecycle(this.field_305.get(var3)).map(var2x -> Pair.of(var2x, OptionalInt.of(this.field_306.getInt(var3))))
         : DataResult.error("Unknown element: " + var3);
   }
}
