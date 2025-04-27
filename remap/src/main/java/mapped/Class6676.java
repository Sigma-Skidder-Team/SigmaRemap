// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class Class6676 implements Class6672<IntegerArgumentType>
{
    public void method20309(final IntegerArgumentType integerArgumentType, final PacketBuffer class8654) {
        final boolean b = integerArgumentType.getMinimum() != Integer.MIN_VALUE;
        final boolean b2 = integerArgumentType.getMaximum() != Integer.MAX_VALUE;
        class8654.writeByte(Class7126.method21869(b, b2));
        if (b) {
            class8654.writeInt(integerArgumentType.getMinimum());
        }
        if (b2) {
            class8654.writeInt(integerArgumentType.getMaximum());
        }
    }
    
    public IntegerArgumentType method20310(final PacketBuffer class8654) {
        final byte byte1 = class8654.readByte();
        return IntegerArgumentType.integer(Class7126.method21870(byte1) ? class8654.readInt() : Integer.MIN_VALUE, Class7126.method21871(byte1) ? class8654.readInt() : Integer.MAX_VALUE);
    }
    
    public void method20311(final IntegerArgumentType integerArgumentType, final JsonObject jsonObject) {
        if (integerArgumentType.getMinimum() != Integer.MIN_VALUE) {
            jsonObject.addProperty("min", integerArgumentType.getMinimum());
        }
        if (integerArgumentType.getMaximum() != Integer.MAX_VALUE) {
            jsonObject.addProperty("max", integerArgumentType.getMaximum());
        }
    }
}
