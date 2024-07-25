package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_2229 extends class_599 {
   private final class_5217 field_11124;

   public class_2229(class_5217 var1) {
      super("minecraft", "realms");
      this.field_11124 = var1;
   }

   @Nullable
   @Override
   public InputStream method_2812(class_3168 var1, class_4639 var2) {
      if (var1 == class_3168.field_15844) {
         File var5 = this.field_11124.method_23900(var2);
         if (var5 != null && var5.exists()) {
            try {
               return new FileInputStream(var5);
            } catch (FileNotFoundException var7) {
            }
         }
      }

      return super.method_2812(var1, var2);
   }

   @Override
   public boolean 郝䡸㹔柿Ꮺ쟗(class_3168 var1, class_4639 var2) {
      if (var1 == class_3168.field_15844) {
         File var5 = this.field_11124.method_23900(var2);
         if (var5 != null && var5.exists()) {
            return true;
         }
      }

      return super.郝䡸㹔柿Ꮺ쟗(var1, var2);
   }

   @Nullable
   @Override
   public InputStream method_2811(String var1) {
      File var4 = this.field_11124.method_23899(var1);
      if (var4 != null && var4.exists()) {
         try {
            return new FileInputStream(var4);
         } catch (FileNotFoundException var6) {
         }
      }

      return super.method_2811(var1);
   }

   @Override
   public Collection<class_4639> ศ哝呓뎫顸瀳(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5) {
      Collection var8 = super.ศ哝呓뎫顸瀳(var1, var2, var3, var4, var5);
      var8.addAll(this.field_11124.method_23898(var3, var2, var4, var5));
      return var8;
   }
}
