package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;

public final class class_8589 extends MapCodec<class_1150<E>> {
   public class_8589(Collection var1, Collection var2, MutableObject var3) {
      this.field_44010 = var1;
      this.field_44009 = var2;
      this.field_44012 = var3;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.field_44010
         .stream()
         .<class_4639>flatMap(var0 -> Util.method_44689(var0.method_27594().map(var1x -> class_8669.field_44431.method_39797((class_6044<?>)var0))))
         .<T>map(var1x -> (T)var1.createString(var1x.toString()));
   }

   public <T> DataResult<class_1150<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      MutableObject var5 = new MutableObject(DataResult.success(ImmutableList.builder()));
      var2.entries().forEach(var3 -> {
         DataResult var6x = class_8669.field_44431.parse(var1, var3.getFirst());
         DataResult var7 = var6x.flatMap(var3x -> this.method_39501(var3x, var1, var3.getSecond()));
         var5.setValue(((DataResult)var5.getValue()).apply2(Builder::add, var7));
      });
      ImmutableList var6 = ((DataResult)var5.getValue())
         .resultOrPartial(class_1150.method_5125()::error)
         .<ImmutableList>map(Builder::build)
         .orElseGet(ImmutableList::of);
      return DataResult.success(new class_1150(this.field_44010, this.field_44009, var6, this.field_44012::getValue));
   }

   private <T, U> DataResult<class_9739<U>> method_39501(class_6044<U> var1, DynamicOps<T> var2, T var3) {
      return var1.method_27594()
         .<DataResult>map(DataResult::success)
         .orElseGet(() -> DataResult.error("No codec for memory: " + var1))
         .flatMap(var2x -> var2x.parse(var2, var3))
         .map(var1x -> new class_9739(var1, Optional.<class_3909>of(var1x), null));
   }

   public <T> RecordBuilder<T> encode(class_1150<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      class_1150.method_5143(var1).forEach(var2x -> var2x.method_44972(var2, var3));
      return var3;
   }
}
