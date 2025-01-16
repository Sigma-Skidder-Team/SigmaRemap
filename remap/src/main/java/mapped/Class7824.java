// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import com.google.gson.JsonObject;

public class Class7824 implements Class7823
{
    private final ResourceLocation field32041;
    private final String field32042;
    
    public Class7824(final ResourceLocation field32041, final String field32042) {
        this.field32041 = field32041;
        this.field32042 = field32042;
    }
    
    public static Class7823 method25278(final JsonObject jsonObject) {
        return new Class7824(new ResourceLocation(Class9583.method35895(jsonObject, "sizes")), Class9583.method35895(jsonObject, "template"));
    }
    
    @Nullable
    @Override
    public Class1737 method25276(final Class6582 class6582) {
        try (final Class1671 method19933 = Minecraft.method5277().method5291().method19933(this.field32041)) {
            final byte[] b = new byte[65536];
            method19933.method5887().read(b);
            return new Class1741(class6582, b, this.field32042);
        }
        catch (final IOException ex) {
            Class1741.method6168().error("Cannot load {}, unicode glyphs will not render correctly", (Object)this.field32041);
            return null;
        }
    }
}
