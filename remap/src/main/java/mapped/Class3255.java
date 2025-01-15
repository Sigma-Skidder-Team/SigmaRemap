// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class3255 extends Class3247
{
    public Class3255() {
        super(Class8013.field32986, "Aimbot", "Automatically aim at players", new Class3167[] { new Class3168(), new Class3395(), new Class3235() });
        this.method9881(new Class4999("Players", "Aim at players", true));
        this.method9881(new Class4999("Animals/Monsters", "Aim at animals and monsters", false));
        this.method9881(new Class4999("Invisible", "Aim at invisible entites", true));
    }
    
    public Class399 method10266(final float n) {
        final List<Class399> method19138 = Class6430.method19138();
        Class399 class399 = null;
        final Iterator<Class399> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Class399 class400 = iterator.next();
            if (class400 != Class3255.field15514.field4684) {
                if (!Class9463.method35173().method35190().method29878(class400)) {
                    if (class400 instanceof Class511) {
                        if (((Class511)class400).method2664() != 0.0f) {
                            if (Class3255.field15514.field4684.method1732(class400) <= n) {
                                if (Class3255.field15514.field4684.method2646((Class511)class400)) {
                                    if (!(class400 instanceof Class857)) {
                                        if (!this.method9883("Players") && class400 instanceof Class512) {
                                            iterator.remove();
                                        }
                                        else if (class400 instanceof Class512 && Class9463.method35173().method35191().method31751(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!this.method9883("Invisible") && class400.method1823()) {
                                            iterator.remove();
                                        }
                                        else if (!this.method9883("Animals/Monsters") && !(class400 instanceof Class512)) {
                                            iterator.remove();
                                        }
                                        else if (Class3255.field15514.field4684.method1920() != null && Class3255.field15514.field4684.method1920().equals(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!class400.method1850()) {
                                            if (class400 instanceof Class512) {
                                                if (Class9011.method32262((Class512)class400)) {
                                                    if (Class9463.method35173().method35189().method21551(Class3203.class).method9906()) {
                                                        iterator.remove();
                                                        continue;
                                                    }
                                                }
                                            }
                                            if (class399 != null && Class3255.field15514.field4684.method1732(class400) >= Class3255.field15514.field4684.method1732(class399)) {
                                                continue;
                                            }
                                            class399 = class400;
                                        }
                                        else {
                                            iterator.remove();
                                        }
                                    }
                                    else {
                                        iterator.remove();
                                    }
                                }
                                else {
                                    iterator.remove();
                                }
                            }
                            else {
                                iterator.remove();
                            }
                        }
                        else {
                            iterator.remove();
                        }
                    }
                    else {
                        iterator.remove();
                    }
                }
                else {
                    iterator.remove();
                }
            }
            else {
                iterator.remove();
            }
        }
        return class399;
    }
}
