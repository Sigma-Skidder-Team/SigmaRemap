// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.text;

import java.util.Objects;
import com.google.common.collect.Streams;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.Iterator;
import com.google.common.collect.Lists;

import java.util.List;

public abstract class TextComponent implements ITextComponent
{
    public final List<ITextComponent> siblings;
    private Style style;
    
    public TextComponent() {
        this.siblings = Lists.newArrayList();
    }
    
    @Override
    public ITextComponent appendSibling(final ITextComponent class2250) {
        class2250.getStyle().method30422(this.getStyle());
        this.siblings.add(class2250);
        return this;
    }
    
    @Override
    public List<ITextComponent> getSiblings() {
        return this.siblings;
    }
    
    @Override
    public ITextComponent setStyle(final Style field13792) {
        this.style = field13792;
        final Iterator<ITextComponent> iterator = this.siblings.iterator();
        while (iterator.hasNext()) {
            iterator.next().getStyle().method30422(this.getStyle());
        }
        return this;
    }
    
    @Override
    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
            final Iterator<ITextComponent> iterator = this.siblings.iterator();
            while (iterator.hasNext()) {
                iterator.next().getStyle().method30422(this.style);
            }
        }
        return this.style;
    }

    public Stream<ITextComponent> stream()
    {
        return Streams.concat(Stream.of(this), this.siblings.stream().flatMap(ITextComponent::stream));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof TextComponent) {
            final TextComponent class2251 = (TextComponent)o;
            return this.siblings.equals(class2251.siblings) && this.getStyle().equals(class2251.getStyle());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.getStyle(), this.siblings);
    }
    
    @Override
    public String toString() {
        return "BaseComponent{style=" + this.style + ", siblings=" + this.siblings + '}';
    }
}
