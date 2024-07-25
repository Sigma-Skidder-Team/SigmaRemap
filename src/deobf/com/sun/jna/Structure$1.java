package com.sun.jna;

import java.util.HashMap;
import java.util.Map;

public final class Structure$1 extends ThreadLocal<Map<Pointer, Structure>> {
   public synchronized Map<Pointer, Structure> initialValue() {
      return new HashMap<Pointer, Structure>();
   }
}
