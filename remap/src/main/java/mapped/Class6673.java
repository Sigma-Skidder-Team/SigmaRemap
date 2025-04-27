// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class Class6673 implements Class6672<LongArgumentType>
{
    public void method20303(final LongArgumentType longArgumentType, final PacketBuffer class8654) {
        final boolean b = longArgumentType.getMinimum() != Long.MIN_VALUE;
        final boolean b2 = longArgumentType.getMaximum() != Long.MAX_VALUE;
        class8654.writeByte(Class7126.method21869(b, b2));
        if (b) {
            class8654.writeLong(longArgumentType.getMinimum());
        }
        if (b2) {
            class8654.writeLong(longArgumentType.getMaximum());
        }
    }
    
    public LongArgumentType method20304(final PacketBuffer class8654) {
        final byte byte1 = class8654.readByte();
        return LongArgumentType.longArg(Class7126.method21870(byte1) ? class8654.readLong() : Long.MIN_VALUE, Class7126.method21871(byte1) ? class8654.readLong() : Long.MAX_VALUE);
    }
    
    public void method20305(final LongArgumentType longArgumentType, final JsonObject jsonObject) {
        if (longArgumentType.getMinimum() != Long.MIN_VALUE) {
            jsonObject.addProperty("min", longArgumentType.getMinimum());
        }
        if (longArgumentType.getMaximum() != Long.MAX_VALUE) {
            jsonObject.addProperty("max", longArgumentType.getMaximum());
        }
    }
}
