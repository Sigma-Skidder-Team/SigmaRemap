// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Class7395 implements Class7394
{
    private static String field28476;
    public Class9523 field28477;
    public Class9523 field28478;
    public Class9523 field28479;
    public Class9523 field28480;
    public Class9523 field28481;
    public Class9523 field28482;
    public Class7200 field28483;
    public Class7201 field28484;
    public Class9523 field28485;
    public Class9523 field28486;
    public Class7201 field28487;
    public Class7201 field28488;
    public Class7201 field28489;
    public Class9523 field28490;
    public ArrayList field28491;
    public Class7201 field28492;
    public Class7201 field28493;
    public Class7199 field28494;
    public Class7199 field28495;
    public Class7199 field28496;
    public Class7199 field28497;
    public Class9523 field28498;
    public int field28499;
    public boolean field28500;
    public boolean field28501;
    public String field28502;
    public String field28503;
    private Class7764 field28504;
    private boolean field28505;
    private boolean field28506;
    private float field28507;
    private float field28508;
    private int field28509;
    private int field28510;
    private int field28511;
    private Class8014 field28512;
    private int field28513;
    public boolean field28514;
    public boolean field28515;
    public boolean field28516;
    public float field28517;
    public float field28518;
    
    public static void method22708(String string) {
        if (!string.endsWith("/")) {
            string += "/";
        }
        Class7395.field28476 = string;
    }
    
    public Class7395(final String field28502) {
        this.field28477 = new Class9523(this, 100.0f, 100.0f, null);
        this.field28478 = new Class9523(this, 5.0f, 5.0f, null);
        this.field28479 = new Class9523(this, 1000.0f, 1000.0f, null);
        this.field28480 = new Class9523(this, 10.0f, 10.0f, null);
        this.field28481 = new Class9523(this, 0.0f, 0.0f, null);
        this.field28482 = new Class9523(this, 0.0f, 0.0f, null);
        this.field28483 = new Class7200(this, 360.0f, null);
        this.field28484 = new Class7201(this, 0.0f, null);
        this.field28485 = new Class9523(this, 0.0f, 0.0f, null);
        this.field28486 = new Class9523(this, 50.0f, 50.0f, null);
        this.field28487 = new Class7201(this, 0.0f, null);
        this.field28488 = new Class7201(this, 0.0f, null);
        this.field28489 = new Class7201(this, 0.0f, null);
        this.field28490 = new Class9523(this, 1000.0f, 1000.0f, null);
        this.field28491 = new ArrayList();
        this.field28492 = new Class7201(this, 255.0f, null);
        this.field28493 = new Class7201(this, 0.0f, null);
        this.field28498 = new Class9523(this, 1000.0f, 1000.0f, null);
        this.field28499 = 1;
        this.field28500 = false;
        this.field28501 = false;
        this.field28503 = "";
        this.field28506 = true;
        this.field28509 = 0;
        this.field28514 = false;
        this.field28515 = false;
        this.field28502 = field28502;
        this.field28513 = (int)this.field28498.method35543();
        this.field28510 = (int)this.field28490.method35543();
        this.field28491.add(new Class8757(this, 0.0f, Class2427.field14355));
        this.field28491.add(new Class8757(this, 1.0f, Class2427.field14357));
        final ArrayList list = new ArrayList();
        list.add(new Class2412(0.0f, 0.0f));
        list.add(new Class2412(1.0f, 255.0f));
        this.field28494 = new Class7199(this, list, 0, 255);
        final ArrayList list2 = new ArrayList();
        list2.add(new Class2412(0.0f, 0.0f));
        list2.add(new Class2412(1.0f, 255.0f));
        this.field28495 = new Class7199(this, list2, 0, 255);
        final ArrayList list3 = new ArrayList();
        list3.add(new Class2412(0.0f, 0.0f));
        list3.add(new Class2412(1.0f, 1.0f));
        this.field28496 = new Class7199(this, list3, 0, 1);
        final ArrayList list4 = new ArrayList();
        list4.add(new Class2412(0.0f, 0.0f));
        list4.add(new Class2412(1.0f, 1.0f));
        this.field28497 = new Class7199(this, list4, 0, 1);
    }
    
    public void method22709(String field28503) {
        if (field28503.length() == 0) {
            field28503 = null;
        }
        if ((this.field28503 = field28503) != null) {
            this.field28505 = true;
        }
        else {
            this.field28504 = null;
        }
    }
    
    public String method22710() {
        return this.field28503;
    }
    
    @Override
    public String toString() {
        return "[" + this.field28502 + "]";
    }
    
    public void method22711(final float n, final float n2) {
        this.method22712(n, n2, true);
    }
    
    public void method22712(final float field28507, final float field28508, final boolean b) {
        if (b) {
            this.field28516 = true;
            this.field28517 -= this.field28507 - field28507;
            this.field28518 -= this.field28508 - field28508;
        }
        this.field28507 = field28507;
        this.field28508 = field28508;
    }
    
    public float method22713() {
        return this.field28507;
    }
    
    public float method22714() {
        return this.field28508;
    }
    
    @Override
    public boolean method22699() {
        return this.field28506;
    }
    
    @Override
    public void method22700(final boolean field28506) {
        this.field28506 = field28506;
    }
    
    @Override
    public void method22697(final Class8014 field28512, final int n) {
        this.field28512 = field28512;
        if (!this.field28516) {
            this.field28517 = 0.0f;
            this.field28518 = 0.0f;
        }
        else {
            this.field28516 = false;
        }
        if (this.field28505) {
            this.field28505 = false;
            try {
                this.field28504 = new Class7764(Class7395.field28476 + this.field28503);
            }
            catch (final Class2324 class2324) {
                this.field28504 = null;
                Class8452.method28203(class2324);
            }
        }
        if ((this.field28514 || (this.field28490.method35544() && this.field28510 < 0) || (this.field28498.method35544() && this.field28513 <= 0)) && this.field28511 == 0) {
            this.field28515 = true;
        }
        this.field28511 = 0;
        if (this.field28514) {
            return;
        }
        if (this.field28490.method35544()) {
            if (this.field28510 < 0) {
                return;
            }
            this.field28510 -= n;
        }
        if (this.field28498.method35544() && this.field28513 <= 0) {
            return;
        }
        this.field28509 -= n;
        if (this.field28509 < 0) {
            this.field28509 = (int)this.field28477.method35543();
            for (int n2 = (int)this.field28478.method35543(), i = 0; i < n2; ++i) {
                final Class8777 method26253 = field28512.method26253(this, this.field28479.method35543());
                method26253.method30497(this.field28480.method35543());
                method26253.method30503(this.field28507 + this.field28481.method35543(), this.field28508 + this.field28482.method35543());
                method26253.method30504(0.0f, 0.0f, 0.0f);
                final float method26254 = this.field28485.method35543();
                final float method26255 = this.field28486.method35543();
                if (method26254 != 0.0f || method26255 != 0.0f) {
                    final float n3 = this.field28483.method22084(0.0f) + this.field28484.method22084(0.0f) - this.field28483.method22094() / 2.0f - 90.0f;
                    method26253.method30507((float)Class6882.method21086(Math.toRadians(n3)) * method26254, (float)Class6882.method21085(Math.toRadians(n3)) * method26254);
                    method26253.method30504((float)Class6882.method21086(Math.toRadians(n3)), (float)Class6882.method21085(Math.toRadians(n3)), method26255 * 0.001f);
                }
                if (this.field28504 != null) {
                    method26253.method30487(this.field28504);
                }
                final Class8757 class2325 = this.field28491.get(0);
                method26253.method30502(class2325.field36777.field14368, class2325.field36777.field14369, class2325.field36777.field14370, this.field28492.method22084(0.0f) / 255.0f);
                method26253.method30495(this.field28499);
                method26253.method30513(this.field28500);
                if (this.field28498.method35544()) {
                    --this.field28513;
                    if (this.field28513 <= 0) {
                        break;
                    }
                }
            }
        }
    }
    
    @Override
    public void method22698(final Class8777 class8777, final int n) {
        ++this.field28511;
        class8777.field36897 += this.field28517;
        class8777.field36898 += this.field28518;
        class8777.method30510(this.field28489.method22084(0.0f) * 5.0E-5f * n, this.field28488.method22084(0.0f) * 5.0E-5f * n);
        final float n2 = class8777.method30489() / class8777.method30488();
        final float n3 = 1.0f - n2;
        float n4 = 0.0f;
        float n5 = 1.0f;
        Class2427 field36777 = null;
        Class2427 field36778 = null;
        for (int i = 0; i < this.field28491.size() - 1; ++i) {
            final Class8757 class8778 = this.field28491.get(i);
            final Class8757 class8779 = this.field28491.get(i + 1);
            if (n3 >= class8778.field36776) {
                if (n3 <= class8779.field36776) {
                    field36777 = class8778.field36777;
                    field36778 = class8779.field36777;
                    n4 = 1.0f - (n3 - class8778.field36776) / (class8779.field36776 - class8778.field36776);
                    n5 = 1.0f - n4;
                }
            }
        }
        if (field36777 != null) {
            final float n6 = field36777.field14368 * n4 + field36778.field14368 * n5;
            final float n7 = field36777.field14369 * n4 + field36778.field14369 * n5;
            final float n8 = field36777.field14370 * n4 + field36778.field14370 * n5;
            float n9;
            if (!this.field28494.method22087()) {
                n9 = this.field28492.method22084(0.0f) / 255.0f * n2 + this.field28493.method22084(0.0f) / 255.0f * n3;
            }
            else {
                n9 = this.field28494.method22084(n3) / 255.0f;
            }
            class8777.method30502(n6, n7, n8, n9);
        }
        if (!this.field28495.method22087()) {
            class8777.method30498(n * this.field28487.method22084(0.0f) * 0.001f);
        }
        else {
            class8777.method30497(this.field28495.method22084(n3));
        }
        if (this.field28496.method22087()) {
            class8777.method30505(this.field28496.method22084(n3));
        }
        if (this.field28497.method22087()) {
            class8777.method30515(this.field28497.method22084(n3));
        }
    }
    
    @Override
    public boolean method22701() {
        if (this.field28512 == null) {
            return false;
        }
        if (this.field28490.method35544()) {
            return this.field28510 <= 0 && this.field28515;
        }
        if (!this.field28498.method35544()) {
            return this.field28514 && this.field28515;
        }
        return this.field28513 <= 0 && this.field28515;
    }
    
    public void method22715() {
        this.method22716();
        this.field28509 = 0;
        this.field28513 = (int)this.field28498.method35543();
        this.field28510 = (int)this.field28490.method35543();
    }
    
    public void method22716() {
        this.field28515 = false;
        if (this.field28512 != null) {
            this.field28512.method26255(this);
        }
    }
    
    public void method22717() {
        if (this.method22701()) {
            if (this.field28512 != null) {
                if (this.field28512.method26252() == 0) {
                    this.method22715();
                }
            }
        }
    }
    
    public Class7395 method22718() {
        Class7395 method33098;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Class9125.method33103(byteArrayOutputStream, this);
            method33098 = Class9125.method33098(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        }
        catch (final IOException ex) {
            Class8452.method28204("Slick: ConfigurableEmitter.duplicate(): caught exception " + ex.toString());
            return null;
        }
        return method33098;
    }
    
    public void method22719(final float n, final Class2427 class2427) {
        this.field28491.add(new Class8757(this, n, class2427));
    }
    
    @Override
    public boolean method22702() {
        return this.field28501;
    }
    
    @Override
    public boolean method22705() {
        return this.field28500;
    }
    
    @Override
    public boolean method22704(final Class8014 class8014) {
        return (this.field28499 == 1 && class8014.method26235()) || this.field28499 == 2;
    }
    
    @Override
    public Class7764 method22703() {
        return this.field28504;
    }
    
    @Override
    public void method22706() {
        this.field28514 = true;
    }
    
    @Override
    public void method22707() {
        this.field28514 = false;
        this.method22715();
    }
    
    static {
        Class7395.field28476 = Class7395.\u7834\uc0d0\uc61b\u7998\u6af7\uc460[1];
    }
}
