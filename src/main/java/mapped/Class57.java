// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.ArrayList;

public class Class57 extends ArrayList<Class9017>
{
    public Class57() {
    }
    
    public Class57(final Class51 class51) {
        final Class52 method328 = class51.method328("Recipes", 10);
        for (int i = 0; i < method328.size(); ++i) {
            this.add(new Class9017(method328.method346(i)));
        }
    }
    
    @Nullable
    public Class9017 method359(final Class8321 class8321, final Class8321 class8322, final int index) {
        if (index > 0 && index < this.size()) {
            final Class9017 class8323 = this.get(index);
            return class8323.method32302(class8321, class8322) ? class8323 : null;
        }
        for (int i = 0; i < this.size(); ++i) {
            final Class9017 class8324 = this.get(i);
            if (class8324.method32302(class8321, class8322)) {
                return class8324;
            }
        }
        return null;
    }
    
    public void method360(final Class8654 class8654) {
        class8654.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            final Class9017 class8655 = this.get(i);
            class8654.method29509(class8655.method32280());
            class8654.method29509(class8655.method32283());
            final Class8321 method32282 = class8655.method32282();
            class8654.writeBoolean(!method32282.method27620());
            if (!method32282.method27620()) {
                class8654.method29509(method32282);
            }
            class8654.writeBoolean(class8655.method32297());
            class8654.writeInt(class8655.method32286());
            class8654.writeInt(class8655.method32288());
            class8654.writeInt(class8655.method32296());
            class8654.writeInt(class8655.method32293());
            class8654.writeFloat(class8655.method32295());
            class8654.writeInt(class8655.method32290());
        }
    }
    
    public static Class57 method361(final Class8654 class8654) {
        final Class57 class8655 = new Class57();
        for (int n = class8654.readByte() & 0xFF, i = 0; i < n; ++i) {
            final Class8321 method29511 = class8654.method29511();
            final Class8321 method29512 = class8654.method29511();
            Class8321 class8656 = Class8321.field34174;
            if (class8654.readBoolean()) {
                class8656 = class8654.method29511();
            }
            final boolean boolean1 = class8654.readBoolean();
            final int int1 = class8654.readInt();
            final int int2 = class8654.readInt();
            final int int3 = class8654.readInt();
            final int int4 = class8654.readInt();
            final Class9017 e = new Class9017(method29511, class8656, method29512, int1, int2, int3, class8654.readFloat(), class8654.readInt());
            if (boolean1) {
                e.method32298();
            }
            e.method32294(int4);
            class8655.add(e);
        }
        return class8655;
    }
    
    public Class51 method362() {
        final Class51 class51 = new Class51();
        final Class52 class52 = new Class52();
        for (int i = 0; i < this.size(); ++i) {
            ((AbstractList<Class51>)class52).add(this.get(i).method32301());
        }
        class51.method295("Recipes", class52);
        return class51;
    }
}
