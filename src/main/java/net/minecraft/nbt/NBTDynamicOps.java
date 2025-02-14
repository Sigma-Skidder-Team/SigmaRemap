package net.minecraft.nbt;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import mapped.Class4675;
import mapped.Class8082;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NBTDynamicOps implements DynamicOps<INBT> {
   public static final NBTDynamicOps INSTANCE = new NBTDynamicOps();

   public INBT empty() {
      return EndNBT.INSTANCE;
   }

   public <U> U convertTo(DynamicOps<U> var1, INBT var2) {
      switch (var2.getID()) {
         case 0:
            return (U)var1.empty();
         case 1:
            return (U)var1.createByte(((NumberNBT)var2).getByte());
         case 2:
            return (U)var1.createShort(((NumberNBT)var2).getShort());
         case 3:
            return (U)var1.createInt(((NumberNBT)var2).getInt());
         case 4:
            return (U)var1.createLong(((NumberNBT)var2).getLong());
         case 5:
            return (U)var1.createFloat(((NumberNBT)var2).getFloat());
         case 6:
            return (U)var1.createDouble(((NumberNBT)var2).getDouble());
         case 7:
            return (U)var1.createByteList(ByteBuffer.wrap(((ByteArrayNBT)var2).getByteArray()));
         case 8:
            return (U)var1.createString(var2.getString());
         case 9:
            return (U)this.convertList(var1, var2);
         case 10:
            return (U)this.convertMap(var1, var2);
         case 11:
            return (U)var1.createIntList(Arrays.stream(((IntArrayNBT)var2).getIntArray()));
         case 12:
            return (U)var1.createLongList(Arrays.stream(((LongArrayNBT)var2).getAsLongArray()));
         default:
            throw new IllegalStateException("Unknown tag type: " + var2);
      }
   }

   public DataResult<Number> getNumberValue(INBT var1) {
      return !(var1 instanceof NumberNBT) ? DataResult.error("Not a number") : DataResult.success(((NumberNBT)var1).getAsNumber());
   }

   public INBT createNumeric(Number var1) {
      return DoubleNBT.valueOf(var1.doubleValue());
   }

   public INBT createByte(byte var1) {
      return ByteNBT.valueOf(var1);
   }

   public INBT createShort(short var1) {
      return ShortNBT.valueOf(var1);
   }

   public INBT createInt(int var1) {
      return IntNBT.valueOf(var1);
   }

   public INBT createLong(long var1) {
      return LongNBT.valueOf(var1);
   }

   public INBT createFloat(float var1) {
      return FloatNBT.valueOf(var1);
   }

   public INBT createDouble(double var1) {
      return DoubleNBT.valueOf(var1);
   }

   public INBT createBoolean(boolean var1) {
      return ByteNBT.valueOf(var1);
   }

   public DataResult<String> getStringValue(INBT var1) {
      return !(var1 instanceof StringNBT) ? DataResult.error("Not a string") : DataResult.success(var1.getString());
   }

   public INBT createString(String var1) {
      return StringNBT.valueOf(var1);
   }

   private static CollectionNBT<?> method27681(byte var0, byte var1) {
      if (!method27682(var0, var1, (byte)4)) {
         if (!method27682(var0, var1, (byte)1)) {
            return (CollectionNBT<?>)(!method27682(var0, var1, (byte)3) ? new ListNBT() : new IntArrayNBT(new int[0]));
         } else {
            return new ByteArrayNBT(new byte[0]);
         }
      } else {
         return new LongArrayNBT(new long[0]);
      }
   }

   private static boolean method27682(byte var0, byte var1, byte var2) {
      return var0 == var2 && (var1 == var2 || var1 == 0);
   }

   private static <T extends INBT> void method27683(CollectionNBT<T> var0, INBT var1, INBT var2) {
      if (var1 instanceof CollectionNBT) {
         CollectionNBT var5 = (CollectionNBT)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var0.add((T)var2);
   }

   private static <T extends INBT> void method27684(CollectionNBT<T> var0, INBT var1, List<INBT> var2) {
      if (var1 instanceof CollectionNBT) {
         CollectionNBT var5 = (CollectionNBT)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var2.forEach(var1x -> var0.add((T)var1x));
   }

   public DataResult<INBT> mergeToList(INBT var1, INBT var2) {
      if (!(var1 instanceof CollectionNBT) && !(var1 instanceof EndNBT)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         CollectionNBT var5 = method27681(!(var1 instanceof CollectionNBT) ? 0 : ((CollectionNBT)var1).getTagType(), var2.getID());
         method27683(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<INBT> mergeToList(INBT var1, List<INBT> var2) {
      if (!(var1 instanceof CollectionNBT) && !(var1 instanceof EndNBT)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         CollectionNBT var5 = method27681(
            !(var1 instanceof CollectionNBT) ? 0 : ((CollectionNBT)var1).getTagType(), var2.stream().findFirst().<Byte>map(INBT::getID).orElse((byte)0)
         );
         method27684(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<INBT> mergeToMap(INBT var1, INBT var2, INBT var3) {
      if (!(var1 instanceof CompoundNBT) && !(var1 instanceof EndNBT)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else if (var2 instanceof StringNBT) {
         CompoundNBT var6 = new CompoundNBT();
         if (var1 instanceof CompoundNBT) {
            CompoundNBT var7 = (CompoundNBT)var1;
            var7.keySet().forEach(var2x -> var6.put(var2x, var7.get(var2x)));
         }

         var6.put(var2.getString(), var3);
         return DataResult.success(var6);
      } else {
         return DataResult.error("key is not a string: " + var2, var1);
      }
   }

   public DataResult<INBT> mergeToMap(INBT var1, MapLike<INBT> var2) {
      if (!(var1 instanceof CompoundNBT) && !(var1 instanceof EndNBT)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else {
         CompoundNBT var5 = new CompoundNBT();
         if (var1 instanceof CompoundNBT) {
            CompoundNBT var6 = (CompoundNBT)var1;
            var6.keySet().forEach(var2x -> var5.put(var2x, var6.get(var2x)));
         }

         ArrayList var7 = Lists.newArrayList();
         var2.entries().forEach(var2x -> {
            INBT var5x = (INBT)var2x.getFirst();
            if (var5x instanceof StringNBT) {
               var5.put(var5x.getString(), (INBT)var2x.getSecond());
            } else {
               var7.add(var5x);
            }
         });
         return var7.isEmpty() ? DataResult.success(var5) : DataResult.error("some keys are not strings: " + var7, var5);
      }
   }

   public DataResult<Stream<Pair<INBT, INBT>>> getMapValues(INBT var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(var4.keySet().stream().map(var2 -> Pair.of(this.createString(var2), var4.get(var2))));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<Consumer<BiConsumer<INBT, INBT>>> getMapEntries(INBT var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(var2 -> var4.keySet().forEach(var3 -> var2.accept(this.createString(var3), var4.get(var3))));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<MapLike<INBT>> getMap(INBT var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(new Class8082(this, var4));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public INBT createMap(Stream<Pair<INBT, INBT>> var1) {
      CompoundNBT var4 = new CompoundNBT();
      var1.forEach(var1x -> var4.put(((INBT)var1x.getFirst()).getString(), (INBT)var1x.getSecond()));
      return var4;
   }

   public DataResult<Stream<INBT>> getStream(INBT var1) {
      return !(var1 instanceof CollectionNBT) ? DataResult.error("Not a list") : DataResult.success(((CollectionNBT)var1).stream().map(var0 -> var0));
   }

   public DataResult<Consumer<Consumer<INBT>>> getList(INBT var1) {
      if (!(var1 instanceof CollectionNBT)) {
         return DataResult.error("Not a list: " + var1);
      } else {
         CollectionNBT var4 = (CollectionNBT)var1;
         return DataResult.success(var4::forEach);
      }
   }

   public DataResult<ByteBuffer> getByteBuffer(INBT var1) {
      return !(var1 instanceof ByteArrayNBT) ?  DynamicOps.super.getByteBuffer(var1) : DataResult.success(ByteBuffer.wrap(((ByteArrayNBT)var1).getByteArray()));
   }

   public INBT createByteList(ByteBuffer var1) {
      return new ByteArrayNBT(DataFixUtils.toArray(var1));
   }

   public DataResult<IntStream> getIntStream(INBT var1) {
      return !(var1 instanceof IntArrayNBT) ?  DynamicOps.super.getIntStream(var1) : DataResult.success(Arrays.stream(((IntArrayNBT)var1).getIntArray()));
   }

   public INBT createIntList(IntStream var1) {
      return new IntArrayNBT(var1.toArray());
   }

   public DataResult<LongStream> getLongStream(INBT var1) {
      return !(var1 instanceof LongArrayNBT) ?  DynamicOps.super.getLongStream(var1) : DataResult.success(Arrays.stream(((LongArrayNBT)var1).getAsLongArray()));
   }

   public INBT createLongList(LongStream var1) {
      return new LongArrayNBT(var1.toArray());
   }

   public INBT createList(Stream<INBT> var1) {
      PeekingIterator<INBT> var4 = Iterators.peekingIterator(var1.iterator());
      if (var4.hasNext()) {
         INBT var5 = var4.peek();
         if (!(var5 instanceof ByteNBT)) {
            if (!(var5 instanceof IntNBT)) {
               if (!(var5 instanceof LongNBT)) {
                  ListNBT var10 = new ListNBT();

                  while (var4.hasNext()) {
                     INBT var7 = var4.next();
                     if (!(var7 instanceof EndNBT)) {
                        var10.add(var7);
                     }
                  }

                  return var10;
               } else {
                  List<Long> var9 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((LongNBT)var0).getLong()));
                  return new LongArrayNBT(var9);
               }
            } else {
               List<Integer> var8 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((IntNBT)var0).getInt()));
               return new IntArrayNBT(var8);
            }
         } else {
            List<Byte> var6 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((ByteNBT)var0).getByte()));
            return new ByteArrayNBT(var6);
         }
      } else {
         return new ListNBT();
      }
   }

   public INBT remove(INBT var1, String var2) {
      if (!(var1 instanceof CompoundNBT)) {
         return var1;
      } else {
         CompoundNBT var5 = (CompoundNBT)var1;
         CompoundNBT var6 = new CompoundNBT();
         var5.keySet().stream().filter(var1x -> !Objects.equals(var1x, var2)).forEach(var2x -> var6.put(var2x, var5.get(var2x)));
         return var6;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<INBT> mapBuilder() {
      return new Class4675(this);
   }
}
