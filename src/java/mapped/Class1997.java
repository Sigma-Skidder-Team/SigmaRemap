package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Locale;

public class Class1997 extends ResourceLocation {
   private final String field13024;

   public Class1997(String[] var1) {
      super(var1);
      this.field13024 = var1[2].toLowerCase(Locale.ROOT);
   }

   public Class1997(String var1) {
      this(method8302(var1));
   }

   public Class1997(ResourceLocation var1, String var2) {
      this(var1.toString(), var2);
   }

   public Class1997(String var1, String var2) {
      this(method8302(var1 + '#' + var2));
   }

   public static String[] method8302(String var0) {
      String[] var3 = new String[]{null, var0, ""};
      int var4 = var0.indexOf(35);
      String var5 = var0;
      if (var4 >= 0) {
         var3[2] = var0.substring(var4 + 1, var0.length());
         if (var4 > 1) {
            var5 = var0.substring(0, var4);
         }
      }

      System.arraycopy(ResourceLocation.method8290(var5, ':'), 0, var3, 0, 2);
      return var3;
   }

   public String method8303() {
      return this.field13024;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class1997 && super.equals(var1)) {
            Class1997 var4 = (Class1997)var1;
            return this.field13024.equals(var4.field13024);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.field13024.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + '#' + this.field13024;
   }
}
