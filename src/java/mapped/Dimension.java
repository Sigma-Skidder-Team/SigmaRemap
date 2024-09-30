package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.function.Supplier;

public final class Dimension {
   public static final Codec<Dimension> field43951 = RecordCodecBuilder.create(
      var0 -> var0.group(
               DimensionType.DIMENSION_TYPE_CODEC.fieldOf("type").forGetter(Dimension::method36411),
               ChunkGenerator.field_235948_a_.fieldOf("generator").forGetter(Dimension::method36413)
            )
            .apply(var0, var0.stable(Dimension::new))
   );
   public static final RegistryKey<Dimension> field43952 = RegistryKey.<Dimension>getOrCreateKey(Registry.DIMENSION_KEY, new ResourceLocation("overworld"));
   public static final RegistryKey<Dimension> THE_NETHER = RegistryKey.<Dimension>getOrCreateKey(Registry.DIMENSION_KEY, new ResourceLocation("the_nether"));
   public static final RegistryKey<Dimension> THE_END = RegistryKey.<Dimension>getOrCreateKey(Registry.DIMENSION_KEY, new ResourceLocation("the_end"));
   private static final LinkedHashSet<RegistryKey<Dimension>> field43955 = Sets.newLinkedHashSet(ImmutableList.of(field43952, THE_NETHER, THE_END));
   private final Supplier<DimensionType> field43956;
   private final ChunkGenerator field43957;

   public Dimension(Supplier<DimensionType> var1, ChunkGenerator var2) {
      this.field43956 = var1;
      this.field43957 = var2;
   }

   public Supplier<DimensionType> method36411() {
      return this.field43956;
   }

   public DimensionType method36412() {
      return this.field43956.get();
   }

   public ChunkGenerator method36413() {
      return this.field43957;
   }

   public static SimpleRegistry<Dimension> method36414(SimpleRegistry<Dimension> var0) {
      SimpleRegistry<Dimension> var3 = new SimpleRegistry<>(Registry.DIMENSION_KEY, Lifecycle.experimental());

      for (RegistryKey<Dimension> var5 : field43955) {
         Dimension var6 = var0.getValueForKey(var5);
         if (var6 != null) {
            var3.register(var5, var6, var0.method9185(var6));
         }
      }

      for (Entry<RegistryKey<Dimension>, Dimension> var8 : var0.method9191()) {
         RegistryKey<Dimension> var9 = var8.getKey();
         if (!field43955.contains(var9)) {
            var3.register(var9, var8.getValue(), var0.method9185(var8.getValue()));
         }
      }

      return var3;
   }

   public static boolean method36415(long var0, SimpleRegistry<Dimension> var2) {
      ArrayList var5 = Lists.newArrayList(var2.method9191());
      if (var5.size() == field43955.size()) {
         Entry var6 = (Entry)var5.get(0);
         Entry var7 = (Entry)var5.get(1);
         Entry var8 = (Entry)var5.get(2);
         if (var6.getKey() != field43952 || var7.getKey() != THE_NETHER || var8.getKey() != THE_END) {
            return false;
         } else if (!((Dimension)var6.getValue()).method36412().isSame(DimensionType.OVERWORLD_TYPE)
            && ((Dimension)var6.getValue()).method36412() != DimensionType.OVERWORLD_CAVES_TYPE) {
            return false;
         } else if (!((Dimension)var7.getValue()).method36412().isSame(DimensionType.NETHER_TYPE)) {
            return false;
         } else if (!((Dimension)var8.getValue()).method36412().isSame(DimensionType.END_TYPE)) {
            return false;
         } else if (((Dimension)var7.getValue()).method36413() instanceof NoiseChunkGenerator && ((Dimension)var8.getValue()).method36413() instanceof NoiseChunkGenerator) {
            NoiseChunkGenerator var9 = (NoiseChunkGenerator)((Dimension)var7.getValue()).method36413();
            NoiseChunkGenerator var10 = (NoiseChunkGenerator)((Dimension)var8.getValue()).method36413();
            if (!var9.method17792(var0, DimensionSettings.field_242736_e)) {
               return false;
            } else if (!var10.method17792(var0, DimensionSettings.field_242737_f)) {
               return false;
            } else if (var9.getBiomeProvider() instanceof Class1686) {
               Class1686 var11 = (Class1686)var9.getBiomeProvider();
               if (!var11.method7210(var0)) {
                  return false;
               } else if (var10.getBiomeProvider() instanceof EndBiomeProvider) {
                  EndBiomeProvider var12 = (EndBiomeProvider)var10.getBiomeProvider();
                  return var12.method7236(var0);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
