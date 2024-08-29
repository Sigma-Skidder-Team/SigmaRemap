package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7909<FC extends Class4698, F extends Class2898<FC>> implements Class7908<Class7909<?, ?>> {
   private static String[] field33881;
   public static final Codec<Class7909<?, ?>> field33882 = Registry.field16112.dispatch(var0 -> var0.field33886, Class2898::method11215);
   public static final Codec<Supplier<Class7909<?, ?>>> field33883 = RegistryKeyCodec.create(Registry.field16102, field33882);
   public static final Codec<List<Supplier<Class7909<?, ?>>>> field33884 = RegistryKeyCodec.<Class7909<?, ?>>method33672(Registry.field16102, field33882);
   public static final Logger field33885 = LogManager.getLogger();
   public final F field33886;
   public final FC field33887;

   public Class7909(F var1, FC var2) {
      this.field33886 = (F)var1;
      this.field33887 = (FC)var2;
   }

   public F method26518() {
      return this.field33886;
   }

   public FC method26519() {
      return this.field33887;
   }

   public Class7909<?, ?> method26510(Class7907<?> var1) {
      return Class2898.field17987.method11216(new Class4713(() -> this, var1));
   }

   public Class7758 method26520(float var1) {
      return new Class7758(this, var1);
   }

   public boolean method26521(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4) {
      return this.field33886.method11213(var1, var2, var3, var4, this.field33887);
   }

   public Stream<Class7909<?, ?>> method26522() {
      return Stream.<Class7909<?, ?>>concat(Stream.of(this), this.field33887.method14736());
   }
}
