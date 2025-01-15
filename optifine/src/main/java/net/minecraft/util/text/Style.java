package net.minecraft.util.text;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;

public class Style
{
    private Style parentStyle;
    private TextFormatting color;
    private Boolean bold;
    private Boolean italic;
    private Boolean underlined;
    private Boolean strikethrough;
    private Boolean obfuscated;
    private ClickEvent clickEvent;
    private HoverEvent hoverEvent;
    private String insertion;
    private static final Style ROOT = new Style()
    {
        @Nullable
        public TextFormatting getColor()
        {
            return null;
        }
        public boolean getBold()
        {
            return false;
        }
        public boolean getItalic()
        {
            return false;
        }
        public boolean getStrikethrough()
        {
            return false;
        }
        public boolean getUnderlined()
        {
            return false;
        }
        public boolean getObfuscated()
        {
            return false;
        }
        @Nullable
        public ClickEvent getClickEvent()
        {
            return null;
        }
        @Nullable
        public HoverEvent getHoverEvent()
        {
            return null;
        }
        @Nullable
        public String getInsertion()
        {
            return null;
        }
        public Style setColor(TextFormatting color)
        {
            throw new UnsupportedOperationException();
        }
        public Style setBold(Boolean boldIn)
        {
            throw new UnsupportedOperationException();
        }
        public Style setItalic(Boolean italic)
        {
            throw new UnsupportedOperationException();
        }
        public Style setStrikethrough(Boolean strikethrough)
        {
            throw new UnsupportedOperationException();
        }
        public Style setUnderlined(Boolean underlined)
        {
            throw new UnsupportedOperationException();
        }
        public Style setObfuscated(Boolean obfuscated)
        {
            throw new UnsupportedOperationException();
        }
        public Style setClickEvent(ClickEvent event)
        {
            throw new UnsupportedOperationException();
        }
        public Style setHoverEvent(HoverEvent event)
        {
            throw new UnsupportedOperationException();
        }
        public Style setParentStyle(Style parent)
        {
            throw new UnsupportedOperationException();
        }
        public String toString()
        {
            return "Style.ROOT";
        }
        public Style createShallowCopy()
        {
            return this;
        }
        public Style createDeepCopy()
        {
            return this;
        }
        public String getFormattingCode()
        {
            return "";
        }
    };

    @Nullable
    public TextFormatting getColor()
    {
        return this.color == null ? this.getParent().getColor() : this.color;
    }

    public boolean getBold()
    {
        return this.bold == null ? this.getParent().getBold() : this.bold;
    }

    public boolean getItalic()
    {
        return this.italic == null ? this.getParent().getItalic() : this.italic;
    }

    public boolean getStrikethrough()
    {
        return this.strikethrough == null ? this.getParent().getStrikethrough() : this.strikethrough;
    }

    public boolean getUnderlined()
    {
        return this.underlined == null ? this.getParent().getUnderlined() : this.underlined;
    }

    public boolean getObfuscated()
    {
        return this.obfuscated == null ? this.getParent().getObfuscated() : this.obfuscated;
    }

    public boolean isEmpty()
    {
        return this.bold == null && this.italic == null && this.strikethrough == null && this.underlined == null && this.obfuscated == null && this.color == null && this.clickEvent == null && this.hoverEvent == null && this.insertion == null;
    }

    @Nullable
    public ClickEvent getClickEvent()
    {
        return this.clickEvent == null ? this.getParent().getClickEvent() : this.clickEvent;
    }

    @Nullable
    public HoverEvent getHoverEvent()
    {
        return this.hoverEvent == null ? this.getParent().getHoverEvent() : this.hoverEvent;
    }

    @Nullable
    public String getInsertion()
    {
        return this.insertion == null ? this.getParent().getInsertion() : this.insertion;
    }

    public Style setColor(TextFormatting color)
    {
        this.color = color;
        return this;
    }

    public Style setBold(Boolean boldIn)
    {
        this.bold = boldIn;
        return this;
    }

    public Style setItalic(Boolean italic)
    {
        this.italic = italic;
        return this;
    }

    public Style setStrikethrough(Boolean strikethrough)
    {
        this.strikethrough = strikethrough;
        return this;
    }

    public Style setUnderlined(Boolean underlined)
    {
        this.underlined = underlined;
        return this;
    }

    public Style setObfuscated(Boolean obfuscated)
    {
        this.obfuscated = obfuscated;
        return this;
    }

    public Style setClickEvent(ClickEvent event)
    {
        this.clickEvent = event;
        return this;
    }

