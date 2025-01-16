// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;

public class Class7103
{
    public static final Class7103 field27707;
    private final Class51 field27708;
    
    public Class7103(final Class51 field27708) {
        this.field27708 = field27708;
    }
    
    public boolean method21803(final ItemStack class8321) {
        return this == Class7103.field27707 || this.method21805(class8321.method27657());
    }
    
    public boolean method21804(final Entity class399) {
        return this == Class7103.field27707 || this.method21805(method21808(class399));
    }
    
    public boolean method21805(final INBT class41) {
        if (class41 != null) {
            return this.field27708 == null || Class9346.method34642(this.field27708, class41, true);
        }
        return this == Class7103.field27707;
    }
    
    public JsonElement method21806() {
        return (JsonElement)((this != Class7103.field27707 && this.field27708 != null) ? new JsonPrimitive(this.field27708.toString()) : JsonNull.INSTANCE);
    }
    
    public static Class7103 method21807(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            Class51 method16938;
            try {
                method16938 = Class5704.method16938(Class9583.method35894(jsonElement, "nbt"));
            }
            catch (final CommandSyntaxException ex) {
                throw new JsonSyntaxException("Invalid nbt tag: " + ex.getMessage());
            }
            return new Class7103(method16938);
        }
        return Class7103.field27707;
    }
    
    public static Class51 method21808(final Entity class399) {
        final Class51 method1756 = class399.method1756(new Class51());
        if (class399 instanceof PlayerEntity) {
            final ItemStack method1757 = ((PlayerEntity)class399).field3006.method2345();
            if (!method1757.method27620()) {
                method1756.method295("SelectedItem", method1757.method27627(new Class51()));
            }
        }
        return method1756;
    }
    
    static {
        field27707 = new Class7103(null);
    }
}
