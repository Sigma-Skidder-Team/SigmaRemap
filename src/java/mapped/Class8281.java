package mapped;

import net.minecraft.client.resources.ResourceIndex;

import java.io.File;

public class Class8281 {
   private static String[] field35578;
   public final File gameDir;
   public final File resourcePacksDir;
   public final File assetsDir;
   public final String field35582;

   public Class8281(File var1, File var2, File var3, String var4) {
      this.gameDir = var1;
      this.resourcePacksDir = var2;
      this.assetsDir = var3;
      this.field35582 = var4;
   }

   public ResourceIndex getAssetsIndex() {
      return (ResourceIndex)(this.field35582 != null ? new ResourceIndex(this.assetsDir, this.field35582) : new Class7948(this.assetsDir));
   }
}
