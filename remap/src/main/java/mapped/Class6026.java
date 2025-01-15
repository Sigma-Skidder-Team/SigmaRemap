// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.text.ITextComponent;

import java.util.Date;

public class Class6026 extends Class6024<String>
{
    public Class6026(final String s) {
        this(s, null, null, null, null);
    }
    
    public Class6026(final String s, final Date date, final String s2, final Date date2, final String s3) {
        super(s, date, s2, date2, s3);
    }
    
    @Override
    public ITextComponent method17951() {
        return new Class2260(this.method17942());
    }
    
    public Class6026(final JsonObject jsonObject) {
        super(method17953(jsonObject), jsonObject);
    }
    
    private static String method17953(final JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }
    
    @Override
    public void method17944(final JsonObject jsonObject) {
        if (this.method17942() != null) {
            jsonObject.addProperty("ip", (String)this.method17942());
            super.method17944(jsonObject);
        }
    }
}
