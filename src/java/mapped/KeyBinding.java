package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class KeyBinding implements Comparable<KeyBinding> {
   private static final Map<String, KeyBinding> KEYBIND_ARRAY = Maps.newHashMap();
   private static final Map<InputMappingsInput, KeyBinding> HASH = Maps.newHashMap();
   private static final Set<String> KEYBIND_SET = Sets.newHashSet();
   private static final Map<String, Integer> CATEGORY_ORDER = Util.<Map<String, Integer>>make(Maps.newHashMap(), p_205215_0_ -> {
      p_205215_0_.put("key.categories.movement", 1);
      p_205215_0_.put("key.categories.gameplay", 2);
      p_205215_0_.put("key.categories.inventory", 3);
      p_205215_0_.put("key.categories.creative", 4);
      p_205215_0_.put("key.categories.multiplayer", 5);
      p_205215_0_.put("key.categories.ui", 6);
      p_205215_0_.put("key.categories.misc", 7);
   });
   private final String keyDescription;
   private final InputMappingsInput keyCodeDefault;
   private final String keyCategory;
   public InputMappingsInput keyCode;
   public boolean pressed;
   private int pressTime;

   public static void onTick(InputMappingsInput key) {
      KeyBinding keybinding = HASH.get(key);
      if (keybinding != null) {
         keybinding.pressTime++;
      }
   }

   public static void setKeyBindState(InputMappingsInput var0, boolean held) {
      KeyBinding var4 = HASH.get(var0);
      if (var4 != null) {
         var4.setPressed(held);
      }
   }

   public static void updateKeyBindState() {
      for (KeyBinding keybinding : KEYBIND_ARRAY.values()) {
         if (keybinding.keyCode.getType() == InputMappingsType.KEYSYM && keybinding.keyCode.getKeyCode() != InputMappings.INPUT_INVALID.getKeyCode()) {
            keybinding.setPressed(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), keybinding.keyCode.getKeyCode()));
         }
      }
   }

   public static void unPressAllKeys() {
      for (KeyBinding var3 : KEYBIND_ARRAY.values()) {
         var3.unpressKey();
      }
   }

   public static void resetKeyBindingArrayAndHash() {
      HASH.clear();

      for (KeyBinding var3 : KEYBIND_ARRAY.values()) {
         HASH.put(var3.keyCode, var3);
      }
   }

   public KeyBinding(String var1, int var2, String var3) {
      this(var1, InputMappingsType.KEYSYM, var2, var3);
   }

   public KeyBinding(String var1, InputMappingsType var2, int var3, String var4) {
      this.keyDescription = var1;
      this.keyCode = var2.method8197(var3);
      this.keyCodeDefault = this.keyCode;
      this.keyCategory = var4;
      KEYBIND_ARRAY.put(var1, this);
      HASH.put(this.keyCode, this);
      KEYBIND_SET.add(var4);
   }

   public boolean isKeyDown() {
      return this.pressed;
   }

   public String getKeyCategory() {
      return this.keyCategory;
   }

   public boolean isPressed() {
      if (this.pressTime != 0) {
         this.pressTime--;
         return true;
      } else {
         return false;
      }
   }

   private void unpressKey() {
      this.pressTime = 0;
      this.setPressed(false);
   }

   public String getKeyDescription() {
      return this.keyDescription;
   }

   public InputMappingsInput getDefault() {
      return this.keyCodeDefault;
   }

   public void bind(InputMappingsInput var1) {
      this.keyCode = var1;
   }

   public int compareTo(KeyBinding var1) {
      return !this.keyCategory.equals(var1.keyCategory)
         ? CATEGORY_ORDER.get(this.keyCategory).compareTo(CATEGORY_ORDER.get(var1.keyCategory))
         : I18n.format(this.keyDescription).compareTo(I18n.format(var1.keyDescription));
   }

   public static Supplier<ITextComponent> getDisplayString(String var0) {
      KeyBinding var3 = KEYBIND_ARRAY.get(var0);
      return var3 != null ? var3::func_238171_j_ : () -> new TranslationTextComponent(var0);
   }

   public boolean conflicts(KeyBinding var1) {
      return this.keyCode.equals(var1.keyCode);
   }

   public boolean isInvalid() {
      return this.keyCode.equals(InputMappings.INPUT_INVALID);
   }

   public boolean matchesKey(int keysym, int scancode) {
      return keysym != InputMappings.INPUT_INVALID.getKeyCode()
         ? this.keyCode.getType() == InputMappingsType.KEYSYM && this.keyCode.getKeyCode() == keysym
         : this.keyCode.getType() == InputMappingsType.SCANCODE && this.keyCode.getKeyCode() == scancode;
   }

   public boolean matchesMouseKey(int var1) {
      return this.keyCode.getType() == InputMappingsType.MOUSE && this.keyCode.getKeyCode() == var1;
   }

   public ITextComponent func_238171_j_() {
      return this.keyCode.func_237520_d_();
   }

   public boolean isDefault() {
      return this.keyCode.equals(this.keyCodeDefault);
   }

   public String getTranslationKey() {
      return this.keyCode.getTranslationKey();
   }

   public void setPressed(boolean var1) {
      this.pressed = var1;
   }
}
