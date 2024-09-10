package mapped;

import net.minecraft.client.resources.ResourceIndex;

import java.io.File;

public class FolderInformation {
   private static String[] field35578;
   public final File gameDir;
   public final File resourcePacksDir;
   public final File assetsDir;
   public final String assetIndex;

   public FolderInformation(File var1, File var2, File var3, String var4) {
      this.gameDir = var1;
      this.resourcePacksDir = var2;
      this.assetsDir = var3;
      this.assetIndex = var4;
   }

   public ResourceIndex getAssetsIndex()
   {
      return (ResourceIndex)(this.assetIndex == null ? new FolderResourceIndex(this.assetsDir) : new ResourceIndex(this.assetsDir, this.assetIndex));
   }
}
