// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8114
{
    private static String[] field33441;
    private Class7764 field33442;
    private int field33443;
    private int field33444;
    private Class2427 field33445;
    private float field33446;
    private float field33447;
    
    public Class8114(final Class7764 field33442, final int field33443, final int field33444) {
        this.field33445 = Class2427.field14355;
        this.field33442 = field33442;
        this.field33443 = field33443;
        this.field33444 = field33444;
        this.field33446 = (float)field33442.method24843();
        this.field33447 = (float)field33442.method24844();
    }
    
    public float method26683() {
        return this.field33447;
    }
    
    public float method26684() {
        return this.field33446;
    }
    
    public void method26685(final float field33447) {
        this.field33447 = field33447;
    }
    
    public void method26686(final float field33446) {
        this.field33446 = field33446;
    }
    
    public void method26687(final Class2427 field33445) {
        this.field33445 = field33445;
    }
    
    public Class2427 method26688() {
        return this.field33445;
    }
    
    public void method26689(final int field33443) {
        this.field33443 = field33443;
    }
    
    public void method26690(final int field33444) {
        this.field33444 = field33444;
    }
    
    public int method26691() {
        return this.field33443;
    }
    
    public int method26692() {
        return this.field33444;
    }
    
    public void method26693() {
        this.field33442.method24778((float)this.field33443, (float)this.field33444, this.field33446, this.field33447, this.field33445);
    }
}
