// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class2023
{
    float method8070();
    
    default float method8080(final boolean b) {
        return this.method8070() + (b ? this.method8082() : 0.0f);
    }
    
    default float method8081() {
        return 0.0f;
    }
    
    default float method8082() {
        return 1.0f;
    }
    
    default float method8083() {
        return 1.0f;
    }
}
