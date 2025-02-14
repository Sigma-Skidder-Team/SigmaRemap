package mapped;

import com.mojang.bridge.game.Language;

public class Class2019 implements Language, Comparable<Class2019> {
   private final String field13106;
   private final String field13107;
   private final String field13108;
   private final boolean field13109;

   public Class2019(String var1, String var2, String var3, boolean var4) {
      this.field13106 = var1;
      this.field13107 = var2;
      this.field13108 = var3;
      this.field13109 = var4;
   }

   public String getCode() {
      return this.field13106;
   }

   public String getName() {
      return this.field13108;
   }

   public String getRegion() {
      return this.field13107;
   }

   public boolean method8551() {
      return this.field13109;
   }

   @Override
   public String toString() {
      return String.format("%s (%s)", this.field13108, this.field13107);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         return var1 instanceof Class2019 ? this.field13106.equals(((Class2019)var1).field13106) : false;
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field13106.hashCode();
   }

   public int compareTo(Class2019 var1) {
      return this.field13106.compareTo(var1.field13106);
   }
}
