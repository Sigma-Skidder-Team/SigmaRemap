package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Arrays;

public class Class7112 {
   private static String[] field30631;
   public final short[] field30632;

   public Class7112(short[] var1) {
      this.field30632 = var1;
   }

   public Class7112(int var1, JsonObject var2, JsonObject var3, JsonObject var4) {
      this.field30632 = new short[var1];
      Arrays.fill(this.field30632, (short)-1);
      Class8159.method28362(this.field30632, var2, var3, var4);
   }

   public Class7112(JsonObject var1, JsonObject var2, JsonObject var3) {
      this(var1.entrySet().size(), var1, var2, var3);
   }

   public Class7112(int var1, JsonObject var2, JsonObject var3) {
      this.field30632 = new short[var1];
      Arrays.fill(this.field30632, (short)-1);
      Class8159.method28361(this.field30632, var2, var3);
   }

   public Class7112(JsonObject var1, JsonObject var2) {
      this(var1.entrySet().size(), var1, var2);
   }

   public Class7112(int var1, JsonArray var2, JsonArray var3, JsonObject var4, boolean var5) {
      this.field30632 = new short[var1];
      Arrays.fill(this.field30632, (short)-1);
      Class8159.method28365(this.field30632, var2, var3, var4, var5);
   }

   public Class7112(int var1, JsonArray var2, JsonArray var3, boolean var4) {
      this(var1, var2, var3, null, var4);
   }

   public Class7112(JsonArray var1, JsonArray var2, boolean var3) {
      this(var1.size(), var1, var2, var3);
   }

   public Class7112(int var1, JsonArray var2, JsonArray var3) {
      this(var1, var2, var3, true);
   }

   public Class7112(JsonArray var1, JsonArray var2, JsonObject var3) {
      this(var1.size(), var1, var2, var3, true);
   }

   public Class7112(JsonArray var1, JsonArray var2) {
      this(var1.size(), var1, var2, true);
   }

   public int method22147(int var1) {
      return var1 >= 0 && var1 < this.field30632.length ? this.field30632[var1] : -1;
   }

   public short[] method22148() {
      return this.field30632;
   }
}
