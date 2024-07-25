package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;

public class class_3011 extends DataFix {
   public class_3011(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("EntityProjectileOwner", var3.getType(class_4002.field_19444), this::method_13778);
   }

   private Typed<?> method_13778(Typed<?> var1) {
      var1 = this.method_13780(var1, "minecraft:egg", this::method_13777);
      var1 = this.method_13780(var1, "minecraft:ender_pearl", this::method_13777);
      var1 = this.method_13780(var1, "minecraft:experience_bottle", this::method_13777);
      var1 = this.method_13780(var1, "minecraft:snowball", this::method_13777);
      var1 = this.method_13780(var1, "minecraft:potion", this::method_13777);
      var1 = this.method_13780(var1, "minecraft:potion", this::method_13775);
      var1 = this.method_13780(var1, "minecraft:llama_spit", this::method_13781);
      var1 = this.method_13780(var1, "minecraft:arrow", this::method_13779);
      var1 = this.method_13780(var1, "minecraft:spectral_arrow", this::method_13779);
      return this.method_13780(var1, "minecraft:trident", this::method_13779);
   }

   private Dynamic<?> method_13779(Dynamic<?> var1) {
      long var4 = var1.get("OwnerUUIDMost").asLong(0L);
      long var6 = var1.get("OwnerUUIDLeast").asLong(0L);
      return this.method_13774(var1, var4, var6).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
   }

   private Dynamic<?> method_13781(Dynamic<?> var1) {
      OptionalDynamic var4 = var1.get("Owner");
      long var5 = var4.get("OwnerUUIDMost").asLong(0L);
      long var7 = var4.get("OwnerUUIDLeast").asLong(0L);
      return this.method_13774(var1, var5, var7).remove("Owner");
   }

   private Dynamic<?> method_13775(Dynamic<?> var1) {
      OptionalDynamic var4 = var1.get("Potion");
      return var1.set("Item", var4.orElseEmptyMap()).remove("Potion");
   }

   private Dynamic<?> method_13777(Dynamic<?> var1) {
      String var4 = "owner";
      OptionalDynamic var5 = var1.get("owner");
      long var6 = var5.get("M").asLong(0L);
      long var8 = var5.get("L").asLong(0L);
      return this.method_13774(var1, var6, var8).remove("owner");
   }

   private Dynamic<?> method_13774(Dynamic<?> var1, long var2, long var4) {
      String var8 = "OwnerUUID";
      return var2 != 0L && var4 != 0L ? var1.set("OwnerUUID", var1.createIntList(Arrays.stream(method_13773(var2, var4)))) : var1;
   }

   private static int[] method_13773(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   private Typed<?> method_13780(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type var6 = this.getInputSchema().getChoiceType(class_4002.field_19444, var2);
      Type var7 = this.getOutputSchema().getChoiceType(class_4002.field_19444, var2);
      return var1.updateTyped(DSL.namedChoice(var2, var6), var7, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }
}
