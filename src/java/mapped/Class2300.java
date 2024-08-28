package mapped;

public enum Class2300 {
   field15703("progress"),
   field15704("notched_6"),
   field15705("notched_10"),
   field15706("notched_12"),
   field15707("notched_20");

   private final String field15708;
   private static final Class2300[] field15709 = new Class2300[]{field15703, field15704, field15705, field15706, field15707};

   private Class2300(String var3) {
      this.field15708 = var3;
   }

   public String method9067() {
      return this.field15708;
   }

   public static Class2300 method9068(String var0) {
      for (Class2300 var6 : values()) {
         if (var6.field15708.equals(var0)) {
            return var6;
         }
      }

      return field15703;
   }
}
