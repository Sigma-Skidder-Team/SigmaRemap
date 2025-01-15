// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class8866
{
    private float[] field37266;
    public final int field37267 = 3;
    private Class3167 field37268;
    public Class869 field37269;
    public boolean field37270;
    
    public Class8866(final Class3167 field37268) {
        this.field37269 = Class869.method5277();
        this.field37268 = field37268;
        this.method31133();
    }
    
    public boolean method31128() {
        return this.field37270;
    }
    
    public void method31129(final boolean field37270) {
        this.field37270 = field37270;
    }
    
    public void method31130(final Entity class399, final float n, final float n2) {
        if (this.field37268.method9883("Interact autoblock")) {
            final Class7007 method19144 = Class6430.method19144(this.field37268.method9883("Raytrace") ? null : class399, n, n2, p0 -> true, this.field37268.method9886("Range"));
            if (method19144 != null) {
                this.field37269.method5269().method17292(new Class4381(method19144.method21452(), Class316.field1877, method19144.method21451()));
                this.field37269.method5269().method17292(new Class4381(method19144.method21452(), Class316.field1877));
            }
        }
        Class6430.method19163();
        this.method31129(true);
    }
    
    public void method31131() {
        Class6430.method19164();
        this.method31129(false);
    }
    
    public boolean method31132() {
        if (!this.field37268.method9887("Autoblock Mode").equals("None")) {
            if (this.field37269.field4684.method2713().method27622() instanceof Class4077) {
                if (!this.method31128()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method31133() {
        this.field37266 = new float[3];
        float n = 20.0f / this.field37268.method9886("Min CPS");
        float n2 = 20.0f / this.field37268.method9886("Max CPS");
        if (n > n2) {
            final float n3 = n;
            n = n2;
            n2 = n3;
        }
        for (int i = 0; i < 3; ++i) {
            this.field37266[i] = n + (float)Math.random() * (n2 - n);
        }
    }
    
    public float method31134(final int n) {
        if (n >= 0 && n < this.field37266.length) {
            return this.field37266[n];
        }
        return -1.0f;
    }
    
    public boolean method31135(final int n) {
        return n >= (int)this.field37266[0];
    }
    
    public void method31136() {
        float n = 20.0f / this.field37268.method9886("Min CPS");
        float n2 = 20.0f / this.field37268.method9886("Max CPS");
        if (n > n2) {
            final float n3 = n;
            n = n2;
            n2 = n3;
        }
        this.field37266[0] = this.field37266[1] + (this.field37266[0] - (int)this.field37266[0]);
        for (int i = 1; i < 3; ++i) {
            this.field37266[1] = n + (float)Math.random() * (n2 - n);
        }
    }
    
    public List<Class8131> method31137(final float n) {
        final ArrayList list = new ArrayList();
        for (final Entity class399 : Class6430.method19138()) {
            list.add(new Class8131(class399, Class8845.method30922(class399)));
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Class8131 class400 = (Class8131)iterator2.next();
            final Entity method26798 = class400.method26798();
            if (method26798 != this.field37269.field4684 && method26798 != Class3276.field15771) {
                if (!Class9463.method35173().method35190().method29878(method26798)) {
                    if (method26798 instanceof Class511) {
                        if (((Class511)method26798).method2664() != 0.0f) {
                            if (this.field37269.field4684.method1732(method26798) <= n) {
                                if (this.field37269.field4684.method2646((Class511)method26798)) {
                                    if (!(method26798 instanceof Class857)) {
                                        if (!this.field37268.method9883("Players") && method26798 instanceof Class512) {
                                            iterator2.remove();
                                        }
                                        else if (method26798 instanceof Class512 && Class9463.method35173().method35191().method31751(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!this.field37268.method9883("Invisible") && method26798.method1823()) {
                                            iterator2.remove();
                                        }
                                        else if (!this.field37268.method9883("Animals/Monsters") && !(method26798 instanceof Class512)) {
                                            iterator2.remove();
                                        }
                                        else if (this.field37269.field4684.method1920() != null && this.field37269.field4684.method1920().equals(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!method26798.method1850()) {
                                            if (method26798 instanceof Class512) {
                                                if (Class9011.method32262((Class512)method26798)) {
                                                    if (Class9463.method35173().method35189().method21551(Class3203.class).method9906()) {
                                                        iterator2.remove();
                                                        continue;
                                                    }
                                                }
                                            }
                                            if (this.field37268.method9883("Through walls")) {
                                                continue;
                                            }
                                            final Class7988 method26799 = Class8845.method30924(method26798);
                                            if (method26799 != null) {
                                                Class8131.method26803(class400, method26799);
                                            }
                                            else {
                                                iterator2.remove();
                                            }
                                        }
                                        else {
                                            iterator2.remove();
                                        }
                                    }
                                    else {
                                        iterator2.remove();
                                    }
                                }
                                else {
                                    iterator2.remove();
                                }
                            }
                            else {
                                iterator2.remove();
                            }
                        }
                        else {
                            iterator2.remove();
                        }
                    }
                    else {
                        iterator2.remove();
                    }
                }
                else {
                    iterator2.remove();
                }
            }
            else {
                iterator2.remove();
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4455(this));
        return list;
    }
    
    public List<Class8131> method31138(final List<Class8131> list) {
        final String method9887 = this.field37268.method9887("Sort Mode");
        switch (method9887) {
            case "Range": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4464(this));
                break;
            }
            case "Health": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4459(this));
                break;
            }
            case "Angle": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4452(this));
                break;
            }
            case "Prev Range": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4431(this));
                break;
            }
            case "Armor": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4458(this));
                break;
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4448(this));
        return list;
    }
}
