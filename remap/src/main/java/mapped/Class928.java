// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.List;

public class Class928 extends Thread
{
    public static final /* synthetic */ boolean field4912;
    public final /* synthetic */ Class7445 field4913;
    public final /* synthetic */ Class5045 field4914;
    
    public Class928(final Class5045 field4914, final String name, final Class7445 field4915) {
        this.field4914 = field4914;
        this.field4913 = field4915;
        super(name);
    }
    
    @Override
    public void run() {
        Class7445 class7445 = this.field4913;
        Class9513.method35444();
        while (class7445 != null) {
            class7445 = Class7847.method25360(() -> {
                final Class7445 class7445;
                final Class9513 class7446;
                Class5045.method15391(this.field4914, class7445, class7446);
                if (!either.right().isPresent()) {
                    if (!Class928.field4912 && !either.left().isPresent()) {
                        throw new AssertionError();
                    }
                    else {
                        final Class7445 class7447 = either.left().get();
                        class7447.field28717.iterator();
                        final Iterator iterator;
                        while (iterator.hasNext()) {
                            Class5045.method15393(this.field4914).method15546(iterator.next());
                        }
                        if (!class7447.field28717.isEmpty()) {
                            return class7447;
                        }
                        else {
                            if (!(!Class5045.method15393(this.field4914).method15547())) {
                                Class5046.method15439("mco.template.select.none", "%link");
                                Class6387.method19067(Class5046.method15438("mco.template.select.none.linkTitle"), "https://minecraft.net/realms/content-creator/");
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
                    if (!(!Class5045.method15393(this.field4914).method15547())) {
                        Class5045.method15394(this.field4914, Class7692.method24463(Class5046.method15438("mco.template.select.failure"), new Class6387[0]));
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
