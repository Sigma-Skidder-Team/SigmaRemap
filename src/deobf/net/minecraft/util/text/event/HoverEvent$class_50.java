package net.minecraft.util.text.event;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import remapped.class_2392;
import remapped.class_2451;
import remapped.class_4639;
import remapped.class_5734;
import remapped.class_6098;
import remapped.class_6539;
import remapped.class_8669;

public class HoverEvent$class_50 {
   private final class_2451 item;
   private final int count;
   private final class_5734 tag;
   private class_6098 stack;

   public HoverEvent$class_50(class_2451 item, int count, class_5734 tag) {
      this.item = item;
      this.count = count;
      this.tag = tag;
   }

   public HoverEvent$class_50(class_6098 stack) {
      this(stack.method_27960(), stack.method_27997(), stack.method_27990() != null ? stack.method_27990().method_25944() : null);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         HoverEvent$class_50 var4 = (HoverEvent$class_50)p_equals_1_;
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

   public class_6098 createStack() {
      if (this.stack == null) {
         this.stack = new class_6098(this.item, this.count);
         if (this.tag != null) {
            this.stack.method_27965(this.tag);
         }
      }

      return this.stack;
   }

   private static HoverEvent$class_50 deserialize(JsonElement element) {
      if (element.isJsonPrimitive()) {
         return new HoverEvent$class_50(class_8669.field_44382.method_39806(new class_4639(element.getAsString())), 1, (class_5734)null);
      } else {
         JsonObject item = class_6539.method_29782(element, "item");
         class_2451 i = class_8669.field_44382.method_39806(new class_4639(class_6539.method_29796(item, "id")));
         int s = class_6539.method_29768(item, "count", 1);
         if (item.has("tag")) {
            String commandsyntaxexception = class_6539.method_29796(item, "tag");

            try {
               class_5734 var7 = class_2392.method_10916(commandsyntaxexception);
               return new HoverEvent$class_50(i, s, var7);
            } catch (CommandSyntaxException var8) {
               HoverEvent.access$400().warn("Failed to parse tag: {}", commandsyntaxexception, var8);
            }
         }

         return new HoverEvent$class_50(i, s, (class_5734)null);
      }
   }

   @Nullable
   private static HoverEvent$class_50 deserialize(ITextComponent component) {
      try {
         class_5734 var3 = class_2392.method_10916(component.getString());
         return new HoverEvent$class_50(class_6098.method_28015(var3));
      } catch (CommandSyntaxException var4) {
         HoverEvent.access$400().warn("Failed to parse item tag: {}", component, var4);
         return null;
      }
   }

   private JsonElement serialize() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("id", class_8669.field_44382.method_39797(this.item).toString());
      if (this.count != 1) {
         var3.addProperty("count", this.count);
      }

      if (this.tag != null) {
         var3.addProperty("tag", this.tag.toString());
      }

      return var3;
   }
}
