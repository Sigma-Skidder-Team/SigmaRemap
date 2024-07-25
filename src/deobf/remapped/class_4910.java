package remapped;

public class class_4910 implements Runnable {
   public class_4910(ChangelogClass var1, class_1336 var2) {
      this.field_25417 = var1;
      this.field_25415 = var2;
   }

   @Override
   public void run() {
      int var3 = 75;

      for (int var4 = 0; var4 < this.field_25415.method_6142(); var4++) {
         class_1293 var5 = this.field_25415.method_6143(var4);
         class_4113 var6 = null;
         if (var5.method_5850("url")) {
            class_9665.method_44667().method_37581(var5.method_5861("url"));
         }

         this.field_25417.field_5070.method_11850().method_32150(var6 = new class_4113(this.field_25417.field_5070, "changelog" + var4, var5));
         var6.method_32117(var3);
         var3 += var6.method_32137();
      }
   }
}
