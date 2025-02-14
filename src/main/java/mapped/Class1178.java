package mapped;

import javax.annotation.Nullable;

public abstract class Class1178<E extends Class1178<E>> extends Class1154<E> implements INestedGuiEventHandler {
   private IGuiEventListener2 field6373;
   private boolean field6374;

   @Override
   public boolean isDragging() {
      return this.field6374;
   }

   @Override
   public void setDragging(boolean var1) {
      this.field6374 = var1;
   }

   @Override
   public void setListener(IGuiEventListener2 var1) {
      this.field6373 = var1;
   }

   @Nullable
   @Override
   public IGuiEventListener2 getListener() {
      return this.field6373;
   }
}
