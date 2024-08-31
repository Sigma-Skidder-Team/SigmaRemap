package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface IResourceManager {
   Set<String> method579();

   Class1783 method580(ResourceLocation var1) throws IOException;

   boolean method581(ResourceLocation var1);

   List<Class1783> method582(ResourceLocation var1) throws IOException;

   Collection<ResourceLocation> method583(String var1, Predicate<String> var2);

   Stream<IResourcePack> method584();
}
