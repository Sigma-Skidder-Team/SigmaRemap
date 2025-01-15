// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class Class6678 implements Class6672<FloatArgumentType>
{
    public void method20315(final FloatArgumentType floatArgumentType, final Class8654 class8654) {
        final boolean b = floatArgumentType.getMinimum() != -3.4028235E38f;
        final boolean b2 = floatArgumentType.getMaximum() != Float.MAX_VALUE;
        class8654.writeByte(Class7126.method21869(b, b2));
        if (b) {
            class8654.writeFloat(floatArgumentType.getMinimum());
        }
        if (b2) {
            class8654.writeFloat(floatArgumentType.getMaximum());
        }
    }
    
    public FloatArgumentType method20316(final Class8654 class8654) {
        final byte byte1 = class8654.readByte();
        return FloatArgumentType.floatArg(Class7126.method21870(byte1) ? class8654.readFloat() : -3.4028235E38f, Class7126.method21871(byte1) ? class8654.readFloat() : Float.MAX_VALUE);
    }
    
    public void method20317(final FloatArgumentType floatArgumentType, final JsonObject jsonObject) {
        if (floatArgumentType.getMinimum() != -3.4028235E38f) {
            jsonObject.addProperty("min", (Number)floatArgumentType.getMinimum());
        }
        if (floatArgumentType.getMaximum() != Float.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)floatArgumentType.getMaximum());
        }
    }
}
