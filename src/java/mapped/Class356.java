package mapped;

public class Class356 extends Thread {
   public final Class814 field1584;

   public Class356(Class814 var1, String var2) {
      super(var2);
      this.field1584 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Class6108 var4 = var3.method14563(1, 10, Class2049.field13369);
         Class6108 var5 = var3.method14563(1, 10, Class2049.field13371);
         Class6108 var6 = var3.method14563(1, 10, Class2049.field13372);
         Class6108 var7 = var3.method14563(1, 10, Class2049.field13373);
         Class814.method2264(this.field1584).execute(() -> {
            Class814.method2266(this.field1584, var4);
            Class814.method2267(this.field1584, var5);
            Class814.method2268(this.field1584, var6);
            Class814.method2269(this.field1584, var7);
         });
      } catch (Class2435 var8) {
         Class814.method2265().error("Couldn't fetch templates in reset world", var8);
      }
   }
}
