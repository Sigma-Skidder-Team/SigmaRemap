package remapped;

import com.mojang.serialization.Codec;

public abstract class class_8583<T extends class_5079> {
   private final boolean field_43994;
   private final class_7981<T> field_43993;

   public class_8583(boolean var1, class_7981<T> var2) {
      this.field_43994 = var1;
      this.field_43993 = var2;
   }

   public boolean method_39479() {
      return this.field_43994;
   }

   public class_7981<T> method_39482() {
      return this.field_43993;
   }

   public abstract Codec<T> method_39481();
}
