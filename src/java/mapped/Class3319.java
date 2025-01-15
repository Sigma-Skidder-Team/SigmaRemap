// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.UUID;
import java.util.List;

public class Class3319 extends Class3167
{
    private List<UUID> field15919;
    private int field15920;
    
    public Class3319() {
        super(Class8013.field32987, "AntiVanish", "Detects if there are vanished players");
        this.field15919 = new CopyOnWriteArrayList<UUID>();
        this.field15920 = -3200;
    }
    
    @Class6753
    private void method10512(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        if (class5744.method17046() && Class3319.field15514.method5282() != null) {
            if (!this.field15919.isEmpty()) {
                if (this.field15920 > 3200) {
                    this.field15919.clear();
                    Class9463.method35173().method35197().method25776(new Class6224("Vanished Cleared", "Vanish List has been Cleared.", 5500));
                    this.field15920 = -3200;
                }
                else {
                    ++this.field15920;
                }
            }
            if (this.field15919 != null) {
                try {
                    for (final UUID uuid : this.field15919) {
                        final Class9081 method17371 = Class3319.field15514.method5269().method17371(uuid);
                        final Class2250 class5745 = (method17371 == null) ? null : method17371.method32732();
                        if (method17371 != null && this.field15919.contains(uuid)) {
                            if (class5745 == null) {
                                Class9463.method35173().method35197().method25776(new Class6224("Vanished Warning", "A player is vanished !!" + method17371.method32732().method8459(), 5500));
                            }
                            else {
                                Class9463.method35173().method35197().method25776(new Class6224("Vanish Warning", method17371.method32732().getString() + " is no longer Vanished.", 5500));
                            }
                        }
                        this.field15919.remove(uuid);
                    }
                }
                catch (final Exception ex) {
                    Class9463.method35173().method35197().method25776(new Class6224("Vanished Error", "Something bad happened.", 5500));
                }
            }
        }
    }
    
    @Class6753
    private void method10513(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3319.field15514.method5269() != null) {
                if (class5723.method16998() instanceof Class4330) {
                    final Class4330 class5724 = (Class4330)class5723.method16998();
                    if (class5724.method13002() == Class2156.field12805) {
                        for (final Class4646 class5725 : class5724.method13001()) {
                            if (Class3319.field15514.method5269().method17371(class5725.method13869().getId()) != null) {
                                continue;
                            }
                            if (this.method10514(class5725.method13869().getId())) {
                                continue;
                            }
                            System.out.println(class5725.method13869().getId());
                            Class9463.method35173().method35197().method25776(new Class6224("Vanished Warning", "A player is vanished ! ", 5500));
                            this.field15920 = -3200;
                        }
                    }
                }
            }
        }
    }
    
    private boolean method10514(final UUID uuid) {
        if (!this.field15919.contains(uuid)) {
            this.field15919.add(uuid);
            return false;
        }
        return true;
    }
}
