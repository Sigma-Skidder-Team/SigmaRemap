// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType$StringType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class Class6679 implements Class6672<StringArgumentType>
{
    public void method20318(final StringArgumentType stringArgumentType, final PacketBuffer class8654) {
        class8654.method29500((Enum<?>)stringArgumentType.getType());
    }
    
    public StringArgumentType method20319(final PacketBuffer class8654) {
        switch (Class7342.field28354[class8654.method29499(StringArgumentType$StringType.class).ordinal()]) {
            case 1: {
                return StringArgumentType.word();
            }
            case 2: {
                return StringArgumentType.string();
            }
            default: {
                return StringArgumentType.greedyString();
            }
        }
    }
    
    public void method20320(final StringArgumentType stringArgumentType, final JsonObject jsonObject) {
        switch (Class7342.field28354[stringArgumentType.getType().ordinal()]) {
            case 1: {
                jsonObject.addProperty("type", "word");
                break;
            }
            case 2: {
                jsonObject.addProperty("type", "phrase");
                break;
            }
            default: {
                jsonObject.addProperty("type", "greedy");
                break;
            }
        }
    }
}
