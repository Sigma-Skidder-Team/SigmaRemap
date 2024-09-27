package mapped;

import net.optifine.Config;

public class Class9090 {
   private int field41604;
   private String field41605;
   private String field41606;
   private String field41607;
   public static final int field41608 = 1;
   public static final int field41609 = 2;
   public static final int field41610 = 3;
   public static final int field41611 = 4;
   public static final int field41612 = 5;
   public static final int field41613 = 6;
   public static final int field41614 = 7;
   public static final int field41615 = 8;

   public Class9090(int var1, String var2, String var3, String var4) {
      this.field41604 = var1;
      this.field41605 = var2;
      this.field41606 = var3;
      this.field41607 = var4;
   }

   public int method33885() {
      return this.field41604;
   }

   public String method33886() {
      return this.field41605;
   }

   public String method33887() {
      return this.field41606;
   }

   public boolean method33888() {
      return this.field41604 == 1;
   }

   public boolean method33889(String var1) {
      return this.method33888() && var1.equals(this.field41605);
   }

   public boolean method33890() {
      return this.field41604 == 2;
   }

   public boolean method33891(String var1) {
      return this.method33890() && var1.equals(this.field41605);
   }

   public boolean method33892() {
      return this.field41604 == 6;
   }

   public boolean method33893() {
      return this.field41604 == 3;
   }

   public boolean method33894() {
      return this.field41604 == 4;
   }

   public boolean method33895() {
      return this.field41604 == 5;
   }

   public boolean method33896() {
      return this.field41604 == 7;
   }

   public boolean method33897() {
      return this.field41604 == 8;
   }

   public boolean method33898(String var1) {
      return this.method33892() && var1.equals(this.field41605);
   }

   public boolean method33899(String var1, String var2) {
      return this.method33898(var1) && var2.equals(this.field41606);
   }

   public boolean method33900(String var1) {
      return this.method33893() && var1.equals(this.field41605);
   }

   public boolean method33901(String var1) {
      return this.method33893() && this.field41605.endsWith(var1);
   }

   public boolean method33902(String var1) {
      return this.method33894() && var1.equals(this.field41605);
   }

   public boolean method33903(String var1) {
      return this.method33895() && var1.equals(this.field41605);
   }

   public boolean method33904(String var1) {
      return this.method33896() && var1.equals(this.field41605);
   }

   public boolean method33905(String var1) {
      return this.method33895() && this.field41605.endsWith(var1);
   }

   public boolean method33906(String var1, boolean var2) {
      return this.method33905(var1) && this.method33916() == var2;
   }

   public boolean method33907(String var1, String var2) {
      return this.method33903(var1) || this.method33903(var2);
   }

   public boolean method33908(String var1, String var2, String var3) {
      return this.method33903(var1) || this.method33903(var2) || this.method33903(var3);
   }

   public boolean method33909(String var1, boolean var2) {
      return this.method33903(var1) && this.method33916() == var2;
   }

   public boolean method33910(String var1, String var2, boolean var3) {
      return this.method33907(var1, var2) && this.method33916() == var3;
   }

   public boolean method33911(String var1, String var2, String var3, boolean var4) {
      return this.method33908(var1, var2, var3) && this.method33916() == var4;
   }

   public boolean method33912(String var1) {
      return this.method33897() && this.field41605.endsWith(var1);
   }

   public int method33913() {
      try {
         return Integer.parseInt(this.field41606);
      } catch (NumberFormatException var4) {
         throw new NumberFormatException("Invalid integer: " + this.field41606 + ", line: " + this.field41607);
      }
   }

   public float method33914() {
      try {
         return Float.parseFloat(this.field41606);
      } catch (NumberFormatException var4) {
         throw new NumberFormatException("Invalid float: " + this.field41606 + ", line: " + this.field41607);
      }
   }

   public Class7755 method33915() {
      if (this.field41606 == null) {
         return null;
      } else {
         String var3 = this.field41606.trim();
         var3 = Class9402.method35762(var3, "vec4");
         var3 = Class9402.method35776(var3, " ()");
         String[] var4 = Config.method26903(var3, ", ");
         if (var4.length != 4) {
            return null;
         } else {
            float[] var5 = new float[4];

            for (int var6 = 0; var6 < var4.length; var6++) {
               String var7 = var4[var6];
               var7 = Class9402.method35769(var7, new String[]{"F", "f"});
               float var8 = Config.method26900(var7, Float.MAX_VALUE);
               if (var8 == Float.MAX_VALUE) {
                  return null;
               }

               var5[var6] = var8;
            }

            return new Class7755(var5[0], var5[1], var5[2], var5[3]);
         }
      }
   }

   public boolean method33916() {
      String var3 = this.field41606.toLowerCase();
      if (!var3.equals("true") && !var3.equals("false")) {
         throw new RuntimeException("Invalid boolean: " + this.field41606 + ", line: " + this.field41607);
      } else {
         return Boolean.valueOf(this.field41606);
      }
   }
}
