// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9192
{
    public boolean field38961;
    public String[] field38962;
    public String[] field38963;
    public boolean field38964;
    
    public Class9192(final boolean field38961) {
        this.field38961 = field38961;
    }
    
    public Class9192(final Class8248 class8248) {
        this.field38961 = class8248.field33885;
        this.field38962 = class8248.field33887;
        this.field38963 = class8248.field33888;
        this.field38964 = class8248.field33886;
    }
    
    public Class9192 method33630() {
        if (this.field38961) {
            this.field38962 = null;
            return this;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public Class9192 method33631(final Class9578... array) {
        if (this.field38961) {
            final String[] array2 = new String[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i].field41738;
            }
            return this.method33632(array2);
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public Class9192 method33632(final String... array) {
        if (!this.field38961) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (array.length != 0) {
            this.field38962 = array.clone();
            return this;
        }
        throw new IllegalArgumentException("At least one cipher suite is required");
    }
    
    public Class9192 method33633() {
        if (this.field38961) {
            this.field38963 = null;
            return this;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public Class9192 method33634(final Class272... array) {
        if (this.field38961) {
            final String[] array2 = new String[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i].field1482;
            }
            return this.method33635(array2);
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public Class9192 method33635(final String... array) {
        if (!this.field38961) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (array.length != 0) {
            this.field38963 = array.clone();
            return this;
        }
        throw new IllegalArgumentException("At least one TLS version is required");
    }
    
    public Class9192 method33636(final boolean field38964) {
        if (this.field38961) {
            this.field38964 = field38964;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    
    public Class8248 method33637() {
        return new Class8248(this);
    }
}
