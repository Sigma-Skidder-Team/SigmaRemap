// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class Class4915 extends Class4825
{
    private static String[] field20591;
    public Class869 field21021;
    public Class5146 field21022;
    public Class7617 field21023;
    public int field21024;
    
    public Class4915(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int field21024) {
        super(class4803, s, n, n2, 100, 100, false);
        this.field21021 = Class869.method5277();
        this.field21023 = new Class7617();
        this.field21022 = new Class5146(n3, n4);
        this.field20480 = n3 * field21024;
        this.field20481 = n4 * field21024;
        this.field21024 = field21024;
        this.field21023.method23932();
    }
    
    @Override
    public void method14205(final float n) {
        if (this.field21023.method23935() > 70L) {
            this.field21023.method23934();
            this.field21022.method16068();
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.field20478, (float)this.field20479, 0.0f);
        Class8154.method26874(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class265.field1273.field1292);
        Class8154.method26924((float)(this.field21022.method16076().field40723 * this.field21024), (float)(this.field21022.method16076().field40724 * this.field21024), (float)this.field21024, (float)this.field21024, 5.0f, Class265.field1285.field1292);
        for (final Class9469 class9469 : this.field21022.method16077().method33123()) {
            Class8154.method26874((float)(class9469.field40723 * this.field21024), (float)(class9469.field40724 * this.field21024), (float)this.field21024, (float)this.field21024, Class265.field1278.field1292);
        }
        GL11.glPopMatrix();
        super.method14205(n);
    }
    
    public int method14756() {
        return this.field21022.method16077().method33123().size();
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n != this.field21021.field4648.field23435.field2161.field32860) {
            if (n != this.field21021.field4648.field23437.field2161.field32860) {
                if (n != this.field21021.field4648.field23436.field2161.field32860) {
                    if (n == this.field21021.field4648.field23438.field2161.field32860) {
                        this.field21022.method16077().method33121(Class2067.field11836);
                    }
                }
                else {
                    this.field21022.method16077().method33121(Class2067.field11835);
                }
            }
            else {
                this.field21022.method16077().method33121(Class2067.field11834);
            }
        }
        else {
            this.field21022.method16077().method33121(Class2067.field11833);
        }
    }
}
