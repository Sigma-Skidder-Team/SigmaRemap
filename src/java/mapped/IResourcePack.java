package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

public interface IResourcePack extends AutoCloseable {
   InputStream method1222(String var1) throws IOException;

   InputStream getResourceStream(ResourcePackType var1, ResourceLocation var2) throws IOException;

   Collection<ResourceLocation> method1224(ResourcePackType var1, String var2, String var3, int var4, Predicate<String> var5);

   boolean method1225(ResourcePackType var1, ResourceLocation var2);

   Set<String> method1226(ResourcePackType var1);

   @Nullable
   <T> T method1227(Class7170<T> var1) throws IOException;

   String method1228();

   @Override
   void close();
}
