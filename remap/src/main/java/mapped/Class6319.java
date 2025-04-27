// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.ITextComponent;

public class Class6319
{
    private static String[] field25270;
    private final String field25271;
    private final Class8256[] field25272;
    
    public Class6319(final String field25271, final Class8256[] field25272) {
        this.field25271 = field25271;
        this.field25272 = field25272;
    }
    
    public ITextComponent method18705(final Class7492 class7492, final boolean b) throws CommandSyntaxException {
        if (this.field25272.length != 0 && b) {
            final StringTextComponent class7493 = new StringTextComponent(this.field25271.substring(0, this.field25272[0].method27398()));
            int n = this.field25272[0].method27398();
            for (final Class8256 class7494 : this.field25272) {
                final ITextComponent method27400 = class7494.method27400(class7492);
                if (n < class7494.method27398()) {
                    class7493.appendText(this.field25271.substring(n, class7494.method27398()));
                }
                if (method27400 != null) {
                    class7493.appendSibling(method27400);
                }
                n = class7494.method27399();
            }
            if (n < this.field25271.length()) {
                class7493.appendText(this.field25271.substring(n));
            }
            return class7493;
        }
        return new StringTextComponent(this.field25271);
    }
    
    public static Class6319 method18706(final StringReader stringReader, final boolean b) throws CommandSyntaxException {
        final String substring = stringReader.getString().substring(stringReader.getCursor(), stringReader.getTotalLength());
        if (!b) {
            stringReader.setCursor(stringReader.getTotalLength());
            return new Class6319(substring, new Class8256[0]);
        }
        final ArrayList arrayList = Lists.newArrayList();
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead()) {
            if (stringReader.peek() == '@') {
                final int cursor2 = stringReader.getCursor();
                Class9043 method25070 = null;
                Label_0177: {
                    try {
                        method25070 = new Class7793(stringReader).method25070();
                        break Label_0177;
                    }
                    catch (final CommandSyntaxException ex) {
                        if (ex.getType() != Class7793.field31894 && ex.getType() != Class7793.field31892) {
                            throw ex;
                        }
                    }
                    stringReader.setCursor(cursor2 + 1);
                    continue;
                }
                arrayList.add(new Class8256(cursor2 - cursor, stringReader.getCursor() - cursor, method25070));
            }
            else {
                stringReader.skip();
            }
        }
        return new Class6319(substring, (Class8256[])arrayList.toArray(new Class8256[arrayList.size()]));
    }
}
