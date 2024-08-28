package mapped;

public class Class2449 extends Exception {
   public static final Class2449 field16532 = new Class2450("This packet is supposed to be cancelled; If you have debug enabled, you can ignore these");

   public Class2449() {
   }

   public Class2449(String var1) {
      super(var1);
   }

   public Class2449(String var1, Throwable var2) {
      super(var1, var2);
   }

   public Class2449(Throwable var1) {
      super(var1);
   }

   public Class2449(String var1, Throwable var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public static Class2449 method10461() {
      return !Class8042.method27614().method34425() ? field16532 : new Class2449();
   }
}
