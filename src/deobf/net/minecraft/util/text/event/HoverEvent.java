package net.minecraft.util.text.event;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_6539;

public class HoverEvent {
   private static final Logger LOGGER = LogManager.getLogger();
   private final HoverEvent$class_48<?> action;
   private final Object value;

   public <T> HoverEvent(HoverEvent$class_48<T> action, T value) {
      this.action = action;
      this.value = value;
   }

   public HoverEvent$class_48<?> getAction() {
      return this.action;
   }

   @Nullable
   public <T> T getParameter(HoverEvent$class_48<T> actionType) {
      return (T)(this.action == actionType ? HoverEvent$class_48.access$000(actionType, this.value) : null);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         HoverEvent var4 = (HoverEvent)p_equals_1_;
         return this.action == var4.action && Objects.equals(this.value, var4.value);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "HoverEvent{action=" + this.action + ", value='" + this.value + '\'' + '}';
   }

   @Override
   public int hashCode() {
      int var3 = this.action.hashCode();
      return 31 * var3 + (this.value != null ? this.value.hashCode() : 0);
   }

   @Nullable
   public static HoverEvent deserialize(JsonObject json) {
      String action = class_6539.method_29797(json, "action", (String)null);
      if (action == null) {
         return null;
      } else {
         HoverEvent$class_48 jsonelement = HoverEvent$class_48.getValueByCanonicalName(action);
         if (jsonelement == null) {
            return null;
         } else {
            JsonElement itextcomponent = json.get("contents");
            if (itextcomponent != null) {
               return jsonelement.deserialize(itextcomponent);
            } else {
               IFormattableTextComponent var6 = ITextComponent$class_40.func_240641_a_(json.get("value"));
               return var6 != null ? jsonelement.deserialize(var6) : null;
            }
         }
      }
   }

   public JsonObject serialize() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("action", this.action.getCanonicalName());
      var3.add("contents", this.action.serialize(this.value));
      return var3;
   }
}
