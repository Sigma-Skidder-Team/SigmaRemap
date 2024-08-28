package mapped;

import java.util.regex.Pattern;

public class Class8801 implements Class8800 {
   private static final Pattern field39626 = Pattern.compile(" ");
   private static final Pattern field39627 = Pattern.compile(",");
   private final String field39628;

   public Class8801(String var1) {
      if (var1 != null) {
         this.field39628 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public boolean method31776(String var1) {
      String var4 = field39626.matcher(var1).replaceAll("");
      String[] var5 = field39627.split(var4);

      for (String var9 : var5) {
         if (this.field39628.equals(var9)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public String method31777() {
      return this.field39628;
   }

   @Override
   public Class8800 method31778() {
      return new Class8801(this.method31777());
   }

   @Override
   public String toString() {
      return this.method31777();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class8801 var4 = (Class8801)var1;
            return this.field39628.equals(var4.field39628);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field39628.hashCode();
   }
}
