package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class class_1974 {
   private final Type<Pair<String, Dynamic<?>>> field_10004 = DSL.named(class_4002.field_19435.typeName(), DSL.remainderType());
   public final OpticFinder<List<Pair<String, Dynamic<?>>>> field_10005 = DSL.fieldFinder("Palette", DSL.list(this.field_10004));
   public final List<Dynamic<?>> field_10006;
   public final int field_10007;
   public class_4236 field_10008;

   public class_1974(Typed<?> var1, Schema var2) {
      if (Objects.equals(var2.getType(class_4002.field_19435), this.field_10004)) {
         Optional var5 = var1.getOptional(this.field_10005);
         this.field_10006 = var5.<List<Dynamic<?>>>map(var0 -> var0.stream().<Dynamic<?>>map(Pair::getSecond).collect(Collectors.<Dynamic<?>>toList()))
            .orElse(ImmutableList.of());
         Dynamic var6 = (Dynamic)var1.get(DSL.remainderFinder());
         this.field_10007 = var6.get("Y").asInt(0);
         this.method_9085(var6);
      } else {
         throw new IllegalStateException("Block state type is not what was expected.");
      }
   }

   public void method_9085(Dynamic<?> var1) {
      if (!this.method_9080()) {
         long[] var4 = var1.get("BlockStates").asLongStream().toArray();
         int var5 = Math.max(4, DataFixUtils.ceillog2(this.field_10006.size()));
         this.field_10008 = new class_4236(var5, 4096, var4);
      } else {
         this.field_10008 = null;
      }
   }

   public Typed<?> method_9084(Typed<?> var1) {
      return !this.method_9086()
         ? var1.update(DSL.remainderFinder(), var1x -> var1x.set("BlockStates", var1x.createLongList(Arrays.stream(this.field_10008.method_19756()))))
            .set(this.field_10005, this.field_10006.stream().<Pair>map(var0 -> Pair.of(class_4002.field_19435.typeName(), var0)).collect(Collectors.toList()))
         : var1;
   }

   public boolean method_9086() {
      return this.field_10008 == null;
   }

   public int method_9087(int var1) {
      return this.field_10008.method_19759(var1);
   }

   public int method_9081(String var1, boolean var2, int var3) {
      return class_8656.method_39687().get(var1) << 5 | (!var2 ? 0 : 16) | var3;
   }

   public int method_9082() {
      return this.field_10007;
   }

   public abstract boolean method_9080();
}
