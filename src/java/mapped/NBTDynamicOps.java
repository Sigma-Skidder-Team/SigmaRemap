package mapped;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import net.minecraft.nbt.CompoundNBT;

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

public class NBTDynamicOps implements DynamicOps<Class30> {
   public static final NBTDynamicOps INSTANCE = new NBTDynamicOps();

   public Class30 empty() {
      return Class38.field78;
   }

   public <U> U convertTo(DynamicOps<U> var1, Class30 var2) {
      switch (var2.method74()) {
         case 0:
            return (U)var1.empty();
         case 1:
            return (U)var1.createByte(((Class31)var2).method86());
         case 2:
            return (U)var1.createShort(((Class31)var2).method85());
         case 3:
            return (U)var1.createInt(((Class31)var2).method84());
         case 4:
            return (U)var1.createLong(((Class31)var2).method83());
         case 5:
            return (U)var1.createFloat(((Class31)var2).method88());
         case 6:
            return (U)var1.createDouble(((Class31)var2).method87());
         case 7:
            return (U)var1.createByteList(ByteBuffer.wrap(((Class29)var2).method80()));
         case 8:
            return (U)var1.createString(var2.method81());
         case 9:
            return (U)this.convertList(var1, var2);
         case 10:
            return (U)this.convertMap(var1, var2);
         case 11:
            return (U)var1.createIntList(Arrays.stream(((Class28)var2).method77()));
         case 12:
            return (U)var1.createLongList(Arrays.stream(((Class42)var2).method162()));
         default:
            throw new IllegalStateException("Unknown tag type: " + var2);
      }
   }

   public DataResult<Number> getNumberValue(Class30 var1) {
      return !(var1 instanceof Class31) ? DataResult.error("Not a number") : DataResult.success(((Class31)var1).method89());
   }

   public Class30 createNumeric(Number var1) {
      return Class34.method93(var1.doubleValue());
   }

   public Class30 createByte(byte var1) {
      return Class33.method91(var1);
   }

   public Class30 createShort(short var1) {
      return Class37.method96(var1);
   }

   public Class30 createInt(int var1) {
      return Class36.method95(var1);
   }

   public Class30 createLong(long var1) {
      return Class35.method94(var1);
   }

   public Class30 createFloat(float var1) {
      return Class32.method90(var1);
   }

   public Class30 createDouble(double var1) {
      return Class34.method93(var1);
   }

   public Class30 createBoolean(boolean var1) {
      return Class33.method92(var1);
   }

   public DataResult<String> getStringValue(Class30 var1) {
      return !(var1 instanceof StringNBT) ? DataResult.error("Not a string") : DataResult.success(var1.method81());
   }

   public Class30 createString(String var1) {
      return StringNBT.valueOf(var1);
   }

   private static Class27<?> method27681(byte var0, byte var1) {
      if (!method27682(var0, var1, (byte)4)) {
         if (!method27682(var0, var1, (byte)1)) {
            return (Class27<?>)(!method27682(var0, var1, (byte)3) ? new ListNBT() : new Class28(new int[0]));
         } else {
            return new Class29(new byte[0]);
         }
      } else {
         return new Class42(new long[0]);
      }
   }

   private static boolean method27682(byte var0, byte var1, byte var2) {
      return var0 == var2 && (var1 == var2 || var1 == 0);
   }

