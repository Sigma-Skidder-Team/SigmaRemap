package mapped;

public class Class2021 extends Class2020 {
   private static String[] field13118;
   public static final Class2021 field13119 = new Class2021(0, 0, 0);
   public static final Class2021 field13120 = new Class2021(1, 0, 0);
   public static final Class2021 field13121 = new Class2021(0, 1, 0);
   public static final Class2021 field13122 = new Class2021(0, 0, 1);
   public static final Class2021 field13123 = new Class2021(1, 1, 1);

   public Class2021(Class2020 var1) {
      super(var1);
   }

   public Class2021(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public Class2021(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public Class2021(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class2020)) {
         return false;
      } else {
         Class2020 var4 = (Class2020)var1;
         return (int)var4.method8552() == (int)this.field13115
            && (int)var4.method8556() == (int)this.field13116
            && (int)var4.method8560() == (int)this.field13117;
      }
   }

   @Override
   public int hashCode() {
      return (int)this.field13115 << 19 ^ (int)this.field13116 << 12 ^ (int)this.field13117;
   }

   @Override
   public Class2021 method8605() {
      return this;
   }
}
