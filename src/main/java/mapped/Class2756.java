// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2756 extends Class2437
{
    public final /* synthetic */ Class2807 field14955;
    
    public Class2756(final Class2807 field14955) {
        this.field14955 = field14955;
    }
    
    @Override
    public void method9788(final Class8699 class8699) throws Exception {
        class8699.method29823(Class5260.field22312, class8699.method29841().method18207(Class6654.class).method20228());
        final String method20229 = class8699.method29841().method18207(Class6654.class).method20229();
        int length;
        int i;
        if (!method20229.endsWith(" ") && method20229.length() != 0) {
            i = method20229.length() - (length = method20229.lastIndexOf(" ") + 1);
        }
        else {
            length = method20229.length();
            i = 0;
        }
        class8699.method29823(Class5260.field22312, length);
        class8699.method29823(Class5260.field22312, i);
        for (int intValue = class8699.method29824(Class5260.field22312), j = 0; j < intValue; ++j) {
            String substring = class8699.method29822(Class5260.field22308);
            if (substring.startsWith("/")) {
                if (length == 0) {
                    substring = substring.substring(1);
                }
            }
            class8699.method29823(Class5260.field22308, substring);
            class8699.method29823(Class5260.field22294, false);
        }
    }
}
