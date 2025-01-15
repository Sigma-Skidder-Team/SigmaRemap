// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class6541 extends Class6540
{
    private String field25993;
    private String field25994;
    private long field25995;
    private long field25996;
    private long[] field25997;
    
    @Override
    public void method19777(final Class9131 class9131) throws IOException {
        this.field25993 = class9131.method33140(100, "UTF-8");
        this.field25994 = class9131.method33140(100, "UTF-8");
        this.field25995 = class9131.method33137(8);
        this.field25996 = class9131.method33137(8);
        final int method33135 = class9131.method33135();
        this.field25997 = new long[method33135];
        for (int i = 0; i < method33135; ++i) {
            this.field25997[i] = class9131.method33137(4);
        }
    }
    
    public String method19778() {
        return this.field25993;
    }
    
    public String method19779() {
        return this.field25994;
    }
    
    public long method19780() {
        return this.field25995;
    }
    
    public long method19781() {
        return this.field25996;
    }
    
    public long[] method19782() {
        return this.field25997;
    }
}
