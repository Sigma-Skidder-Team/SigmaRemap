// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.google.common.collect.Streams;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class2251 implements Class2250
{
    public final List<Class2250> field13791;
    private Class8768 field13792;
    
    public Class2251() {
        this.field13791 = Lists.newArrayList();
    }
    
    @Override
    public Class2250 method8458(final Class2250 class2250) {
        class2250.method8456().method30422(this.method8456());
        this.field13791.add(class2250);
        return this;
    }
    
    @Override
    public List<Class2250> method8462() {
        return this.field13791;
    }
    
    @Override
    public Class2250 method8455(final Class8768 field13792) {
        this.field13792 = field13792;
        final Iterator<Class2250> iterator = this.field13791.iterator();
        while (iterator.hasNext()) {
            iterator.next().method8456().method30422(this.method8456());
        }
        return this;
    }
    
    @Override
    public Class8768 method8456() {
        if (this.field13792 == null) {
            this.field13792 = new Class8768();
            final Iterator<Class2250> iterator = this.field13791.iterator();
            while (iterator.hasNext()) {
                iterator.next().method8456().method30422(this.field13792);
            }
        }
        return this.field13792;
    }
    
    @Override
    public Stream<Class2250> method8463() {
        return Streams.concat(new Stream[] { Stream.of(this), this.field13791.stream().flatMap((Function<? super Object, ? extends Stream<?>>)Class2250::method8463) });
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2251) {
            final Class2251 class2251 = (Class2251)o;
            return this.field13791.equals(class2251.field13791) && this.method8456().equals(class2251.method8456());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.method8456(), this.field13791);
    }
    
    @Override
    public String toString() {
        return "BaseComponent{style=" + this.field13792 + ", siblings=" + this.field13791 + '}';
    }
}
