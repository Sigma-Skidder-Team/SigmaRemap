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

import java.util.Iterator;

public class Class9479
{
    public static ITextComponent method35293(final ITextComponent class2250, final Class8768 class2251) {
        if (!class2251.method30409()) {
            return class2250.method8456().method30409() ? class2250.method8455(class2251.method30425()) : new Class2260("").method8458(class2250).method8455(class2251.method30425());
        }
        return class2250;
    }
    
    public static ITextComponent method35294(final Class7492 class7492, final ITextComponent class7493, final Entity class7494, int n) throws CommandSyntaxException {
        if (n <= 100) {
            ++n;
            final ITextComponent class7495 = (class7493 instanceof Class2253) ? ((Class2253)class7493).method8473(class7492, class7494, n) : class7493.method8465();
            final Iterator<ITextComponent> iterator = class7493.method8462().iterator();
            while (iterator.hasNext()) {
                class7495.method8458(method35294(class7492, iterator.next(), class7494, n));
            }
            return method35293(class7495, class7493.method8456());
        }
        return class7493;
    }
    
    public static ITextComponent method35295(final GameProfile gameProfile) {
        if (gameProfile.getName() == null) {
            return (gameProfile.getId() == null) ? new Class2260("(unknown)") : new Class2260(gameProfile.getId().toString());
        }
        return new Class2260(gameProfile.getName());
    }
    
    public static ITextComponent method35296(final Collection<String> collection) {
        return method35297(collection, s -> new Class2260(s).method8469(Class2116.field12319));
    }
    
    public static <T extends Comparable<T>> ITextComponent method35297(final Collection<T> collection, final Function<T, ITextComponent> function) {
        if (collection.isEmpty()) {
            return new Class2260("");
        }
        if (collection.size() != 1) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)collection);
            arrayList.sort(Comparable::compareTo);
            return method35298(arrayList, (Function<Object, ITextComponent>)function);
        }
        return function.apply((T)collection.iterator().next());
    }
    
    public static <T> ITextComponent method35298(final Collection<T> collection, final Function<T, ITextComponent> function) {
        if (collection.isEmpty()) {
            return new Class2260("");
        }
        if (collection.size() != 1) {
            final Class2260 class2260 = new Class2260("");
            int n = 1;
            for (final Object next : collection) {
                if (n == 0) {
                    class2260.method8458(new Class2260(", ").method8469(Class2116.field12316));
                }
                class2260.method8458(function.apply((T)next));
                n = 0;
            }
            return class2260;
        }
        return function.apply(collection.iterator().next());
    }
    
    public static ITextComponent method35299(final ITextComponent class2250) {
        return new Class2260("[").method8458(class2250).method8457("]");
    }
    
    public static ITextComponent method35300(final Message message) {
        return (message instanceof ITextComponent) ? message : new Class2260(message.getString());
    }
}
