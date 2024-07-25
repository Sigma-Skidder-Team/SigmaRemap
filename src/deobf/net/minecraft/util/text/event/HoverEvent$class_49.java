package net.minecraft.util.text.event;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import remapped.class_2392;
import remapped.Identifier;
import remapped.CompoundNBT;
import remapped.class_6539;
import remapped.EntityType;
import remapped.class_8669;

public class HoverEvent$class_49 {
   public final EntityType<?> type;
   public final UUID id;
   public final ITextComponent name;
   private List<ITextComponent> field_240680_d_;

   public HoverEvent$class_49(EntityType<?> type, UUID id, ITextComponent name) {
      this.type = type;
      this.id = id;
      this.name = name;
   }

   @Nullable
   public static HoverEvent$class_49 deserialize(JsonElement element) {
      if (!element.isJsonObject()) {
         return null;
      } else {
         JsonObject entitytype = element.getAsJsonObject();
         EntityType uuid = class_8669.field_44400.method_39806(new Identifier(class_6539.method_29796(entitytype, "type")));
         UUID itextcomponent = UUID.fromString(class_6539.method_29796(entitytype, "id"));
         IFormattableTextComponent var6 = ITextComponent$class_40.func_240641_a_(entitytype.get("name"));
         return new HoverEvent$class_49(uuid, itextcomponent, var6);
      }
   }

   @Nullable
   public static HoverEvent$class_49 deserialize(ITextComponent component) {
      try {
         CompoundNBT itextcomponent = class_2392.method_10916(component.getString());
         IFormattableTextComponent entitytype = ITextComponent$class_40.func_240643_a_(itextcomponent.method_25965("name"));
         EntityType uuid = class_8669.field_44400.method_39806(new Identifier(itextcomponent.method_25965("type")));
         UUID var6 = UUID.fromString(itextcomponent.method_25965("id"));
         return new HoverEvent$class_49(uuid, var6, entitytype);
      } catch (JsonSyntaxException | CommandSyntaxException var7) {
         return null;
      }
   }

   public JsonElement serialize() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("type", class_8669.field_44400.method_39797(this.type).toString());
      var3.addProperty("id", this.id.toString());
      if (this.name != null) {
         var3.add("name", ITextComponent$class_40.toJsonTree(this.name));
      }

      return var3;
   }

   public List<ITextComponent> getTooltip() {
      if (this.field_240680_d_ == null) {
         this.field_240680_d_ = Lists.newArrayList();
         if (this.name != null) {
            this.field_240680_d_.add(this.name);
         }

         this.field_240680_d_.add(new TranslationTextComponent("gui.entity_tooltip.type", this.type.method_30464()));
         this.field_240680_d_.add(new StringTextComponent(this.id.toString()));
      }

      return this.field_240680_d_;
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         HoverEvent$class_49 var4 = (HoverEvent$class_49)p_equals_1_;
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
