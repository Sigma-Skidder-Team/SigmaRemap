// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

public class Class8124
{
    public String field33468;
    public int field33469;
    public int field33470;
    public int field33471;
    public float field33472;
    public final boolean field33473;
    
    public Class8124(final String field33468, final int field33469, final int field33470, final int field33471) {
        this.field33472 = 64.0f;
        this.field33469 = field33469;
        this.field33470 = field33470;
        this.field33468 = field33468;
        this.field33471 = field33471;
        this.field33473 = true;
    }
    
    public Class8124(final String field33468, final int field33469, final int n, final int field33470, final int field33471) {
        this.field33472 = 64.0f;
        this.field33469 = field33469;
        this.field33470 = field33470;
        this.field33472 = (float)n;
        this.field33468 = field33468;
        this.field33471 = field33471;
        this.field33473 = false;
    }
    
    public Class8124(final JSONObject JSONObject) {
        this.field33472 = 64.0f;
        if (JSONObject.has("name")) {
            this.field33468 = JSONObject.getString("name");
        }
        if (JSONObject.has("color")) {
            this.field33471 = JSONObject.getInt("color");
        }
        if (JSONObject.has("x")) {
            this.field33469 = JSONObject.getInt("x");
        }
        if (JSONObject.has("z")) {
            this.field33470 = JSONObject.getInt("z");
        }
        this.field33473 = true;
    }
    
    public JSONObject method26749() {
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("name", this.field33468);
        JSONObject.put("color", this.field33471);
        JSONObject.put("x", this.field33469);
        JSONObject.put("z", this.field33470);
        return JSONObject;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8124 class8124 = (Class8124)o;
            if (class8124.field33468.equals(this.field33468)) {
                if (class8124.field33469 == this.field33469) {
                    if (class8124.field33470 == this.field33470) {
                        if (class8124.field33471 == this.field33471) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
