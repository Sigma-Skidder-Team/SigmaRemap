package net.minecraft.util.text.event;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.*;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.*;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class HoverEvent$EntityHover {
   public final EntityType<?> type;
   public final UUID id;
   public final ITextComponent name;
   private List<ITextComponent> field_240680_d_;

   public HoverEvent$EntityHover(EntityType<?> type, UUID id, ITextComponent name) {
      this.type = type;
      this.id = id;
      this.name = name;
   }

   @Nullable
   public static HoverEvent$EntityHover deserialize(JsonElement element) {
      if (!element.isJsonObject()) {
         return null;
      } else {
         JsonObject entitytype = element.getAsJsonObject();
         EntityType uuid = Registry.ENTITY_TYPE.getOrDefault(new ResourceLocation(JSONUtils.getString(entitytype, "type")));
         UUID itextcomponent = UUID.fromString(JSONUtils.getString(entitytype, "id"));
         IFormattableTextComponent var6 = ITextComponent$Serializer.func_240641_a_(entitytype.get("name"));
         return new HoverEvent$EntityHover(uuid, itextcomponent, var6);
      }
   }

   @Nullable
   public static HoverEvent$EntityHover deserialize(ITextComponent component) {
      try {
         CompoundNBT itextcomponent = Class7671.method25188(component.getString());
         IFormattableTextComponent entitytype = ITextComponent$Serializer.getComponentFromJson(itextcomponent.getString("name"));
         EntityType uuid = Registry.ENTITY_TYPE.getOrDefault(new ResourceLocation(itextcomponent.getString("type")));
         UUID var6 = UUID.fromString(itextcomponent.getString("id"));
         return new HoverEvent$EntityHover(uuid, var6, entitytype);
      } catch (JsonSyntaxException | CommandSyntaxException var7) {
         return null;
      }
   }

   public JsonElement serialize() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("type", Registry.ENTITY_TYPE.getKey(this.type).toString());
      var3.addProperty("id", this.id.toString());
      if (this.name != null) {
         var3.add("name", ITextComponent$Serializer.toJsonTree(this.name));
      }

      return var3;
   }

   public List<ITextComponent> getTooltip() {
      if (this.field_240680_d_ == null) {
         this.field_240680_d_ = Lists.newArrayList();
         if (this.name != null) {
            this.field_240680_d_.add(this.name);
         }

         this.field_240680_d_.add(new TranslationTextComponent("gui.entity_tooltip.type", this.type.method33211()));
         this.field_240680_d_.add(new StringTextComponent(this.id.toString()));
      }

      return this.field_240680_d_;
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         HoverEvent$EntityHover var4 = (HoverEvent$EntityHover)p_equals_1_;
         return this.type.equals(var4.type) && this.id.equals(var4.id) && Objects.equals(this.name, var4.name);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.type.hashCode();
      var3 = 31 * var3 + this.id.hashCode();
      return 31 * var3 + (this.name != null ? this.name.hashCode() : 0);
   }
}
