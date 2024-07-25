package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

public final class NativeLibrary$2 implements FilenameFilter {
   public NativeLibrary$2(String var1) {
      this.val$libName = var1;
   }

   @Override
   public boolean accept(File dir, String filename) {
      return (filename.startsWith("lib" + this.val$libName + ".so") || filename.startsWith(this.val$libName + ".so") && this.val$libName.startsWith("lib"))
         && NativeLibrary.access$000(filename);
   }
}
