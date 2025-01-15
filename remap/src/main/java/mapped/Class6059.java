// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import java.util.function.Function;

public class Class6059<T> implements Class6058<T>
{
    private static String[] field24624;
    private final Class94<T> field24625;
    private final T[] field24626;
    private final Class7876<T> field24627;
    private final Function<Class51, T> field24628;
    private final int field24629;
    private int field24630;
    
    public Class6059(final Class94<T> field24625, final int field24626, final Class7876<T> field24627, final Function<Class51, T> field24628) {
        this.field24625 = field24625;
        this.field24626 = (T[])new Object[1 << field24626];
        this.field24629 = field24626;
        this.field24627 = field24627;
        this.field24628 = field24628;
    }
    
    @Override
    public int method18026(final T t) {
        for (int i = 0; i < this.field24630; ++i) {
            if (this.field24626[i] == t) {
                return i;
            }
        }
        final int field24630 = this.field24630;
        if (field24630 >= this.field24626.length) {
            return this.field24627.method25502(this.field24629 + 1, t);
        }
        this.field24626[field24630] = t;
        ++this.field24630;
        return field24630;
    }
    
    @Override
    public boolean method18027(final T t) {
        return ArrayUtils.contains((Object[])this.field24626, (Object)t);
    }
    
    @Nullable
    @Override
    public T method18028(final int n) {
        return (n >= 0 && n < this.field24630) ? this.field24626[n] : null;
    }
    
    @Override
    public void method18029(final PacketBuffer class8654) {
        this.field24630 = class8654.readVarInt();
        for (int i = 0; i < this.field24630; ++i) {
            this.field24626[i] = this.field24625.method499(class8654.readVarInt());
        }
    }
    
    @Override
    public void method18030(final PacketBuffer class8654) {
        class8654.writeVarInt(this.field24630);
        for (int i = 0; i < this.field24630; ++i) {
            class8654.writeVarInt(this.field24625.method563(this.field24626[i]));
        }
    }
    
    @Override
    public int method18031() {
        int method29484 = PacketBuffer.method29484(this.method18033());
        for (int i = 0; i < this.method18033(); ++i) {
            method29484 += PacketBuffer.method29484(this.field24625.method563(this.field24626[i]));
        }
        return method29484;
    }
    
    public int method18033() {
        return this.field24630;
    }
    
    @Override
    public void method18032(final Class52 class52) {
        for (int i = 0; i < class52.size(); ++i) {
            this.field24626[i] = this.field24628.apply(class52.method346(i));
        }
        this.field24630 = class52.size();
    }
}
