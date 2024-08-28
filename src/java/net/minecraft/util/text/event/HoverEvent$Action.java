package net.minecraft.util.text.event;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class HoverEvent$Action<T> {
   public static final HoverEvent$Action<ITextComponent> SHOW_TEXT = new HoverEvent$Action<ITextComponent>(
      "show_text", true, ITextComponent$Serializer::func_240641_a_, ITextComponent$Serializer::toJsonTree, Function.<ITextComponent>identity()
   );
   public static final HoverEvent$Action<HoverEvent$ItemHover> SHOW_ITEM = new HoverEvent$Action<HoverEvent$ItemHover>(
      "show_item",
      true,
      p_240673_0_ -> HoverEvent$ItemHover.access$300(p_240673_0_),
      p_240676_0_ -> HoverEvent$ItemHover.access$200(p_240676_0_),
      p_240675_0_ -> HoverEvent$ItemHover.access$100(p_240675_0_)
   );
   public static final HoverEvent$Action<HoverEvent$EntityHover> SHOW_ENTITY = new HoverEvent$Action<HoverEvent$EntityHover>(
      "show_entity", true, HoverEvent$EntityHover::deserialize, HoverEvent$EntityHover::serialize, HoverEvent$EntityHover::deserialize
   );
   private static final Map<String, HoverEvent$Action> NAME_MAPPING = Stream.<HoverEvent$Action>of(SHOW_TEXT, SHOW_ITEM, SHOW_ENTITY)
      .collect(ImmutableMap.toImmutableMap(HoverEvent$Action::getCanonicalName, p_240671_0_ -> p_240671_0_));
   private final String canonicalName;
   private final boolean allowedInChat;
   private final Function<JsonElement, T> field_240665_g_;
   private final Function<T, JsonElement> field_240666_h_;
   private final Function<ITextComponent, T> field_240667_i_;

   public HoverEvent$Action(
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
   public static HoverEvent$Action getValueByCanonicalName(String canonicalNameIn) {
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

   // $VF: synthetic method
   public static Object access$000(HoverEvent$Action x0, Object x1) {
      return x0.castParameter(x1);
   }
}
