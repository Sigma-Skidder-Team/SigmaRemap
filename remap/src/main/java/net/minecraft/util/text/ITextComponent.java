// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.text;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.List;
import java.util.Iterator;
import com.mojang.brigadier.Message;
import mapped.Class2116;
import mapped.Class2260;
import mapped.Class8768;

public interface ITextComponent extends Message, Iterable<ITextComponent>
{
    ITextComponent method8455(final Class8768 p0);
    
    Class8768 method8456();
    
    default ITextComponent method8457(final String s) {
        return this.method8458(new Class2260(s));
    }
    
    ITextComponent method8458(final ITextComponent p0);
    
    String method8459();
    
    default String getString() {
        final StringBuilder sb = new StringBuilder();
        this.method8463().forEach(class2250 -> sb2.append(class2250.method8459()));
        return sb.toString();
    }
    
    default String method8460(final int n) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Object> iterator = this.method8463().iterator();
        while (iterator.hasNext()) {
            final int endIndex = n - sb.length();
            if (endIndex <= 0) {
                break;
            }
            final String method8459 = iterator.next().method8459();
            sb.append((method8459.length() > endIndex) ? method8459.substring(0, endIndex) : method8459);
        }
        return sb.toString();
    }
    
    default String method8461() {
        final StringBuilder sb = new StringBuilder();
        String anObject = "";
        for (final ITextComponent class2250 : this.method8463()) {
            final String method8459 = class2250.method8459();
            if (method8459.isEmpty()) {
                continue;
            }
            final String method8460 = class2250.method8456().method30423();
            if (!method8460.equals(anObject)) {
                if (!anObject.isEmpty()) {
                    sb.append(Class2116.field12330);
                }
                sb.append(method8460);
                anObject = method8460;
            }
            sb.append(method8459);
        }
        if (!anObject.isEmpty()) {
            sb.append(Class2116.field12330);
        }
        return sb.toString();
    }
    
    List<ITextComponent> method8462();
    
    Stream<ITextComponent> method8463();
    
    default Stream<ITextComponent> method8464() {
        return this.method8463().map((Function<? super ITextComponent, ? extends ITextComponent>) ITextComponent::method8470);
    }
    
    default Iterator<ITextComponent> iterator() {
        return this.method8464().iterator();
    }
    
    ITextComponent method8465();
    
    default ITextComponent method8466() {
        final ITextComponent method8465 = this.method8465();
        method8465.method8455(this.method8456().method30425());
        final Iterator<ITextComponent> iterator = this.method8462().iterator();
        while (iterator.hasNext()) {
            method8465.method8458(iterator.next().method8466());
        }
        return method8465;
    }
    
    default ITextComponent method8467(final Consumer<Class8768> consumer) {
        consumer.accept(this.method8456());
        return this;
    }
    
    default ITextComponent method8468(final Class2116... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.method8469(array[i]);
        }
        return this;
    }
    
    default ITextComponent method8469(final Class2116 class2116) {
        final Class8768 method8456 = this.method8456();
        if (class2116.method8255()) {
            method8456.method30413(class2116);
        }
        if (class2116.method8254()) {
            switch (Class6682.field26361[class2116.ordinal()]) {
                case 1: {
                    method8456.method30418(true);
                    break;
                }
                case 2: {
                    method8456.method30414(true);
                    break;
                }
                case 3: {
                    method8456.method30416(true);
                    break;
                }
                case 4: {
                    method8456.method30417(true);
                    break;
                }
                case 5: {
                    method8456.method30415(true);
                    break;
                }
            }
        }
        return this;
    }
    
    default ITextComponent method8470(final ITextComponent class2250) {
        final ITextComponent method8465 = class2250.method8465();
        method8465.method8455(class2250.method8456().method30426());
        return method8465;
    }
}
