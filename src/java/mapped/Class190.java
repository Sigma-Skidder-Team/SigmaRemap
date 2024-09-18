package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.ResourceLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Class190 implements IResourceManager {
   field721;

   private static final Class190[] field722 = new Class190[]{field721};

   @Override
   public Set<String> method579() {
      return ImmutableSet.of();
   }

   @Override
   public JSonShader getShader(ResourceLocation var1) throws IOException {
      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      return false;
   }

   @Override
   public List<JSonShader> method582(ResourceLocation var1) {
      return ImmutableList.of();
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      return ImmutableSet.of();
   }

   @Override
   public Stream<IResourcePack> method584() {
      return Stream.<IResourcePack>of();
   }
}
