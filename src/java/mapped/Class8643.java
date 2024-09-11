package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class Class8643<E, T extends Class7129<E>> {
   private static String[] field38917;
   private final Registry<T> field38918;
   private final String field38919;
   private final String field38920;
   private final Function<E, T> field38921;
   private Pair<T, Class8367<? extends E>> field38922;

   public Class8643(Registry<T> var1, String var2, String var3, Function<E, T> var4) {
      this.field38918 = var1;
      this.field38919 = var2;
      this.field38920 = var3;
      this.field38921 = var4;
   }

   public Object getSerializer() {
      return new Class2567(this.field38918, this.field38919, this.field38920, this.field38921, this.field38922);
   }
}
