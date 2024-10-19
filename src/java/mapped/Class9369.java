package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.template.TemplateManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9369 {
   private static final Logger field43490 = LogManager.getLogger();
   public static final Codec<Class9369> field43491 = RecordCodecBuilder.create(
      var0 -> var0.group(
               ResourceLocation.CODEC.fieldOf("name").forGetter(Class9369::method35537),
               ResourceLocation.CODEC.fieldOf("fallback").forGetter(Class9369::method35534),
               Codec.mapPair(Class7487.field32183.fieldOf("element"), Codec.INT.fieldOf("weight"))
                  .codec()
                  .listOf()
                  .promotePartial(Util.func_240982_a_("Pool element: ", field43490::error))
                  .fieldOf("elements")
                  .forGetter(var0x -> var0x.field43494)
            )
            .apply(var0, Class9369::new)
   );
   public static final Codec<Supplier<Class9369>> field43492 = RegistryKeyCodec.create(Registry.field16105, field43491);
   private final ResourceLocation field43493;
   private final List<Pair<Class7487, Integer>> field43494;
   private final List<Class7487> field43495;
   private final ResourceLocation field43496;
   private int field43497 = Integer.MIN_VALUE;

   public Class9369(ResourceLocation var1, ResourceLocation var2, List<Pair<Class7487, Integer>> var3) {
      this.field43493 = var1;
      this.field43494 = var3;
      this.field43495 = Lists.newArrayList();

      for (Pair<Class7487, Integer> var7 : var3) {
         Class7487 var8 = var7.getFirst();

         for (int var9 = 0; var9 < var7.getSecond(); var9++) {
            this.field43495.add(var8);
         }
      }

      this.field43496 = var2;
   }

   public Class9369(ResourceLocation var1, ResourceLocation var2, List<Pair<Function<Class109, ? extends Class7487>, Integer>> var3, Class109 var4) {
      this.field43493 = var1;
      this.field43494 = Lists.newArrayList();
      this.field43495 = Lists.newArrayList();

      for (Pair<Function<Class109, ? extends Class7487>, Integer> var8 : var3) {
         Class7487 var9 = (Class7487)((Function)var8.getFirst()).apply(var4);
         this.field43494.add(Pair.of(var9, var8.getSecond()));

         for (int var10 = 0; var10 < var8.getSecond(); var10++) {
            this.field43495.add(var9);
         }
      }

      this.field43496 = var2;
   }

   public int method35533(TemplateManager var1) {
      if (this.field43497 == Integer.MIN_VALUE) {
         this.field43497 = this.field43495
            .stream()
            .mapToInt(var1x -> var1x.method24375(var1, BlockPos.ZERO, Rotation.NONE).method38399())
            .max()
            .orElse(0);
      }

      return this.field43497;
   }

   public ResourceLocation method35534() {
      return this.field43496;
   }

   public Class7487 method35535(Random var1) {
      return this.field43495.get(var1.nextInt(this.field43495.size()));
   }

   public List<Class7487> method35536(Random var1) {
      return ImmutableList.copyOf(ObjectArrays.shuffle(this.field43495.toArray(new Class7487[0]), var1));
   }

   public ResourceLocation method35537() {
      return this.field43493;
   }

   public int method35538() {
      return this.field43495.size();
   }
}