    public Style setHoverEvent(HoverEvent event)
    {
        this.hoverEvent = event;
        return this;
    }

    public Style setInsertion(String insertion)
    {
        this.insertion = insertion;
        return this;
    }

    public Style setParentStyle(Style parent)
    {
        this.parentStyle = parent;
        return this;
    }

    public String getFormattingCode()
    {
        if (this.isEmpty())
        {
            return this.parentStyle != null ? this.parentStyle.getFormattingCode() : "";
        }
        else
        {
            StringBuilder stringbuilder = new StringBuilder();

            if (this.getColor() != null)
            {
                stringbuilder.append((Object)this.getColor());
            }

            if (this.getBold())
            {
                stringbuilder.append((Object)TextFormatting.BOLD);
            }

            if (this.getItalic())
            {
                stringbuilder.append((Object)TextFormatting.ITALIC);
            }

            if (this.getUnderlined())
            {
                stringbuilder.append((Object)TextFormatting.UNDERLINE);
            }

            if (this.getObfuscated())
            {
                stringbuilder.append((Object)TextFormatting.OBFUSCATED);
            }

            if (this.getStrikethrough())
            {
                stringbuilder.append((Object)TextFormatting.STRIKETHROUGH);
            }

            return stringbuilder.toString();
        }
    }

    private Style getParent()
    {
        return this.parentStyle == null ? ROOT : this.parentStyle;
    }

