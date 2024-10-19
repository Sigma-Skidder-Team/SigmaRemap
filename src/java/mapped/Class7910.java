package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Arrays;
import java.util.function.Function;

public class Class7910 extends DataFix {
   public Class7910(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("EntityProjectileOwner", var3.getType(TypeReferences.ENTITY), this::method26525);
   }

   private Typed<?> method26525(Typed<?> var1) {
      var1 = this.method26532(var1, "minecraft:egg", this::method26529);
      var1 = this.method26532(var1, "minecraft:ender_pearl", this::method26529);
      var1 = this.method26532(var1, "minecraft:experience_bottle", this::method26529);
      var1 = this.method26532(var1, "minecraft:snowball", this::method26529);
      var1 = this.method26532(var1, "minecraft:potion", this::method26529);
      var1 = this.method26532(var1, "minecraft:potion", this::method26528);
      var1 = this.method26532(var1, "minecraft:llama_spit", this::method26527);
      var1 = this.method26532(var1, "minecraft:arrow", this::method26526);
      var1 = this.method26532(var1, "minecraft:spectral_arrow", this::method26526);
      return this.method26532(var1, "minecraft:trident", this::method26526);
   }

   private Dynamic<?> method26526(Dynamic<?> var1) {
      long var4 = var1.get("OwnerUUIDMost").asLong(0L);
      long var6 = var1.get("OwnerUUIDLeast").asLong(0L);
      return this.method26530(var1, var4, var6).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
   }

   private Dynamic<?> method26527(Dynamic<?> var1) {
      OptionalDynamic var4 = var1.get("Owner");
      long var5 = var4.get("OwnerUUIDMost").asLong(0L);
      long var7 = var4.get("OwnerUUIDLeast").asLong(0L);
      return this.method26530(var1, var5, var7).remove("Owner");
   }

   private Dynamic<?> method26528(Dynamic<?> var1) {
      OptionalDynamic var4 = var1.get("Potion");
      return var1.set("Item", var4.orElseEmptyMap()).remove("Potion");
   }

   private Dynamic<?> method26529(Dynamic<?> var1) {
      String var4 = "owner";
      OptionalDynamic var5 = var1.get("owner");
      long var6 = var5.get("M").asLong(0L);
      long var8 = var5.get("L").asLong(0L);
      return this.method26530(var1, var6, var8).remove("owner");
   }

   private Dynamic<?> method26530(Dynamic<?> var1, long var2, long var4) {
      String var8 = "OwnerUUID";
      return var2 != 0L && var4 != 0L ? var1.set("OwnerUUID", var1.createIntList(Arrays.stream(method26531(var2, var4)))) : var1;
   }

   private static int[] method26531(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   private Typed<?> method26532(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type var6 = this.getInputSchema().getChoiceType(TypeReferences.ENTITY, var2);
      Type var7 = this.getOutputSchema().getChoiceType(TypeReferences.ENTITY, var2);
      return var1.updateTyped(DSL.namedChoice(var2, var6), var7, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }
}
