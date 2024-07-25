package remapped;

public class class_6964 {
   private int field_35783;
   private String field_35781;
   private String field_35785;
   private String field_35779;
   public static final int field_35784 = 1;
   public static final int field_35787 = 2;
   public static final int field_35788 = 3;
   public static final int field_35789 = 4;
   public static final int field_35777 = 5;
   public static final int field_35780 = 6;
   public static final int field_35782 = 7;
   public static final int field_35786 = 8;

   public class_6964(int var1, String var2, String var3, String var4) {
      this.field_35783 = var1;
      this.field_35781 = var2;
      this.field_35785 = var3;
      this.field_35779 = var4;
   }

   public int method_31834() {
      return this.field_35783;
   }

   public String method_31844() {
      return this.field_35781;
   }

   public String method_31833() {
      return this.field_35785;
   }

   public boolean method_31839() {
      return this.field_35783 == 1;
   }

   public boolean method_31840(String var1) {
      return this.method_31839() && var1.equals(this.field_35781);
   }

   public boolean method_31824() {
      return this.field_35783 == 2;
   }

   public boolean method_31825(String var1) {
      return this.method_31824() && var1.equals(this.field_35781);
   }

   public boolean method_31846() {
      return this.field_35783 == 6;
   }

   public boolean method_31822() {
      return this.field_35783 == 3;
   }

   public boolean method_31849() {
      return this.field_35783 == 4;
   }

   public boolean method_31826() {
      return this.field_35783 == 5;
   }

   public boolean method_31842() {
      return this.field_35783 == 7;
   }

   public boolean method_31838() {
      return this.field_35783 == 8;
   }

   public boolean method_31847(String var1) {
      return this.method_31846() && var1.equals(this.field_35781);
   }

   public boolean method_31848(String var1, String var2) {
      return this.method_31847(var1) && var2.equals(this.field_35785);
   }

   public boolean method_31823(String var1) {
      return this.method_31822() && var1.equals(this.field_35781);
   }

   public boolean method_31820(String var1) {
      return this.method_31822() && this.field_35781.endsWith(var1);
   }

   public boolean method_31850(String var1) {
      return this.method_31849() && var1.equals(this.field_35781);
   }

   public boolean method_31827(String var1) {
      return this.method_31826() && var1.equals(this.field_35781);
   }

   public boolean method_31843(String var1) {
      return this.method_31842() && var1.equals(this.field_35781);
   }

   public boolean method_31836(String var1) {
      return this.method_31826() && this.field_35781.endsWith(var1);
   }

   public boolean method_31837(String var1, boolean var2) {
      return this.method_31836(var1) && this.method_31835() == var2;
   }

   public boolean method_31828(String var1, String var2) {
      return this.method_31827(var1) || this.method_31827(var2);
   }

   public boolean method_31829(String var1, String var2, String var3) {
      return this.method_31827(var1) || this.method_31827(var2) || this.method_31827(var3);
   }

   public boolean method_31832(String var1, boolean var2) {
      return this.method_31827(var1) && this.method_31835() == var2;
   }

   public boolean method_31831(String var1, String var2, boolean var3) {
      return this.method_31828(var1, var2) && this.method_31835() == var3;
   }

   public boolean method_31830(String var1, String var2, String var3, boolean var4) {
      return this.method_31829(var1, var2, var3) && this.method_31835() == var4;
   }

   public boolean method_31819(String var1) {
      return this.method_31838() && this.field_35781.endsWith(var1);
   }

   public int method_31841() {
      try {
         return Integer.parseInt(this.field_35785);
      } catch (NumberFormatException var4) {
         throw new NumberFormatException("Invalid integer: " + this.field_35785 + ", line: " + this.field_35779);
      }
   }

   public float method_31845() {
      try {
         return Float.parseFloat(this.field_35785);
      } catch (NumberFormatException var4) {
         throw new NumberFormatException("Invalid float: " + this.field_35785 + ", line: " + this.field_35779);
      }
   }

   public class_2637 method_31821() {
      if (this.field_35785 == null) {
         return null;
      } else {
         String var3 = this.field_35785.trim();
         var3 = class_8251.method_37832(var3, "vec4");
         var3 = class_8251.method_37830(var3, " ()");
         String[] var4 = class_3111.method_14302(var3, ", ");
         if (var4.length != 4) {
            return null;
         } else {
            float[] var5 = new float[4];

            for (int var6 = 0; var6 < var4.length; var6++) {
               String var7 = var4[var6];
               var7 = class_8251.method_37823(var7, new String[]{"F", "f"});
               float var8 = class_3111.method_14445(var7, Float.MAX_VALUE);
               if (var8 == Float.MAX_VALUE) {
                  return null;
               }

               var5[var6] = var8;
            }

            return new class_2637(var5[0], var5[1], var5[2], var5[3]);
         }
      }
   }

   public boolean method_31835() {
      String var3 = this.field_35785.toLowerCase();
      if (!var3.equals("true") && !var3.equals("false")) {
         throw new RuntimeException("Invalid boolean: " + this.field_35785 + ", line: " + this.field_35779);
      } else {
         return Boolean.valueOf(this.field_35785);
      }
   }
}
