// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class Class7339
{
    private final ITextComponent field28342;
    private final ITextComponent field28343;
    private final ItemStack field28344;
    private final ResourceLocation field28345;
    private final Class1993 field28346;
    private final boolean field28347;
    private final boolean field28348;
    private final boolean field28349;
    private float field28350;
    private float field28351;
    
    public Class7339(final ItemStack field28344, final ITextComponent field28345, final ITextComponent field28346, final ResourceLocation field28347, final Class1993 field28348, final boolean field28349, final boolean field28350, final boolean field28351) {
        this.field28342 = field28345;
        this.field28343 = field28346;
        this.field28344 = field28344;
        this.field28345 = field28347;
        this.field28346 = field28348;
        this.field28347 = field28349;
        this.field28348 = field28350;
        this.field28349 = field28351;
    }
    
    public void method22526(final float field28350, final float field28351) {
        this.field28350 = field28350;
        this.field28351 = field28351;
    }
    
    public ITextComponent method22527() {
        return this.field28342;
    }
    
    public ITextComponent method22528() {
        return this.field28343;
    }
    
    public ItemStack method22529() {
        return this.field28344;
    }
    
    @Nullable
    public ResourceLocation method22530() {
        return this.field28345;
    }
    
    public Class1993 method22531() {
        return this.field28346;
    }
    
    public float method22532() {
        return this.field28350;
    }
    
    public float method22533() {
        return this.field28351;
    }
    
    public boolean method22534() {
        return this.field28347;
    }
    
    public boolean method22535() {
        return this.field28348;
    }
    
    public boolean method22536() {
        return this.field28349;
    }
    
    public static Class7339 method22537(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final ITextComponent class2250 = Class9583.method35920(jsonObject, "title", jsonDeserializationContext, (Class<? extends ITextComponent>) ITextComponent.class);
        final ITextComponent class2251 = Class9583.method35920(jsonObject, "description", jsonDeserializationContext, (Class<? extends ITextComponent>) ITextComponent.class);
        if (class2250 != null && class2251 != null) {
            return new Class7339(method22538(Class9583.method35914(jsonObject, "icon")), class2250, class2251, jsonObject.has("background") ? new ResourceLocation(Class9583.method35895(jsonObject, "background")) : null, jsonObject.has("frame") ? Class1993.method8017(Class9583.method35895(jsonObject, "frame")) : Class1993.field11162, Class9583.method35901(jsonObject, "show_toast", true), Class9583.method35901(jsonObject, "announce_to_chat", true), Class9583.method35901(jsonObject, "hidden", false));
        }
        throw new JsonSyntaxException("Both title and description must be set");
    }
    
    private static ItemStack method22538(final JsonObject jsonObject) {
        if (!jsonObject.has("item")) {
            throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
        }
        final Item method35898 = Class9583.method35898(jsonObject, "item");
        if (jsonObject.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
        }
        final ItemStack class8321 = new ItemStack(method35898);
        if (jsonObject.has("nbt")) {
            try {
                class8321.method27663(Class5704.method16938(Class9583.method35894(jsonObject.get("nbt"), "nbt")));
            }
            catch (final CommandSyntaxException ex) {
                throw new JsonSyntaxException("Invalid nbt tag: " + ex.getMessage());
            }
        }
        return class8321;
    }
    
    public void method22539(final PacketBuffer class8654) {
        class8654.method29498(this.field28342);
        class8654.method29498(this.field28343);
        class8654.method29509(this.field28344);
        class8654.method29500(this.field28346);
        int n = 0;
        if (this.field28345 != null) {
            n |= 0x1;
        }
        if (this.field28347) {
            n |= 0x2;
        }
        if (this.field28349) {
            n |= 0x4;
        }
        class8654.writeInt(n);
        if (this.field28345 != null) {
            class8654.method29517(this.field28345);
        }
        class8654.writeFloat(this.field28350);
        class8654.writeFloat(this.field28351);
    }
    
    public static Class7339 method22540(final PacketBuffer class8654) {
        final ITextComponent method29497 = class8654.method29497();
        final ITextComponent method29498 = class8654.method29497();
        final ItemStack method29499 = class8654.method29511();
        final Class1993 class8655 = class8654.method29499(Class1993.class);
        class8654.readInt();
        final Class7339 class8656 = new Class7339(method29499, method29497, method29498, null, class8655, false, false, false);
        class8656.method22526(class8654.readFloat(), class8654.readFloat());
        return class8656;
    }
    
    public JsonElement method22541() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("icon", (JsonElement)this.method22542());
        jsonObject.add("title", Class5953.method17870(this.field28342));
        jsonObject.add("description", Class5953.method17870(this.field28343));
        jsonObject.addProperty("frame", this.field28346.method8015());
        jsonObject.addProperty("show_toast", Boolean.valueOf(this.field28347));
        jsonObject.addProperty("announce_to_chat", Boolean.valueOf(this.field28348));
        jsonObject.addProperty("hidden", Boolean.valueOf(this.field28349));
        if (this.field28345 != null) {
            jsonObject.addProperty("background", this.field28345.toString());
        }
        return (JsonElement)jsonObject;
    }
    
    private JsonObject method22542() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item", Registry.field211.getKey(this.field28344.getItem()).toString());
        if (this.field28344.method27656()) {
            jsonObject.addProperty("nbt", this.field28344.method27657().toString());
        }
        return jsonObject;
    }
}
