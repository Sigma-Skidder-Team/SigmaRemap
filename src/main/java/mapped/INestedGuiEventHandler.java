package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public interface INestedGuiEventHandler extends IGuiEventListener2 {
   List<? extends IGuiEventListener2> getEventListeners();

   default Optional<IGuiEventListener2> getEventListenerForPos(double var1, double var3) {
      for (IGuiEventListener2 var8 : this.getEventListeners()) {
         if (var8.isMouseOver(var1, var3)) {
            return Optional.<IGuiEventListener2>of(var8);
         }
      }

      return Optional.<IGuiEventListener2>empty();
   }

   @Override
   default boolean mouseClicked(double var1, double var3, int var5) {
      for (IGuiEventListener2 var9 : this.getEventListeners()) {
         if (var9.mouseClicked(var1, var3, var5)) {
            this.setListener(var9);
            if (var5 == 0) {
               this.setDragging(true);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   default boolean mouseReleased(double var1, double var3, int var5) {
      this.setDragging(false);
      return this.getEventListenerForPos(var1, var3).filter(var5x -> var5x.mouseReleased(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      return this.getListener() != null && this.isDragging() && var5 == 0 ? this.getListener().mouseDragged(var1, var3, var5, var6, var8) : false;
   }

   boolean isDragging();

   void setDragging(boolean var1);

   @Override
   default boolean mouseScrolled(double var1, double var3, double var5) {
      return this.getEventListenerForPos(var1, var3).filter(var6 -> var6.mouseScrolled(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean keyPressed(int var1, int var2, int var3) {
      return this.getListener() != null && this.getListener().keyPressed(var1, var2, var3);
   }

   @Override
   default boolean keyReleased(int var1, int var2, int var3) {
      return this.getListener() != null && this.getListener().keyReleased(var1, var2, var3);
   }

   @Override
   default boolean charTyped(char var1, int var2) {
      return this.getListener() != null && this.getListener().charTyped(var1, var2);
   }

   @Nullable
   IGuiEventListener2 getListener();

   void setListener(IGuiEventListener2 var1);

   default void setFocusedDefault(IGuiEventListener2 var1) {
      this.setListener(var1);
      var1.changeFocus(true);
   }

   default void setListenerDefault(IGuiEventListener2 var1) {
      this.setListener(var1);
   }

   @Override
   default boolean changeFocus(boolean var1) {
      IGuiEventListener2 var4 = this.getListener();
      boolean var5 = var4 != null;
      if (var5 && var4.changeFocus(var1)) {
         return true;
      } else {
         List var6 = this.getEventListeners();
         int var7 = var6.indexOf(var4);
         int var8;
         if (var5 && var7 >= 0) {
            var8 = var7 + (!var1 ? 0 : 1);
         } else if (!var1) {
            var8 = var6.size();
         } else {
            var8 = 0;
         }

         ListIterator var9 = var6.listIterator(var8);
         BooleanSupplier var10 = !var1 ? var9::hasPrevious : var9::hasNext;
         Supplier var11 = !var1 ? var9::previous : var9::next;

         while (var10.getAsBoolean()) {
            IGuiEventListener2 var12 = (IGuiEventListener2)var11.get();
            if (var12.changeFocus(var1)) {
               this.setListener(var12);
               return true;
            }
         }

         this.setListener((IGuiEventListener2)null);
         return false;
      }
   }
}
