package mapped;

import net.minecraft.nbt.INBT;

import java.util.function.Function;

public enum Class2343 {
   field16018("this", Class9525.field44330, Class142.method437()),
   field16019("killer", Class9525.field44333, Class142.method437()),
   field16020("killer_player", Class9525.field44331, Class142.method437()),
   field16021("block_entity", Class9525.field44337, Class142.method438());

   public final String field16022;
   public final Class9821<?> field16023;
   public final Function<LootContext, INBT> field16024;
   private static final Class2343[] field16025 = new Class2343[]{field16018, field16019, field16020, field16021};

   private <T> Class2343(String var3, Class9821<T> var4, Function<? super T, INBT> var5) {
      this.field16022 = var3;
      this.field16023 = var4;
      this.field16024 = var2x -> {
         T var5x = var2x.method26081(var4);
         return var5x == null ? null : (INBT)var5.apply(var5x);
      };
   }

   public static Class2343 method9119(String var0) {
      for (Class2343 var6 : values()) {
         if (var6.field16022.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid tag source " + var0);
   }
}
