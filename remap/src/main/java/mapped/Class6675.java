// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class Class6675 implements Class6672<DoubleArgumentType>
{
    public void method20306(final DoubleArgumentType doubleArgumentType, final PacketBuffer class8654) {
        final boolean b = doubleArgumentType.getMinimum() != -1.7976931348623157E308;
        final boolean b2 = doubleArgumentType.getMaximum() != Double.MAX_VALUE;
        class8654.writeByte(Class7126.method21869(b, b2));
        if (b) {
            class8654.writeDouble(doubleArgumentType.getMinimum());
        }
        if (b2) {
            class8654.writeDouble(doubleArgumentType.getMaximum());
        }
    }
    
    public DoubleArgumentType method20307(final PacketBuffer class8654) {
        final byte byte1 = class8654.readByte();
        return DoubleArgumentType.doubleArg(Class7126.method21870(byte1) ? class8654.readDouble() : -1.7976931348623157E308, Class7126.method21871(byte1) ? class8654.readDouble() : Double.MAX_VALUE);
    }
    
    public void method20308(final DoubleArgumentType doubleArgumentType, final JsonObject jsonObject) {
        if (doubleArgumentType.getMinimum() != -1.7976931348623157E308) {
            jsonObject.addProperty("min", doubleArgumentType.getMinimum());
        }
        if (doubleArgumentType.getMaximum() != Double.MAX_VALUE) {
            jsonObject.addProperty("max", doubleArgumentType.getMaximum());
        }
    }
}
