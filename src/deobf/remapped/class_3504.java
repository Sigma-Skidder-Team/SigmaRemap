package remapped;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
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

public class class_3504 implements DynamicOps<class_8406> {
   public static final class_3504 field_17178 = new class_3504();

   public class_8406 empty() {
      return class_8944.field_45856;
   }

   public <U> U convertTo(DynamicOps<U> var1, class_8406 var2) {
      switch (var2.method_38706()) {
         case 0:
            return (U)var1.empty();
         case 1:
            return (U)var1.createByte(((class_5841)var2).method_26641());
         case 2:
            return (U)var1.createShort(((class_5841)var2).method_26640());
         case 3:
            return (U)var1.createInt(((class_5841)var2).method_26636());
         case 4:
            return (U)var1.createLong(((class_5841)var2).method_26635());
         case 5:
            return (U)var1.createFloat(((class_5841)var2).method_26639());
         case 6:
            return (U)var1.createDouble(((class_5841)var2).method_26642());
         case 7:
            return (U)var1.createByteList(ByteBuffer.wrap(((class_5064)var2).method_23327()));
         case 8:
            return (U)var1.createString(var2.method_38710());
         case 9:
            return (U)this.convertList(var1, var2);
         case 10:
            return (U)this.convertMap(var1, var2);
         case 11:
            return (U)var1.createIntList(Arrays.stream(((class_6222)var2).method_28446()));
         case 12:
            return (U)var1.createLongList(Arrays.stream(((class_1129)var2).method_4959()));
         default:
            throw new IllegalStateException("Unknown tag type: " + var2);
      }
   }

   public DataResult<Number> getNumberValue(class_8406 var1) {
      return !(var1 instanceof class_5841) ? DataResult.error("Not a number") : DataResult.success(((class_5841)var1).method_26638());
   }

   public class_8406 createNumeric(Number var1) {
      return class_9708.method_44846(var1.doubleValue());
   }

   public class_8406 createByte(byte var1) {
      return class_5284.method_24120(var1);
   }

   public class_8406 createShort(short var1) {
      return class_7745.method_35070(var1);
   }

   public class_8406 createInt(int var1) {
      return class_9413.method_43597(var1);
   }

   public class_8406 createLong(long var1) {
      return class_3388.method_15658(var1);
   }

   public class_8406 createFloat(float var1) {
      return class_5718.method_25854(var1);
   }

   public class_8406 createDouble(double var1) {
      return class_9708.method_44846(var1);
   }

   public class_8406 createBoolean(boolean var1) {
      return class_5284.method_24121(var1);
   }

   public DataResult<String> getStringValue(class_8406 var1) {
      return !(var1 instanceof class_473) ? DataResult.error("Not a string") : DataResult.success(var1.method_38710());
   }

   public class_8406 createString(String var1) {
      return class_473.method_2261(var1);
   }

   private static class_6850<?> method_16114(byte var0, byte var1) {
      if (!method_16116(var0, var1, (byte)4)) {
         if (!method_16116(var0, var1, (byte)1)) {
            return (class_6850<?>)(!method_16116(var0, var1, (byte)3) ? new class_3416() : new class_6222(new int[0]));
         } else {
            return new class_5064(new byte[0]);
         }
      } else {
         return new class_1129(new long[0]);
      }
   }

   private static boolean method_16116(byte var0, byte var1, byte var2) {
      return var0 == var2 && (var1 == var2 || var1 == 0);
   }

   private static <T extends class_8406> void method_16113(class_6850<T> var0, class_8406 var1, class_8406 var2) {
      if (var1 instanceof class_6850) {
         class_6850 var5 = (class_6850)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var0.add((T)var2);
   }

   private static <T extends class_8406> void method_16115(class_6850<T> var0, class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof class_6850) {
         class_6850 var5 = (class_6850)var1;
         var5.forEach(var1x -> var0.add((T)var1x));
      }

      var2.forEach(var1x -> var0.add((T)var1x));
   }

