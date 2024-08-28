package net.minecraft.util.text.event;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.*;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Objects;

public class HoverEvent$ItemHover {
   private final Class3257 item;
   private final int count;
   private final Class39 tag;
   private ItemStack stack;

   public HoverEvent$ItemHover(Class3257 item, int count, Class39 tag) {
      this.item = item;
      this.count = count;
      this.tag = tag;
   }

   public HoverEvent$ItemHover(ItemStack stack) {
      this(stack.method32107(), stack.method32179(), stack.method32142() != null ? stack.method32142().method79() : null);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         HoverEvent$ItemHover var4 = (HoverEvent$ItemHover)p_equals_1_;
         return this.count == var4.count && this.item.equals(var4.item) && Objects.equals(this.tag, var4.tag);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.item.hashCode();
      var3 = 31 * var3 + this.count;
      return 31 * var3 + (this.tag != null ? this.tag.hashCode() : 0);
   }

   public ItemStack createStack() {
      if (this.stack == null) {
         this.stack = new ItemStack(this.item, this.count);
         if (this.tag != null) {
            this.stack.method32148(this.tag);
         }
      }

      return this.stack;
   }

   private static HoverEvent$ItemHover deserialize(JsonElement element) {
      if (element.isJsonPrimitive()) {
         return new HoverEvent$ItemHover(Class2348.field16075.method9184(new ResourceLocation(element.getAsString())), 1, (Class39)null);
      } else {
         JsonObject item = Class8963.method32781(element, "item");
         Class3257 i = Class2348.field16075.method9184(new ResourceLocation(Class8963.method32763(item, "id")));
         int s = Class8963.method32778(item, "count", 1);
         if (item.has("tag")) {
            String commandsyntaxexception = Class8963.method32763(item, "tag");

            try {
               Class39 var7 = Class7671.method25188(commandsyntaxexception);
               return new HoverEvent$ItemHover(i, s, var7);
            } catch (CommandSyntaxException var8) {
               HoverEvent.access$400().warn("Failed to parse tag: {}", commandsyntaxexception, var8);
            }
         }

         return new HoverEvent$ItemHover(i, s, (Class39)null);
      }
   }

   @Nullable
   private static HoverEvent$ItemHover deserialize(ITextComponent component) {
      try {
         Class39 var3 = Class7671.method25188(component.getString());
         return new HoverEvent$ItemHover(ItemStack.method32104(var3));
      } catch (CommandSyntaxException var4) {
         HoverEvent.access$400().warn("Failed to parse item tag: {}", component, var4);
         return null;
      }
   }

   private JsonElement serialize() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("id", Class2348.field16075.method9181(this.item).toString());
      if (this.count != 1) {
         var3.addProperty("count", this.count);
      }

      if (this.tag != null) {
         var3.addProperty("tag", this.tag.toString());
      }

      return var3;
   }

   // $VF: synthetic method
   public static HoverEvent$ItemHover access$100(ITextComponent x0) {
      return deserialize(x0);
   }

   // $VF: synthetic method
   public static JsonElement access$200(HoverEvent$ItemHover x0) {
      return x0.serialize();
   }

   // $VF: synthetic method
   public static HoverEvent$ItemHover access$300(JsonElement x0) {
      return deserialize(x0);
   }
}
