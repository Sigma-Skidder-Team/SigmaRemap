package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Arrays;

public class class_1392 {
   private static String[] field_7590;
   public final short[] field_7589;

   public class_1392(short[] var1) {
      this.field_7589 = var1;
   }

   public class_1392(int var1, JsonObject var2, JsonObject var3, JsonObject var4) {
      this.field_7589 = new short[var1];
      Arrays.fill(this.field_7589, (short)-1);
      class_3792.method_17620(this.field_7589, var2, var3, var4);
   }

   public class_1392(JsonObject var1, JsonObject var2, JsonObject var3) {
      this(var1.entrySet().size(), var1, var2, var3);
   }

   public class_1392(int var1, JsonObject var2, JsonObject var3) {
      this.field_7589 = new short[var1];
      Arrays.fill(this.field_7589, (short)-1);
      class_3792.method_17619(this.field_7589, var2, var3);
   }

   public class_1392(JsonObject var1, JsonObject var2) {
      this(var1.entrySet().size(), var1, var2);
   }

   public class_1392(int var1, JsonArray var2, JsonArray var3, JsonObject var4, boolean var5) {
      this.field_7589 = new short[var1];
      Arrays.fill(this.field_7589, (short)-1);
      class_3792.method_17617(this.field_7589, var2, var3, var4, var5);
   }

   public class_1392(int var1, JsonArray var2, JsonArray var3, boolean var4) {
      this(var1, var2, var3, null, var4);
   }

   public class_1392(JsonArray var1, JsonArray var2, boolean var3) {
      this(var1.size(), var1, var2, var3);
   }

   public class_1392(int var1, JsonArray var2, JsonArray var3) {
      this(var1, var2, var3, true);
   }

   public class_1392(JsonArray var1, JsonArray var2, JsonObject var3) {
      this(var1.size(), var1, var2, var3, true);
   }

   public class_1392(JsonArray var1, JsonArray var2) {
      this(var1.size(), var1, var2, true);
   }

   public int method_6437(int var1) {
      return var1 >= 0 && var1 < this.field_7589.length ? this.field_7589[var1] : -1;
   }

   public short[] method_6436() {
      return this.field_7589;
   }
}
