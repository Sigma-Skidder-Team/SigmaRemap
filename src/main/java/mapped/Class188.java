package mapped;

public enum Class188 {
   field704(-1, "invalid"),
   field705(0, "No channel"),
   field706(1, "Mono"),
   field707(2, "Stereo"),
   field708(3, "Stereo+Center"),
   field709(4, "Stereo+Center+Rear"),
   field710(5, "Five channels"),
   field711(6, "Five channels+LF"),
   field712(8, "Seven channels+LF");

   private final int field713;
   private final String field714;
   private static final Class188[] field715 = new Class188[]{field704, field705, field706, field707, field708, field709, field710, field711, field712};

   public static Class188 method574(int var0) {
      Class188 var3;
      switch (var0) {
         case 0:
            var3 = field705;
            break;
         case 1:
            var3 = field706;
            break;
         case 2:
            var3 = field707;
            break;
         case 3:
            var3 = field708;
            break;
         case 4:
            var3 = field709;
            break;
         case 5:
            var3 = field710;
            break;
         case 6:
            var3 = field711;
            break;
         case 7:
         case 8:
            var3 = field712;
            break;
         default:
            var3 = field704;
      }

      return var3;
   }

   private Class188(int var3, String var4) {
      this.field713 = var3;
      this.field714 = var4;
   }

   public int method575() {
      return this.field713;
   }

   public String method576() {
      return this.field714;
   }

   @Override
   public String toString() {
      return this.field714;
   }
}
