package mapped;

import com.mojang.serialization.Codec;

public abstract class Class7434<T extends Class7436> {
   private final boolean field31995;
   private final Class6865<T> field31996;

   public Class7434(boolean var1, Class6865<T> var2) {
      this.field31995 = var1;
      this.field31996 = var2;
   }

   public boolean method24006() {
      return this.field31995;
   }

   public Class6865<T> method24007() {
      return this.field31996;
   }

   public abstract Codec<T> method24005();
}