    public String toString()
    {
        return "Style{hasParent=" + (this.parentStyle != null) + ", color=" + this.color + ", bold=" + this.bold + ", italic=" + this.italic + ", underlined=" + this.underlined + ", obfuscated=" + this.obfuscated + ", clickEvent=" + this.getClickEvent() + ", hoverEvent=" + this.getHoverEvent() + ", insertion=" + this.getInsertion() + '}';
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof Style))
        {
            return false;
        }
        else
        {
            Style style = (Style)p_equals_1_;

            if (this.getBold() == style.getBold() && this.getColor() == style.getColor() && this.getItalic() == style.getItalic() && this.getObfuscated() == style.getObfuscated() && this.getStrikethrough() == style.getStrikethrough() && this.getUnderlined() == style.getUnderlined())
            {
                if (this.getClickEvent() != null)
                {
                    if (!this.getClickEvent().equals(style.getClickEvent()))
                    {
                        return false;
                    }
                }
                else if (style.getClickEvent() != null)
                {
                    return false;
                }

                if (this.getHoverEvent() != null)
                {
                    if (!this.getHoverEvent().equals(style.getHoverEvent()))
                    {
                        return false;
                    }
                }
                else if (style.getHoverEvent() != null)
                {
                    return false;
                }

                if (this.getInsertion() != null)
                {
                    if (this.getInsertion().equals(style.getInsertion()))
                    {
                        return true;
                    }
                }
                else if (style.getInsertion() == null)
                {
                    return true;
                }
            }

            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash(this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion);
    }

    public Style createShallowCopy()
    {
        Style style = new Style();
        style.bold = this.bold;
        style.italic = this.italic;
        style.strikethrough = this.strikethrough;
        style.underlined = this.underlined;
        style.obfuscated = this.obfuscated;
        style.color = this.color;
        style.clickEvent = this.clickEvent;
        style.hoverEvent = this.hoverEvent;
        style.parentStyle = this.parentStyle;
        style.insertion = this.insertion;
        return style;
    }

    public Style createDeepCopy()
    {
        Style style = new Style();
        style.setBold(this.getBold());
        style.setItalic(this.getItalic());
        style.setStrikethrough(this.getStrikethrough());
        style.setUnderlined(this.getUnderlined());
        style.setObfuscated(this.getObfuscated());
        style.setColor(this.getColor());
        style.setClickEvent(this.getClickEvent());
        style.setHoverEvent(this.getHoverEvent());
        style.setInsertion(this.getInsertion());
        return style;
    }

    public static class Serializer implements JsonDeserializer<Style>, JsonSerializer<Style>
    {
        @Nullable
        public Style deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException
        {
            if (p_deserialize_1_.isJsonObject())
            {
                Style style = new Style();
                JsonObject jsonobject = p_deserialize_1_.getAsJsonObject();

                if (jsonobject == null)
                {
                    return null;
                }
                else
                {
                    if (jsonobject.has("bold"))
                    {
                        style.bold = jsonobject.get("bold").getAsBoolean();
                    }

                    if (jsonobject.has("italic"))
                    {
                        style.italic = jsonobject.get("italic").getAsBoolean();
                    }

                    if (jsonobject.has("underlined"))
                    {
                        style.underlined = jsonobject.get("underlined").getAsBoolean();
                    }

                    if (jsonobject.has("strikethrough"))
                    {
                        style.strikethrough = jsonobject.get("strikethrough").getAsBoolean();
                    }

                    if (jsonobject.has("obfuscated"))
                    {
                        style.obfuscated = jsonobject.get("obfuscated").getAsBoolean();
                    }

                    if (jsonobject.has("color"))
                    {
                        style.color = p_deserialize_3_.deserialize(jsonobject.get("color"), TextFormatting.class);
                    }

                    if (jsonobject.has("insertion"))
                    {
                        style.insertion = jsonobject.get("insertion").getAsString();
                    }

                    if (jsonobject.has("clickEvent"))
                    {
                        JsonObject jsonobject1 = JSONUtils.getJsonObject(jsonobject, "clickEvent");
                        String s = JSONUtils.getString(jsonobject1, "action", (String)null);
                        ClickEvent.Action clickevent$action = s == null ? null : ClickEvent.Action.getValueByCanonicalName(s);
                        String s1 = JSONUtils.getString(jsonobject1, "value", (String)null);

                        if (clickevent$action != null && s1 != null && clickevent$action.shouldAllowInChat())
                        {
                            style.clickEvent = new ClickEvent(clickevent$action, s1);
                        }
                    }

                    if (jsonobject.has("hoverEvent"))
                    {
                        JsonObject jsonobject2 = JSONUtils.getJsonObject(jsonobject, "hoverEvent");
                        String s2 = JSONUtils.getString(jsonobject2, "action", (String)null);
                        HoverEvent.Action hoverevent$action = s2 == null ? null : HoverEvent.Action.getValueByCanonicalName(s2);
                        ITextComponent itextcomponent = p_deserialize_3_.deserialize(jsonobject2.get("value"), ITextComponent.class);

                        if (hoverevent$action != null && itextcomponent != null && hoverevent$action.shouldAllowInChat())
                        {
                            style.hoverEvent = new HoverEvent(hoverevent$action, itextcomponent);
                        }
                    }

                    return style;
                }
            }
            else
            {
                return null;
            }
        }

        @Nullable
        public JsonElement serialize(Style p_serialize_1_, Type p_serialize_2_, JsonSerializationContext p_serialize_3_)
        {
            if (p_serialize_1_.isEmpty())
            {
                return null;
            }
            else
            {
                JsonObject jsonobject = new JsonObject();

                if (p_serialize_1_.bold != null)
                {
                    jsonobject.addProperty("bold", p_serialize_1_.bold);
                }

                if (p_serialize_1_.italic != null)
                {
                    jsonobject.addProperty("italic", p_serialize_1_.italic);
                }

                if (p_serialize_1_.underlined != null)
                {
                    jsonobject.addProperty("underlined", p_serialize_1_.underlined);
                }

                if (p_serialize_1_.strikethrough != null)
                {
                    jsonobject.addProperty("strikethrough", p_serialize_1_.strikethrough);
                }

                if (p_serialize_1_.obfuscated != null)
                {
                    jsonobject.addProperty("obfuscated", p_serialize_1_.obfuscated);
                }

                if (p_serialize_1_.color != null)
                {
                    jsonobject.add("color", p_serialize_3_.serialize(p_serialize_1_.color));
                }

                if (p_serialize_1_.insertion != null)
                {
                    jsonobject.add("insertion", p_serialize_3_.serialize(p_serialize_1_.insertion));
                }

                if (p_serialize_1_.clickEvent != null)
                {
                    JsonObject jsonobject1 = new JsonObject();
                    jsonobject1.addProperty("action", p_serialize_1_.clickEvent.getAction().getCanonicalName());
                    jsonobject1.addProperty("value", p_serialize_1_.clickEvent.getValue());
                    jsonobject.add("clickEvent", jsonobject1);
                }

                if (p_serialize_1_.hoverEvent != null)
                {
                    JsonObject jsonobject2 = new JsonObject();
                    jsonobject2.addProperty("action", p_serialize_1_.hoverEvent.getAction().getCanonicalName());
                    jsonobject2.add("value", p_serialize_3_.serialize(p_serialize_1_.hoverEvent.getValue()));
                    jsonobject.add("hoverEvent", jsonobject2);
                }

                return jsonobject;
            }
        }
    }
}
