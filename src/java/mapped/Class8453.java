// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.google.common.collect.PeekingIterator;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Iterators;
import java.util.stream.LongStream;
import java.util.Arrays;
import java.util.stream.IntStream;
import com.mojang.datafixers.DataFixUtils;
import java.nio.ByteBuffer;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.Optional;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.DynamicOps;

public class Class8453 implements DynamicOps<Class41>
{
    public static final Class8453 field34721;
    
    public Class41 empty() {
        return Class42.field103;
    }
    
    public Type<?> getType(final Class41 class41) {
        switch (class41.method260()) {
            case 0: {
                return (Type<?>)DSL.nilType();
            }
            case 1: {
                return (Type<?>)DSL.byteType();
            }
            case 2: {
                return (Type<?>)DSL.shortType();
            }
            case 3: {
                return (Type<?>)DSL.intType();
            }
            case 4: {
                return (Type<?>)DSL.longType();
            }
            case 5: {
                return (Type<?>)DSL.floatType();
            }
            case 6: {
                return (Type<?>)DSL.doubleType();
            }
            case 7: {
                return (Type<?>)DSL.list(DSL.byteType());
            }
            case 8: {
                return (Type<?>)DSL.string();
            }
            case 9: {
                return (Type<?>)DSL.list(DSL.remainderType());
            }
            case 10: {
                return (Type<?>)DSL.compoundList(DSL.remainderType(), DSL.remainderType());
            }
            case 11: {
                return (Type<?>)DSL.list(DSL.intType());
            }
            case 12: {
                return (Type<?>)DSL.list(DSL.longType());
            }
            default: {
                return (Type<?>)DSL.remainderType();
            }
        }
    }
    
    public Optional<Number> getNumberValue(final Class41 class41) {
        return (class41 instanceof Class43) ? Optional.of(((Class43)class41).method276()) : Optional.empty();
    }
    
    public Class41 createNumeric(final Number n) {
        return Class44.method277(n.doubleValue());
    }
    
    public Class41 createByte(final byte b) {
        return Class47.method283(b);
    }
    
    public Class41 createShort(final short n) {
        return Class48.method286(n);
    }
    
    public Class41 createInt(final int n) {
        return Class45.method279(n);
    }
    
    public Class41 createLong(final long n) {
        return Class49.method288(n);
    }
    
    public Class41 createFloat(final float n) {
        return Class46.method281(n);
    }
    
    public Class41 createDouble(final double n) {
        return Class44.method277(n);
    }
    
    public Class41 createBoolean(final boolean b) {
        return Class47.method284(b);
    }
    
    public Optional<String> getStringValue(final Class41 class41) {
        return (class41 instanceof Class50) ? Optional.of(class41.method267()) : Optional.empty();
    }
    
    public Class41 createString(final String s) {
        return Class50.method290(s);
    }
    
    public Class41 mergeInto(final Class41 class41, final Class41 e) {
        if (e instanceof Class42) {
            return class41;
        }
        if (class41 instanceof Class51) {
            if (e instanceof Class51) {
                final Class51 class42 = new Class51();
                final Class51 class43 = (Class51)class41;
                for (final String s : class43.method293()) {
                    class42.method295(s, class43.method313(s));
                }
                final Class51 class44 = (Class51)e;
                for (final String s2 : class44.method293()) {
                    class42.method295(s2, class44.method313(s2));
                }
                return class42;
            }
            return class41;
        }
        else {
            if (class41 instanceof Class42) {
                throw new IllegalArgumentException("mergeInto called with a null input.");
            }
            if (!(class41 instanceof Class38)) {
                return class41;
            }
            final Class52 class45 = new Class52();
            class45.addAll((Collection<? extends Class41>)class41);
            class45.add(e);
            return class45;
        }
    }
    
    public Class41 mergeInto(final Class41 class41, final Class41 class42, final Class41 class43) {
        Class51 class45;
        if (!(class41 instanceof Class42)) {
            if (!(class41 instanceof Class51)) {
                return class41;
            }
            final Class51 class44 = (Class51)class41;
            class45 = new Class51();
            class44.method293().forEach(s -> class46.method295(s, class47.method313(s)));
        }
        else {
            class45 = new Class51();
        }
        class45.method295(class42.method267(), class43);
        return class45;
    }
    
