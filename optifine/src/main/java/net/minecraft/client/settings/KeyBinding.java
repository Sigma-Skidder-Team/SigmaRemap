package net.minecraft.client.settings;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.Util;

public class KeyBinding implements Comparable<KeyBinding>
{
    private static final Map<String, KeyBinding> KEYBIND_ARRAY = Maps.newHashMap();
    private static final Map<InputMappings.Input, KeyBinding> HASH = Maps.newHashMap();
    private static final Set<String> KEYBIND_SET = Sets.newHashSet();
    private static final Map<String, Integer> CATEGORY_ORDER = Util.make(Maps.newHashMap(), (p_205215_0_) ->
    {
        p_205215_0_.put("key.categories.movement", 1);
        p_205215_0_.put("key.categories.gameplay", 2);
        p_205215_0_.put("key.categories.inventory", 3);
        p_205215_0_.put("key.categories.creative", 4);
        p_205215_0_.put("key.categories.multiplayer", 5);
        p_205215_0_.put("key.categories.ui", 6);
        p_205215_0_.put("key.categories.misc", 7);
    });
    private final String keyDescription;
    private final InputMappings.Input keyCodeDefault;
    private final String keyCategory;
    private InputMappings.Input keyCode;
    private boolean pressed;
    private int pressTime;

    public static void onTick(InputMappings.Input key)
    {
        KeyBinding keybinding = HASH.get(key);

        if (keybinding != null)
        {
            ++keybinding.pressTime;
        }
    }

    public static void setKeyBindState(InputMappings.Input key, boolean held)
    {
        KeyBinding keybinding = HASH.get(key);

        if (keybinding != null)
        {
            keybinding.setPressed(held);
        }
    }

    public static void updateKeyBindState()
    {
        for (KeyBinding keybinding : KEYBIND_ARRAY.values())
        {
            if (keybinding.keyCode.getType() == InputMappings.Type.KEYSYM && keybinding.keyCode.getKeyCode() != InputMappings.INPUT_INVALID.getKeyCode())
            {
                keybinding.setPressed(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), keybinding.keyCode.getKeyCode()));
            }
        }
    }

    public static void unPressAllKeys()
    {
        for (KeyBinding keybinding : KEYBIND_ARRAY.values())
        {
            keybinding.unpressKey();
        }
    }

    public static void resetKeyBindingArrayAndHash()
    {
        HASH.clear();

        for (KeyBinding keybinding : KEYBIND_ARRAY.values())
        {
            HASH.put(keybinding.keyCode, keybinding);
        }
    }

    public KeyBinding(String p_i2057_1_, int p_i2057_2_, String p_i2057_3_)
    {
        this(p_i2057_1_, InputMappings.Type.KEYSYM, p_i2057_2_, p_i2057_3_);
    }

    public KeyBinding(String p_i2058_1_, InputMappings.Type p_i2058_2_, int p_i2058_3_, String p_i2058_4_)
    {
        this.keyDescription = p_i2058_1_;
        this.keyCode = p_i2058_2_.getOrMakeInput(p_i2058_3_);
        this.keyCodeDefault = this.keyCode;
        this.keyCategory = p_i2058_4_;
        KEYBIND_ARRAY.put(p_i2058_1_, this);
        HASH.put(this.keyCode, this);
        KEYBIND_SET.add(p_i2058_4_);
    }

    public boolean isKeyDown()
    {
        return this.pressed;
    }

    public String getKeyCategory()
    {
        return this.keyCategory;
    }

    public boolean isPressed()
    {
        if (this.pressTime == 0)
        {
            return false;
        }
        else
        {
            --this.pressTime;
            return true;
        }
    }

    private void unpressKey()
    {
        this.pressTime = 0;
        this.setPressed(false);
    }

    public String getKeyDescription()
    {
        return this.keyDescription;
    }

    public InputMappings.Input getDefault()
    {
        return this.keyCodeDefault;
    }

    public void bind(InputMappings.Input key)
    {
        this.keyCode = key;
    }

    public int compareTo(KeyBinding p_compareTo_1_)
    {
        return this.keyCategory.equals(p_compareTo_1_.keyCategory) ? I18n.format(this.keyDescription).compareTo(I18n.format(p_compareTo_1_.keyDescription)) : CATEGORY_ORDER.get(this.keyCategory).compareTo(CATEGORY_ORDER.get(p_compareTo_1_.keyCategory));
    }

    public static Supplier<String> getDisplayString(String key)
    {
        KeyBinding keybinding = KEYBIND_ARRAY.get(key);
        return keybinding == null ? () ->
        {
            return key;
        } : keybinding::getLocalizedName;
    }

    public boolean conflicts(KeyBinding binding)
    {
        return this.keyCode.equals(binding.keyCode);
    }

    public boolean isInvalid()
    {
        return this.keyCode.equals(InputMappings.INPUT_INVALID);
    }

    public boolean matchesKey(int keysym, int scancode)
    {
        if (keysym == InputMappings.INPUT_INVALID.getKeyCode())
        {
            return this.keyCode.getType() == InputMappings.Type.SCANCODE && this.keyCode.getKeyCode() == scancode;
        }
        else
        {
            return this.keyCode.getType() == InputMappings.Type.KEYSYM && this.keyCode.getKeyCode() == keysym;
        }
    }

    public boolean matchesMouseKey(int key)
    {
        return this.keyCode.getType() == InputMappings.Type.MOUSE && this.keyCode.getKeyCode() == key;
    }

    public String getLocalizedName()
    {
        String s = this.keyCode.getTranslationKey();
        int i = this.keyCode.getKeyCode();
        String s1 = null;

        switch (this.keyCode.getType())
        {
            case KEYSYM:
                s1 = InputMappings.getKeynameFromKeycode(i);
                break;

            case SCANCODE:
                s1 = InputMappings.getKeyNameFromScanCode(i);
                break;

            case MOUSE:
                String s2 = I18n.format(s);
                s1 = Objects.equals(s2, s) ? I18n.format(InputMappings.Type.MOUSE.getName(), i + 1) : s2;
        }

        return s1 == null ? I18n.format(s) : s1;
    }

    public boolean isDefault()
    {
        return this.keyCode.equals(this.keyCodeDefault);
    }

    public String getTranslationKey()
    {
        return this.keyCode.getTranslationKey();
    }

    public void setPressed(boolean valueIn)
    {
        this.pressed = valueIn;
    }
}
