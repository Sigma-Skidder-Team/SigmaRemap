package net.minecraft.util.text;

import com.google.gson.*;
import mapped.ResourceLocation;
import mapped.Class2496;
import mapped.JSONUtils;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;

import javax.annotation.Nullable;
import java.lang.reflect.Type;

public class Style$Serializer implements JsonDeserializer<Style>, JsonSerializer<Style> {
   @Nullable
   public Style deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException {
      if (p_deserialize_1_.isJsonObject()) {
         JsonObject obool = p_deserialize_1_.getAsJsonObject();
         if (obool == null) {
            return null;
         } else {
            Boolean obool1 = deserializeBooleanValue(obool, "bold");
            Boolean obool2 = deserializeBooleanValue(obool, "italic");
            Boolean obool3 = deserializeBooleanValue(obool, "underlined");
            Boolean obool4 = deserializeBooleanValue(obool, "strikethrough");
            Boolean color = deserializeBooleanValue(obool, "obfuscated");
            Color s = deserializeColor(obool);
            String clickevent = deserializeInsertion(obool);
            ClickEvent hoverevent = deserializeClickEvent(obool);
            HoverEvent resourcelocation = deserializeHoverEvent(obool);
            ResourceLocation var16 = deserializeFont(obool);
            return new Style(s, obool1, obool2, obool3, obool4, color, hoverevent, resourcelocation, clickevent, var16);
         }
      } else {
         return null;
      }
   }

   @Nullable
   private static ResourceLocation deserializeFont(JsonObject json) {
      if (json.has("font")) {
         String resourcelocationexception = JSONUtils.method32763(json, "font");

         try {
            return new ResourceLocation(resourcelocationexception);
         } catch (Class2496 var5) {
            throw new JsonSyntaxException("Invalid font name: " + resourcelocationexception);
         }
      } else {
         return null;
      }
   }

   @Nullable
   private static HoverEvent deserializeHoverEvent(JsonObject json) {
      if (json.has("hoverEvent")) {
         JsonObject hoverevent = JSONUtils.method32782(json, "hoverEvent");
         HoverEvent var4 = HoverEvent.deserialize(hoverevent);
         if (var4 != null && var4.getAction().shouldAllowInChat()) {
            return var4;
         }
      }

      return null;
   }

   @Nullable
   private static ClickEvent deserializeClickEvent(JsonObject json) {
      if (json.has("clickEvent")) {
         JsonObject s = JSONUtils.method32782(json, "clickEvent");
         String clickevent$action = JSONUtils.method32764(s, "action", (String)null);
         ClickEvent$Action s1 = clickevent$action == null ? null : ClickEvent$Action.getValueByCanonicalName(clickevent$action);
         String var6 = JSONUtils.method32764(s, "value", (String)null);
         if (s1 != null && var6 != null && s1.shouldAllowInChat()) {
            return new ClickEvent(s1, var6);
         }
      }

      return null;
   }

   @Nullable
   private static String deserializeInsertion(JsonObject json) {
      return JSONUtils.method32764(json, "insertion", (String)null);
   }

   @Nullable
   private static Color deserializeColor(JsonObject json) {
      if (json.has("color")) {
         String var3 = JSONUtils.method32763(json, "color");
         return Color.func_240745_a_(var3);
      } else {
         return null;
      }
   }

   @Nullable
   private static Boolean deserializeBooleanValue(JsonObject json, String memberName) {
      return json.has(memberName) ? json.get(memberName).getAsBoolean() : null;
   }

   @Nullable
   public JsonElement serialize(Style p_serialize_1_, Type p_serialize_2_, JsonSerializationContext p_serialize_3_) {
      if (p_serialize_1_.isEmpty()) {
         return null;
      } else {
         JsonObject jsonobject1 = new JsonObject();
         if (Style.access$100(p_serialize_1_) != null) {
            jsonobject1.addProperty("bold", Style.access$100(p_serialize_1_));
         }

         if (Style.access$200(p_serialize_1_) != null) {
            jsonobject1.addProperty("italic", Style.access$200(p_serialize_1_));
         }

         if (Style.access$300(p_serialize_1_) != null) {
            jsonobject1.addProperty("underlined", Style.access$300(p_serialize_1_));
         }

         if (Style.access$400(p_serialize_1_) != null) {
            jsonobject1.addProperty("strikethrough", Style.access$400(p_serialize_1_));
         }

         if (Style.access$500(p_serialize_1_) != null) {
            jsonobject1.addProperty("obfuscated", Style.access$500(p_serialize_1_));
         }

         if (Style.access$600(p_serialize_1_) != null) {
            jsonobject1.addProperty("color", Style.access$600(p_serialize_1_).func_240747_b_());
         }

         if (Style.access$700(p_serialize_1_) != null) {
            jsonobject1.add("insertion", p_serialize_3_.serialize(Style.access$700(p_serialize_1_)));
         }

         if (Style.access$800(p_serialize_1_) != null) {
            JsonObject var7 = new JsonObject();
            var7.addProperty("action", Style.access$800(p_serialize_1_).getAction().getCanonicalName());
            var7.addProperty("value", Style.access$800(p_serialize_1_).getValue());
            jsonobject1.add("clickEvent", var7);
         }

         if (Style.access$900(p_serialize_1_) != null) {
            jsonobject1.add("hoverEvent", Style.access$900(p_serialize_1_).serialize());
         }

         if (Style.access$1000(p_serialize_1_) != null) {
            jsonobject1.addProperty("font", Style.access$1000(p_serialize_1_).toString());
         }

         return jsonobject1;
      }
   }
}
