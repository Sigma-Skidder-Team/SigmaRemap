// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.function.BooleanSupplier;
import java.util.ListIterator;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.List;

public interface INestedGuiEventHandler extends IGuiEventListener
{
    List<? extends IGuiEventListener> children();
    
    default Optional<IGuiEventListener> getEventListenerForPos(final double n, final double n2) {
        for (final IGuiEventListener value : this.children()) {
            if (!value.isMouseOver(n, n2)) {
                continue;
            }
            return Optional.of(value);
        }
        return Optional.empty();
    }
    
    default boolean mouseClicked(final double n, final double n2, final int n3) {
        for (final IGuiEventListener class574 : this.children()) {
            if (!class574.mouseClicked(n, n2, n3)) {
                continue;
            }
            this.setFocused(class574);
            if (n3 == 0) {
                this.setDragging(true);
            }
            return true;
        }
        return false;
    }

    default boolean mouseReleased(double p_mouseReleased_1_, double p_mouseReleased_3_, int p_mouseReleased_5_) {
        this.setDragging(false);
        return this.getEventListenerForPos(p_mouseReleased_1_, p_mouseReleased_3_).filter((p_212931_5_) ->
        {
            return p_212931_5_.mouseReleased(p_mouseReleased_1_, p_mouseReleased_3_, p_mouseReleased_5_);
        }).isPresent();
    }

    default boolean mouseDragged(double p_mouseDragged_1_, double p_mouseDragged_3_, int p_mouseDragged_5_, double p_mouseDragged_6_, double p_mouseDragged_8_) {
        return this.getFocused() != null && this.isDragging() && p_mouseDragged_5_ == 0 ? this.getFocused().mouseDragged(p_mouseDragged_1_, p_mouseDragged_3_, p_mouseDragged_5_, p_mouseDragged_6_, p_mouseDragged_8_) : false;
    }
    
    boolean isDragging();
    
    void setDragging(final boolean p0);

    default boolean mouseScrolled(double p_mouseScrolled_1_, double p_mouseScrolled_3_, double p_mouseScrolled_5_) {
        return this.getEventListenerForPos(p_mouseScrolled_1_, p_mouseScrolled_3_).filter((p_212929_6_) ->
        {
            return p_212929_6_.mouseScrolled(p_mouseScrolled_1_, p_mouseScrolled_3_, p_mouseScrolled_5_);
        }).isPresent();
    }
    
    default boolean keyPressed(final int n, final int n2, final int n3) {
        return this.getFocused() != null && this.getFocused().keyPressed(n, n2, n3);
    }
    
    default boolean keyReleased(final int n, final int n2, final int n3) {
        return this.getFocused() != null && this.getFocused().keyReleased(n, n2, n3);
    }
    
    default boolean charTyped(final char c, final int n) {
        return this.getFocused() != null && this.getFocused().charTyped(c, n);
    }
    
    @Nullable
    IGuiEventListener getFocused();
    
    void setFocused(final IGuiEventListener p0);
    
    default void setFocusedDefault(final IGuiEventListener class574) {
        this.setFocused(class574);
    }
    
    default void func_212932_b(final IGuiEventListener class574) {
        this.setFocused(class574);
    }

    default boolean changeFocus(boolean p_changeFocus_1_) {
        IGuiEventListener iguieventlistener = this.getFocused();
        boolean flag = iguieventlistener != null;

        if (flag && iguieventlistener.changeFocus(p_changeFocus_1_)) {
            return true;
        } else {
            List<? extends IGuiEventListener> list = this.children();
            int j = list.indexOf(iguieventlistener);
            int i;

            if (flag && j >= 0) {
                i = j + (p_changeFocus_1_ ? 1 : 0);
            } else if (p_changeFocus_1_) {
                i = 0;
            } else {
                i = list.size();
            }

            ListIterator<? extends IGuiEventListener> listiterator = list.listIterator(i);
            BooleanSupplier booleansupplier = p_changeFocus_1_ ? listiterator::hasNext : listiterator::hasPrevious;
            Supplier<? extends IGuiEventListener> supplier = p_changeFocus_1_ ? listiterator::next : listiterator::previous;

            while (booleansupplier.getAsBoolean()) {
                IGuiEventListener iguieventlistener1 = supplier.get();

                if (iguieventlistener1.changeFocus(p_changeFocus_1_)) {
                    this.setFocused(iguieventlistener1);
                    return true;
                }
            }

            this.setFocused((IGuiEventListener) null);
            return false;
        }
    }
}
