// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;

public class Class9501
{
    private HashMap<Integer, Class9110> field40878;
    private byte field40879;
    private String field40880;
    
    public Class9501() {
        this.field40878 = new HashMap<Integer, Class9110>();
        this.field40879 = 100;
        this.field40880 = "";
    }
    
    public HashMap<Integer, Class9110> method35381() {
        return this.field40878;
    }
    
    public void method35382(final HashMap<Integer, Class9110> field40878) {
        this.field40878 = field40878;
    }
    
    public String method35383() {
        return this.field40880;
    }
    
    public void method35384(final String field40880) {
        this.field40880 = field40880;
    }
    
    public Class9110 method35385(final int i) {
        return this.field40878.get(i);
    }
    
    public void method35386(final int i, final Class9110 value) {
        this.field40878.put(i, value);
    }
    
    public byte method35387() {
        return this.field40879;
    }
    
    public void method35388(final byte field40879) {
        this.field40879 = field40879;
    }
}
