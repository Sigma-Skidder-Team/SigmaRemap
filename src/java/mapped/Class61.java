package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.Array;

public abstract class Class61 implements Cloneable {
   private String field134;

   public Class61(String var1) {
      this.field134 = var1;
   }

   public final String method206() {
      return this.field134;
   }

   public abstract Object method205();

   public abstract void method203(DataInput var1) throws IOException;

   public abstract void method204(DataOutput var1) throws IOException;

   public abstract Class61 clone();

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof Class61) {
         Class61 var4 = (Class61)var1;
         if (!this.method206().equals(var4.method206())) {
            return false;
         } else if (this.method205() != null) {
            if (var4.method205() == null) {
               return false;
            } else if (this.method205().getClass().isArray() && var4.method205().getClass().isArray()) {
               int var5 = Array.getLength(this.method205());
               if (Array.getLength(var4.method205()) != var5) {
                  return false;
               } else {
                  for (int var6 = 0; var6 < var5; var6++) {
                     Object var7 = Array.get(this.method205(), var6);
                     Object var8 = Array.get(var4.method205(), var6);
                     if (var7 == null && var8 != null || var7 != null && !var7.equals(var8)) {
                        return false;
                     }
                  }

                  return true;
               }
            } else {
               return this.method205().equals(var4.method205());
            }
         } else {
            return var4.method205() == null;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      String var3 = this.method206() != null && !this.method206().equals("") ? "(" + this.method206() + ")" : "";
      String var4 = "";
      if (this.method205() != null) {
         var4 = this.method205().toString();
         if (this.method205().getClass().isArray()) {
            StringBuilder var5 = new StringBuilder();
            var5.append("[");

            for (int var6 = 0; var6 < Array.getLength(this.method205()); var6++) {
               if (var6 > 0) {
                  var5.append(", ");
               }

               var5.append(Array.get(this.method205(), var6));
            }

            var5.append("]");
            var4 = var5.toString();
         }
      }

      return this.getClass().getSimpleName() + var3 + " { " + var4 + " }";
   }
}
