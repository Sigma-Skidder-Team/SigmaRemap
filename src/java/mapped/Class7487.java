package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Class7487 {
   public static final Codec<Class7487> field32183 = Registry.field16138.dispatch("element_type", Class7487::method24377, Class8325::method29186);
   private volatile Class109 field32184;

   public static <E extends Class7487> RecordCodecBuilder<E, Class109> method24379() {
      return Class109.field368.fieldOf("projection").forGetter(Class7487::method24382);
   }

   public Class7487(Class109 var1) {
      this.field32184 = var1;
   }

   public abstract List<Class8266> method24374(TemplateManager var1, BlockPos var2, Class80 var3, Random var4);

   public abstract Class9764 method24375(TemplateManager var1, BlockPos var2, Class80 var3);

   public abstract boolean method24376(
           TemplateManager var1, ISeedReader var2, Class7480 var3, ChunkGenerator var4, BlockPos var5, BlockPos var6, Class80 var7, Class9764 var8, Random var9, boolean var10
   );

   public abstract Class8325<?> method24377();

   public void method24380(Class1660 var1, Class8266 var2, BlockPos var3, Class80 var4, Random var5, Class9764 var6) {
   }

   public Class7487 method24381(Class109 var1) {
      this.field32184 = var1;
      return this;
   }

   public Class109 method24382() {
      Class109 var3 = this.field32184;
      if (var3 != null) {
         return var3;
      } else {
         throw new IllegalStateException();
      }
   }

   public int method24383() {
      return 1;
   }

   public static Function<Class109, Class7486> method24384() {
      return var0 -> Class7486.field32182;
   }

   public static Function<Class109, Class7489> method24385(String var0) {
      return var1 -> new Class7489(Either.left(new ResourceLocation(var0)), () -> Class8523.field38250, var1);
   }

   public static Function<Class109, Class7489> method24386(String var0, Class3622 var1) {
      return var2 -> new Class7489(Either.left(new ResourceLocation(var0)), () -> var1, var2);
   }

   public static Function<Class109, Class7488> method24387(String var0) {
      return var1 -> new Class7488(Either.left(new ResourceLocation(var0)), () -> Class8523.field38250, var1);
   }

   public static Function<Class109, Class7488> method24388(String var0, Class3622 var1) {
      return var2 -> new Class7488(Either.left(new ResourceLocation(var0)), () -> var1, var2);
   }

   public static Function<Class109, Class7490> method24389(Class7909<?, ?> var0) {
      return var1 -> new Class7490(() -> var0, var1);
   }

   public static Function<Class109, Class7491> method24390(List<Function<Class109, ? extends Class7487>> var0) {
      return var1 -> new Class7491(var0.stream().<Class7487>map(var1x -> (Class7487)var1x.apply(var1)).collect(Collectors.<Class7487>toList()), var1);
   }
}
