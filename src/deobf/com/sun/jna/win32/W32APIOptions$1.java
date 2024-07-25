package com.sun.jna.win32;

import java.util.HashMap;

public final class W32APIOptions$1 extends HashMap<String, Object> {
   private static final long serialVersionUID = 1L;

   public W32APIOptions$1() {
      this.put("type-mapper", W32APITypeMapper.UNICODE);
      this.put("function-mapper", W32APIFunctionMapper.UNICODE);
   }
}
