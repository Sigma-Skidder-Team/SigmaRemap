package mapped;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.util.text.ITextComponent;

public abstract class Class6787<T> extends Class6789<T> {
   public static final SimpleDateFormat field29579 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   public final Date field29580;
   public final String field29581;
   public final Date field29582;
   public final String field29583;

   public Class6787(T var1, Date var2, String var3, Date var4, String var5) {
      super((T)var1);
      this.field29580 = var2 != null ? var2 : new Date();
      this.field29581 = var3 != null ? var3 : "(Unknown)";
      this.field29582 = var4;
      this.field29583 = var5 != null ? var5 : "Banned by an operator.";
   }

   public Class6787(T var1, JsonObject var2) {
      super((T)var1);

      Date var5;
      try {
         var5 = var2.has("created") ? field29579.parse(var2.get("created").getAsString()) : new Date();
      } catch (ParseException var9) {
         var5 = new Date();
      }

      this.field29580 = var5;
      this.field29581 = var2.has("source") ? var2.get("source").getAsString() : "(Unknown)";

      Date var6;
      try {
         var6 = var2.has("expires") ? field29579.parse(var2.get("expires").getAsString()) : null;
      } catch (ParseException var8) {
         var6 = null;
      }

      this.field29582 = var6;
      this.field29583 = var2.has("reason") ? var2.get("reason").getAsString() : "Banned by an operator.";
   }

   public String method20681() {
      return this.field29581;
   }

   public Date method20682() {
      return this.field29582;
   }

   public String method20683() {
      return this.field29583;
   }

   public abstract ITextComponent method20679();

   @Override
   public boolean method20684() {
      return this.field29582 != null ? this.field29582.before(new Date()) : false;
   }

   @Override
   public void method20678(JsonObject var1) {
      var1.addProperty("created", field29579.format(this.field29580));
      var1.addProperty("source", this.field29581);
      var1.addProperty("expires", this.field29582 != null ? field29579.format(this.field29582) : "forever");
      var1.addProperty("reason", this.field29583);
   }
}
