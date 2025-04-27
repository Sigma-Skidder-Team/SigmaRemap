// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.google.gson.JsonParseException;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.StringUtils;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.google.gson.Gson;

public class Class6151 extends Class6132
{
    public static final Gson field24883;
    
    public Class6151(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntitySignTextStrictJsonFix", Class9451.field40621, "Sign");
    }
    
    private Dynamic<?> method18384(final Dynamic<?> dynamic, final String s) {
        final String string = dynamic.get(s).asString("");
        ITextComponent class2250 = null;
        if (!"null".equals(string) && !StringUtils.isEmpty(string)) {
            if (string.charAt(0) != '\"' || string.charAt(string.length() - 1) != '\"') {
                if (string.charAt(0) != '{' || string.charAt(string.length() - 1) != '}') {
                    class2250 = new StringTextComponent(string);
                    return dynamic.set(s, dynamic.createString(Class5953.method17869(class2250)));
                }
            }
            try {
                class2250 = Class9583.method35925(Class6151.field24883, string, ITextComponent.class, true);
                if (class2250 == null) {
                    class2250 = new StringTextComponent("");
                }
            }
            catch (final JsonParseException ex) {}
            if (class2250 == null) {
                try {
                    class2250 = Class5953.method17871(string);
                }
                catch (final JsonParseException ex2) {}
            }
            if (class2250 == null) {
                try {
                    class2250 = Class5953.method17873(string);
                }
                catch (final JsonParseException ex3) {}
            }
            if (class2250 == null) {
                class2250 = new StringTextComponent(string);
            }
        }
        else {
            class2250 = new StringTextComponent("");
        }
        return dynamic.set(s, dynamic.createString(Class5953.method17869(class2250)));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic = this.method18384(dynamic, "Text1");
            dynamic = this.method18384(dynamic, "Text2");
            dynamic = this.method18384(dynamic, "Text3");
            dynamic = this.method18384(dynamic, "Text4");
            return dynamic;
        });
    }
    
    static {
        field24883 = new GsonBuilder().registerTypeAdapter(ITextComponent.class, new Class5965()).create();
    }
}
