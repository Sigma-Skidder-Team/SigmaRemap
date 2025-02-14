package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public interface INameable {
   ITextComponent getName();

   default boolean method3381() {
      return this.method3380() != null;
   }

   default ITextComponent getDisplayName() {
      return this.getName();
   }

   @Nullable
   default ITextComponent method3380() {
      return null;
   }
}
