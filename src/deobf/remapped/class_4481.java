package remapped;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class class_4481 implements class_4038 {
   private static String[] field_21849;
   private final String field_21847;
   private final class_4639 field_21850;
   private final InputStream field_21852;
   private final InputStream field_21848;
   private boolean field_21851;
   private JsonObject field_21853;

   public class_4481(String var1, class_4639 var2, InputStream var3, InputStream var4) {
      this.field_21847 = var1;
      this.field_21850 = var2;
      this.field_21852 = var3;
      this.field_21848 = var4;
   }

   @Override
   public class_4639 method_18578() {
      return this.field_21850;
   }

   @Override
   public InputStream method_18576() {
      return this.field_21852;
   }

   public boolean method_20807() {
      return this.field_21848 != null;
   }

   @Nullable
   @Override
   public <T> T method_18577(class_6146<T> var1) {
      if (!this.method_20807()) {
         return null;
      } else {
         if (this.field_21853 == null && !this.field_21851) {
            this.field_21851 = true;
            BufferedReader var4 = null;

            try {
               var4 = new BufferedReader(new InputStreamReader(this.field_21848, StandardCharsets.UTF_8));
               this.field_21853 = class_6539.method_29805(var4);
            } finally {
               IOUtils.closeQuietly(var4);
            }
         }

         if (this.field_21853 == null) {
            return null;
         } else {
            String var8 = var1.method_28196();
            return (T)(this.field_21853.has(var8) ? var1.method_28197(class_6539.method_29783(this.field_21853, var8)) : null);
         }
      }
   }

   @Override
   public String method_18579() {
      return this.field_21847;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_4481) {
            class_4481 var4 = (class_4481)var1;
            if (this.field_21850 == null) {
               if (var4.field_21850 != null) {
                  return false;
               }
            } else if (!this.field_21850.equals(var4.field_21850)) {
               return false;
            }

            if (this.field_21847 == null) {
               if (var4.field_21847 != null) {
                  return false;
               }
            } else if (!this.field_21847.equals(var4.field_21847)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_21847 == null ? 0 : this.field_21847.hashCode();
      return 31 * var3 + (this.field_21850 == null ? 0 : this.field_21850.hashCode());
   }

   @Override
   public void close() throws IOException {
      this.field_21852.close();
      if (this.field_21848 != null) {
         this.field_21848.close();
      }
   }
}
