// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class Class3392 extends Class3167
{
    public List<Class8938> field16103;
    public Set<Class7859> field16104;
    public Class9416 field16105;
    public Thread field16106;
    private Class354 field16107;
    public int field16108;
    public List<Class8797> field16109;
    public List<Class8797> field16110;
    
    public Class3392() {
        super(Class8013.field32987, "AutoMiner", "Automatically mines blocks");
        this.field16103 = new ArrayList<Class8938>();
        this.field16104 = new HashSet<Class7859>();
        this.field16109 = new ArrayList<Class8797>();
        this.field16110 = new ArrayList<Class8797>();
    }
    
    @Class6753
    public void method10815(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4271) {
                this.method10816(Class3392.field15514.field4683.method6685(((Class4271)class5723.method16998()).method12818()).method7019());
            }
            if (class5723.method16998() instanceof Class4312) {
                this.method10816(((Class4312)class5723.method16998()).field19330);
            }
            if (class5723.method16998() instanceof Class4298) {
                if (Class869.method5277().field4683 != null) {
                    final Class4298 class5724 = (Class4298)class5723.method16998();
                    this.method10816(new Class7859(class5724.method12909(), class5724.method12910()));
                }
            }
        }
    }
    
    public void method10816(final Class7859 class7859) {
        for (final Class8938 class7860 : this.field16103) {
            if (!class7860.method31699(class7859)) {
                continue;
            }
            this.field16104.add(class7860.method31701());
        }
    }
    
    @Class6753
    public void method10817(final Class5732 class5732) {
        this.field16103.clear();
        this.field16104.clear();
    }
    
    public List<Class354> method10818(final Class7859 class7859) {
        final ArrayList list = new ArrayList();
        final int n = class7859.field32290 * 16;
        final int n2 = class7859.field32291 * 16;
        final int n3 = 1;
        final int n4 = n + 15;
        final int n5 = n2 + 15;
        final int n6 = 255;
        for (float n7 = (float)n3; n7 <= n6 && n7 <= 100.0f; ++n7) {
            for (float n8 = (float)n; n8 <= n4; ++n8) {
                for (float n9 = (float)n2; n9 <= n5; ++n9) {
                    final Class354 class7860 = new Class354(n8, n7, n9);
                    if (Class3392.field15514.field4683.method6701(class7860).method21696() == Class7521.field29294) {
                        list.add(class7860);
                    }
                }
            }
        }
        return list;
    }
    
    @Class6753
    public void method10819(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class3392.field15514.field4684.field2424 >= 20) {
            final int n = (int)this.method9886("Chunk Range");
            final ArrayList list = new ArrayList();
            for (int i = -4; i < 4; ++i) {
                for (int j = -4; j < 4; ++j) {
                    list.add(new Class7859(Class3392.field15514.field4684.field2441 + i, Class3392.field15514.field4684.field2443 + j));
                }
            }
            final Iterator<Class8938> iterator = this.field16103.iterator();
            while (iterator.hasNext()) {
                final Class8938 class5744 = iterator.next();
                if (class5744.method31700(new Class7859(Class3392.field15514.field4684.field2441, Class3392.field15514.field4684.field2443)) <= 7 && !this.field16104.contains(class5744.method31701())) {
                    continue;
                }
                iterator.remove();
            }
            this.field16104.clear();
            int n2 = 0;
        Label_0262:
            for (final Class7859 class5745 : list) {
                final Iterator<Class8938> iterator3 = this.field16103.iterator();
                while (iterator3.hasNext()) {
                    if (!iterator3.next().method31699(class5745)) {
                        continue;
                    }
                    continue Label_0262;
                }
                this.field16103.add(new Class8938(class5745.field32290, class5745.field32291, this.method10818(class5745)));
                n2 = 1;
                break;
            }
            if (n2 == 0) {
                if (Class3392.field15514.field4684.field2404) {
                    if (!Class9463.method35173().method35205().method26559()) {
                        if (this.field16106 == null) {
                            this.method10821();
                            Class9463.method35173().method35197().method25776(new Class6224("AutoMiner", "Computing...", Class7853.field32190));
                            (this.field16106 = new Thread(() -> {
                                list2.iterator();
                                final Iterator iterator4;
                                while (iterator4.hasNext()) {
                                    final Class354 class5746 = iterator4.next();
                                    try {
                                        this.field16105 = new Class9416();
                                        new Class8733(new Class8797(Class3392.field15514.field4684.method1894()));
                                        new Class8733(new Class8797(class5746));
                                        final Class8733 class5748;
                                        final Class8733 class5749;
                                        final int n3 = (int)Math.min(70000.0, 5000.0 + class5748.field36684.method30688(class5749.field36684) * 1200.0);
                                        final Class6973 class5750 = new Class6973(class5749, class5748);
                                        class5750.field27263 = n3;
                                        class5750.field27266 = true;
                                        class5750.field27269 = 40;
                                        class5750.field27267 = true;
                                        this.field16105.method35017(class5750);
                                        final List list3;
                                        if (list3.size() > 1) {
                                            Class9463.method35173().method35205().method26556(list3);
                                            Class9463.method35173().method35197();
                                            new Class6224("AutoMiner", "Solved in " + list3.size() + " steps! (" + this.field16105.field40407 + ":" + n3 + ")", Class7853.field32190);
                                            final Class6224 class5751;
                                            final Object o2;
                                            ((Class7951)o2).method25776(class5751);
                                            break;
                                        }
                                        else {
                                            continue;
                                        }
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                try {
                                    final boolean b;
                                    if (!b) {
                                        Class9463.method35173().method35197();
                                        new Class6224("AutoMiner", "Could not fin any safe path. (" + list2.size() + ")", Class7853.field32190);
                                        final Class6224 class5752;
                                        final Object o3;
                                        ((Class7951)o3).method25776(class5752);
                                        Thread.sleep(1000L);
                                    }
                                }
                                catch (final InterruptedException ex2) {}
                                this.field16106 = null;
                                return;
                            })).start();
                        }
                    }
                }
            }
            if (this.method9906()) {
                if (this.field16105 != null) {
                    if (this.field16106 != null) {
                        if (Class3392.field15514.field4684.field2424 % 20 == 0) {
                            this.field16110 = this.field16109;
                            this.field16109 = this.method10825();
                        }
                        Class9463.method35173().method35197().method25776(new Class6224("AutoMiner", "Computing... (" + this.field16105.field40407 + ")", Class7853.field32190));
                    }
                }
            }
            return;
        }
        this.field16103.clear();
    }
    
    public Class354 method10820(final float n) {
        final ArrayList list = new ArrayList();
        final Iterator<Class8938> iterator = this.field16103.iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next().field37603);
        }
        Class4609.method13675(list);
        if (list.size() <= 0) {
            return null;
        }
        return (Class354)list.get(0);
    }
    
    public List<Class354> method10821() {
        final ArrayList list = new ArrayList();
        final Iterator<Class8938> iterator = this.field16103.iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next().field37603);
        }
        Class4609.method13675(list);
        if (list.size() > 1) {
            final ArrayList list2 = new ArrayList();
            list2.add(list.get(0));
            for (final Class354 class354 : list) {
                if (Math.sqrt(class354.method1083((Class352)list2.get(list2.size() - 1))) <= 4.0) {
                    continue;
                }
                if (Class8797.method30695(class354)) {
                    continue;
                }
                list2.add(class354);
            }
            return list2;
        }
        return list;
    }
    
    @Override
    public void method9879() {
        if (this.field16106 != null) {
            this.field16106.interrupt();
        }
        this.field16106 = null;
        this.field16103.clear();
        this.field16104.clear();
        Class9463.method35173().method35205().method26555();
        Class9463.method35173().method35197().method25776(new Class6224("AutoMiner", "Scanning Terrain..."));
    }
    
    @Override
    public void method9897() {
        if (this.field16106 != null) {
            this.field16106.interrupt();
        }
        this.field16106 = null;
        this.field16103.clear();
        this.field16104.clear();
        Class9463.method35173().method35205().method26555();
    }
    
    private void method10822() {
        final Color[] array = { new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(103, 181, 75), null, null };
        for (int i = 0; i <= 315; i += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)i, 0.0f, 1.0f, 0.0f);
            final int n = i / 45;
            this.method10823(array[n].getRed() / 255.0f, array[n].getGreen() / 255.0f, array[n].getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        for (int j = 0; j <= 315; j += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)j, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            final Color color = new Color(Class6430.method19121(array[j / 45].getRGB(), 0.2f), false);
            this.method10823(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
    }
    
    private void method10823(final float n, final float n2, final float n3) {
        GL11.glColor3f(n, n2, n3);
        GL11.glTranslatef(0.0f, 0.0f, 0.25f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.5f);
        GL11.glVertex2f(-0.105f, 0.0f);
        GL11.glVertex2f(0.105f, 0.0f);
        GL11.glEnd();
    }
    
    @Class6753
    public void method10824(final Class5739 class5739) {
        if (this.method9906()) {
            this.method10826();
        }
    }
    
    private List<Class8797> method10825() {
        final ArrayList list = new ArrayList();
        for (Class8733 class8733 = this.field16105.field40405; class8733 != null; class8733 = class8733.field36690) {
            list.add(class8733.field36684);
        }
        Collections.reverse(list);
        return list;
    }
    
    public void method10826() {
        if (this.method9906()) {
            if (this.field16105 != null) {
                if (this.field16106 != null) {
                    GL11.glPushMatrix();
                    GL11.glEnable(2848);
                    GL11.glBlendFunc(770, 771);
                    GL11.glEnable(3042);
                    GL11.glDisable(3553);
                    GL11.glDisable(2929);
                    GL11.glEnable(32925);
                    GL11.glLineWidth(1.4f);
                    GL11.glColor4d(1.0, 1.0, 1.0, 0.4399999976158142);
                    GL11.glBegin(3);
                    final float min = Math.min(1.0f, (Class3392.field15514.field4684.field2424 % 20 + Class3392.field15514.field4633.field26528) / 20.0f);
                    for (int i = 0; i < (int)(this.field16109.size() * min); ++i) {
                        final Class8797 class8797 = this.field16109.get(i);
                        Class8797 class8798;
                        if (this.field16110.size() - 1 >= i) {
                            class8798 = this.field16110.get(i);
                        }
                        else {
                            class8798 = class8797;
                        }
                        GL11.glVertex3d(class8798.method30683() + (class8797.method30683() - class8798.method30683()) - Class3392.field15514.field4644.method5833().method18161().method16760() + 0.5, class8798.method30684() + (class8797.method30684() - class8798.method30684()) - Class3392.field15514.field4644.method5833().method18161().method16761(), class8798.method30685() + (class8797.method30685() - class8798.method30685()) - Class3392.field15514.field4644.method5833().method18161().method16762() + 0.5);
                    }
                    GL11.glEnd();
                    GL11.glPushMatrix();
                    GL11.glTranslated(Class3392.field15514.field4644.method5833().method18161().method16760(), Class3392.field15514.field4644.method5833().method18161().method16761(), Class3392.field15514.field4644.method5833().method18161().method16762());
                    GL11.glPopMatrix();
                    GL11.glDisable(3042);
                    GL11.glEnable(3553);
                    GL11.glEnable(2929);
                    GL11.glDisable(32925);
                    GL11.glDisable(2848);
                    GL11.glPopMatrix();
                    return;
                }
            }
        }
        this.field16109.clear();
    }
}
