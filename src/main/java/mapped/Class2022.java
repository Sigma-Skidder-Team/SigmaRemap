// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class2022 extends Class2023
{
    int method8068();
    
    int method8069();
    
    void method8072(final int p0, final int p1);
    
    boolean method8073();
    
    float method8071();
    
    default float method8075() {
        return this.method8081();
    }
    
    default float method8076() {
        return this.method8075() + this.method8068() / this.method8071();
    }
    
    default float method8077() {
        return this.method8079();
    }
    
    default float method8078() {
        return this.method8077() + this.method8069() / this.method8071();
    }
    
    default float method8079() {
        return 3.0f;
    }
}
