package mapped;

import net.minecraft.util.math.ChunkPos;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Class1765 extends ByteArrayOutputStream {
   private static String[] field9550;
   private final ChunkPos field9551;
   public final RegionFile field9552;

   public Class1765(RegionFile var1, ChunkPos var2) {
      super(8096);
      this.field9552 = var1;
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(RegionFile.method7270(var1).method36525());
      this.field9551 = var2;
   }

   @Override
   public void close() throws IOException {
      ByteBuffer var3 = ByteBuffer.wrap(this.buf, 0, this.count);
      var3.putInt(0, this.count - 5 + 1);
      this.field9552.method7260(this.field9551, var3);
   }
}
