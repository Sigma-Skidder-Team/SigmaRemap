package remapped;

public class class_3350 extends class_6154 {
   public static final String[] field_16523 = new String[]{"default", "true", "false"};
   public static final String[] field_16525 = new String[]{"Default", "ON", "OFF"};

   public class_3350(String var1, String var2, int var3) {
      super(var1, field_16523, var2, field_16525, var3);
   }

   @Override
   public String method_28244() {
      if (!this.method_15356()) {
         if (!this.method_15355()) {
            return !this.method_15354() ? super.method_28244() : class_3458.method_15902();
         } else {
            return class_3458.method_15907();
         }
      } else {
         return class_3458.method_15911();
      }
   }

   public boolean method_15356() {
      return this.method_28243() == 0;
   }

   public boolean method_15355() {
      return this.method_28243() == 1;
   }

   public boolean method_15354() {
      return this.method_28243() == 2;
   }
}
