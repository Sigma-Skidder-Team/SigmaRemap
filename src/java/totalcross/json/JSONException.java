package totalcross.json;

import com.google.common.collect.Lists;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class JSONException extends IOException {
   private final List<Class6388> field16535 = Lists.newArrayList();
   private final String field16536;

   public JSONException(String var1) {
      this.field16535.add(new Class6388());
      this.field16536 = var1;
   }

   public JSONException(String var1, Throwable var2) {
      super(var2);
      this.field16535.add(new Class6388());
      this.field16536 = var1;
   }

   public JSONException(Exception e) {
       throw new JSONException2(e);
   }

   public void method10462(String var1) {
      Class6388.method19418(this.field16535.get(0), var1);
   }

   public void method10463(String var1) {
      Class6388.method19419(this.field16535.get(0), var1);
      this.field16535.add(0, new Class6388());
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.field16535.get(this.field16535.size() - 1) + ": " + this.field16536;
   }

   public static JSONException method10464(Exception var0) {
      if (!(var0 instanceof JSONException)) {
         String var3 = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            var3 = "File not found";
         }

         return new JSONException(var3, var0);
      } else {
         return (JSONException)var0;
      }
   }
}
