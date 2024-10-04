package lol;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface LoadableImageData extends ImageData {
   void method21466(boolean var1);

   ByteBuffer method21467(InputStream var1) throws IOException;

   ByteBuffer method21468(InputStream var1, boolean var2, int[] var3) throws IOException;

   ByteBuffer method21469(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException;
}
