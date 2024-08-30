package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class7497 implements Class7495 {
   private static String[] field32211;
   private final List<Class1903> field32212;

   public Class7497(List<Class1903> var1) {
      this.field32212 = var1;
   }

   public List<Class1903> method24445() {
      return this.field32212;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class7497)) {
            return false;
         } else {
            Class7497 var4 = (Class7497)var1;
            return this.field32212.equals(var4.field32212);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field32212.hashCode();
   }

   @Override
   public Collection<ResourceLocation> method24423() {
      return this.method24445().stream().<ResourceLocation>map(Class1903::method8171).collect(Collectors.<ResourceLocation>toSet());
   }

   @Override
   public Collection<Class7826> method24424(Function<ResourceLocation, Class7495> var1, Set<Pair<String, String>> var2) {
      return this.method24445()
         .stream()
         .<ResourceLocation>map(Class1903::method8171)
         .distinct()
         .<Class7826>flatMap(var2x -> ((Class7495)var1.apply(var2x)).method24424(var1, var2).stream())
         .collect(Collectors.<Class7826>toSet());
   }

   @Nullable
   @Override
   public IBakedModel method24425(ModelBakery var1, Function<Class7826, TextureAtlasSprite> var2, Class1902 var3, ResourceLocation var4) {
      if (this.method24445().isEmpty()) {
         return null;
      } else {
         Class9143 var7 = new Class9143();

         for (Class1903 var9 : this.method24445()) {
            IBakedModel var10 = var1.method32847(var9.method8171(), var9);
            var7.method34155(var10, var9.method8172());
         }

         return var7.method34156();
      }
   }
}
