package mapped;

import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.data.PackMetadataSection;

import java.util.function.Supplier;
import javax.annotation.Nullable;

@FunctionalInterface
public interface Class9325 {
   @Nullable
   ResourcePackInfo method35244(String var1, boolean var2, Supplier<IResourcePack> var3, IResourcePack var4, PackMetadataSection var5, ResourcePackInfo.Priority var6, IPackNameDecorator var7);
}
