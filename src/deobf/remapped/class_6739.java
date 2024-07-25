package remapped;

public class class_6739 extends Thread {
   public class_6739(class_7039 var1, String var2) {
      super(var2);
      this.field_34791 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         Boolean var4 = var3.method_782();
         if (var4) {
            class_176.method_772();
            class_7039.method_32312().info("Switched to stage");
            class_7039.method_32305().method_38094();
         }
      } catch (class_3900 var5) {
         class_7039.method_32312().error("Couldn't connect to Realms: " + var5);
      }
   }
}
