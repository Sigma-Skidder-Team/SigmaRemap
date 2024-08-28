package mapped;

import java.io.File;
import java.io.FileNotFoundException;

public class Class2456 extends FileNotFoundException {
   public Class2456(File var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }
}
