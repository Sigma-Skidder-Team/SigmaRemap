// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9375
{
    private static String[] field40201;
    private final List<Class7486> field40202;
    private double field40203;
    private double field40204;
    private int field40205;
    private int field40206;
    private double field40207;
    private double field40208;
    private int field40209;
    private Class7924 field40210;
    
    public Class9375() {
        this.field40202 = Lists.newArrayList();
        this.field40203 = 0.2;
        this.field40204 = 5.0;
        this.field40205 = 15;
        this.field40206 = 5;
        this.field40209 = 29999984;
        this.field40210 = new Class7925(this, 6.0E7);
    }
    
    public boolean method34779(final Class354 class354) {
        if (class354.method1074() + 1 > this.method34786()) {
            if (class354.method1074() < this.method34788()) {
                if (class354.method1076() + 1 > this.method34787()) {
                    if (class354.method1076() < this.method34789()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method34780(final Class7859 class7859) {
        if (class7859.method25428() > this.method34786()) {
            if (class7859.method25426() < this.method34788()) {
                if (class7859.method25429() > this.method34787()) {
                    if (class7859.method25427() < this.method34789()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method34781(final Class6221 class6221) {
        if (class6221.field25076 > this.method34786()) {
            if (class6221.field25073 < this.method34788()) {
                if (class6221.field25078 > this.method34787()) {
                    if (class6221.field25075 < this.method34789()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public double method34782(final Class399 class399) {
        return this.method34784(class399.method1938(), class399.method1945());
    }
    
    public Class7702 method34783() {
        return this.field40210.method25687();
    }
    
    public double method34784(final double n, final double n2) {
        return Math.min(Math.min(Math.min(n - this.method34786(), this.method34788() - n), n2 - this.method34787()), this.method34789() - n2);
    }
    
    public Class2096 method34785() {
        return this.field40210.method25683();
    }
    
    public double method34786() {
        return this.field40210.method25675();
    }
    
    public double method34787() {
        return this.field40210.method25676();
    }
    
    public double method34788() {
        return this.field40210.method25677();
    }
    
    public double method34789() {
        return this.field40210.method25678();
    }
    
    public double method34777() {
        return this.field40207;
    }
    
    public double method34778() {
        return this.field40208;
    }
    
    public void method34790(final double field40207, final double field40208) {
        this.field40207 = field40207;
        this.field40208 = field40208;
        this.field40210.method25684();
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23169(this, field40207, field40208);
        }
    }
    
    public double method34791() {
        return this.field40210.method25679();
    }
    
    public long method34792() {
        return this.field40210.method25681();
    }
    
    public double method34793() {
        return this.field40210.method25682();
    }
    
    public void method34794(final double n) {
        this.field40210 = new Class7925(this, n);
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23167(this, n);
        }
    }
    
    public void method34795(final double n, final double n2, final long n3) {
        this.field40210 = ((n != n2) ? new Class7923(this, n, n2, n3, null) : new Class7925(this, n2));
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23168(this, n, n2, n3);
        }
    }
    
    public List<Class7486> method34796() {
        return Lists.newArrayList((Iterable)this.field40202);
    }
    
    public void method34797(final Class7486 class7486) {
        this.field40202.add(class7486);
    }
    
    public void method34798(final int field40209) {
        this.field40209 = field40209;
        this.field40210.method25685();
    }
    
    public int method34799() {
        return this.field40209;
    }
    
    public double method34800() {
        return this.field40204;
    }
    
    public void method34801(final double field40204) {
        this.field40204 = field40204;
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23173(this, field40204);
        }
    }
    
    public double method34802() {
        return this.field40203;
    }
    
    public void method34803(final double field40203) {
        this.field40203 = field40203;
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23172(this, field40203);
        }
    }
    
    public double method34804() {
        return this.field40210.method25680();
    }
    
    public int method34805() {
        return this.field40205;
    }
    
    public void method34806(final int field40205) {
        this.field40205 = field40205;
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23170(this, field40205);
        }
    }
    
    public int method34807() {
        return this.field40206;
    }
    
    public void method34808(final int field40206) {
        this.field40206 = field40206;
        final Iterator<Class7486> iterator = this.method34796().iterator();
        while (iterator.hasNext()) {
            iterator.next().method23171(this, field40206);
        }
    }
    
    public void method34809() {
        this.field40210 = this.field40210.method25686();
    }
    
    public void method34810(final Class8660 class8660) {
        class8660.method29582(this.method34791());
        class8660.method29588(this.method34777());
        class8660.method29587(this.method34778());
        class8660.method29590(this.method34800());
        class8660.method29592(this.method34802());
        class8660.method29595(this.method34807());
        class8660.method29596(this.method34805());
        class8660.method29586(this.method34793());
        class8660.method29584(this.method34792());
    }
    
    public void method34811(final Class8660 class8660) {
        this.method34790(class8660.method29579(), class8660.method29580());
        this.method34803(class8660.method29591());
        this.method34801(class8660.method29589());
        this.method34808(class8660.method29593());
        this.method34806(class8660.method29594());
        if (class8660.method29583() <= 0L) {
            this.method34794(class8660.method29581());
        }
        else {
            this.method34795(class8660.method29581(), class8660.method29585(), class8660.method29583());
        }
    }
}
