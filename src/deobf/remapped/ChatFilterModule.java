package remapped;

public class ChatFilterModule extends Module {
   public ChatFilterModule() {
      super(Category.MISC, "ChatFilter", "Bypasse chat filters");
   }

   @EventListen
   private void method_2982(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_3211) {
            class_3211 var4 = (class_3211)var1.method_10047();
            String[] var5 = var4.field_16018.split(" ");
            if (var4.field_16018.length() + var5.length <= 100) {
               StringBuilder var6 = new StringBuilder();
               boolean var7 = false;

               for (int var8 = 0; var8 < var5.length; var8++) {
                  if (!var5[var8].startsWith("/")) {
                     if (var5.length != 0) {
                        var6.append(" ");
                     }

                     String var9 = var5[var8].substring(0, 1);
                     String var10 = var5[var8].substring(1);
                     var6.append(var9 + "\uf8ff" + var10);
                  } else {
                     var6.append(var5[var8]);
                     var7 = !var5[var8].equals("/r") && !var5[var8].equals("/msg");
                  }
               }

               if (!var7) {
                  var4.field_16018 = var6.toString();
               }
            }
         }
      }
   }
}
