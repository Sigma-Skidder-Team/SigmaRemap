// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.ParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonNull;
import com.google.gson.JsonElement;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Class8000
{
    private static final SimpleDateFormat field32950;
    private Date field32951;
    
    public boolean method26167() {
        return this.field32951 != null;
    }
    
    public void method26168() {
        this.field32951 = new Date();
    }
    
    public void method26169() {
        this.field32951 = null;
    }
    
    public Date method26170() {
        return this.field32951;
    }
    
    @Override
    public String toString() {
        return "CriterionProgress{obtained=" + ((this.field32951 != null) ? this.field32951 : "false") + '}';
    }
    
    public void method26171(final Class8654 class8654) {
        class8654.writeBoolean(this.field32951 != null);
        if (this.field32951 != null) {
            class8654.method29519(this.field32951);
        }
    }
    
    public JsonElement method26172() {
        return (JsonElement)((this.field32951 == null) ? JsonNull.INSTANCE : new JsonPrimitive(Class8000.field32950.format(this.field32951)));
    }
    
    public static Class8000 method26173(final Class8654 class8654) {
        final Class8000 class8655 = new Class8000();
        if (class8654.readBoolean()) {
            class8655.field32951 = class8654.method29518();
        }
        return class8655;
    }
    
    public static Class8000 method26174(final String s) {
        final Class8000 class8000 = new Class8000();
        try {
            class8000.field32951 = Class8000.field32950.parse(s);
            return class8000;
        }
        catch (final ParseException ex) {
            throw new JsonSyntaxException("Invalid datetime: " + s, (Throwable)ex);
        }
    }
    
    static {
        field32950 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }
}
