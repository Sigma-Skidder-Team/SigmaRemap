package remapped;

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public final class class_7883<E> {
   private static String[] field_40340;
   private final class_5621<? extends class_8669<E>> field_40343;
   private final Codec<E> field_40342;
   private final Codec<E> field_40341;

   public class_7883(class_5621<? extends class_8669<E>> var1, Codec<E> var2, Codec<E> var3) {
      this.field_40343 = var1;
      this.field_40342 = var2;
      this.field_40341 = var3;
   }

   public class_5621<? extends class_8669<E>> method_35647() {
      return this.field_40343;
   }

   public Codec<E> method_35644() {
      return this.field_40342;
   }

   @Nullable
   public Codec<E> method_35646() {
      return this.field_40341;
   }

   public boolean method_35648() {
      return this.field_40341 != null;
   }
}
