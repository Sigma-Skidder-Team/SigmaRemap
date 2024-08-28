package mapped;

public enum Class2095 {
   field13643("tx"),
   field13644("ty"),
   field13645("tz"),
   field13646("rx"),
   field13647("ry"),
   field13648("rz"),
   field13649("sx"),
   field13650("sy"),
   field13651("sz");

   private String field13652;
   public static Class2095[] field13653 = values();
   private static final Class2095[] field13654 = new Class2095[]{
      field13643, field13644, field13645, field13646, field13647, field13648, field13649, field13650, field13651
   };

   private Class2095(String var3) {
      this.field13652 = var3;
   }

   public String method8756() {
      return this.field13652;
   }

   public float method8757(Class7219 var1) {
      switch (Class6877.field29817[this.ordinal()]) {
         case 1:
            return var1.field31032;
         case 2:
            return var1.field31033;
         case 3:
            return var1.field31034;
         case 4:
            return var1.field31035;
         case 5:
            return var1.field31036;
         case 6:
            return var1.field31037;
         case 7:
            return var1.field31044;
         case 8:
            return var1.field31045;
         case 9:
            return var1.field31046;
         default:
            Class7944.method26811("GetFloat not supported for: " + this);
            return 0.0F;
      }
   }

   public void method8758(Class7219 var1, float var2) {
      switch (Class6877.field29817[this.ordinal()]) {
         case 1:
            var1.field31032 = var2;
            return;
         case 2:
            var1.field31033 = var2;
            return;
         case 3:
            var1.field31034 = var2;
            return;
         case 4:
            var1.field31035 = var2;
            return;
         case 5:
            var1.field31036 = var2;
            return;
         case 6:
            var1.field31037 = var2;
            return;
         case 7:
            var1.field31044 = var2;
            return;
         case 8:
            var1.field31045 = var2;
            return;
         case 9:
            var1.field31046 = var2;
            return;
         default:
            Class7944.method26811("SetFloat not supported for: " + this);
      }
   }

   public static Class2095 method8759(String var0) {
      for (int var3 = 0; var3 < field13653.length; var3++) {
         Class2095 var4 = field13653[var3];
         if (var4.method8756().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
