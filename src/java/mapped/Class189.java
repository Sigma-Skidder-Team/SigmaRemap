package mapped;

public enum Class189 {
   field716(0),
   field717(1),
   field718(2);

   public final int field719;

   Class189(int var3) {
      this.field719 = var3;
   }

   public Class189 method577() {
      for (Class189 var6 : values()) {
         if (var6.field719 == this.field719 + 1) {
            return var6;
         }
      }

      return field716;
   }

   public static Class189 method578(int var0) {
      for (Class189 var6 : values()) {
         if (var6.field719 == var0) {
            return var6;
         }
      }

      return field717;
   }
}
