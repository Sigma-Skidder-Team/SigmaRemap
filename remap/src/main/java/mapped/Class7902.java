// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.TimeZone;

public class Class7902
{
    private Class2031 field32427;
    private Class227 field32428;
    private boolean field32429;
    private boolean field32430;
    private boolean field32431;
    private int field32432;
    private int field32433;
    private int field32434;
    private boolean field32435;
    private Class2103 field32436;
    private boolean field32437;
    private boolean field32438;
    private TimeZone field32439;
    private Class2206 field32440;
    private Map<String, String> field32441;
    private Boolean field32442;
    private Class7089 field32443;
    
    public Class7902() {
        this.field32427 = Class2031.field11579;
        this.field32428 = Class227.field802;
        this.field32429 = false;
        this.field32430 = true;
        this.field32431 = false;
        this.field32432 = 2;
        this.field32433 = 0;
        this.field32434 = 80;
        this.field32435 = true;
        this.field32436 = Class2103.field12197;
        this.field32437 = false;
        this.field32438 = false;
        this.field32439 = null;
        this.field32440 = null;
        this.field32441 = null;
        this.field32442 = false;
        this.field32443 = new Class7090(0);
    }
    
    public boolean method25573() {
        return this.field32430;
    }
    
    public void method25574(final boolean field32430) {
        this.field32430 = field32430;
    }
    
    public Class2031 method25575() {
        return this.field32427;
    }
    
    public void method25576(final Class2031 field32427) {
        if (field32427 != null) {
            this.field32427 = field32427;
            return;
        }
        throw new NullPointerException("Use ScalarStyle enum.");
    }
    
    public void method25577(final int field32432) {
        if (field32432 < 1) {
            throw new Class2386("Indent must be at least 1");
        }
        if (field32432 <= 10) {
            this.field32432 = field32432;
            return;
        }
        throw new Class2386("Indent must be at most 10");
    }
    
    public int method25578() {
        return this.field32432;
    }
    
    public void method25579(final int field32433) {
        if (field32433 < 0) {
            throw new Class2386("Indicator indent must be non-negative.");
        }
        if (field32433 <= 9) {
            this.field32433 = field32433;
            return;
        }
        throw new Class2386("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
    }
    
    public int method25580() {
        return this.field32433;
    }
    
    public void method25581(final Class2206 field32440) {
        this.field32440 = field32440;
    }
    
    public Class2206 method25582() {
        return this.field32440;
    }
    
    public void method25583(final boolean field32429) {
        this.field32429 = field32429;
    }
    
    public boolean method25584() {
        return this.field32429;
    }
    
    public void method25585(final boolean b) {
        this.field32442 = b;
    }
    
    public boolean method25586() {
        return this.field32442;
    }
    
    public void method25587(final int field32434) {
        this.field32434 = field32434;
    }
    
    public int method25588() {
        return this.field32434;
    }
    
    public void method25589(final boolean field32435) {
        this.field32435 = field32435;
    }
    
    public boolean method25590() {
        return this.field32435;
    }
    
    public Class2103 method25591() {
        return this.field32436;
    }
    
    public void method25592(final Class227 field32428) {
        if (field32428 != null) {
            this.field32428 = field32428;
            return;
        }
        throw new NullPointerException("Use FlowStyle enum.");
    }
    
    public Class227 method25593() {
        return this.field32428;
    }
    
    public void method25594(final Class2103 field32436) {
        if (field32436 != null) {
            this.field32436 = field32436;
            return;
        }
        throw new NullPointerException("Specify line break.");
    }
    
    public boolean method25595() {
        return this.field32437;
    }
    
    public void method25596(final boolean field32437) {
        this.field32437 = field32437;
    }
    
    public boolean method25597() {
        return this.field32438;
    }
    
    public void method25598(final boolean field32438) {
        this.field32438 = field32438;
    }
    
    public Map<String, String> method25599() {
        return this.field32441;
    }
    
    public void method25600(final Map<String, String> field32441) {
        this.field32441 = field32441;
    }
    
    public boolean method25601() {
        return this.field32431;
    }
    
    public void method25602(final boolean field32431) {
        this.field32431 = field32431;
    }
    
    public TimeZone method25603() {
        return this.field32439;
    }
    
    public void method25604(final TimeZone field32439) {
        this.field32439 = field32439;
    }
    
    public Class7089 method25605() {
        return this.field32443;
    }
    
    public void method25606(final Class7089 field32443) {
        this.field32443 = field32443;
    }
}
