package remapped;

import java.io.File;
import java.util.List;

public interface class_2578 {
   List<class_692> method_11742(String var1);

   boolean method_11740(File var1);

   long method_11737();

   int method_11739();

   long method_11734();

   int method_11735();

   default long method_11736() {
      return this.method_11734() - this.method_11737();
   }

   default int method_11741() {
      return this.method_11735() - this.method_11739();
   }

   static String method_11738(String var0) {
      return var0.replace('\u001e', '.');
   }
}
