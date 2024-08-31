package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import net.minecraft.network.PacketBuffer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Class9599 {
   private static final SimpleDateFormat field44910 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private Date field44911;

   public boolean method37263() {
      return this.field44911 != null;
   }

   public void method37264() {
      this.field44911 = new Date();
   }

   public void method37265() {
      this.field44911 = null;
   }

   public Date method37266() {
      return this.field44911;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.field44911 != null ? this.field44911 : "false") + '}';
   }

   public void method37267(PacketBuffer var1) {
      var1.writeBoolean(this.field44911 != null);
      if (this.field44911 != null) {
         var1.method35734(this.field44911);
      }
   }

   public JsonElement method37268() {
      return (JsonElement)(this.field44911 == null ? JsonNull.INSTANCE : new JsonPrimitive(field44910.format(this.field44911)));
   }

   public static Class9599 method37269(PacketBuffer var0) {
      Class9599 var3 = new Class9599();
      if (var0.readBoolean()) {
         var3.field44911 = var0.method35733();
      }

      return var3;
   }

   public static Class9599 method37270(String var0) {
      Class9599 var3 = new Class9599();

      try {
         var3.field44911 = field44910.parse(var0);
         return var3;
      } catch (ParseException var5) {
         throw new JsonSyntaxException("Invalid datetime: " + var0, var5);
      }
   }
}
