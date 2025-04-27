// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class UpdateWalkingEvent extends Class5714
{
    private static String[] field23316;
    private double field23317;
    private double field23318;
    private double field23319;
    private float field23320;
    private float field23321;
    private boolean field23322;
    private boolean field23323;
    public static float field23324;
    public static float field23325;
    public static float field23326;
    public static float field23327;
    public static float field23328;
    private List<Runnable> field23329;
    public boolean field23330;
    
    public UpdateWalkingEvent(final double field23317, final double field23318, final double field23319, final float field23320, final float field23321, final boolean field23322) {
        this.field23329 = new ArrayList<Runnable>();
        this.field23317 = field23317;
        this.field23318 = field23318;
        this.field23319 = field23319;
        this.field23320 = field23320;
        this.field23321 = field23321;
        this.field23322 = field23322;
        this.field23330 = true;
        this.field23323 = false;
    }
    
    public void method17031() {
        UpdateWalkingEvent.field23326 = UpdateWalkingEvent.field23324;
        UpdateWalkingEvent.field23327 = UpdateWalkingEvent.field23325;
        UpdateWalkingEvent.field23324 = this.field23321;
        UpdateWalkingEvent.field23325 = this.field23320;
        this.field23330 = false;
    }
    
    public boolean method17032() {
        return this.field23323;
    }
    
    public void method17033(final boolean field23323) {
        this.field23323 = field23323;
    }
    
    public double method17034() {
        return this.field23317;
    }
    
    public void method17035(final double field23317) {
        this.field23317 = field23317;
    }
    
    public double method17036() {
        return this.field23318;
    }
    
    public void method17037(final double field23318) {
        this.field23318 = field23318;
    }
    
    public double method17038() {
        return this.field23319;
    }
    
    public void method17039(final double field23319) {
        this.field23319 = field23319;
    }
    
    public float method17040() {
        return this.field23320;
    }
    
    public void method17041(final float field23320) {
        this.field23320 = field23320;
    }
    
    public float method17042() {
        return this.field23321;
    }
    
    public void method17043(final float field23321) {
        this.field23321 = field23321;
    }
    
    public boolean method17044() {
        return this.field23322;
    }
    
    public void method17045(final boolean field23322) {
        this.field23322 = field23322;
    }
    
    public boolean isPre() {
        return this.field23330;
    }
    
    public void method17047(final Runnable runnable) {
        this.field23329.add(runnable);
    }
    
    public List<Runnable> method17048() {
        return this.field23329;
    }
}
