/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

/**
 *
 * @author josecovarrubias
 */
public class Resources implements Serializable{
    
    // class instance variables
    private boolean makeResources;
    private boolean useResource;

    public Resources() {
    }

    public boolean isMakeResources() {
        return makeResources;
    }

    public void setMakeResources(boolean makeResources) {
        this.makeResources = makeResources;
    }

    public boolean isUseResource() {
        return useResource;
    }

    public void setUseResource(boolean useResource) {
        this.useResource = useResource;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.makeResources ? 1 : 0);
        hash = 83 * hash + (this.useResource ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Resources{" + "makeResources=" + makeResources + ", useResource=" + useResource + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resources other = (Resources) obj;
        if (this.makeResources != other.makeResources) {
            return false;
        }
        if (this.useResource != other.useResource) {
            return false;
        }
        return true;
    }
    
    
    
}
