package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class5010 extends Class4975 {
   private final Map<Long, String> field22962 = new HashMap<Long, String>();

   public Class5010() {
      super("Chapter Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      var1.skipBytes(4L);
      int var4 = var1.readInt();

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1.readBits(8);
         int var8 = var1.readInt();
         String var9 = var1.readString(var8);
         this.field22962.put(var6, var9);
      }
   }

   public Map<Long, String> method15365() {
      return this.field22962;
   }
}
