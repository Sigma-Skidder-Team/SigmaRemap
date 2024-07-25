package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.Array;

public abstract class class_5287 implements Cloneable {
   private String field_27032;

   public class_5287(String var1) {
      this.field_27032 = var1;
   }

   public final String method_24126() {
      return this.field_27032;
   }

   public abstract Object method_24129();

   public abstract void method_24130(DataInput var1) throws IOException;

   public abstract void method_24127(DataOutput var1) throws IOException;

   public abstract class_5287 clone();

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof class_5287) {
         class_5287 var4 = (class_5287)var1;
         if (!this.method_24126().equals(var4.method_24126())) {
            return false;
         } else if (this.method_24129() != null) {
            if (var4.method_24129() == null) {
               return false;
            } else if (this.method_24129().getClass().isArray() && var4.method_24129().getClass().isArray()) {
               int var5 = Array.getLength(this.method_24129());
               if (Array.getLength(var4.method_24129()) != var5) {
                  return false;
               } else {
                  for (int var6 = 0; var6 < var5; var6++) {
                     Object var7 = Array.get(this.method_24129(), var6);
                     Object var8 = Array.get(var4.method_24129(), var6);
                     if (var7 == null && var8 != null || var7 != null && !var7.equals(var8)) {
                        return false;
                     }
                  }

                  return true;
               }
            } else {
               return this.method_24129().equals(var4.method_24129());
            }
         } else {
            return var4.method_24129() == null;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      String var3 = this.method_24126() != null && !this.method_24126().equals("") ? "(" + this.method_24126() + ")" : "";
      String var4 = "";
      if (this.method_24129() != null) {
         var4 = this.method_24129().toString();
         if (this.method_24129().getClass().isArray()) {
            StringBuilder var5 = new StringBuilder();
            var5.append("[");

            for (int var6 = 0; var6 < Array.getLength(this.method_24129()); var6++) {
               if (var6 > 0) {
                  var5.append(", ");
               }

               var5.append(Array.get(this.method_24129(), var6));
            }

            var5.append("]");
            var4 = var5.toString();
         }
      }

      return this.getClass().getSimpleName() + var3 + " { " + var4 + " }";
   }
}
