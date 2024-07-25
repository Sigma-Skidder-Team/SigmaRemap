package com.sun.jna;

import java.util.List;

public class CallbackReference$class_6 extends Structure {
   public static final List<String> FIELDS = createFieldsOrder(new String[]{"daemon", "detach", "name"});
   public boolean daemon;
   public boolean detach;
   public String name;

   public CallbackReference$class_6() {
      this.setStringEncoding("utf8");
   }

   @Override
   public List<String> getFieldOrder() {
      return FIELDS;
   }
}
