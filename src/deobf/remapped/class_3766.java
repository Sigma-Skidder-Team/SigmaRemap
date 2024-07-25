package remapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class class_3766<T> implements DynamicOps<T> {
   public final DynamicOps<T> field_18419;

   public class_3766(DynamicOps<T> var1) {
      this.field_18419 = var1;
   }

   public T empty() {
      return (T)this.field_18419.empty();
   }

   public <U> U convertTo(DynamicOps<U> var1, T var2) {
      return (U)this.field_18419.convertTo(var1, var2);
   }

   public DataResult<Number> getNumberValue(T var1) {
      return this.field_18419.getNumberValue(var1);
   }

   public T createNumeric(Number var1) {
      return (T)this.field_18419.createNumeric(var1);
   }

   public T createByte(byte var1) {
      return (T)this.field_18419.createByte(var1);
   }

   public T createShort(short var1) {
      return (T)this.field_18419.createShort(var1);
   }

   public T createInt(int var1) {
      return (T)this.field_18419.createInt(var1);
   }

   public T createLong(long var1) {
      return (T)this.field_18419.createLong(var1);
   }

   public T createFloat(float var1) {
      return (T)this.field_18419.createFloat(var1);
   }

   public T createDouble(double var1) {
      return (T)this.field_18419.createDouble(var1);
   }

   public DataResult<Boolean> getBooleanValue(T var1) {
      return this.field_18419.getBooleanValue(var1);
   }

   public T createBoolean(boolean var1) {
      return (T)this.field_18419.createBoolean(var1);
   }

   public DataResult<String> getStringValue(T var1) {
      return this.field_18419.getStringValue(var1);
   }

   public T createString(String var1) {
      return (T)this.field_18419.createString(var1);
   }

   public DataResult<T> mergeToList(T var1, T var2) {
      return this.field_18419.mergeToList(var1, var2);
   }

   public DataResult<T> mergeToList(T var1, List<T> var2) {
      return this.field_18419.mergeToList(var1, var2);
   }

   public DataResult<T> mergeToMap(T var1, T var2, T var3) {
      return this.field_18419.mergeToMap(var1, var2, var3);
   }

   public DataResult<T> mergeToMap(T var1, MapLike<T> var2) {
      return this.field_18419.mergeToMap(var1, var2);
   }

   public DataResult<Stream<Pair<T, T>>> getMapValues(T var1) {
      return this.field_18419.getMapValues(var1);
   }

   public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T var1) {
      return this.field_18419.getMapEntries(var1);
   }

   public T createMap(Stream<Pair<T, T>> var1) {
      return (T)this.field_18419.createMap(var1);
   }

   public DataResult<MapLike<T>> getMap(T var1) {
      return this.field_18419.getMap(var1);
   }

   public DataResult<Stream<T>> getStream(T var1) {
      return this.field_18419.getStream(var1);
   }

   public DataResult<Consumer<Consumer<T>>> getList(T var1) {
      return this.field_18419.getList(var1);
   }

   public T createList(Stream<T> var1) {
      return (T)this.field_18419.createList(var1);
   }

   public DataResult<ByteBuffer> getByteBuffer(T var1) {
      return this.field_18419.getByteBuffer(var1);
   }

   public T createByteList(ByteBuffer var1) {
      return (T)this.field_18419.createByteList(var1);
   }

   public DataResult<IntStream> getIntStream(T var1) {
      return this.field_18419.getIntStream(var1);
   }

   public T createIntList(IntStream var1) {
      return (T)this.field_18419.createIntList(var1);
   }

   public DataResult<LongStream> getLongStream(T var1) {
      return this.field_18419.getLongStream(var1);
   }

   public T createLongList(LongStream var1) {
      return (T)this.field_18419.createLongList(var1);
   }

   public T remove(T var1, String var2) {
      return (T)this.field_18419.remove(var1, var2);
   }

   public boolean compressMaps() {
      return this.field_18419.compressMaps();
   }

   public ListBuilder<T> listBuilder() {
      return this.field_18419.listBuilder();
   }

   public RecordBuilder<T> mapBuilder() {
      return this.field_18419.mapBuilder();
   }
}
