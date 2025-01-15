// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.List;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Supplier;

public class Class9254
{
    private final String field39690;
    private final Class8570 field39691;
    private final String field39692;
    private final Class8570 field39693;
    private final Class2229 field39694;
    
    private Class9254(final String field39690, final String field39691, final Class2229 field39692) {
        this.field39690 = field39690;
        this.field39691 = Class147.method715(field39690);
        this.field39692 = field39691;
        this.field39693 = Class147.method715(field39691);
        this.field39694 = field39692;
    }
    
    public void method34144(final Supplier<Class41> supplier, final Class41 class41) {
        try {
            final List<Class41> method28804 = this.field39691.method28804(class41);
            if (!method28804.isEmpty()) {
                this.field39694.method8420(supplier.get(), this.field39693, method28804);
            }
        }
        catch (final CommandSyntaxException ex) {}
    }
    
    public JsonObject method34145() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("source", this.field39690);
        jsonObject.addProperty("target", this.field39692);
        jsonObject.addProperty("op", Class2229.method8422(this.field39694));
        return jsonObject;
    }
    
    public static Class9254 method34146(final JsonObject jsonObject) {
        return new Class9254(Class9583.method35895(jsonObject, "source"), Class9583.method35895(jsonObject, "target"), Class2229.method8421(Class9583.method35895(jsonObject, "op")));
    }
}
