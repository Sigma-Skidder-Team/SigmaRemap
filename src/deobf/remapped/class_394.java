package remapped;

import java.io.File;
import java.io.FileNotFoundException;

public class class_394 extends FileNotFoundException {
   public class_394(File var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }
}
