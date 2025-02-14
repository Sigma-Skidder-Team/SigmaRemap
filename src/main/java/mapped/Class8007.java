package mapped;

public class Class8007 extends Class8008 {
   public static final String[] field34428 = new String[]{"default", "true", "false"};
   public static final String[] field34429 = new String[]{"Default", "ON", "OFF"};

   public Class8007(String var1, String var2, int var3) {
      super(var1, field34428, var2, field34429, var3);
   }

   @Override
   public String method27376() {
      if (!this.method27377()) {
         if (!this.method27378()) {
            return !this.method27379() ? super.method27376() : Class8043.method27623();
         } else {
            return Class8043.method27622();
         }
      } else {
         return Class8043.method27626();
      }
   }

   public boolean method27377() {
      return this.method27383() == 0;
   }

   public boolean method27378() {
      return this.method27383() == 1;
   }

   public boolean method27379() {
      return this.method27383() == 2;
   }
}
