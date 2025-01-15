// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3269 extends Class3167
{
    public Class3269() {
        super(Class8013.field32986, "AntiBot", "Avoid the client to focus bots.");
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Advanced", "Hypixel" }).method15195(class4997 -> this.method10302()));
    }
    
    @Override
    public void method9917() {
        if (this.method9906()) {
            this.method10302();
        }
    }
    
    @Override
    public void method9879() {
        this.method10302();
    }
    
    @Override
    public void method9897() {
        Class9463.method35173().method35191().field37638 = null;
        Class9463.method35173().method35191().field37639.clear();
    }
    
    private void method10302() {
        Class9463.method35173().method35191().field37639.clear();
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "Advanced": {
                Class9463.method35173().method35191().field37638 = new Class7816();
                break;
            }
            case "Hypixel": {
                Class9463.method35173().method35191().field37638 = new Class7815();
                break;
            }
        }
    }
}