   public DataResult<class_8406> mergeToList(class_8406 var1, class_8406 var2) {
      if (!(var1 instanceof class_6850) && !(var1 instanceof class_8944)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         class_6850 var5 = method_16114(!(var1 instanceof class_6850) ? 0 : ((class_6850)var1).method_31428(), var2.method_38706());
         method_16113(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<class_8406> mergeToList(class_8406 var1, List<class_8406> var2) {
      if (!(var1 instanceof class_6850) && !(var1 instanceof class_8944)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         class_6850 var5 = method_16114(
            !(var1 instanceof class_6850) ? 0 : ((class_6850)var1).method_31428(),
            var2.stream().findFirst().<Byte>map(class_8406::method_38706).orElse((byte)0)
         );
         method_16115(var5, var1, var2);
         return DataResult.success(var5);
      }
   }

   public DataResult<class_8406> mergeToMap(class_8406 var1, class_8406 var2, class_8406 var3) {
      if (!(var1 instanceof class_5734) && !(var1 instanceof class_8944)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else if (var2 instanceof class_473) {
         class_5734 var6 = new class_5734();
         if (var1 instanceof class_5734) {
            class_5734 var7 = (class_5734)var1;
            var7.method_25952().forEach(var2x -> var6.method_25946(var2x, var7.method_25929(var2x)));
         }

         var6.method_25946(var2.method_38710(), var3);
         return DataResult.success(var6);
      } else {
         return DataResult.error("key is not a string: " + var2, var1);
      }
   }

   public DataResult<class_8406> mergeToMap(class_8406 var1, MapLike<class_8406> var2) {
      if (!(var1 instanceof class_5734) && !(var1 instanceof class_8944)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else {
         class_5734 var5 = new class_5734();
         if (var1 instanceof class_5734) {
            class_5734 var6 = (class_5734)var1;
            var6.method_25952().forEach(var2x -> var5.method_25946(var2x, var6.method_25929(var2x)));
         }

         ArrayList var7 = Lists.newArrayList();
         var2.entries().forEach(var2x -> {
            class_8406 var5x = (class_8406)var2x.getFirst();
            if (var5x instanceof class_473) {
               var5.method_25946(var5x.method_38710(), (class_8406)var2x.getSecond());
            } else {
               var7.add(var5x);
            }
         });
         return var7.isEmpty() ? DataResult.success(var5) : DataResult.error("some keys are not strings: " + var7, var5);
      }
   }

   public DataResult<Stream<Pair<class_8406, class_8406>>> getMapValues(class_8406 var1) {
      if (var1 instanceof class_5734) {
         class_5734 var4 = (class_5734)var1;
         return DataResult.success(var4.method_25952().stream().<Pair>map(var2 -> Pair.of(this.createString(var2), var4.method_25929(var2))));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<Consumer<BiConsumer<class_8406, class_8406>>> getMapEntries(class_8406 var1) {
      if (var1 instanceof class_5734) {
         class_5734 var4 = (class_5734)var1;
         return DataResult.success(
            (Consumer<BiConsumer>)var2 -> var4.method_25952().forEach(var3 -> var2.accept(this.createString(var3), var4.method_25929(var3)))
         );
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public DataResult<MapLike<class_8406>> getMap(class_8406 var1) {
      if (var1 instanceof class_5734) {
         class_5734 var4 = (class_5734)var1;
         return DataResult.success(new class_3562(this, var4));
      } else {
         return DataResult.error("Not a map: " + var1);
      }
   }

   public class_8406 createMap(Stream<Pair<class_8406, class_8406>> var1) {
      class_5734 var4 = new class_5734();
      var1.forEach(var1x -> var4.method_25946(((class_8406)var1x.getFirst()).method_38710(), (class_8406)var1x.getSecond()));
      return var4;
   }

   public DataResult<Stream<class_8406>> getStream(class_8406 var1) {
      return !(var1 instanceof class_6850) ? DataResult.error("Not a list") : DataResult.success(((class_6850)var1).stream().map(var0 -> var0));
   }

   public DataResult<Consumer<Consumer<class_8406>>> getList(class_8406 var1) {
      if (!(var1 instanceof class_6850)) {
         return DataResult.error("Not a list: " + var1);
      } else {
         class_6850 var4 = (class_6850)var1;
         return DataResult.success(var4::forEach);
      }
   }

   public DataResult<ByteBuffer> getByteBuffer(class_8406 var1) {
      return !(var1 instanceof class_5064) ? super.getByteBuffer(var1) : DataResult.success(ByteBuffer.wrap(((class_5064)var1).method_23327()));
   }

   public class_8406 createByteList(ByteBuffer var1) {
      return new class_5064(DataFixUtils.toArray(var1));
   }

   public DataResult<IntStream> getIntStream(class_8406 var1) {
      return !(var1 instanceof class_6222) ? super.getIntStream(var1) : DataResult.success(Arrays.stream(((class_6222)var1).method_28446()));
   }

   public class_8406 createIntList(IntStream var1) {
      return new class_6222(var1.toArray());
   }

   public DataResult<LongStream> getLongStream(class_8406 var1) {
      return !(var1 instanceof class_1129) ? super.getLongStream(var1) : DataResult.success(Arrays.stream(((class_1129)var1).method_4959()));
   }

   public class_8406 createLongList(LongStream var1) {
      return new class_1129(var1.toArray());
   }

   public class_8406 createList(Stream<class_8406> var1) {
      PeekingIterator var4 = Iterators.peekingIterator(var1.iterator());
      if (var4.hasNext()) {
         class_8406 var5 = (class_8406)var4.peek();
         if (!(var5 instanceof class_5284)) {
            if (!(var5 instanceof class_9413)) {
               if (!(var5 instanceof class_3388)) {
                  class_3416 var10 = new class_3416();

                  while (var4.hasNext()) {
                     class_8406 var7 = (class_8406)var4.next();
                     if (!(var7 instanceof class_8944)) {
                        var10.add(var7);
                     }
                  }

                  return var10;
               } else {
                  ArrayList var9 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((class_3388)var0).method_26635()));
                  return new class_1129(var9);
               }
            } else {
               ArrayList var8 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((class_9413)var0).method_26636()));
               return new class_6222(var8);
            }
         } else {
            ArrayList var6 = Lists.newArrayList(Iterators.transform(var4, var0 -> ((class_5284)var0).method_26641()));
            return new class_5064(var6);
         }
      } else {
         return new class_3416();
      }
   }

   public class_8406 remove(class_8406 var1, String var2) {
      if (!(var1 instanceof class_5734)) {
         return var1;
      } else {
         class_5734 var5 = (class_5734)var1;
         class_5734 var6 = new class_5734();
         var5.method_25952().stream().filter(var1x -> !Objects.equals(var1x, var2)).forEach(var2x -> var6.method_25946(var2x, var5.method_25929(var2x)));
         return var6;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<class_8406> mapBuilder() {
      return new class_188(this);
   }
}
