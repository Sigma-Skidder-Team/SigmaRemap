package mapped;

import net.minecraft.client.gui.AbstractGui;

import javax.annotation.Nullable;

public abstract class FocusableGui extends AbstractGui implements INestedGuiEventHandler {
   private IGuiEventListener2 field6288;
   private boolean field6289;

   @Override
   public final boolean isDragging() {
      return this.field6289;
   }

   @Override
   public final void setDragging(boolean var1) {
      this.field6289 = var1;
   }

   @Nullable
   @Override
   public IGuiEventListener2 getListener() {
      return this.field6288;
   }

   @Override
   public void setListener(IGuiEventListener2 var1) {
      this.field6288 = var1;
   }
}