   private static <T extends Class30> void method27683(Class27<T> var0, Class30 var1, Class30 var2) {
      if (var1 instanceof Class27) {
         Class27 var5 = (Class27)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var0.add((T)var2);
   }

   private static <T extends Class30> void method27684(Class27<T> var0, Class30 var1, List<Class30> var2) {
      if (var1 instanceof Class27) {
         Class27 var5 = (Class27)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var2.forEach(var1x -> var0.add((T)var1x));
   }

   public DataResult<Class30> mergeToList(Class30 var1, Class30 var2) {
      if (!(var1 instanceof Class27) && !(var1 instanceof Class38)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         Class27 var5 = method27681(!(var1 instanceof Class27) ? 0 : ((Class27)var1).method72(), var2.method74());
         method27683(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<Class30> mergeToList(Class30 var1, List<Class30> var2) {
      if (!(var1 instanceof Class27) && !(var1 instanceof Class38)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         Class27 var5 = method27681(
            !(var1 instanceof Class27) ? 0 : ((Class27)var1).method72(), var2.stream().findFirst().<Byte>map(Class30::method74).orElse((byte)0)
         );
         method27684(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<Class30> mergeToMap(Class30 var1, Class30 var2, Class30 var3) {
      if (!(var1 instanceof CompoundNBT) && !(var1 instanceof Class38)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else if (var2 instanceof StringNBT) {
         CompoundNBT var6 = new CompoundNBT();
         if (var1 instanceof CompoundNBT) {
            CompoundNBT var7 = (CompoundNBT)var1;
            var7.method97().forEach(var2x -> var6.put(var2x, var7.method116(var2x)));
         }

         var6.put(var2.method81(), var3);
         return DataResult.success(var6);
      } else {
         return DataResult.error("key is not a string: " + var2, var1);
      }
   }

   public DataResult<Class30> mergeToMap(Class30 var1, MapLike<Class30> var2) {
      if (!(var1 instanceof CompoundNBT) && !(var1 instanceof Class38)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else {
         CompoundNBT var5 = new CompoundNBT();
         if (var1 instanceof CompoundNBT) {
            CompoundNBT var6 = (CompoundNBT)var1;
            var6.method97().forEach(var2x -> var5.put(var2x, var6.method116(var2x)));
         }

         ArrayList var7 = Lists.newArrayList();
         var2.entries().forEach(var2x -> {
            Class30 var5x = (Class30)var2x.getFirst();
            if (var5x instanceof StringNBT) {
               var5.put(var5x.method81(), (Class30)var2x.getSecond());
            } else {
               var7.add(var5x);
            }
         });
         return var7.isEmpty() ? DataResult.success(var5) : DataResult.error("some keys are not strings: " + var7, var5);
      }
   }

   public DataResult<Stream<Pair<Class30, Class30>>> getMapValues(Class30 var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(var4.method97().stream().map(var2 -> Pair.of(this.createString(var2), var4.method116(var2))));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<Consumer<BiConsumer<Class30, Class30>>> getMapEntries(Class30 var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(var2 -> var4.method97().forEach(var3 -> var2.accept(this.createString(var3), var4.method116(var3))));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<MapLike<Class30>> getMap(Class30 var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         return DataResult.success(new Class8082(this, var4));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public Class30 createMap(Stream<Pair<Class30, Class30>> var1) {
      CompoundNBT var4 = new CompoundNBT();
      var1.forEach(var1x -> var4.put(((Class30)var1x.getFirst()).method81(), (Class30)var1x.getSecond()));
      return var4;
   }

   public DataResult<Stream<Class30>> getStream(Class30 var1) {
      return !(var1 instanceof Class27) ? DataResult.error("Not a list") : DataResult.success(((Class27)var1).stream().map(var0 -> var0));
   }

   public DataResult<Consumer<Consumer<Class30>>> getList(Class30 var1) {
      if (!(var1 instanceof Class27)) {
         return DataResult.error("Not a list: " + var1);
      } else {
         Class27 var4 = (Class27)var1;
         return DataResult.success(var4::forEach);
      }
   }

   public DataResult<ByteBuffer> getByteBuffer(Class30 var1) {
      return !(var1 instanceof Class29) ?  DynamicOps.super.getByteBuffer(var1) : DataResult.success(ByteBuffer.wrap(((Class29)var1).method80()));
   }

   public Class30 createByteList(ByteBuffer var1) {
      return new Class29(DataFixUtils.toArray(var1));
   }

   public DataResult<IntStream> getIntStream(Class30 var1) {
      return !(var1 instanceof Class28) ?  DynamicOps.super.getIntStream(var1) : DataResult.success(Arrays.stream(((Class28)var1).method77()));
   }

   public Class30 createIntList(IntStream var1) {
      return new Class28(var1.toArray());
   }

   public DataResult<LongStream> getLongStream(Class30 var1) {
      return !(var1 instanceof Class42) ?  DynamicOps.super.getLongStream(var1) : DataResult.success(Arrays.stream(((Class42)var1).method162()));
   }

   public Class30 createLongList(LongStream var1) {
      return new Class42(var1.toArray());
   }

   public Class30 createList(Stream<Class30> var1) {
      PeekingIterator<Class30> var4 = Iterators.peekingIterator(var1.iterator());
      if (var4.hasNext()) {
         Class30 var5 = var4.peek();
         if (!(var5 instanceof Class33)) {
            if (!(var5 instanceof Class36)) {
               if (!(var5 instanceof Class35)) {
                  ListNBT var10 = new ListNBT();

                  while (var4.hasNext()) {
                     Class30 var7 = var4.next();
                     if (!(var7 instanceof Class38)) {
                        var10.add(var7);
                     }
                  }

                  return var10;
               } else {
                  List<Long> var9 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((Class35)var0).method83()));
                  return new Class42(var9);
               }
            } else {
               List<Integer> var8 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((Class36)var0).method84()));
               return new Class28(var8);
            }
         } else {
            List<Byte> var6 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((Class33)var0).method86()));
            return new Class29(var6);
         }
      } else {
         return new ListNBT();
      }
   }

   public Class30 remove(Class30 var1, String var2) {
      if (!(var1 instanceof CompoundNBT)) {
         return var1;
      } else {
         CompoundNBT var5 = (CompoundNBT)var1;
         CompoundNBT var6 = new CompoundNBT();
         var5.method97().stream().filter(var1x -> !Objects.equals(var1x, var2)).forEach(var2x -> var6.put(var2x, var5.method116(var2x)));
         return var6;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<Class30> mapBuilder() {
      return new Class4675(this);
   }
}
