package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2340 {
   field16003(0, "options.ao.off"),
   field16004(1, "options.ao.min"),
   field16005(2, "options.ao.max");

   private static final Class2340[] field16006 = Arrays.<Class2340>stream(values())
      .sorted(Comparator.comparingInt(Class2340::method9115))
      .<Class2340>toArray(Class2340[]::new);
   private final int field16007;
   private final String field16008;
   private static final Class2340[] field16009 = new Class2340[]{field16003, field16004, field16005};

   private Class2340(int var3, String var4) {
      this.field16007 = var3;
      this.field16008 = var4;
   }

   public int method9115() {
      return this.field16007;
   }

   public String method9116() {
      return this.field16008;
   }

   public static Class2340 method9117(int var0) {
      return field16006[Class9679.method37788(var0, field16006.length)];
   }
}
