package mapped;

public class Class8009 extends Class8008 {
   public static final String[] field34436 = new String[]{"default", "fast", "fancy", "off"};
   public static final String[] field34437 = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public Class8009(String var1, String var2, int var3) {
      super(var1, field34436, var2, field34437, var3);
   }

   public boolean method27390() {
      return this.method27383() == 0;
   }

   public boolean method27391() {
      return this.method27383() == 1;
   }

   public boolean method27392() {
      return this.method27383() == 2;
   }

   public boolean method27393() {
      return this.method27383() == 3;
   }

   @Override
   public boolean method27380(String var1) {
      if (Class7944.equals(var1, "none")) {
         var1 = "off";
      }

      return super.method27380(var1);
   }
}
