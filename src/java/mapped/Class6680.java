// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.google.gson.JsonObject;

public class Class6680 implements Class6672<Class7456>
{
    public void method20321(final Class7456 class7456, final Class8654 class7457) {
        int n = 0;
        if (Class7456.method22959(class7456)) {
            n = (byte)(n | 0x1);
        }
        class7457.writeByte(n);
    }
    
    public Class7456 method20322(final Class8654 class8654) {
        class8654.readByte();
        return new Class7456(false);
    }
    
    public void method20323(final Class7456 class7456, final JsonObject jsonObject) {
        jsonObject.addProperty("amount", Class7456.method22959(class7456) ? "multiple" : "single");
    }
}
