package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2119 {
   field13807(0, "small_ball"),
   field13808(1, "large_ball"),
   field13809(2, "star"),
   field13810(3, "creeper"),
   field13811(4, "burst");

   private static final Class2119[] field13812 = Arrays.<Class2119>stream(values())
      .sorted(Comparator.comparingInt(var0 -> var0.field13813))
      .<Class2119>toArray(Class2119[]::new);
   private final int field13813;
   private final String field13814;
   private static final Class2119[] field13815 = new Class2119[]{field13807, field13808, field13809, field13810, field13811};

   private Class2119(int var3, String var4) {
      this.field13813 = var3;
      this.field13814 = var4;
   }

   public int method8800() {
      return this.field13813;
   }

   public String method8801() {
      return this.field13814;
   }

   public static Class2119 method8802(int var0) {
      return var0 >= 0 && var0 < field13812.length ? field13812[var0] : field13807;
   }
}
