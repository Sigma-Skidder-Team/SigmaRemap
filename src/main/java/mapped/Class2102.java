package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2102 {
   field13698(0),
   field13699(1),
   field13700(2),
   field13701(3),
   field13702(4);

   private static final Class2102[] field13703 = Arrays.<Class2102>stream(values())
      .sorted(Comparator.comparingInt(Class2102::method8766))
      .<Class2102>toArray(Class2102[]::new);
   private final int field13704;
   private static final Class2102[] field13705 = new Class2102[]{field13698, field13699, field13700, field13701, field13702};

   private Class2102(int var3) {
      this.field13704 = var3;
   }

   public int method8766() {
      return this.field13704;
   }

   public static Class2102 method8767(int var0) {
      return field13703[var0 % field13703.length];
   }
}
