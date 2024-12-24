package mapped;

import net.minecraft.util.registry.Registry;

import java.util.stream.Stream;

public class Class8747<T> {
   private static String[] field39425;
   private final Class6879 field39426;
   private final Registry<T> field39427;
   private final String field39428;

   public Class8747(Class6879 var1, Registry<T> var2, String var3) {
      this.field39426 = var1;
      this.field39427 = var2;
      this.field39428 = var3;
   }

   public Class8747<T> method31558(T var1) {
      this.field39426.method20945(this.field39427.getKey((T)var1), this.field39428);
      return this;
   }

   public Class8747<T> method31559(ITag$NamedTag<T> var1) {
      this.field39426.method20946(var1.getName(), this.field39428);
      return this;
   }

   @SafeVarargs
   public final Class8747<T> method31560(T... var1) {
      Stream.of(var1).map(this.field39427::getKey).forEach(var1x -> this.field39426.method20945(var1x, this.field39428));
      return this;
   }
}
