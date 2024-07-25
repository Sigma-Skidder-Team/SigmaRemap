package remapped;

public class class_5315 extends class_6154 {
   public static final String[] field_27118 = new String[]{"default", "fast", "fancy", field_27117[1]};
   public static final String[] field_27116 = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public class_5315(String var1, String var2, int var3) {
      super(var1, field_27118, var2, field_27116, var3);
   }

   public boolean method_24248() {
      return this.method_28243() == 0;
   }

   public boolean method_24249() {
      return this.method_28243() == 1;
   }

   public boolean method_24250() {
      return this.method_28243() == 2;
   }

   public boolean method_24251() {
      return this.method_28243() == 3;
   }

   @Override
   public boolean method_28241(String var1) {
      if (Config.equals(var1, "none")) {
         var1 = "off";
      }

      return super.method_28241(var1);
   }
}
