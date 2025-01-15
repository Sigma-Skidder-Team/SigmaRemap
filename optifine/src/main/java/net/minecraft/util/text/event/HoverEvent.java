package net.minecraft.util.text.event;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.util.text.ITextComponent;

public class HoverEvent
{
    private final HoverEvent.Action action;
    private final ITextComponent value;

    public HoverEvent(HoverEvent.Action p_i679_1_, ITextComponent p_i679_2_)
    {
        this.action = p_i679_1_;
        this.value = p_i679_2_;
    }

    public HoverEvent.Action getAction()
    {
        return this.action;
    }

    public ITextComponent getValue()
    {
        return this.value;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            HoverEvent hoverevent = (HoverEvent)p_equals_1_;

            if (this.action != hoverevent.action)
            {
                return false;
            }
            else
            {
                if (this.value != null)
                {
                    if (!this.value.equals(hoverevent.value))
                    {
                        return false;
                    }
                }
                else if (hoverevent.value != null)
                {
                    return false;
                }

                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "HoverEvent{action=" + this.action + ", value='" + this.value + '\'' + '}';
    }

    public int hashCode()
    {
        int i = this.action.hashCode();
        i = 31 * i + (this.value != null ? this.value.hashCode() : 0);
        return i;
    }

    public static enum Action
    {
        SHOW_TEXT("show_text", true),
        SHOW_ITEM("show_item", true),
        SHOW_ENTITY("show_entity", true);

        private static final Map<String, HoverEvent.Action> NAME_MAPPING = Arrays.stream(values()).collect(Collectors.toMap(HoverEvent.Action::getCanonicalName, (p_199854_0_) -> {
            return p_199854_0_;
        }));
        private final boolean allowedInChat;
        private final String canonicalName;

        private Action(String p_i3327_3_, boolean p_i3327_4_)
        {
            this.canonicalName = p_i3327_3_;
            this.allowedInChat = p_i3327_4_;
        }

        public boolean shouldAllowInChat()
        {
            return this.allowedInChat;
        }

        public String getCanonicalName()
        {
            return this.canonicalName;
        }

        public static HoverEvent.Action getValueByCanonicalName(String canonicalNameIn)
        {
            return NAME_MAPPING.get(canonicalNameIn);
        }
    }
}
