package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface IResourceManager {
   Set<String> getResourceNamespaces();

   IResource getResource(ResourceLocation var1) throws IOException;

   boolean hasResource(ResourceLocation var1);

   List<IResource> getAllResources(ResourceLocation var1) throws IOException;

   Collection<ResourceLocation> getAllResourceLocations(String var1, Predicate<String> var2);

   Stream<IResourcePack> getResourcePackStream();
}
