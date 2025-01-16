// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.google.common.collect.PeekingIterator;
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
import net.minecraft.nbt.*;

public class Class8453 implements DynamicOps<INBT>
{
    public static final Class8453 field34721;
    
    public INBT empty() {
        return EndNBT.INSTANCE;
    }
    
    public Type<?> getType(final INBT class41) {
        switch (class41.getId()) {
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
    
    public Optional<Number> getNumberValue(final INBT class41) {
        return (class41 instanceof NumberNBT) ? Optional.of(((NumberNBT)class41).getAsNumber()) : Optional.empty();
    }
    
    public INBT createNumeric(final Number n) {
        return DoubleNBT.method277(n.doubleValue());
    }
    
    public INBT createByte(final byte b) {
        return ByteNBT.valueOf(b);
    }
    
    public INBT createShort(final short n) {
        return ShortNBT.method286(n);
    }
    
    public INBT createInt(final int n) {
        return IntNBT.valueOf(n);
    }
    
    public INBT createLong(final long n) {
        return LongNBT.method288(n);
    }
    
    public INBT createFloat(final float n) {
        return FloatNBT.method281(n);
    }
    
    public INBT createDouble(final double n) {
        return DoubleNBT.method277(n);
    }
    
    public INBT createBoolean(final boolean b) {
        return ByteNBT.method284(b);
    }
    
    public Optional<String> getStringValue(final INBT class41) {
        return (class41 instanceof StringNBT) ? Optional.of(class41.getString()) : Optional.empty();
    }
    
    public INBT createString(final String s) {
        return StringNBT.method290(s);
    }
    
    public INBT mergeInto(final INBT class41, final INBT e) {
        if (e instanceof EndNBT) {
            return class41;
        }
        if (class41 instanceof CompoundNBT) {
            if (e instanceof CompoundNBT) {
                final CompoundNBT class42 = new CompoundNBT();
                final CompoundNBT class43 = (CompoundNBT)class41;
                for (final String s : class43.keySet()) {
                    class42.put(s, class43.get(s));
                }
                final CompoundNBT class44 = (CompoundNBT)e;
                for (final String s2 : class44.keySet()) {
                    class42.put(s2, class44.get(s2));
                }
                return class42;
            }
            return class41;
        }
        else {
            if (class41 instanceof EndNBT) {
                throw new IllegalArgumentException("mergeInto called with a null input.");
            }
            if (!(class41 instanceof CollectionNBT)) {
                return class41;
            }
            final ListNBT class45 = new ListNBT();
            class45.addAll((Collection<? extends INBT>)class41);
            class45.add(e);
            return class45;
        }
    }
    
    public INBT mergeInto(final INBT class41, final INBT class42, final INBT class43) {
        CompoundNBT class45;
        if (!(class41 instanceof EndNBT)) {
            if (!(class41 instanceof CompoundNBT)) {
                return class41;
            }
            final CompoundNBT class44 = (CompoundNBT)class41;
            class45 = new CompoundNBT();
            class44.keySet().forEach(s -> class46.method295(s, class47.method313(s)));
        }
        else {
            class45 = new CompoundNBT();
        }
        class45.put(class42.getString(), class43);
        return class45;
    }
    
    public INBT merge(final INBT obj, final INBT obj2) {
        if (obj instanceof EndNBT) {
            return obj2;
        }
        if (obj2 instanceof EndNBT) {
            return obj;
        }
        if (obj instanceof CompoundNBT) {
            if (obj2 instanceof CompoundNBT) {
                final CompoundNBT class51 = (CompoundNBT)obj;
                final CompoundNBT class52 = (CompoundNBT)obj2;
                final CompoundNBT class53 = new CompoundNBT();
                class51.keySet().forEach(s -> class55.method295(s, class56.method313(s)));
                class52.keySet().forEach(s2 -> class57.method295(s2, class58.method313(s2)));
            }
        }
        if (obj instanceof CollectionNBT && obj2 instanceof CollectionNBT) {
            final ListNBT class54 = new ListNBT();
            class54.addAll((Collection<? extends INBT>)obj);
            class54.addAll((Collection<? extends INBT>)obj2);
            return class54;
        }
        throw new IllegalArgumentException("Could not merge " + obj + " and " + obj2);
    }
    
    public Optional<Map<INBT, INBT>> getMapValues(final INBT class41) {
        if (!(class41 instanceof CompoundNBT)) {
            return Optional.empty();
        }
        return Optional.of((Map<INBT, INBT>)((CompoundNBT)class41).keySet().stream().map(s -> Pair.of((Object)this.createString(s), (Object)class42.method313(s))).collect((Collector<? super Object, ?, T>)Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)));
    }
    
    public INBT createMap(final Map<INBT, INBT> map) {
        final CompoundNBT class51 = new CompoundNBT();
        for (final Map.Entry entry : map.entrySet()) {
            class51.put(((INBT)entry.getKey()).getString(), (INBT)entry.getValue());
        }
        return class51;
    }
    
    public Optional<Stream<INBT>> getStream(final INBT class41) {
        return (Optional<Stream<INBT>>)((class41 instanceof CollectionNBT) ? Optional.of(((CollectionNBT)class41).stream().map(o -> o)) : Optional.empty());
    }
    
    public Optional<ByteBuffer> getByteBuffer(final INBT class41) {
        return (class41 instanceof ByteArrayNBT) ? Optional.of(ByteBuffer.wrap(((ByteArrayNBT)class41).getByteArray())) : super.getByteBuffer((Object)class41);
    }
    
    public INBT createByteList(final ByteBuffer byteBuffer) {
        return new ByteArrayNBT(DataFixUtils.toArray(byteBuffer));
    }
    
    public Optional<IntStream> getIntStream(final INBT class41) {
        return (class41 instanceof IntArrayNBT) ? Optional.of(Arrays.stream(((IntArrayNBT)class41).getIntArray())) : super.getIntStream((Object)class41);
    }
    
    public INBT createIntList(final IntStream intStream) {
        return new IntArrayNBT(intStream.toArray());
    }
    
    public Optional<LongStream> getLongStream(final INBT class41) {
        return (class41 instanceof LongArrayNBT) ? Optional.of(Arrays.stream(((LongArrayNBT)class41).getAsLongArray())) : super.getLongStream((Object)class41);
    }
    
    public INBT createLongList(final LongStream longStream) {
        return new LongArrayNBT(longStream.toArray());
    }
    
    public INBT createList(final Stream<INBT> stream) {
        final PeekingIterator peekingIterator = Iterators.peekingIterator((Iterator)stream.iterator());
        if (!peekingIterator.hasNext()) {
            return new ListNBT();
        }
        final INBT class41 = (INBT)peekingIterator.peek();
        if (class41 instanceof ByteNBT) {
            return new ByteArrayNBT(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((ByteNBT)class41).getByte())));
        }
        if (class41 instanceof IntNBT) {
            return new IntArrayNBT(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((IntNBT)class41).getInt())));
        }
        if (!(class41 instanceof LongNBT)) {
            final ListNBT class42 = new ListNBT();
            while (peekingIterator.hasNext()) {
                final INBT e = (INBT)peekingIterator.next();
                if (e instanceof EndNBT) {
                    continue;
                }
                class42.add(e);
            }
            return class42;
        }
        return new LongArrayNBT(Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, class41 -> ((LongNBT)class41).getLong())));
    }
    
    public INBT remove(final INBT class41, final String s) {
        if (!(class41 instanceof CompoundNBT)) {
            return class41;
        }
        final CompoundNBT class42 = (CompoundNBT)class41;
        final CompoundNBT class43 = new CompoundNBT();
        class42.keySet().stream().filter(a -> !Objects.equals(a, b)).forEach(s2 -> class44.method295(s2, class45.method313(s2)));
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
