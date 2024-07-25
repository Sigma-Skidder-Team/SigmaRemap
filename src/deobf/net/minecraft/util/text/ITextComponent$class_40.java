package net.minecraft.util.text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import remapped.class_4639;
import remapped.class_6539;
import remapped.class_9303;
import remapped.Util;

public class ITextComponent$class_40 implements JsonDeserializer<IFormattableTextComponent>, JsonSerializer<ITextComponent> {
   private static final Gson GSON = Util.<Gson>method_44660(() -> {
      GsonBuilder var2 = new GsonBuilder();
      var2.disableHtmlEscaping();
      var2.registerTypeHierarchyAdapter(ITextComponent.class, new ITextComponent$class_40());
      var2.registerTypeHierarchyAdapter(Style.class, new Style$class_46());
      var2.registerTypeAdapterFactory(new class_9303());
      return var2.create();
   });
   private static final Field JSON_READER_POS_FIELD = Util.<Field>method_44660(() -> {
      try {
         new JsonReader(new StringReader(""));
         Field var2 = JsonReader.class.getDeclaredField("pos");
         var2.setAccessible(true);
         return var2;
      } catch (NoSuchFieldException var3) {
         throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var3);
      }
   });
   private static final Field JSON_READER_LINESTART_FIELD = Util.<Field>method_44660(() -> {
      try {
         new JsonReader(new StringReader(""));
         Field var2 = JsonReader.class.getDeclaredField("lineStart");
         var2.setAccessible(true);
         return var2;
      } catch (NoSuchFieldException var3) {
         throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var3);
      }
   });

   public IFormattableTextComponent deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException {
      if (p_deserialize_1_.isJsonPrimitive()) {
         return new StringTextComponent(p_deserialize_1_.getAsString());
      } else if (!p_deserialize_1_.isJsonObject()) {
         if (p_deserialize_1_.isJsonArray()) {
            JsonArray var13 = p_deserialize_1_.getAsJsonArray();
            IFormattableTextComponent var14 = null;

            for (JsonElement var21 : var13) {
               IFormattableTextComponent var22 = this.deserialize(var21, var21.getClass(), p_deserialize_3_);
               if (var14 == null) {
                  var14 = var22;
               } else {
                  var14.append(var22);
               }
            }

            return var14;
         } else {
            throw new JsonParseException("Don't know how to turn " + p_deserialize_1_ + " into a Component");
         }
      } else {
         JsonObject iformattabletextcomponent = p_deserialize_1_.getAsJsonObject();
         Object jsonarray2;
         if (iformattabletextcomponent.has("text")) {
            jsonarray2 = new StringTextComponent(class_6539.method_29796(iformattabletextcomponent, "text"));
         } else if (iformattabletextcomponent.has("translate")) {
            String j = class_6539.method_29796(iformattabletextcomponent, "translate");
            if (iformattabletextcomponent.has("with")) {
               JsonArray aobject = class_6539.method_29787(iformattabletextcomponent, "with");
               Object[] i = new Object[aobject.size()];

               for (int stringtextcomponent = 0; stringtextcomponent < i.length; stringtextcomponent++) {
                  i[stringtextcomponent] = this.deserialize(aobject.get(stringtextcomponent), p_deserialize_2_, p_deserialize_3_);
                  if (i[stringtextcomponent] instanceof StringTextComponent) {
                     StringTextComponent var12 = (StringTextComponent)i[stringtextcomponent];
                     if (var12.getStyle().isEmpty() && var12.getSiblings().isEmpty()) {
                        i[stringtextcomponent] = var12.getText();
                     }
                  }
               }

               jsonarray2 = new TranslationTextComponent(j, i);
            } else {
               jsonarray2 = new TranslationTextComponent(j);
            }
         } else if (iformattabletextcomponent.has("score")) {
            JsonObject var15 = class_6539.method_29783(iformattabletextcomponent, "score");
            if (!var15.has("name") || !var15.has("objective")) {
               throw new JsonParseException("A score component needs a least a name and an objective");
            }

            jsonarray2 = new ScoreTextComponent(class_6539.method_29796(var15, "name"), class_6539.method_29796(var15, "objective"));
         } else if (iformattabletextcomponent.has("selector")) {
            jsonarray2 = new SelectorTextComponent(class_6539.method_29796(iformattabletextcomponent, "selector"));
         } else if (iformattabletextcomponent.has("keybind")) {
            jsonarray2 = new KeybindTextComponent(class_6539.method_29796(iformattabletextcomponent, "keybind"));
         } else {
            if (!iformattabletextcomponent.has("nbt")) {
               throw new JsonParseException("Don't know how to turn " + p_deserialize_1_ + " into a Component");
            }

            String var16 = class_6539.method_29796(iformattabletextcomponent, "nbt");
            boolean var19 = class_6539.method_29772(iformattabletextcomponent, "interpret", false);
            if (iformattabletextcomponent.has("block")) {
               jsonarray2 = new NBTTextComponent$class_43(var16, var19, class_6539.method_29796(iformattabletextcomponent, "block"));
            } else if (iformattabletextcomponent.has("entity")) {
               jsonarray2 = new NBTTextComponent$class_44(var16, var19, class_6539.method_29796(iformattabletextcomponent, "entity"));
            } else {
               if (!iformattabletextcomponent.has("storage")) {
                  throw new JsonParseException("Don't know how to turn " + p_deserialize_1_ + " into a Component");
               }

               jsonarray2 = new NBTTextComponent$class_45(var16, var19, new class_4639(class_6539.method_29796(iformattabletextcomponent, "storage")));
            }
         }

         if (iformattabletextcomponent.has("extra")) {
            JsonArray var17 = class_6539.method_29787(iformattabletextcomponent, "extra");
            if (var17.size() <= 0) {
               throw new JsonParseException("Unexpected empty array of components");
            }

            for (int var20 = 0; var20 < var17.size(); var20++) {
               ((IFormattableTextComponent)jsonarray2).append(this.deserialize(var17.get(var20), p_deserialize_2_, p_deserialize_3_));
            }
         }

         ((IFormattableTextComponent)jsonarray2).setStyle((Style)p_deserialize_3_.deserialize(p_deserialize_1_, Style.class));
         return (IFormattableTextComponent)jsonarray2;
      }
   }

   private void serializeChatStyle(Style style, JsonObject object, JsonSerializationContext ctx) {
      JsonElement jsonobject = ctx.serialize(style);
      if (jsonobject.isJsonObject()) {
         JsonObject var7 = (JsonObject)jsonobject;

         for (Entry var9 : var7.entrySet()) {
            object.add((String)var9.getKey(), (JsonElement)var9.getValue());
         }
      }
   }

   public JsonElement serialize(ITextComponent p_serialize_1_, Type p_serialize_2_, JsonSerializationContext p_serialize_3_) {
      JsonObject nbttextcomponent = new JsonObject();
      if (!p_serialize_1_.getStyle().isEmpty()) {
         this.serializeChatStyle(p_serialize_1_.getStyle(), nbttextcomponent, p_serialize_3_);
      }

      if (!p_serialize_1_.getSiblings().isEmpty()) {
         JsonArray nbttextcomponent$storage = new JsonArray();

         for (ITextComponent var9 : p_serialize_1_.getSiblings()) {
            nbttextcomponent$storage.add(this.serialize(var9, var9.getClass(), p_serialize_3_));
         }

         nbttextcomponent.add("extra", nbttextcomponent$storage);
      }

      if (p_serialize_1_ instanceof StringTextComponent) {
         nbttextcomponent.addProperty("text", ((StringTextComponent)p_serialize_1_).getText());
      } else if (p_serialize_1_ instanceof TranslationTextComponent) {
         TranslationTextComponent var13 = (TranslationTextComponent)p_serialize_1_;
         nbttextcomponent.addProperty("translate", var13.getKey());
         if (var13.getFormatArgs() != null && var13.getFormatArgs().length > 0) {
            JsonArray var18 = new JsonArray();

            for (Object var12 : var13.getFormatArgs()) {
               if (var12 instanceof ITextComponent) {
                  var18.add(this.serialize((ITextComponent)var12, var12.getClass(), p_serialize_3_));
               } else {
                  var18.add(new JsonPrimitive(String.valueOf(var12)));
               }
            }

            nbttextcomponent.add("with", var18);
         }
      } else if (p_serialize_1_ instanceof ScoreTextComponent) {
         ScoreTextComponent var14 = (ScoreTextComponent)p_serialize_1_;
         JsonObject var19 = new JsonObject();
         var19.addProperty("name", var14.getName());
         var19.addProperty("objective", var14.getObjective());
         nbttextcomponent.add("score", var19);
      } else if (p_serialize_1_ instanceof SelectorTextComponent) {
         SelectorTextComponent var15 = (SelectorTextComponent)p_serialize_1_;
         nbttextcomponent.addProperty("selector", var15.getSelector());
      } else if (p_serialize_1_ instanceof KeybindTextComponent) {
         KeybindTextComponent var16 = (KeybindTextComponent)p_serialize_1_;
         nbttextcomponent.addProperty("keybind", var16.getKeybind());
      } else {
         if (!(p_serialize_1_ instanceof NBTTextComponent)) {
            throw new IllegalArgumentException("Don't know how to serialize " + p_serialize_1_ + " as a Component");
         }

         NBTTextComponent var17 = (NBTTextComponent)p_serialize_1_;
         nbttextcomponent.addProperty("nbt", var17.func_218676_i());
         nbttextcomponent.addProperty("interpret", var17.func_218677_j());
         if (p_serialize_1_ instanceof NBTTextComponent$class_43) {
            NBTTextComponent$class_43 var20 = (NBTTextComponent$class_43)p_serialize_1_;
            nbttextcomponent.addProperty("block", var20.func_218683_k());
         } else if (p_serialize_1_ instanceof NBTTextComponent$class_44) {
            NBTTextComponent$class_44 var21 = (NBTTextComponent$class_44)p_serialize_1_;
            nbttextcomponent.addProperty("entity", var21.func_218687_k());
         } else {
            if (!(p_serialize_1_ instanceof NBTTextComponent$class_45)) {
               throw new IllegalArgumentException("Don't know how to serialize " + p_serialize_1_ + " as a Component");
            }

            NBTTextComponent$class_45 var22 = (NBTTextComponent$class_45)p_serialize_1_;
            nbttextcomponent.addProperty("storage", var22.func_229726_k_().toString());
         }
      }

      return nbttextcomponent;
   }

   public static String toJson(ITextComponent component) {
      return GSON.toJson(component);
   }

   public static JsonElement toJsonTree(ITextComponent p_200528_0_) {
      return GSON.toJsonTree(p_200528_0_);
   }

   @Nullable
   public static IFormattableTextComponent func_240643_a_(String p_240643_0_) {
      return class_6539.<IFormattableTextComponent>method_29804(GSON, p_240643_0_, IFormattableTextComponent.class, false);
   }

   @Nullable
   public static IFormattableTextComponent func_240641_a_(JsonElement p_240641_0_) {
      return (IFormattableTextComponent)GSON.fromJson(p_240641_0_, IFormattableTextComponent.class);
   }

   @Nullable
   public static IFormattableTextComponent func_240644_b_(String p_240644_0_) {
      return class_6539.<IFormattableTextComponent>method_29804(GSON, p_240644_0_, IFormattableTextComponent.class, true);
   }

   public static IFormattableTextComponent func_240642_a_(com.mojang.brigadier.StringReader p_240642_0_) {
      try {
         JsonReader iformattabletextcomponent = new JsonReader(new StringReader(p_240642_0_.getRemaining()));
         iformattabletextcomponent.setLenient(false);
         IFormattableTextComponent var4 = (IFormattableTextComponent)GSON.getAdapter(IFormattableTextComponent.class).read(iformattabletextcomponent);
         p_240642_0_.setCursor(p_240642_0_.getCursor() + getPos(iformattabletextcomponent));
         return var4;
      } catch (IOException | StackOverflowError var5) {
         throw new JsonParseException(var5);
      }
   }

   private static int getPos(JsonReader p_197673_0_) {
      try {
         return JSON_READER_POS_FIELD.getInt(p_197673_0_) - JSON_READER_LINESTART_FIELD.getInt(p_197673_0_) + 1;
      } catch (IllegalAccessException var4) {
         throw new IllegalStateException("Couldn't read position of JsonReader", var4);
      }
   }
}
