package mapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.BlockState;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class7498 implements Class7495 {
   private static String[] field32213;
   private final Class9348<Block, BlockState> field32214;
   private final List<Class9350> field32215;

   public Class7498(Class9348<Block, BlockState> var1, List<Class9350> var2) {
      this.field32214 = var1;
      this.field32215 = var2;
   }

   public List<Class9350> method24447() {
      return this.field32215;
   }

   public Set<Class7497> method24448() {
      HashSet var3 = Sets.newHashSet();

      for (Class9350 var5 : this.field32215) {
         var3.add(var5.method35407());
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class7498)) {
            return false;
         } else {
            Class7498 var4 = (Class7498)var1;
            return Objects.equals(this.field32214, var4.field32214) && Objects.equals(this.field32215, var4.field32215);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field32214, this.field32215);
   }

   @Override
   public Collection<ResourceLocation> method24423() {
      return this.method24447().stream().<ResourceLocation>flatMap(var0 -> var0.method35407().method24423().stream()).collect(Collectors.<ResourceLocation>toSet());
   }

   @Override
   public Collection<Class7826> method24424(Function<ResourceLocation, Class7495> var1, Set<Pair<String, String>> var2) {
      return this.method24447()
         .stream()
         .<Class7826>flatMap(var2x -> var2x.method35407().method24424(var1, var2).stream())
         .collect(Collectors.<Class7826>toSet());
   }

   @Nullable
   @Override
   public IBakedModel method24425(ModelBakery var1, Function<Class7826, TextureAtlasSprite> var2, Class1902 var3, ResourceLocation var4) {
      Class8931 var7 = new Class8931();

      for (Class9350 var9 : this.method24447()) {
         IBakedModel var10 = var9.method35407().method24425(var1, var2, var3, var4);
         if (var10 != null) {
            var7.method32655(var9.method35408(this.field32214), var10);
         }
      }

      return var7.method32656();
   }
}
