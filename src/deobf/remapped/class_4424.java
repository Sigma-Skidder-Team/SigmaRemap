package remapped;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.util.text.ITextComponent;

public abstract class class_4424<T> extends class_8227<T> {
   public static final SimpleDateFormat field_21622 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   public final Date field_21623;
   public final String field_21621;
   public final Date field_21620;
   public final String field_21624;

   public class_4424(T var1, Date var2, String var3, Date var4, String var5) {
      super((T)var1);
      this.field_21623 = var2 != null ? var2 : new Date();
      this.field_21621 = var3 != null ? var3 : "(Unknown)";
      this.field_21620 = var4;
      this.field_21624 = var5 != null ? var5 : "Banned by an operator.";
   }

   public class_4424(T var1, JsonObject var2) {
      super((T)var1);

      Date var5;
      try {
         var5 = var2.has("created") ? field_21622.parse(var2.get("created").getAsString()) : new Date();
      } catch (ParseException var9) {
         var5 = new Date();
      }

      this.field_21623 = var5;
      this.field_21621 = var2.has("source") ? var2.get("source").getAsString() : "(Unknown)";

      Date var6;
      try {
         var6 = var2.has("expires") ? field_21622.parse(var2.get("expires").getAsString()) : null;
      } catch (ParseException var8) {
         var6 = null;
      }

      this.field_21620 = var6;
      this.field_21624 = var2.has("reason") ? var2.get("reason").getAsString() : "Banned by an operator.";
   }

   public String method_20566() {
      return this.field_21621;
   }

   public Date method_20563() {
      return this.field_21620;
   }

   public String method_20564() {
      return this.field_21624;
   }

   public abstract ITextComponent method_20565();

   @Override
   public boolean method_37663() {
      return this.field_21620 != null ? this.field_21620.before(new Date()) : false;
   }

   @Override
   public void method_37664(JsonObject var1) {
      var1.addProperty("created", field_21622.format(this.field_21623));
      var1.addProperty("source", this.field_21621);
      var1.addProperty("expires", this.field_21620 != null ? field_21622.format(this.field_21620) : "forever");
      var1.addProperty("reason", this.field_21624);
   }
}