    public Class41 merge(final Class41 obj, final Class41 obj2) {
        if (obj instanceof Class42) {
            return obj2;
        }
        if (obj2 instanceof Class42) {
            return obj;
        }
        if (obj instanceof Class51) {
            if (obj2 instanceof Class51) {
                final Class51 class51 = (Class51)obj;
                final Class51 class52 = (Class51)obj2;
                final Class51 class53 = new Class51();
                class51.method293().forEach(s -> class55.method295(s, class56.method313(s)));
                class52.method293().forEach(s2 -> class57.method295(s2, class58.method313(s2)));
            }
        }
        if (obj instanceof Class38 && obj2 instanceof Class38) {
            final Class52 class54 = new Class52();
            class54.addAll((Collection<? extends Class41>)obj);
            class54.addAll((Collection<? extends Class41>)obj2);
            return class54;
        }
        throw new IllegalArgumentException("Could not merge " + obj + " and " + obj2);
    }
    
    public Optional<Map<Class41, Class41>> getMapValues(final Class41 class41) {
        if (!(class41 instanceof Class51)) {
            return Optional.empty();
        }
        return Optional.of((Map<Class41, Class41>)((Class51)class41).method293().stream().map(s -> Pair.of((Object)this.createString(s), (Object)class42.method313(s))).collect((Collector<? super Object, ?, T>)Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)));
    }
    
    public Class41 createMap(final Map<Class41, Class41> map) {
        final Class51 class51 = new Class51();
        for (final Map.Entry entry : map.entrySet()) {
            class51.method295(((Class41)entry.getKey()).method267(), (Class41)entry.getValue());
        }
        return class51;
    }
    
    public Optional<Stream<Class41>> getStream(final Class41 class41) {
        return (Optional<Stream<Class41>>)((class41 instanceof Class38) ? Optional.of(((Class38)class41).stream().map(o -> o)) : Optional.empty());
    }
    
    public Optional<ByteBuffer> getByteBuffer(final Class41 class41) {
        return (class41 instanceof Class40) ? Optional.of(ByteBuffer.wrap(((Class40)class41).method266())) : super.getByteBuffer((Object)class41);
    }
    
    public Class41 createByteList(final ByteBuffer byteBuffer) {
        return new Class40(DataFixUtils.toArray(byteBuffer));
    }
    
    public Optional<IntStream> getIntStream(final Class41 class41) {
        return (class41 instanceof Class53) ? Optional.of(Arrays.stream(((Class53)class41).method358())) : super.getIntStream((Object)class41);
    }
    
    public Class41 createIntList(final IntStream intStream) {
        return new Class53(intStream.toArray());
    }
    
    public Optional<LongStream> getLongStream(final Class41 class41) {
        return (class41 instanceof Class39) ? Optional.of(Arrays.stream(((Class39)class41).method264())) : super.getLongStream((Object)class41);
    }
    
    public Class41 createLongList(final LongStream longStream) {
        return new Class39(longStream.toArray());
    }
    
    public Class41 createList(final Stream<Class41> stream) {
        final PeekingIterator peekingIterator = Iterators.peekingIterator((Iterator)stream.iterator());
        if (!peekingIterator.hasNext()) {
            return new Class52();
        }
        final Class41 class41 = (Class41)peekingIterator.peek();
        if (class41 instanceof Class47) {
            return new Class40(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((Class47)class41).method273())));
        }
        if (class41 instanceof Class45) {
            return new Class53(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((Class45)class41).method271())));
        }
        if (!(class41 instanceof Class49)) {
            final Class52 class42 = new Class52();
            while (peekingIterator.hasNext()) {
                final Class41 e = (Class41)peekingIterator.next();
                if (e instanceof Class42) {
                    continue;
                }
                class42.add(e);
            }
            return class42;
        }
        return new Class39(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((Class49)class41).method270())));
    }
    
    public Class41 remove(final Class41 class41, final String s) {
        if (!(class41 instanceof Class51)) {
            return class41;
        }
        final Class51 class42 = (Class51)class41;
        final Class51 class43 = new Class51();
        class42.method293().stream().filter(a -> !Objects.equals(a, b)).forEach(s2 -> class44.method295(s2, class45.method313(s2)));
        return class43;
    }
    
    @Override
    public String toString() {
        return "NBT";
    }
    
    static {
        field34721 = new Class8453();
    }
}
