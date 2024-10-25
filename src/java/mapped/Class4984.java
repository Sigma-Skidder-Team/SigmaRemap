package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class4984 extends Class4975 {
   private final Map<Long, String> field22875 = new HashMap<Long, String>();

   public Class4984() {
      super("Group ID To Name Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1.readBits(4);
         String var8 = var1.method31866((int)this.method15430(var1), "UTF-8");
         this.field22875.put(var6, var8);
      }
   }

   public Map<Long, String> method15290() {
      return this.field22875;
   }
}
