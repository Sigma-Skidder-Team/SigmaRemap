package mapped;

import java.util.Map;

public final class Class5938 extends Class5931 {
   private static String[] field25830;
   private final boolean field25831;
   private final Class2148 field25832;
   private final Map<String, String> field25833;

   public Class5938(Class2512 var1, Class2512 var2, boolean var3, Class2148 var4, Map<String, String> var5) {
      super(var1, var2);
      this.field25831 = var3;
      this.field25832 = var4;
      this.field25833 = var5;
   }

   public boolean method18441() {
      return this.field25831;
   }

   public Class2148 method18442() {
      return this.field25832;
   }

   public Map<String, String> method18443() {
      return this.field25833;
   }

   @Override
   public boolean method18431(Class78 var1) {
      return Class78.field173 == var1;
   }
}
