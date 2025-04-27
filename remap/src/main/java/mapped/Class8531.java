// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONArray;

public class Class8531
{
    private static String[] field35806;
    public float field35807;
    public float field35808;
    public float field35809;
    public float field35810;
    
    public Class8531(final float field35807, final float field35808, final float field35809, final float field35810) {
        this.field35807 = field35807;
        this.field35808 = field35808;
        this.field35809 = field35809;
        this.field35810 = field35810;
    }
    
    public Class8531(final JSONArray JSONArray) {
        this.field35807 = Float.parseFloat(JSONArray.getString(0));
        this.field35808 = Float.parseFloat(JSONArray.getString(1));
        this.field35809 = Float.parseFloat(JSONArray.getString(2));
        this.field35810 = Float.parseFloat(JSONArray.getString(3));
    }
    
    public JSONArray method28615() {
        final JSONArray JSONArray = new JSONArray();
        JSONArray.put(0, Float.toString(this.field35807));
        JSONArray.put(1, Float.toString(this.field35808));
        JSONArray.put(2, Float.toString(this.field35809));
        JSONArray.put(3, Float.toString(this.field35810));
        return JSONArray;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o != null && o instanceof Class8531) {
            final Class8531 class8531 = (Class8531)o;
            if (this.field35807 == class8531.field35807) {
                if (this.field35808 == class8531.field35808) {
                    if (this.field35809 == class8531.field35809) {
                        return this.field35810 == class8531.field35810;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
