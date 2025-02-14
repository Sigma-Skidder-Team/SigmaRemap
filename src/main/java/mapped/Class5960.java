package mapped;

public abstract class Class5960 implements Class5962 {
   public static final int field25987 = 0;
   public static final int field25988 = 1;
   public static final int field25989 = 2;
   public static final int field25990 = 3;
   public static final int field25991 = 4;
   private int field25992;
   private int field25993;
   private int field25994;

   public Class5960(int var1, int var2, int var3) {
      this.field25992 = var2;
      this.field25993 = var3;
      this.field25994 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null) {
         if (!(var1 instanceof Class5960)) {
            return false;
         } else {
            Class5960 var4 = (Class5960)var1;
            return var4.field25994 == this.field25994 && var4.field25992 == this.field25992 && var4.field25993 == this.field25993;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.field25992 + this.field25993 + this.field25994;
   }
}
