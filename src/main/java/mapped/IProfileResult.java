package mapped;

import java.io.File;
import java.util.List;

public interface IProfileResult {
   List<DataPoint> getDataPoints(String var1);

   boolean method25627(File var1);

   long method25628();

   int method25629();

   long method25630();

   int method25631();

   default long method25632() {
      return this.method25630() - this.method25628();
   }

   default int method25633() {
      return this.method25631() - this.method25629();
   }

   static String method25634(String var0) {
      return var0.replace('\u001e', '.');
   }
}
