// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class928 extends Thread
{
    public static final /* synthetic */ boolean field4912;
    public final /* synthetic */ WorldTemplatePaginatedList field4913;
    public final /* synthetic */ Class5045 field4914;
    
    public Class928(final Class5045 field4914, final String name, final WorldTemplatePaginatedList field4915) {
        this.field4914 = field4914;
        this.field4913 = field4915;
        super(name);
    }
    
    @Override
    public void run() {
        WorldTemplatePaginatedList class7445 = this.field4913;
        RealmsClient.func_224911_a();
        while (class7445 != null) {
            class7445 = Realms.method25360(() -> {
                final WorldTemplatePaginatedList class7445;
                final RealmsClient class7446;
                Class5045.method15391(this.field4914, class7445, class7446);
                if (!either.right().isPresent()) {
                    if (!Class928.field4912 && !either.left().isPresent()) {
                        throw new AssertionError();
                    }
                    else {
                        final WorldTemplatePaginatedList class7447 = either.left().get();
                        class7447.field28717.iterator();
                        final Iterator iterator;
                        while (iterator.hasNext()) {
                            Class5045.method15393(this.field4914).method15546(iterator.next());
                        }
                        if (!class7447.field28717.isEmpty()) {
                            return class7447;
                        }
                        else {
                            if (Class5045.method15393(this.field4914).method15547()) {
                                RealmsScreen.method15439("mco.template.select.none", "%link");
                                Class6387.method19067(RealmsScreen.getLocalizedString("mco.template.select.none.linkTitle"), "https://minecraft.net/realms/content-creator/");
                                final String s;
                                final Class6387 class7448;
                                Class5045.method15394(this.field4914, Class7692.method24463(s, class7448));
                            }
                            return null;
                        }
                    }
                }
                else {
                    Class5045.method15392().error("Couldn't fetch templates: {}", either.right().get());
                    if (Class5045.method15393(this.field4914).method15547()) {
                        Class5045.method15394(this.field4914, Class7692.method24463(RealmsScreen.getLocalizedString("mco.template.select.failure"), new Class6387[0]));
                    }
                    return null;
                }
            }).join();
        }
    }
    
    static {
        field4912 = !Class5045.class.desiredAssertionStatus();
    }
}
