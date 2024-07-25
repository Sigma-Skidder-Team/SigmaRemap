package remapped;

public enum class_5022 {
   field_25977("grant"),
   field_25978("revoke");

   private final String field_25979;

   private class_5022(String var3) {
      this.field_25979 = "commands.advancement." + var3;
   }

   public int method_23120(class_9359 var1, Iterable<class_3139> var2) {
      int var5 = 0;

      for (class_3139 var7 : var2) {
         if (this.method_23124(var1, var7)) {
            var5++;
         }
      }

      return var5;
   }

   public abstract boolean method_23124(class_9359 var1, class_3139 var2);

   public abstract boolean method_23121(class_9359 var1, class_3139 var2, String var3);

   public String method_23123() {
      return this.field_25979;
   }
}
