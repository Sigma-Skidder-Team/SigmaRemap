// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4905 extends Class4841
{
    private final List<Class4868> field20983;
    public int field20984;
    
    public Class4905(final CustomGuiScreen customGuiScreen, final String s, int n, final int n2) {
        super(customGuiScreen, s, n, n2, 200, 18, ColorHelper.field25964, false);
        this.field20983 = new ArrayList<Class4868>();
        n = 0;
        int n3 = 1;
        for (final Class2199 class4804 : Class2199.values()) {
            final String string = "badge" + class4804.field13387;
            n += 25;
            final Class4877 class4805;
            this.addToList(class4805 = new Class4877(this, string, n, 0, class4804));
            if (n3 != 0) {
                class4805.field20867 = true;
                this.field20984 = class4804.field13388;
            }
            class4805.doThis((class4803, n) -> {
                for (final CustomGuiScreen class4804 : class4803.getParent().method14250()) {
                    if (!(class4804 instanceof Class4877)) {
                        continue;
                    }
                    ((Class4877)class4804).field20867 = false;
                    ((Class4877)class4804).field20868.changeDirection(Direction.FORWARDS);
                }
                ((Class4877)class4803).field20867 = true;
                ((Class4877)class4803).field20868.changeDirection(Direction.BACKWARDS);
                this.field20984 = ((Class4877)class4803).field20866.field13388;
            });
            n3 = 0;
        }
    }
}
