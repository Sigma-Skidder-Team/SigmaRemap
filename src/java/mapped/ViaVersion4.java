package mapped;

public class ViaVersion4 extends Exception {
   public static final ViaVersion4 field16532 = new Class2450("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public ViaVersion4() {
   }

   public ViaVersion4(String var1) {
      super(var1);
   }

   public ViaVersion4(String var1, Throwable var2) {
      super(var1, var2);
   }

   public ViaVersion4(Throwable var1) {
      super(var1);
   }

   public ViaVersion4(String var1, Throwable var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public static ViaVersion4 method10461() {
      return !ViaVersion3.getInstance().method34425() ? field16532 : new ViaVersion4();
   }
}
