package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class class_8984 {
   private static final SimpleDateFormat field_46020 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private Date field_46021;

   public boolean method_41192() {
      return this.field_46021 != null;
   }

   public void method_41189() {
      this.field_46021 = new Date();
   }

   public void method_41191() {
      this.field_46021 = null;
   }

   public Date method_41193() {
      return this.field_46021;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.field_46021 != null ? this.field_46021 : "false") + '}';
   }

   public void method_41188(class_8248 var1) {
      var1.writeBoolean(this.field_46021 != null);
      if (this.field_46021 != null) {
         var1.method_37751(this.field_46021);
      }
   }

   public JsonElement method_41186() {
      return (JsonElement)(this.field_46021 == null ? JsonNull.INSTANCE : new JsonPrimitive(field_46020.format(this.field_46021)));
   }

   public static class_8984 method_41194(class_8248 var0) {
      class_8984 var3 = new class_8984();
      if (var0.readBoolean()) {
         var3.field_46021 = var0.method_37772();
      }

      return var3;
   }

   public static class_8984 method_41187(String var0) {
      class_8984 var3 = new class_8984();

      try {
         var3.field_46021 = field_46020.parse(var0);
         return var3;
      } catch (ParseException var5) {
         throw new JsonSyntaxException("Invalid datetime: " + var0, var5);
      }
   }
}
