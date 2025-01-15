// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.ParseException;
import com.google.gson.JsonObject;
import net.minecraft.util.text.ITextComponent;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Class6024<T> extends Class6022<T>
{
    public static final SimpleDateFormat field24514;
    public final Date field24515;
    public final String field24516;
    public final Date field24517;
    public final String field24518;
    
    public Class6024(final T t, final Date date, final String s, final Date field24517, final String s2) {
        super(t);
        this.field24515 = ((date != null) ? date : new Date());
        this.field24516 = ((s != null) ? s : "(Unknown)");
        this.field24517 = field24517;
        this.field24518 = ((s2 != null) ? s2 : "Banned by an operator.");
    }
    
    public Class6024(final T t, final JsonObject jsonObject) {
        super(t, jsonObject);
        Date field24515;
        try {
            field24515 = (jsonObject.has("created") ? Class6024.field24514.parse(jsonObject.get("created").getAsString()) : new Date());
        }
        catch (final ParseException ex) {
            field24515 = new Date();
        }
        this.field24515 = field24515;
        this.field24516 = (jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)");
        Date field24516;
        try {
            field24516 = (jsonObject.has("expires") ? Class6024.field24514.parse(jsonObject.get("expires").getAsString()) : null);
        }
        catch (final ParseException ex2) {
            field24516 = null;
        }
        this.field24517 = field24516;
        this.field24518 = (jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.");
    }
    
    public String method17948() {
        return this.field24516;
    }
    
    public Date method17949() {
        return this.field24517;
    }
    
    public String method17950() {
        return this.field24518;
    }
    
    public abstract ITextComponent method17951();
    
    @Override
    public boolean method17943() {
        return this.field24517 != null && this.field24517.before(new Date());
    }
    
    @Override
    public void method17944(final JsonObject jsonObject) {
        jsonObject.addProperty("created", Class6024.field24514.format(this.field24515));
        jsonObject.addProperty("source", this.field24516);
        jsonObject.addProperty("expires", (this.field24517 != null) ? Class6024.field24514.format(this.field24517) : "forever");
        jsonObject.addProperty("reason", this.field24518);
    }
    
    static {
        field24514 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }
}
