package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Class7452 {
   private final Type<Pair<String, Dynamic<?>>> field32059 = DSL.named(TypeReferences.BLOCK_STATE.typeName(), DSL.remainderType());
   public final OpticFinder<List<Pair<String, Dynamic<?>>>> field32060 = DSL.fieldFinder("Palette", DSL.list(this.field32059));
   public final List<Dynamic<?>> field32061;
   public final int field32062;
   public Class8321 field32063;

   public Class7452(Typed<?> var1, Schema var2) {
      if (Objects.equals(var2.getType(TypeReferences.BLOCK_STATE), this.field32059)) {
         Optional<List<Pair<String, Dynamic<?>>>> var5 = var1.getOptional(this.field32060);
         this.field32061 = var5.map(var0 -> var0.stream().<Dynamic<?>>map(Pair::getSecond).collect(Collectors.<Dynamic<?>>toList()))
            .orElse(ImmutableList.of());
         Dynamic var6 = (Dynamic)var1.get(DSL.remainderFinder());
         this.field32062 = var6.get("Y").asInt(0);
         this.method24089(var6);
      } else {
         throw new IllegalStateException("Block state type is not what was expected.");
      }
   }

   public void method24089(Dynamic<?> var1) {
      if (!this.method24095()) {
         long[] var4 = var1.get("BlockStates").asLongStream().toArray();
         int var5 = Math.max(4, DataFixUtils.ceillog2(this.field32061.size()));
         this.field32063 = new Class8321(var5, 4096, var4);
      } else {
         this.field32063 = null;
      }
   }

   public Typed<?> method24090(Typed<?> var1) {
      return !this.method24091()
         ? var1.update(DSL.remainderFinder(), var1x -> var1x.set("BlockStates", var1x.createLongList(Arrays.stream(this.field32063.method29140()))))
            .set(this.field32060, this.field32061.stream().<Pair<String, Dynamic<?>>>map(var0 -> Pair.of(TypeReferences.BLOCK_STATE.typeName(), var0)).collect(Collectors.toList()))
         : var1;
   }

   public boolean method24091() {
      return this.field32063 == null;
   }

   public int method24092(int var1) {
      return this.field32063.method29139(var1);
   }

   public int method24093(String var1, boolean var2, int var3) {
      return Class9508.method36720().get(var1) << 5 | (!var2 ? 0 : 16) | var3;
   }

   public int method24094() {
      return this.field32062;
   }

   public abstract boolean method24095();
}
