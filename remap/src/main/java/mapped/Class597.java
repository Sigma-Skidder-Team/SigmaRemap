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

public interface Class597 extends IGuiEventListener
{
    List<? extends IGuiEventListener> children();
    
    default Optional<IGuiEventListener> method3475(final double n, final double n2) {
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
                this.method3469(true);
            }
            return true;
        }
        return false;
    }
    
    default boolean mouseReleased(final double n, final double n2, final int n3) {
        this.method3469(false);
        return this.method3475(n, n2).filter(class574 -> class574.mouseReleased(n4, n5, n6)).isPresent();
    }
    
    default boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.method3471() != null) {
            if (this.method3468()) {
                if (n3 == 0) {
                    return this.method3471().mouseDragged(n, n2, n3, n4, n5);
                }
            }
        }
        return false;
    }
    
    boolean method3468();
    
    void method3469(final boolean p0);
    
    default boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.method3475(n, n2).filter(class574 -> class574.mouseScrolled(n4, n5, n6)).isPresent();
    }
    
    default boolean keyPressed(final int n, final int n2, final int n3) {
        return this.method3471() != null && this.method3471().keyPressed(n, n2, n3);
    }
    
    default boolean keyReleased(final int n, final int n2, final int n3) {
        return this.method3471() != null && this.method3471().keyReleased(n, n2, n3);
    }
    
    default boolean charTyped(final char c, final int n) {
        return this.method3471() != null && this.method3471().charTyped(c, n);
    }
    
    @Nullable
    IGuiEventListener method3471();
    
    void setFocused(final IGuiEventListener p0);
    
    default void method3476(final IGuiEventListener class574) {
        this.setFocused(class574);
    }
    
    default void method3477(final IGuiEventListener class574) {
        this.setFocused(class574);
    }
    
    default boolean changeFocus(final boolean b) {
        final IGuiEventListener method3471 = this.method3471();
        final boolean b2 = method3471 != null;
        if (b2 && method3471.changeFocus(b)) {
            return true;
        }
        final List<? extends IGuiEventListener> method3472 = this.children();
        final int index = method3472.indexOf(method3471);
        int size;
        if (b2 && index >= 0) {
            size = index + (b ? 1 : 0);
        }
        else if (!b) {
            size = method3472.size();
        }
        else {
            size = 0;
        }
        final ListIterator listIterator = method3472.listIterator(size);
        final BooleanSupplier booleanSupplier = b ? listIterator::hasNext : listIterator::hasPrevious;
        final Supplier<Object> supplier = b ? listIterator::next : listIterator::previous;
        while (booleanSupplier.getAsBoolean()) {
            final IGuiEventListener class574 = supplier.get();
            if (!class574.changeFocus(b)) {
                continue;
            }
            this.setFocused(class574);
            return true;
        }
        this.setFocused(null);
        return false;
    }
}
