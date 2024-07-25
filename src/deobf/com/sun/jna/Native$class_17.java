package com.sun.jna;

import java.nio.Buffer;

public class Native$class_17 {
   private Native$class_17() {
   }

   public static boolean isBuffer(Class<?> cls) {
      return Buffer.class.isAssignableFrom(cls);
   }
}
