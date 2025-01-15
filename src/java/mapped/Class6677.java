// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.google.gson.JsonObject;

public class Class6677 implements Class6672<Class6886>
{
    public void method20312(final Class6886 class6886, final Class8654 class6887) {
        int n = 0;
        if (Class6886.method21154(class6886)) {
            n = (byte)(n | 0x1);
        }
        if (Class6886.method21155(class6886)) {
            n = (byte)(n | 0x2);
        }
        class6887.writeByte(n);
    }
    
    public Class6886 method20313(final Class8654 class8654) {
        class8654.readByte();
        return new Class6886(false, false);
    }
    
    public void method20314(final Class6886 class6886, final JsonObject jsonObject) {
        jsonObject.addProperty("amount", Class6886.method21154(class6886) ? "single" : "multiple");
        jsonObject.addProperty("type", Class6886.method21155(class6886) ? "players" : "entities");
    }
}
