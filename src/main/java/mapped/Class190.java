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
   public Set<String> getResourceNamespaces() {
      return ImmutableSet.of();
   }

   @Override
   public IResource getResource(ResourceLocation var1) throws IOException {
      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public boolean hasResource(ResourceLocation var1) {
      return false;
   }

   @Override
   public List<IResource> getAllResources(ResourceLocation var1) {
      return ImmutableList.of();
   }

   @Override
   public Collection<ResourceLocation> getAllResourceLocations(String var1, Predicate<String> var2) {
      return ImmutableSet.of();
   }

   @Override
   public Stream<IResourcePack> getResourcePackStream() {
      return Stream.<IResourcePack>of();
   }
}
