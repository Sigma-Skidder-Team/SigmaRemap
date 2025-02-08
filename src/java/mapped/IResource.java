package mapped;

import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.ResourceLocation;

import java.io.Closeable;
import java.io.InputStream;
import javax.annotation.Nullable;

public interface IResource extends Closeable {
   ResourceLocation getLocation();

   InputStream getInputStream();

   @Nullable
   <T> T getMetadata(IMetadataSectionSerializer<T> var1);

   String getPackName();
}
