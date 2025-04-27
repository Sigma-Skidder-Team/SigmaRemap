// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import java.util.function.Function;
import java.util.Collection;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

import java.util.Iterator;

public class Class9479
{
    public static ITextComponent method35293(final ITextComponent class2250, final Style class2251) {
        if (!class2251.method30409()) {
            return class2250.getStyle().method30409() ? class2250.setStyle(class2251.createShallowCopy()) : new StringTextComponent("").appendSibling(class2250).setStyle(class2251.createShallowCopy());
        }
        return class2250;
    }
    
    public static ITextComponent method35294(final Class7492 class7492, final ITextComponent class7493, final Entity class7494, int n) throws CommandSyntaxException {
        if (n <= 100) {
            ++n;
            final ITextComponent class7495 = (class7493 instanceof Class2253) ? ((Class2253)class7493).method8473(class7492, class7494, n) : class7493.shallowCopy();
            final Iterator<ITextComponent> iterator = class7493.getSiblings().iterator();
            while (iterator.hasNext()) {
                class7495.appendSibling(method35294(class7492, iterator.next(), class7494, n));
            }
            return method35293(class7495, class7493.getStyle());
        }
        return class7493;
    }
    
    public static ITextComponent method35295(final GameProfile gameProfile) {
        if (gameProfile.getName() == null) {
            return (gameProfile.getId() == null) ? new StringTextComponent("(unknown)") : new StringTextComponent(gameProfile.getId().toString());
        }
        return new StringTextComponent(gameProfile.getName());
    }
    
    public static ITextComponent method35296(final Collection<String> collection) {
        return method35297(collection, s -> new StringTextComponent(s).applyTextStyle(TextFormatting.GREEN));
    }
    
    public static <T extends Comparable<T>> ITextComponent method35297(final Collection<T> collection, final Function<T, ITextComponent> function) {
        if (collection.isEmpty()) {
            return new StringTextComponent("");
        }
        if (collection.size() != 1) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)collection);
            arrayList.sort(Comparable::compareTo);
            return method35298(arrayList, (Function<Object, ITextComponent>)function);
        }
        return function.apply(collection.iterator().next());
    }
    
    public static <T> ITextComponent method35298(final Collection<T> collection, final Function<T, ITextComponent> function) {
        if (collection.isEmpty()) {
            return new StringTextComponent("");
        }
        if (collection.size() != 1) {
            final StringTextComponent class2260 = new StringTextComponent("");
            int n = 1;
            for (final Object next : collection) {
                if (n == 0) {
                    class2260.appendSibling(new StringTextComponent(", ").applyTextStyle(TextFormatting.GRAY));
                }
                class2260.appendSibling(function.apply((T)next));
                n = 0;
            }
            return class2260;
        }
        return function.apply(collection.iterator().next());
    }
    
    public static ITextComponent method35299(final ITextComponent class2250) {
        return new StringTextComponent("[").appendSibling(class2250).appendText("]");
    }
    
    public static ITextComponent method35300(final Message message) {
        return (message instanceof ITextComponent) ? message : new StringTextComponent(message.getString());
    }
}
