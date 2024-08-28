package mapped;

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public final class Class9305<E> {
   private static String[] field43198;
   private final Class8705<? extends Class2348<E>> field43199;
   private final Codec<E> field43200;
   private final Codec<E> field43201;

   public Class9305(Class8705<? extends Class2348<E>> var1, Codec<E> var2, Codec<E> var3) {
      this.field43199 = var1;
      this.field43200 = var2;
      this.field43201 = var3;
   }

   public Class8705<? extends Class2348<E>> method35116() {
      return this.field43199;
   }

   public Codec<E> method35117() {
      return this.field43200;
   }

   @Nullable
   public Codec<E> method35118() {
      return this.field43201;
   }

   public boolean method35119() {
      return this.field43201 != null;
   }
}
