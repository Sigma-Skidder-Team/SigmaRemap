// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Texture;

import java.awt.Color;

public class Class6224
{
    private static String[] field25082;
    public static final int field25083 = 3;
    public static final int field25084 = 4000;
    public String field25085;
    public String field25086;
    public Texture field25087;
    public int field25088;
    public Class7617 field25089;
    public Color[] field25090;
    public Color[] field25091;
    public int field25092;
    
    public Class6224(final String field25085, final String field25086, final int field25087, final Texture field25088) {
        this.field25089 = new Class7617();
        this.field25090 = new Color[3];
        this.field25091 = new Color[3];
        this.field25092 = 0;
        this.field25085 = field25085;
        this.field25086 = field25086;
        this.field25087 = field25088;
        this.field25088 = field25087;
        this.field25089.method23932();
    }
    
    public Class6224(final String s, final String s2, final Texture class7776) {
        this(s, s2, 4000, class7776);
    }
    
    public Class6224(final String s, final String s2, final int n) {
        this(s, s2, n, ClientAssets.info);
    }
    
    public Class6224(final String s, final String s2) {
        this(s, s2, 4000);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6224 && ((Class6224)o).field25085.equals(this.field25085);
    }
}
