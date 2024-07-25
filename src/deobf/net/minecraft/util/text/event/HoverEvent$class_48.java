package net.minecraft.util.text.event;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class HoverEvent$class_48<T> {
   public static final HoverEvent$class_48<ITextComponent> SHOW_TEXT = new HoverEvent$class_48<ITextComponent>(
      "show_text", true, ITextComponent$class_40::func_240641_a_, ITextComponent$class_40::toJsonTree, Function.<ITextComponent>identity()
   );
   public static final HoverEvent$class_48<HoverEvent$class_50> SHOW_ITEM = new HoverEvent$class_48<HoverEvent$class_50>(
      "show_item",
      true,
      p_240673_0_ -> HoverEvent$class_50.access$300(p_240673_0_),
      p_240676_0_ -> HoverEvent$class_50.access$200(p_240676_0_),
      p_240675_0_ -> HoverEvent$class_50.access$100(p_240675_0_)
   );
   public static final HoverEvent$class_48<HoverEvent$class_49> SHOW_ENTITY = new HoverEvent$class_48<HoverEvent$class_49>(
      "show_entity", true, HoverEvent$class_49::deserialize, HoverEvent$class_49::serialize, HoverEvent$class_49::deserialize
   );
   private static final Map<String, HoverEvent$class_48> NAME_MAPPING = Stream.<HoverEvent$class_48>of(SHOW_TEXT, SHOW_ITEM, SHOW_ENTITY)
      .collect(ImmutableMap.toImmutableMap(HoverEvent$class_48::getCanonicalName, p_240671_0_ -> p_240671_0_));
   private final String canonicalName;
   private final boolean allowedInChat;
   private final Function<JsonElement, T> field_240665_g_;
   private final Function<T, JsonElement> field_240666_h_;
   private final Function<ITextComponent, T> field_240667_i_;

   public HoverEvent$class_48(
      String canonicalName,
      boolean allowedInChat,
      Function<JsonElement, T> p_i232565_3_,
      Function<T, JsonElement> p_i232565_4_,
      Function<ITextComponent, T> p_i232565_5_
   ) {
      this.canonicalName = canonicalName;
      this.allowedInChat = allowedInChat;
      this.field_240665_g_ = p_i232565_3_;
      this.field_240666_h_ = p_i232565_4_;
      this.field_240667_i_ = p_i232565_5_;
   }

   public boolean shouldAllowInChat() {
      return this.allowedInChat;
   }

   public String getCanonicalName() {
      return this.canonicalName;
   }

   @Nullable
   public static HoverEvent$class_48 getValueByCanonicalName(String canonicalNameIn) {
      return NAME_MAPPING.get(canonicalNameIn);
   }

   private T castParameter(Object parameter) {
      return (T)parameter;
   }

   @Nullable
   public HoverEvent deserialize(JsonElement element) {
      Object var4 = this.field_240665_g_.apply(element);
      return var4 == null ? null : new HoverEvent(this, (T)var4);
   }

   @Nullable
   public HoverEvent deserialize(ITextComponent component) {
      Object var4 = this.field_240667_i_.apply(component);
      return var4 == null ? null : new HoverEvent(this, (T)var4);
   }

   public JsonElement serialize(Object parameter) {
      return this.field_240666_h_.apply(this.castParameter(parameter));
   }

   @Override
   public String toString() {
      return "<action " + this.canonicalName + ">";
   }
}
