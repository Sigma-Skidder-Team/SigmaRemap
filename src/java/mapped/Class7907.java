package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class Class7907<DC extends Class4716> implements Class7908<Class7907<?>> {
   public static final Codec<Class7907<?>> field33878 = Registry.field16118.dispatch("type", var0 -> var0.field33879, Class6272::method19245);
   private final Class6272<DC> field33879;
   private final DC field33880;

   public Class7907(Class6272<DC> var1, DC var2) {
      this.field33879 = var1;
      this.field33880 = (DC)var2;
   }

   public Stream<BlockPos> method26507(Class9010 var1, Random var2, BlockPos var3) {
      return this.field33879.method19240(var1, var2, this.field33880, var3);
   }

   @Override
   public String toString() {
      return String.format("[%s %s]", Registry.field16118.method9181(this.field33879), this.field33880);
   }

   public Class7907<?> method26510(Class7907<?> var1) {
      return new Class7907<Class4720>(Class6272.field27779, new Class4720(var1, this));
   }

   public DC method26509() {
      return this.field33880;
   }
}
