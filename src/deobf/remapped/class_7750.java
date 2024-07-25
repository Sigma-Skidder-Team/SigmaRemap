package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_7750 {
   private final ITextComponent field_39298;
   private final ITextComponent field_39290;
   private final class_6098 field_39297;
   private final Identifier field_39291;
   private final class_3361 field_39300;
   private final boolean field_39292;
   private final boolean field_39294;
   private final boolean field_39293;
   private float field_39299;
   private float field_39295;

   public class_7750(class_6098 var1, ITextComponent var2, ITextComponent var3, Identifier var4, class_3361 var5, boolean var6, boolean var7, boolean var8) {
      this.field_39298 = var2;
      this.field_39290 = var3;
      this.field_39297 = var1;
      this.field_39291 = var4;
      this.field_39300 = var5;
      this.field_39292 = var6;
      this.field_39294 = var7;
      this.field_39293 = var8;
   }

   public void method_35155(float var1, float var2) {
      this.field_39299 = var1;
      this.field_39295 = var2;
   }

   public ITextComponent method_35160() {
      return this.field_39298;
   }

   public ITextComponent method_35167() {
      return this.field_39290;
   }

   public class_6098 method_35151() {
      return this.field_39297;
   }

   @Nullable
   public Identifier method_35164() {
      return this.field_39291;
   }

   public class_3361 method_35157() {
      return this.field_39300;
   }

   public float method_35153() {
      return this.field_39299;
   }

   public float method_35162() {
      return this.field_39295;
   }

   public boolean method_35150() {
      return this.field_39292;
   }

   public boolean method_35163() {
      return this.field_39294;
   }

   public boolean method_35158() {
      return this.field_39293;
   }

   public static class_7750 method_35159(JsonObject var0) {
      IFormattableTextComponent var3 = ITextComponent$class_40.func_240641_a_(var0.get("title"));
      IFormattableTextComponent var4 = ITextComponent$class_40.func_240641_a_(var0.get("description"));
      if (var3 != null && var4 != null) {
         class_6098 var5 = method_35152(class_6539.method_29783(var0, "icon"));
         Identifier var6 = !var0.has("background") ? null : new Identifier(class_6539.method_29796(var0, "background"));
         class_3361 var7 = !var0.has("frame") ? class_3361.field_16556 : class_3361.method_15387(class_6539.method_29796(var0, "frame"));
         boolean var8 = class_6539.method_29772(var0, "show_toast", true);
         boolean var9 = class_6539.method_29772(var0, "announce_to_chat", true);
         boolean var10 = class_6539.method_29772(var0, "hidden", false);
         return new class_7750(var5, var3, var4, var6, var7, var8, var9, var10);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static class_6098 method_35152(JsonObject var0) {
      if (!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         class_2451 var3 = class_6539.method_29781(var0, "item");
         if (var0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            class_6098 var4 = new class_6098(var3);
            if (var0.has("nbt")) {
               try {
                  class_5734 var5 = class_2392.method_10916(class_6539.method_29795(var0.get("nbt"), "nbt"));
                  var4.method_27965(var5);
               } catch (CommandSyntaxException var6) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var6.getMessage());
               }
            }

            return var4;
         }
      }
   }

   public void method_35156(class_8248 var1) {
      var1.method_37779(this.field_39298);
      var1.method_37779(this.field_39290);
      var1.method_37764(this.field_39297);
      var1.method_37750(this.field_39300);
      byte var4 = 0;
      if (this.field_39291 != null) {
         var4 |= 1;
      }

      if (this.field_39292) {
         var4 |= 2;
      }

      if (this.field_39293) {
         var4 |= 4;
      }

      var1.writeInt(var4);
      if (this.field_39291 != null) {
         var1.method_37780(this.field_39291);
      }

      var1.writeFloat(this.field_39299);
      var1.writeFloat(this.field_39295);
   }

   public static class_7750 method_35165(class_8248 var0) {
      ITextComponent var3 = var0.method_37776();
      ITextComponent var4 = var0.method_37776();
      class_6098 var5 = var0.method_37755();
      class_3361 var6 = var0.<class_3361>method_37787(class_3361.class);
      int var7 = var0.readInt();
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = false;
      class_7750 var11 = new class_7750(var5, var3, var4, (Identifier)var8, var6, var9, false, var10);
      var11.method_35155(var0.readFloat(), var0.readFloat());
      return var11;
   }

   public JsonElement method_35166() {
      JsonObject var3 = new JsonObject();
      var3.add("icon", this.method_35154());
      var3.add("title", ITextComponent$class_40.toJsonTree(this.field_39298));
      var3.add("description", ITextComponent$class_40.toJsonTree(this.field_39290));
      var3.addProperty("frame", this.field_39300.method_15385());
      var3.addProperty("show_toast", this.field_39292);
      var3.addProperty("announce_to_chat", this.field_39294);
      var3.addProperty("hidden", this.field_39293);
      if (this.field_39291 != null) {
         var3.addProperty("background", this.field_39291.toString());
      }

      return var3;
   }

   private JsonObject method_35154() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", class_8669.field_44382.method_39797(this.field_39297.method_27960()).toString());
      if (this.field_39297.method_28002()) {
         var3.addProperty("nbt", this.field_39297.method_27990().toString());
      }

      return var3;
   }
}
